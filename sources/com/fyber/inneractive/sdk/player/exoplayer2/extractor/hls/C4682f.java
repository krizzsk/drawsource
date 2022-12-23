package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import com.fyber.inneractive.sdk.player.exoplayer2.C4811i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4657b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4665f;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4672g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4673h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4691a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.C4722b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p189ts.C4766a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p189ts.C4768c;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.C4828a;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.C4843g;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.C4847i;
import com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.C4865d;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4938g;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4942j;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4978k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4988r;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f */
public final class C4682f extends C4865d {

    /* renamed from: G */
    public static final AtomicInteger f11763G = new AtomicInteger();

    /* renamed from: A */
    public int f11764A;

    /* renamed from: B */
    public int f11765B;

    /* renamed from: C */
    public boolean f11766C;

    /* renamed from: D */
    public C4686j f11767D;

    /* renamed from: E */
    public volatile boolean f11768E;

    /* renamed from: F */
    public volatile boolean f11769F;

    /* renamed from: j */
    public final int f11770j;

    /* renamed from: k */
    public final int f11771k;

    /* renamed from: l */
    public final C4691a.C4692a f11772l;

    /* renamed from: m */
    public final C4938g f11773m;

    /* renamed from: n */
    public final C4942j f11774n;

    /* renamed from: o */
    public final boolean f11775o = (this.f12907h instanceof C4674a);

    /* renamed from: p */
    public final boolean f11776p;

    /* renamed from: q */
    public final C4988r f11777q;

    /* renamed from: r */
    public final String f11778r;

    /* renamed from: s */
    public final C4665f f11779s;

    /* renamed from: t */
    public final boolean f11780t;

    /* renamed from: u */
    public final boolean f11781u;

    /* renamed from: v */
    public final List<C4811i> f11782v;

    /* renamed from: w */
    public final boolean f11783w;

    /* renamed from: x */
    public final C4843g f11784x;

    /* renamed from: y */
    public final C4978k f11785y;

    /* renamed from: z */
    public C4665f f11786z;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C4682f(com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4938g r17, com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4942j r18, com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4942j r19, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C4691a.C4692a r20, java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.C4811i> r21, int r22, java.lang.Object r23, long r24, long r26, int r28, int r29, boolean r30, com.fyber.inneractive.sdk.player.exoplayer2.util.C4988r r31, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C4682f r32, byte[] r33, byte[] r34) {
        /*
            r16 = this;
            r11 = r16
            r12 = r17
            r13 = r20
            r14 = r29
            r15 = r32
            r0 = r33
            r1 = r34
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.g r1 = m14304a(r12, r0, r1)
            com.fyber.inneractive.sdk.player.exoplayer2.i r3 = r13.f11851b
            r0 = r16
            r2 = r18
            r4 = r22
            r5 = r23
            r6 = r24
            r8 = r26
            r10 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10)
            r11.f11771k = r14
            r0 = r19
            r11.f11774n = r0
            r11.f11772l = r13
            r0 = r21
            r11.f11782v = r0
            r0 = r30
            r11.f11776p = r0
            r0 = r31
            r11.f11777q = r0
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.g r0 = r11.f12907h
            boolean r0 = r0 instanceof com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C4674a
            r11.f11775o = r0
            r0 = r18
            android.net.Uri r0 = r0.f13126a
            java.lang.String r0 = r0.getLastPathSegment()
            r11.f11778r = r0
            java.lang.String r1 = ".aac"
            boolean r1 = r0.endsWith(r1)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x006e
            java.lang.String r1 = ".ac3"
            boolean r1 = r0.endsWith(r1)
            if (r1 != 0) goto L_0x006e
            java.lang.String r1 = ".ec3"
            boolean r1 = r0.endsWith(r1)
            if (r1 != 0) goto L_0x006e
            java.lang.String r1 = ".mp3"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L_0x006c
            goto L_0x006e
        L_0x006c:
            r0 = r2
            goto L_0x006f
        L_0x006e:
            r0 = r3
        L_0x006f:
            r11.f11783w = r0
            if (r15 == 0) goto L_0x0092
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.g r0 = r15.f11784x
            r11.f11784x = r0
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r0 = r15.f11785y
            r11.f11785y = r0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.f r0 = r15.f11786z
            r11.f11779s = r0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a$a r0 = r15.f11772l
            if (r0 == r13) goto L_0x0085
            r0 = r3
            goto L_0x0086
        L_0x0085:
            r0 = r2
        L_0x0086:
            r11.f11780t = r0
            int r1 = r15.f11771k
            if (r1 != r14) goto L_0x008e
            if (r0 == 0) goto L_0x008f
        L_0x008e:
            r2 = r3
        L_0x008f:
            r11.f11781u = r2
            goto L_0x00b1
        L_0x0092:
            r1 = 0
            if (r0 == 0) goto L_0x009b
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.g r4 = new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.g
            r4.<init>()
            goto L_0x009c
        L_0x009b:
            r4 = r1
        L_0x009c:
            r11.f11784x = r4
            if (r0 == 0) goto L_0x00a8
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r0 = new com.fyber.inneractive.sdk.player.exoplayer2.util.k
            r4 = 10
            r0.<init>((int) r4)
            goto L_0x00a9
        L_0x00a8:
            r0 = r1
        L_0x00a9:
            r11.f11785y = r0
            r11.f11779s = r1
            r11.f11780t = r2
            r11.f11781u = r3
        L_0x00b1:
            r11.f11773m = r12
            java.util.concurrent.atomic.AtomicInteger r0 = f11763G
            int r0 = r0.getAndIncrement()
            r11.f11770j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C4682f.<init>(com.fyber.inneractive.sdk.player.exoplayer2.upstream.g, com.fyber.inneractive.sdk.player.exoplayer2.upstream.j, com.fyber.inneractive.sdk.player.exoplayer2.upstream.j, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a$a, java.util.List, int, java.lang.Object, long, long, int, int, boolean, com.fyber.inneractive.sdk.player.exoplayer2.util.r, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.f, byte[], byte[]):void");
    }

    /* renamed from: a */
    public boolean mo25110a() {
        return this.f11768E;
    }

    /* renamed from: b */
    public void mo25111b() {
        this.f11768E = true;
    }

    /* renamed from: c */
    public long mo25112c() {
        return (long) this.f11765B;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01ab A[Catch:{ all -> 0x01d6, all -> 0x01f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01c4 A[Catch:{ all -> 0x01d6, all -> 0x01f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01cb A[SYNTHETIC, Splitter:B:126:0x01cb] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0164  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void load() throws java.io.IOException, java.lang.InterruptedException {
        /*
            r14 = this;
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.f r0 = r14.f11786z
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L_0x00ec
            boolean r0 = r14.f11783w
            if (r0 != 0) goto L_0x00ec
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a$a r0 = r14.f11772l
            com.fyber.inneractive.sdk.player.exoplayer2.i r0 = r0.f11851b
            java.lang.String r0 = r0.f12755f
            java.lang.String r4 = "text/vtt"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x00d7
            java.lang.String r0 = r14.f11778r
            java.lang.String r4 = ".webvtt"
            boolean r0 = r0.endsWith(r4)
            if (r0 != 0) goto L_0x00d7
            java.lang.String r0 = r14.f11778r
            java.lang.String r4 = ".vtt"
            boolean r0 = r0.endsWith(r4)
            if (r0 == 0) goto L_0x002f
            goto L_0x00d7
        L_0x002f:
            boolean r0 = r14.f11781u
            if (r0 != 0) goto L_0x0038
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.f r0 = r14.f11779s
            r4 = r3
            goto L_0x00e3
        L_0x0038:
            java.lang.String r0 = r14.f11778r
            java.lang.String r4 = ".mp4"
            boolean r0 = r0.endsWith(r4)
            if (r0 != 0) goto L_0x00cf
            java.lang.String r0 = r14.f11778r
            int r4 = r0.length()
            int r4 = r4 + -4
            java.lang.String r5 = ".m4"
            boolean r0 = r0.startsWith(r5, r4)
            if (r0 == 0) goto L_0x0054
            goto L_0x00cf
        L_0x0054:
            r0 = 16
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.i> r4 = r14.f11782v
            if (r4 == 0) goto L_0x005d
            r0 = 48
            goto L_0x0061
        L_0x005d:
            java.util.List r4 = java.util.Collections.emptyList()
        L_0x0061:
            com.fyber.inneractive.sdk.player.exoplayer2.i r5 = r14.f12902c
            java.lang.String r5 = r5.f12752c
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x00bf
            java.lang.String r6 = "audio/mp4a-latm"
            if (r5 != 0) goto L_0x0070
            goto L_0x008c
        L_0x0070:
            java.lang.String r7 = ","
            java.lang.String[] r7 = r5.split(r7)
            int r8 = r7.length
            r9 = r3
        L_0x0078:
            if (r9 >= r8) goto L_0x008c
            r10 = r7[r9]
            java.lang.String r10 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4973h.m15062a(r10)
            if (r10 == 0) goto L_0x0089
            boolean r11 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4973h.m15065d(r10)
            if (r11 == 0) goto L_0x0089
            goto L_0x008d
        L_0x0089:
            int r9 = r9 + 1
            goto L_0x0078
        L_0x008c:
            r10 = r1
        L_0x008d:
            boolean r6 = r6.equals(r10)
            if (r6 != 0) goto L_0x0095
            r0 = r0 | 2
        L_0x0095:
            java.lang.String r6 = "video/avc"
            if (r5 != 0) goto L_0x009a
            goto L_0x00b6
        L_0x009a:
            java.lang.String r7 = ","
            java.lang.String[] r5 = r5.split(r7)
            int r7 = r5.length
            r8 = r3
        L_0x00a2:
            if (r8 >= r7) goto L_0x00b6
            r9 = r5[r8]
            java.lang.String r9 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4973h.m15062a(r9)
            if (r9 == 0) goto L_0x00b3
            boolean r10 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4973h.m15066e(r9)
            if (r10 == 0) goto L_0x00b3
            goto L_0x00b7
        L_0x00b3:
            int r8 = r8 + 1
            goto L_0x00a2
        L_0x00b6:
            r9 = r1
        L_0x00b7:
            boolean r5 = r6.equals(r9)
            if (r5 != 0) goto L_0x00bf
            r0 = r0 | 4
        L_0x00bf:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.u r5 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.u
            com.fyber.inneractive.sdk.player.exoplayer2.util.r r6 = r14.f11777q
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.e r7 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.e
            r7.<init>(r0, r4)
            r0 = 2
            r5.<init>(r0, r6, r7)
            r4 = r2
            r0 = r5
            goto L_0x00e3
        L_0x00cf:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d r0 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d
            com.fyber.inneractive.sdk.player.exoplayer2.util.r r4 = r14.f11777q
            r0.<init>(r3, r4, r1)
            goto L_0x00e2
        L_0x00d7:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l r0 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l
            com.fyber.inneractive.sdk.player.exoplayer2.i r4 = r14.f12902c
            java.lang.String r4 = r4.f12774y
            com.fyber.inneractive.sdk.player.exoplayer2.util.r r5 = r14.f11777q
            r0.<init>(r4, r5)
        L_0x00e2:
            r4 = r2
        L_0x00e3:
            if (r4 == 0) goto L_0x00ea
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.j r4 = r14.f11767D
            r0.mo25090a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4673h) r4)
        L_0x00ea:
            r14.f11786z = r0
        L_0x00ec:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.f r0 = r14.f11779s
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.f r4 = r14.f11786z
            if (r0 == r4) goto L_0x0142
            boolean r0 = r14.f11766C
            if (r0 != 0) goto L_0x0142
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.j r0 = r14.f11774n
            if (r0 != 0) goto L_0x00fb
            goto L_0x0142
        L_0x00fb:
            int r4 = r14.f11764A
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.j r0 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.m15136a((com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4942j) r0, (int) r4)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r10 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.b     // Catch:{ all -> 0x013b }
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.g r5 = r14.f11773m     // Catch:{ all -> 0x013b }
            long r6 = r0.f13128c     // Catch:{ all -> 0x013b }
            long r8 = r5.mo24756a(r0)     // Catch:{ all -> 0x013b }
            r4 = r10
            r4.<init>(r5, r6, r8)     // Catch:{ all -> 0x013b }
            r0 = r3
        L_0x0110:
            if (r0 != 0) goto L_0x0129
            boolean r0 = r14.f11768E     // Catch:{ all -> 0x011d }
            if (r0 != 0) goto L_0x0129
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.f r0 = r14.f11786z     // Catch:{ all -> 0x011d }
            int r0 = r0.mo25088a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4672g) r10, (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4708l) r1)     // Catch:{ all -> 0x011d }
            goto L_0x0110
        L_0x011d:
            r0 = move-exception
            long r1 = r10.f11670c     // Catch:{ all -> 0x013b }
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.j r3 = r14.f11774n     // Catch:{ all -> 0x013b }
            long r3 = r3.f13128c     // Catch:{ all -> 0x013b }
            long r1 = r1 - r3
            int r1 = (int) r1     // Catch:{ all -> 0x013b }
            r14.f11764A = r1     // Catch:{ all -> 0x013b }
            throw r0     // Catch:{ all -> 0x013b }
        L_0x0129:
            long r4 = r10.f11670c     // Catch:{ all -> 0x013b }
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.j r0 = r14.f11774n     // Catch:{ all -> 0x013b }
            long r6 = r0.f13128c     // Catch:{ all -> 0x013b }
            long r4 = r4 - r6
            int r0 = (int) r4     // Catch:{ all -> 0x013b }
            r14.f11764A = r0     // Catch:{ all -> 0x013b }
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.g r0 = r14.f12907h
            com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.m15137a((com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4938g) r0)
            r14.f11766C = r2
            goto L_0x0142
        L_0x013b:
            r0 = move-exception
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.g r1 = r14.f12907h
            com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.m15137a((com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4938g) r1)
            throw r0
        L_0x0142:
            boolean r0 = r14.f11768E
            if (r0 != 0) goto L_0x01fb
            boolean r0 = r14.f11775o
            if (r0 == 0) goto L_0x0152
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.j r0 = r14.f12900a
            int r4 = r14.f11765B
            if (r4 == 0) goto L_0x015a
            r4 = r2
            goto L_0x015b
        L_0x0152:
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.j r0 = r14.f12900a
            int r4 = r14.f11765B
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.j r0 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.m15136a((com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4942j) r0, (int) r4)
        L_0x015a:
            r4 = r3
        L_0x015b:
            boolean r5 = r14.f11776p
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r5 != 0) goto L_0x0176
            com.fyber.inneractive.sdk.player.exoplayer2.util.r r5 = r14.f11777q
            monitor-enter(r5)
        L_0x0167:
            long r8 = r5.f13269c     // Catch:{ all -> 0x0173 }
            int r8 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0171
            r5.wait()     // Catch:{ all -> 0x0173 }
            goto L_0x0167
        L_0x0171:
            monitor-exit(r5)
            goto L_0x0199
        L_0x0173:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0176:
            com.fyber.inneractive.sdk.player.exoplayer2.util.r r5 = r14.f11777q
            long r8 = r5.f13267a
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L_0x0199
            long r8 = r14.f12905f
            monitor-enter(r5)
            long r10 = r5.f13269c     // Catch:{ all -> 0x0196 }
            int r10 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x018e
            r10 = r2
            goto L_0x018f
        L_0x018e:
            r10 = r3
        L_0x018f:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a.m15051b(r10)     // Catch:{ all -> 0x0196 }
            r5.f13267a = r8     // Catch:{ all -> 0x0196 }
            monitor-exit(r5)
            goto L_0x0199
        L_0x0196:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0199:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r5 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.b     // Catch:{ all -> 0x01f4 }
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.g r9 = r14.f12907h     // Catch:{ all -> 0x01f4 }
            long r10 = r0.f13128c     // Catch:{ all -> 0x01f4 }
            long r12 = r9.mo24756a(r0)     // Catch:{ all -> 0x01f4 }
            r8 = r5
            r8.<init>(r9, r10, r12)     // Catch:{ all -> 0x01f4 }
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.f r0 = r14.f11786z     // Catch:{ all -> 0x01f4 }
            if (r0 != 0) goto L_0x01c2
            long r8 = r14.mo25108a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4672g) r5)     // Catch:{ all -> 0x01f4 }
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x01ba
            com.fyber.inneractive.sdk.player.exoplayer2.util.r r0 = r14.f11777q     // Catch:{ all -> 0x01f4 }
            long r6 = r0.mo25560b(r8)     // Catch:{ all -> 0x01f4 }
            goto L_0x01bc
        L_0x01ba:
            long r6 = r14.f12905f     // Catch:{ all -> 0x01f4 }
        L_0x01bc:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.f r0 = r14.mo25109a((long) r6)     // Catch:{ all -> 0x01f4 }
            r14.f11786z = r0     // Catch:{ all -> 0x01f4 }
        L_0x01c2:
            if (r4 == 0) goto L_0x01c9
            int r0 = r14.f11765B     // Catch:{ all -> 0x01f4 }
            r5.mo25064c(r0)     // Catch:{ all -> 0x01f4 }
        L_0x01c9:
            if (r3 != 0) goto L_0x01e2
            boolean r0 = r14.f11768E     // Catch:{ all -> 0x01d6 }
            if (r0 != 0) goto L_0x01e2
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.f r0 = r14.f11786z     // Catch:{ all -> 0x01d6 }
            int r3 = r0.mo25088a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4672g) r5, (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4708l) r1)     // Catch:{ all -> 0x01d6 }
            goto L_0x01c9
        L_0x01d6:
            r0 = move-exception
            long r1 = r5.f11670c     // Catch:{ all -> 0x01f4 }
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.j r3 = r14.f12900a     // Catch:{ all -> 0x01f4 }
            long r3 = r3.f13128c     // Catch:{ all -> 0x01f4 }
            long r1 = r1 - r3
            int r1 = (int) r1     // Catch:{ all -> 0x01f4 }
            r14.f11765B = r1     // Catch:{ all -> 0x01f4 }
            throw r0     // Catch:{ all -> 0x01f4 }
        L_0x01e2:
            long r0 = r5.f11670c     // Catch:{ all -> 0x01f4 }
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.j r3 = r14.f12900a     // Catch:{ all -> 0x01f4 }
            long r3 = r3.f13128c     // Catch:{ all -> 0x01f4 }
            long r0 = r0 - r3
            int r0 = (int) r0     // Catch:{ all -> 0x01f4 }
            r14.f11765B = r0     // Catch:{ all -> 0x01f4 }
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.g r0 = r14.f12907h
            com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.m15137a((com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4938g) r0)
            r14.f11769F = r2
            goto L_0x01fb
        L_0x01f4:
            r0 = move-exception
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.g r1 = r14.f12907h
            com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.m15137a((com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4938g) r1)
            throw r0
        L_0x01fb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C4682f.load():void");
    }

    /* renamed from: a */
    public final long mo25108a(C4672g gVar) throws IOException, InterruptedException {
        C4828a a;
        C4657b bVar = (C4657b) gVar;
        bVar.f11672e = 0;
        if (!bVar.mo25061a(this.f11785y.f13243a, 0, 10, true)) {
            return -9223372036854775807L;
        }
        this.f11785y.mo25521c(10);
        if (this.f11785y.mo25535n() != C4843g.f12861b) {
            return -9223372036854775807L;
        }
        this.f11785y.mo25527f(3);
        int k = this.f11785y.mo25532k();
        int i = k + 10;
        if (i > this.f11785y.mo25518b()) {
            C4978k kVar = this.f11785y;
            byte[] bArr = kVar.f13243a;
            kVar.mo25521c(i);
            System.arraycopy(bArr, 0, this.f11785y.f13243a, 0, 10);
        }
        if (!bVar.mo25061a(this.f11785y.f13243a, 10, k, true) || (a = this.f11784x.mo25364a(this.f11785y.f13243a, k)) == null) {
            return -9223372036854775807L;
        }
        for (C4828a.C4830b bVar2 : a.f12837a) {
            if (bVar2 instanceof C4847i) {
                C4847i iVar = (C4847i) bVar2;
                if (HlsMediaChunk.PRIV_TIMESTAMP_FRAME_OWNER.equals(iVar.f12867b)) {
                    System.arraycopy(iVar.f12868c, 0, this.f11785y.f13243a, 0, 8);
                    this.f11785y.mo25521c(8);
                    return this.f11785y.mo25530i();
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: a */
    public static C4938g m14304a(C4938g gVar, byte[] bArr, byte[] bArr2) {
        return (bArr == null || bArr2 == null) ? gVar : new C4674a(gVar, bArr, bArr2);
    }

    /* renamed from: a */
    public final C4665f mo25109a(long j) {
        C4665f fVar;
        if (this.f11778r.endsWith(".aac")) {
            fVar = new C4768c(j);
        } else if (this.f11778r.endsWith(".ac3") || this.f11778r.endsWith(".ec3")) {
            fVar = new C4766a(j);
        } else if (this.f11778r.endsWith(".mp3")) {
            fVar = new C4722b(0, j);
        } else {
            throw new IllegalArgumentException("Unkown extension for audio file: " + this.f11778r);
        }
        fVar.mo25090a((C4673h) this.f11767D);
        return fVar;
    }
}
