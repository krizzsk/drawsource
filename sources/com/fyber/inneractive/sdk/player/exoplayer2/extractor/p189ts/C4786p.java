package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p189ts;

import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4657b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4665f;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4672g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4673h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4709m;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4977j;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4978k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4988r;
import com.google.common.base.Ascii;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.p */
public final class C4786p implements C4665f {

    /* renamed from: a */
    public final C4988r f12593a;

    /* renamed from: b */
    public final SparseArray<C4787a> f12594b = new SparseArray<>();

    /* renamed from: c */
    public final C4978k f12595c = new C4978k(4096);

    /* renamed from: d */
    public boolean f12596d;

    /* renamed from: e */
    public boolean f12597e;

    /* renamed from: f */
    public boolean f12598f;

    /* renamed from: g */
    public C4673h f12599g;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.p$a */
    public static final class C4787a {

        /* renamed from: a */
        public final C4773h f12600a;

        /* renamed from: b */
        public final C4988r f12601b;

        /* renamed from: c */
        public final C4977j f12602c = new C4977j(new byte[64]);

        /* renamed from: d */
        public boolean f12603d;

        /* renamed from: e */
        public boolean f12604e;

        /* renamed from: f */
        public boolean f12605f;

        /* renamed from: g */
        public long f12606g;

        public C4787a(C4773h hVar, C4988r rVar) {
            this.f12600a = hVar;
            this.f12601b = rVar;
        }
    }

    public C4786p(C4988r rVar) {
        this.f12593a = rVar;
    }

    /* renamed from: b */
    public void mo25092b() {
    }

    /* renamed from: a */
    public boolean mo25091a(C4672g gVar) throws IOException, InterruptedException {
        byte[] bArr = new byte[14];
        C4657b bVar = (C4657b) gVar;
        bVar.mo25061a(bArr, 0, 14, false);
        if (442 != (((bArr[0] & 255) << Ascii.CAN) | ((bArr[1] & 255) << Ascii.DLE) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        bVar.mo25060a(bArr[13] & 7, false);
        bVar.mo25061a(bArr, 0, 3, false);
        if (1 == (((bArr[0] & 255) << Ascii.DLE) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo25090a(C4673h hVar) {
        this.f12599g = hVar;
        hVar.mo25099a(new C4709m.C4710a(-9223372036854775807L));
    }

    /* renamed from: a */
    public void mo25089a(long j, long j2) {
        this.f12593a.f13269c = -9223372036854775807L;
        for (int i = 0; i < this.f12594b.size(); i++) {
            C4787a valueAt = this.f12594b.valueAt(i);
            valueAt.f12605f = false;
            valueAt.f12600a.mo25218a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b0  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo25088a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4672g r14, com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4708l r15) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r13 = this;
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r15 = r13.f12595c
            byte[] r15 = r15.f13243a
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r14 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4657b) r14
            r0 = 0
            r1 = 4
            r2 = 1
            boolean r15 = r14.mo25061a(r15, r0, r1, r2)
            r3 = -1
            if (r15 != 0) goto L_0x0011
            return r3
        L_0x0011:
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r15 = r13.f12595c
            r15.mo25525e(r0)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r15 = r13.f12595c
            int r15 = r15.mo25520c()
            r4 = 441(0x1b9, float:6.18E-43)
            if (r15 != r4) goto L_0x0021
            return r3
        L_0x0021:
            r3 = 442(0x1ba, float:6.2E-43)
            if (r15 != r3) goto L_0x0043
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r15 = r13.f12595c
            byte[] r15 = r15.f13243a
            r1 = 10
            r14.mo25061a(r15, r0, r1, r0)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r15 = r13.f12595c
            r1 = 9
            r15.mo25525e(r1)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r15 = r13.f12595c
            int r15 = r15.mo25533l()
            r15 = r15 & 7
            int r15 = r15 + 14
            r14.mo25064c(r15)
            return r0
        L_0x0043:
            r3 = 443(0x1bb, float:6.21E-43)
            r4 = 2
            r5 = 6
            if (r15 != r3) goto L_0x0060
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r15 = r13.f12595c
            byte[] r15 = r15.f13243a
            r14.mo25061a(r15, r0, r4, r0)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r15 = r13.f12595c
            r15.mo25525e(r0)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r15 = r13.f12595c
            int r15 = r15.mo25538q()
            int r15 = r15 + r5
            r14.mo25064c(r15)
            return r0
        L_0x0060:
            r3 = r15 & -256(0xffffffffffffff00, float:NaN)
            r6 = 8
            int r3 = r3 >> r6
            if (r3 == r2) goto L_0x006b
            r14.mo25064c(r2)
            return r0
        L_0x006b:
            r15 = r15 & 255(0xff, float:3.57E-43)
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.p$a> r3 = r13.f12594b
            java.lang.Object r3 = r3.get(r15)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.p$a r3 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.p189ts.C4786p.C4787a) r3
            boolean r7 = r13.f12596d
            if (r7 != 0) goto L_0x00e2
            if (r3 != 0) goto L_0x00ca
            boolean r7 = r13.f12597e
            r8 = 0
            if (r7 != 0) goto L_0x008d
            r9 = 189(0xbd, float:2.65E-43)
            if (r15 != r9) goto L_0x008d
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.b r7 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.b
            r7.<init>(r8)
            r13.f12597e = r2
        L_0x008b:
            r8 = r7
            goto L_0x00ae
        L_0x008d:
            if (r7 != 0) goto L_0x009d
            r7 = r15 & 224(0xe0, float:3.14E-43)
            r9 = 192(0xc0, float:2.69E-43)
            if (r7 != r9) goto L_0x009d
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.m r7 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.m
            r7.<init>(r8)
            r13.f12597e = r2
            goto L_0x008b
        L_0x009d:
            boolean r7 = r13.f12598f
            if (r7 != 0) goto L_0x00ae
            r7 = r15 & 240(0xf0, float:3.36E-43)
            r9 = 224(0xe0, float:3.14E-43)
            if (r7 != r9) goto L_0x00ae
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.i r8 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.i
            r8.<init>()
            r13.f12598f = r2
        L_0x00ae:
            if (r8 == 0) goto L_0x00ca
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v$d r3 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v$d
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 256(0x100, float:3.59E-43)
            r3.<init>(r7, r15, r9)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.h r7 = r13.f12599g
            r8.mo25220a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4673h) r7, (com.fyber.inneractive.sdk.player.exoplayer2.extractor.p189ts.C4795v.C4799d) r3)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.p$a r3 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.p$a
            com.fyber.inneractive.sdk.player.exoplayer2.util.r r7 = r13.f12593a
            r3.<init>(r8, r7)
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.p$a> r7 = r13.f12594b
            r7.put(r15, r3)
        L_0x00ca:
            boolean r15 = r13.f12597e
            if (r15 == 0) goto L_0x00d2
            boolean r15 = r13.f12598f
            if (r15 != 0) goto L_0x00db
        L_0x00d2:
            long r7 = r14.f11670c
            r9 = 1048576(0x100000, double:5.180654E-318)
            int r15 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r15 <= 0) goto L_0x00e2
        L_0x00db:
            r13.f12596d = r2
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.h r15 = r13.f12599g
            r15.mo25100c()
        L_0x00e2:
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r15 = r13.f12595c
            byte[] r15 = r15.f13243a
            r14.mo25061a(r15, r0, r4, r0)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r15 = r13.f12595c
            r15.mo25525e(r0)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r15 = r13.f12595c
            int r15 = r15.mo25538q()
            int r15 = r15 + r5
            if (r3 != 0) goto L_0x00fc
            r14.mo25064c(r15)
            goto L_0x01df
        L_0x00fc:
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r4 = r13.f12595c
            r4.mo25521c(r15)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r4 = r13.f12595c
            byte[] r4 = r4.f13243a
            r14.mo25063b(r4, r0, r15, r0)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r14 = r13.f12595c
            r14.mo25525e(r5)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r14 = r13.f12595c
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r15 = r3.f12602c
            byte[] r15 = r15.f13239a
            r4 = 3
            r14.mo25517a(r15, r0, r4)
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r15 = r3.f12602c
            r15.mo25510b(r0)
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r15 = r3.f12602c
            r15.mo25512c(r6)
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r15 = r3.f12602c
            boolean r15 = r15.mo25511b()
            r3.f12603d = r15
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r15 = r3.f12602c
            boolean r15 = r15.mo25511b()
            r3.f12604e = r15
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r15 = r3.f12602c
            r15.mo25512c(r5)
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r15 = r3.f12602c
            int r15 = r15.mo25508a(r6)
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r5 = r3.f12602c
            byte[] r5 = r5.f13239a
            r14.mo25517a(r5, r0, r15)
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r15 = r3.f12602c
            r15.mo25510b(r0)
            r5 = 0
            r3.f12606g = r5
            boolean r15 = r3.f12603d
            if (r15 == 0) goto L_0x01c5
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r15 = r3.f12602c
            r15.mo25512c(r1)
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r15 = r3.f12602c
            int r15 = r15.mo25508a(r4)
            long r5 = (long) r15
            r15 = 30
            long r5 = r5 << r15
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r7 = r3.f12602c
            r7.mo25512c(r2)
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r7 = r3.f12602c
            r8 = 15
            int r7 = r7.mo25508a(r8)
            int r7 = r7 << r8
            long r9 = (long) r7
            long r5 = r5 | r9
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r7 = r3.f12602c
            r7.mo25512c(r2)
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r7 = r3.f12602c
            int r7 = r7.mo25508a(r8)
            long r9 = (long) r7
            long r5 = r5 | r9
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r7 = r3.f12602c
            r7.mo25512c(r2)
            boolean r7 = r3.f12605f
            if (r7 != 0) goto L_0x01bd
            boolean r7 = r3.f12604e
            if (r7 == 0) goto L_0x01bd
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r7 = r3.f12602c
            r7.mo25512c(r1)
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r1 = r3.f12602c
            int r1 = r1.mo25508a(r4)
            long r9 = (long) r1
            long r9 = r9 << r15
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r15 = r3.f12602c
            r15.mo25512c(r2)
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r15 = r3.f12602c
            int r15 = r15.mo25508a(r8)
            int r15 = r15 << r8
            long r11 = (long) r15
            long r9 = r9 | r11
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r15 = r3.f12602c
            r15.mo25512c(r2)
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r15 = r3.f12602c
            int r15 = r15.mo25508a(r8)
            long r7 = (long) r15
            long r7 = r7 | r9
            com.fyber.inneractive.sdk.player.exoplayer2.util.j r15 = r3.f12602c
            r15.mo25512c(r2)
            com.fyber.inneractive.sdk.player.exoplayer2.util.r r15 = r3.f12601b
            r15.mo25560b(r7)
            r3.f12605f = r2
        L_0x01bd:
            com.fyber.inneractive.sdk.player.exoplayer2.util.r r15 = r3.f12601b
            long r4 = r15.mo25560b(r5)
            r3.f12606g = r4
        L_0x01c5:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h r15 = r3.f12600a
            long r4 = r3.f12606g
            r15.mo25219a((long) r4, (boolean) r2)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h r15 = r3.f12600a
            r15.mo25221a(r14)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.h r14 = r3.f12600a
            r14.mo25222b()
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r14 = r13.f12595c
            int r15 = r14.mo25518b()
            r14.mo25523d(r15)
        L_0x01df:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.p189ts.C4786p.mo25088a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l):int");
    }
}
