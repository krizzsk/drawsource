package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

import com.fyber.inneractive.sdk.player.exoplayer2.C4815l;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4657b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4665f;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4672g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4673h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4705j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4707k;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4709m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4746n;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.C4828a;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.C4843g;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4978k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b */
public final class C4722b implements C4665f {

    /* renamed from: m */
    public static final int f12061m = C4991u.m15133a("Xing");

    /* renamed from: n */
    public static final int f12062n = C4991u.m15133a("Info");

    /* renamed from: o */
    public static final int f12063o = C4991u.m15133a("VBRI");

    /* renamed from: a */
    public final long f12064a;

    /* renamed from: b */
    public final C4978k f12065b = new C4978k(10);

    /* renamed from: c */
    public final C4707k f12066c = new C4707k();

    /* renamed from: d */
    public final C4705j f12067d = new C4705j();

    /* renamed from: e */
    public C4673h f12068e;

    /* renamed from: f */
    public C4746n f12069f;

    /* renamed from: g */
    public int f12070g;

    /* renamed from: h */
    public C4828a f12071h;

    /* renamed from: i */
    public C4723a f12072i;

    /* renamed from: j */
    public long f12073j = -9223372036854775807L;

    /* renamed from: k */
    public long f12074k;

    /* renamed from: l */
    public int f12075l;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b$a */
    public interface C4723a extends C4709m {
        /* renamed from: b */
        long mo25182b(long j);
    }

    public C4722b(int i, long j) {
        this.f12064a = j;
    }

    /* renamed from: a */
    public static boolean m14429a(int i, long j) {
        return ((long) (i & -128000)) == (j & -128000);
    }

    /* renamed from: a */
    public boolean mo25091a(C4672g gVar) throws IOException, InterruptedException {
        return mo25183a(gVar, true);
    }

    /* renamed from: b */
    public final C4723a mo25184b(C4672g gVar) throws IOException, InterruptedException {
        C4657b bVar = (C4657b) gVar;
        bVar.mo25061a(this.f12065b.f13243a, 0, 4, false);
        this.f12065b.mo25525e(0);
        C4707k.m14391a(this.f12065b.mo25520c(), this.f12066c);
        return new C4721a(bVar.f11670c, this.f12066c.f11942f, bVar.f11669b);
    }

    /* renamed from: b */
    public void mo25092b() {
    }

    /* renamed from: a */
    public void mo25090a(C4673h hVar) {
        this.f12068e = hVar;
        this.f12069f = hVar.mo25098a(0, 1);
        this.f12068e.mo25100c();
    }

    /* renamed from: a */
    public void mo25089a(long j, long j2) {
        this.f12070g = 0;
        this.f12073j = -9223372036854775807L;
        this.f12074k = 0;
        this.f12075l = 0;
    }

    /* JADX WARNING: type inference failed for: r16v2, types: [com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b$a] */
    /* JADX WARNING: type inference failed for: r1v28, types: [com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.c] */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0057, code lost:
        if (r12 != f12062n) goto L_0x005a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01fd  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo25088a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4672g r36, com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4708l r37) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r35 = this;
            r0 = r35
            r1 = r36
            int r2 = r0.f12070g
            r3 = -1
            r4 = 0
            if (r2 != 0) goto L_0x000f
            r0.mo25183a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4672g) r1, (boolean) r4)     // Catch:{ EOFException -> 0x000e }
            goto L_0x000f
        L_0x000e:
            return r3
        L_0x000f:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b$a r2 = r0.f12072i
            r7 = 1000000(0xf4240, double:4.940656E-318)
            r10 = 1
            if (r2 != 0) goto L_0x0240
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r2 = new com.fyber.inneractive.sdk.player.exoplayer2.util.k
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.k r11 = r0.f12066c
            int r11 = r11.f11939c
            r2.<init>((int) r11)
            byte[] r11 = r2.f13243a
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.k r12 = r0.f12066c
            int r12 = r12.f11939c
            r13 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r13 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4657b) r13
            r13.mo25061a(r11, r4, r12, r4)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.k r11 = r0.f12066c
            int r12 = r11.f11937a
            r12 = r12 & r10
            r14 = 36
            if (r12 == 0) goto L_0x003b
            int r11 = r11.f11941e
            if (r11 == r10) goto L_0x003f
            r11 = r14
            goto L_0x0044
        L_0x003b:
            int r11 = r11.f11941e
            if (r11 == r10) goto L_0x0042
        L_0x003f:
            r11 = 21
            goto L_0x0044
        L_0x0042:
            r11 = 13
        L_0x0044:
            int r12 = r2.f13245c
            int r15 = r11 + 4
            if (r12 < r15) goto L_0x005a
            r2.mo25525e(r11)
            int r12 = r2.mo25520c()
            int r15 = f12061m
            if (r12 == r15) goto L_0x006e
            int r15 = f12062n
            if (r12 != r15) goto L_0x005a
            goto L_0x006e
        L_0x005a:
            int r12 = r2.f13245c
            r15 = 40
            if (r12 < r15) goto L_0x006d
            r2.mo25525e(r14)
            int r12 = r2.mo25520c()
            int r14 = f12063o
            if (r12 != r14) goto L_0x006d
            r12 = r14
            goto L_0x006e
        L_0x006d:
            r12 = r4
        L_0x006e:
            int r14 = f12061m
            r16 = 0
            if (r12 == r14) goto L_0x0133
            int r14 = f12062n
            if (r12 != r14) goto L_0x007a
            goto L_0x0133
        L_0x007a:
            int r11 = f12063o
            if (r12 != r11) goto L_0x012b
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.k r11 = r0.f12066c
            long r9 = r13.f11670c
            long r14 = r13.f11669b
            r12 = 10
            r2.mo25527f(r12)
            int r12 = r2.mo25520c()
            if (r12 > 0) goto L_0x0093
            r24 = r13
            goto L_0x0121
        L_0x0093:
            int r3 = r11.f11940d
            long r4 = (long) r12
            r6 = 32000(0x7d00, float:4.4842E-41)
            if (r3 < r6) goto L_0x009d
            r6 = 1152(0x480, float:1.614E-42)
            goto L_0x009f
        L_0x009d:
            r6 = 576(0x240, float:8.07E-43)
        L_0x009f:
            r24 = r13
            long r12 = (long) r6
            long r20 = r12 * r7
            long r12 = (long) r3
            r18 = r4
            r22 = r12
            long r3 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.m15135a((long) r18, (long) r20, (long) r22)
            int r5 = r2.mo25538q()
            int r6 = r2.mo25538q()
            int r12 = r2.mo25538q()
            r13 = 2
            r2.mo25527f(r13)
            int r11 = r11.f11939c
            long r7 = (long) r11
            long r9 = r9 + r7
            int r7 = r5 + 1
            long[] r8 = new long[r7]
            long[] r11 = new long[r7]
            r20 = 0
            r22 = 0
            r8[r22] = r20
            r11[r22] = r9
            r13 = 1
        L_0x00d0:
            if (r13 >= r7) goto L_0x011a
            r21 = r7
            r7 = 1
            if (r12 == r7) goto L_0x00f0
            r7 = 2
            if (r12 == r7) goto L_0x00eb
            r7 = 3
            if (r12 == r7) goto L_0x00e6
            r7 = 4
            if (r12 == r7) goto L_0x00e1
            goto L_0x0121
        L_0x00e1:
            int r7 = r2.mo25536o()
            goto L_0x00f4
        L_0x00e6:
            int r7 = r2.mo25535n()
            goto L_0x00f4
        L_0x00eb:
            int r7 = r2.mo25538q()
            goto L_0x00f4
        L_0x00f0:
            int r7 = r2.mo25533l()
        L_0x00f4:
            int r7 = r7 * r6
            r22 = r6
            long r6 = (long) r7
            long r9 = r9 + r6
            long r6 = (long) r13
            long r6 = r6 * r3
            r23 = r2
            long r1 = (long) r5
            long r6 = r6 / r1
            r8[r13] = r6
            r1 = -1
            int r1 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0109
            r1 = r9
            goto L_0x010d
        L_0x0109:
            long r1 = java.lang.Math.min(r14, r9)
        L_0x010d:
            r11[r13] = r1
            int r13 = r13 + 1
            r1 = r36
            r7 = r21
            r6 = r22
            r2 = r23
            goto L_0x00d0
        L_0x011a:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.c r1 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.c
            r1.<init>(r8, r11, r3)
            r16 = r1
        L_0x0121:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.k r1 = r0.f12066c
            int r1 = r1.f11939c
            r2 = r24
            r2.mo25064c(r1)
            goto L_0x012f
        L_0x012b:
            r1 = r4
            r2 = r13
            r2.f11672e = r1
        L_0x012f:
            r1 = r16
            goto L_0x01f5
        L_0x0133:
            r23 = r2
            r2 = r13
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.k r1 = r0.f12066c
            long r3 = r2.f11670c
            long r5 = r2.f11669b
            int r7 = r1.f11943g
            int r8 = r1.f11940d
            int r9 = r1.f11939c
            long r9 = (long) r9
            long r25 = r3 + r9
            int r3 = r23.mo25520c()
            r4 = r3 & 1
            r9 = 1
            if (r4 != r9) goto L_0x01a6
            int r4 = r23.mo25536o()
            if (r4 != 0) goto L_0x0155
            goto L_0x01a6
        L_0x0155:
            long r9 = (long) r4
            long r14 = (long) r7
            r18 = 1000000(0xf4240, double:4.940656E-318)
            long r29 = r14 * r18
            long r7 = (long) r8
            r27 = r9
            r31 = r7
            long r27 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.m15135a((long) r27, (long) r29, (long) r31)
            r4 = 6
            r3 = r3 & r4
            if (r3 == r4) goto L_0x0179
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.d r16 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.d
            r31 = 0
            r32 = 0
            r34 = 0
            r24 = r16
            r29 = r5
            r24.<init>(r25, r27, r29, r31, r32, r34)
            goto L_0x01a6
        L_0x0179:
            int r3 = r23.mo25536o()
            long r3 = (long) r3
            r7 = r23
            r8 = 1
            r7.mo25527f(r8)
            r8 = 99
            long[] r9 = new long[r8]
            r10 = 0
        L_0x0189:
            if (r10 >= r8) goto L_0x0195
            int r13 = r7.mo25533l()
            long r14 = (long) r13
            r9[r10] = r14
            int r10 = r10 + 1
            goto L_0x0189
        L_0x0195:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.d r16 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.d
            int r1 = r1.f11939c
            r24 = r16
            r29 = r5
            r31 = r9
            r32 = r3
            r34 = r1
            r24.<init>(r25, r27, r29, r31, r32, r34)
        L_0x01a6:
            if (r16 == 0) goto L_0x01dc
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.j r1 = r0.f12067d
            boolean r1 = r1.mo25161a()
            if (r1 != 0) goto L_0x01dc
            r1 = 0
            r2.f11672e = r1
            int r11 = r11 + 141
            r2.mo25060a(r11, r1)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r3 = r0.f12065b
            byte[] r3 = r3.f13243a
            r4 = 3
            r2.mo25061a(r3, r1, r4, r1)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r3 = r0.f12065b
            r3.mo25525e(r1)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.j r1 = r0.f12067d
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r3 = r0.f12065b
            int r3 = r3.mo25535n()
            r1.getClass()
            int r4 = r3 >> 12
            r3 = r3 & 4095(0xfff, float:5.738E-42)
            if (r4 > 0) goto L_0x01d8
            if (r3 <= 0) goto L_0x01dc
        L_0x01d8:
            r1.f11928a = r4
            r1.f11929b = r3
        L_0x01dc:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.k r1 = r0.f12066c
            int r1 = r1.f11939c
            r2.mo25064c(r1)
            if (r16 == 0) goto L_0x012f
            boolean r1 = r16.mo25055a()
            if (r1 != 0) goto L_0x012f
            int r1 = f12062n
            if (r12 != r1) goto L_0x012f
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b$a r16 = r35.mo25184b(r36)
            goto L_0x012f
        L_0x01f5:
            r0.f12072i = r1
            if (r1 == 0) goto L_0x01fd
            r1.mo25055a()
            goto L_0x0203
        L_0x01fd:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b$a r1 = r35.mo25184b(r36)
            r0.f12072i = r1
        L_0x0203:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.h r1 = r0.f12068e
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b$a r2 = r0.f12072i
            r1.mo25099a(r2)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r1 = r0.f12069f
            r2 = 0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.k r3 = r0.f12066c
            java.lang.String r4 = r3.f11938b
            r5 = 0
            r6 = -1
            r7 = 4096(0x1000, float:5.74E-42)
            int r8 = r3.f11941e
            int r9 = r3.f11940d
            r10 = -1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.j r3 = r0.f12067d
            int r11 = r3.f11928a
            int r12 = r3.f11929b
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.a r3 = r0.f12071h
            r17 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r14
            r14 = r15
            r15 = r16
            r16 = r17
            com.fyber.inneractive.sdk.player.exoplayer2.i r2 = com.fyber.inneractive.sdk.player.exoplayer2.C4811i.m14721a((java.lang.String) r2, (java.lang.String) r3, (java.lang.String) r4, (int) r5, (int) r6, (int) r7, (int) r8, (int) r9, (int) r10, (int) r11, (java.util.List<byte[]>) r12, (com.fyber.inneractive.sdk.player.exoplayer2.drm.C4644a) r13, (int) r14, (java.lang.String) r15, (com.fyber.inneractive.sdk.player.exoplayer2.metadata.C4828a) r16)
            r1.mo25074a(r2)
        L_0x0240:
            int r1 = r0.f12075l
            if (r1 != 0) goto L_0x02b5
            r1 = r36
            r2 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4657b) r2
            r3 = 0
            r2.f11672e = r3
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r4 = r0.f12065b
            byte[] r4 = r4.f13243a
            r5 = 4
            r6 = 1
            boolean r4 = r2.mo25061a(r4, r3, r5, r6)
            if (r4 != 0) goto L_0x025a
            r2 = -1
            goto L_0x02c3
        L_0x025a:
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r4 = r0.f12065b
            r4.mo25525e(r3)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r3 = r0.f12065b
            int r3 = r3.mo25520c()
            int r4 = r0.f12070g
            long r4 = (long) r4
            boolean r4 = m14429a((int) r3, (long) r4)
            if (r4 == 0) goto L_0x02ad
            int r4 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4707k.m14390a(r3)
            r5 = -1
            if (r4 != r5) goto L_0x0276
            goto L_0x02ad
        L_0x0276:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.k r4 = r0.f12066c
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4707k.m14391a(r3, r4)
            long r3 = r0.f12073j
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x02a6
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b$a r3 = r0.f12072i
            long r7 = r2.f11670c
            long r2 = r3.mo25182b(r7)
            r0.f12073j = r2
            long r2 = r0.f12064a
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x02a6
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b$a r2 = r0.f12072i
            r3 = 0
            long r2 = r2.mo25182b(r3)
            long r4 = r0.f12073j
            long r6 = r0.f12064a
            long r6 = r6 - r2
            long r4 = r4 + r6
            r0.f12073j = r4
        L_0x02a6:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.k r2 = r0.f12066c
            int r2 = r2.f11939c
            r0.f12075l = r2
            goto L_0x02b7
        L_0x02ad:
            r3 = 1
            r2.mo25064c(r3)
            r1 = 0
            r0.f12070g = r1
            goto L_0x02cc
        L_0x02b5:
            r1 = r36
        L_0x02b7:
            r3 = 1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r2 = r0.f12069f
            int r4 = r0.f12075l
            int r1 = r2.mo25068a(r1, r4, r3)
            r2 = -1
            if (r1 != r2) goto L_0x02c5
        L_0x02c3:
            r3 = r2
            goto L_0x02f6
        L_0x02c5:
            int r2 = r0.f12075l
            int r2 = r2 - r1
            r0.f12075l = r2
            if (r2 <= 0) goto L_0x02ce
        L_0x02cc:
            r3 = 0
            goto L_0x02f6
        L_0x02ce:
            long r1 = r0.f12073j
            long r3 = r0.f12074k
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 * r5
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.k r5 = r0.f12066c
            int r6 = r5.f11940d
            long r6 = (long) r6
            long r3 = r3 / r6
            long r7 = r1 + r3
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r6 = r0.f12069f
            int r10 = r5.f11939c
            r9 = 1
            r11 = 0
            r12 = 0
            r6.mo25072a(r7, r9, r10, r11, r12)
            long r1 = r0.f12074k
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.k r3 = r0.f12066c
            int r3 = r3.f11943g
            long r3 = (long) r3
            long r1 = r1 + r3
            r0.f12074k = r1
            r1 = 0
            r0.f12075l = r1
            r3 = r1
        L_0x02f6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.C4722b.mo25088a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l):int");
    }

    /* renamed from: a */
    public final boolean mo25183a(C4672g gVar, boolean z) throws IOException, InterruptedException {
        int i;
        int i2;
        int i3;
        int a;
        int i4 = z ? 16384 : 131072;
        C4657b bVar = (C4657b) gVar;
        bVar.f11672e = 0;
        if (bVar.f11670c == 0) {
            int i5 = 0;
            while (true) {
                bVar.mo25061a(this.f12065b.f13243a, 0, 10, false);
                this.f12065b.mo25525e(0);
                if (this.f12065b.mo25535n() != C4843g.f12861b) {
                    break;
                }
                this.f12065b.mo25527f(3);
                int k = this.f12065b.mo25532k();
                int i6 = k + 10;
                if (this.f12071h == null) {
                    byte[] bArr = new byte[i6];
                    System.arraycopy(this.f12065b.f13243a, 0, bArr, 0, 10);
                    bVar.mo25061a(bArr, 10, k, false);
                    C4828a a2 = new C4843g((C4843g.C4844a) null).mo25364a(bArr, i6);
                    this.f12071h = a2;
                    if (a2 != null) {
                        this.f12067d.mo25162a(a2);
                    }
                } else {
                    bVar.mo25060a(k, false);
                }
                i5 += i6;
            }
            bVar.f11672e = 0;
            bVar.mo25060a(i5, false);
            i2 = (int) (bVar.f11670c + ((long) bVar.f11672e));
            if (!z) {
                bVar.mo25064c(i2);
            }
            i = 0;
        } else {
            i2 = 0;
            i = 0;
        }
        int i7 = i;
        int i8 = i7;
        while (true) {
            if (!bVar.mo25061a(this.f12065b.f13243a, 0, 4, i > 0)) {
                break;
            }
            this.f12065b.mo25525e(0);
            int c = this.f12065b.mo25520c();
            if ((i7 == 0 || m14429a(c, (long) i7)) && (a = C4707k.m14390a(c)) != -1) {
                i3 = i + 1;
                if (i3 != 1) {
                    if (i3 == 4) {
                        break;
                    }
                } else {
                    C4707k.m14391a(c, this.f12066c);
                    i7 = c;
                }
                bVar.mo25060a(a - 4, false);
            } else {
                int i9 = i8 + 1;
                if (i8 != i4) {
                    if (z) {
                        bVar.f11672e = 0;
                        bVar.mo25060a(i2 + i9, false);
                    } else {
                        bVar.mo25064c(1);
                    }
                    i7 = 0;
                    i8 = i9;
                    i3 = 0;
                } else if (z) {
                    return false;
                } else {
                    throw new C4815l("Searched too many bytes.");
                }
            }
        }
        if (z) {
            bVar.mo25064c(i2 + i8);
        } else {
            bVar.f11672e = 0;
        }
        this.f12070g = i7;
        return true;
    }
}
