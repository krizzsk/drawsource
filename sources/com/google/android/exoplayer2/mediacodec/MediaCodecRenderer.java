package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.exoplayer2.BaseRenderer;
import com.google.android.exoplayer2.C5429C;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import com.google.android.exoplayer2.drm.FrameworkMediaCrypto;
import com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecAdapter;
import com.google.android.exoplayer2.mediacodec.MediaCodecAdapter;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.TimedValueQueue;
import com.google.android.exoplayer2.util.TraceUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Ascii;
import com.vungle.warren.utility.platform.Platform;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public abstract class MediaCodecRenderer extends BaseRenderer {
    private static final byte[] ADAPTATION_WORKAROUND_BUFFER = {0, 0, 1, 103, 66, -64, Ascii.f18309VT, -38, 37, -112, 0, 0, 1, 104, -50, Ascii.f18305SI, 19, 32, 0, 0, 1, 101, -120, -124, Ascii.f18296CR, -50, 113, Ascii.CAN, -96, 0, 47, -65, Ascii.f18299FS, 49, -61, 39, 93, 120};
    private static final int ADAPTATION_WORKAROUND_MODE_ALWAYS = 2;
    private static final int ADAPTATION_WORKAROUND_MODE_NEVER = 0;
    private static final int ADAPTATION_WORKAROUND_MODE_SAME_RESOLUTION = 1;
    private static final int ADAPTATION_WORKAROUND_SLICE_WIDTH_HEIGHT = 32;
    protected static final float CODEC_OPERATING_RATE_UNSET = -1.0f;
    private static final int DRAIN_ACTION_FLUSH = 1;
    private static final int DRAIN_ACTION_FLUSH_AND_UPDATE_DRM_SESSION = 2;
    private static final int DRAIN_ACTION_NONE = 0;
    private static final int DRAIN_ACTION_REINITIALIZE = 3;
    private static final int DRAIN_STATE_NONE = 0;
    private static final int DRAIN_STATE_SIGNAL_END_OF_STREAM = 1;
    private static final int DRAIN_STATE_WAIT_END_OF_STREAM = 2;
    private static final long MAX_CODEC_HOTSWAP_TIME_MS = 1000;
    private static final int MAX_PENDING_OUTPUT_STREAM_OFFSET_COUNT = 10;
    private static final int RECONFIGURATION_STATE_NONE = 0;
    private static final int RECONFIGURATION_STATE_QUEUE_PENDING = 2;
    private static final int RECONFIGURATION_STATE_WRITE_PENDING = 1;
    private static final String TAG = "MediaCodecRenderer";
    private final float assumedMinimumCodecOperatingRate;
    private ArrayDeque<MediaCodecInfo> availableCodecInfos;
    private final DecoderInputBuffer buffer = new DecoderInputBuffer(0);
    private final BatchBuffer bypassBatchBuffer = new BatchBuffer();
    private boolean bypassDrainAndReinitialize;
    private boolean bypassEnabled;
    private final DecoderInputBuffer bypassSampleBuffer = new DecoderInputBuffer(2);
    private boolean bypassSampleBufferPending;
    private C2Mp3TimestampTracker c2Mp3TimestampTracker;
    private MediaCodecAdapter codec;
    private int codecAdaptationWorkaroundMode;
    private final MediaCodecAdapter.Factory codecAdapterFactory;
    private int codecDrainAction;
    private int codecDrainState;
    private DrmSession codecDrmSession;
    private boolean codecHasOutputMediaFormat;
    private long codecHotswapDeadlineMs;
    private MediaCodecInfo codecInfo;
    private Format codecInputFormat;
    private boolean codecNeedsAdaptationWorkaroundBuffer;
    private boolean codecNeedsDiscardToSpsWorkaround;
    private boolean codecNeedsEosBufferTimestampWorkaround;
    private boolean codecNeedsEosFlushWorkaround;
    private boolean codecNeedsEosOutputExceptionWorkaround;
    private boolean codecNeedsEosPropagation;
    private boolean codecNeedsFlushWorkaround;
    private boolean codecNeedsMonoChannelCountWorkaround;
    private boolean codecNeedsSosFlushWorkaround;
    private float codecOperatingRate;
    private MediaFormat codecOutputMediaFormat;
    private boolean codecOutputMediaFormatChanged;
    private boolean codecReceivedBuffers;
    private boolean codecReceivedEos;
    private int codecReconfigurationState;
    private boolean codecReconfigured;
    private float currentPlaybackSpeed = 1.0f;
    private final ArrayList<Long> decodeOnlyPresentationTimestamps = new ArrayList<>();
    protected DecoderCounters decoderCounters;
    private boolean enableAsynchronousBufferQueueing;
    private final boolean enableDecoderFallback;
    private boolean enableSynchronizeCodecInteractionsWithQueueing;
    private boolean forceAsyncQueueingSynchronizationWorkaround;
    private final TimedValueQueue<Format> formatQueue = new TimedValueQueue<>();
    private Format inputFormat;
    private int inputIndex;
    private boolean inputStreamEnded;
    private boolean isDecodeOnlyOutputBuffer;
    private boolean isLastOutputBuffer;
    private long largestQueuedPresentationTimeUs;
    private long lastBufferInStreamPresentationTimeUs;
    private final MediaCodecSelector mediaCodecSelector;
    private MediaCrypto mediaCrypto;
    private boolean mediaCryptoRequiresSecureDecoder;
    private final DecoderInputBuffer noDataBuffer = DecoderInputBuffer.newNoDataInstance();
    private ByteBuffer outputBuffer;
    private final MediaCodec.BufferInfo outputBufferInfo = new MediaCodec.BufferInfo();
    private Format outputFormat;
    private int outputIndex;
    private boolean outputStreamEnded;
    private long outputStreamOffsetUs = -9223372036854775807L;
    private long outputStreamStartPositionUs = -9223372036854775807L;
    private boolean pendingOutputEndOfStream;
    private int pendingOutputStreamOffsetCount;
    private final long[] pendingOutputStreamOffsetsUs = new long[10];
    private final long[] pendingOutputStreamStartPositionsUs = new long[10];
    private final long[] pendingOutputStreamSwitchTimesUs = new long[10];
    private ExoPlaybackException pendingPlaybackException;
    private DecoderInitializationException preferredDecoderInitializationException;
    private long renderTimeLimitMs = -9223372036854775807L;
    private boolean shouldSkipAdaptationWorkaroundOutputBuffer;
    private DrmSession sourceDrmSession;
    private float targetPlaybackSpeed = 1.0f;
    private boolean waitingForFirstSampleInFormat;

    /* access modifiers changed from: protected */
    public boolean getCodecNeedsEosPropagation() {
        return false;
    }

    /* access modifiers changed from: protected */
    public float getCodecOperatingRateV23(float f, Format format, Format[] formatArr) {
        return -1.0f;
    }

    /* access modifiers changed from: protected */
    public abstract List<MediaCodecInfo> getDecoderInfos(MediaCodecSelector mediaCodecSelector2, Format format, boolean z) throws MediaCodecUtil.DecoderQueryException;

    /* access modifiers changed from: protected */
    public abstract MediaCodecAdapter.Configuration getMediaCodecConfiguration(MediaCodecInfo mediaCodecInfo, Format format, MediaCrypto mediaCrypto2, float f);

    /* access modifiers changed from: protected */
    public void handleInputBufferSupplementalData(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
    }

    /* access modifiers changed from: protected */
    public void onCodecError(Exception exc) {
    }

    /* access modifiers changed from: protected */
    public void onCodecInitialized(String str, long j, long j2) {
    }

    /* access modifiers changed from: protected */
    public void onCodecReleased(String str) {
    }

    /* access modifiers changed from: protected */
    public void onOutputFormatChanged(Format format, MediaFormat mediaFormat) throws ExoPlaybackException {
    }

    /* access modifiers changed from: protected */
    public void onProcessedStreamChange() {
    }

    /* access modifiers changed from: protected */
    public void onQueueInputBuffer(DecoderInputBuffer decoderInputBuffer) throws ExoPlaybackException {
    }

    /* access modifiers changed from: protected */
    public void onStarted() {
    }

    /* access modifiers changed from: protected */
    public void onStopped() {
    }

    /* access modifiers changed from: protected */
    public abstract boolean processOutputBuffer(long j, long j2, MediaCodecAdapter mediaCodecAdapter, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, Format format) throws ExoPlaybackException;

    /* access modifiers changed from: protected */
    public void renderToEndOfStream() throws ExoPlaybackException {
    }

    /* access modifiers changed from: protected */
    public boolean shouldInitCodec(MediaCodecInfo mediaCodecInfo) {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean shouldUseBypass(Format format) {
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract int supportsFormat(MediaCodecSelector mediaCodecSelector2, Format format) throws MediaCodecUtil.DecoderQueryException;

    public final int supportsMixedMimeTypeAdaptation() {
        return 8;
    }

    public static class DecoderInitializationException extends Exception {
        private static final int CUSTOM_ERROR_CODE_BASE = -50000;
        private static final int DECODER_QUERY_ERROR = -49998;
        private static final int NO_SUITABLE_DECODER_ERROR = -49999;
        public final MediaCodecInfo codecInfo;
        public final String diagnosticInfo;
        public final DecoderInitializationException fallbackDecoderInitializationException;
        public final String mimeType;
        public final boolean secureDecoderRequired;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public DecoderInitializationException(com.google.android.exoplayer2.Format r12, java.lang.Throwable r13, boolean r14, int r15) {
            /*
                r11 = this;
                java.lang.String r0 = java.lang.String.valueOf(r12)
                java.lang.String r1 = java.lang.String.valueOf(r0)
                int r1 = r1.length()
                int r1 = r1 + 36
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                java.lang.String r1 = "Decoder init failed: ["
                r2.append(r1)
                r2.append(r15)
                java.lang.String r1 = "], "
                r2.append(r1)
                r2.append(r0)
                java.lang.String r4 = r2.toString()
                java.lang.String r6 = r12.sampleMimeType
                java.lang.String r9 = buildCustomDiagnosticInfo(r15)
                r8 = 0
                r10 = 0
                r3 = r11
                r5 = r13
                r7 = r14
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException.<init>(com.google.android.exoplayer2.Format, java.lang.Throwable, boolean, int):void");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public DecoderInitializationException(com.google.android.exoplayer2.Format r9, java.lang.Throwable r10, boolean r11, com.google.android.exoplayer2.mediacodec.MediaCodecInfo r12) {
            /*
                r8 = this;
                java.lang.String r0 = r12.name
                java.lang.String r1 = java.lang.String.valueOf(r9)
                java.lang.String r2 = java.lang.String.valueOf(r0)
                int r2 = r2.length()
                int r2 = r2 + 23
                java.lang.String r3 = java.lang.String.valueOf(r1)
                int r3 = r3.length()
                int r2 = r2 + r3
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>(r2)
                java.lang.String r2 = "Decoder init failed: "
                r3.append(r2)
                r3.append(r0)
                java.lang.String r0 = ", "
                r3.append(r0)
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                java.lang.String r3 = r9.sampleMimeType
                int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
                r2 = 21
                if (r0 < r2) goto L_0x003f
                java.lang.String r0 = getDiagnosticInfoV21(r10)
                goto L_0x0040
            L_0x003f:
                r0 = 0
            L_0x0040:
                r6 = r0
                r7 = 0
                r0 = r8
                r2 = r10
                r4 = r11
                r5 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException.<init>(com.google.android.exoplayer2.Format, java.lang.Throwable, boolean, com.google.android.exoplayer2.mediacodec.MediaCodecInfo):void");
        }

        private DecoderInitializationException(String str, Throwable th, String str2, boolean z, MediaCodecInfo mediaCodecInfo, String str3, DecoderInitializationException decoderInitializationException) {
            super(str, th);
            this.mimeType = str2;
            this.secureDecoderRequired = z;
            this.codecInfo = mediaCodecInfo;
            this.diagnosticInfo = str3;
            this.fallbackDecoderInitializationException = decoderInitializationException;
        }

        /* access modifiers changed from: private */
        public DecoderInitializationException copyWithFallbackException(DecoderInitializationException decoderInitializationException) {
            return new DecoderInitializationException(getMessage(), getCause(), this.mimeType, this.secureDecoderRequired, this.codecInfo, this.diagnosticInfo, decoderInitializationException);
        }

        private static String getDiagnosticInfoV21(Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }

        private static String buildCustomDiagnosticInfo(int i) {
            String str = i < 0 ? "neg_" : "";
            int abs = Math.abs(i);
            StringBuilder sb = new StringBuilder(str.length() + 71);
            sb.append("com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_");
            sb.append(str);
            sb.append(abs);
            return sb.toString();
        }
    }

    public MediaCodecRenderer(int i, MediaCodecAdapter.Factory factory, MediaCodecSelector mediaCodecSelector2, boolean z, float f) {
        super(i);
        this.codecAdapterFactory = factory;
        this.mediaCodecSelector = (MediaCodecSelector) Assertions.checkNotNull(mediaCodecSelector2);
        this.enableDecoderFallback = z;
        this.assumedMinimumCodecOperatingRate = f;
        this.bypassBatchBuffer.ensureSpaceForWrite(0);
        this.bypassBatchBuffer.data.order(ByteOrder.nativeOrder());
        this.codecOperatingRate = -1.0f;
        this.codecAdaptationWorkaroundMode = 0;
        this.codecReconfigurationState = 0;
        this.inputIndex = -1;
        this.outputIndex = -1;
        this.codecHotswapDeadlineMs = -9223372036854775807L;
        this.largestQueuedPresentationTimeUs = -9223372036854775807L;
        this.lastBufferInStreamPresentationTimeUs = -9223372036854775807L;
        this.codecDrainState = 0;
        this.codecDrainAction = 0;
    }

    public void setRenderTimeLimitMs(long j) {
        this.renderTimeLimitMs = j;
    }

    public void experimentalSetAsynchronousBufferQueueingEnabled(boolean z) {
        this.enableAsynchronousBufferQueueing = z;
    }

    public void experimentalSetForceAsyncQueueingSynchronizationWorkaround(boolean z) {
        this.forceAsyncQueueingSynchronizationWorkaround = z;
    }

    public void experimentalSetSynchronizeCodecInteractionsWithQueueingEnabled(boolean z) {
        this.enableSynchronizeCodecInteractionsWithQueueing = z;
    }

    public final int supportsFormat(Format format) throws ExoPlaybackException {
        try {
            return supportsFormat(this.mediaCodecSelector, format);
        } catch (MediaCodecUtil.DecoderQueryException e) {
            throw createRendererException(e, format, PlaybackException.ERROR_CODE_DECODER_QUERY_FAILED);
        }
    }

    /* access modifiers changed from: protected */
    public final void maybeInitCodecOrBypass() throws ExoPlaybackException {
        Format format;
        if (this.codec == null && !this.bypassEnabled && (format = this.inputFormat) != null) {
            if (this.sourceDrmSession != null || !shouldUseBypass(format)) {
                setCodecDrmSession(this.sourceDrmSession);
                String str = this.inputFormat.sampleMimeType;
                DrmSession drmSession = this.codecDrmSession;
                if (drmSession != null) {
                    if (this.mediaCrypto == null) {
                        FrameworkMediaCrypto frameworkMediaCrypto = getFrameworkMediaCrypto(drmSession);
                        if (frameworkMediaCrypto != null) {
                            try {
                                this.mediaCrypto = new MediaCrypto(frameworkMediaCrypto.uuid, frameworkMediaCrypto.sessionId);
                                this.mediaCryptoRequiresSecureDecoder = !frameworkMediaCrypto.forceAllowInsecureDecoderComponents && this.mediaCrypto.requiresSecureDecoderComponent(str);
                            } catch (MediaCryptoException e) {
                                throw createRendererException(e, this.inputFormat, PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR);
                            }
                        } else if (this.codecDrmSession.getError() == null) {
                            return;
                        }
                    }
                    if (FrameworkMediaCrypto.WORKAROUND_DEVICE_NEEDS_KEYS_TO_CONFIGURE_CODEC) {
                        int state = this.codecDrmSession.getState();
                        if (state == 1) {
                            DrmSession.DrmSessionException drmSessionException = (DrmSession.DrmSessionException) Assertions.checkNotNull(this.codecDrmSession.getError());
                            throw createRendererException(drmSessionException, this.inputFormat, drmSessionException.errorCode);
                        } else if (state != 4) {
                            return;
                        }
                    }
                }
                try {
                    maybeInitCodecWithFallback(this.mediaCrypto, this.mediaCryptoRequiresSecureDecoder);
                } catch (DecoderInitializationException e2) {
                    throw createRendererException(e2, this.inputFormat, PlaybackException.ERROR_CODE_DECODER_INIT_FAILED);
                }
            } else {
                initBypass(this.inputFormat);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void setPendingPlaybackException(ExoPlaybackException exoPlaybackException) {
        this.pendingPlaybackException = exoPlaybackException;
    }

    /* access modifiers changed from: protected */
    public final void updateOutputFormatForTime(long j) throws ExoPlaybackException {
        boolean z;
        Format pollFloor = this.formatQueue.pollFloor(j);
        if (pollFloor == null && this.codecOutputMediaFormatChanged) {
            pollFloor = this.formatQueue.pollFirst();
        }
        if (pollFloor != null) {
            this.outputFormat = pollFloor;
            z = true;
        } else {
            z = false;
        }
        if (z || (this.codecOutputMediaFormatChanged && this.outputFormat != null)) {
            onOutputFormatChanged(this.outputFormat, this.codecOutputMediaFormat);
            this.codecOutputMediaFormatChanged = false;
        }
    }

    /* access modifiers changed from: protected */
    public final MediaCodecAdapter getCodec() {
        return this.codec;
    }

    /* access modifiers changed from: protected */
    public final MediaFormat getCodecOutputMediaFormat() {
        return this.codecOutputMediaFormat;
    }

    /* access modifiers changed from: protected */
    public final MediaCodecInfo getCodecInfo() {
        return this.codecInfo;
    }

    /* access modifiers changed from: protected */
    public void onEnabled(boolean z, boolean z2) throws ExoPlaybackException {
        this.decoderCounters = new DecoderCounters();
    }

    /* access modifiers changed from: protected */
    public void onStreamChanged(Format[] formatArr, long j, long j2) throws ExoPlaybackException {
        boolean z = true;
        if (this.outputStreamOffsetUs == -9223372036854775807L) {
            if (this.outputStreamStartPositionUs != -9223372036854775807L) {
                z = false;
            }
            Assertions.checkState(z);
            this.outputStreamStartPositionUs = j;
            this.outputStreamOffsetUs = j2;
            return;
        }
        int i = this.pendingOutputStreamOffsetCount;
        long[] jArr = this.pendingOutputStreamOffsetsUs;
        if (i == jArr.length) {
            long j3 = jArr[i - 1];
            StringBuilder sb = new StringBuilder(65);
            sb.append("Too many stream changes, so dropping offset: ");
            sb.append(j3);
            Log.m16696w(TAG, sb.toString());
        } else {
            this.pendingOutputStreamOffsetCount = i + 1;
        }
        long[] jArr2 = this.pendingOutputStreamStartPositionsUs;
        int i2 = this.pendingOutputStreamOffsetCount;
        jArr2[i2 - 1] = j;
        this.pendingOutputStreamOffsetsUs[i2 - 1] = j2;
        this.pendingOutputStreamSwitchTimesUs[i2 - 1] = this.largestQueuedPresentationTimeUs;
    }

    /* access modifiers changed from: protected */
    public void onPositionReset(long j, boolean z) throws ExoPlaybackException {
        this.inputStreamEnded = false;
        this.outputStreamEnded = false;
        this.pendingOutputEndOfStream = false;
        if (this.bypassEnabled) {
            this.bypassBatchBuffer.clear();
            this.bypassSampleBuffer.clear();
            this.bypassSampleBufferPending = false;
        } else {
            flushOrReinitializeCodec();
        }
        if (this.formatQueue.size() > 0) {
            this.waitingForFirstSampleInFormat = true;
        }
        this.formatQueue.clear();
        int i = this.pendingOutputStreamOffsetCount;
        if (i != 0) {
            this.outputStreamOffsetUs = this.pendingOutputStreamOffsetsUs[i - 1];
            this.outputStreamStartPositionUs = this.pendingOutputStreamStartPositionsUs[i - 1];
            this.pendingOutputStreamOffsetCount = 0;
        }
    }

    public void setPlaybackSpeed(float f, float f2) throws ExoPlaybackException {
        this.currentPlaybackSpeed = f;
        this.targetPlaybackSpeed = f2;
        updateCodecOperatingRate(this.codecInputFormat);
    }

    /* access modifiers changed from: protected */
    public void onDisabled() {
        this.inputFormat = null;
        this.outputStreamStartPositionUs = -9223372036854775807L;
        this.outputStreamOffsetUs = -9223372036854775807L;
        this.pendingOutputStreamOffsetCount = 0;
        flushOrReleaseCodec();
    }

    /* access modifiers changed from: protected */
    public void onReset() {
        try {
            disableBypass();
            releaseCodec();
        } finally {
            setSourceDrmSession((DrmSession) null);
        }
    }

    private void disableBypass() {
        this.bypassDrainAndReinitialize = false;
        this.bypassBatchBuffer.clear();
        this.bypassSampleBuffer.clear();
        this.bypassSampleBufferPending = false;
        this.bypassEnabled = false;
    }

    /* access modifiers changed from: protected */
    public void releaseCodec() {
        try {
            if (this.codec != null) {
                this.codec.release();
                this.decoderCounters.decoderReleaseCount++;
                onCodecReleased(this.codecInfo.name);
            }
            this.codec = null;
            try {
                if (this.mediaCrypto != null) {
                    this.mediaCrypto.release();
                }
            } finally {
                this.mediaCrypto = null;
                setCodecDrmSession((DrmSession) null);
                resetCodecStateForRelease();
            }
        } catch (Throwable th) {
            this.codec = null;
            if (this.mediaCrypto != null) {
                this.mediaCrypto.release();
            }
            throw th;
        } finally {
            this.mediaCrypto = null;
            setCodecDrmSession((DrmSession) null);
            resetCodecStateForRelease();
        }
    }

    public void render(long j, long j2) throws ExoPlaybackException {
        boolean z = false;
        if (this.pendingOutputEndOfStream) {
            this.pendingOutputEndOfStream = false;
            processEndOfStream();
        }
        ExoPlaybackException exoPlaybackException = this.pendingPlaybackException;
        if (exoPlaybackException == null) {
            try {
                if (this.outputStreamEnded) {
                    renderToEndOfStream();
                } else if (this.inputFormat != null || readSourceOmittingSampleData(2)) {
                    maybeInitCodecOrBypass();
                    if (this.bypassEnabled) {
                        TraceUtil.beginSection("bypassRender");
                        while (bypassRender(j, j2)) {
                        }
                        TraceUtil.endSection();
                    } else if (this.codec != null) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        TraceUtil.beginSection("drainAndFeed");
                        while (drainOutputBuffer(j, j2) && shouldContinueRendering(elapsedRealtime)) {
                        }
                        while (feedInputBuffer() && shouldContinueRendering(elapsedRealtime)) {
                        }
                        TraceUtil.endSection();
                    } else {
                        this.decoderCounters.skippedInputBufferCount += skipSource(j);
                        readSourceOmittingSampleData(1);
                    }
                    this.decoderCounters.ensureUpdated();
                }
            } catch (IllegalStateException e) {
                if (isMediaCodecException(e)) {
                    onCodecError(e);
                    if (Util.SDK_INT >= 21 && isRecoverableMediaCodecExceptionV21(e)) {
                        z = true;
                    }
                    if (z) {
                        releaseCodec();
                    }
                    throw createRendererException(createDecoderException(e, getCodecInfo()), this.inputFormat, z, PlaybackException.ERROR_CODE_DECODING_FAILED);
                }
                throw e;
            }
        } else {
            this.pendingPlaybackException = null;
            throw exoPlaybackException;
        }
    }

    /* access modifiers changed from: protected */
    public final boolean flushOrReinitializeCodec() throws ExoPlaybackException {
        boolean flushOrReleaseCodec = flushOrReleaseCodec();
        if (flushOrReleaseCodec) {
            maybeInitCodecOrBypass();
        }
        return flushOrReleaseCodec;
    }

    /* access modifiers changed from: protected */
    public boolean flushOrReleaseCodec() {
        if (this.codec == null) {
            return false;
        }
        if (this.codecDrainAction == 3 || this.codecNeedsFlushWorkaround || ((this.codecNeedsSosFlushWorkaround && !this.codecHasOutputMediaFormat) || (this.codecNeedsEosFlushWorkaround && this.codecReceivedEos))) {
            releaseCodec();
            return true;
        }
        flushCodec();
        return false;
    }

    private void flushCodec() {
        try {
            this.codec.flush();
        } finally {
            resetCodecStateForFlush();
        }
    }

    /* access modifiers changed from: protected */
    public void resetCodecStateForFlush() {
        resetInputBuffer();
        resetOutputBuffer();
        this.codecHotswapDeadlineMs = -9223372036854775807L;
        this.codecReceivedEos = false;
        this.codecReceivedBuffers = false;
        this.codecNeedsAdaptationWorkaroundBuffer = false;
        this.shouldSkipAdaptationWorkaroundOutputBuffer = false;
        this.isDecodeOnlyOutputBuffer = false;
        this.isLastOutputBuffer = false;
        this.decodeOnlyPresentationTimestamps.clear();
        this.largestQueuedPresentationTimeUs = -9223372036854775807L;
        this.lastBufferInStreamPresentationTimeUs = -9223372036854775807L;
        C2Mp3TimestampTracker c2Mp3TimestampTracker2 = this.c2Mp3TimestampTracker;
        if (c2Mp3TimestampTracker2 != null) {
            c2Mp3TimestampTracker2.reset();
        }
        this.codecDrainState = 0;
        this.codecDrainAction = 0;
        this.codecReconfigurationState = this.codecReconfigured ? 1 : 0;
    }

    /* access modifiers changed from: protected */
    public void resetCodecStateForRelease() {
        resetCodecStateForFlush();
        this.pendingPlaybackException = null;
        this.c2Mp3TimestampTracker = null;
        this.availableCodecInfos = null;
        this.codecInfo = null;
        this.codecInputFormat = null;
        this.codecOutputMediaFormat = null;
        this.codecOutputMediaFormatChanged = false;
        this.codecHasOutputMediaFormat = false;
        this.codecOperatingRate = -1.0f;
        this.codecAdaptationWorkaroundMode = 0;
        this.codecNeedsDiscardToSpsWorkaround = false;
        this.codecNeedsFlushWorkaround = false;
        this.codecNeedsSosFlushWorkaround = false;
        this.codecNeedsEosFlushWorkaround = false;
        this.codecNeedsEosOutputExceptionWorkaround = false;
        this.codecNeedsEosBufferTimestampWorkaround = false;
        this.codecNeedsMonoChannelCountWorkaround = false;
        this.codecNeedsEosPropagation = false;
        this.codecReconfigured = false;
        this.codecReconfigurationState = 0;
        this.mediaCryptoRequiresSecureDecoder = false;
    }

    /* access modifiers changed from: protected */
    public MediaCodecDecoderException createDecoderException(Throwable th, MediaCodecInfo mediaCodecInfo) {
        return new MediaCodecDecoderException(th, mediaCodecInfo);
    }

    private boolean readSourceOmittingSampleData(int i) throws ExoPlaybackException {
        FormatHolder formatHolder = getFormatHolder();
        this.noDataBuffer.clear();
        int readSource = readSource(formatHolder, this.noDataBuffer, i | 4);
        if (readSource == -5) {
            onInputFormatChanged(formatHolder);
            return true;
        } else if (readSource != -4 || !this.noDataBuffer.isEndOfStream()) {
            return false;
        } else {
            this.inputStreamEnded = true;
            processEndOfStream();
            return false;
        }
    }

    private void maybeInitCodecWithFallback(MediaCrypto mediaCrypto2, boolean z) throws DecoderInitializationException {
        if (this.availableCodecInfos == null) {
            try {
                List<MediaCodecInfo> availableCodecInfos2 = getAvailableCodecInfos(z);
                ArrayDeque<MediaCodecInfo> arrayDeque = new ArrayDeque<>();
                this.availableCodecInfos = arrayDeque;
                if (this.enableDecoderFallback) {
                    arrayDeque.addAll(availableCodecInfos2);
                } else if (!availableCodecInfos2.isEmpty()) {
                    this.availableCodecInfos.add(availableCodecInfos2.get(0));
                }
                this.preferredDecoderInitializationException = null;
            } catch (MediaCodecUtil.DecoderQueryException e) {
                throw new DecoderInitializationException(this.inputFormat, (Throwable) e, z, -49998);
            }
        }
        if (!this.availableCodecInfos.isEmpty()) {
            while (this.codec == null) {
                MediaCodecInfo peekFirst = this.availableCodecInfos.peekFirst();
                if (shouldInitCodec(peekFirst)) {
                    try {
                        initCodec(peekFirst, mediaCrypto2);
                    } catch (Exception e2) {
                        String valueOf = String.valueOf(peekFirst);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
                        sb.append("Failed to initialize decoder: ");
                        sb.append(valueOf);
                        Log.m16697w(TAG, sb.toString(), e2);
                        this.availableCodecInfos.removeFirst();
                        DecoderInitializationException decoderInitializationException = new DecoderInitializationException(this.inputFormat, (Throwable) e2, z, peekFirst);
                        onCodecError(decoderInitializationException);
                        DecoderInitializationException decoderInitializationException2 = this.preferredDecoderInitializationException;
                        if (decoderInitializationException2 == null) {
                            this.preferredDecoderInitializationException = decoderInitializationException;
                        } else {
                            this.preferredDecoderInitializationException = decoderInitializationException2.copyWithFallbackException(decoderInitializationException);
                        }
                        if (this.availableCodecInfos.isEmpty()) {
                            throw this.preferredDecoderInitializationException;
                        }
                    }
                } else {
                    return;
                }
            }
            this.availableCodecInfos = null;
            return;
        }
        throw new DecoderInitializationException(this.inputFormat, (Throwable) null, z, -49999);
    }

    private List<MediaCodecInfo> getAvailableCodecInfos(boolean z) throws MediaCodecUtil.DecoderQueryException {
        List<MediaCodecInfo> decoderInfos = getDecoderInfos(this.mediaCodecSelector, this.inputFormat, z);
        if (decoderInfos.isEmpty() && z) {
            decoderInfos = getDecoderInfos(this.mediaCodecSelector, this.inputFormat, false);
            if (!decoderInfos.isEmpty()) {
                String str = this.inputFormat.sampleMimeType;
                String valueOf = String.valueOf(decoderInfos);
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 99 + String.valueOf(valueOf).length());
                sb.append("Drm session requires secure decoder for ");
                sb.append(str);
                sb.append(", but no secure decoder available. Trying to proceed with ");
                sb.append(valueOf);
                sb.append(".");
                Log.m16696w(TAG, sb.toString());
            }
        }
        return decoderInfos;
    }

    private void initBypass(Format format) {
        disableBypass();
        String str = format.sampleMimeType;
        if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
            this.bypassBatchBuffer.setMaxSampleCount(32);
        } else {
            this.bypassBatchBuffer.setMaxSampleCount(1);
        }
        this.bypassEnabled = true;
    }

    private void initCodec(MediaCodecInfo mediaCodecInfo, MediaCrypto mediaCrypto2) throws Exception {
        float f;
        MediaCodecAdapter mediaCodecAdapter;
        String str = mediaCodecInfo.name;
        float f2 = -1.0f;
        if (Util.SDK_INT < 23) {
            f = -1.0f;
        } else {
            f = getCodecOperatingRateV23(this.targetPlaybackSpeed, this.inputFormat, getStreamFormats());
        }
        if (f > this.assumedMinimumCodecOperatingRate) {
            f2 = f;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String valueOf = String.valueOf(str);
        TraceUtil.beginSection(valueOf.length() != 0 ? "createCodec:".concat(valueOf) : new String("createCodec:"));
        MediaCodecAdapter.Configuration mediaCodecConfiguration = getMediaCodecConfiguration(mediaCodecInfo, this.inputFormat, mediaCrypto2, f2);
        if (!this.enableAsynchronousBufferQueueing || Util.SDK_INT < 23) {
            mediaCodecAdapter = this.codecAdapterFactory.createAdapter(mediaCodecConfiguration);
        } else {
            mediaCodecAdapter = new AsynchronousMediaCodecAdapter.Factory(getTrackType(), this.forceAsyncQueueingSynchronizationWorkaround, this.enableSynchronizeCodecInteractionsWithQueueing).createAdapter(mediaCodecConfiguration);
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        this.codec = mediaCodecAdapter;
        this.codecInfo = mediaCodecInfo;
        this.codecOperatingRate = f2;
        this.codecInputFormat = this.inputFormat;
        this.codecAdaptationWorkaroundMode = codecAdaptationWorkaroundMode(str);
        this.codecNeedsDiscardToSpsWorkaround = codecNeedsDiscardToSpsWorkaround(str, this.codecInputFormat);
        this.codecNeedsFlushWorkaround = codecNeedsFlushWorkaround(str);
        this.codecNeedsSosFlushWorkaround = codecNeedsSosFlushWorkaround(str);
        this.codecNeedsEosFlushWorkaround = codecNeedsEosFlushWorkaround(str);
        this.codecNeedsEosOutputExceptionWorkaround = codecNeedsEosOutputExceptionWorkaround(str);
        this.codecNeedsEosBufferTimestampWorkaround = codecNeedsEosBufferTimestampWorkaround(str);
        this.codecNeedsMonoChannelCountWorkaround = codecNeedsMonoChannelCountWorkaround(str, this.codecInputFormat);
        boolean z = false;
        this.codecNeedsEosPropagation = codecNeedsEosPropagationWorkaround(mediaCodecInfo) || getCodecNeedsEosPropagation();
        if (mediaCodecAdapter.needsReconfiguration()) {
            this.codecReconfigured = true;
            this.codecReconfigurationState = 1;
            if (this.codecAdaptationWorkaroundMode != 0) {
                z = true;
            }
            this.codecNeedsAdaptationWorkaroundBuffer = z;
        }
        if ("c2.android.mp3.decoder".equals(mediaCodecInfo.name)) {
            this.c2Mp3TimestampTracker = new C2Mp3TimestampTracker();
        }
        if (getState() == 2) {
            this.codecHotswapDeadlineMs = SystemClock.elapsedRealtime() + 1000;
        }
        this.decoderCounters.decoderInitCount++;
        onCodecInitialized(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
    }

    private boolean shouldContinueRendering(long j) {
        return this.renderTimeLimitMs == -9223372036854775807L || SystemClock.elapsedRealtime() - j < this.renderTimeLimitMs;
    }

    private boolean hasOutputBuffer() {
        return this.outputIndex >= 0;
    }

    private void resetInputBuffer() {
        this.inputIndex = -1;
        this.buffer.data = null;
    }

    private void resetOutputBuffer() {
        this.outputIndex = -1;
        this.outputBuffer = null;
    }

    private void setSourceDrmSession(DrmSession drmSession) {
        DrmSession.replaceSession(this.sourceDrmSession, drmSession);
        this.sourceDrmSession = drmSession;
    }

    private void setCodecDrmSession(DrmSession drmSession) {
        DrmSession.replaceSession(this.codecDrmSession, drmSession);
        this.codecDrmSession = drmSession;
    }

    private boolean feedInputBuffer() throws ExoPlaybackException {
        MediaCodecAdapter mediaCodecAdapter = this.codec;
        if (mediaCodecAdapter == null || this.codecDrainState == 2 || this.inputStreamEnded) {
            return false;
        }
        if (this.inputIndex < 0) {
            int dequeueInputBufferIndex = mediaCodecAdapter.dequeueInputBufferIndex();
            this.inputIndex = dequeueInputBufferIndex;
            if (dequeueInputBufferIndex < 0) {
                return false;
            }
            this.buffer.data = this.codec.getInputBuffer(dequeueInputBufferIndex);
            this.buffer.clear();
        }
        if (this.codecDrainState == 1) {
            if (!this.codecNeedsEosPropagation) {
                this.codecReceivedEos = true;
                this.codec.queueInputBuffer(this.inputIndex, 0, 0, 0, 4);
                resetInputBuffer();
            }
            this.codecDrainState = 2;
            return false;
        } else if (this.codecNeedsAdaptationWorkaroundBuffer) {
            this.codecNeedsAdaptationWorkaroundBuffer = false;
            this.buffer.data.put(ADAPTATION_WORKAROUND_BUFFER);
            this.codec.queueInputBuffer(this.inputIndex, 0, ADAPTATION_WORKAROUND_BUFFER.length, 0, 0);
            resetInputBuffer();
            this.codecReceivedBuffers = true;
            return true;
        } else {
            if (this.codecReconfigurationState == 1) {
                for (int i = 0; i < this.codecInputFormat.initializationData.size(); i++) {
                    this.buffer.data.put(this.codecInputFormat.initializationData.get(i));
                }
                this.codecReconfigurationState = 2;
            }
            int position = this.buffer.data.position();
            FormatHolder formatHolder = getFormatHolder();
            try {
                int readSource = readSource(formatHolder, this.buffer, 0);
                if (hasReadStreamToEnd()) {
                    this.lastBufferInStreamPresentationTimeUs = this.largestQueuedPresentationTimeUs;
                }
                if (readSource == -3) {
                    return false;
                }
                if (readSource == -5) {
                    if (this.codecReconfigurationState == 2) {
                        this.buffer.clear();
                        this.codecReconfigurationState = 1;
                    }
                    onInputFormatChanged(formatHolder);
                    return true;
                } else if (this.buffer.isEndOfStream()) {
                    if (this.codecReconfigurationState == 2) {
                        this.buffer.clear();
                        this.codecReconfigurationState = 1;
                    }
                    this.inputStreamEnded = true;
                    if (!this.codecReceivedBuffers) {
                        processEndOfStream();
                        return false;
                    }
                    try {
                        if (!this.codecNeedsEosPropagation) {
                            this.codecReceivedEos = true;
                            this.codec.queueInputBuffer(this.inputIndex, 0, 0, 0, 4);
                            resetInputBuffer();
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e) {
                        throw createRendererException(e, this.inputFormat, C5429C.getErrorCodeForMediaDrmErrorCode(e.getErrorCode()));
                    }
                } else if (this.codecReceivedBuffers || this.buffer.isKeyFrame()) {
                    boolean isEncrypted = this.buffer.isEncrypted();
                    if (isEncrypted) {
                        this.buffer.cryptoInfo.increaseClearDataFirstSubSampleBy(position);
                    }
                    if (this.codecNeedsDiscardToSpsWorkaround && !isEncrypted) {
                        NalUnitUtil.discardToSps(this.buffer.data);
                        if (this.buffer.data.position() == 0) {
                            return true;
                        }
                        this.codecNeedsDiscardToSpsWorkaround = false;
                    }
                    long j = this.buffer.timeUs;
                    C2Mp3TimestampTracker c2Mp3TimestampTracker2 = this.c2Mp3TimestampTracker;
                    if (c2Mp3TimestampTracker2 != null) {
                        j = c2Mp3TimestampTracker2.updateAndGetPresentationTimeUs(this.inputFormat, this.buffer);
                        this.largestQueuedPresentationTimeUs = Math.max(this.largestQueuedPresentationTimeUs, this.c2Mp3TimestampTracker.getLastOutputBufferPresentationTimeUs(this.inputFormat));
                    }
                    long j2 = j;
                    if (this.buffer.isDecodeOnly()) {
                        this.decodeOnlyPresentationTimestamps.add(Long.valueOf(j2));
                    }
                    if (this.waitingForFirstSampleInFormat) {
                        this.formatQueue.add(j2, this.inputFormat);
                        this.waitingForFirstSampleInFormat = false;
                    }
                    this.largestQueuedPresentationTimeUs = Math.max(this.largestQueuedPresentationTimeUs, j2);
                    this.buffer.flip();
                    if (this.buffer.hasSupplementalData()) {
                        handleInputBufferSupplementalData(this.buffer);
                    }
                    onQueueInputBuffer(this.buffer);
                    if (isEncrypted) {
                        try {
                            this.codec.queueSecureInputBuffer(this.inputIndex, 0, this.buffer.cryptoInfo, j2, 0);
                        } catch (MediaCodec.CryptoException e2) {
                            throw createRendererException(e2, this.inputFormat, C5429C.getErrorCodeForMediaDrmErrorCode(e2.getErrorCode()));
                        }
                    } else {
                        this.codec.queueInputBuffer(this.inputIndex, 0, this.buffer.data.limit(), j2, 0);
                    }
                    resetInputBuffer();
                    this.codecReceivedBuffers = true;
                    this.codecReconfigurationState = 0;
                    this.decoderCounters.inputBufferCount++;
                    return true;
                } else {
                    this.buffer.clear();
                    if (this.codecReconfigurationState == 2) {
                        this.codecReconfigurationState = 1;
                    }
                    return true;
                }
            } catch (DecoderInputBuffer.InsufficientCapacityException e3) {
                onCodecError(e3);
                readSourceOmittingSampleData(0);
                flushCodec();
                return true;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0080, code lost:
        if (drainAndUpdateCodecDrmSessionV23() == false) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b2, code lost:
        if (drainAndUpdateCodecDrmSessionV23() == false) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ce, code lost:
        r7 = 2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00ea A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.exoplayer2.decoder.DecoderReuseEvaluation onInputFormatChanged(com.google.android.exoplayer2.FormatHolder r12) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            r11 = this;
            r0 = 1
            r11.waitingForFirstSampleInFormat = r0
            com.google.android.exoplayer2.Format r1 = r12.format
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            r5 = r1
            com.google.android.exoplayer2.Format r5 = (com.google.android.exoplayer2.Format) r5
            java.lang.String r1 = r5.sampleMimeType
            if (r1 == 0) goto L_0x00eb
            com.google.android.exoplayer2.drm.DrmSession r12 = r12.drmSession
            r11.setSourceDrmSession(r12)
            r11.inputFormat = r5
            boolean r12 = r11.bypassEnabled
            r1 = 0
            if (r12 == 0) goto L_0x001f
            r11.bypassDrainAndReinitialize = r0
            return r1
        L_0x001f:
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r12 = r11.codec
            if (r12 != 0) goto L_0x0029
            r11.availableCodecInfos = r1
            r11.maybeInitCodecOrBypass()
            return r1
        L_0x0029:
            com.google.android.exoplayer2.mediacodec.MediaCodecInfo r1 = r11.codecInfo
            com.google.android.exoplayer2.Format r4 = r11.codecInputFormat
            com.google.android.exoplayer2.drm.DrmSession r2 = r11.codecDrmSession
            com.google.android.exoplayer2.drm.DrmSession r3 = r11.sourceDrmSession
            boolean r2 = r11.drmNeedsCodecReinitialization(r1, r5, r2, r3)
            if (r2 == 0) goto L_0x0046
            r11.drainAndReinitializeCodec()
            com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r12 = new com.google.android.exoplayer2.decoder.DecoderReuseEvaluation
            java.lang.String r3 = r1.name
            r6 = 0
            r7 = 128(0x80, float:1.794E-43)
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            return r12
        L_0x0046:
            com.google.android.exoplayer2.drm.DrmSession r2 = r11.sourceDrmSession
            com.google.android.exoplayer2.drm.DrmSession r3 = r11.codecDrmSession
            r6 = 0
            if (r2 == r3) goto L_0x004f
            r2 = r0
            goto L_0x0050
        L_0x004f:
            r2 = r6
        L_0x0050:
            if (r2 == 0) goto L_0x005b
            int r3 = com.google.android.exoplayer2.util.Util.SDK_INT
            r7 = 23
            if (r3 < r7) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r3 = r6
            goto L_0x005c
        L_0x005b:
            r3 = r0
        L_0x005c:
            com.google.android.exoplayer2.util.Assertions.checkState(r3)
            com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r3 = r11.canReuseCodec(r1, r4, r5)
            int r7 = r3.result
            r8 = 3
            r9 = 16
            r10 = 2
            if (r7 == 0) goto L_0x00d0
            if (r7 == r0) goto L_0x00b5
            if (r7 == r10) goto L_0x0089
            if (r7 != r8) goto L_0x0083
            boolean r0 = r11.updateCodecOperatingRate(r5)
            if (r0 != 0) goto L_0x0078
            goto L_0x00bb
        L_0x0078:
            r11.codecInputFormat = r5
            if (r2 == 0) goto L_0x00d3
            boolean r0 = r11.drainAndUpdateCodecDrmSessionV23()
            if (r0 != 0) goto L_0x00d3
            goto L_0x00ce
        L_0x0083:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>()
            throw r12
        L_0x0089:
            boolean r7 = r11.updateCodecOperatingRate(r5)
            if (r7 != 0) goto L_0x0090
            goto L_0x00bb
        L_0x0090:
            r11.codecReconfigured = r0
            r11.codecReconfigurationState = r0
            int r7 = r11.codecAdaptationWorkaroundMode
            if (r7 == r10) goto L_0x00a8
            if (r7 != r0) goto L_0x00a7
            int r7 = r5.width
            int r9 = r4.width
            if (r7 != r9) goto L_0x00a7
            int r7 = r5.height
            int r9 = r4.height
            if (r7 != r9) goto L_0x00a7
            goto L_0x00a8
        L_0x00a7:
            r0 = r6
        L_0x00a8:
            r11.codecNeedsAdaptationWorkaroundBuffer = r0
            r11.codecInputFormat = r5
            if (r2 == 0) goto L_0x00d3
            boolean r0 = r11.drainAndUpdateCodecDrmSessionV23()
            if (r0 != 0) goto L_0x00d3
            goto L_0x00ce
        L_0x00b5:
            boolean r0 = r11.updateCodecOperatingRate(r5)
            if (r0 != 0) goto L_0x00bd
        L_0x00bb:
            r7 = r9
            goto L_0x00d4
        L_0x00bd:
            r11.codecInputFormat = r5
            if (r2 == 0) goto L_0x00c8
            boolean r0 = r11.drainAndUpdateCodecDrmSessionV23()
            if (r0 != 0) goto L_0x00d3
            goto L_0x00ce
        L_0x00c8:
            boolean r0 = r11.drainAndFlushCodec()
            if (r0 != 0) goto L_0x00d3
        L_0x00ce:
            r7 = r10
            goto L_0x00d4
        L_0x00d0:
            r11.drainAndReinitializeCodec()
        L_0x00d3:
            r7 = r6
        L_0x00d4:
            int r0 = r3.result
            if (r0 == 0) goto L_0x00ea
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r0 = r11.codec
            if (r0 != r12) goto L_0x00e0
            int r12 = r11.codecDrainAction
            if (r12 != r8) goto L_0x00ea
        L_0x00e0:
            com.google.android.exoplayer2.decoder.DecoderReuseEvaluation r12 = new com.google.android.exoplayer2.decoder.DecoderReuseEvaluation
            java.lang.String r3 = r1.name
            r6 = 0
            r2 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            return r12
        L_0x00ea:
            return r3
        L_0x00eb:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>()
            r0 = 4005(0xfa5, float:5.612E-42)
            com.google.android.exoplayer2.ExoPlaybackException r12 = r11.createRendererException(r12, r5, r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.onInputFormatChanged(com.google.android.exoplayer2.FormatHolder):com.google.android.exoplayer2.decoder.DecoderReuseEvaluation");
    }

    /* access modifiers changed from: protected */
    public void onProcessedOutputBuffer(long j) {
        while (true) {
            int i = this.pendingOutputStreamOffsetCount;
            if (i != 0 && j >= this.pendingOutputStreamSwitchTimesUs[0]) {
                long[] jArr = this.pendingOutputStreamStartPositionsUs;
                this.outputStreamStartPositionUs = jArr[0];
                this.outputStreamOffsetUs = this.pendingOutputStreamOffsetsUs[0];
                int i2 = i - 1;
                this.pendingOutputStreamOffsetCount = i2;
                System.arraycopy(jArr, 1, jArr, 0, i2);
                long[] jArr2 = this.pendingOutputStreamOffsetsUs;
                System.arraycopy(jArr2, 1, jArr2, 0, this.pendingOutputStreamOffsetCount);
                long[] jArr3 = this.pendingOutputStreamSwitchTimesUs;
                System.arraycopy(jArr3, 1, jArr3, 0, this.pendingOutputStreamOffsetCount);
                onProcessedStreamChange();
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    public DecoderReuseEvaluation canReuseCodec(MediaCodecInfo mediaCodecInfo, Format format, Format format2) {
        return new DecoderReuseEvaluation(mediaCodecInfo.name, format, format2, 0, 1);
    }

    public boolean isEnded() {
        return this.outputStreamEnded;
    }

    public boolean isReady() {
        return this.inputFormat != null && (isSourceReady() || hasOutputBuffer() || (this.codecHotswapDeadlineMs != -9223372036854775807L && SystemClock.elapsedRealtime() < this.codecHotswapDeadlineMs));
    }

    /* access modifiers changed from: protected */
    public float getPlaybackSpeed() {
        return this.currentPlaybackSpeed;
    }

    /* access modifiers changed from: protected */
    public float getCodecOperatingRate() {
        return this.codecOperatingRate;
    }

    /* access modifiers changed from: protected */
    public final boolean updateCodecOperatingRate() throws ExoPlaybackException {
        return updateCodecOperatingRate(this.codecInputFormat);
    }

    private boolean updateCodecOperatingRate(Format format) throws ExoPlaybackException {
        if (!(Util.SDK_INT < 23 || this.codec == null || this.codecDrainAction == 3 || getState() == 0)) {
            float codecOperatingRateV23 = getCodecOperatingRateV23(this.targetPlaybackSpeed, format, getStreamFormats());
            float f = this.codecOperatingRate;
            if (f == codecOperatingRateV23) {
                return true;
            }
            if (codecOperatingRateV23 == -1.0f) {
                drainAndReinitializeCodec();
                return false;
            } else if (f == -1.0f && codecOperatingRateV23 <= this.assumedMinimumCodecOperatingRate) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", codecOperatingRateV23);
                this.codec.setParameters(bundle);
                this.codecOperatingRate = codecOperatingRateV23;
            }
        }
        return true;
    }

    private boolean drainAndFlushCodec() {
        if (this.codecReceivedBuffers) {
            this.codecDrainState = 1;
            if (this.codecNeedsFlushWorkaround || this.codecNeedsEosFlushWorkaround) {
                this.codecDrainAction = 3;
                return false;
            }
            this.codecDrainAction = 1;
        }
        return true;
    }

    private boolean drainAndUpdateCodecDrmSessionV23() throws ExoPlaybackException {
        if (this.codecReceivedBuffers) {
            this.codecDrainState = 1;
            if (this.codecNeedsFlushWorkaround || this.codecNeedsEosFlushWorkaround) {
                this.codecDrainAction = 3;
                return false;
            }
            this.codecDrainAction = 2;
        } else {
            updateDrmSessionV23();
        }
        return true;
    }

    private void drainAndReinitializeCodec() throws ExoPlaybackException {
        if (this.codecReceivedBuffers) {
            this.codecDrainState = 1;
            this.codecDrainAction = 3;
            return;
        }
        reinitializeCodec();
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x0105  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean drainOutputBuffer(long r20, long r22) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            r19 = this;
            r15 = r19
            boolean r0 = r19.hasOutputBuffer()
            r16 = 1
            r14 = 0
            if (r0 != 0) goto L_0x00ce
            boolean r0 = r15.codecNeedsEosOutputExceptionWorkaround
            if (r0 == 0) goto L_0x0027
            boolean r0 = r15.codecReceivedEos
            if (r0 == 0) goto L_0x0027
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r0 = r15.codec     // Catch:{ IllegalStateException -> 0x001c }
            android.media.MediaCodec$BufferInfo r1 = r15.outputBufferInfo     // Catch:{ IllegalStateException -> 0x001c }
            int r0 = r0.dequeueOutputBufferIndex(r1)     // Catch:{ IllegalStateException -> 0x001c }
            goto L_0x002f
        L_0x001c:
            r19.processEndOfStream()
            boolean r0 = r15.outputStreamEnded
            if (r0 == 0) goto L_0x0026
            r19.releaseCodec()
        L_0x0026:
            return r14
        L_0x0027:
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r0 = r15.codec
            android.media.MediaCodec$BufferInfo r1 = r15.outputBufferInfo
            int r0 = r0.dequeueOutputBufferIndex(r1)
        L_0x002f:
            if (r0 >= 0) goto L_0x0049
            r1 = -2
            if (r0 != r1) goto L_0x0038
            r19.processOutputMediaFormatChanged()
            return r16
        L_0x0038:
            boolean r0 = r15.codecNeedsEosPropagation
            if (r0 == 0) goto L_0x0048
            boolean r0 = r15.inputStreamEnded
            if (r0 != 0) goto L_0x0045
            int r0 = r15.codecDrainState
            r1 = 2
            if (r0 != r1) goto L_0x0048
        L_0x0045:
            r19.processEndOfStream()
        L_0x0048:
            return r14
        L_0x0049:
            boolean r1 = r15.shouldSkipAdaptationWorkaroundOutputBuffer
            if (r1 == 0) goto L_0x0055
            r15.shouldSkipAdaptationWorkaroundOutputBuffer = r14
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r1 = r15.codec
            r1.releaseOutputBuffer((int) r0, (boolean) r14)
            return r16
        L_0x0055:
            android.media.MediaCodec$BufferInfo r1 = r15.outputBufferInfo
            int r1 = r1.size
            if (r1 != 0) goto L_0x0067
            android.media.MediaCodec$BufferInfo r1 = r15.outputBufferInfo
            int r1 = r1.flags
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0067
            r19.processEndOfStream()
            return r14
        L_0x0067:
            r15.outputIndex = r0
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r1 = r15.codec
            java.nio.ByteBuffer r0 = r1.getOutputBuffer(r0)
            r15.outputBuffer = r0
            if (r0 == 0) goto L_0x0088
            android.media.MediaCodec$BufferInfo r1 = r15.outputBufferInfo
            int r1 = r1.offset
            r0.position(r1)
            java.nio.ByteBuffer r0 = r15.outputBuffer
            android.media.MediaCodec$BufferInfo r1 = r15.outputBufferInfo
            int r1 = r1.offset
            android.media.MediaCodec$BufferInfo r2 = r15.outputBufferInfo
            int r2 = r2.size
            int r1 = r1 + r2
            r0.limit(r1)
        L_0x0088:
            boolean r0 = r15.codecNeedsEosBufferTimestampWorkaround
            if (r0 == 0) goto L_0x00ad
            android.media.MediaCodec$BufferInfo r0 = r15.outputBufferInfo
            long r0 = r0.presentationTimeUs
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x00ad
            android.media.MediaCodec$BufferInfo r0 = r15.outputBufferInfo
            int r0 = r0.flags
            r0 = r0 & 4
            if (r0 == 0) goto L_0x00ad
            long r0 = r15.largestQueuedPresentationTimeUs
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x00ad
            android.media.MediaCodec$BufferInfo r2 = r15.outputBufferInfo
            r2.presentationTimeUs = r0
        L_0x00ad:
            android.media.MediaCodec$BufferInfo r0 = r15.outputBufferInfo
            long r0 = r0.presentationTimeUs
            boolean r0 = r15.isDecodeOnlyBuffer(r0)
            r15.isDecodeOnlyOutputBuffer = r0
            long r0 = r15.lastBufferInStreamPresentationTimeUs
            android.media.MediaCodec$BufferInfo r2 = r15.outputBufferInfo
            long r2 = r2.presentationTimeUs
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x00c4
            r0 = r16
            goto L_0x00c5
        L_0x00c4:
            r0 = r14
        L_0x00c5:
            r15.isLastOutputBuffer = r0
            android.media.MediaCodec$BufferInfo r0 = r15.outputBufferInfo
            long r0 = r0.presentationTimeUs
            r15.updateOutputFormatForTime(r0)
        L_0x00ce:
            boolean r0 = r15.codecNeedsEosOutputExceptionWorkaround
            if (r0 == 0) goto L_0x0109
            boolean r0 = r15.codecReceivedEos
            if (r0 == 0) goto L_0x0109
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r5 = r15.codec     // Catch:{ IllegalStateException -> 0x00fc }
            java.nio.ByteBuffer r6 = r15.outputBuffer     // Catch:{ IllegalStateException -> 0x00fc }
            int r7 = r15.outputIndex     // Catch:{ IllegalStateException -> 0x00fc }
            android.media.MediaCodec$BufferInfo r0 = r15.outputBufferInfo     // Catch:{ IllegalStateException -> 0x00fc }
            int r8 = r0.flags     // Catch:{ IllegalStateException -> 0x00fc }
            r9 = 1
            android.media.MediaCodec$BufferInfo r0 = r15.outputBufferInfo     // Catch:{ IllegalStateException -> 0x00fc }
            long r10 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x00fc }
            boolean r12 = r15.isDecodeOnlyOutputBuffer     // Catch:{ IllegalStateException -> 0x00fc }
            boolean r13 = r15.isLastOutputBuffer     // Catch:{ IllegalStateException -> 0x00fc }
            com.google.android.exoplayer2.Format r3 = r15.outputFormat     // Catch:{ IllegalStateException -> 0x00fc }
            r0 = r19
            r1 = r20
            r17 = r3
            r3 = r22
            r18 = r14
            r14 = r17
            boolean r0 = r0.processOutputBuffer(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)     // Catch:{ IllegalStateException -> 0x00fe }
            goto L_0x012a
        L_0x00fc:
            r18 = r14
        L_0x00fe:
            r19.processEndOfStream()
            boolean r0 = r15.outputStreamEnded
            if (r0 == 0) goto L_0x0108
            r19.releaseCodec()
        L_0x0108:
            return r18
        L_0x0109:
            r18 = r14
            com.google.android.exoplayer2.mediacodec.MediaCodecAdapter r5 = r15.codec
            java.nio.ByteBuffer r6 = r15.outputBuffer
            int r7 = r15.outputIndex
            android.media.MediaCodec$BufferInfo r0 = r15.outputBufferInfo
            int r8 = r0.flags
            r9 = 1
            android.media.MediaCodec$BufferInfo r0 = r15.outputBufferInfo
            long r10 = r0.presentationTimeUs
            boolean r12 = r15.isDecodeOnlyOutputBuffer
            boolean r13 = r15.isLastOutputBuffer
            com.google.android.exoplayer2.Format r14 = r15.outputFormat
            r0 = r19
            r1 = r20
            r3 = r22
            boolean r0 = r0.processOutputBuffer(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)
        L_0x012a:
            if (r0 == 0) goto L_0x0149
            android.media.MediaCodec$BufferInfo r0 = r15.outputBufferInfo
            long r0 = r0.presentationTimeUs
            r15.onProcessedOutputBuffer(r0)
            android.media.MediaCodec$BufferInfo r0 = r15.outputBufferInfo
            int r0 = r0.flags
            r0 = r0 & 4
            if (r0 == 0) goto L_0x013e
            r14 = r16
            goto L_0x0140
        L_0x013e:
            r14 = r18
        L_0x0140:
            r19.resetOutputBuffer()
            if (r14 != 0) goto L_0x0146
            return r16
        L_0x0146:
            r19.processEndOfStream()
        L_0x0149:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.drainOutputBuffer(long, long):boolean");
    }

    private void processOutputMediaFormatChanged() {
        this.codecHasOutputMediaFormat = true;
        MediaFormat outputFormat2 = this.codec.getOutputFormat();
        if (this.codecAdaptationWorkaroundMode != 0 && outputFormat2.getInteger("width") == 32 && outputFormat2.getInteger("height") == 32) {
            this.shouldSkipAdaptationWorkaroundOutputBuffer = true;
            return;
        }
        if (this.codecNeedsMonoChannelCountWorkaround) {
            outputFormat2.setInteger("channel-count", 1);
        }
        this.codecOutputMediaFormat = outputFormat2;
        this.codecOutputMediaFormatChanged = true;
    }

    private void processEndOfStream() throws ExoPlaybackException {
        int i = this.codecDrainAction;
        if (i == 1) {
            flushCodec();
        } else if (i == 2) {
            flushCodec();
            updateDrmSessionV23();
        } else if (i != 3) {
            this.outputStreamEnded = true;
            renderToEndOfStream();
        } else {
            reinitializeCodec();
        }
    }

    /* access modifiers changed from: protected */
    public final void setPendingOutputEndOfStream() {
        this.pendingOutputEndOfStream = true;
    }

    /* access modifiers changed from: protected */
    public final long getOutputStreamOffsetUs() {
        return this.outputStreamOffsetUs;
    }

    protected static boolean supportsFormatDrm(Format format) {
        return format.exoMediaCryptoType == null || FrameworkMediaCrypto.class.equals(format.exoMediaCryptoType);
    }

    private boolean drmNeedsCodecReinitialization(MediaCodecInfo mediaCodecInfo, Format format, DrmSession drmSession, DrmSession drmSession2) throws ExoPlaybackException {
        FrameworkMediaCrypto frameworkMediaCrypto;
        if (drmSession == drmSession2) {
            return false;
        }
        if (drmSession2 == null || drmSession == null || Util.SDK_INT < 23 || C5429C.PLAYREADY_UUID.equals(drmSession.getSchemeUuid()) || C5429C.PLAYREADY_UUID.equals(drmSession2.getSchemeUuid()) || (frameworkMediaCrypto = getFrameworkMediaCrypto(drmSession2)) == null) {
            return true;
        }
        return !mediaCodecInfo.secure && maybeRequiresSecureDecoder(frameworkMediaCrypto, format);
    }

    private boolean maybeRequiresSecureDecoder(FrameworkMediaCrypto frameworkMediaCrypto, Format format) {
        if (frameworkMediaCrypto.forceAllowInsecureDecoderComponents) {
            return false;
        }
        try {
            MediaCrypto mediaCrypto2 = new MediaCrypto(frameworkMediaCrypto.uuid, frameworkMediaCrypto.sessionId);
            try {
                return mediaCrypto2.requiresSecureDecoderComponent(format.sampleMimeType);
            } finally {
                mediaCrypto2.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    private void reinitializeCodec() throws ExoPlaybackException {
        releaseCodec();
        maybeInitCodecOrBypass();
    }

    private boolean isDecodeOnlyBuffer(long j) {
        int size = this.decodeOnlyPresentationTimestamps.size();
        for (int i = 0; i < size; i++) {
            if (this.decodeOnlyPresentationTimestamps.get(i).longValue() == j) {
                this.decodeOnlyPresentationTimestamps.remove(i);
                return true;
            }
        }
        return false;
    }

    private void updateDrmSessionV23() throws ExoPlaybackException {
        try {
            this.mediaCrypto.setMediaDrmSession(getFrameworkMediaCrypto(this.sourceDrmSession).sessionId);
            setCodecDrmSession(this.sourceDrmSession);
            this.codecDrainState = 0;
            this.codecDrainAction = 0;
        } catch (MediaCryptoException e) {
            throw createRendererException(e, this.inputFormat, PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR);
        }
    }

    private FrameworkMediaCrypto getFrameworkMediaCrypto(DrmSession drmSession) throws ExoPlaybackException {
        ExoMediaCrypto mediaCrypto2 = drmSession.getMediaCrypto();
        if (mediaCrypto2 == null || (mediaCrypto2 instanceof FrameworkMediaCrypto)) {
            return (FrameworkMediaCrypto) mediaCrypto2;
        }
        String valueOf = String.valueOf(mediaCrypto2);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
        sb.append("Expecting FrameworkMediaCrypto but found: ");
        sb.append(valueOf);
        throw createRendererException(new IllegalArgumentException(sb.toString()), this.inputFormat, 6001);
    }

    private boolean bypassRender(long j, long j2) throws ExoPlaybackException {
        boolean z;
        Assertions.checkState(!this.outputStreamEnded);
        if (this.bypassBatchBuffer.hasSamples()) {
            if (!processOutputBuffer(j, j2, (MediaCodecAdapter) null, this.bypassBatchBuffer.data, this.outputIndex, 0, this.bypassBatchBuffer.getSampleCount(), this.bypassBatchBuffer.getFirstSampleTimeUs(), this.bypassBatchBuffer.isDecodeOnly(), this.bypassBatchBuffer.isEndOfStream(), this.outputFormat)) {
                return false;
            }
            onProcessedOutputBuffer(this.bypassBatchBuffer.getLastSampleTimeUs());
            this.bypassBatchBuffer.clear();
            z = false;
        } else {
            z = false;
        }
        if (this.inputStreamEnded) {
            this.outputStreamEnded = true;
            return z;
        }
        if (this.bypassSampleBufferPending) {
            Assertions.checkState(this.bypassBatchBuffer.append(this.bypassSampleBuffer));
            this.bypassSampleBufferPending = z;
        }
        if (this.bypassDrainAndReinitialize) {
            if (this.bypassBatchBuffer.hasSamples()) {
                return true;
            }
            disableBypass();
            this.bypassDrainAndReinitialize = z;
            maybeInitCodecOrBypass();
            if (!this.bypassEnabled) {
                return z;
            }
        }
        bypassRead();
        if (this.bypassBatchBuffer.hasSamples()) {
            this.bypassBatchBuffer.flip();
        }
        if (this.bypassBatchBuffer.hasSamples() || this.inputStreamEnded || this.bypassDrainAndReinitialize) {
            return true;
        }
        return z;
    }

    private void bypassRead() throws ExoPlaybackException {
        Assertions.checkState(!this.inputStreamEnded);
        FormatHolder formatHolder = getFormatHolder();
        this.bypassSampleBuffer.clear();
        do {
            this.bypassSampleBuffer.clear();
            int readSource = readSource(formatHolder, this.bypassSampleBuffer, 0);
            if (readSource == -5) {
                onInputFormatChanged(formatHolder);
                return;
            } else if (readSource != -4) {
                if (readSource != -3) {
                    throw new IllegalStateException();
                }
                return;
            } else if (this.bypassSampleBuffer.isEndOfStream()) {
                this.inputStreamEnded = true;
                return;
            } else {
                if (this.waitingForFirstSampleInFormat) {
                    Format format = (Format) Assertions.checkNotNull(this.inputFormat);
                    this.outputFormat = format;
                    onOutputFormatChanged(format, (MediaFormat) null);
                    this.waitingForFirstSampleInFormat = false;
                }
                this.bypassSampleBuffer.flip();
            }
        } while (this.bypassBatchBuffer.append(this.bypassSampleBuffer));
        this.bypassSampleBufferPending = true;
    }

    private static boolean isMediaCodecException(IllegalStateException illegalStateException) {
        if (Util.SDK_INT >= 21 && isMediaCodecExceptionV21(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
            return false;
        }
        return true;
    }

    private static boolean isMediaCodecExceptionV21(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    private static boolean isRecoverableMediaCodecExceptionV21(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).isRecoverable();
        }
        return false;
    }

    private static boolean codecNeedsFlushWorkaround(String str) {
        return Util.SDK_INT < 18 || (Util.SDK_INT == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (Util.SDK_INT == 19 && Util.MODEL.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
    }

    private int codecAdaptationWorkaroundMode(String str) {
        if (Util.SDK_INT <= 25 && "OMX.Exynos.avc.dec.secure".equals(str) && (Util.MODEL.startsWith("SM-T585") || Util.MODEL.startsWith("SM-A510") || Util.MODEL.startsWith("SM-A520") || Util.MODEL.startsWith("SM-J700"))) {
            return 2;
        }
        if (Util.SDK_INT >= 24) {
            return 0;
        }
        if ("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str)) {
            return ("flounder".equals(Util.DEVICE) || "flounder_lte".equals(Util.DEVICE) || "grouper".equals(Util.DEVICE) || "tilapia".equals(Util.DEVICE)) ? 1 : 0;
        }
        return 0;
    }

    private static boolean codecNeedsDiscardToSpsWorkaround(String str, Format format) {
        return Util.SDK_INT < 21 && format.initializationData.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    private static boolean codecNeedsSosFlushWorkaround(String str) {
        return Util.SDK_INT == 29 && "c2.android.aac.decoder".equals(str);
    }

    private static boolean codecNeedsEosPropagationWorkaround(MediaCodecInfo mediaCodecInfo) {
        String str = mediaCodecInfo.name;
        return (Util.SDK_INT <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (Util.SDK_INT <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ((Util.SDK_INT <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str))) || (Platform.MANUFACTURER_AMAZON.equals(Util.MANUFACTURER) && "AFTS".equals(Util.MODEL) && mediaCodecInfo.secure));
    }

    private static boolean codecNeedsEosFlushWorkaround(String str) {
        return (Util.SDK_INT <= 23 && "OMX.google.vorbis.decoder".equals(str)) || (Util.SDK_INT <= 19 && (("hb2000".equals(Util.DEVICE) || "stvm8".equals(Util.DEVICE)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))));
    }

    private static boolean codecNeedsEosBufferTimestampWorkaround(String str) {
        return Util.SDK_INT < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(Util.MANUFACTURER) && (Util.DEVICE.startsWith("baffin") || Util.DEVICE.startsWith("grand") || Util.DEVICE.startsWith("fortuna") || Util.DEVICE.startsWith("gprimelte") || Util.DEVICE.startsWith("j2y18lte") || Util.DEVICE.startsWith("ms01"));
    }

    private static boolean codecNeedsEosOutputExceptionWorkaround(String str) {
        return Util.SDK_INT == 21 && "OMX.google.aac.decoder".equals(str);
    }

    private static boolean codecNeedsMonoChannelCountWorkaround(String str, Format format) {
        if (Util.SDK_INT > 18 || format.channelCount != 1 || !"OMX.MTK.AUDIO.DECODER.MP3".equals(str)) {
            return false;
        }
        return true;
    }
}
