package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import com.fyber.inneractive.sdk.player.exoplayer2.C4639d;
import com.fyber.inneractive.sdk.player.exoplayer2.C4811i;
import com.fyber.inneractive.sdk.player.exoplayer2.C4816m;
import com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener;
import com.fyber.inneractive.sdk.player.exoplayer2.audio.C4623c;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C4650c;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C4651d;
import com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C4817a;
import com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C4818b;
import com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C4820c;
import com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C4822d;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4972g;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

public class MediaCodecAudioRenderer extends C4818b implements C4972g {

    /* renamed from: V */
    public final AudioRendererEventListener.EventDispatcher f11489V;

    /* renamed from: W */
    public final C4623c f11490W;

    /* renamed from: X */
    public boolean f11491X;

    /* renamed from: Y */
    public int f11492Y;

    /* renamed from: Z */
    public int f11493Z;

    /* renamed from: a0 */
    public long f11494a0;

    /* renamed from: b0 */
    public boolean f11495b0;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.MediaCodecAudioRenderer$b */
    public final class C4619b implements C4623c.C4629f {
        public C4619b() {
        }
    }

    public MediaCodecAudioRenderer(C4820c cVar, C4650c<C4651d> cVar2, boolean z, Handler handler, AudioRendererEventListener audioRendererEventListener) {
        this(cVar, cVar2, z, (Handler) null, (AudioRendererEventListener) null, new C4621b[0]);
    }

    /* renamed from: b */
    public boolean mo24981b() {
        if (this.f12803Q) {
            C4623c cVar = this.f11490W;
            if (!cVar.mo25007e() || (cVar.f11527X && !cVar.mo25006d())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public C4816m mo24982i() {
        return this.f11490W.f11551s;
    }

    public boolean isReady() {
        return this.f11490W.mo25006d() || super.isReady();
    }

    /* renamed from: j */
    public C4972g mo24946j() {
        return this;
    }

    /* renamed from: o */
    public long mo24984o() {
        long j;
        long j2;
        long j3;
        long j4;
        C4623c cVar = this.f11490W;
        boolean b = mo24981b();
        if (!(cVar.mo25007e() && cVar.f11515L != 0)) {
            j2 = Long.MIN_VALUE;
            j = Long.MIN_VALUE;
        } else {
            if (cVar.f11541i.getPlayState() == 3) {
                C4623c.C4625b bVar = cVar.f11539g;
                long a = (bVar.mo25015a() * 1000000) / ((long) bVar.f11563c);
                if (a != 0) {
                    long nanoTime = System.nanoTime() / 1000;
                    if (nanoTime - cVar.f11504A >= 30000) {
                        long[] jArr = cVar.f11538f;
                        int i = cVar.f11556x;
                        jArr[i] = a - nanoTime;
                        cVar.f11556x = (i + 1) % 10;
                        int i2 = cVar.f11557y;
                        if (i2 < 10) {
                            cVar.f11557y = i2 + 1;
                        }
                        cVar.f11504A = nanoTime;
                        cVar.f11558z = 0;
                        int i3 = 0;
                        while (true) {
                            int i4 = cVar.f11557y;
                            if (i3 >= i4) {
                                break;
                            }
                            cVar.f11558z += cVar.f11538f[i3] / ((long) i4);
                            i3++;
                        }
                    }
                    if (!cVar.mo25008f() && nanoTime - cVar.f11506C >= 500000) {
                        boolean d = cVar.f11539g.mo25019d();
                        cVar.f11505B = d;
                        if (d) {
                            long c = cVar.f11539g.mo25018c() / 1000;
                            long b2 = cVar.f11539g.mo25017b();
                            if (c < cVar.f11517N) {
                                cVar.f11505B = false;
                            } else if (Math.abs(c - nanoTime) > 5000000) {
                                Log.w("AudioTrack", "Spurious audio timestamp (system clock mismatch): " + b2 + ", " + c + ", " + nanoTime + ", " + a + ", " + cVar.mo25001b() + ", " + cVar.mo25004c());
                                cVar.f11505B = false;
                            } else {
                                long j5 = b2;
                                if (Math.abs(cVar.mo25002b(j5) - a) > 5000000) {
                                    Log.w("AudioTrack", "Spurious audio timestamp (frame position mismatch): " + j5 + ", " + c + ", " + nanoTime + ", " + a + ", " + cVar.mo25001b() + ", " + cVar.mo25004c());
                                    cVar.f11505B = false;
                                }
                            }
                        }
                        Method method = cVar.f11507D;
                        if (method != null && !cVar.f11547o) {
                            try {
                                long intValue = (((long) ((Integer) method.invoke(cVar.f11541i, (Object[]) null)).intValue()) * 1000) - cVar.f11549q;
                                cVar.f11518O = intValue;
                                long max = Math.max(intValue, 0);
                                cVar.f11518O = max;
                                if (max > 5000000) {
                                    Log.w("AudioTrack", "Ignoring impossibly large audio latency: " + cVar.f11518O);
                                    cVar.f11518O = 0;
                                }
                            } catch (Exception unused) {
                                cVar.f11507D = null;
                            }
                        }
                        cVar.f11506C = nanoTime;
                    }
                }
            }
            long nanoTime2 = System.nanoTime() / 1000;
            if (cVar.f11505B) {
                j3 = cVar.mo25002b(cVar.f11539g.mo25017b() + cVar.mo24996a(nanoTime2 - (cVar.f11539g.mo25018c() / 1000)));
            } else {
                if (cVar.f11557y == 0) {
                    C4623c.C4625b bVar2 = cVar.f11539g;
                    j3 = (bVar2.mo25015a() * 1000000) / ((long) bVar2.f11563c);
                } else {
                    j3 = nanoTime2 + cVar.f11558z;
                }
                if (!b) {
                    j3 -= cVar.f11518O;
                }
            }
            long j6 = cVar.f11516M;
            while (!cVar.f11540h.isEmpty() && j3 >= cVar.f11540h.getFirst().f11576c) {
                C4623c.C4630g remove = cVar.f11540h.remove();
                cVar.f11551s = remove.f11574a;
                cVar.f11553u = remove.f11576c;
                cVar.f11552t = remove.f11575b - cVar.f11516M;
            }
            if (cVar.f11551s.f12778a == 1.0f) {
                j4 = (j3 + cVar.f11552t) - cVar.f11553u;
            } else {
                if (cVar.f11540h.isEmpty()) {
                    C4636h hVar = cVar.f11532b;
                    long j7 = hVar.f11627k;
                    if (j7 >= 1024) {
                        j4 = cVar.f11552t + C4991u.m15135a(j3 - cVar.f11553u, hVar.f11626j, j7);
                    }
                }
                j4 = cVar.f11552t + ((long) (((double) cVar.f11551s.f12778a) * ((double) (j3 - cVar.f11553u))));
            }
            j = j6 + j4;
            j2 = Long.MIN_VALUE;
        }
        if (j != j2) {
            if (!this.f11495b0) {
                j = Math.max(this.f11494a0, j);
            }
            this.f11494a0 = j;
            this.f11495b0 = false;
        }
        return this.f11494a0;
    }

    /* renamed from: p */
    public void mo24951p() {
        try {
            C4623c cVar = this.f11490W;
            cVar.mo25010h();
            for (C4621b g : cVar.f11534c) {
                g.mo24995g();
            }
            cVar.f11529Z = 0;
            cVar.f11528Y = false;
            try {
                super.mo24951p();
            } finally {
                this.f12806T.ensureUpdated();
                this.f11489V.disabled(this.f12806T);
            }
        } catch (Throwable th) {
            super.mo24951p();
            throw th;
        } finally {
            this.f12806T.ensureUpdated();
            this.f11489V.disabled(this.f12806T);
        }
    }

    /* renamed from: q */
    public void mo24952q() {
        this.f11490W.mo25009g();
    }

    /* renamed from: r */
    public void mo24953r() {
        C4623c cVar = this.f11490W;
        cVar.f11528Y = false;
        if (cVar.mo25007e()) {
            cVar.mo25012j();
            C4623c.C4625b bVar = cVar.f11539g;
            if (bVar.f11567g == -9223372036854775807L) {
                bVar.f11561a.pause();
            }
        }
    }

    /* renamed from: w */
    public void mo24985w() throws C4639d {
        try {
            C4623c cVar = this.f11490W;
            if (cVar.f11527X) {
                return;
            }
            if (cVar.mo25007e()) {
                if (cVar.mo24999a()) {
                    C4623c.C4625b bVar = cVar.f11539g;
                    long c = cVar.mo25004c();
                    bVar.f11568h = bVar.mo25015a();
                    bVar.f11567g = SystemClock.elapsedRealtime() * 1000;
                    bVar.f11569i = c;
                    bVar.f11561a.stop();
                    cVar.f11555w = 0;
                    cVar.f11527X = true;
                }
            }
        } catch (C4623c.C4631h e) {
            throw C4639d.m14206a(e, this.f11467c);
        }
    }

    public MediaCodecAudioRenderer(C4820c cVar, C4650c cVar2, boolean z, Handler handler, AudioRendererEventListener audioRendererEventListener, C4621b... bVarArr) {
        super(1, cVar, cVar2, z);
        this.f11490W = new C4623c(bVarArr, new C4619b());
        this.f11489V = new AudioRendererEventListener.EventDispatcher(handler, audioRendererEventListener);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005c, code lost:
        if (r4 == false) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x013f, code lost:
        if (r10 == false) goto L_0x0142;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo24972a(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C4820c r10, com.fyber.inneractive.sdk.player.exoplayer2.C4811i r11) throws com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C4822d.C4824b {
        /*
            r9 = this;
            java.lang.String r0 = r11.f12755f
            boolean r1 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4973h.m15065d(r0)
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.f13270a
            r3 = 16
            r4 = 21
            if (r1 < r4) goto L_0x0014
            r5 = r3
            goto L_0x0015
        L_0x0014:
            r5 = r2
        L_0x0015:
            com.fyber.inneractive.sdk.player.exoplayer2.audio.c r6 = r9.f11490W
            r6.getClass()
            com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a r10 = r10.mo25320a(r0, r2)
            r0 = 1
            if (r10 != 0) goto L_0x0022
            return r0
        L_0x0022:
            if (r1 < r4) goto L_0x0141
            int r4 = r11.f12768s
            r6 = -1
            if (r4 == r6) goto L_0x005e
            android.media.MediaCodecInfo$CodecCapabilities r7 = r10.f12785e
            if (r7 != 0) goto L_0x0034
            java.lang.String r4 = "sampleRate.caps"
            r10.mo25310a((java.lang.String) r4)
        L_0x0032:
            r4 = r2
            goto L_0x005c
        L_0x0034:
            android.media.MediaCodecInfo$AudioCapabilities r7 = r7.getAudioCapabilities()
            if (r7 != 0) goto L_0x0040
            java.lang.String r4 = "sampleRate.aCaps"
            r10.mo25310a((java.lang.String) r4)
            goto L_0x0032
        L_0x0040:
            boolean r7 = r7.isSampleRateSupported(r4)
            if (r7 != 0) goto L_0x005b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "sampleRate.support, "
            r7.append(r8)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            r10.mo25310a((java.lang.String) r4)
            goto L_0x0032
        L_0x005b:
            r4 = r0
        L_0x005c:
            if (r4 == 0) goto L_0x0142
        L_0x005e:
            int r11 = r11.f12767r
            if (r11 == r6) goto L_0x0141
            android.media.MediaCodecInfo$CodecCapabilities r4 = r10.f12785e
            if (r4 != 0) goto L_0x006e
            java.lang.String r11 = "channelCount.caps"
            r10.mo25310a((java.lang.String) r11)
        L_0x006b:
            r10 = r2
            goto L_0x013f
        L_0x006e:
            android.media.MediaCodecInfo$AudioCapabilities r4 = r4.getAudioCapabilities()
            if (r4 != 0) goto L_0x007a
            java.lang.String r11 = "channelCount.aCaps"
            r10.mo25310a((java.lang.String) r11)
            goto L_0x006b
        L_0x007a:
            java.lang.String r6 = r10.f12781a
            java.lang.String r7 = r10.f12784d
            int r4 = r4.getMaxInputChannelCount()
            if (r4 > r0) goto L_0x0126
            r8 = 26
            if (r1 < r8) goto L_0x008c
            if (r4 <= 0) goto L_0x008c
            goto L_0x0126
        L_0x008c:
            java.lang.String r1 = "audio/mpeg"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0126
            java.lang.String r1 = "audio/3gpp"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0126
            java.lang.String r1 = "audio/amr-wb"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0126
            java.lang.String r1 = "audio/mp4a-latm"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0126
            java.lang.String r1 = "audio/vorbis"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0126
            java.lang.String r1 = "audio/opus"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0126
            java.lang.String r1 = "audio/raw"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0126
            java.lang.String r1 = "audio/flac"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0126
            java.lang.String r1 = "audio/g711-alaw"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0126
            java.lang.String r1 = "audio/g711-mlaw"
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0126
            java.lang.String r1 = "audio/gsm"
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x00e5
            goto L_0x0126
        L_0x00e5:
            java.lang.String r1 = "audio/ac3"
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x00ef
            r3 = 6
            goto L_0x00fa
        L_0x00ef:
            java.lang.String r1 = "audio/eac3"
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x00f8
            goto L_0x00fa
        L_0x00f8:
            r3 = 30
        L_0x00fa:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r7 = "AssumedMaxChannelAdjustment: "
            r1.append(r7)
            r1.append(r6)
            java.lang.String r6 = ", ["
            r1.append(r6)
            r1.append(r4)
            java.lang.String r4 = " to "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r4 = "]"
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r4 = "MediaCodecInfo"
            android.util.Log.w(r4, r1)
            r4 = r3
        L_0x0126:
            if (r4 >= r11) goto L_0x013e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "channelCount.support, "
            r1.append(r3)
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r10.mo25310a((java.lang.String) r11)
            goto L_0x006b
        L_0x013e:
            r10 = r0
        L_0x013f:
            if (r10 == 0) goto L_0x0142
        L_0x0141:
            r2 = r0
        L_0x0142:
            if (r2 == 0) goto L_0x0146
            r10 = 3
            goto L_0x0147
        L_0x0146:
            r10 = 2
        L_0x0147:
            r11 = r5 | 4
            r10 = r10 | r11
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.MediaCodecAudioRenderer.mo24972a(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c, com.fyber.inneractive.sdk.player.exoplayer2.i):int");
    }

    /* renamed from: a */
    public C4817a mo24974a(C4820c cVar, C4811i iVar, boolean z) throws C4822d.C4824b {
        String str = iVar.f12755f;
        this.f11490W.getClass();
        return cVar.mo25320a(iVar.f12755f, z);
    }

    /* renamed from: a */
    public void mo24978a(C4817a aVar, MediaCodec mediaCodec, C4811i iVar, MediaCrypto mediaCrypto) {
        boolean z;
        String str = aVar.f12781a;
        if (C4991u.f13270a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(C4991u.f13272c)) {
            String str2 = C4991u.f13271b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                z = true;
                this.f11491X = z;
                mediaCodec.configure(iVar.mo25298a(), (Surface) null, (MediaCrypto) null, 0);
            }
        }
        z = false;
        this.f11491X = z;
        mediaCodec.configure(iVar.mo25298a(), (Surface) null, (MediaCrypto) null, 0);
    }

    /* renamed from: a */
    public void mo24979a(String str, long j, long j2) {
        this.f11489V.decoderInitialized(str, j, j2);
    }

    /* renamed from: a */
    public void mo24977a(C4811i iVar) throws C4639d {
        super.mo24977a(iVar);
        this.f11489V.inputFormatChanged(iVar);
        this.f11492Y = "audio/raw".equals(iVar.f12755f) ? iVar.f12769t : 2;
        this.f11493Z = iVar.f12767r;
    }

    /* renamed from: a */
    public void mo24976a(MediaCodec mediaCodec, MediaFormat mediaFormat) throws C4639d {
        int[] iArr;
        int i;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (!this.f11491X || integer != 6 || (i = this.f11493Z) >= 6) {
            iArr = null;
        } else {
            iArr = new int[i];
            for (int i2 = 0; i2 < this.f11493Z; i2++) {
                iArr[i2] = i2;
            }
        }
        try {
            this.f11490W.mo24998a("audio/raw", integer, integer2, this.f11492Y, 0, iArr);
        } catch (C4623c.C4627d e) {
            throw C4639d.m14206a(e, this.f11467c);
        }
    }

    /* renamed from: a */
    public void mo24935a(long j, boolean z) throws C4639d {
        super.mo24935a(j, z);
        this.f11490W.mo25010h();
        this.f11494a0 = j;
        this.f11495b0 = true;
    }

    /* renamed from: a */
    public C4816m mo24973a(C4816m mVar) {
        return this.f11490W.mo24997a(mVar);
    }

    /* renamed from: a */
    public boolean mo24980a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws C4639d {
        if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.f12806T.skippedOutputBufferCount++;
            C4623c cVar = this.f11490W;
            if (cVar.f11515L == 1) {
                cVar.f11515L = 2;
            }
            return true;
        }
        try {
            if (!this.f11490W.mo25000a(byteBuffer, j3)) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i, false);
            this.f12806T.renderedOutputBufferCount++;
            return true;
        } catch (C4623c.C4628e | C4623c.C4631h e) {
            throw C4639d.m14206a(e, this.f11467c);
        }
    }

    /* renamed from: a */
    public void mo24937a(boolean z) throws C4639d {
        DecoderCounters decoderCounters = new DecoderCounters();
        this.f12806T = decoderCounters;
        this.f11489V.enabled(decoderCounters);
        int i = this.f11466b.f12874a;
        boolean z2 = false;
        if (i != 0) {
            C4623c cVar = this.f11490W;
            cVar.getClass();
            if (C4991u.f13270a >= 21) {
                z2 = true;
            }
            C4965a.m15051b(z2);
            if (!cVar.f11531a0 || cVar.f11529Z != i) {
                cVar.f11531a0 = true;
                cVar.f11529Z = i;
                cVar.mo25010h();
                return;
            }
            return;
        }
        C4623c cVar2 = this.f11490W;
        if (cVar2.f11531a0) {
            cVar2.f11531a0 = false;
            cVar2.f11529Z = 0;
            cVar2.mo25010h();
        }
    }

    /* renamed from: a */
    public void mo24975a(int i, Object obj) throws C4639d {
        if (i == 2) {
            C4623c cVar = this.f11490W;
            float floatValue = ((Float) obj).floatValue();
            if (cVar.f11519P != floatValue) {
                cVar.f11519P = floatValue;
                cVar.mo25013k();
            }
        } else if (i == 3) {
            int intValue = ((Integer) obj).intValue();
            C4623c cVar2 = this.f11490W;
            if (cVar2.f11546n != intValue) {
                cVar2.f11546n = intValue;
                if (!cVar2.f11531a0) {
                    cVar2.mo25010h();
                    cVar2.f11529Z = 0;
                }
            }
        }
    }
}
