package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.C4611a;
import com.fyber.inneractive.sdk.player.exoplayer2.C4639d;
import com.fyber.inneractive.sdk.player.exoplayer2.C4811i;
import com.fyber.inneractive.sdk.player.exoplayer2.C4813j;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.C4643b;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C4648b;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C4650c;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C4651d;
import com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C4822d;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b */
public abstract class C4818b extends C4611a {

    /* renamed from: U */
    public static final byte[] f12786U;

    /* renamed from: A */
    public boolean f12787A;

    /* renamed from: B */
    public boolean f12788B;

    /* renamed from: C */
    public boolean f12789C;

    /* renamed from: D */
    public boolean f12790D;

    /* renamed from: E */
    public ByteBuffer[] f12791E;

    /* renamed from: F */
    public ByteBuffer[] f12792F;

    /* renamed from: G */
    public long f12793G;

    /* renamed from: H */
    public int f12794H;

    /* renamed from: I */
    public int f12795I;

    /* renamed from: J */
    public boolean f12796J;

    /* renamed from: K */
    public boolean f12797K;

    /* renamed from: L */
    public int f12798L;

    /* renamed from: M */
    public int f12799M;

    /* renamed from: N */
    public boolean f12800N;

    /* renamed from: O */
    public boolean f12801O;

    /* renamed from: P */
    public boolean f12802P;

    /* renamed from: Q */
    public boolean f12803Q;

    /* renamed from: R */
    public boolean f12804R;

    /* renamed from: S */
    public boolean f12805S;

    /* renamed from: T */
    public DecoderCounters f12806T;

    /* renamed from: i */
    public final C4820c f12807i;

    /* renamed from: j */
    public final C4650c<C4651d> f12808j;

    /* renamed from: k */
    public final boolean f12809k;

    /* renamed from: l */
    public final C4643b f12810l;

    /* renamed from: m */
    public final C4643b f12811m;

    /* renamed from: n */
    public final C4813j f12812n;

    /* renamed from: o */
    public final List<Long> f12813o;

    /* renamed from: p */
    public final MediaCodec.BufferInfo f12814p;

    /* renamed from: q */
    public C4811i f12815q;

    /* renamed from: r */
    public MediaCodec f12816r;

    /* renamed from: s */
    public C4648b<C4651d> f12817s;

    /* renamed from: t */
    public C4648b<C4651d> f12818t;

    /* renamed from: u */
    public boolean f12819u;

    /* renamed from: v */
    public boolean f12820v;

    /* renamed from: w */
    public boolean f12821w;

    /* renamed from: x */
    public boolean f12822x;

    /* renamed from: y */
    public boolean f12823y;

    /* renamed from: z */
    public boolean f12824z;

    static {
        int i = C4991u.f13270a;
        byte[] bArr = new byte[38];
        for (int i2 = 0; i2 < 38; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) ((Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i3), 16) << 4) + Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i3 + 1), 16));
        }
        f12786U = bArr;
    }

    public C4818b(int i, C4820c cVar, C4650c<C4651d> cVar2, boolean z) {
        super(i);
        C4965a.m15051b(C4991u.f13270a >= 16);
        this.f12807i = (C4820c) C4965a.m15047a(cVar);
        this.f12808j = cVar2;
        this.f12809k = z;
        this.f12810l = new C4643b(0);
        this.f12811m = C4643b.m14208b();
        this.f12812n = new C4813j();
        this.f12813o = new ArrayList();
        this.f12814p = new MediaCodec.BufferInfo();
        this.f12798L = 0;
        this.f12799M = 0;
    }

    /* renamed from: a */
    public abstract int mo24972a(C4820c cVar, C4811i iVar) throws C4822d.C4824b;

    /* renamed from: a */
    public C4817a mo24974a(C4820c cVar, C4811i iVar, boolean z) throws C4822d.C4824b {
        return cVar.mo25320a(iVar.f12755f, z);
    }

    /* renamed from: a */
    public abstract void mo24976a(MediaCodec mediaCodec, MediaFormat mediaFormat) throws C4639d;

    /* renamed from: a */
    public void mo25313a(C4643b bVar) {
    }

    /* renamed from: a */
    public abstract void mo24978a(C4817a aVar, MediaCodec mediaCodec, C4811i iVar, MediaCrypto mediaCrypto) throws C4822d.C4824b;

    /* renamed from: a */
    public abstract void mo24979a(String str, long j, long j2);

    /* renamed from: a */
    public abstract boolean mo24980a(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws C4639d;

    /* renamed from: a */
    public boolean mo25314a(MediaCodec mediaCodec, boolean z, C4811i iVar, C4811i iVar2) {
        return false;
    }

    /* renamed from: b */
    public boolean mo24981b() {
        return this.f12803Q;
    }

    public boolean isReady() {
        if (this.f12815q != null && !this.f12804R) {
            if ((this.f11471g ? this.f11472h : this.f11469e.isReady()) || this.f12795I >= 0 || (this.f12793G != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f12793G)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    public void mo24951p() {
        this.f12815q = null;
        try {
            mo25318v();
            try {
                C4648b<C4651d> bVar = this.f12817s;
                if (bVar != null) {
                    this.f12808j.mo25053a(bVar);
                }
                try {
                    C4648b<C4651d> bVar2 = this.f12818t;
                    if (!(bVar2 == null || bVar2 == this.f12817s)) {
                        this.f12808j.mo25053a(bVar2);
                    }
                } finally {
                    this.f12817s = null;
                    this.f12818t = null;
                }
            } catch (Throwable th) {
                C4648b<C4651d> bVar3 = this.f12818t;
                if (!(bVar3 == null || bVar3 == this.f12817s)) {
                    this.f12808j.mo25053a(bVar3);
                }
                throw th;
            } finally {
                this.f12817s = null;
                this.f12818t = null;
            }
        } catch (Throwable th2) {
            try {
                C4648b<C4651d> bVar4 = this.f12818t;
                if (!(bVar4 == null || bVar4 == this.f12817s)) {
                    this.f12808j.mo25053a(bVar4);
                }
                throw th2;
            } finally {
                this.f12817s = null;
                this.f12818t = null;
            }
        } finally {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:82:0x0139 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x013a  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo25315s() throws com.fyber.inneractive.sdk.player.exoplayer2.C4639d {
        /*
            r15 = this;
            android.media.MediaCodec r0 = r15.f12816r
            r1 = 0
            if (r0 == 0) goto L_0x0208
            int r2 = r15.f12799M
            r3 = 2
            if (r2 == r3) goto L_0x0208
            boolean r2 = r15.f12802P
            if (r2 == 0) goto L_0x0010
            goto L_0x0208
        L_0x0010:
            int r2 = r15.f12794H
            if (r2 >= 0) goto L_0x002a
            r4 = 0
            int r0 = r0.dequeueInputBuffer(r4)
            r15.f12794H = r0
            if (r0 >= 0) goto L_0x001f
            return r1
        L_0x001f:
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r2 = r15.f12810l
            java.nio.ByteBuffer[] r4 = r15.f12791E
            r0 = r4[r0]
            r2.f11650c = r0
            r2.mo25033a()
        L_0x002a:
            int r0 = r15.f12799M
            r2 = -1
            r4 = 1
            if (r0 != r4) goto L_0x0048
            boolean r0 = r15.f12823y
            if (r0 == 0) goto L_0x0035
            goto L_0x0045
        L_0x0035:
            r15.f12801O = r4
            android.media.MediaCodec r5 = r15.f12816r
            int r6 = r15.f12794H
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 4
            r5.queueInputBuffer(r6, r7, r8, r9, r11)
            r15.f12794H = r2
        L_0x0045:
            r15.f12799M = r3
            return r1
        L_0x0048:
            boolean r0 = r15.f12789C
            if (r0 == 0) goto L_0x0068
            r15.f12789C = r1
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r0 = r15.f12810l
            java.nio.ByteBuffer r0 = r0.f11650c
            byte[] r1 = f12786U
            r0.put(r1)
            android.media.MediaCodec r5 = r15.f12816r
            int r6 = r15.f12794H
            int r8 = r1.length
            r7 = 0
            r9 = 0
            r11 = 0
            r5.queueInputBuffer(r6, r7, r8, r9, r11)
            r15.f12794H = r2
            r15.f12800N = r4
            return r4
        L_0x0068:
            boolean r0 = r15.f12804R
            if (r0 == 0) goto L_0x006f
            r0 = -4
            r5 = r1
            goto L_0x00a7
        L_0x006f:
            int r0 = r15.f12798L
            if (r0 != r4) goto L_0x0094
            r0 = r1
        L_0x0074:
            com.fyber.inneractive.sdk.player.exoplayer2.i r5 = r15.f12815q
            java.util.List<byte[]> r5 = r5.f12757h
            int r5 = r5.size()
            if (r0 >= r5) goto L_0x0092
            com.fyber.inneractive.sdk.player.exoplayer2.i r5 = r15.f12815q
            java.util.List<byte[]> r5 = r5.f12757h
            java.lang.Object r5 = r5.get(r0)
            byte[] r5 = (byte[]) r5
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r6 = r15.f12810l
            java.nio.ByteBuffer r6 = r6.f11650c
            r6.put(r5)
            int r0 = r0 + 1
            goto L_0x0074
        L_0x0092:
            r15.f12798L = r3
        L_0x0094:
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r0 = r15.f12810l
            java.nio.ByteBuffer r0 = r0.f11650c
            int r0 = r0.position()
            com.fyber.inneractive.sdk.player.exoplayer2.j r5 = r15.f12812n
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r6 = r15.f12810l
            int r5 = r15.mo24932a((com.fyber.inneractive.sdk.player.exoplayer2.C4813j) r5, (com.fyber.inneractive.sdk.player.exoplayer2.decoder.C4643b) r6, (boolean) r1)
            r14 = r5
            r5 = r0
            r0 = r14
        L_0x00a7:
            r6 = -3
            if (r0 != r6) goto L_0x00ab
            return r1
        L_0x00ab:
            r6 = -5
            if (r0 != r6) goto L_0x00c1
            int r0 = r15.f12798L
            if (r0 != r3) goto L_0x00b9
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r0 = r15.f12810l
            r0.mo25033a()
            r15.f12798L = r4
        L_0x00b9:
            com.fyber.inneractive.sdk.player.exoplayer2.j r0 = r15.f12812n
            com.fyber.inneractive.sdk.player.exoplayer2.i r0 = r0.f12776a
            r15.mo24977a((com.fyber.inneractive.sdk.player.exoplayer2.C4811i) r0)
            return r4
        L_0x00c1:
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r0 = r15.f12810l
            r6 = 4
            boolean r0 = r0.mo25034b(r6)
            if (r0 == 0) goto L_0x00fd
            int r0 = r15.f12798L
            if (r0 != r3) goto L_0x00d5
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r0 = r15.f12810l
            r0.mo25033a()
            r15.f12798L = r4
        L_0x00d5:
            r15.f12802P = r4
            boolean r0 = r15.f12800N
            if (r0 != 0) goto L_0x00df
            r15.mo25317u()
            return r1
        L_0x00df:
            boolean r0 = r15.f12823y     // Catch:{ CryptoException -> 0x00f5 }
            if (r0 == 0) goto L_0x00e4
            goto L_0x00f4
        L_0x00e4:
            r15.f12801O = r4     // Catch:{ CryptoException -> 0x00f5 }
            android.media.MediaCodec r5 = r15.f12816r     // Catch:{ CryptoException -> 0x00f5 }
            int r6 = r15.f12794H     // Catch:{ CryptoException -> 0x00f5 }
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 4
            r5.queueInputBuffer(r6, r7, r8, r9, r11)     // Catch:{ CryptoException -> 0x00f5 }
            r15.f12794H = r2     // Catch:{ CryptoException -> 0x00f5 }
        L_0x00f4:
            return r1
        L_0x00f5:
            r0 = move-exception
            int r1 = r15.f11467c
            com.fyber.inneractive.sdk.player.exoplayer2.d r0 = com.fyber.inneractive.sdk.player.exoplayer2.C4639d.m14206a(r0, r1)
            throw r0
        L_0x00fd:
            boolean r0 = r15.f12805S
            if (r0 == 0) goto L_0x0115
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r0 = r15.f12810l
            boolean r0 = r0.mo25034b(r4)
            if (r0 != 0) goto L_0x0115
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r0 = r15.f12810l
            r0.mo25033a()
            int r0 = r15.f12798L
            if (r0 != r3) goto L_0x0114
            r15.f12798L = r4
        L_0x0114:
            return r4
        L_0x0115:
            r15.f12805S = r1
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r0 = r15.f12810l
            r3 = 1073741824(0x40000000, float:2.0)
            boolean r0 = r0.mo25034b(r3)
            com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> r3 = r15.f12817s
            if (r3 != 0) goto L_0x0124
            goto L_0x0134
        L_0x0124:
            int r3 = r3.mo25048a()
            if (r3 == 0) goto L_0x01fb
            if (r3 == r6) goto L_0x0134
            if (r0 != 0) goto L_0x0132
            boolean r3 = r15.f12809k
            if (r3 != 0) goto L_0x0134
        L_0x0132:
            r3 = r4
            goto L_0x0135
        L_0x0134:
            r3 = r1
        L_0x0135:
            r15.f12804R = r3
            if (r3 == 0) goto L_0x013a
            return r1
        L_0x013a:
            boolean r3 = r15.f12820v
            if (r3 == 0) goto L_0x018f
            if (r0 != 0) goto L_0x018f
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r3 = r15.f12810l
            java.nio.ByteBuffer r3 = r3.f11650c
            byte[] r6 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4974i.f13222a
            int r6 = r3.position()
            r7 = r1
            r8 = r7
        L_0x014c:
            int r9 = r7 + 1
            if (r9 >= r6) goto L_0x017f
            byte r10 = r3.get(r7)
            r10 = r10 & 255(0xff, float:3.57E-43)
            r11 = 3
            if (r8 != r11) goto L_0x0176
            if (r10 != r4) goto L_0x017a
            byte r12 = r3.get(r9)
            r12 = r12 & 31
            r13 = 7
            if (r12 != r13) goto L_0x017a
            java.nio.ByteBuffer r8 = r3.duplicate()
            int r7 = r7 - r11
            r8.position(r7)
            r8.limit(r6)
            r3.position(r1)
            r3.put(r8)
            goto L_0x0182
        L_0x0176:
            if (r10 != 0) goto L_0x017a
            int r8 = r8 + 1
        L_0x017a:
            if (r10 == 0) goto L_0x017d
            r8 = r1
        L_0x017d:
            r7 = r9
            goto L_0x014c
        L_0x017f:
            r3.clear()
        L_0x0182:
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r3 = r15.f12810l
            java.nio.ByteBuffer r3 = r3.f11650c
            int r3 = r3.position()
            if (r3 != 0) goto L_0x018d
            return r4
        L_0x018d:
            r15.f12820v = r1
        L_0x018f:
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r3 = r15.f12810l     // Catch:{ CryptoException -> 0x01f3 }
            long r10 = r3.f11651d     // Catch:{ CryptoException -> 0x01f3 }
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            boolean r3 = r3.mo25034b(r6)     // Catch:{ CryptoException -> 0x01f3 }
            if (r3 == 0) goto L_0x01a4
            java.util.List<java.lang.Long> r3 = r15.f12813o     // Catch:{ CryptoException -> 0x01f3 }
            java.lang.Long r6 = java.lang.Long.valueOf(r10)     // Catch:{ CryptoException -> 0x01f3 }
            r3.add(r6)     // Catch:{ CryptoException -> 0x01f3 }
        L_0x01a4:
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r3 = r15.f12810l     // Catch:{ CryptoException -> 0x01f3 }
            java.nio.ByteBuffer r3 = r3.f11650c     // Catch:{ CryptoException -> 0x01f3 }
            r3.flip()     // Catch:{ CryptoException -> 0x01f3 }
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r3 = r15.f12810l     // Catch:{ CryptoException -> 0x01f3 }
            r15.mo25313a((com.fyber.inneractive.sdk.player.exoplayer2.decoder.C4643b) r3)     // Catch:{ CryptoException -> 0x01f3 }
            if (r0 == 0) goto L_0x01d4
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r0 = r15.f12810l     // Catch:{ CryptoException -> 0x01f3 }
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.a r0 = r0.f11649b     // Catch:{ CryptoException -> 0x01f3 }
            android.media.MediaCodec$CryptoInfo r9 = r0.f11644g     // Catch:{ CryptoException -> 0x01f3 }
            if (r5 != 0) goto L_0x01bb
            goto L_0x01ca
        L_0x01bb:
            int[] r0 = r9.numBytesOfClearData     // Catch:{ CryptoException -> 0x01f3 }
            if (r0 != 0) goto L_0x01c3
            int[] r0 = new int[r4]     // Catch:{ CryptoException -> 0x01f3 }
            r9.numBytesOfClearData = r0     // Catch:{ CryptoException -> 0x01f3 }
        L_0x01c3:
            int[] r0 = r9.numBytesOfClearData     // Catch:{ CryptoException -> 0x01f3 }
            r3 = r0[r1]     // Catch:{ CryptoException -> 0x01f3 }
            int r3 = r3 + r5
            r0[r1] = r3     // Catch:{ CryptoException -> 0x01f3 }
        L_0x01ca:
            android.media.MediaCodec r6 = r15.f12816r     // Catch:{ CryptoException -> 0x01f3 }
            int r7 = r15.f12794H     // Catch:{ CryptoException -> 0x01f3 }
            r8 = 0
            r12 = 0
            r6.queueSecureInputBuffer(r7, r8, r9, r10, r12)     // Catch:{ CryptoException -> 0x01f3 }
            goto L_0x01e5
        L_0x01d4:
            android.media.MediaCodec r6 = r15.f12816r     // Catch:{ CryptoException -> 0x01f3 }
            int r7 = r15.f12794H     // Catch:{ CryptoException -> 0x01f3 }
            r8 = 0
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r0 = r15.f12810l     // Catch:{ CryptoException -> 0x01f3 }
            java.nio.ByteBuffer r0 = r0.f11650c     // Catch:{ CryptoException -> 0x01f3 }
            int r9 = r0.limit()     // Catch:{ CryptoException -> 0x01f3 }
            r12 = 0
            r6.queueInputBuffer(r7, r8, r9, r10, r12)     // Catch:{ CryptoException -> 0x01f3 }
        L_0x01e5:
            r15.f12794H = r2     // Catch:{ CryptoException -> 0x01f3 }
            r15.f12800N = r4     // Catch:{ CryptoException -> 0x01f3 }
            r15.f12798L = r1     // Catch:{ CryptoException -> 0x01f3 }
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters r0 = r15.f12806T     // Catch:{ CryptoException -> 0x01f3 }
            int r1 = r0.inputBufferCount     // Catch:{ CryptoException -> 0x01f3 }
            int r1 = r1 + r4
            r0.inputBufferCount = r1     // Catch:{ CryptoException -> 0x01f3 }
            return r4
        L_0x01f3:
            r0 = move-exception
            int r1 = r15.f11467c
            com.fyber.inneractive.sdk.player.exoplayer2.d r0 = com.fyber.inneractive.sdk.player.exoplayer2.C4639d.m14206a(r0, r1)
            throw r0
        L_0x01fb:
            com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> r0 = r15.f12817s
            r0.mo25051c()
            int r0 = r15.f11467c
            r1 = 0
            com.fyber.inneractive.sdk.player.exoplayer2.d r0 = com.fyber.inneractive.sdk.player.exoplayer2.C4639d.m14206a(r1, r0)
            throw r0
        L_0x0208:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C4818b.mo25315s():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0166  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25316t() throws com.fyber.inneractive.sdk.player.exoplayer2.C4639d {
        /*
            r12 = this;
            boolean r0 = r12.mo25319x()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> r0 = r12.f12818t
            r12.f12817s = r0
            com.fyber.inneractive.sdk.player.exoplayer2.i r1 = r12.f12815q
            java.lang.String r1 = r1.f12755f
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x003d
            int r0 = r0.mo25048a()
            if (r0 == 0) goto L_0x0031
            r4 = 3
            if (r0 == r4) goto L_0x0021
            r4 = 4
            if (r0 != r4) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            return
        L_0x0021:
            com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> r0 = r12.f12817s
            com.fyber.inneractive.sdk.player.exoplayer2.drm.d r0 = r0.mo25050b()
            r0.getClass()
            com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> r0 = r12.f12817s
            boolean r0 = r0.mo25049a(r1)
            goto L_0x003e
        L_0x0031:
            com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> r0 = r12.f12817s
            r0.mo25051c()
            int r0 = r12.f11467c
            com.fyber.inneractive.sdk.player.exoplayer2.d r0 = com.fyber.inneractive.sdk.player.exoplayer2.C4639d.m14206a(r2, r0)
            throw r0
        L_0x003d:
            r0 = r3
        L_0x003e:
            com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c r4 = r12.f12807i     // Catch:{ b -> 0x0217 }
            com.fyber.inneractive.sdk.player.exoplayer2.i r5 = r12.f12815q     // Catch:{ b -> 0x0217 }
            com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a r4 = r12.mo24974a((com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C4820c) r4, (com.fyber.inneractive.sdk.player.exoplayer2.C4811i) r5, (boolean) r0)     // Catch:{ b -> 0x0217 }
            if (r4 != 0) goto L_0x0079
            if (r0 == 0) goto L_0x0079
            com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c r4 = r12.f12807i     // Catch:{ b -> 0x0217 }
            com.fyber.inneractive.sdk.player.exoplayer2.i r5 = r12.f12815q     // Catch:{ b -> 0x0217 }
            com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a r4 = r12.mo24974a((com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C4820c) r4, (com.fyber.inneractive.sdk.player.exoplayer2.C4811i) r5, (boolean) r3)     // Catch:{ b -> 0x0217 }
            if (r4 == 0) goto L_0x0079
            java.lang.String r5 = "MediaCodecRenderer"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ b -> 0x0217 }
            r6.<init>()     // Catch:{ b -> 0x0217 }
            java.lang.String r7 = "Drm session requires secure decoder for "
            r6.append(r7)     // Catch:{ b -> 0x0217 }
            r6.append(r1)     // Catch:{ b -> 0x0217 }
            java.lang.String r1 = ", but no secure decoder available. Trying to proceed with "
            r6.append(r1)     // Catch:{ b -> 0x0217 }
            java.lang.String r1 = r4.f12781a     // Catch:{ b -> 0x0217 }
            r6.append(r1)     // Catch:{ b -> 0x0217 }
            java.lang.String r1 = "."
            r6.append(r1)     // Catch:{ b -> 0x0217 }
            java.lang.String r1 = r6.toString()     // Catch:{ b -> 0x0217 }
            android.util.Log.w(r5, r1)     // Catch:{ b -> 0x0217 }
        L_0x0079:
            if (r4 == 0) goto L_0x0206
            java.lang.String r1 = r4.f12781a
            boolean r5 = r4.f12782b
            r12.f12819u = r5
            com.fyber.inneractive.sdk.player.exoplayer2.i r5 = r12.f12815q
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.f13270a
            r7 = 21
            r11 = 1
            if (r6 >= r7) goto L_0x009c
            java.util.List<byte[]> r5 = r5.f12757h
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x009c
            java.lang.String r5 = "OMX.MTK.VIDEO.DECODER.AVC"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x009c
            r5 = r11
            goto L_0x009d
        L_0x009c:
            r5 = r3
        L_0x009d:
            r12.f12820v = r5
            r5 = 19
            r8 = 18
            if (r6 < r8) goto L_0x00d6
            if (r6 != r8) goto L_0x00b7
            java.lang.String r9 = "OMX.SEC.avc.dec"
            boolean r9 = r9.equals(r1)
            if (r9 != 0) goto L_0x00d6
            java.lang.String r9 = "OMX.SEC.avc.dec.secure"
            boolean r9 = r9.equals(r1)
            if (r9 != 0) goto L_0x00d6
        L_0x00b7:
            if (r6 != r5) goto L_0x00d4
            java.lang.String r9 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.f13273d
            java.lang.String r10 = "SM-G800"
            boolean r9 = r9.startsWith(r10)
            if (r9 == 0) goto L_0x00d4
            java.lang.String r9 = "OMX.Exynos.avc.dec"
            boolean r9 = r9.equals(r1)
            if (r9 != 0) goto L_0x00d6
            java.lang.String r9 = "OMX.Exynos.avc.dec.secure"
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L_0x00d4
            goto L_0x00d6
        L_0x00d4:
            r9 = r3
            goto L_0x00d7
        L_0x00d6:
            r9 = r11
        L_0x00d7:
            r12.f12821w = r9
            r9 = 24
            if (r6 >= r9) goto L_0x0111
            java.lang.String r9 = "OMX.Nvidia.h264.decode"
            boolean r9 = r9.equals(r1)
            if (r9 != 0) goto L_0x00ed
            java.lang.String r9 = "OMX.Nvidia.h264.decode.secure"
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L_0x0111
        L_0x00ed:
            java.lang.String r9 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.f13271b
            java.lang.String r10 = "flounder"
            boolean r10 = r10.equals(r9)
            if (r10 != 0) goto L_0x010f
            java.lang.String r10 = "flounder_lte"
            boolean r10 = r10.equals(r9)
            if (r10 != 0) goto L_0x010f
            java.lang.String r10 = "grouper"
            boolean r10 = r10.equals(r9)
            if (r10 != 0) goto L_0x010f
            java.lang.String r10 = "tilapia"
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto L_0x0111
        L_0x010f:
            r9 = r11
            goto L_0x0112
        L_0x0111:
            r9 = r3
        L_0x0112:
            r12.f12822x = r9
            r9 = 17
            if (r6 > r9) goto L_0x012a
            java.lang.String r9 = "OMX.rk.video_decoder.avc"
            boolean r9 = r9.equals(r1)
            if (r9 != 0) goto L_0x0128
            java.lang.String r9 = "OMX.allwinner.video.decoder.avc"
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L_0x012a
        L_0x0128:
            r9 = r11
            goto L_0x012b
        L_0x012a:
            r9 = r3
        L_0x012b:
            r12.f12823y = r9
            r9 = 23
            if (r6 > r9) goto L_0x0139
            java.lang.String r9 = "OMX.google.vorbis.decoder"
            boolean r9 = r9.equals(r1)
            if (r9 != 0) goto L_0x0155
        L_0x0139:
            if (r6 > r5) goto L_0x0157
            java.lang.String r5 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.f13271b
            java.lang.String r9 = "hb2000"
            boolean r5 = r9.equals(r5)
            if (r5 == 0) goto L_0x0157
            java.lang.String r5 = "OMX.amlogic.avc.decoder.awesome"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L_0x0155
            java.lang.String r5 = "OMX.amlogic.avc.decoder.awesome.secure"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x0157
        L_0x0155:
            r5 = r11
            goto L_0x0158
        L_0x0157:
            r5 = r3
        L_0x0158:
            r12.f12824z = r5
            if (r6 != r7) goto L_0x0166
            java.lang.String r5 = "OMX.google.aac.decoder"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x0166
            r5 = r11
            goto L_0x0167
        L_0x0166:
            r5 = r3
        L_0x0167:
            r12.f12787A = r5
            com.fyber.inneractive.sdk.player.exoplayer2.i r5 = r12.f12815q
            if (r6 > r8) goto L_0x017a
            int r5 = r5.f12767r
            if (r5 != r11) goto L_0x017a
            java.lang.String r5 = "OMX.MTK.AUDIO.DECODER.MP3"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x017a
            r3 = r11
        L_0x017a:
            r12.f12788B = r3
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x01f7 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01f7 }
            r3.<init>()     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r7 = "createCodec:"
            r3.append(r7)     // Catch:{ Exception -> 0x01f7 }
            r3.append(r1)     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x01f7 }
            com.fyber.inneractive.sdk.player.exoplayer2.util.C4989s.m15127a(r3)     // Catch:{ Exception -> 0x01f7 }
            android.media.MediaCodec r3 = android.media.MediaCodec.createByCodecName(r1)     // Catch:{ Exception -> 0x01f7 }
            r12.f12816r = r3     // Catch:{ Exception -> 0x01f7 }
            com.fyber.inneractive.sdk.player.exoplayer2.util.C4989s.m15126a()     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r3 = "configureCodec"
            com.fyber.inneractive.sdk.player.exoplayer2.util.C4989s.m15127a(r3)     // Catch:{ Exception -> 0x01f7 }
            android.media.MediaCodec r3 = r12.f12816r     // Catch:{ Exception -> 0x01f7 }
            com.fyber.inneractive.sdk.player.exoplayer2.i r7 = r12.f12815q     // Catch:{ Exception -> 0x01f7 }
            r12.mo24978a((com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C4817a) r4, (android.media.MediaCodec) r3, (com.fyber.inneractive.sdk.player.exoplayer2.C4811i) r7, (android.media.MediaCrypto) r2)     // Catch:{ Exception -> 0x01f7 }
            com.fyber.inneractive.sdk.player.exoplayer2.util.C4989s.m15126a()     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r2 = "startCodec"
            com.fyber.inneractive.sdk.player.exoplayer2.util.C4989s.m15127a(r2)     // Catch:{ Exception -> 0x01f7 }
            android.media.MediaCodec r2 = r12.f12816r     // Catch:{ Exception -> 0x01f7 }
            r2.start()     // Catch:{ Exception -> 0x01f7 }
            com.fyber.inneractive.sdk.player.exoplayer2.util.C4989s.m15126a()     // Catch:{ Exception -> 0x01f7 }
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x01f7 }
            long r9 = r7 - r5
            r5 = r12
            r6 = r1
            r5.mo24979a((java.lang.String) r6, (long) r7, (long) r9)     // Catch:{ Exception -> 0x01f7 }
            android.media.MediaCodec r2 = r12.f12816r     // Catch:{ Exception -> 0x01f7 }
            java.nio.ByteBuffer[] r2 = r2.getInputBuffers()     // Catch:{ Exception -> 0x01f7 }
            r12.f12791E = r2     // Catch:{ Exception -> 0x01f7 }
            android.media.MediaCodec r2 = r12.f12816r     // Catch:{ Exception -> 0x01f7 }
            java.nio.ByteBuffer[] r2 = r2.getOutputBuffers()     // Catch:{ Exception -> 0x01f7 }
            r12.f12792F = r2     // Catch:{ Exception -> 0x01f7 }
            int r0 = r12.f11468d
            r1 = 2
            if (r0 != r1) goto L_0x01e1
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 + r2
            goto L_0x01e6
        L_0x01e1:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x01e6:
            r12.f12793G = r0
            r0 = -1
            r12.f12794H = r0
            r12.f12795I = r0
            r12.f12805S = r11
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters r0 = r12.f12806T
            int r1 = r0.decoderInitCount
            int r1 = r1 + r11
            r0.decoderInitCount = r1
            return
        L_0x01f7:
            r2 = move-exception
            com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b$a r3 = new com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b$a
            com.fyber.inneractive.sdk.player.exoplayer2.i r4 = r12.f12815q
            r3.<init>((com.fyber.inneractive.sdk.player.exoplayer2.C4811i) r4, (java.lang.Throwable) r2, (boolean) r0, (java.lang.String) r1)
            int r0 = r12.f11467c
            com.fyber.inneractive.sdk.player.exoplayer2.d r0 = com.fyber.inneractive.sdk.player.exoplayer2.C4639d.m14206a(r3, r0)
            throw r0
        L_0x0206:
            com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b$a r1 = new com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b$a
            com.fyber.inneractive.sdk.player.exoplayer2.i r3 = r12.f12815q
            r4 = -49999(0xffffffffffff3cb1, float:NaN)
            r1.<init>((com.fyber.inneractive.sdk.player.exoplayer2.C4811i) r3, (java.lang.Throwable) r2, (boolean) r0, (int) r4)
            int r0 = r12.f11467c
            com.fyber.inneractive.sdk.player.exoplayer2.d r0 = com.fyber.inneractive.sdk.player.exoplayer2.C4639d.m14206a(r1, r0)
            throw r0
        L_0x0217:
            r1 = move-exception
            com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b$a r2 = new com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b$a
            com.fyber.inneractive.sdk.player.exoplayer2.i r3 = r12.f12815q
            r4 = -49998(0xffffffffffff3cb2, float:NaN)
            r2.<init>((com.fyber.inneractive.sdk.player.exoplayer2.C4811i) r3, (java.lang.Throwable) r1, (boolean) r0, (int) r4)
            int r0 = r12.f11467c
            com.fyber.inneractive.sdk.player.exoplayer2.d r0 = com.fyber.inneractive.sdk.player.exoplayer2.C4639d.m14206a(r2, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C4818b.mo25316t():void");
    }

    /* renamed from: u */
    public final void mo25317u() throws C4639d {
        if (this.f12799M == 2) {
            mo25318v();
            mo25316t();
            return;
        }
        this.f12803Q = true;
        mo24985w();
    }

    /* renamed from: v */
    public void mo25318v() {
        if (this.f12816r != null) {
            this.f12793G = -9223372036854775807L;
            this.f12794H = -1;
            this.f12795I = -1;
            this.f12804R = false;
            this.f12796J = false;
            this.f12813o.clear();
            this.f12791E = null;
            this.f12792F = null;
            this.f12797K = false;
            this.f12800N = false;
            this.f12819u = false;
            this.f12820v = false;
            this.f12821w = false;
            this.f12822x = false;
            this.f12823y = false;
            this.f12824z = false;
            this.f12788B = false;
            this.f12789C = false;
            this.f12790D = false;
            this.f12801O = false;
            this.f12798L = 0;
            this.f12799M = 0;
            this.f12806T.decoderReleaseCount++;
            this.f12810l.f11650c = null;
            try {
                this.f12816r.stop();
                try {
                    this.f12816r.release();
                    this.f12816r = null;
                    C4648b<C4651d> bVar = this.f12817s;
                    if (bVar != null && this.f12818t != bVar) {
                        try {
                            this.f12808j.mo25053a(bVar);
                        } finally {
                            this.f12817s = null;
                        }
                    }
                } catch (Throwable th) {
                    this.f12816r = null;
                    C4648b<C4651d> bVar2 = this.f12817s;
                    if (!(bVar2 == null || this.f12818t == bVar2)) {
                        this.f12808j.mo25053a(bVar2);
                    }
                    throw th;
                } finally {
                    this.f12817s = null;
                }
            } catch (Throwable th2) {
                this.f12816r = null;
                C4648b<C4651d> bVar3 = this.f12817s;
                if (!(bVar3 == null || this.f12818t == bVar3)) {
                    try {
                        this.f12808j.mo25053a(bVar3);
                    } finally {
                        this.f12817s = null;
                    }
                }
                throw th2;
            } finally {
            }
        }
    }

    /* renamed from: w */
    public void mo24985w() throws C4639d {
    }

    /* renamed from: x */
    public boolean mo25319x() {
        return this.f12816r == null && this.f12815q != null;
    }

    /* renamed from: a */
    public void mo24935a(long j, boolean z) throws C4639d {
        this.f12802P = false;
        this.f12803Q = false;
        if (this.f12816r != null) {
            this.f12793G = -9223372036854775807L;
            this.f12794H = -1;
            this.f12795I = -1;
            this.f12805S = true;
            this.f12804R = false;
            this.f12796J = false;
            this.f12813o.clear();
            this.f12789C = false;
            this.f12790D = false;
            if (this.f12821w || (this.f12824z && this.f12801O)) {
                mo25318v();
                mo25316t();
            } else if (this.f12799M != 0) {
                mo25318v();
                mo25316t();
            } else {
                this.f12816r.flush();
                this.f12800N = false;
            }
            if (this.f12797K && this.f12815q != null) {
                this.f12798L = 1;
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b$a */
    public static class C4819a extends Exception {
        public C4819a(C4811i iVar, Throwable th, boolean z, int i) {
            super("Decoder init failed: [" + i + "], " + iVar, th);
            String str = iVar.f12755f;
            m14756a(i);
        }

        /* renamed from: a */
        public static String m14757a(Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }

        /* renamed from: a */
        public static String m14756a(int i) {
            String str = i < 0 ? "neg_" : "";
            return "com.google.android.exoplayer.MediaCodecTrackRenderer_" + str + Math.abs(i);
        }

        public C4819a(C4811i iVar, Throwable th, boolean z, String str) {
            super("Decoder init failed: " + str + ", " + iVar, th);
            String str2 = iVar.f12755f;
            if (C4991u.f13270a >= 21) {
                m14757a(th);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:84:0x0184 A[LOOP:0: B:14:0x0047->B:84:0x0184, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0187 A[EDGE_INSN: B:95:0x0187->B:85:0x0187 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo25312a(long r18, long r20) throws com.fyber.inneractive.sdk.player.exoplayer2.C4639d {
        /*
            r17 = this;
            r12 = r17
            boolean r0 = r12.f12803Q
            if (r0 == 0) goto L_0x000a
            r17.mo24985w()
            return
        L_0x000a:
            com.fyber.inneractive.sdk.player.exoplayer2.i r0 = r12.f12815q
            r1 = -4
            r2 = -5
            r13 = 4
            r14 = 1
            if (r0 != 0) goto L_0x003a
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r0 = r12.f12811m
            r0.mo25033a()
            com.fyber.inneractive.sdk.player.exoplayer2.j r0 = r12.f12812n
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r3 = r12.f12811m
            int r0 = r12.mo24932a((com.fyber.inneractive.sdk.player.exoplayer2.C4813j) r0, (com.fyber.inneractive.sdk.player.exoplayer2.decoder.C4643b) r3, (boolean) r14)
            if (r0 != r2) goto L_0x0029
            com.fyber.inneractive.sdk.player.exoplayer2.j r0 = r12.f12812n
            com.fyber.inneractive.sdk.player.exoplayer2.i r0 = r0.f12776a
            r12.mo24977a((com.fyber.inneractive.sdk.player.exoplayer2.C4811i) r0)
            goto L_0x003a
        L_0x0029:
            if (r0 != r1) goto L_0x0039
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r0 = r12.f12811m
            boolean r0 = r0.mo25034b(r13)
            com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a.m15051b(r0)
            r12.f12802P = r14
            r17.mo25317u()
        L_0x0039:
            return
        L_0x003a:
            r17.mo25316t()
            android.media.MediaCodec r0 = r12.f12816r
            r15 = 0
            if (r0 == 0) goto L_0x0192
            java.lang.String r0 = "drainAndFeed"
            com.fyber.inneractive.sdk.player.exoplayer2.util.C4989s.m15127a(r0)
        L_0x0047:
            int r0 = r12.f12795I
            r11 = -1
            if (r0 >= 0) goto L_0x0129
            boolean r0 = r12.f12787A
            r1 = 0
            if (r0 == 0) goto L_0x006d
            boolean r0 = r12.f12801O
            if (r0 == 0) goto L_0x006d
            android.media.MediaCodec r0 = r12.f12816r     // Catch:{ IllegalStateException -> 0x0061 }
            android.media.MediaCodec$BufferInfo r3 = r12.f12814p     // Catch:{ IllegalStateException -> 0x0061 }
            int r0 = r0.dequeueOutputBuffer(r3, r1)     // Catch:{ IllegalStateException -> 0x0061 }
            r12.f12795I = r0     // Catch:{ IllegalStateException -> 0x0061 }
            goto L_0x0077
        L_0x0061:
            r17.mo25317u()
            boolean r0 = r12.f12803Q
            if (r0 == 0) goto L_0x0181
            r17.mo25318v()
            goto L_0x0181
        L_0x006d:
            android.media.MediaCodec r0 = r12.f12816r
            android.media.MediaCodec$BufferInfo r3 = r12.f12814p
            int r0 = r0.dequeueOutputBuffer(r3, r1)
            r12.f12795I = r0
        L_0x0077:
            int r0 = r12.f12795I
            if (r0 < 0) goto L_0x00d8
            boolean r1 = r12.f12790D
            if (r1 == 0) goto L_0x008a
            r12.f12790D = r15
            android.media.MediaCodec r1 = r12.f12816r
            r1.releaseOutputBuffer(r0, r15)
            r12.f12795I = r11
            goto L_0x0182
        L_0x008a:
            android.media.MediaCodec$BufferInfo r1 = r12.f12814p
            int r2 = r1.flags
            r2 = r2 & r13
            if (r2 == 0) goto L_0x0098
            r17.mo25317u()
            r12.f12795I = r11
            goto L_0x0181
        L_0x0098:
            java.nio.ByteBuffer[] r2 = r12.f12792F
            r0 = r2[r0]
            if (r0 == 0) goto L_0x00ad
            int r1 = r1.offset
            r0.position(r1)
            android.media.MediaCodec$BufferInfo r1 = r12.f12814p
            int r2 = r1.offset
            int r1 = r1.size
            int r2 = r2 + r1
            r0.limit(r2)
        L_0x00ad:
            android.media.MediaCodec$BufferInfo r0 = r12.f12814p
            long r0 = r0.presentationTimeUs
            java.util.List<java.lang.Long> r2 = r12.f12813o
            int r2 = r2.size()
            r3 = r15
        L_0x00b8:
            if (r3 >= r2) goto L_0x00d4
            java.util.List<java.lang.Long> r4 = r12.f12813o
            java.lang.Object r4 = r4.get(r3)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x00d1
            java.util.List<java.lang.Long> r0 = r12.f12813o
            r0.remove(r3)
            r0 = r14
            goto L_0x00d5
        L_0x00d1:
            int r3 = r3 + 1
            goto L_0x00b8
        L_0x00d4:
            r0 = r15
        L_0x00d5:
            r12.f12796J = r0
            goto L_0x0129
        L_0x00d8:
            r1 = -2
            if (r0 != r1) goto L_0x010b
            android.media.MediaCodec r0 = r12.f12816r
            android.media.MediaFormat r0 = r0.getOutputFormat()
            boolean r1 = r12.f12822x
            if (r1 == 0) goto L_0x00fb
            java.lang.String r1 = "width"
            int r1 = r0.getInteger(r1)
            r2 = 32
            if (r1 != r2) goto L_0x00fb
            java.lang.String r1 = "height"
            int r1 = r0.getInteger(r1)
            if (r1 != r2) goto L_0x00fb
            r12.f12790D = r14
            goto L_0x0182
        L_0x00fb:
            boolean r1 = r12.f12788B
            if (r1 == 0) goto L_0x0104
            java.lang.String r1 = "channel-count"
            r0.setInteger(r1, r14)
        L_0x0104:
            android.media.MediaCodec r1 = r12.f12816r
            r12.mo24976a((android.media.MediaCodec) r1, (android.media.MediaFormat) r0)
            goto L_0x0182
        L_0x010b:
            r1 = -3
            if (r0 != r1) goto L_0x0118
            android.media.MediaCodec r0 = r12.f12816r
            java.nio.ByteBuffer[] r0 = r0.getOutputBuffers()
            r12.f12792F = r0
            goto L_0x0182
        L_0x0118:
            boolean r0 = r12.f12823y
            if (r0 == 0) goto L_0x0181
            boolean r0 = r12.f12802P
            if (r0 != 0) goto L_0x0125
            int r0 = r12.f12799M
            r1 = 2
            if (r0 != r1) goto L_0x0181
        L_0x0125:
            r17.mo25317u()
            goto L_0x0181
        L_0x0129:
            boolean r0 = r12.f12787A
            if (r0 == 0) goto L_0x015c
            boolean r0 = r12.f12801O
            if (r0 == 0) goto L_0x015c
            android.media.MediaCodec r5 = r12.f12816r     // Catch:{ IllegalStateException -> 0x0151 }
            java.nio.ByteBuffer[] r0 = r12.f12792F     // Catch:{ IllegalStateException -> 0x0151 }
            int r7 = r12.f12795I     // Catch:{ IllegalStateException -> 0x0151 }
            r6 = r0[r7]     // Catch:{ IllegalStateException -> 0x0151 }
            android.media.MediaCodec$BufferInfo r0 = r12.f12814p     // Catch:{ IllegalStateException -> 0x0151 }
            int r8 = r0.flags     // Catch:{ IllegalStateException -> 0x0151 }
            long r9 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0151 }
            boolean r3 = r12.f12796J     // Catch:{ IllegalStateException -> 0x0151 }
            r0 = r17
            r1 = r18
            r16 = r3
            r3 = r20
            r14 = r11
            r11 = r16
            boolean r0 = r0.mo24980a(r1, r3, r5, r6, r7, r8, r9, r11)     // Catch:{ IllegalStateException -> 0x0151 }
            goto L_0x0177
        L_0x0151:
            r17.mo25317u()
            boolean r0 = r12.f12803Q
            if (r0 == 0) goto L_0x0181
            r17.mo25318v()
            goto L_0x0181
        L_0x015c:
            r14 = r11
            android.media.MediaCodec r5 = r12.f12816r
            java.nio.ByteBuffer[] r0 = r12.f12792F
            int r7 = r12.f12795I
            r6 = r0[r7]
            android.media.MediaCodec$BufferInfo r0 = r12.f12814p
            int r8 = r0.flags
            long r9 = r0.presentationTimeUs
            boolean r11 = r12.f12796J
            r0 = r17
            r1 = r18
            r3 = r20
            boolean r0 = r0.mo24980a(r1, r3, r5, r6, r7, r8, r9, r11)
        L_0x0177:
            if (r0 == 0) goto L_0x0181
            android.media.MediaCodec$BufferInfo r0 = r12.f12814p
            long r0 = r0.presentationTimeUs
            r12.f12795I = r14
            r14 = 1
            goto L_0x0182
        L_0x0181:
            r14 = r15
        L_0x0182:
            if (r14 == 0) goto L_0x0187
            r14 = 1
            goto L_0x0047
        L_0x0187:
            boolean r0 = r17.mo25315s()
            if (r0 == 0) goto L_0x018e
            goto L_0x0187
        L_0x018e:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C4989s.m15126a()
            goto L_0x01c3
        L_0x0192:
            com.fyber.inneractive.sdk.player.exoplayer2.source.o r0 = r12.f11469e
            long r3 = r12.f11470f
            long r3 = r18 - r3
            r0.mo25136a(r3)
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r0 = r12.f12811m
            r0.mo25033a()
            com.fyber.inneractive.sdk.player.exoplayer2.j r0 = r12.f12812n
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r3 = r12.f12811m
            int r0 = r12.mo24932a((com.fyber.inneractive.sdk.player.exoplayer2.C4813j) r0, (com.fyber.inneractive.sdk.player.exoplayer2.decoder.C4643b) r3, (boolean) r15)
            if (r0 != r2) goto L_0x01b2
            com.fyber.inneractive.sdk.player.exoplayer2.j r0 = r12.f12812n
            com.fyber.inneractive.sdk.player.exoplayer2.i r0 = r0.f12776a
            r12.mo24977a((com.fyber.inneractive.sdk.player.exoplayer2.C4811i) r0)
            goto L_0x01c3
        L_0x01b2:
            if (r0 != r1) goto L_0x01c3
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.b r0 = r12.f12811m
            boolean r0 = r0.mo25034b(r13)
            com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a.m15051b(r0)
            r0 = 1
            r12.f12802P = r0
            r17.mo25317u()
        L_0x01c3:
            com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters r0 = r12.f12806T
            r0.ensureUpdated()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C4818b.mo25312a(long, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006f, code lost:
        if (r5.f12760k == r0.f12760k) goto L_0x0073;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24977a(com.fyber.inneractive.sdk.player.exoplayer2.C4811i r5) throws com.fyber.inneractive.sdk.player.exoplayer2.C4639d {
        /*
            r4 = this;
            com.fyber.inneractive.sdk.player.exoplayer2.i r0 = r4.f12815q
            r4.f12815q = r5
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a r5 = r5.f12758i
            r1 = 0
            if (r0 != 0) goto L_0x000b
            r2 = r1
            goto L_0x000d
        L_0x000b:
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a r2 = r0.f12758i
        L_0x000d:
            boolean r5 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.m15140a((java.lang.Object) r5, (java.lang.Object) r2)
            r2 = 1
            r5 = r5 ^ r2
            if (r5 == 0) goto L_0x0047
            com.fyber.inneractive.sdk.player.exoplayer2.i r5 = r4.f12815q
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a r5 = r5.f12758i
            if (r5 == 0) goto L_0x0045
            com.fyber.inneractive.sdk.player.exoplayer2.drm.c<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> r5 = r4.f12808j
            if (r5 == 0) goto L_0x0037
            android.os.Looper r1 = android.os.Looper.myLooper()
            com.fyber.inneractive.sdk.player.exoplayer2.i r3 = r4.f12815q
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a r3 = r3.f12758i
            com.fyber.inneractive.sdk.player.exoplayer2.drm.b r5 = r5.mo25052a(r1, r3)
            r4.f12818t = r5
            com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> r1 = r4.f12817s
            if (r5 != r1) goto L_0x0047
            com.fyber.inneractive.sdk.player.exoplayer2.drm.c<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> r1 = r4.f12808j
            r1.mo25053a(r5)
            goto L_0x0047
        L_0x0037:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Media requires a DrmSessionManager"
            r5.<init>(r0)
            int r0 = r4.f11467c
            com.fyber.inneractive.sdk.player.exoplayer2.d r5 = com.fyber.inneractive.sdk.player.exoplayer2.C4639d.m14206a(r5, r0)
            throw r5
        L_0x0045:
            r4.f12818t = r1
        L_0x0047:
            com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> r5 = r4.f12818t
            com.fyber.inneractive.sdk.player.exoplayer2.drm.b<com.fyber.inneractive.sdk.player.exoplayer2.drm.d> r1 = r4.f12817s
            if (r5 != r1) goto L_0x0076
            android.media.MediaCodec r5 = r4.f12816r
            if (r5 == 0) goto L_0x0076
            boolean r1 = r4.f12819u
            com.fyber.inneractive.sdk.player.exoplayer2.i r3 = r4.f12815q
            boolean r5 = r4.mo25314a((android.media.MediaCodec) r5, (boolean) r1, (com.fyber.inneractive.sdk.player.exoplayer2.C4811i) r0, (com.fyber.inneractive.sdk.player.exoplayer2.C4811i) r3)
            if (r5 == 0) goto L_0x0076
            r4.f12797K = r2
            r4.f12798L = r2
            boolean r5 = r4.f12822x
            if (r5 == 0) goto L_0x0072
            com.fyber.inneractive.sdk.player.exoplayer2.i r5 = r4.f12815q
            int r1 = r5.f12759j
            int r3 = r0.f12759j
            if (r1 != r3) goto L_0x0072
            int r5 = r5.f12760k
            int r0 = r0.f12760k
            if (r5 != r0) goto L_0x0072
            goto L_0x0073
        L_0x0072:
            r2 = 0
        L_0x0073:
            r4.f12789C = r2
            goto L_0x0083
        L_0x0076:
            boolean r5 = r4.f12800N
            if (r5 == 0) goto L_0x007d
            r4.f12799M = r2
            goto L_0x0083
        L_0x007d:
            r4.mo25318v()
            r4.mo25316t()
        L_0x0083:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C4818b.mo24977a(com.fyber.inneractive.sdk.player.exoplayer2.i):void");
    }
}
