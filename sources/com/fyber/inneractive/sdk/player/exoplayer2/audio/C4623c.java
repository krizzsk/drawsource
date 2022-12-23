package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.C4637b;
import com.fyber.inneractive.sdk.player.exoplayer2.C4816m;
import com.fyber.inneractive.sdk.player.exoplayer2.audio.MediaCodecAudioRenderer;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.c */
public final class C4623c {

    /* renamed from: A */
    public long f11504A;

    /* renamed from: B */
    public boolean f11505B;

    /* renamed from: C */
    public long f11506C;

    /* renamed from: D */
    public Method f11507D;

    /* renamed from: E */
    public int f11508E;

    /* renamed from: F */
    public long f11509F;

    /* renamed from: G */
    public long f11510G;

    /* renamed from: H */
    public int f11511H;

    /* renamed from: I */
    public long f11512I;

    /* renamed from: J */
    public long f11513J;

    /* renamed from: K */
    public int f11514K;

    /* renamed from: L */
    public int f11515L;

    /* renamed from: M */
    public long f11516M;

    /* renamed from: N */
    public long f11517N;

    /* renamed from: O */
    public long f11518O;

    /* renamed from: P */
    public float f11519P;

    /* renamed from: Q */
    public C4621b[] f11520Q;

    /* renamed from: R */
    public ByteBuffer[] f11521R;

    /* renamed from: S */
    public ByteBuffer f11522S;

    /* renamed from: T */
    public ByteBuffer f11523T;

    /* renamed from: U */
    public byte[] f11524U;

    /* renamed from: V */
    public int f11525V;

    /* renamed from: W */
    public int f11526W;

    /* renamed from: X */
    public boolean f11527X;

    /* renamed from: Y */
    public boolean f11528Y;

    /* renamed from: Z */
    public int f11529Z;

    /* renamed from: a */
    public final C4632d f11530a;

    /* renamed from: a0 */
    public boolean f11531a0;

    /* renamed from: b */
    public final C4636h f11532b;

    /* renamed from: b0 */
    public boolean f11533b0;

    /* renamed from: c */
    public final C4621b[] f11534c;

    /* renamed from: c0 */
    public long f11535c0;

    /* renamed from: d */
    public final C4629f f11536d;

    /* renamed from: e */
    public final ConditionVariable f11537e = new ConditionVariable(true);

    /* renamed from: f */
    public final long[] f11538f;

    /* renamed from: g */
    public final C4625b f11539g;

    /* renamed from: h */
    public final LinkedList<C4630g> f11540h;

    /* renamed from: i */
    public AudioTrack f11541i;

    /* renamed from: j */
    public int f11542j;

    /* renamed from: k */
    public int f11543k;

    /* renamed from: l */
    public int f11544l;

    /* renamed from: m */
    public int f11545m;

    /* renamed from: n */
    public int f11546n;

    /* renamed from: o */
    public boolean f11547o;

    /* renamed from: p */
    public int f11548p;

    /* renamed from: q */
    public long f11549q;

    /* renamed from: r */
    public C4816m f11550r;

    /* renamed from: s */
    public C4816m f11551s;

    /* renamed from: t */
    public long f11552t;

    /* renamed from: u */
    public long f11553u;

    /* renamed from: v */
    public ByteBuffer f11554v;

    /* renamed from: w */
    public int f11555w;

    /* renamed from: x */
    public int f11556x;

    /* renamed from: y */
    public int f11557y;

    /* renamed from: z */
    public long f11558z;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.c$a */
    public class C4624a extends Thread {

        /* renamed from: a */
        public final /* synthetic */ AudioTrack f11559a;

        public C4624a(AudioTrack audioTrack) {
            this.f11559a = audioTrack;
        }

        public void run() {
            try {
                this.f11559a.flush();
                this.f11559a.release();
            } finally {
                C4623c.this.f11537e.open();
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.c$b */
    public static class C4625b {

        /* renamed from: a */
        public AudioTrack f11561a;

        /* renamed from: b */
        public boolean f11562b;

        /* renamed from: c */
        public int f11563c;

        /* renamed from: d */
        public long f11564d;

        /* renamed from: e */
        public long f11565e;

        /* renamed from: f */
        public long f11566f;

        /* renamed from: g */
        public long f11567g;

        /* renamed from: h */
        public long f11568h;

        /* renamed from: i */
        public long f11569i;

        public C4625b() {
        }

        /* renamed from: a */
        public void mo25016a(AudioTrack audioTrack, boolean z) {
            this.f11561a = audioTrack;
            this.f11562b = z;
            this.f11567g = -9223372036854775807L;
            this.f11564d = 0;
            this.f11565e = 0;
            this.f11566f = 0;
            if (audioTrack != null) {
                this.f11563c = audioTrack.getSampleRate();
            }
        }

        /* renamed from: b */
        public long mo25017b() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public long mo25018c() {
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public boolean mo25019d() {
            return false;
        }

        public /* synthetic */ C4625b(C4624a aVar) {
            this();
        }

        /* renamed from: a */
        public long mo25015a() {
            if (this.f11567g != -9223372036854775807L) {
                return Math.min(this.f11569i, this.f11568h + ((((SystemClock.elapsedRealtime() * 1000) - this.f11567g) * ((long) this.f11563c)) / 1000000));
            }
            int playState = this.f11561a.getPlayState();
            if (playState == 1) {
                return 0;
            }
            long playbackHeadPosition = ((long) this.f11561a.getPlaybackHeadPosition()) & 4294967295L;
            if (this.f11562b) {
                if (playState == 2 && playbackHeadPosition == 0) {
                    this.f11566f = this.f11564d;
                }
                playbackHeadPosition += this.f11566f;
            }
            if (this.f11564d > playbackHeadPosition) {
                this.f11565e++;
            }
            this.f11564d = playbackHeadPosition;
            return playbackHeadPosition + (this.f11565e << 32);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.c$c */
    public static class C4626c extends C4625b {

        /* renamed from: j */
        public final AudioTimestamp f11570j = new AudioTimestamp();

        /* renamed from: k */
        public long f11571k;

        /* renamed from: l */
        public long f11572l;

        /* renamed from: m */
        public long f11573m;

        public C4626c() {
            super((C4624a) null);
        }

        /* renamed from: a */
        public void mo25016a(AudioTrack audioTrack, boolean z) {
            super.mo25016a(audioTrack, z);
            this.f11571k = 0;
            this.f11572l = 0;
            this.f11573m = 0;
        }

        /* renamed from: b */
        public long mo25017b() {
            return this.f11573m;
        }

        /* renamed from: c */
        public long mo25018c() {
            return this.f11570j.nanoTime;
        }

        /* renamed from: d */
        public boolean mo25019d() {
            boolean timestamp = this.f11561a.getTimestamp(this.f11570j);
            if (timestamp) {
                long j = this.f11570j.framePosition;
                if (this.f11572l > j) {
                    this.f11571k++;
                }
                this.f11572l = j;
                this.f11573m = j + (this.f11571k << 32);
            }
            return timestamp;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.c$d */
    public static final class C4627d extends Exception {
        public C4627d(Throwable th) {
            super(th);
        }

        public C4627d(String str) {
            super(str);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.c$e */
    public static final class C4628e extends Exception {
        public C4628e(int i, int i2, int i3, int i4) {
            super("AudioTrack init failed: " + i + ", Config(" + i2 + ", " + i3 + ", " + i4 + ")");
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.c$f */
    public interface C4629f {
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.c$g */
    public static final class C4630g {

        /* renamed from: a */
        public final C4816m f11574a;

        /* renamed from: b */
        public final long f11575b;

        /* renamed from: c */
        public final long f11576c;

        public C4630g(C4816m mVar, long j, long j2) {
            this.f11574a = mVar;
            this.f11575b = j;
            this.f11576c = j2;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.c$h */
    public static final class C4631h extends Exception {
        public C4631h(int i) {
            super("AudioTrack write failed: " + i);
        }
    }

    public C4623c(C4621b[] bVarArr, C4629f fVar) {
        this.f11536d = fVar;
        if (C4991u.f13270a >= 18) {
            try {
                this.f11507D = AudioTrack.class.getMethod("getLatency", (Class[]) null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (C4991u.f13270a >= 19) {
            this.f11539g = new C4626c();
        } else {
            this.f11539g = new C4625b((C4624a) null);
        }
        C4632d dVar = new C4632d();
        this.f11530a = dVar;
        C4636h hVar = new C4636h();
        this.f11532b = hVar;
        C4621b[] bVarArr2 = new C4621b[(bVarArr.length + 3)];
        this.f11534c = bVarArr2;
        bVarArr2[0] = new C4634f();
        bVarArr2[1] = dVar;
        System.arraycopy(bVarArr, 0, bVarArr2, 2, bVarArr.length);
        bVarArr2[bVarArr.length + 2] = hVar;
        this.f11538f = new long[10];
        this.f11519P = 1.0f;
        this.f11515L = 0;
        this.f11546n = 3;
        this.f11529Z = 0;
        this.f11551s = C4816m.f12777d;
        this.f11526W = -1;
        this.f11520Q = new C4621b[0];
        this.f11521R = new ByteBuffer[0];
        this.f11540h = new LinkedList<>();
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x00cc A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00cd  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24998a(java.lang.String r10, int r11, int r12, int r13, int r14, int[] r15) throws com.fyber.inneractive.sdk.player.exoplayer2.audio.C4623c.C4627d {
        /*
            r9 = this;
            java.lang.String r0 = "audio/raw"
            boolean r0 = r0.equals(r10)
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x000f
            int r10 = m14139a((java.lang.String) r10)
            goto L_0x0010
        L_0x000f:
            r10 = r13
        L_0x0010:
            r2 = 0
            if (r0 != 0) goto L_0x0049
            int r13 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.m15141b(r13, r11)
            r9.f11508E = r13
            com.fyber.inneractive.sdk.player.exoplayer2.audio.d r13 = r9.f11530a
            r13.f11579d = r15
            com.fyber.inneractive.sdk.player.exoplayer2.audio.b[] r13 = r9.f11534c
            int r15 = r13.length
            r3 = r2
            r4 = r3
        L_0x0022:
            if (r3 >= r15) goto L_0x0043
            r5 = r13[r3]
            boolean r6 = r5.mo24988a(r12, r11, r10)     // Catch:{ a -> 0x003c }
            r4 = r4 | r6
            boolean r6 = r5.mo24991d()
            if (r6 == 0) goto L_0x0039
            int r11 = r5.mo24993f()
            int r10 = r5.mo24992e()
        L_0x0039:
            int r3 = r3 + 1
            goto L_0x0022
        L_0x003c:
            r10 = move-exception
            com.fyber.inneractive.sdk.player.exoplayer2.audio.c$d r11 = new com.fyber.inneractive.sdk.player.exoplayer2.audio.c$d
            r11.<init>((java.lang.Throwable) r10)
            throw r11
        L_0x0043:
            if (r4 == 0) goto L_0x004a
            r9.mo25011i()
            goto L_0x004a
        L_0x0049:
            r4 = r2
        L_0x004a:
            r13 = 252(0xfc, float:3.53E-43)
            r15 = 12
            switch(r11) {
                case 1: goto L_0x007b;
                case 2: goto L_0x0079;
                case 3: goto L_0x0076;
                case 4: goto L_0x0073;
                case 5: goto L_0x0070;
                case 6: goto L_0x006e;
                case 7: goto L_0x006b;
                case 8: goto L_0x0068;
                default: goto L_0x0051;
            }
        L_0x0051:
            com.fyber.inneractive.sdk.player.exoplayer2.audio.c$d r10 = new com.fyber.inneractive.sdk.player.exoplayer2.audio.c$d
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Unsupported channel count: "
            r12.append(r13)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r10.<init>((java.lang.String) r11)
            throw r10
        L_0x0068:
            int r3 = com.fyber.inneractive.sdk.player.exoplayer2.C4637b.f11629a
            goto L_0x007c
        L_0x006b:
            r3 = 1276(0x4fc, float:1.788E-42)
            goto L_0x007c
        L_0x006e:
            r3 = r13
            goto L_0x007c
        L_0x0070:
            r3 = 220(0xdc, float:3.08E-43)
            goto L_0x007c
        L_0x0073:
            r3 = 204(0xcc, float:2.86E-43)
            goto L_0x007c
        L_0x0076:
            r3 = 28
            goto L_0x007c
        L_0x0079:
            r3 = r15
            goto L_0x007c
        L_0x007b:
            r3 = 4
        L_0x007c:
            int r5 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.f13270a
            r6 = 23
            r7 = 5
            if (r5 > r6) goto L_0x00a3
            java.lang.String r6 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.f13271b
            java.lang.String r8 = "foster"
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x00a3
            java.lang.String r6 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.f13272c
            java.lang.String r8 = "NVIDIA"
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x00a3
            r6 = 3
            if (r11 == r6) goto L_0x00a4
            if (r11 == r7) goto L_0x00a4
            r13 = 7
            if (r11 == r13) goto L_0x00a0
            goto L_0x00a3
        L_0x00a0:
            int r13 = com.fyber.inneractive.sdk.player.exoplayer2.C4637b.f11629a
            goto L_0x00a4
        L_0x00a3:
            r13 = r3
        L_0x00a4:
            r3 = 25
            if (r5 > r3) goto L_0x00b7
            java.lang.String r3 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.f13271b
            java.lang.String r5 = "fugu"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x00b7
            if (r0 == 0) goto L_0x00b7
            if (r11 != r1) goto L_0x00b7
            goto L_0x00b8
        L_0x00b7:
            r15 = r13
        L_0x00b8:
            if (r4 != 0) goto L_0x00cd
            boolean r13 = r9.mo25007e()
            if (r13 == 0) goto L_0x00cd
            int r13 = r9.f11544l
            if (r13 != r10) goto L_0x00cd
            int r13 = r9.f11542j
            if (r13 != r12) goto L_0x00cd
            int r13 = r9.f11543k
            if (r13 != r15) goto L_0x00cd
            return
        L_0x00cd:
            r9.mo25010h()
            r9.f11544l = r10
            r9.f11547o = r0
            r9.f11542j = r12
            r9.f11543k = r15
            r13 = 2
            if (r0 == 0) goto L_0x00dc
            goto L_0x00dd
        L_0x00dc:
            r10 = r13
        L_0x00dd:
            r9.f11545m = r10
            int r10 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.m15141b(r13, r11)
            r9.f11511H = r10
            if (r14 == 0) goto L_0x00ea
            r9.f11548p = r14
            goto L_0x0134
        L_0x00ea:
            if (r0 == 0) goto L_0x00ff
            int r10 = r9.f11545m
            if (r10 == r7) goto L_0x00fa
            r11 = 6
            if (r10 != r11) goto L_0x00f4
            goto L_0x00fa
        L_0x00f4:
            r10 = 49152(0xc000, float:6.8877E-41)
            r9.f11548p = r10
            goto L_0x0134
        L_0x00fa:
            r10 = 20480(0x5000, float:2.8699E-41)
            r9.f11548p = r10
            goto L_0x0134
        L_0x00ff:
            int r10 = r9.f11545m
            int r10 = android.media.AudioTrack.getMinBufferSize(r12, r15, r10)
            r11 = -2
            if (r10 == r11) goto L_0x0109
            goto L_0x010a
        L_0x0109:
            r1 = r2
        L_0x010a:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a.m15051b(r1)
            int r11 = r10 * 4
            r12 = 250000(0x3d090, double:1.235164E-318)
            long r12 = r9.mo24996a((long) r12)
            int r12 = (int) r12
            int r13 = r9.f11511H
            int r12 = r12 * r13
            long r13 = (long) r10
            r1 = 750000(0xb71b0, double:3.70549E-318)
            long r1 = r9.mo24996a((long) r1)
            int r10 = r9.f11511H
            long r3 = (long) r10
            long r1 = r1 * r3
            long r13 = java.lang.Math.max(r13, r1)
            int r10 = (int) r13
            if (r11 >= r12) goto L_0x012f
            r11 = r12
            goto L_0x0132
        L_0x012f:
            if (r11 <= r10) goto L_0x0132
            r11 = r10
        L_0x0132:
            r9.f11548p = r11
        L_0x0134:
            if (r0 == 0) goto L_0x013c
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0146
        L_0x013c:
            int r10 = r9.f11548p
            int r11 = r9.f11511H
            int r10 = r10 / r11
            long r10 = (long) r10
            long r10 = r9.mo25002b(r10)
        L_0x0146:
            r9.f11549q = r10
            com.fyber.inneractive.sdk.player.exoplayer2.m r10 = r9.f11551s
            r9.mo24997a((com.fyber.inneractive.sdk.player.exoplayer2.C4816m) r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.C4623c.mo24998a(java.lang.String, int, int, int, int, int[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d5, code lost:
        if (r11 < r10) goto L_0x0075;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0110  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo25003b(java.nio.ByteBuffer r9, long r10) throws com.fyber.inneractive.sdk.player.exoplayer2.audio.C4623c.C4631h {
        /*
            r8 = this;
            boolean r0 = r9.hasRemaining()
            r1 = 1
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.nio.ByteBuffer r0 = r8.f11523T
            r2 = 21
            r3 = 0
            if (r0 == 0) goto L_0x0018
            if (r0 != r9) goto L_0x0013
            r0 = r1
            goto L_0x0014
        L_0x0013:
            r0 = r3
        L_0x0014:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a.m15049a((boolean) r0)
            goto L_0x003b
        L_0x0018:
            r8.f11523T = r9
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.f13270a
            if (r0 >= r2) goto L_0x003b
            int r0 = r9.remaining()
            byte[] r4 = r8.f11524U
            if (r4 == 0) goto L_0x0029
            int r4 = r4.length
            if (r4 >= r0) goto L_0x002d
        L_0x0029:
            byte[] r4 = new byte[r0]
            r8.f11524U = r4
        L_0x002d:
            int r4 = r9.position()
            byte[] r5 = r8.f11524U
            r9.get(r5, r3, r0)
            r9.position(r4)
            r8.f11525V = r3
        L_0x003b:
            int r0 = r9.remaining()
            int r4 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.f13270a
            if (r4 >= r2) goto L_0x0078
            long r10 = r8.f11512I
            com.fyber.inneractive.sdk.player.exoplayer2.audio.c$b r2 = r8.f11539g
            long r4 = r2.mo25015a()
            int r2 = r8.f11511H
            long r6 = (long) r2
            long r4 = r4 * r6
            long r10 = r10 - r4
            int r10 = (int) r10
            int r11 = r8.f11548p
            int r11 = r11 - r10
            if (r11 <= 0) goto L_0x0075
            int r10 = java.lang.Math.min(r0, r11)
            android.media.AudioTrack r11 = r8.f11541i
            byte[] r2 = r8.f11524U
            int r4 = r8.f11525V
            int r10 = r11.write(r2, r4, r10)
            if (r10 <= 0) goto L_0x00ed
            int r11 = r8.f11525V
            int r11 = r11 + r10
            r8.f11525V = r11
            int r11 = r9.position()
            int r11 = r11 + r10
            r9.position(r11)
            goto L_0x00ed
        L_0x0075:
            r10 = r3
            goto L_0x00ed
        L_0x0078:
            boolean r2 = r8.f11531a0
            if (r2 == 0) goto L_0x00e7
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0087
            r2 = r1
            goto L_0x0088
        L_0x0087:
            r2 = r3
        L_0x0088:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a.m15051b(r2)
            android.media.AudioTrack r2 = r8.f11541i
            java.nio.ByteBuffer r4 = r8.f11554v
            if (r4 != 0) goto L_0x00a6
            r4 = 16
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r4)
            r8.f11554v = r4
            java.nio.ByteOrder r5 = java.nio.ByteOrder.BIG_ENDIAN
            r4.order(r5)
            java.nio.ByteBuffer r4 = r8.f11554v
            r5 = 1431633921(0x55550001, float:1.46372496E13)
            r4.putInt(r5)
        L_0x00a6:
            int r4 = r8.f11555w
            if (r4 != 0) goto L_0x00c1
            java.nio.ByteBuffer r4 = r8.f11554v
            r5 = 4
            r4.putInt(r5, r0)
            java.nio.ByteBuffer r4 = r8.f11554v
            r5 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r5
            r5 = 8
            r4.putLong(r5, r10)
            java.nio.ByteBuffer r10 = r8.f11554v
            r10.position(r3)
            r8.f11555w = r0
        L_0x00c1:
            java.nio.ByteBuffer r10 = r8.f11554v
            int r10 = r10.remaining()
            if (r10 <= 0) goto L_0x00d8
            java.nio.ByteBuffer r11 = r8.f11554v
            int r11 = r2.write(r11, r10, r1)
            if (r11 >= 0) goto L_0x00d5
            r8.f11555w = r3
            r10 = r11
            goto L_0x00ed
        L_0x00d5:
            if (r11 >= r10) goto L_0x00d8
            goto L_0x0075
        L_0x00d8:
            int r10 = r2.write(r9, r0, r1)
            if (r10 >= 0) goto L_0x00e1
            r8.f11555w = r3
            goto L_0x00ed
        L_0x00e1:
            int r9 = r8.f11555w
            int r9 = r9 - r10
            r8.f11555w = r9
            goto L_0x00ed
        L_0x00e7:
            android.media.AudioTrack r10 = r8.f11541i
            int r10 = r10.write(r9, r0, r1)
        L_0x00ed:
            long r4 = android.os.SystemClock.elapsedRealtime()
            r8.f11535c0 = r4
            if (r10 < 0) goto L_0x0110
            boolean r9 = r8.f11547o
            if (r9 != 0) goto L_0x00ff
            long r4 = r8.f11512I
            long r6 = (long) r10
            long r4 = r4 + r6
            r8.f11512I = r4
        L_0x00ff:
            if (r10 != r0) goto L_0x010f
            if (r9 == 0) goto L_0x010b
            long r9 = r8.f11513J
            int r11 = r8.f11514K
            long r2 = (long) r11
            long r9 = r9 + r2
            r8.f11513J = r9
        L_0x010b:
            r9 = 0
            r8.f11523T = r9
            return r1
        L_0x010f:
            return r3
        L_0x0110:
            com.fyber.inneractive.sdk.player.exoplayer2.audio.c$h r9 = new com.fyber.inneractive.sdk.player.exoplayer2.audio.c$h
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.C4623c.mo25003b(java.nio.ByteBuffer, long):boolean");
    }

    /* renamed from: c */
    public final void mo25005c(long j) throws C4631h {
        ByteBuffer byteBuffer;
        int length = this.f11520Q.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.f11521R[i - 1];
            } else {
                byteBuffer = this.f11522S;
                if (byteBuffer == null) {
                    byteBuffer = C4621b.f11503a;
                }
            }
            if (i == length) {
                mo25003b(byteBuffer, j);
            } else {
                C4621b bVar = this.f11520Q[i];
                bVar.mo24987a(byteBuffer);
                ByteBuffer a = bVar.mo24986a();
                this.f11521R[i] = a;
                if (a.hasRemaining()) {
                    i++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i--;
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    public boolean mo25006d() {
        if (mo25007e()) {
            if (mo25004c() > this.f11539g.mo25015a()) {
                return true;
            }
            if (mo25008f() && this.f11541i.getPlayState() == 2 && this.f11541i.getPlaybackHeadPosition() == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo25007e() {
        return this.f11541i != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.f11545m;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo25008f() {
        /*
            r2 = this;
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.f13270a
            r1 = 23
            if (r0 >= r1) goto L_0x0010
            int r0 = r2.f11545m
            r1 = 5
            if (r0 == r1) goto L_0x000e
            r1 = 6
            if (r0 != r1) goto L_0x0010
        L_0x000e:
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.C4623c.mo25008f():boolean");
    }

    /* renamed from: g */
    public void mo25009g() {
        this.f11528Y = true;
        if (mo25007e()) {
            this.f11517N = System.nanoTime() / 1000;
            this.f11541i.play();
        }
    }

    /* renamed from: h */
    public void mo25010h() {
        if (mo25007e()) {
            this.f11509F = 0;
            this.f11510G = 0;
            this.f11512I = 0;
            this.f11513J = 0;
            this.f11514K = 0;
            C4816m mVar = this.f11550r;
            if (mVar != null) {
                this.f11551s = mVar;
                this.f11550r = null;
            } else if (!this.f11540h.isEmpty()) {
                this.f11551s = this.f11540h.getLast().f11574a;
            }
            this.f11540h.clear();
            this.f11552t = 0;
            this.f11553u = 0;
            this.f11522S = null;
            this.f11523T = null;
            int i = 0;
            while (true) {
                C4621b[] bVarArr = this.f11520Q;
                if (i >= bVarArr.length) {
                    break;
                }
                C4621b bVar = bVarArr[i];
                bVar.flush();
                this.f11521R[i] = bVar.mo24986a();
                i++;
            }
            this.f11527X = false;
            this.f11526W = -1;
            this.f11554v = null;
            this.f11555w = 0;
            this.f11515L = 0;
            this.f11518O = 0;
            mo25012j();
            if (this.f11541i.getPlayState() == 3) {
                this.f11541i.pause();
            }
            AudioTrack audioTrack = this.f11541i;
            this.f11541i = null;
            this.f11539g.mo25016a((AudioTrack) null, false);
            this.f11537e.close();
            new C4624a(audioTrack).start();
        }
    }

    /* renamed from: i */
    public final void mo25011i() {
        ArrayList arrayList = new ArrayList();
        for (C4621b bVar : this.f11534c) {
            if (bVar.mo24991d()) {
                arrayList.add(bVar);
            } else {
                bVar.flush();
            }
        }
        int size = arrayList.size();
        this.f11520Q = (C4621b[]) arrayList.toArray(new C4621b[size]);
        this.f11521R = new ByteBuffer[size];
        for (int i = 0; i < size; i++) {
            C4621b bVar2 = this.f11520Q[i];
            bVar2.flush();
            this.f11521R[i] = bVar2.mo24986a();
        }
    }

    /* renamed from: j */
    public final void mo25012j() {
        this.f11558z = 0;
        this.f11557y = 0;
        this.f11556x = 0;
        this.f11504A = 0;
        this.f11505B = false;
        this.f11506C = 0;
    }

    /* renamed from: k */
    public final void mo25013k() {
        if (mo25007e()) {
            if (C4991u.f13270a >= 21) {
                this.f11541i.setVolume(this.f11519P);
                return;
            }
            AudioTrack audioTrack = this.f11541i;
            float f = this.f11519P;
            audioTrack.setStereoVolume(f, f);
        }
    }

    /* renamed from: c */
    public final long mo25004c() {
        return this.f11547o ? this.f11513J : this.f11512I / ((long) this.f11511H);
    }

    /* renamed from: b */
    public final long mo25002b(long j) {
        return (j * 1000000) / ((long) this.f11542j);
    }

    /* renamed from: b */
    public final long mo25001b() {
        return this.f11547o ? this.f11510G : this.f11509F / ((long) this.f11508E);
    }

    /* renamed from: a */
    public boolean mo25000a(ByteBuffer byteBuffer, long j) throws C4628e, C4631h {
        int i;
        int i2;
        ByteBuffer byteBuffer2 = byteBuffer;
        long j2 = j;
        ByteBuffer byteBuffer3 = this.f11522S;
        C4965a.m15049a(byteBuffer3 == null || byteBuffer2 == byteBuffer3);
        if (!mo25007e()) {
            this.f11537e.block();
            if (this.f11531a0) {
                this.f11541i = new AudioTrack(new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(16).build(), new AudioFormat.Builder().setChannelMask(this.f11543k).setEncoding(this.f11545m).setSampleRate(this.f11542j).build(), this.f11548p, 1, this.f11529Z);
            } else if (this.f11529Z == 0) {
                this.f11541i = new AudioTrack(this.f11546n, this.f11542j, this.f11543k, this.f11545m, this.f11548p, 1);
            } else {
                this.f11541i = new AudioTrack(this.f11546n, this.f11542j, this.f11543k, this.f11545m, this.f11548p, 1, this.f11529Z);
            }
            int state = this.f11541i.getState();
            if (state == 1) {
                int audioSessionId = this.f11541i.getAudioSessionId();
                if (this.f11529Z != audioSessionId) {
                    this.f11529Z = audioSessionId;
                    MediaCodecAudioRenderer.C4619b bVar = (MediaCodecAudioRenderer.C4619b) this.f11536d;
                    MediaCodecAudioRenderer.this.f11489V.audioSessionId(audioSessionId);
                    MediaCodecAudioRenderer.this.getClass();
                }
                this.f11539g.mo25016a(this.f11541i, mo25008f());
                mo25013k();
                this.f11533b0 = false;
                if (this.f11528Y) {
                    mo25009g();
                }
            } else {
                try {
                    this.f11541i.release();
                } catch (Exception unused) {
                } finally {
                    this.f11541i = null;
                }
                throw new C4628e(state, this.f11542j, this.f11543k, this.f11548p);
            }
        }
        if (mo25008f()) {
            if (this.f11541i.getPlayState() == 2) {
                this.f11533b0 = false;
                return false;
            } else if (this.f11541i.getPlayState() == 1 && this.f11539g.mo25015a() != 0) {
                return false;
            }
        }
        boolean z = this.f11533b0;
        boolean d = mo25006d();
        this.f11533b0 = d;
        if (z && !d && this.f11541i.getPlayState() != 1) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f11535c0;
            MediaCodecAudioRenderer.C4619b bVar2 = (MediaCodecAudioRenderer.C4619b) this.f11536d;
            MediaCodecAudioRenderer.this.f11489V.audioTrackUnderrun(this.f11548p, C4637b.m14202b(this.f11549q), elapsedRealtime);
            MediaCodecAudioRenderer.this.getClass();
        }
        if (this.f11522S == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.f11547o && this.f11514K == 0) {
                int i3 = this.f11545m;
                int i4 = 6;
                if (i3 == 7 || i3 == 8) {
                    int position = byteBuffer.position();
                    i2 = ((((byteBuffer2.get(position + 5) & 252) >> 2) | ((byteBuffer2.get(position + 4) & 1) << 6)) + 1) * 32;
                } else if (i3 == 5) {
                    i2 = 1536;
                } else if (i3 == 6) {
                    if (((byteBuffer2.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
                        i4 = C4620a.f11497a[(byteBuffer2.get(byteBuffer.position() + 4) & 48) >> 4];
                    }
                    i2 = i4 * 256;
                } else {
                    throw new IllegalStateException("Unexpected audio encoding: " + i3);
                }
                this.f11514K = i2;
            }
            if (this.f11550r != null) {
                if (!mo24999a()) {
                    return false;
                }
                this.f11540h.add(new C4630g(this.f11550r, Math.max(0, j2), mo25002b(mo25004c())));
                this.f11550r = null;
                mo25011i();
            }
            if (this.f11515L == 0) {
                this.f11516M = Math.max(0, j2);
                this.f11515L = 1;
            } else {
                long b = this.f11516M + mo25002b(mo25001b());
                if (this.f11515L != 1 || Math.abs(b - j2) <= 200000) {
                    i = 2;
                } else {
                    Log.e("AudioTrack", "Discontinuity detected [expected " + b + ", got " + j2 + "]");
                    i = 2;
                    this.f11515L = 2;
                }
                if (this.f11515L == i) {
                    this.f11516M += j2 - b;
                    this.f11515L = 1;
                    MediaCodecAudioRenderer.C4619b bVar3 = (MediaCodecAudioRenderer.C4619b) this.f11536d;
                    MediaCodecAudioRenderer.this.getClass();
                    boolean unused2 = MediaCodecAudioRenderer.this.f11495b0 = true;
                }
            }
            if (this.f11547o) {
                this.f11510G += (long) this.f11514K;
            } else {
                this.f11509F += (long) byteBuffer.remaining();
            }
            this.f11522S = byteBuffer2;
        }
        if (this.f11547o) {
            mo25003b(this.f11522S, j2);
        } else {
            mo25005c(j2);
        }
        if (this.f11522S.hasRemaining()) {
            return false;
        }
        this.f11522S = null;
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo24999a() throws com.fyber.inneractive.sdk.player.exoplayer2.audio.C4623c.C4631h {
        /*
            r9 = this;
            int r0 = r9.f11526W
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x0014
            boolean r0 = r9.f11547o
            if (r0 == 0) goto L_0x000f
            com.fyber.inneractive.sdk.player.exoplayer2.audio.b[] r0 = r9.f11520Q
            int r0 = r0.length
            goto L_0x0010
        L_0x000f:
            r0 = r3
        L_0x0010:
            r9.f11526W = r0
        L_0x0012:
            r0 = r2
            goto L_0x0015
        L_0x0014:
            r0 = r3
        L_0x0015:
            int r4 = r9.f11526W
            com.fyber.inneractive.sdk.player.exoplayer2.audio.b[] r5 = r9.f11520Q
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L_0x0038
            r4 = r5[r4]
            if (r0 == 0) goto L_0x0028
            r4.mo24990c()
        L_0x0028:
            r9.mo25005c(r7)
            boolean r0 = r4.mo24989b()
            if (r0 != 0) goto L_0x0032
            return r3
        L_0x0032:
            int r0 = r9.f11526W
            int r0 = r0 + r2
            r9.f11526W = r0
            goto L_0x0012
        L_0x0038:
            java.nio.ByteBuffer r0 = r9.f11523T
            if (r0 == 0) goto L_0x0044
            r9.mo25003b(r0, r7)
            java.nio.ByteBuffer r0 = r9.f11523T
            if (r0 == 0) goto L_0x0044
            return r3
        L_0x0044:
            r9.f11526W = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.C4623c.mo24999a():boolean");
    }

    /* renamed from: a */
    public C4816m mo24997a(C4816m mVar) {
        if (this.f11547o) {
            C4816m mVar2 = C4816m.f12777d;
            this.f11551s = mVar2;
            return mVar2;
        }
        C4636h hVar = this.f11532b;
        float f = mVar.f12778a;
        hVar.getClass();
        int i = C4991u.f13270a;
        float max = Math.max(0.1f, Math.min(f, 8.0f));
        hVar.f11621e = max;
        C4636h hVar2 = this.f11532b;
        float f2 = mVar.f12779b;
        hVar2.getClass();
        hVar2.f11622f = Math.max(0.1f, Math.min(f2, 8.0f));
        C4816m mVar3 = new C4816m(max, f2);
        C4816m mVar4 = this.f11550r;
        if (mVar4 == null) {
            if (!this.f11540h.isEmpty()) {
                mVar4 = this.f11540h.getLast().f11574a;
            } else {
                mVar4 = this.f11551s;
            }
        }
        if (!mVar3.equals(mVar4)) {
            if (mo25007e()) {
                this.f11550r = mVar3;
            } else {
                this.f11551s = mVar3;
            }
        }
        return this.f11551s;
    }

    /* renamed from: a */
    public final long mo24996a(long j) {
        return (j * ((long) this.f11542j)) / 1000000;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m14139a(java.lang.String r5) {
        /*
            r5.getClass()
            int r0 = r5.hashCode()
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            switch(r0) {
                case -1095064472: goto L_0x0030;
                case 187078296: goto L_0x0025;
                case 1504578661: goto L_0x001a;
                case 1505942594: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x003b
        L_0x000f:
            java.lang.String r0 = "audio/vnd.dts.hd"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0018
            goto L_0x003b
        L_0x0018:
            r5 = r1
            goto L_0x003c
        L_0x001a:
            java.lang.String r0 = "audio/eac3"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0023
            goto L_0x003b
        L_0x0023:
            r5 = r2
            goto L_0x003c
        L_0x0025:
            java.lang.String r0 = "audio/ac3"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x002e
            goto L_0x003b
        L_0x002e:
            r5 = r3
            goto L_0x003c
        L_0x0030:
            java.lang.String r0 = "audio/vnd.dts"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0039
            goto L_0x003b
        L_0x0039:
            r5 = r4
            goto L_0x003c
        L_0x003b:
            r5 = -1
        L_0x003c:
            if (r5 == 0) goto L_0x004c
            if (r5 == r3) goto L_0x004a
            if (r5 == r2) goto L_0x0048
            if (r5 == r1) goto L_0x0045
            return r4
        L_0x0045:
            r5 = 8
            return r5
        L_0x0048:
            r5 = 6
            return r5
        L_0x004a:
            r5 = 5
            return r5
        L_0x004c:
            r5 = 7
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.audio.C4623c.m14139a(java.lang.String):int");
    }
}
