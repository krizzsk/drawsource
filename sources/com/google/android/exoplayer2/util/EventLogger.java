package com.google.android.exoplayer2.util;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.exoplayer2.C5429C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.MappingTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.video.VideoSize;
import com.tapjoy.TapjoyConstants;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import okhttp3.HttpUrl;

public class EventLogger implements AnalyticsListener {
    private static final String DEFAULT_TAG = "EventLogger";
    private static final int MAX_TIMELINE_ITEM_LINES = 3;
    private static final NumberFormat TIME_FORMAT;
    private final Timeline.Period period;
    private final long startTimeMs;
    private final String tag;
    private final MappingTrackSelector trackSelector;
    private final Timeline.Window window;

    private static String getDiscontinuityReasonString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "?" : "INTERNAL" : "REMOVE" : "SKIP" : "SEEK_ADJUSTMENT" : "SEEK" : "AUTO_TRANSITION";
    }

    private static String getMediaItemTransitionReasonString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "?" : "PLAYLIST_CHANGED" : "SEEK" : "AUTO" : "REPEAT";
    }

    private static String getPlayWhenReadyChangeReasonString(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "?" : "END_OF_MEDIA_ITEM" : "REMOTE" : "AUDIO_BECOMING_NOISY" : "AUDIO_FOCUS_LOSS" : "USER_REQUEST";
    }

    private static String getPlaybackSuppressionReasonString(int i) {
        return i != 0 ? i != 1 ? "?" : "TRANSIENT_AUDIO_FOCUS_LOSS" : "NONE";
    }

    private static String getRepeatModeString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "?" : "ALL" : "ONE" : "OFF";
    }

    private static String getStateString(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "?" : "ENDED" : "READY" : "BUFFERING" : "IDLE";
    }

    private static String getTimelineChangeReasonString(int i) {
        return i != 0 ? i != 1 ? "?" : "SOURCE_UPDATE" : "PLAYLIST_CHANGED";
    }

    private static String getTrackStatusString(boolean z) {
        return z ? "[X]" : "[ ]";
    }

    public void onBandwidthEstimate(AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
    }

    public void onLoadCanceled(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    public void onLoadCompleted(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    public void onLoadStarted(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    static {
        NumberFormat instance = NumberFormat.getInstance(Locale.US);
        TIME_FORMAT = instance;
        instance.setMinimumFractionDigits(2);
        TIME_FORMAT.setMaximumFractionDigits(2);
        TIME_FORMAT.setGroupingUsed(false);
    }

    public EventLogger(MappingTrackSelector mappingTrackSelector) {
        this(mappingTrackSelector, DEFAULT_TAG);
    }

    public EventLogger(MappingTrackSelector mappingTrackSelector, String str) {
        this.trackSelector = mappingTrackSelector;
        this.tag = str;
        this.window = new Timeline.Window();
        this.period = new Timeline.Period();
        this.startTimeMs = SystemClock.elapsedRealtime();
    }

    public void onIsLoadingChanged(AnalyticsListener.EventTime eventTime, boolean z) {
        logd(eventTime, "loading", Boolean.toString(z));
    }

    public void onPlaybackStateChanged(AnalyticsListener.EventTime eventTime, int i) {
        logd(eventTime, "state", getStateString(i));
    }

    public void onPlayWhenReadyChanged(AnalyticsListener.EventTime eventTime, boolean z, int i) {
        String playWhenReadyChangeReasonString = getPlayWhenReadyChangeReasonString(i);
        StringBuilder sb = new StringBuilder(String.valueOf(playWhenReadyChangeReasonString).length() + 7);
        sb.append(z);
        sb.append(", ");
        sb.append(playWhenReadyChangeReasonString);
        logd(eventTime, "playWhenReady", sb.toString());
    }

    public void onPlaybackSuppressionReasonChanged(AnalyticsListener.EventTime eventTime, int i) {
        logd(eventTime, "playbackSuppressionReason", getPlaybackSuppressionReasonString(i));
    }

    public void onIsPlayingChanged(AnalyticsListener.EventTime eventTime, boolean z) {
        logd(eventTime, "isPlaying", Boolean.toString(z));
    }

    public void onRepeatModeChanged(AnalyticsListener.EventTime eventTime, int i) {
        logd(eventTime, "repeatMode", getRepeatModeString(i));
    }

    public void onShuffleModeChanged(AnalyticsListener.EventTime eventTime, boolean z) {
        logd(eventTime, "shuffleModeEnabled", Boolean.toString(z));
    }

    public void onPositionDiscontinuity(AnalyticsListener.EventTime eventTime, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("reason=");
        sb.append(getDiscontinuityReasonString(i));
        sb.append(", PositionInfo:old [");
        sb.append("window=");
        sb.append(positionInfo.windowIndex);
        sb.append(", period=");
        sb.append(positionInfo.periodIndex);
        sb.append(", pos=");
        sb.append(positionInfo.positionMs);
        if (positionInfo.adGroupIndex != -1) {
            sb.append(", contentPos=");
            sb.append(positionInfo.contentPositionMs);
            sb.append(", adGroup=");
            sb.append(positionInfo.adGroupIndex);
            sb.append(", ad=");
            sb.append(positionInfo.adIndexInAdGroup);
        }
        sb.append("], PositionInfo:new [");
        sb.append("window=");
        sb.append(positionInfo2.windowIndex);
        sb.append(", period=");
        sb.append(positionInfo2.periodIndex);
        sb.append(", pos=");
        sb.append(positionInfo2.positionMs);
        if (positionInfo2.adGroupIndex != -1) {
            sb.append(", contentPos=");
            sb.append(positionInfo2.contentPositionMs);
            sb.append(", adGroup=");
            sb.append(positionInfo2.adGroupIndex);
            sb.append(", ad=");
            sb.append(positionInfo2.adIndexInAdGroup);
        }
        sb.append("]");
        logd(eventTime, "positionDiscontinuity", sb.toString());
    }

    public void onPlaybackParametersChanged(AnalyticsListener.EventTime eventTime, PlaybackParameters playbackParameters) {
        logd(eventTime, "playbackParameters", playbackParameters.toString());
    }

    public void onTimelineChanged(AnalyticsListener.EventTime eventTime, int i) {
        int periodCount = eventTime.timeline.getPeriodCount();
        int windowCount = eventTime.timeline.getWindowCount();
        String eventTimeString = getEventTimeString(eventTime);
        String timelineChangeReasonString = getTimelineChangeReasonString(i);
        StringBuilder sb = new StringBuilder(String.valueOf(eventTimeString).length() + 69 + String.valueOf(timelineChangeReasonString).length());
        sb.append("timeline [");
        sb.append(eventTimeString);
        sb.append(", periodCount=");
        sb.append(periodCount);
        sb.append(", windowCount=");
        sb.append(windowCount);
        sb.append(", reason=");
        sb.append(timelineChangeReasonString);
        logd(sb.toString());
        for (int i2 = 0; i2 < Math.min(periodCount, 3); i2++) {
            eventTime.timeline.getPeriod(i2, this.period);
            String timeString = getTimeString(this.period.getDurationMs());
            StringBuilder sb2 = new StringBuilder(String.valueOf(timeString).length() + 11);
            sb2.append("  period [");
            sb2.append(timeString);
            sb2.append("]");
            logd(sb2.toString());
        }
        if (periodCount > 3) {
            logd("  ...");
        }
        for (int i3 = 0; i3 < Math.min(windowCount, 3); i3++) {
            eventTime.timeline.getWindow(i3, this.window);
            String timeString2 = getTimeString(this.window.getDurationMs());
            boolean z = this.window.isSeekable;
            boolean z2 = this.window.isDynamic;
            StringBuilder sb3 = new StringBuilder(String.valueOf(timeString2).length() + 42);
            sb3.append("  window [");
            sb3.append(timeString2);
            sb3.append(", seekable=");
            sb3.append(z);
            sb3.append(", dynamic=");
            sb3.append(z2);
            sb3.append("]");
            logd(sb3.toString());
        }
        if (windowCount > 3) {
            logd("  ...");
        }
        logd("]");
    }

    public void onMediaItemTransition(AnalyticsListener.EventTime eventTime, MediaItem mediaItem, int i) {
        String eventTimeString = getEventTimeString(eventTime);
        String mediaItemTransitionReasonString = getMediaItemTransitionReasonString(i);
        StringBuilder sb = new StringBuilder(String.valueOf(eventTimeString).length() + 21 + String.valueOf(mediaItemTransitionReasonString).length());
        sb.append("mediaItem [");
        sb.append(eventTimeString);
        sb.append(", reason=");
        sb.append(mediaItemTransitionReasonString);
        sb.append("]");
        logd(sb.toString());
    }

    public void onPlayerError(AnalyticsListener.EventTime eventTime, PlaybackException playbackException) {
        loge(eventTime, "playerFailed", playbackException);
    }

    public void onTracksChanged(AnalyticsListener.EventTime eventTime, TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
        String str;
        String str2;
        MappingTrackSelector mappingTrackSelector = this.trackSelector;
        MappingTrackSelector.MappedTrackInfo currentMappedTrackInfo = mappingTrackSelector != null ? mappingTrackSelector.getCurrentMappedTrackInfo() : null;
        if (currentMappedTrackInfo == null) {
            logd(eventTime, "tracks", HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
            return;
        }
        AnalyticsListener.EventTime eventTime2 = eventTime;
        String valueOf = String.valueOf(getEventTimeString(eventTime));
        logd(valueOf.length() != 0 ? "tracks [".concat(valueOf) : new String("tracks ["));
        int rendererCount = currentMappedTrackInfo.getRendererCount();
        int i = 0;
        while (true) {
            str = "    Group:";
            str2 = " [";
            if (i >= rendererCount) {
                break;
            }
            TrackGroupArray trackGroups = currentMappedTrackInfo.getTrackGroups(i);
            TrackSelection trackSelection = trackSelectionArray.get(i);
            int i2 = rendererCount;
            if (trackGroups.length == 0) {
                String rendererName = currentMappedTrackInfo.getRendererName(i);
                StringBuilder sb = new StringBuilder(String.valueOf(rendererName).length() + 5);
                sb.append("  ");
                sb.append(rendererName);
                sb.append(" []");
                logd(sb.toString());
            } else {
                String rendererName2 = currentMappedTrackInfo.getRendererName(i);
                String str3 = "  ]";
                StringBuilder sb2 = new StringBuilder(String.valueOf(rendererName2).length() + 4);
                sb2.append("  ");
                sb2.append(rendererName2);
                sb2.append(str2);
                logd(sb2.toString());
                int i3 = 0;
                while (i3 < trackGroups.length) {
                    TrackGroup trackGroup = trackGroups.get(i3);
                    TrackGroupArray trackGroupArray2 = trackGroups;
                    String adaptiveSupportString = getAdaptiveSupportString(trackGroup.length, currentMappedTrackInfo.getAdaptiveSupport(i, i3, false));
                    StringBuilder sb3 = new StringBuilder(String.valueOf(adaptiveSupportString).length() + 44);
                    sb3.append(str);
                    sb3.append(i3);
                    sb3.append(", adaptive_supported=");
                    sb3.append(adaptiveSupportString);
                    sb3.append(str2);
                    logd(sb3.toString());
                    int i4 = 0;
                    while (i4 < trackGroup.length) {
                        String trackStatusString = getTrackStatusString(trackSelection, trackGroup, i4);
                        String formatSupportString = C5429C.getFormatSupportString(currentMappedTrackInfo.getTrackSupport(i, i3, i4));
                        TrackGroup trackGroup2 = trackGroup;
                        String logString = Format.toLogString(trackGroup.getFormat(i4));
                        String str4 = str;
                        StringBuilder sb4 = new StringBuilder(String.valueOf(trackStatusString).length() + 38 + String.valueOf(logString).length() + String.valueOf(formatSupportString).length());
                        sb4.append("      ");
                        sb4.append(trackStatusString);
                        sb4.append(" Track:");
                        sb4.append(i4);
                        sb4.append(", ");
                        sb4.append(logString);
                        sb4.append(", supported=");
                        sb4.append(formatSupportString);
                        logd(sb4.toString());
                        i4++;
                        str = str4;
                        trackGroup = trackGroup2;
                        str2 = str2;
                    }
                    String str5 = str;
                    String str6 = str2;
                    logd("    ]");
                    i3++;
                    trackGroups = trackGroupArray2;
                }
                if (trackSelection != null) {
                    int i5 = 0;
                    while (true) {
                        if (i5 >= trackSelection.length()) {
                            break;
                        }
                        Metadata metadata = trackSelection.getFormat(i5).metadata;
                        if (metadata != null) {
                            logd("    Metadata [");
                            printMetadata(metadata, "      ");
                            logd("    ]");
                            break;
                        }
                        i5++;
                    }
                }
                logd(str3);
            }
            i++;
            rendererCount = i2;
        }
        String str7 = str;
        String str8 = "  ]";
        String str9 = str2;
        TrackGroupArray unmappedTrackGroups = currentMappedTrackInfo.getUnmappedTrackGroups();
        if (unmappedTrackGroups.length > 0) {
            logd("  Unmapped [");
            int i6 = 0;
            while (i6 < unmappedTrackGroups.length) {
                StringBuilder sb5 = new StringBuilder(23);
                String str10 = str7;
                sb5.append(str10);
                sb5.append(i6);
                String str11 = str9;
                sb5.append(str11);
                logd(sb5.toString());
                TrackGroup trackGroup3 = unmappedTrackGroups.get(i6);
                int i7 = 0;
                while (i7 < trackGroup3.length) {
                    String trackStatusString2 = getTrackStatusString(false);
                    String formatSupportString2 = C5429C.getFormatSupportString(0);
                    String logString2 = Format.toLogString(trackGroup3.getFormat(i7));
                    String str12 = str10;
                    StringBuilder sb6 = new StringBuilder(String.valueOf(trackStatusString2).length() + 38 + String.valueOf(logString2).length() + String.valueOf(formatSupportString2).length());
                    sb6.append("      ");
                    sb6.append(trackStatusString2);
                    sb6.append(" Track:");
                    sb6.append(i7);
                    sb6.append(", ");
                    sb6.append(logString2);
                    sb6.append(", supported=");
                    sb6.append(formatSupportString2);
                    logd(sb6.toString());
                    i7++;
                    unmappedTrackGroups = unmappedTrackGroups;
                    str10 = str12;
                }
                TrackGroupArray trackGroupArray3 = unmappedTrackGroups;
                str7 = str10;
                logd("    ]");
                i6++;
                str9 = str11;
            }
            logd(str8);
        }
        logd("]");
    }

    public void onMetadata(AnalyticsListener.EventTime eventTime, Metadata metadata) {
        String valueOf = String.valueOf(getEventTimeString(eventTime));
        logd(valueOf.length() != 0 ? "metadata [".concat(valueOf) : new String("metadata ["));
        printMetadata(metadata, "  ");
        logd("]");
    }

    public void onAudioEnabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        logd(eventTime, "audioEnabled");
    }

    public void onAudioDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j) {
        logd(eventTime, "audioDecoderInitialized", str);
    }

    public void onAudioInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        logd(eventTime, "audioInputFormat", Format.toLogString(format));
    }

    public void onAudioUnderrun(AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
        StringBuilder sb = new StringBuilder(55);
        sb.append(i);
        sb.append(", ");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        loge(eventTime, "audioTrackUnderrun", sb.toString(), (Throwable) null);
    }

    public void onAudioDecoderReleased(AnalyticsListener.EventTime eventTime, String str) {
        logd(eventTime, "audioDecoderReleased", str);
    }

    public void onAudioDisabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        logd(eventTime, "audioDisabled");
    }

    public void onAudioSessionIdChanged(AnalyticsListener.EventTime eventTime, int i) {
        logd(eventTime, "audioSessionId", Integer.toString(i));
    }

    public void onAudioAttributesChanged(AnalyticsListener.EventTime eventTime, AudioAttributes audioAttributes) {
        int i = audioAttributes.contentType;
        int i2 = audioAttributes.flags;
        int i3 = audioAttributes.usage;
        int i4 = audioAttributes.allowedCapturePolicy;
        StringBuilder sb = new StringBuilder(47);
        sb.append(i);
        sb.append(",");
        sb.append(i2);
        sb.append(",");
        sb.append(i3);
        sb.append(",");
        sb.append(i4);
        logd(eventTime, "audioAttributes", sb.toString());
    }

    public void onSkipSilenceEnabledChanged(AnalyticsListener.EventTime eventTime, boolean z) {
        logd(eventTime, "skipSilenceEnabled", Boolean.toString(z));
    }

    public void onVolumeChanged(AnalyticsListener.EventTime eventTime, float f) {
        logd(eventTime, TapjoyConstants.TJC_VOLUME, Float.toString(f));
    }

    public void onVideoEnabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        logd(eventTime, "videoEnabled");
    }

    public void onVideoDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j) {
        logd(eventTime, "videoDecoderInitialized", str);
    }

    public void onVideoInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        logd(eventTime, "videoInputFormat", Format.toLogString(format));
    }

    public void onDroppedVideoFrames(AnalyticsListener.EventTime eventTime, int i, long j) {
        logd(eventTime, "droppedFrames", Integer.toString(i));
    }

    public void onVideoDecoderReleased(AnalyticsListener.EventTime eventTime, String str) {
        logd(eventTime, "videoDecoderReleased", str);
    }

    public void onVideoDisabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        logd(eventTime, "videoDisabled");
    }

    public void onRenderedFirstFrame(AnalyticsListener.EventTime eventTime, Object obj, long j) {
        logd(eventTime, "renderedFirstFrame", String.valueOf(obj));
    }

    public void onVideoSizeChanged(AnalyticsListener.EventTime eventTime, VideoSize videoSize) {
        int i = videoSize.width;
        int i2 = videoSize.height;
        StringBuilder sb = new StringBuilder(24);
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        logd(eventTime, "videoSize", sb.toString());
    }

    public void onLoadError(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        printInternalError(eventTime, "loadError", iOException);
    }

    public void onSurfaceSizeChanged(AnalyticsListener.EventTime eventTime, int i, int i2) {
        StringBuilder sb = new StringBuilder(24);
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        logd(eventTime, "surfaceSize", sb.toString());
    }

    public void onUpstreamDiscarded(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
        logd(eventTime, "upstreamDiscarded", Format.toLogString(mediaLoadData.trackFormat));
    }

    public void onDownstreamFormatChanged(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
        logd(eventTime, "downstreamFormat", Format.toLogString(mediaLoadData.trackFormat));
    }

    public void onDrmSessionAcquired(AnalyticsListener.EventTime eventTime, int i) {
        StringBuilder sb = new StringBuilder(17);
        sb.append("state=");
        sb.append(i);
        logd(eventTime, "drmSessionAcquired", sb.toString());
    }

    public void onDrmSessionManagerError(AnalyticsListener.EventTime eventTime, Exception exc) {
        printInternalError(eventTime, "drmSessionManagerError", exc);
    }

    public void onDrmKeysRestored(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "drmKeysRestored");
    }

    public void onDrmKeysRemoved(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "drmKeysRemoved");
    }

    public void onDrmKeysLoaded(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "drmKeysLoaded");
    }

    public void onDrmSessionReleased(AnalyticsListener.EventTime eventTime) {
        logd(eventTime, "drmSessionReleased");
    }

    /* access modifiers changed from: protected */
    public void logd(String str) {
        Log.m16690d(this.tag, str);
    }

    /* access modifiers changed from: protected */
    public void loge(String str) {
        Log.m16692e(this.tag, str);
    }

    private void logd(AnalyticsListener.EventTime eventTime, String str) {
        logd(getEventString(eventTime, str, (String) null, (Throwable) null));
    }

    private void logd(AnalyticsListener.EventTime eventTime, String str, String str2) {
        logd(getEventString(eventTime, str, str2, (Throwable) null));
    }

    private void loge(AnalyticsListener.EventTime eventTime, String str, Throwable th) {
        loge(getEventString(eventTime, str, (String) null, th));
    }

    private void loge(AnalyticsListener.EventTime eventTime, String str, String str2, Throwable th) {
        loge(getEventString(eventTime, str, str2, th));
    }

    private void printInternalError(AnalyticsListener.EventTime eventTime, String str, Exception exc) {
        loge(eventTime, "internalError", str, exc);
    }

    private void printMetadata(Metadata metadata, String str) {
        for (int i = 0; i < metadata.length(); i++) {
            String valueOf = String.valueOf(metadata.get(i));
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + String.valueOf(valueOf).length());
            sb.append(str);
            sb.append(valueOf);
            logd(sb.toString());
        }
    }

    private String getEventString(AnalyticsListener.EventTime eventTime, String str, String str2, Throwable th) {
        String eventTimeString = getEventTimeString(eventTime);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(eventTimeString).length());
        sb.append(str);
        sb.append(" [");
        sb.append(eventTimeString);
        String sb2 = sb.toString();
        if (th instanceof PlaybackException) {
            String valueOf = String.valueOf(sb2);
            String errorCodeName = ((PlaybackException) th).getErrorCodeName();
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 12 + String.valueOf(errorCodeName).length());
            sb3.append(valueOf);
            sb3.append(", errorCode=");
            sb3.append(errorCodeName);
            sb2 = sb3.toString();
        }
        if (str2 != null) {
            String valueOf2 = String.valueOf(sb2);
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf2).length() + 2 + String.valueOf(str2).length());
            sb4.append(valueOf2);
            sb4.append(", ");
            sb4.append(str2);
            sb2 = sb4.toString();
        }
        String throwableString = Log.getThrowableString(th);
        if (!TextUtils.isEmpty(throwableString)) {
            String valueOf3 = String.valueOf(sb2);
            String replace = throwableString.replace("\n", "\n  ");
            StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf3).length() + 4 + String.valueOf(replace).length());
            sb5.append(valueOf3);
            sb5.append("\n  ");
            sb5.append(replace);
            sb5.append(10);
            sb2 = sb5.toString();
        }
        return String.valueOf(sb2).concat("]");
    }

    private String getEventTimeString(AnalyticsListener.EventTime eventTime) {
        int i = eventTime.windowIndex;
        StringBuilder sb = new StringBuilder(18);
        sb.append("window=");
        sb.append(i);
        String sb2 = sb.toString();
        if (eventTime.mediaPeriodId != null) {
            String valueOf = String.valueOf(sb2);
            int indexOfPeriod = eventTime.timeline.getIndexOfPeriod(eventTime.mediaPeriodId.periodUid);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb3.append(valueOf);
            sb3.append(", period=");
            sb3.append(indexOfPeriod);
            sb2 = sb3.toString();
            if (eventTime.mediaPeriodId.isAd()) {
                String valueOf2 = String.valueOf(sb2);
                int i2 = eventTime.mediaPeriodId.adGroupIndex;
                StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf2).length() + 21);
                sb4.append(valueOf2);
                sb4.append(", adGroup=");
                sb4.append(i2);
                String valueOf3 = String.valueOf(sb4.toString());
                int i3 = eventTime.mediaPeriodId.adIndexInAdGroup;
                StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf3).length() + 16);
                sb5.append(valueOf3);
                sb5.append(", ad=");
                sb5.append(i3);
                sb2 = sb5.toString();
            }
        }
        String timeString = getTimeString(eventTime.realtimeMs - this.startTimeMs);
        String timeString2 = getTimeString(eventTime.eventPlaybackPositionMs);
        StringBuilder sb6 = new StringBuilder(String.valueOf(timeString).length() + 23 + String.valueOf(timeString2).length() + String.valueOf(sb2).length());
        sb6.append("eventTime=");
        sb6.append(timeString);
        sb6.append(", mediaPos=");
        sb6.append(timeString2);
        sb6.append(", ");
        sb6.append(sb2);
        return sb6.toString();
    }

    private static String getTimeString(long j) {
        return j == -9223372036854775807L ? "?" : TIME_FORMAT.format((double) (((float) j) / 1000.0f));
    }

    private static String getAdaptiveSupportString(int i, int i2) {
        if (i < 2) {
            return "N/A";
        }
        if (i2 == 0) {
            return "NO";
        }
        if (i2 == 8) {
            return "YES_NOT_SEAMLESS";
        }
        if (i2 == 16) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    private static String getTrackStatusString(TrackSelection trackSelection, TrackGroup trackGroup, int i) {
        return getTrackStatusString((trackSelection == null || trackSelection.getTrackGroup() != trackGroup || trackSelection.indexOf(i) == -1) ? false : true);
    }
}
