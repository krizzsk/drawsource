package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p189ts;

import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4673h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4746n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p189ts.C4795v;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4974i;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4978k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4979l;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j */
public final class C4776j implements C4773h {

    /* renamed from: a */
    public final C4790s f12483a;

    /* renamed from: b */
    public final boolean f12484b;

    /* renamed from: c */
    public final boolean f12485c;

    /* renamed from: d */
    public final C4784n f12486d = new C4784n(7, 128);

    /* renamed from: e */
    public final C4784n f12487e = new C4784n(8, 128);

    /* renamed from: f */
    public final C4784n f12488f = new C4784n(6, 128);

    /* renamed from: g */
    public long f12489g;

    /* renamed from: h */
    public final boolean[] f12490h = new boolean[3];

    /* renamed from: i */
    public String f12491i;

    /* renamed from: j */
    public C4746n f12492j;

    /* renamed from: k */
    public C4778b f12493k;

    /* renamed from: l */
    public boolean f12494l;

    /* renamed from: m */
    public long f12495m;

    /* renamed from: n */
    public final C4978k f12496n = new C4978k();

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b */
    public static final class C4778b {

        /* renamed from: a */
        public final C4746n f12497a;

        /* renamed from: b */
        public final boolean f12498b;

        /* renamed from: c */
        public final boolean f12499c;

        /* renamed from: d */
        public final SparseArray<C4974i.C4976b> f12500d = new SparseArray<>();

        /* renamed from: e */
        public final SparseArray<C4974i.C4975a> f12501e = new SparseArray<>();

        /* renamed from: f */
        public final C4979l f12502f;

        /* renamed from: g */
        public byte[] f12503g;

        /* renamed from: h */
        public int f12504h;

        /* renamed from: i */
        public int f12505i;

        /* renamed from: j */
        public long f12506j;

        /* renamed from: k */
        public boolean f12507k;

        /* renamed from: l */
        public long f12508l;

        /* renamed from: m */
        public C4779a f12509m = new C4779a();

        /* renamed from: n */
        public C4779a f12510n = new C4779a();

        /* renamed from: o */
        public boolean f12511o;

        /* renamed from: p */
        public long f12512p;

        /* renamed from: q */
        public long f12513q;

        /* renamed from: r */
        public boolean f12514r;

        /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b$a */
        public static final class C4779a {

            /* renamed from: a */
            public boolean f12515a;

            /* renamed from: b */
            public boolean f12516b;

            /* renamed from: c */
            public C4974i.C4976b f12517c;

            /* renamed from: d */
            public int f12518d;

            /* renamed from: e */
            public int f12519e;

            /* renamed from: f */
            public int f12520f;

            /* renamed from: g */
            public int f12521g;

            /* renamed from: h */
            public boolean f12522h;

            /* renamed from: i */
            public boolean f12523i;

            /* renamed from: j */
            public boolean f12524j;

            /* renamed from: k */
            public boolean f12525k;

            /* renamed from: l */
            public int f12526l;

            /* renamed from: m */
            public int f12527m;

            /* renamed from: n */
            public int f12528n;

            /* renamed from: o */
            public int f12529o;

            /* renamed from: p */
            public int f12530p;

            public C4779a() {
            }

            /* renamed from: a */
            public static boolean m14604a(C4779a aVar, C4779a aVar2) {
                boolean z;
                boolean z2;
                if (aVar.f12515a) {
                    if (!aVar2.f12515a || aVar.f12520f != aVar2.f12520f || aVar.f12521g != aVar2.f12521g || aVar.f12522h != aVar2.f12522h) {
                        return true;
                    }
                    if (aVar.f12523i && aVar2.f12523i && aVar.f12524j != aVar2.f12524j) {
                        return true;
                    }
                    int i = aVar.f12518d;
                    int i2 = aVar2.f12518d;
                    if (i != i2 && (i == 0 || i2 == 0)) {
                        return true;
                    }
                    int i3 = aVar.f12517c.f13236h;
                    if (i3 == 0 && aVar2.f12517c.f13236h == 0 && (aVar.f12527m != aVar2.f12527m || aVar.f12528n != aVar2.f12528n)) {
                        return true;
                    }
                    if ((i3 != 1 || aVar2.f12517c.f13236h != 1 || (aVar.f12529o == aVar2.f12529o && aVar.f12530p == aVar2.f12530p)) && (z = aVar.f12525k) == (z2 = aVar2.f12525k)) {
                        return z && z2 && aVar.f12526l != aVar2.f12526l;
                    }
                    return true;
                }
            }
        }

        public C4778b(C4746n nVar, boolean z, boolean z2) {
            this.f12497a = nVar;
            this.f12498b = z;
            this.f12499c = z2;
            byte[] bArr = new byte[128];
            this.f12503g = bArr;
            this.f12502f = new C4979l(bArr, 0, 0);
            mo25232a();
        }

        /* renamed from: a */
        public void mo25232a() {
            this.f12507k = false;
            this.f12511o = false;
            C4779a aVar = this.f12510n;
            aVar.f12516b = false;
            aVar.f12515a = false;
        }
    }

    public C4776j(C4790s sVar, boolean z, boolean z2) {
        this.f12483a = sVar;
        this.f12484b = z;
        this.f12485c = z2;
    }

    /* renamed from: a */
    public void mo25218a() {
        C4974i.m15070a(this.f12490h);
        this.f12486d.mo25234a();
        this.f12487e.mo25234a();
        this.f12488f.mo25234a();
        C4778b bVar = this.f12493k;
        bVar.f12507k = false;
        bVar.f12511o = false;
        C4778b.C4779a aVar = bVar.f12510n;
        aVar.f12516b = false;
        aVar.f12515a = false;
        this.f12489g = 0;
    }

    /* renamed from: b */
    public void mo25222b() {
    }

    /* renamed from: a */
    public void mo25220a(C4673h hVar, C4795v.C4799d dVar) {
        dVar.mo25247a();
        this.f12491i = dVar.mo25248b();
        C4746n a = hVar.mo25098a(dVar.mo25249c(), 2);
        this.f12492j = a;
        this.f12493k = new C4778b(a, this.f12484b, this.f12485c);
        this.f12483a.mo25245a(hVar, dVar);
    }

    /* renamed from: a */
    public void mo25219a(long j, boolean z) {
        this.f12495m = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01b9, code lost:
        if ((r1.f12516b && ((r1 = r1.f12519e) == 7 || r1 == 2)) != false) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01ea, code lost:
        if (r6 != 1) goto L_0x01ee;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01f2 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x020a A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo25221a(com.fyber.inneractive.sdk.player.exoplayer2.util.C4978k r31) {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            int r2 = r1.f13244b
            int r3 = r1.f13245c
            byte[] r4 = r1.f13243a
            long r5 = r0.f12489g
            int r7 = r31.mo25513a()
            long r7 = (long) r7
            long r5 = r5 + r7
            r0.f12489g = r5
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r5 = r0.f12492j
            int r6 = r31.mo25513a()
            r5.mo25075a(r1, r6)
        L_0x001d:
            boolean[] r1 = r0.f12490h
            int r1 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4974i.m15068a(r4, r2, r3, r1)
            if (r1 != r3) goto L_0x0029
            r0.mo25231a(r4, r2, r3)
            return
        L_0x0029:
            int r5 = r1 + 3
            byte r6 = r4[r5]
            r6 = r6 & 31
            int r7 = r1 - r2
            if (r7 <= 0) goto L_0x0036
            r0.mo25231a(r4, r2, r1)
        L_0x0036:
            int r1 = r3 - r1
            long r8 = r0.f12489g
            long r10 = (long) r1
            long r8 = r8 - r10
            if (r7 >= 0) goto L_0x0040
            int r7 = -r7
            goto L_0x0041
        L_0x0040:
            r7 = 0
        L_0x0041:
            long r10 = r0.f12495m
            boolean r12 = r0.f12494l
            if (r12 == 0) goto L_0x0056
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b r12 = r0.f12493k
            boolean r12 = r12.f12499c
            if (r12 == 0) goto L_0x004e
            goto L_0x0056
        L_0x004e:
            r27 = r3
            r28 = r4
            r29 = r5
            goto L_0x0130
        L_0x0056:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r12 = r0.f12486d
            r12.mo25236a(r7)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r12 = r0.f12487e
            r12.mo25236a(r7)
            boolean r12 = r0.f12494l
            r14 = 3
            if (r12 != 0) goto L_0x00f1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r12 = r0.f12486d
            boolean r12 = r12.f12578c
            if (r12 == 0) goto L_0x004e
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r12 = r0.f12487e
            boolean r12 = r12.f12578c
            if (r12 == 0) goto L_0x004e
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r15 = r0.f12486d
            byte[] r2 = r15.f12579d
            int r15 = r15.f12580e
            byte[] r2 = java.util.Arrays.copyOf(r2, r15)
            r12.add(r2)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r2 = r0.f12487e
            byte[] r15 = r2.f12579d
            int r2 = r2.f12580e
            byte[] r2 = java.util.Arrays.copyOf(r15, r2)
            r12.add(r2)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r2 = r0.f12486d
            byte[] r15 = r2.f12579d
            int r2 = r2.f12580e
            com.fyber.inneractive.sdk.player.exoplayer2.util.i$b r2 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4974i.m15071b(r15, r14, r2)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r15 = r0.f12487e
            byte[] r13 = r15.f12579d
            int r15 = r15.f12580e
            com.fyber.inneractive.sdk.player.exoplayer2.util.i$a r13 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4974i.m15069a(r13, r14, r15)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r14 = r0.f12492j
            java.lang.String r15 = r0.f12491i
            r27 = r3
            int r3 = r2.f13230b
            r28 = r4
            int r4 = r2.f13231c
            r29 = r5
            float r5 = r2.f13232d
            r17 = 0
            r18 = -1
            r19 = -1
            r22 = -1082130432(0xffffffffbf800000, float:-1.0)
            r24 = -1
            r26 = 0
            java.lang.String r16 = "video/avc"
            r20 = r3
            r21 = r4
            r23 = r12
            r25 = r5
            com.fyber.inneractive.sdk.player.exoplayer2.i r3 = com.fyber.inneractive.sdk.player.exoplayer2.C4811i.m14719a((java.lang.String) r15, (java.lang.String) r16, (java.lang.String) r17, (int) r18, (int) r19, (int) r20, (int) r21, (float) r22, (java.util.List<byte[]>) r23, (int) r24, (float) r25, (com.fyber.inneractive.sdk.player.exoplayer2.drm.C4644a) r26)
            r14.mo25074a(r3)
            r3 = 1
            r0.f12494l = r3
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b r3 = r0.f12493k
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.util.i$b> r3 = r3.f12500d
            int r4 = r2.f13229a
            r3.append(r4, r2)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b r2 = r0.f12493k
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.util.i$a> r2 = r2.f12501e
            int r3 = r13.f13226a
            r2.append(r3, r13)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r2 = r0.f12486d
            r2.mo25234a()
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r2 = r0.f12487e
            r2.mo25234a()
            goto L_0x0130
        L_0x00f1:
            r27 = r3
            r28 = r4
            r29 = r5
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r2 = r0.f12486d
            boolean r3 = r2.f12578c
            if (r3 == 0) goto L_0x0114
            byte[] r3 = r2.f12579d
            int r2 = r2.f12580e
            com.fyber.inneractive.sdk.player.exoplayer2.util.i$b r2 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4974i.m15071b(r3, r14, r2)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b r3 = r0.f12493k
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.util.i$b> r3 = r3.f12500d
            int r4 = r2.f13229a
            r3.append(r4, r2)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r2 = r0.f12486d
            r2.mo25234a()
            goto L_0x0130
        L_0x0114:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r2 = r0.f12487e
            boolean r3 = r2.f12578c
            if (r3 == 0) goto L_0x0130
            byte[] r3 = r2.f12579d
            int r2 = r2.f12580e
            com.fyber.inneractive.sdk.player.exoplayer2.util.i$a r2 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4974i.m15069a(r3, r14, r2)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b r3 = r0.f12493k
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.util.i$a> r3 = r3.f12501e
            int r4 = r2.f13226a
            r3.append(r4, r2)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r2 = r0.f12487e
            r2.mo25234a()
        L_0x0130:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r2 = r0.f12488f
            boolean r2 = r2.mo25236a(r7)
            if (r2 == 0) goto L_0x015a
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r2 = r0.f12488f
            byte[] r3 = r2.f12579d
            int r2 = r2.f12580e
            int r2 = com.fyber.inneractive.sdk.player.exoplayer2.util.C4974i.m15067a(r3, r2)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r3 = r0.f12496n
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r4 = r0.f12488f
            byte[] r4 = r4.f12579d
            r3.mo25516a((byte[]) r4, (int) r2)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r2 = r0.f12496n
            r3 = 4
            r2.mo25525e(r3)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.s r2 = r0.f12483a
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r3 = r0.f12496n
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n[] r2 = r2.f12614b
            com.fyber.inneractive.sdk.player.exoplayer2.text.cea.C4893a.m14900a(r10, r3, r2)
        L_0x015a:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b r2 = r0.f12493k
            int r3 = r2.f12505i
            r4 = 9
            if (r3 == r4) goto L_0x0173
            boolean r3 = r2.f12499c
            if (r3 == 0) goto L_0x0171
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b$a r3 = r2.f12510n
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b$a r4 = r2.f12509m
            boolean r3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.p189ts.C4776j.C4778b.C4779a.m14604a(r3, r4)
            if (r3 == 0) goto L_0x0171
            goto L_0x0173
        L_0x0171:
            r1 = 1
            goto L_0x019b
        L_0x0173:
            boolean r3 = r2.f12511o
            if (r3 == 0) goto L_0x018d
            long r3 = r2.f12506j
            long r10 = r8 - r3
            int r5 = (int) r10
            int r15 = r1 + r5
            boolean r13 = r2.f12514r
            long r10 = r2.f12512p
            long r3 = r3 - r10
            int r14 = (int) r3
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r10 = r2.f12497a
            long r11 = r2.f12513q
            r16 = 0
            r10.mo25072a(r11, r13, r14, r15, r16)
        L_0x018d:
            long r3 = r2.f12506j
            r2.f12512p = r3
            long r3 = r2.f12508l
            r2.f12513q = r3
            r1 = 0
            r2.f12514r = r1
            r1 = 1
            r2.f12511o = r1
        L_0x019b:
            boolean r3 = r2.f12514r
            int r4 = r2.f12505i
            r5 = 2
            r7 = 5
            if (r4 == r7) goto L_0x01be
            boolean r10 = r2.f12498b
            if (r10 == 0) goto L_0x01bc
            if (r4 != r1) goto L_0x01bc
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b$a r1 = r2.f12510n
            boolean r4 = r1.f12516b
            if (r4 == 0) goto L_0x01b8
            int r1 = r1.f12519e
            r4 = 7
            if (r1 == r4) goto L_0x01b6
            if (r1 != r5) goto L_0x01b8
        L_0x01b6:
            r1 = 1
            goto L_0x01b9
        L_0x01b8:
            r1 = 0
        L_0x01b9:
            if (r1 == 0) goto L_0x01bc
            goto L_0x01be
        L_0x01bc:
            r1 = 0
            goto L_0x01bf
        L_0x01be:
            r1 = 1
        L_0x01bf:
            r1 = r1 | r3
            r2.f12514r = r1
            long r1 = r0.f12495m
            boolean r3 = r0.f12494l
            if (r3 == 0) goto L_0x01ce
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b r3 = r0.f12493k
            boolean r3 = r3.f12499c
            if (r3 == 0) goto L_0x01d8
        L_0x01ce:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r3 = r0.f12486d
            r3.mo25237b(r6)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r3 = r0.f12487e
            r3.mo25237b(r6)
        L_0x01d8:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r3 = r0.f12488f
            r3.mo25237b(r6)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b r3 = r0.f12493k
            r3.f12505i = r6
            r3.f12508l = r1
            r3.f12506j = r8
            boolean r1 = r3.f12498b
            if (r1 == 0) goto L_0x01ed
            r1 = 1
            if (r6 == r1) goto L_0x01f8
            goto L_0x01ee
        L_0x01ed:
            r1 = 1
        L_0x01ee:
            boolean r2 = r3.f12499c
            if (r2 == 0) goto L_0x020a
            if (r6 == r7) goto L_0x01f8
            if (r6 == r1) goto L_0x01f8
            if (r6 != r5) goto L_0x020a
        L_0x01f8:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b$a r1 = r3.f12509m
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b$a r2 = r3.f12510n
            r3.f12509m = r2
            r3.f12510n = r1
            r2 = 0
            r1.f12516b = r2
            r1.f12515a = r2
            r3.f12504h = r2
            r1 = 1
            r3.f12507k = r1
        L_0x020a:
            r3 = r27
            r4 = r28
            r2 = r29
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.p189ts.C4776j.mo25221a(com.fyber.inneractive.sdk.player.exoplayer2.util.k):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0170  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25231a(byte[] r17, int r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            boolean r4 = r0.f12494l
            if (r4 == 0) goto L_0x0012
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b r4 = r0.f12493k
            boolean r4 = r4.f12499c
            if (r4 == 0) goto L_0x001c
        L_0x0012:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r4 = r0.f12486d
            r4.mo25235a(r1, r2, r3)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r4 = r0.f12487e
            r4.mo25235a(r1, r2, r3)
        L_0x001c:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.n r4 = r0.f12488f
            r4.mo25235a(r1, r2, r3)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b r4 = r0.f12493k
            boolean r5 = r4.f12507k
            if (r5 != 0) goto L_0x0029
            goto L_0x01cd
        L_0x0029:
            int r3 = r3 - r2
            byte[] r5 = r4.f12503g
            int r6 = r5.length
            int r7 = r4.f12504h
            int r7 = r7 + r3
            r8 = 2
            if (r6 >= r7) goto L_0x003a
            int r7 = r7 * r8
            byte[] r5 = java.util.Arrays.copyOf(r5, r7)
            r4.f12503g = r5
        L_0x003a:
            byte[] r5 = r4.f12503g
            int r6 = r4.f12504h
            java.lang.System.arraycopy(r1, r2, r5, r6, r3)
            int r1 = r4.f12504h
            int r1 = r1 + r3
            r4.f12504h = r1
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r2 = r4.f12502f
            byte[] r3 = r4.f12503g
            r2.f13246a = r3
            r3 = 0
            r2.f13248c = r3
            r2.f13247b = r1
            r2.f13249d = r3
            r2.mo25540a()
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r1 = r4.f12502f
            r2 = 8
            boolean r1 = r1.mo25542a(r2)
            if (r1 != 0) goto L_0x0062
            goto L_0x01cd
        L_0x0062:
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r1 = r4.f12502f
            r1.mo25550f()
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r1 = r4.f12502f
            int r1 = r1.mo25543b(r8)
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r2 = r4.f12502f
            r5 = 5
            r2.mo25548d(r5)
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r2 = r4.f12502f
            boolean r2 = r2.mo25544b()
            if (r2 != 0) goto L_0x007d
            goto L_0x01cd
        L_0x007d:
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r2 = r4.f12502f
            r2.mo25547d()
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r2 = r4.f12502f
            boolean r2 = r2.mo25544b()
            if (r2 != 0) goto L_0x008c
            goto L_0x01cd
        L_0x008c:
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r2 = r4.f12502f
            int r2 = r2.mo25547d()
            boolean r6 = r4.f12499c
            r7 = 1
            if (r6 != 0) goto L_0x00a1
            r4.f12507k = r3
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b$a r1 = r4.f12510n
            r1.f12519e = r2
            r1.f12516b = r7
            goto L_0x01cd
        L_0x00a1:
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r6 = r4.f12502f
            boolean r6 = r6.mo25544b()
            if (r6 != 0) goto L_0x00ab
            goto L_0x01cd
        L_0x00ab:
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r6 = r4.f12502f
            int r6 = r6.mo25547d()
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.util.i$a> r9 = r4.f12501e
            int r9 = r9.indexOfKey(r6)
            if (r9 >= 0) goto L_0x00bd
            r4.f12507k = r3
            goto L_0x01cd
        L_0x00bd:
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.util.i$a> r9 = r4.f12501e
            java.lang.Object r9 = r9.get(r6)
            com.fyber.inneractive.sdk.player.exoplayer2.util.i$a r9 = (com.fyber.inneractive.sdk.player.exoplayer2.util.C4974i.C4975a) r9
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.util.i$b> r10 = r4.f12500d
            int r11 = r9.f13227b
            java.lang.Object r10 = r10.get(r11)
            com.fyber.inneractive.sdk.player.exoplayer2.util.i$b r10 = (com.fyber.inneractive.sdk.player.exoplayer2.util.C4974i.C4976b) r10
            boolean r11 = r10.f13233e
            if (r11 == 0) goto L_0x00e2
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r11 = r4.f12502f
            boolean r11 = r11.mo25542a(r8)
            if (r11 != 0) goto L_0x00dd
            goto L_0x01cd
        L_0x00dd:
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r11 = r4.f12502f
            r11.mo25548d(r8)
        L_0x00e2:
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r8 = r4.f12502f
            int r11 = r10.f13235g
            boolean r8 = r8.mo25542a(r11)
            if (r8 != 0) goto L_0x00ee
            goto L_0x01cd
        L_0x00ee:
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r8 = r4.f12502f
            int r11 = r10.f13235g
            int r8 = r8.mo25543b(r11)
            boolean r11 = r10.f13234f
            if (r11 != 0) goto L_0x0120
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r11 = r4.f12502f
            boolean r11 = r11.mo25542a(r7)
            if (r11 != 0) goto L_0x0104
            goto L_0x01cd
        L_0x0104:
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r11 = r4.f12502f
            boolean r11 = r11.mo25545c()
            if (r11 == 0) goto L_0x011e
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r12 = r4.f12502f
            boolean r12 = r12.mo25542a(r7)
            if (r12 != 0) goto L_0x0116
            goto L_0x01cd
        L_0x0116:
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r12 = r4.f12502f
            boolean r12 = r12.mo25545c()
            r13 = r7
            goto L_0x0123
        L_0x011e:
            r12 = r3
            goto L_0x0122
        L_0x0120:
            r11 = r3
            r12 = r11
        L_0x0122:
            r13 = r12
        L_0x0123:
            int r14 = r4.f12505i
            if (r14 != r5) goto L_0x0129
            r5 = r7
            goto L_0x012a
        L_0x0129:
            r5 = r3
        L_0x012a:
            if (r5 == 0) goto L_0x013d
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r14 = r4.f12502f
            boolean r14 = r14.mo25544b()
            if (r14 != 0) goto L_0x0136
            goto L_0x01cd
        L_0x0136:
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r14 = r4.f12502f
            int r14 = r14.mo25547d()
            goto L_0x013e
        L_0x013d:
            r14 = r3
        L_0x013e:
            int r15 = r10.f13236h
            if (r15 != 0) goto L_0x0170
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r15 = r4.f12502f
            int r3 = r10.f13237i
            boolean r3 = r15.mo25542a(r3)
            if (r3 != 0) goto L_0x014e
            goto L_0x01cd
        L_0x014e:
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r3 = r4.f12502f
            int r15 = r10.f13237i
            int r3 = r3.mo25543b(r15)
            boolean r9 = r9.f13228c
            if (r9 == 0) goto L_0x01a4
            if (r11 != 0) goto L_0x01a4
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r9 = r4.f12502f
            boolean r9 = r9.mo25544b()
            if (r9 != 0) goto L_0x0166
            goto L_0x01cd
        L_0x0166:
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r9 = r4.f12502f
            int r9 = r9.mo25549e()
            r15 = r9
            r7 = 0
            r9 = 0
            goto L_0x01a7
        L_0x0170:
            if (r15 != r7) goto L_0x01a3
            boolean r3 = r10.f13238j
            if (r3 != 0) goto L_0x01a3
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r3 = r4.f12502f
            boolean r3 = r3.mo25544b()
            if (r3 != 0) goto L_0x017f
            goto L_0x01cd
        L_0x017f:
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r3 = r4.f12502f
            int r3 = r3.mo25549e()
            boolean r9 = r9.f13228c
            if (r9 == 0) goto L_0x019f
            if (r11 != 0) goto L_0x019f
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r9 = r4.f12502f
            boolean r9 = r9.mo25544b()
            if (r9 != 0) goto L_0x0194
            goto L_0x01cd
        L_0x0194:
            com.fyber.inneractive.sdk.player.exoplayer2.util.l r9 = r4.f12502f
            int r9 = r9.mo25549e()
            r7 = r9
            r15 = 0
            r9 = r3
            r3 = 0
            goto L_0x01a7
        L_0x019f:
            r9 = r3
            r3 = 0
            r7 = 0
            goto L_0x01a6
        L_0x01a3:
            r3 = 0
        L_0x01a4:
            r7 = 0
            r9 = 0
        L_0x01a6:
            r15 = 0
        L_0x01a7:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j$b$a r0 = r4.f12510n
            r0.f12517c = r10
            r0.f12518d = r1
            r0.f12519e = r2
            r0.f12520f = r8
            r0.f12521g = r6
            r0.f12522h = r11
            r0.f12523i = r13
            r0.f12524j = r12
            r0.f12525k = r5
            r0.f12526l = r14
            r0.f12527m = r3
            r0.f12528n = r15
            r0.f12529o = r9
            r0.f12530p = r7
            r1 = 1
            r0.f12515a = r1
            r0.f12516b = r1
            r0 = 0
            r4.f12507k = r0
        L_0x01cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.p189ts.C4776j.mo25231a(byte[], int, int):void");
    }
}
