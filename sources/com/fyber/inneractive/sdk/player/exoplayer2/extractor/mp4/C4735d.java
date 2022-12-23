package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import android.util.SparseArray;
import androidx.core.view.ViewCompat;
import com.fyber.inneractive.sdk.player.exoplayer2.C4811i;
import com.fyber.inneractive.sdk.player.exoplayer2.C4815l;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C4644a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4665f;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4672g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4673h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4746n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4974i;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4978k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4988r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d */
public final class C4735d implements C4665f {

    /* renamed from: D */
    public static final int f12206D = C4991u.m15133a("seig");

    /* renamed from: E */
    public static final byte[] f12207E = {-94, 57, 79, 82, 90, -101, 79, Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: A */
    public C4746n f12208A;

    /* renamed from: B */
    public C4746n[] f12209B;

    /* renamed from: C */
    public boolean f12210C;

    /* renamed from: a */
    public final int f12211a;

    /* renamed from: b */
    public final SparseArray<C4737b> f12212b;

    /* renamed from: c */
    public final C4978k f12213c;

    /* renamed from: d */
    public final C4978k f12214d;

    /* renamed from: e */
    public final C4978k f12215e;

    /* renamed from: f */
    public final C4978k f12216f;

    /* renamed from: g */
    public final C4988r f12217g;

    /* renamed from: h */
    public final C4978k f12218h;

    /* renamed from: i */
    public final byte[] f12219i;

    /* renamed from: j */
    public final Stack<C4726a.C4727a> f12220j;

    /* renamed from: k */
    public final LinkedList<C4736a> f12221k;

    /* renamed from: l */
    public int f12222l;

    /* renamed from: m */
    public int f12223m;

    /* renamed from: n */
    public long f12224n;

    /* renamed from: o */
    public int f12225o;

    /* renamed from: p */
    public C4978k f12226p;

    /* renamed from: q */
    public long f12227q;

    /* renamed from: r */
    public int f12228r;

    /* renamed from: s */
    public long f12229s;

    /* renamed from: t */
    public long f12230t;

    /* renamed from: u */
    public C4737b f12231u;

    /* renamed from: v */
    public int f12232v;

    /* renamed from: w */
    public int f12233w;

    /* renamed from: x */
    public int f12234x;

    /* renamed from: y */
    public boolean f12235y;

    /* renamed from: z */
    public C4673h f12236z;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$a */
    public static final class C4736a {

        /* renamed from: a */
        public final long f12237a;

        /* renamed from: b */
        public final int f12238b;

        public C4736a(long j, int i) {
            this.f12237a = j;
            this.f12238b = i;
        }
    }

    public C4735d(int i, C4988r rVar) {
        this(i, (C4988r) null, (C4742h) null);
    }

    /* renamed from: a */
    public boolean mo25091a(C4672g gVar) throws IOException, InterruptedException {
        return C4741g.m14492a(gVar, true);
    }

    /* renamed from: b */
    public void mo25092b() {
    }

    /* renamed from: c */
    public final void mo25193c() {
        if ((this.f12211a & 4) != 0 && this.f12208A == null) {
            C4746n a = this.f12236z.mo25098a(this.f12212b.size(), 4);
            this.f12208A = a;
            a.mo25074a(C4811i.m14718a((String) null, "application/x-emsg", Long.MAX_VALUE));
        }
        if ((this.f12211a & 8) != 0 && this.f12209B == null) {
            C4746n a2 = this.f12236z.mo25098a(this.f12212b.size() + 1, 3);
            a2.mo25074a(C4811i.m14724a((String) null, "application/cea-608", (String) null, -1, 0, (String) null, (C4644a) null));
            this.f12209B = new C4746n[]{a2};
        }
    }

    public C4735d(int i, C4988r rVar, C4742h hVar) {
        this.f12211a = i | 0;
        this.f12217g = rVar;
        this.f12218h = new C4978k(16);
        this.f12213c = new C4978k(C4974i.f13222a);
        this.f12214d = new C4978k(5);
        this.f12215e = new C4978k();
        this.f12216f = new C4978k(1);
        this.f12219i = new byte[16];
        this.f12220j = new Stack<>();
        this.f12221k = new LinkedList<>();
        this.f12212b = new SparseArray<>();
        this.f12229s = -9223372036854775807L;
        this.f12230t = -9223372036854775807L;
        mo25191a();
    }

    /* renamed from: a */
    public void mo25090a(C4673h hVar) {
        this.f12236z = hVar;
    }

    /* renamed from: a */
    public void mo25089a(long j, long j2) {
        int size = this.f12212b.size();
        for (int i = 0; i < size; i++) {
            this.f12212b.valueAt(i).mo25194a();
        }
        this.f12221k.clear();
        this.f12228r = 0;
        this.f12220j.clear();
        mo25191a();
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b */
    public static final class C4737b {

        /* renamed from: a */
        public final C4744j f12239a = new C4744j();

        /* renamed from: b */
        public final C4746n f12240b;

        /* renamed from: c */
        public C4742h f12241c;

        /* renamed from: d */
        public C4734c f12242d;

        /* renamed from: e */
        public int f12243e;

        /* renamed from: f */
        public int f12244f;

        /* renamed from: g */
        public int f12245g;

        public C4737b(C4746n nVar) {
            this.f12240b = nVar;
        }

        /* renamed from: a */
        public void mo25195a(C4742h hVar, C4734c cVar) {
            hVar.getClass();
            this.f12241c = hVar;
            cVar.getClass();
            this.f12242d = cVar;
            this.f12240b.mo25074a(hVar.f12302f);
            mo25194a();
        }

        /* renamed from: a */
        public void mo25194a() {
            C4744j jVar = this.f12239a;
            jVar.f12313d = 0;
            jVar.f12327r = 0;
            jVar.f12321l = false;
            jVar.f12326q = false;
            jVar.f12323n = null;
            this.f12243e = 0;
            this.f12245g = 0;
            this.f12244f = 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:261:0x0289 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x05d4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x0002 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x0004 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo25088a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4672g r26, com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4708l r27) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r25 = this;
            r0 = r25
        L_0x0002:
            r1 = r26
        L_0x0004:
            int r2 = r0.f12222l
            r3 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x0440
            if (r2 == r6) goto L_0x02e3
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r11 = 3
            if (r2 == r3) goto L_0x028a
            r12 = 6
            if (r2 != r11) goto L_0x00fc
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b r2 = r0.f12231u
            if (r2 != 0) goto L_0x0081
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b> r2 = r0.f12212b
            int r13 = r2.size()
            r14 = r7
            r15 = 0
        L_0x0024:
            if (r14 >= r13) goto L_0x0045
            java.lang.Object r16 = r2.valueAt(r14)
            r11 = r16
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b r11 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4735d.C4737b) r11
            int r4 = r11.f12245g
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.j r8 = r11.f12239a
            int r5 = r8.f12313d
            if (r4 != r5) goto L_0x0037
            goto L_0x0041
        L_0x0037:
            long[] r5 = r8.f12315f
            r4 = r5[r4]
            int r8 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r8 >= 0) goto L_0x0041
            r9 = r4
            r15 = r11
        L_0x0041:
            int r14 = r14 + 1
            r11 = 3
            goto L_0x0024
        L_0x0045:
            if (r15 != 0) goto L_0x0063
            long r2 = r0.f12227q
            r4 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r4 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4657b) r4
            long r5 = r4.f11670c
            long r2 = r2 - r5
            int r2 = (int) r2
            if (r2 < 0) goto L_0x005b
            r4.mo25064c(r2)
            r25.mo25191a()
            r6 = r7
            goto L_0x0287
        L_0x005b:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r2 = "Offset to end of mdat was negative."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x0063:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.j r2 = r15.f12239a
            long[] r2 = r2.f12315f
            int r4 = r15.f12245g
            r4 = r2[r4]
            r2 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4657b) r2
            long r8 = r2.f11670c
            long r4 = r4 - r8
            int r4 = (int) r4
            if (r4 >= 0) goto L_0x007c
            java.lang.String r4 = "FragmentedMp4Extractor"
            java.lang.String r5 = "Ignoring negative offset to sample data."
            android.util.Log.w(r4, r5)
            r4 = r7
        L_0x007c:
            r2.mo25064c(r4)
            r0.f12231u = r15
        L_0x0081:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b r2 = r0.f12231u
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.j r4 = r2.f12239a
            int[] r5 = r4.f12317h
            int r8 = r2.f12243e
            r5 = r5[r8]
            r0.f12232v = r5
            boolean r5 = r4.f12321l
            if (r5 == 0) goto L_0x00e0
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r5 = r4.f12325p
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c r9 = r4.f12310a
            int r9 = r9.f12202a
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.i r10 = r4.f12323n
            if (r10 == 0) goto L_0x009c
            goto L_0x00a2
        L_0x009c:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.h r10 = r2.f12241c
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.i[] r10 = r10.f12304h
            r10 = r10[r9]
        L_0x00a2:
            int r9 = r10.f12308a
            boolean[] r4 = r4.f12322m
            boolean r4 = r4[r8]
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r8 = r0.f12216f
            byte[] r10 = r8.f13243a
            if (r4 == 0) goto L_0x00b1
            r11 = 128(0x80, float:1.794E-43)
            goto L_0x00b2
        L_0x00b1:
            r11 = r7
        L_0x00b2:
            r11 = r11 | r9
            byte r11 = (byte) r11
            r10[r7] = r11
            r8.mo25525e(r7)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r2 = r2.f12240b
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r8 = r0.f12216f
            r2.mo25075a(r8, r6)
            r2.mo25075a(r5, r9)
            if (r4 != 0) goto L_0x00c8
            int r9 = r9 + 1
            goto L_0x00d8
        L_0x00c8:
            int r4 = r5.mo25538q()
            r8 = -2
            r5.mo25527f(r8)
            int r4 = r4 * r12
            int r4 = r4 + r3
            r2.mo25075a(r5, r4)
            int r9 = r9 + 1
            int r9 = r9 + r4
        L_0x00d8:
            r0.f12233w = r9
            int r2 = r0.f12232v
            int r2 = r2 + r9
            r0.f12232v = r2
            goto L_0x00e2
        L_0x00e0:
            r0.f12233w = r7
        L_0x00e2:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b r2 = r0.f12231u
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.h r2 = r2.f12241c
            int r2 = r2.f12303g
            if (r2 != r6) goto L_0x00f7
            int r2 = r0.f12232v
            r4 = 8
            int r2 = r2 - r4
            r0.f12232v = r2
            r2 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4657b) r2
            r2.mo25064c(r4)
        L_0x00f7:
            r2 = 4
            r0.f12222l = r2
            r0.f12234x = r7
        L_0x00fc:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b r2 = r0.f12231u
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.j r4 = r2.f12239a
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.h r5 = r2.f12241c
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r8 = r2.f12240b
            int r2 = r2.f12243e
            int r9 = r5.f12307k
            if (r9 == 0) goto L_0x01e3
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r13 = r0.f12214d
            byte[] r13 = r13.f13243a
            r13[r7] = r7
            r13[r6] = r7
            r13[r3] = r7
            int r3 = r9 + 1
            int r9 = 4 - r9
        L_0x0118:
            int r14 = r0.f12233w
            int r15 = r0.f12232v
            if (r14 >= r15) goto L_0x01f4
            int r14 = r0.f12234x
            java.lang.String r15 = "video/hevc"
            if (r14 != 0) goto L_0x0183
            r14 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r14 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4657b) r14
            r14.mo25063b(r13, r9, r3, r7)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r14 = r0.f12214d
            r14.mo25525e(r7)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r14 = r0.f12214d
            int r14 = r14.mo25536o()
            int r14 = r14 - r6
            r0.f12234x = r14
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r14 = r0.f12213c
            r14.mo25525e(r7)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r14 = r0.f12213c
            r10 = 4
            r8.mo25075a(r14, r10)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r11 = r0.f12214d
            r8.mo25075a(r11, r6)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n[] r11 = r0.f12209B
            if (r11 == 0) goto L_0x0174
            com.fyber.inneractive.sdk.player.exoplayer2.i r11 = r5.f12302f
            java.lang.String r11 = r11.f12755f
            byte r14 = r13[r10]
            byte[] r10 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4974i.f13222a
            java.lang.String r10 = "video/avc"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x0160
            r10 = r14 & 31
            if (r10 == r12) goto L_0x016d
        L_0x0160:
            boolean r10 = r15.equals(r11)
            if (r10 == 0) goto L_0x016f
            r10 = r14 & 126(0x7e, float:1.77E-43)
            int r10 = r10 >> r6
            r11 = 39
            if (r10 != r11) goto L_0x016f
        L_0x016d:
            r10 = r6
            goto L_0x0170
        L_0x016f:
            r10 = r7
        L_0x0170:
            if (r10 == 0) goto L_0x0174
            r10 = r6
            goto L_0x0175
        L_0x0174:
            r10 = r7
        L_0x0175:
            r0.f12235y = r10
            int r10 = r0.f12233w
            int r10 = r10 + 5
            r0.f12233w = r10
            int r10 = r0.f12232v
            int r10 = r10 + r9
            r0.f12232v = r10
            goto L_0x0118
        L_0x0183:
            boolean r10 = r0.f12235y
            if (r10 == 0) goto L_0x01d2
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r10 = r0.f12215e
            r10.mo25521c(r14)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r10 = r0.f12215e
            byte[] r10 = r10.f13243a
            int r11 = r0.f12234x
            r14 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r14 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4657b) r14
            r14.mo25063b(r10, r7, r11, r7)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r10 = r0.f12215e
            int r11 = r0.f12234x
            r8.mo25075a(r10, r11)
            int r10 = r0.f12234x
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r11 = r0.f12215e
            byte[] r14 = r11.f13243a
            int r11 = r11.f13245c
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4974i.m15067a(r14, r11)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r14 = r0.f12215e
            com.fyber.inneractive.sdk.player.exoplayer2.i r12 = r5.f12302f
            java.lang.String r12 = r12.f12755f
            boolean r12 = r15.equals(r12)
            r14.mo25525e(r12)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r12 = r0.f12215e
            r12.mo25523d(r11)
            long[] r11 = r4.f12319j
            r14 = r11[r2]
            int[] r11 = r4.f12318i
            r11 = r11[r2]
            long r11 = (long) r11
            long r14 = r14 + r11
            r11 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 * r11
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r11 = r0.f12215e
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n[] r12 = r0.f12209B
            com.fyber.inneractive.sdk.player.exoplayer2.text.cea.C4893a.m14900a(r14, r11, r12)
            goto L_0x01d6
        L_0x01d2:
            int r10 = r8.mo25068a(r1, r14, r7)
        L_0x01d6:
            int r11 = r0.f12233w
            int r11 = r11 + r10
            r0.f12233w = r11
            int r11 = r0.f12234x
            int r11 = r11 - r10
            r0.f12234x = r11
            r12 = 6
            goto L_0x0118
        L_0x01e3:
            int r3 = r0.f12233w
            int r9 = r0.f12232v
            if (r3 >= r9) goto L_0x01f4
            int r9 = r9 - r3
            int r3 = r8.mo25068a(r1, r9, r7)
            int r9 = r0.f12233w
            int r9 = r9 + r3
            r0.f12233w = r9
            goto L_0x01e3
        L_0x01f4:
            long[] r3 = r4.f12319j
            r9 = r3[r2]
            int[] r3 = r4.f12318i
            r3 = r3[r2]
            long r11 = (long) r3
            long r9 = r9 + r11
            r11 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 * r11
            boolean r3 = r4.f12321l
            if (r3 == 0) goto L_0x0208
            r11 = 1073741824(0x40000000, float:2.0)
            goto L_0x0209
        L_0x0208:
            r11 = r7
        L_0x0209:
            boolean[] r12 = r4.f12320k
            boolean r2 = r12[r2]
            r21 = r11 | r2
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c r2 = r4.f12310a
            int r2 = r2.f12202a
            if (r3 == 0) goto L_0x0225
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.i r3 = r4.f12323n
            if (r3 == 0) goto L_0x021c
            byte[] r2 = r3.f12309b
            goto L_0x0222
        L_0x021c:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.i[] r3 = r5.f12304h
            r2 = r3[r2]
            byte[] r2 = r2.f12309b
        L_0x0222:
            r24 = r2
            goto L_0x0227
        L_0x0225:
            r24 = 0
        L_0x0227:
            com.fyber.inneractive.sdk.player.exoplayer2.util.r r2 = r0.f12217g
            if (r2 == 0) goto L_0x022f
            long r9 = r2.mo25559a(r9)
        L_0x022f:
            int r2 = r0.f12232v
            r23 = 0
            r18 = r8
            r19 = r9
            r22 = r2
            r18.mo25072a(r19, r21, r22, r23, r24)
        L_0x023c:
            java.util.LinkedList<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$a> r2 = r0.f12221k
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0267
            java.util.LinkedList<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$a> r2 = r0.f12221k
            java.lang.Object r2 = r2.removeFirst()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$a r2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4735d.C4736a) r2
            int r3 = r0.f12228r
            int r5 = r2.f12238b
            int r3 = r3 - r5
            r0.f12228r = r3
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r8 = r0.f12208A
            long r11 = r2.f12237a
            long r18 = r9 + r11
            r20 = 1
            r23 = 0
            r17 = r8
            r21 = r5
            r22 = r3
            r17.mo25072a(r18, r20, r21, r22, r23)
            goto L_0x023c
        L_0x0267:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b r2 = r0.f12231u
            int r3 = r2.f12243e
            int r3 = r3 + r6
            r2.f12243e = r3
            int r3 = r2.f12244f
            int r3 = r3 + r6
            r2.f12244f = r3
            int[] r4 = r4.f12316g
            int r5 = r2.f12245g
            r4 = r4[r5]
            if (r3 != r4) goto L_0x0284
            int r5 = r5 + 1
            r2.f12245g = r5
            r2.f12244f = r7
            r2 = 0
            r0.f12231u = r2
        L_0x0284:
            r2 = 3
            r0.f12222l = r2
        L_0x0287:
            if (r6 == 0) goto L_0x0004
            return r7
        L_0x028a:
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b> r2 = r0.f12212b
            int r2 = r2.size()
            r3 = r7
            r4 = 0
        L_0x0292:
            if (r3 >= r2) goto L_0x02b4
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b> r5 = r0.f12212b
            java.lang.Object r5 = r5.valueAt(r3)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b r5 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4735d.C4737b) r5
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.j r5 = r5.f12239a
            boolean r6 = r5.f12326q
            if (r6 == 0) goto L_0x02b1
            long r5 = r5.f12312c
            int r8 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r8 >= 0) goto L_0x02b1
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b> r4 = r0.f12212b
            java.lang.Object r4 = r4.valueAt(r3)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b r4 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4735d.C4737b) r4
            r9 = r5
        L_0x02b1:
            int r3 = r3 + 1
            goto L_0x0292
        L_0x02b4:
            if (r4 != 0) goto L_0x02bb
            r2 = 3
            r0.f12222l = r2
            goto L_0x0004
        L_0x02bb:
            r2 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4657b) r2
            long r5 = r2.f11670c
            long r9 = r9 - r5
            int r3 = (int) r9
            if (r3 < 0) goto L_0x02db
            r2.mo25064c(r3)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.j r3 = r4.f12239a
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r4 = r3.f12325p
            byte[] r4 = r4.f13243a
            int r5 = r3.f12324o
            r2.mo25063b(r4, r7, r5, r7)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r2 = r3.f12325p
            r2.mo25525e(r7)
            r3.f12326q = r7
            goto L_0x0004
        L_0x02db:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r2 = "Offset to encryption data was negative."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x02e3:
            long r4 = r0.f12224n
            int r2 = (int) r4
            int r4 = r0.f12225o
            int r2 = r2 - r4
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r4 = r0.f12226p
            if (r4 == 0) goto L_0x042e
            byte[] r4 = r4.f13243a
            r5 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r5 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4657b) r5
            r8 = 8
            r5.mo25063b(r4, r8, r2, r7)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r2 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b
            int r4 = r0.f12223m
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r8 = r0.f12226p
            r2.<init>(r4, r8)
            long r9 = r5.f11670c
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r5 = r0.f12220j
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0319
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r3 = r0.f12220j
            java.lang.Object r3 = r3.peek()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r3 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.C4727a) r3
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b> r3 = r3.f12179Q0
            r3.add(r2)
            goto L_0x0435
        L_0x0319:
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12087B
            if (r4 != r2) goto L_0x03d9
            r2 = 8
            r8.mo25525e(r2)
            int r2 = r8.mo25520c()
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.m14447b(r2)
            r4 = 4
            r8.mo25527f(r4)
            long r4 = r8.mo25534m()
            if (r2 != 0) goto L_0x033d
            long r11 = r8.mo25534m()
            long r13 = r8.mo25534m()
            goto L_0x0345
        L_0x033d:
            long r11 = r8.mo25537p()
            long r13 = r8.mo25537p()
        L_0x0345:
            long r9 = r9 + r13
            r18 = r11
            r13 = 1000000(0xf4240, double:4.940656E-318)
            r11 = r18
            r15 = r4
            long r20 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.m15135a((long) r11, (long) r13, (long) r15)
            r8.mo25527f(r3)
            int r2 = r8.mo25538q()
            int[] r3 = new int[r2]
            long[] r15 = new long[r2]
            long[] r13 = new long[r2]
            long[] r14 = new long[r2]
            r11 = r20
        L_0x0363:
            if (r7 >= r2) goto L_0x03b2
            int r16 = r8.mo25520c()
            r22 = -2147483648(0xffffffff80000000, float:-0.0)
            r22 = r16 & r22
            if (r22 != 0) goto L_0x03aa
            long r22 = r8.mo25534m()
            r24 = 2147483647(0x7fffffff, float:NaN)
            r16 = r16 & r24
            r3[r7] = r16
            r15[r7] = r9
            r14[r7] = r11
            long r18 = r18 + r22
            r22 = 1000000(0xf4240, double:4.940656E-318)
            r11 = r18
            r24 = r2
            r6 = r13
            r2 = r14
            r13 = r22
            r1 = r15
            r15 = r4
            long r11 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.m15135a((long) r11, (long) r13, (long) r15)
            r13 = r2[r7]
            long r13 = r11 - r13
            r6[r7] = r13
            r13 = 4
            r8.mo25527f(r13)
            r14 = r3[r7]
            long r14 = (long) r14
            long r9 = r9 + r14
            int r7 = r7 + 1
            r15 = r1
            r14 = r2
            r13 = r6
            r2 = r24
            r6 = 1
            r1 = r26
            goto L_0x0363
        L_0x03aa:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r2 = "Unhandled indirect reference"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x03b2:
            r6 = r13
            r2 = r14
            r1 = r15
            java.lang.Long r4 = java.lang.Long.valueOf(r20)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.a r5 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.a
            r5.<init>(r3, r1, r6, r2)
            android.util.Pair r1 = android.util.Pair.create(r4, r5)
            java.lang.Object r2 = r1.first
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r0.f12230t = r2
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.h r2 = r0.f12236z
            java.lang.Object r1 = r1.second
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.m r1 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4709m) r1
            r2.mo25099a(r1)
            r1 = 1
            r0.f12210C = r1
            goto L_0x0435
        L_0x03d9:
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12098G0
            if (r4 != r1) goto L_0x0435
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r1 = r0.f12208A
            if (r1 != 0) goto L_0x03e2
            goto L_0x0435
        L_0x03e2:
            r1 = 12
            r8.mo25525e(r1)
            r8.mo25531j()
            r8.mo25531j()
            long r6 = r8.mo25534m()
            long r2 = r8.mo25534m()
            r4 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.m15135a((long) r2, (long) r4, (long) r6)
            r8.mo25525e(r1)
            int r13 = r8.mo25513a()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r1 = r0.f12208A
            r1.mo25075a(r8, r13)
            long r4 = r0.f12230t
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x041e
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r9 = r0.f12208A
            long r10 = r4 + r2
            r12 = 1
            r14 = 0
            r15 = 0
            r9.mo25072a(r10, r12, r13, r14, r15)
            goto L_0x0435
        L_0x041e:
            java.util.LinkedList<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$a> r1 = r0.f12221k
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$a r4 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$a
            r4.<init>(r2, r13)
            r1.addLast(r4)
            int r1 = r0.f12228r
            int r1 = r1 + r13
            r0.f12228r = r1
            goto L_0x0435
        L_0x042e:
            r1 = r26
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r1 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4657b) r1
            r1.mo25064c(r2)
        L_0x0435:
            r1 = r26
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r1 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4657b) r1
            long r1 = r1.f11670c
            r0.mo25192a((long) r1)
            goto L_0x0002
        L_0x0440:
            int r1 = r0.f12225o
            if (r1 != 0) goto L_0x046f
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r1 = r0.f12218h
            byte[] r1 = r1.f13243a
            r2 = r26
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4657b) r2
            r4 = 8
            r5 = 1
            boolean r1 = r2.mo25063b(r1, r7, r4, r5)
            if (r1 != 0) goto L_0x0458
            r6 = r7
            goto L_0x05d2
        L_0x0458:
            r0.f12225o = r4
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r1 = r0.f12218h
            r1.mo25525e(r7)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r1 = r0.f12218h
            long r1 = r1.mo25534m()
            r0.f12224n = r1
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r1 = r0.f12218h
            int r1 = r1.mo25520c()
            r0.f12223m = r1
        L_0x046f:
            long r1 = r0.f12224n
            r4 = 1
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x0491
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r1 = r0.f12218h
            byte[] r1 = r1.f13243a
            r2 = r26
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4657b) r2
            r4 = 8
            r2.mo25063b(r1, r4, r4, r7)
            int r1 = r0.f12225o
            int r1 = r1 + r4
            r0.f12225o = r1
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r1 = r0.f12218h
            long r1 = r1.mo25537p()
            r0.f12224n = r1
        L_0x0491:
            long r1 = r0.f12224n
            int r4 = r0.f12225o
            long r4 = (long) r4
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 < 0) goto L_0x05de
            r1 = r26
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r1 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4657b) r1
            long r8 = r1.f11670c
            long r8 = r8 - r4
            int r2 = r0.f12223m
            int r4 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12107L
            if (r2 != r4) goto L_0x04c4
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b> r2 = r0.f12212b
            int r2 = r2.size()
            r4 = r7
        L_0x04ae:
            if (r4 >= r2) goto L_0x04c4
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b> r5 = r0.f12212b
            java.lang.Object r5 = r5.valueAt(r4)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b r5 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4735d.C4737b) r5
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.j r5 = r5.f12239a
            r5.getClass()
            r5.f12312c = r8
            r5.f12311b = r8
            int r4 = r4 + 1
            goto L_0x04ae
        L_0x04c4:
            int r2 = r0.f12223m
            int r4 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12141i
            if (r2 != r4) goto L_0x04ea
            r4 = 0
            r0.f12231u = r4
            long r1 = r0.f12224n
            long r8 = r8 + r1
            r0.f12227q = r8
            boolean r1 = r0.f12210C
            if (r1 != 0) goto L_0x04e5
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.h r1 = r0.f12236z
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.m$a r2 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.m$a
            long r4 = r0.f12229s
            r2.<init>(r4)
            r1.mo25099a(r2)
            r1 = 1
            r0.f12210C = r1
        L_0x04e5:
            r0.f12222l = r3
            r6 = 1
            goto L_0x05d2
        L_0x04ea:
            int r3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12089C
            if (r2 == r3) goto L_0x0511
            int r3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12093E
            if (r2 == r3) goto L_0x0511
            int r3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12095F
            if (r2 == r3) goto L_0x0511
            int r3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12097G
            if (r2 == r3) goto L_0x0511
            int r3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12099H
            if (r2 == r3) goto L_0x0511
            int r3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12107L
            if (r2 == r3) goto L_0x0511
            int r3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12109M
            if (r2 == r3) goto L_0x0511
            int r3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12111N
            if (r2 == r3) goto L_0x0511
            int r3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12116Q
            if (r2 != r3) goto L_0x050f
            goto L_0x0511
        L_0x050f:
            r3 = r7
            goto L_0x0512
        L_0x0511:
            r3 = 1
        L_0x0512:
            if (r3 == 0) goto L_0x053b
            long r1 = r1.f11670c
            long r3 = r0.f12224n
            long r1 = r1 + r3
            r3 = 8
            long r1 = r1 - r3
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r3 = r0.f12220j
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r4 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a
            int r5 = r0.f12223m
            r4.<init>(r5, r1)
            r3.add(r4)
            long r3 = r0.f12224n
            int r5 = r0.f12225o
            long r5 = (long) r5
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0535
            r0.mo25192a((long) r1)
            goto L_0x0538
        L_0x0535:
            r25.mo25191a()
        L_0x0538:
            r1 = 1
            goto L_0x05d1
        L_0x053b:
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12119T
            if (r2 == r1) goto L_0x058e
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12118S
            if (r2 == r1) goto L_0x058e
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12091D
            if (r2 == r1) goto L_0x058e
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12087B
            if (r2 == r1) goto L_0x058e
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12120U
            if (r2 == r1) goto L_0x058e
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12171x
            if (r2 == r1) goto L_0x058e
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12173y
            if (r2 == r1) goto L_0x058e
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12115P
            if (r2 == r1) goto L_0x058e
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12175z
            if (r2 == r1) goto L_0x058e
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12085A
            if (r2 == r1) goto L_0x058e
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12121V
            if (r2 == r1) goto L_0x058e
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12132d0
            if (r2 == r1) goto L_0x058e
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12134e0
            if (r2 == r1) goto L_0x058e
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12142i0
            if (r2 == r1) goto L_0x058e
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12140h0
            if (r2 == r1) goto L_0x058e
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12136f0
            if (r2 == r1) goto L_0x058e
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12138g0
            if (r2 == r1) goto L_0x058e
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12117R
            if (r2 == r1) goto L_0x058e
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12113O
            if (r2 == r1) goto L_0x058e
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12098G0
            if (r2 != r1) goto L_0x058c
            goto L_0x058e
        L_0x058c:
            r1 = r7
            goto L_0x058f
        L_0x058e:
            r1 = 1
        L_0x058f:
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r1 == 0) goto L_0x05c5
            int r1 = r0.f12225o
            r4 = 8
            if (r1 != r4) goto L_0x05bd
            long r5 = r0.f12224n
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x05b5
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r1 = new com.fyber.inneractive.sdk.player.exoplayer2.util.k
            int r2 = (int) r5
            r1.<init>((int) r2)
            r0.f12226p = r1
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r2 = r0.f12218h
            byte[] r2 = r2.f13243a
            byte[] r1 = r1.f13243a
            java.lang.System.arraycopy(r2, r7, r1, r7, r4)
            r1 = 1
            r0.f12222l = r1
            goto L_0x05d1
        L_0x05b5:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r2 = "Leaf atom with length > 2147483647 (unsupported)."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x05bd:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r2 = "Leaf atom defines extended atom size (unsupported)."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x05c5:
            long r4 = r0.f12224n
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x05d6
            r1 = 0
            r0.f12226p = r1
            r1 = 1
            r0.f12222l = r1
        L_0x05d1:
            r6 = r1
        L_0x05d2:
            if (r6 != 0) goto L_0x0002
            r1 = -1
            return r1
        L_0x05d6:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r2 = "Skipping atom with length > 2147483647 (unsupported)."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x05de:
            com.fyber.inneractive.sdk.player.exoplayer2.l r1 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r2 = "Atom size less than header length (unsupported)."
            r1.<init>((java.lang.String) r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4735d.mo25088a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l):int");
    }

    /* renamed from: a */
    public final void mo25191a() {
        this.f12222l = 0;
        this.f12225o = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:256:0x05fd  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25192a(long r57) throws com.fyber.inneractive.sdk.player.exoplayer2.C4815l {
        /*
            r56 = this;
        L_0x0000:
            r0 = r56
        L_0x0002:
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r1 = r0.f12220j
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x070e
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r1 = r0.f12220j
            java.lang.Object r1 = r1.peek()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r1 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.C4727a) r1
            long r1 = r1.f12178P0
            int r1 = (r1 > r57 ? 1 : (r1 == r57 ? 0 : -1))
            if (r1 != 0) goto L_0x070e
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r1 = r0.f12220j
            java.lang.Object r1 = r1.pop()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r1 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.C4727a) r1
            int r2 = r1.f12177a
            int r3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12089C
            r4 = 12
            r5 = 8
            r7 = 1
            if (r2 != r3) goto L_0x015d
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b> r2 = r1.f12179Q0
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a r2 = m14463a((java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.C4728b>) r2)
            int r3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12111N
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r3 = r1.mo25186c(r3)
            android.util.SparseArray r14 = new android.util.SparseArray
            r14.<init>()
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b> r10 = r3.f12179Q0
            int r10 = r10.size()
            r15 = r8
            r8 = 0
        L_0x0049:
            if (r8 >= r10) goto L_0x00b0
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b> r9 = r3.f12179Q0
            java.lang.Object r9 = r9.get(r8)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r9 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.C4728b) r9
            int r11 = r9.f12177a
            int r12 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12175z
            if (r11 != r12) goto L_0x008e
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r9 = r9.f12181P0
            r9.mo25525e(r4)
            int r11 = r9.mo25520c()
            int r12 = r9.mo25536o()
            int r12 = r12 - r7
            int r13 = r9.mo25536o()
            int r6 = r9.mo25536o()
            int r9 = r9.mo25520c()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c r4 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c
            r4.<init>(r12, r13, r6, r9)
            android.util.Pair r4 = android.util.Pair.create(r11, r4)
            java.lang.Object r6 = r4.first
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.Object r4 = r4.second
            r14.put(r6, r4)
            goto L_0x00ab
        L_0x008e:
            int r4 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12113O
            if (r11 != r4) goto L_0x00ab
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r4 = r9.f12181P0
            r4.mo25525e(r5)
            int r6 = r4.mo25520c()
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.m14447b(r6)
            if (r6 != 0) goto L_0x00a6
            long r11 = r4.mo25534m()
            goto L_0x00aa
        L_0x00a6:
            long r11 = r4.mo25537p()
        L_0x00aa:
            r15 = r11
        L_0x00ab:
            int r8 = r8 + 1
            r4 = 12
            goto L_0x0049
        L_0x00b0:
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r4 = r1.f12180R0
            int r4 = r4.size()
            r5 = 0
        L_0x00bc:
            if (r5 >= r4) goto L_0x00e4
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r6 = r1.f12180R0
            java.lang.Object r6 = r6.get(r5)
            r8 = r6
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r8 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.C4727a) r8
            int r6 = r8.f12177a
            int r9 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12093E
            if (r6 != r9) goto L_0x00e1
            int r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12091D
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r9 = r1.mo25187d(r6)
            r13 = 0
            r10 = r15
            r12 = r2
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.h r6 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4729b.m14453a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.C4727a) r8, (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.C4728b) r9, (long) r10, (com.fyber.inneractive.sdk.player.exoplayer2.drm.C4644a) r12, (boolean) r13)
            if (r6 == 0) goto L_0x00e1
            int r8 = r6.f12297a
            r3.put(r8, r6)
        L_0x00e1:
            int r5 = r5 + 1
            goto L_0x00bc
        L_0x00e4:
            int r1 = r3.size()
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b> r2 = r0.f12212b
            int r2 = r2.size()
            if (r2 != 0) goto L_0x012f
            r6 = 0
        L_0x00f1:
            if (r6 >= r1) goto L_0x0125
            java.lang.Object r2 = r3.valueAt(r6)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.h r2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4742h) r2
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b r4 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.h r5 = r0.f12236z
            int r7 = r2.f12298b
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r5 = r5.mo25098a(r6, r7)
            r4.<init>(r5)
            int r5 = r2.f12297a
            java.lang.Object r5 = r14.get(r5)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c r5 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4734c) r5
            r4.mo25195a(r2, r5)
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b> r5 = r0.f12212b
            int r7 = r2.f12297a
            r5.put(r7, r4)
            long r4 = r0.f12229s
            long r7 = r2.f12301e
            long r4 = java.lang.Math.max(r4, r7)
            r0.f12229s = r4
            int r6 = r6 + 1
            goto L_0x00f1
        L_0x0125:
            r56.mo25193c()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.h r1 = r0.f12236z
            r1.mo25100c()
            goto L_0x0002
        L_0x012f:
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b> r2 = r0.f12212b
            int r2 = r2.size()
            if (r2 != r1) goto L_0x0138
            goto L_0x0139
        L_0x0138:
            r7 = 0
        L_0x0139:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a.m15051b(r7)
            r6 = 0
        L_0x013d:
            if (r6 >= r1) goto L_0x0002
            java.lang.Object r2 = r3.valueAt(r6)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.h r2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4742h) r2
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b> r4 = r0.f12212b
            int r5 = r2.f12297a
            java.lang.Object r4 = r4.get(r5)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b r4 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4735d.C4737b) r4
            int r5 = r2.f12297a
            java.lang.Object r5 = r14.get(r5)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c r5 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4734c) r5
            r4.mo25195a(r2, r5)
            int r6 = r6 + 1
            goto L_0x013d
        L_0x015d:
            int r3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12107L
            if (r2 != r3) goto L_0x06f1
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b> r2 = r0.f12212b
            int r3 = r0.f12211a
            byte[] r4 = r0.f12219i
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r6 = r1.f12180R0
            int r6 = r6.size()
            r8 = 0
        L_0x016e:
            if (r8 >= r6) goto L_0x0662
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r9 = r1.f12180R0
            java.lang.Object r9 = r9.get(r8)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r9 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.C4727a) r9
            int r10 = r9.f12177a
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12109M
            if (r10 != r11) goto L_0x0642
            int r10 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12173y
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r10 = r9.mo25187d(r10)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r10 = r10.f12181P0
            r10.mo25525e(r5)
            int r11 = r10.mo25520c()
            int r12 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12127b
            r12 = 16777215(0xffffff, float:2.3509886E-38)
            r11 = r11 & r12
            int r13 = r10.mo25520c()
            r14 = r3 & 16
            if (r14 != 0) goto L_0x019c
            goto L_0x019d
        L_0x019c:
            r13 = 0
        L_0x019d:
            java.lang.Object r13 = r2.get(r13)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b r13 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4735d.C4737b) r13
            if (r13 != 0) goto L_0x01a7
            r13 = 0
            goto L_0x01ef
        L_0x01a7:
            r14 = r11 & 1
            if (r14 == 0) goto L_0x01b5
            long r14 = r10.mo25537p()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.j r12 = r13.f12239a
            r12.f12311b = r14
            r12.f12312c = r14
        L_0x01b5:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c r12 = r13.f12242d
            r14 = r11 & 2
            if (r14 == 0) goto L_0x01c1
            int r14 = r10.mo25536o()
            int r14 = r14 - r7
            goto L_0x01c3
        L_0x01c1:
            int r14 = r12.f12202a
        L_0x01c3:
            r15 = r11 & 8
            if (r15 == 0) goto L_0x01cc
            int r15 = r10.mo25536o()
            goto L_0x01ce
        L_0x01cc:
            int r15 = r12.f12203b
        L_0x01ce:
            r19 = r11 & 16
            if (r19 == 0) goto L_0x01d9
            int r19 = r10.mo25536o()
            r7 = r19
            goto L_0x01db
        L_0x01d9:
            int r7 = r12.f12204c
        L_0x01db:
            r11 = r11 & 32
            if (r11 == 0) goto L_0x01e4
            int r10 = r10.mo25536o()
            goto L_0x01e6
        L_0x01e4:
            int r10 = r12.f12205d
        L_0x01e6:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.j r11 = r13.f12239a
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c r12 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c
            r12.<init>(r14, r15, r7, r10)
            r11.f12310a = r12
        L_0x01ef:
            if (r13 != 0) goto L_0x01fe
            r34 = r1
            r21 = r2
            r48 = r3
            r23 = r6
            r32 = r8
            r1 = 1
            goto L_0x064d
        L_0x01fe:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.j r7 = r13.f12239a
            long r10 = r7.f12327r
            r13.mo25194a()
            int r12 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12171x
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r14 = r9.mo25187d(r12)
            if (r14 == 0) goto L_0x022e
            r14 = r3 & 2
            if (r14 != 0) goto L_0x022e
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r10 = r9.mo25187d(r12)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r10 = r10.f12181P0
            r10.mo25525e(r5)
            int r11 = r10.mo25520c()
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.m14447b(r11)
            r12 = 1
            if (r11 != r12) goto L_0x022a
            long r10 = r10.mo25537p()
            goto L_0x022e
        L_0x022a:
            long r10 = r10.mo25534m()
        L_0x022e:
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b> r12 = r9.f12179Q0
            int r14 = r12.size()
            r21 = r2
            r2 = 0
            r5 = 0
            r15 = 0
        L_0x0239:
            if (r15 >= r14) goto L_0x0267
            java.lang.Object r22 = r12.get(r15)
            r23 = r6
            r6 = r22
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r6 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.C4728b) r6
            r24 = r10
            int r10 = r6.f12177a
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12085A
            if (r10 != r11) goto L_0x025e
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r6 = r6.f12181P0
            r10 = 12
            r6.mo25525e(r10)
            int r6 = r6.mo25536o()
            if (r6 <= 0) goto L_0x0260
            int r2 = r2 + r6
            int r5 = r5 + 1
            goto L_0x0260
        L_0x025e:
            r10 = 12
        L_0x0260:
            int r15 = r15 + 1
            r6 = r23
            r10 = r24
            goto L_0x0239
        L_0x0267:
            r23 = r6
            r24 = r10
            r6 = 0
            r10 = 12
            r13.f12245g = r6
            r13.f12244f = r6
            r13.f12243e = r6
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.j r6 = r13.f12239a
            r6.f12313d = r5
            r6.f12314e = r2
            int[] r11 = r6.f12316g
            if (r11 == 0) goto L_0x0281
            int r11 = r11.length
            if (r11 >= r5) goto L_0x0289
        L_0x0281:
            long[] r11 = new long[r5]
            r6.f12315f = r11
            int[] r5 = new int[r5]
            r6.f12316g = r5
        L_0x0289:
            int[] r5 = r6.f12317h
            if (r5 == 0) goto L_0x0290
            int r5 = r5.length
            if (r5 >= r2) goto L_0x02a8
        L_0x0290:
            int r2 = r2 * 125
            int r2 = r2 / 100
            int[] r5 = new int[r2]
            r6.f12317h = r5
            int[] r5 = new int[r2]
            r6.f12318i = r5
            long[] r5 = new long[r2]
            r6.f12319j = r5
            boolean[] r5 = new boolean[r2]
            r6.f12320k = r5
            boolean[] r2 = new boolean[r2]
            r6.f12322m = r2
        L_0x02a8:
            r2 = 0
            r5 = 0
            r6 = 0
        L_0x02ab:
            r26 = 0
            if (r2 >= r14) goto L_0x044b
            java.lang.Object r18 = r12.get(r2)
            r10 = r18
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r10 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.C4728b) r10
            int r15 = r10.f12177a
            int r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12085A
            if (r15 != r11) goto L_0x041c
            int r11 = r5 + 1
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r10 = r10.f12181P0
            r15 = 8
            r10.mo25525e(r15)
            int r15 = r10.mo25520c()
            int r29 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12127b
            r16 = 16777215(0xffffff, float:2.3509886E-38)
            r15 = r15 & r16
            r29 = r11
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.h r11 = r13.f12241c
            r30 = r12
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.j r12 = r13.f12239a
            r31 = r14
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c r14 = r12.f12310a
            int[] r0 = r12.f12316g
            int r32 = r10.mo25536o()
            r0[r5] = r32
            long[] r0 = r12.f12315f
            r33 = r7
            r32 = r8
            long r7 = r12.f12311b
            r0[r5] = r7
            r7 = r15 & 1
            if (r7 == 0) goto L_0x0302
            r7 = r0[r5]
            r34 = r1
            int r1 = r10.mo25520c()
            r35 = r2
            long r1 = (long) r1
            long r7 = r7 + r1
            r0[r5] = r7
            goto L_0x0306
        L_0x0302:
            r34 = r1
            r35 = r2
        L_0x0306:
            r0 = r15 & 4
            if (r0 == 0) goto L_0x030c
            r0 = 1
            goto L_0x030d
        L_0x030c:
            r0 = 0
        L_0x030d:
            int r1 = r14.f12205d
            if (r0 == 0) goto L_0x0315
            int r1 = r10.mo25536o()
        L_0x0315:
            r2 = r15 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x031b
            r2 = 1
            goto L_0x031c
        L_0x031b:
            r2 = 0
        L_0x031c:
            r7 = r15 & 512(0x200, float:7.175E-43)
            if (r7 == 0) goto L_0x0322
            r7 = 1
            goto L_0x0323
        L_0x0322:
            r7 = 0
        L_0x0323:
            r8 = r15 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L_0x0329
            r8 = 1
            goto L_0x032a
        L_0x0329:
            r8 = 0
        L_0x032a:
            r15 = r15 & 2048(0x800, float:2.87E-42)
            r36 = r1
            if (r15 == 0) goto L_0x0332
            r15 = 1
            goto L_0x0333
        L_0x0332:
            r15 = 0
        L_0x0333:
            long[] r1 = r11.f12305i
            r37 = r4
            if (r1 == 0) goto L_0x035a
            int r4 = r1.length
            r38 = r13
            r13 = 1
            if (r4 != r13) goto L_0x0357
            r4 = 0
            r39 = r1[r4]
            int r1 = (r39 > r26 ? 1 : (r39 == r26 ? 0 : -1))
            if (r1 != 0) goto L_0x0357
            long[] r1 = r11.f12306j
            r39 = r1[r4]
            r4 = r8
            r1 = r9
            long r8 = r11.f12299c
            r41 = 1000(0x3e8, double:4.94E-321)
            r43 = r8
            long r26 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.m15135a((long) r39, (long) r41, (long) r43)
            goto L_0x035e
        L_0x0357:
            r4 = r8
            r1 = r9
            goto L_0x035e
        L_0x035a:
            r4 = r8
            r1 = r9
            r38 = r13
        L_0x035e:
            int[] r8 = r12.f12317h
            int[] r9 = r12.f12318i
            long[] r13 = r12.f12319j
            r39 = r1
            boolean[] r1 = r12.f12320k
            r40 = r1
            int r1 = r11.f12298b
            r41 = r8
            r8 = 2
            if (r1 != r8) goto L_0x0377
            r1 = r3 & 1
            if (r1 == 0) goto L_0x0377
            r1 = 1
            goto L_0x0378
        L_0x0377:
            r1 = 0
        L_0x0378:
            int[] r8 = r12.f12316g
            r8 = r8[r5]
            int r8 = r8 + r6
            r48 = r3
            r28 = r4
            long r3 = r11.f12299c
            if (r5 <= 0) goto L_0x0389
            r11 = r6
            long r5 = r12.f12327r
            goto L_0x038c
        L_0x0389:
            r11 = r6
            r5 = r24
        L_0x038c:
            if (r11 >= r8) goto L_0x0413
            if (r2 == 0) goto L_0x0399
            int r42 = r10.mo25536o()
            r49 = r2
            r2 = r42
            goto L_0x039d
        L_0x0399:
            r49 = r2
            int r2 = r14.f12203b
        L_0x039d:
            if (r7 == 0) goto L_0x03a8
            int r42 = r10.mo25536o()
            r50 = r7
            r7 = r42
            goto L_0x03ac
        L_0x03a8:
            r50 = r7
            int r7 = r14.f12204c
        L_0x03ac:
            if (r11 != 0) goto L_0x03b5
            if (r0 == 0) goto L_0x03b5
            r51 = r0
            r0 = r36
            goto L_0x03c4
        L_0x03b5:
            if (r28 == 0) goto L_0x03c0
            int r42 = r10.mo25520c()
            r51 = r0
            r0 = r42
            goto L_0x03c4
        L_0x03c0:
            r51 = r0
            int r0 = r14.f12205d
        L_0x03c4:
            if (r15 == 0) goto L_0x03d8
            r52 = r8
            int r8 = r10.mo25520c()
            int r8 = r8 * 1000
            r53 = r14
            r54 = r15
            long r14 = (long) r8
            long r14 = r14 / r3
            int r8 = (int) r14
            r9[r11] = r8
            goto L_0x03e1
        L_0x03d8:
            r52 = r8
            r53 = r14
            r54 = r15
            r8 = 0
            r9[r11] = r8
        L_0x03e1:
            r44 = 1000(0x3e8, double:4.94E-321)
            r42 = r5
            r46 = r3
            long r14 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u.m15135a((long) r42, (long) r44, (long) r46)
            long r14 = r14 - r26
            r13[r11] = r14
            r41[r11] = r7
            r7 = 16
            int r0 = r0 >> r7
            r7 = 1
            r0 = r0 & r7
            if (r0 != 0) goto L_0x03fe
            if (r1 == 0) goto L_0x03fc
            if (r11 != 0) goto L_0x03fe
        L_0x03fc:
            r0 = 1
            goto L_0x03ff
        L_0x03fe:
            r0 = 0
        L_0x03ff:
            r40[r11] = r0
            long r7 = (long) r2
            long r5 = r5 + r7
            int r11 = r11 + 1
            r2 = r49
            r7 = r50
            r0 = r51
            r8 = r52
            r14 = r53
            r15 = r54
            goto L_0x038c
        L_0x0413:
            r52 = r8
            r12.f12327r = r5
            r5 = r29
            r6 = r52
            goto L_0x0431
        L_0x041c:
            r34 = r1
            r35 = r2
            r48 = r3
            r37 = r4
            r11 = r6
            r33 = r7
            r32 = r8
            r39 = r9
            r30 = r12
            r38 = r13
            r31 = r14
        L_0x0431:
            int r2 = r35 + 1
            r0 = r56
            r12 = r30
            r14 = r31
            r8 = r32
            r7 = r33
            r1 = r34
            r4 = r37
            r13 = r38
            r9 = r39
            r3 = r48
            r10 = 12
            goto L_0x02ab
        L_0x044b:
            r34 = r1
            r48 = r3
            r37 = r4
            r33 = r7
            r32 = r8
            r39 = r9
            r38 = r13
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12132d0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r0 = r9.mo25187d(r0)
            if (r0 == 0) goto L_0x04df
            r13 = r38
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.h r1 = r13.f12241c
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.i[] r1 = r1.f12304h
            r2 = r33
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c r3 = r2.f12310a
            int r3 = r3.f12202a
            r1 = r1[r3]
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r0 = r0.f12181P0
            int r1 = r1.f12308a
            r3 = 8
            r0.mo25525e(r3)
            int r4 = r0.mo25520c()
            int r5 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12127b
            r6 = 16777215(0xffffff, float:2.3509886E-38)
            r4 = r4 & r6
            r5 = 1
            r4 = r4 & r5
            if (r4 != r5) goto L_0x0489
            r0.mo25527f(r3)
        L_0x0489:
            int r3 = r0.mo25533l()
            int r4 = r0.mo25536o()
            int r5 = r2.f12314e
            if (r4 != r5) goto L_0x04be
            if (r3 != 0) goto L_0x04ac
            boolean[] r3 = r2.f12322m
            r5 = 0
            r6 = 0
        L_0x049b:
            if (r5 >= r4) goto L_0x04ba
            int r7 = r0.mo25533l()
            int r6 = r6 + r7
            if (r7 <= r1) goto L_0x04a6
            r7 = 1
            goto L_0x04a7
        L_0x04a6:
            r7 = 0
        L_0x04a7:
            r3[r5] = r7
            int r5 = r5 + 1
            goto L_0x049b
        L_0x04ac:
            if (r3 <= r1) goto L_0x04b0
            r0 = 1
            goto L_0x04b1
        L_0x04b0:
            r0 = 0
        L_0x04b1:
            int r3 = r3 * r4
            r1 = 0
            int r6 = r3 + 0
            boolean[] r3 = r2.f12322m
            java.util.Arrays.fill(r3, r1, r4, r0)
        L_0x04ba:
            r2.mo25198a(r6)
            goto L_0x04e1
        L_0x04be:
            com.fyber.inneractive.sdk.player.exoplayer2.l r0 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Length mismatch: "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = ", "
            r1.append(r3)
            int r2 = r2.f12314e
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x04df:
            r2 = r33
        L_0x04e1:
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12134e0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r0 = r9.mo25187d(r0)
            if (r0 == 0) goto L_0x0534
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r0 = r0.f12181P0
            r1 = 8
            r0.mo25525e(r1)
            int r3 = r0.mo25520c()
            int r4 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12127b
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            r4 = r3 & r5
            r5 = 1
            r4 = r4 & r5
            if (r4 != r5) goto L_0x0502
            r0.mo25527f(r1)
        L_0x0502:
            int r1 = r0.mo25536o()
            if (r1 != r5) goto L_0x051d
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.m14447b(r3)
            long r3 = r2.f12312c
            if (r1 != 0) goto L_0x0515
            long r0 = r0.mo25534m()
            goto L_0x0519
        L_0x0515:
            long r0 = r0.mo25537p()
        L_0x0519:
            long r3 = r3 + r0
            r2.f12312c = r3
            goto L_0x0534
        L_0x051d:
            com.fyber.inneractive.sdk.player.exoplayer2.l r0 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unexpected saio entry count: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0534:
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12142i0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r0 = r9.mo25187d(r0)
            if (r0 == 0) goto L_0x0542
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r0 = r0.f12181P0
            r1 = 0
            m14464a(r0, r1, r2)
        L_0x0542:
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12136f0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r0 = r9.mo25187d(r0)
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12138g0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r1 = r9.mo25187d(r1)
            if (r0 == 0) goto L_0x05f3
            if (r1 == 0) goto L_0x05f3
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r0 = r0.f12181P0
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r1 = r1.f12181P0
            r3 = 8
            r0.mo25525e(r3)
            int r3 = r0.mo25520c()
            int r4 = r0.mo25520c()
            int r5 = f12206D
            if (r4 == r5) goto L_0x0569
            goto L_0x05f3
        L_0x0569:
            int r3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.m14447b(r3)
            r4 = 4
            r6 = 1
            if (r3 != r6) goto L_0x0574
            r0.mo25527f(r4)
        L_0x0574:
            int r0 = r0.mo25520c()
            if (r0 != r6) goto L_0x05eb
            r0 = 8
            r1.mo25525e(r0)
            int r0 = r1.mo25520c()
            int r3 = r1.mo25520c()
            if (r3 == r5) goto L_0x058b
            r1 = r6
            goto L_0x05f4
        L_0x058b:
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.m14447b(r0)
            if (r0 != r6) goto L_0x05a3
            long r3 = r1.mo25534m()
            int r0 = (r3 > r26 ? 1 : (r3 == r26 ? 0 : -1))
            if (r0 == 0) goto L_0x059b
            r3 = 2
            goto L_0x05a9
        L_0x059b:
            com.fyber.inneractive.sdk.player.exoplayer2.l r0 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r1 = "Variable length decription in sgpd found (unsupported)"
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x05a3:
            r3 = 2
            if (r0 < r3) goto L_0x05a9
            r1.mo25527f(r4)
        L_0x05a9:
            long r4 = r1.mo25534m()
            r6 = 1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x05e3
            r1.mo25527f(r3)
            int r0 = r1.mo25533l()
            r3 = 1
            if (r0 != r3) goto L_0x05bf
            r12 = 1
            goto L_0x05c0
        L_0x05bf:
            r12 = 0
        L_0x05c0:
            if (r12 != 0) goto L_0x05c3
            goto L_0x05f3
        L_0x05c3:
            int r0 = r1.mo25533l()
            r3 = 16
            byte[] r4 = new byte[r3]
            byte[] r5 = r1.f13243a
            int r6 = r1.f13244b
            r7 = 0
            java.lang.System.arraycopy(r5, r6, r4, r7, r3)
            int r5 = r1.f13244b
            int r5 = r5 + r3
            r1.f13244b = r5
            r1 = 1
            r2.f12321l = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.i r3 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.i
            r3.<init>(r12, r0, r4)
            r2.f12323n = r3
            goto L_0x05f4
        L_0x05e3:
            com.fyber.inneractive.sdk.player.exoplayer2.l r0 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r1 = "Entry count in sgpd != 1 (unsupported)."
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x05eb:
            com.fyber.inneractive.sdk.player.exoplayer2.l r0 = new com.fyber.inneractive.sdk.player.exoplayer2.l
            java.lang.String r1 = "Entry count in sbgp != 1 (unsupported)."
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x05f3:
            r1 = 1
        L_0x05f4:
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b> r0 = r9.f12179Q0
            int r0 = r0.size()
            r6 = 0
        L_0x05fb:
            if (r6 >= r0) goto L_0x063c
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b> r3 = r9.f12179Q0
            java.lang.Object r3 = r3.get(r6)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r3 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.C4728b) r3
            int r4 = r3.f12177a
            int r5 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12140h0
            if (r4 != r5) goto L_0x0630
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r3 = r3.f12181P0
            r4 = 8
            r3.mo25525e(r4)
            byte[] r5 = r3.f13243a
            int r7 = r3.f13244b
            r8 = r37
            r10 = 16
            r11 = 0
            java.lang.System.arraycopy(r5, r7, r8, r11, r10)
            int r5 = r3.f13244b
            int r5 = r5 + r10
            r3.f13244b = r5
            byte[] r5 = f12207E
            boolean r5 = java.util.Arrays.equals(r8, r5)
            if (r5 != 0) goto L_0x062c
            goto L_0x0637
        L_0x062c:
            m14464a(r3, r10, r2)
            goto L_0x0637
        L_0x0630:
            r8 = r37
            r4 = 8
            r10 = 16
            r11 = 0
        L_0x0637:
            int r6 = r6 + 1
            r37 = r8
            goto L_0x05fb
        L_0x063c:
            r8 = r37
            r4 = 8
            r11 = 0
            goto L_0x0650
        L_0x0642:
            r34 = r1
            r21 = r2
            r48 = r3
            r23 = r6
            r1 = r7
            r32 = r8
        L_0x064d:
            r11 = 0
            r8 = r4
            r4 = r5
        L_0x0650:
            int r0 = r32 + 1
            r7 = r1
            r5 = r4
            r4 = r8
            r2 = r21
            r6 = r23
            r1 = r34
            r3 = r48
            r8 = r0
            r0 = r56
            goto L_0x016e
        L_0x0662:
            r0 = r1
            r11 = 0
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b> r0 = r0.f12179Q0
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a r0 = m14463a((java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.C4728b>) r0)
            if (r0 == 0) goto L_0x0000
            r1 = r56
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b> r2 = r1.f12212b
            int r2 = r2.size()
            r6 = r11
        L_0x0675:
            if (r6 >= r2) goto L_0x070b
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b> r3 = r1.f12212b
            java.lang.Object r3 = r3.valueAt(r6)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.d$b r3 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4735d.C4737b) r3
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r4 = r3.f12240b
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.h r3 = r3.f12241c
            com.fyber.inneractive.sdk.player.exoplayer2.i r3 = r3.f12302f
            com.fyber.inneractive.sdk.player.exoplayer2.i r5 = new com.fyber.inneractive.sdk.player.exoplayer2.i
            r12 = r5
            java.lang.String r13 = r3.f12750a
            java.lang.String r14 = r3.f12754e
            java.lang.String r15 = r3.f12755f
            java.lang.String r7 = r3.f12752c
            r16 = r7
            int r7 = r3.f12751b
            r17 = r7
            int r7 = r3.f12756g
            r18 = r7
            int r7 = r3.f12759j
            r19 = r7
            int r7 = r3.f12760k
            r20 = r7
            float r7 = r3.f12761l
            r21 = r7
            int r7 = r3.f12762m
            r22 = r7
            float r7 = r3.f12763n
            r23 = r7
            byte[] r7 = r3.f12765p
            r24 = r7
            int r7 = r3.f12764o
            r25 = r7
            com.fyber.inneractive.sdk.player.exoplayer2.video.b r7 = r3.f12766q
            r26 = r7
            int r7 = r3.f12767r
            r27 = r7
            int r7 = r3.f12768s
            r28 = r7
            int r7 = r3.f12769t
            r29 = r7
            int r7 = r3.f12770u
            r30 = r7
            int r7 = r3.f12771v
            r31 = r7
            int r7 = r3.f12773x
            r32 = r7
            java.lang.String r7 = r3.f12774y
            r33 = r7
            int r7 = r3.f12775z
            r34 = r7
            long r7 = r3.f12772w
            r35 = r7
            java.util.List<byte[]> r7 = r3.f12757h
            r37 = r7
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.a r3 = r3.f12753d
            r39 = r3
            r38 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r37, r38, r39)
            r4.mo25074a(r5)
            int r6 = r6 + 1
            goto L_0x0675
        L_0x06f1:
            r55 = r1
            r1 = r0
            r0 = r55
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r2 = r1.f12220j
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x070b
            java.util.Stack<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r2 = r1.f12220j
            java.lang.Object r2 = r2.peek()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a r2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.C4727a) r2
            java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$a> r2 = r2.f12180R0
            r2.add(r0)
        L_0x070b:
            r0 = r1
            goto L_0x0002
        L_0x070e:
            r1 = r0
            r56.mo25191a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4735d.mo25192a(long):void");
    }

    /* renamed from: a */
    public static void m14464a(C4978k kVar, int i, C4744j jVar) throws C4815l {
        kVar.mo25525e(i + 8);
        int c = kVar.mo25520c();
        int i2 = C4726a.f12127b;
        int i3 = c & ViewCompat.MEASURED_SIZE_MASK;
        if ((i3 & 1) == 0) {
            boolean z = (i3 & 2) != 0;
            int o = kVar.mo25536o();
            if (o == jVar.f12314e) {
                Arrays.fill(jVar.f12322m, 0, o, z);
                jVar.mo25198a(kVar.mo25513a());
                kVar.mo25517a(jVar.f12325p.f13243a, 0, jVar.f12324o);
                jVar.f12325p.mo25525e(0);
                jVar.f12326q = false;
                return;
            }
            throw new C4815l("Length mismatch: " + o + ", " + jVar.f12314e);
        }
        throw new C4815l("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ae  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.fyber.inneractive.sdk.player.exoplayer2.drm.C4644a m14463a(java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.C4728b> r14) {
        /*
            int r0 = r14.size()
            r1 = 0
            r2 = 0
            r3 = r1
            r4 = r2
        L_0x0008:
            if (r3 >= r0) goto L_0x00bc
            java.lang.Object r5 = r14.get(r3)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.a$b r5 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.C4728b) r5
            int r6 = r5.f12177a
            int r7 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.f12121V
            if (r6 != r7) goto L_0x00b8
            if (r4 != 0) goto L_0x001d
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x001d:
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r5 = r5.f12181P0
            byte[] r5 = r5.f13243a
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r6 = new com.fyber.inneractive.sdk.player.exoplayer2.util.k
            r6.<init>((byte[]) r5)
            int r8 = r6.f13245c
            r9 = 32
            if (r8 >= r9) goto L_0x002d
            goto L_0x0088
        L_0x002d:
            r6.mo25525e(r1)
            int r8 = r6.mo25520c()
            int r9 = r6.mo25513a()
            int r9 = r9 + 4
            if (r8 == r9) goto L_0x003d
            goto L_0x0088
        L_0x003d:
            int r8 = r6.mo25520c()
            if (r8 == r7) goto L_0x0044
            goto L_0x0088
        L_0x0044:
            int r7 = r6.mo25520c()
            int r7 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4726a.m14447b(r7)
            r8 = 1
            if (r7 <= r8) goto L_0x0066
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "Unsupported pssh version: "
            r6.append(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "PsshAtomUtil"
            android.util.Log.w(r7, r6)
            goto L_0x0088
        L_0x0066:
            java.util.UUID r9 = new java.util.UUID
            long r10 = r6.mo25530i()
            long r12 = r6.mo25530i()
            r9.<init>(r10, r12)
            if (r7 != r8) goto L_0x007e
            int r7 = r6.mo25536o()
            int r7 = r7 * 16
            r6.mo25527f(r7)
        L_0x007e:
            int r7 = r6.mo25536o()
            int r8 = r6.mo25513a()
            if (r7 == r8) goto L_0x008a
        L_0x0088:
            r6 = r2
            goto L_0x009c
        L_0x008a:
            byte[] r8 = new byte[r7]
            byte[] r10 = r6.f13243a
            int r11 = r6.f13244b
            java.lang.System.arraycopy(r10, r11, r8, r1, r7)
            int r10 = r6.f13244b
            int r10 = r10 + r7
            r6.f13244b = r10
            android.util.Pair r6 = android.util.Pair.create(r9, r8)
        L_0x009c:
            if (r6 != 0) goto L_0x00a0
            r6 = r2
            goto L_0x00a4
        L_0x00a0:
            java.lang.Object r6 = r6.first
            java.util.UUID r6 = (java.util.UUID) r6
        L_0x00a4:
            if (r6 != 0) goto L_0x00ae
            java.lang.String r5 = "FragmentedMp4Extractor"
            java.lang.String r6 = "Skipped pssh atom (failed to extract uuid)"
            android.util.Log.w(r5, r6)
            goto L_0x00b8
        L_0x00ae:
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a$b r7 = new com.fyber.inneractive.sdk.player.exoplayer2.drm.a$b
            java.lang.String r8 = "video/mp4"
            r7.<init>(r6, r8, r5, r1)
            r4.add(r7)
        L_0x00b8:
            int r3 = r3 + 1
            goto L_0x0008
        L_0x00bc:
            if (r4 != 0) goto L_0x00bf
            goto L_0x00d0
        L_0x00bf:
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a r2 = new com.fyber.inneractive.sdk.player.exoplayer2.drm.a
            int r14 = r4.size()
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a$b[] r14 = new com.fyber.inneractive.sdk.player.exoplayer2.drm.C4644a.C4646b[r14]
            java.lang.Object[] r14 = r4.toArray(r14)
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a$b[] r14 = (com.fyber.inneractive.sdk.player.exoplayer2.drm.C4644a.C4646b[]) r14
            r2.<init>(r1, r14)
        L_0x00d0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4735d.m14463a(java.util.List):com.fyber.inneractive.sdk.player.exoplayer2.drm.a");
    }
}
