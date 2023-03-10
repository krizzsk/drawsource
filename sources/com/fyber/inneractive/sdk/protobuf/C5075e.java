package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C5194z;
import com.google.common.base.Ascii;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.protobuf.e */
public final class C5075e {

    /* renamed from: com.fyber.inneractive.sdk.protobuf.e$a */
    public static final class C5076a {

        /* renamed from: a */
        public int f13541a;

        /* renamed from: b */
        public long f13542b;

        /* renamed from: c */
        public Object f13543c;

        /* renamed from: d */
        public final C5147q f13544d;

        public C5076a(C5147q qVar) {
            qVar.getClass();
            this.f13544d = qVar;
        }
    }

    /* renamed from: a */
    public static int m15297a(int i, byte[] bArr, int i2, C5076a aVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            aVar.f13541a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            aVar.f13541a = i5 | (b2 << Ascii.f18306SO);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << Ascii.f18306SO);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            aVar.f13541a = i7 | (b3 << Ascii.NAK);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << Ascii.NAK);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            aVar.f13541a = i9 | (b4 << Ascii.f18299FS);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << Ascii.f18299FS);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                aVar.f13541a = i11;
                return i12;
            }
        }
    }

    /* renamed from: b */
    public static long m15306b(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* renamed from: c */
    public static int m15307c(byte[] bArr, int i, C5076a aVar) throws C5061a0 {
        int d = m15309d(bArr, i, aVar);
        int i2 = aVar.f13541a;
        if (i2 < 0) {
            throw C5061a0.m15276f();
        } else if (i2 == 0) {
            aVar.f13543c = "";
            return d;
        } else {
            aVar.f13543c = C5161s1.f13672a.mo26170a(bArr, d, i2);
            return d + i2;
        }
    }

    /* renamed from: d */
    public static int m15309d(byte[] bArr, int i, C5076a aVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m15297a((int) b, bArr, i2, aVar);
        }
        aVar.f13541a = b;
        return i2;
    }

    /* renamed from: e */
    public static int m15311e(byte[] bArr, int i, C5076a aVar) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            aVar.f13542b = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & Byte.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & Byte.MAX_VALUE)) << i4;
            int i6 = i5;
            b = b2;
            i3 = i6;
        }
        aVar.f13542b = j2;
        return i3;
    }

    /* renamed from: f */
    public static int m15313f(byte[] bArr, int i, C5194z.C5205j<?> jVar, C5076a aVar) throws IOException {
        C5192y yVar = (C5192y) jVar;
        int d = m15309d(bArr, i, aVar);
        int i2 = aVar.f13541a + d;
        while (d < i2) {
            d = m15309d(bArr, d, aVar);
            yVar.mo26230c(C5114j.m15569b(aVar.f13541a));
        }
        if (d == i2) {
            return d;
        }
        throw C5061a0.m15279i();
    }

    /* renamed from: g */
    public static int m15314g(byte[] bArr, int i, C5194z.C5205j<?> jVar, C5076a aVar) throws IOException {
        C5091h0 h0Var = (C5091h0) jVar;
        int d = m15309d(bArr, i, aVar);
        int i2 = aVar.f13541a + d;
        while (d < i2) {
            d = m15311e(bArr, d, aVar);
            h0Var.mo25893a(C5114j.m15565a(aVar.f13542b));
        }
        if (d == i2) {
            return d;
        }
        throw C5061a0.m15279i();
    }

    /* renamed from: h */
    public static int m15315h(byte[] bArr, int i, C5194z.C5205j<?> jVar, C5076a aVar) throws IOException {
        C5192y yVar = (C5192y) jVar;
        int d = m15309d(bArr, i, aVar);
        int i2 = aVar.f13541a + d;
        while (d < i2) {
            d = m15309d(bArr, d, aVar);
            yVar.mo26230c(aVar.f13541a);
        }
        if (d == i2) {
            return d;
        }
        throw C5061a0.m15279i();
    }

    /* renamed from: i */
    public static int m15316i(byte[] bArr, int i, C5194z.C5205j<?> jVar, C5076a aVar) throws IOException {
        C5091h0 h0Var = (C5091h0) jVar;
        int d = m15309d(bArr, i, aVar);
        int i2 = aVar.f13541a + d;
        while (d < i2) {
            d = m15311e(bArr, d, aVar);
            h0Var.mo25893a(aVar.f13542b);
        }
        if (d == i2) {
            return d;
        }
        throw C5061a0.m15279i();
    }

    /* renamed from: b */
    public static int m15304b(byte[] bArr, int i, C5076a aVar) throws C5061a0 {
        int d = m15309d(bArr, i, aVar);
        int i2 = aVar.f13541a;
        if (i2 < 0) {
            throw C5061a0.m15276f();
        } else if (i2 == 0) {
            aVar.f13543c = "";
            return d;
        } else {
            aVar.f13543c = new String(bArr, d, i2, C5194z.f13762a);
            return d + i2;
        }
    }

    /* renamed from: d */
    public static int m15310d(byte[] bArr, int i, C5194z.C5205j<?> jVar, C5076a aVar) throws IOException {
        C5091h0 h0Var = (C5091h0) jVar;
        int d = m15309d(bArr, i, aVar);
        int i2 = aVar.f13541a + d;
        while (d < i2) {
            h0Var.mo25893a(m15306b(bArr, d));
            d += 8;
        }
        if (d == i2) {
            return d;
        }
        throw C5061a0.m15279i();
    }

    /* renamed from: c */
    public static int m15308c(byte[] bArr, int i, C5194z.C5205j<?> jVar, C5076a aVar) throws IOException {
        C5192y yVar = (C5192y) jVar;
        int d = m15309d(bArr, i, aVar);
        int i2 = aVar.f13541a + d;
        while (d < i2) {
            yVar.mo26230c(m15301a(bArr, d));
            d += 4;
        }
        if (d == i2) {
            return d;
        }
        throw C5061a0.m15279i();
    }

    /* renamed from: b */
    public static int m15305b(byte[] bArr, int i, C5194z.C5205j<?> jVar, C5076a aVar) throws IOException {
        C5136n nVar = (C5136n) jVar;
        int d = m15309d(bArr, i, aVar);
        int i2 = aVar.f13541a + d;
        while (d < i2) {
            nVar.mo26108a(Double.longBitsToDouble(m15306b(bArr, d)));
            d += 8;
        }
        if (d == i2) {
            return d;
        }
        throw C5061a0.m15279i();
    }

    /* renamed from: e */
    public static int m15312e(byte[] bArr, int i, C5194z.C5205j<?> jVar, C5076a aVar) throws IOException {
        C5188w wVar = (C5188w) jVar;
        int d = m15309d(bArr, i, aVar);
        int i2 = aVar.f13541a + d;
        while (d < i2) {
            wVar.mo26218a(Float.intBitsToFloat(m15301a(bArr, d)));
            d += 4;
        }
        if (d == i2) {
            return d;
        }
        throw C5061a0.m15279i();
    }

    /* renamed from: a */
    public static int m15301a(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << Ascii.CAN) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << Ascii.DLE);
    }

    /* renamed from: a */
    public static int m15302a(byte[] bArr, int i, C5076a aVar) throws C5061a0 {
        int d = m15309d(bArr, i, aVar);
        int i2 = aVar.f13541a;
        if (i2 < 0) {
            throw C5061a0.m15276f();
        } else if (i2 > bArr.length - d) {
            throw C5061a0.m15279i();
        } else if (i2 == 0) {
            aVar.f13543c = C5093i.f13565b;
            return d;
        } else {
            aVar.f13543c = C5093i.m15515a(bArr, d, i2);
            return d + i2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m15300a(com.fyber.inneractive.sdk.protobuf.C5083f1 r6, byte[] r7, int r8, int r9, com.fyber.inneractive.sdk.protobuf.C5075e.C5076a r10) throws java.io.IOException {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = m15297a((int) r8, (byte[]) r7, (int) r0, (com.fyber.inneractive.sdk.protobuf.C5075e.C5076a) r10)
            int r8 = r10.f13541a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.mo25868a()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.mo25872a(r1, r2, r3, r4, r5)
            r6.mo25876c(r9)
            r10.f13543c = r9
            return r8
        L_0x0025:
            com.fyber.inneractive.sdk.protobuf.a0 r6 = com.fyber.inneractive.sdk.protobuf.C5061a0.m15279i()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C5075e.m15300a(com.fyber.inneractive.sdk.protobuf.f1, byte[], int, int, com.fyber.inneractive.sdk.protobuf.e$a):int");
    }

    /* renamed from: a */
    public static int m15299a(C5083f1 f1Var, byte[] bArr, int i, int i2, int i3, C5076a aVar) throws IOException {
        C5168t0 t0Var = (C5168t0) f1Var;
        Object a = t0Var.mo25868a();
        int a2 = t0Var.mo26176a(a, bArr, i, i2, i3, aVar);
        t0Var.mo25876c(a);
        aVar.f13543c = a;
        return a2;
    }

    /* renamed from: a */
    public static int m15296a(int i, byte[] bArr, int i2, int i3, C5194z.C5205j<?> jVar, C5076a aVar) {
        C5192y yVar = (C5192y) jVar;
        int d = m15309d(bArr, i2, aVar);
        yVar.mo26230c(aVar.f13541a);
        while (d < i3) {
            int d2 = m15309d(bArr, d, aVar);
            if (i != aVar.f13541a) {
                break;
            }
            d = m15309d(bArr, d2, aVar);
            yVar.mo26230c(aVar.f13541a);
        }
        return d;
    }

    /* renamed from: a */
    public static int m15303a(byte[] bArr, int i, C5194z.C5205j<?> jVar, C5076a aVar) throws IOException {
        C5084g gVar = (C5084g) jVar;
        int d = m15309d(bArr, i, aVar);
        int i2 = aVar.f13541a + d;
        while (d < i2) {
            d = m15311e(bArr, d, aVar);
            gVar.mo25878a(aVar.f13542b != 0);
        }
        if (d == i2) {
            return d;
        }
        throw C5061a0.m15279i();
    }

    /* renamed from: a */
    public static int m15298a(C5083f1<?> f1Var, int i, byte[] bArr, int i2, int i3, C5194z.C5205j<?> jVar, C5076a aVar) throws IOException {
        int a = m15300a((C5083f1) f1Var, bArr, i2, i3, aVar);
        jVar.add(aVar.f13543c);
        while (a < i3) {
            int d = m15309d(bArr, a, aVar);
            if (i != aVar.f13541a) {
                break;
            }
            a = m15300a((C5083f1) f1Var, bArr, d, i3, aVar);
            jVar.add(aVar.f13543c);
        }
        return a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01f2, code lost:
        r0 = r2 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0201, code lost:
        r0 = r2 + 8;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m15293a(int r13, byte[] r14, int r15, int r16, com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite.ExtendableMessage<?, ?> r17, com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite.C5053d<?, ?> r18, com.fyber.inneractive.sdk.protobuf.C5135m1<com.fyber.inneractive.sdk.protobuf.C5138n1, com.fyber.inneractive.sdk.protobuf.C5138n1> r19, com.fyber.inneractive.sdk.protobuf.C5075e.C5076a r20) throws java.io.IOException {
        /*
            r1 = r14
            r2 = r15
            r0 = r17
            r6 = r18
            r3 = r19
            r7 = r20
            com.fyber.inneractive.sdk.protobuf.u<com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c> r8 = r0.extensions
            int r4 = r13 >>> 3
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r5 = r6.f13498d
            boolean r9 = r5.f13493d
            r10 = 0
            r11 = 0
            r12 = 10
            if (r9 == 0) goto L_0x00fe
            boolean r9 = r5.f13494e
            if (r9 == 0) goto L_0x00fe
            com.fyber.inneractive.sdk.protobuf.t1$b r5 = r5.f13492c
            int r5 = r5.ordinal()
            switch(r5) {
                case 0: goto L_0x00df;
                case 1: goto L_0x00cd;
                case 2: goto L_0x00bd;
                case 3: goto L_0x00bd;
                case 4: goto L_0x00ad;
                case 5: goto L_0x009d;
                case 6: goto L_0x008d;
                case 7: goto L_0x007b;
                case 8: goto L_0x0025;
                case 9: goto L_0x0025;
                case 10: goto L_0x0025;
                case 11: goto L_0x0025;
                case 12: goto L_0x00ad;
                case 13: goto L_0x0055;
                case 14: goto L_0x008d;
                case 15: goto L_0x009d;
                case 16: goto L_0x0045;
                case 17: goto L_0x0035;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Type cannot be packed: "
            r1.append(r2)
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r2 = r6.f13498d
            goto L_0x00f1
        L_0x0035:
            com.fyber.inneractive.sdk.protobuf.h0 r0 = new com.fyber.inneractive.sdk.protobuf.h0
            r0.<init>()
            int r1 = m15314g(r14, r15, r0, r7)
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r2 = r6.f13498d
            r8.mo26206c(r2, r0)
            goto L_0x022c
        L_0x0045:
            com.fyber.inneractive.sdk.protobuf.y r0 = new com.fyber.inneractive.sdk.protobuf.y
            r0.<init>()
            int r1 = m15313f(r14, r15, r0, r7)
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r2 = r6.f13498d
            r8.mo26206c(r2, r0)
            goto L_0x022c
        L_0x0055:
            com.fyber.inneractive.sdk.protobuf.y r5 = new com.fyber.inneractive.sdk.protobuf.y
            r5.<init>()
            int r1 = m15315h(r14, r15, r5, r7)
            com.fyber.inneractive.sdk.protobuf.n1 r2 = r0.unknownFields
            com.fyber.inneractive.sdk.protobuf.n1 r7 = com.fyber.inneractive.sdk.protobuf.C5138n1.f13646f
            if (r2 != r7) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r10 = r2
        L_0x0066:
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r2 = r6.f13498d
            com.fyber.inneractive.sdk.protobuf.z$d<?> r2 = r2.f13490a
            java.lang.Object r2 = com.fyber.inneractive.sdk.protobuf.C5092h1.m15473a((int) r4, (java.util.List<java.lang.Integer>) r5, (com.fyber.inneractive.sdk.protobuf.C5194z.C5198d<?>) r2, r10, r3)
            com.fyber.inneractive.sdk.protobuf.n1 r2 = (com.fyber.inneractive.sdk.protobuf.C5138n1) r2
            if (r2 == 0) goto L_0x0074
            r0.unknownFields = r2
        L_0x0074:
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r0 = r6.f13498d
            r8.mo26206c(r0, r5)
            goto L_0x022c
        L_0x007b:
            com.fyber.inneractive.sdk.protobuf.g r0 = new com.fyber.inneractive.sdk.protobuf.g
            boolean[] r3 = new boolean[r12]
            r0.<init>(r3, r11)
            int r1 = m15303a((byte[]) r14, (int) r15, (com.fyber.inneractive.sdk.protobuf.C5194z.C5205j<?>) r0, (com.fyber.inneractive.sdk.protobuf.C5075e.C5076a) r7)
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r2 = r6.f13498d
            r8.mo26206c(r2, r0)
            goto L_0x022c
        L_0x008d:
            com.fyber.inneractive.sdk.protobuf.y r0 = new com.fyber.inneractive.sdk.protobuf.y
            r0.<init>()
            int r1 = m15308c(r14, r15, r0, r7)
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r2 = r6.f13498d
            r8.mo26206c(r2, r0)
            goto L_0x022c
        L_0x009d:
            com.fyber.inneractive.sdk.protobuf.h0 r0 = new com.fyber.inneractive.sdk.protobuf.h0
            r0.<init>()
            int r1 = m15310d(r14, r15, r0, r7)
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r2 = r6.f13498d
            r8.mo26206c(r2, r0)
            goto L_0x022c
        L_0x00ad:
            com.fyber.inneractive.sdk.protobuf.y r0 = new com.fyber.inneractive.sdk.protobuf.y
            r0.<init>()
            int r1 = m15315h(r14, r15, r0, r7)
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r2 = r6.f13498d
            r8.mo26206c(r2, r0)
            goto L_0x022c
        L_0x00bd:
            com.fyber.inneractive.sdk.protobuf.h0 r0 = new com.fyber.inneractive.sdk.protobuf.h0
            r0.<init>()
            int r1 = m15316i(r14, r15, r0, r7)
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r2 = r6.f13498d
            r8.mo26206c(r2, r0)
            goto L_0x022c
        L_0x00cd:
            com.fyber.inneractive.sdk.protobuf.w r0 = new com.fyber.inneractive.sdk.protobuf.w
            float[] r3 = new float[r12]
            r0.<init>(r3, r11)
            int r1 = m15312e(r14, r15, r0, r7)
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r2 = r6.f13498d
            r8.mo26206c(r2, r0)
            goto L_0x022c
        L_0x00df:
            com.fyber.inneractive.sdk.protobuf.n r0 = new com.fyber.inneractive.sdk.protobuf.n
            double[] r3 = new double[r12]
            r0.<init>(r3, r11)
            int r1 = m15305b(r14, r15, r0, r7)
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r2 = r6.f13498d
            r8.mo26206c(r2, r0)
            goto L_0x022c
        L_0x00f1:
            com.fyber.inneractive.sdk.protobuf.t1$b r2 = r2.f13492c
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00fe:
            com.fyber.inneractive.sdk.protobuf.t1$b r5 = r5.f13492c
            com.fyber.inneractive.sdk.protobuf.t1$b r9 = com.fyber.inneractive.sdk.protobuf.C5169t1.C5171b.ENUM
            if (r5 != r9) goto L_0x0138
            int r1 = m15309d(r14, r15, r7)
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r2 = r6.f13498d
            com.fyber.inneractive.sdk.protobuf.z$d<?> r2 = r2.f13490a
            int r5 = r7.f13541a
            com.fyber.inneractive.sdk.protobuf.z$c r2 = r2.mo26241a(r5)
            if (r2 != 0) goto L_0x012f
            com.fyber.inneractive.sdk.protobuf.n1 r2 = r0.unknownFields
            com.fyber.inneractive.sdk.protobuf.n1 r5 = com.fyber.inneractive.sdk.protobuf.C5138n1.f13646f
            if (r2 != r5) goto L_0x0120
            com.fyber.inneractive.sdk.protobuf.n1 r2 = com.fyber.inneractive.sdk.protobuf.C5138n1.m15916c()
            r0.unknownFields = r2
        L_0x0120:
            int r0 = r7.f13541a
            java.lang.Class<?> r5 = com.fyber.inneractive.sdk.protobuf.C5092h1.f13561a
            if (r2 != 0) goto L_0x012a
            java.lang.Object r2 = r19.mo26089a()
        L_0x012a:
            long r5 = (long) r0
            r3.mo26100b(r2, r4, r5)
            return r1
        L_0x012f:
            int r0 = r7.f13541a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r0 = r1
            goto L_0x0203
        L_0x0138:
            int r0 = r5.ordinal()
            switch(r0) {
                case 0: goto L_0x01f5;
                case 1: goto L_0x01e6;
                case 2: goto L_0x01db;
                case 3: goto L_0x01db;
                case 4: goto L_0x01d0;
                case 5: goto L_0x01c7;
                case 6: goto L_0x01be;
                case 7: goto L_0x01ac;
                case 8: goto L_0x01a5;
                case 9: goto L_0x0188;
                case 10: goto L_0x0172;
                case 11: goto L_0x016a;
                case 12: goto L_0x01d0;
                case 13: goto L_0x0162;
                case 14: goto L_0x01be;
                case 15: goto L_0x01c7;
                case 16: goto L_0x0152;
                case 17: goto L_0x0142;
                default: goto L_0x013f;
            }
        L_0x013f:
            r0 = r2
            goto L_0x0203
        L_0x0142:
            int r0 = m15311e(r14, r15, r7)
            long r1 = r7.f13542b
            long r1 = com.fyber.inneractive.sdk.protobuf.C5114j.m15565a((long) r1)
            java.lang.Long r10 = java.lang.Long.valueOf(r1)
            goto L_0x0203
        L_0x0152:
            int r0 = m15309d(r14, r15, r7)
            int r1 = r7.f13541a
            int r1 = com.fyber.inneractive.sdk.protobuf.C5114j.m15569b(r1)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            goto L_0x0203
        L_0x0162:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Shouldn't reach here."
            r0.<init>(r1)
            throw r0
        L_0x016a:
            int r0 = m15302a(r14, r15, r7)
            java.lang.Object r10 = r7.f13543c
            goto L_0x0203
        L_0x0172:
            com.fyber.inneractive.sdk.protobuf.b1 r0 = com.fyber.inneractive.sdk.protobuf.C5066b1.f13524c
            com.fyber.inneractive.sdk.protobuf.q0 r3 = r6.f13497c
            java.lang.Class r3 = r3.getClass()
            com.fyber.inneractive.sdk.protobuf.f1 r0 = r0.mo25762a(r3)
            r3 = r16
            int r0 = m15300a((com.fyber.inneractive.sdk.protobuf.C5083f1) r0, (byte[]) r14, (int) r15, (int) r3, (com.fyber.inneractive.sdk.protobuf.C5075e.C5076a) r7)
            java.lang.Object r10 = r7.f13543c
            goto L_0x0203
        L_0x0188:
            r3 = r16
            int r0 = r4 << 3
            r4 = r0 | 4
            com.fyber.inneractive.sdk.protobuf.b1 r0 = com.fyber.inneractive.sdk.protobuf.C5066b1.f13524c
            com.fyber.inneractive.sdk.protobuf.q0 r5 = r6.f13497c
            java.lang.Class r5 = r5.getClass()
            com.fyber.inneractive.sdk.protobuf.f1 r0 = r0.mo25762a(r5)
            r1 = r14
            r2 = r15
            r5 = r20
            int r0 = m15299a((com.fyber.inneractive.sdk.protobuf.C5083f1) r0, (byte[]) r1, (int) r2, (int) r3, (int) r4, (com.fyber.inneractive.sdk.protobuf.C5075e.C5076a) r5)
            java.lang.Object r10 = r7.f13543c
            goto L_0x0203
        L_0x01a5:
            int r0 = m15304b(r14, r15, r7)
            java.lang.Object r10 = r7.f13543c
            goto L_0x0203
        L_0x01ac:
            int r0 = m15311e(r14, r15, r7)
            long r1 = r7.f13542b
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x01b9
            r11 = 1
        L_0x01b9:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r11)
            goto L_0x0203
        L_0x01be:
            int r0 = m15301a(r14, r15)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            goto L_0x01f2
        L_0x01c7:
            long r0 = m15306b(r14, r15)
            java.lang.Long r10 = java.lang.Long.valueOf(r0)
            goto L_0x0201
        L_0x01d0:
            int r0 = m15309d(r14, r15, r7)
            int r1 = r7.f13541a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            goto L_0x0203
        L_0x01db:
            int r0 = m15311e(r14, r15, r7)
            long r1 = r7.f13542b
            java.lang.Long r10 = java.lang.Long.valueOf(r1)
            goto L_0x0203
        L_0x01e6:
            int r0 = m15301a(r14, r15)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.Float r10 = java.lang.Float.valueOf(r0)
        L_0x01f2:
            int r0 = r2 + 4
            goto L_0x0203
        L_0x01f5:
            long r0 = m15306b(r14, r15)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            java.lang.Double r10 = java.lang.Double.valueOf(r0)
        L_0x0201:
            int r0 = r2 + 8
        L_0x0203:
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r1 = r6.f13498d
            boolean r2 = r1.f13493d
            if (r2 == 0) goto L_0x020d
            r8.mo26203a(r1, (java.lang.Object) r10)
            goto L_0x022b
        L_0x020d:
            com.fyber.inneractive.sdk.protobuf.t1$b r1 = r1.f13492c
            int r1 = r1.ordinal()
            r2 = 9
            if (r1 == r2) goto L_0x021a
            if (r1 == r12) goto L_0x021a
            goto L_0x0226
        L_0x021a:
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r1 = r6.f13498d
            java.lang.Object r1 = r8.mo26202a(r1)
            if (r1 == 0) goto L_0x0226
            java.lang.Object r10 = com.fyber.inneractive.sdk.protobuf.C5194z.m16181a((java.lang.Object) r1, (java.lang.Object) r10)
        L_0x0226:
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r1 = r6.f13498d
            r8.mo26206c(r1, r10)
        L_0x022b:
            r1 = r0
        L_0x022c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C5075e.m15293a(int, byte[], int, int, com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$ExtendableMessage, com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$d, com.fyber.inneractive.sdk.protobuf.m1, com.fyber.inneractive.sdk.protobuf.e$a):int");
    }

    /* renamed from: a */
    public static int m15295a(int i, byte[] bArr, int i2, int i3, C5138n1 n1Var, C5076a aVar) throws C5061a0 {
        int i4 = C5169t1.f13694a;
        if ((i >>> 3) != 0) {
            int i5 = i & 7;
            if (i5 == 0) {
                int e = m15311e(bArr, i2, aVar);
                n1Var.mo26120a(i, (Object) Long.valueOf(aVar.f13542b));
                return e;
            } else if (i5 == 1) {
                n1Var.mo26120a(i, (Object) Long.valueOf(m15306b(bArr, i2)));
                return i2 + 8;
            } else if (i5 == 2) {
                int d = m15309d(bArr, i2, aVar);
                int i6 = aVar.f13541a;
                if (i6 < 0) {
                    throw C5061a0.m15276f();
                } else if (i6 <= bArr.length - d) {
                    if (i6 == 0) {
                        n1Var.mo26120a(i, (Object) C5093i.f13565b);
                    } else {
                        n1Var.mo26120a(i, (Object) C5093i.m15515a(bArr, d, i6));
                    }
                    return d + i6;
                } else {
                    throw C5061a0.m15279i();
                }
            } else if (i5 == 3) {
                C5138n1 c = C5138n1.m15916c();
                int i7 = (i & -8) | 4;
                int i8 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int d2 = m15309d(bArr, i2, aVar);
                    int i9 = aVar.f13541a;
                    if (i9 == i7) {
                        i8 = i9;
                        i2 = d2;
                        break;
                    }
                    i8 = i9;
                    i2 = m15295a(i9, bArr, d2, i3, c, aVar);
                }
                if (i2 > i3 || i8 != i7) {
                    throw C5061a0.m15277g();
                }
                n1Var.mo26120a(i, (Object) c);
                return i2;
            } else if (i5 == 5) {
                n1Var.mo26120a(i, (Object) Integer.valueOf(m15301a(bArr, i2)));
                return i2 + 4;
            } else {
                throw C5061a0.m15272b();
            }
        } else {
            throw C5061a0.m15272b();
        }
    }

    /* renamed from: a */
    public static int m15294a(int i, byte[] bArr, int i2, int i3, C5076a aVar) throws C5061a0 {
        int i4 = C5169t1.f13694a;
        if ((i >>> 3) != 0) {
            int i5 = i & 7;
            if (i5 == 0) {
                return m15311e(bArr, i2, aVar);
            }
            if (i5 == 1) {
                return i2 + 8;
            }
            if (i5 == 2) {
                return m15309d(bArr, i2, aVar) + aVar.f13541a;
            }
            if (i5 == 3) {
                int i6 = (i & -8) | 4;
                int i7 = 0;
                while (i2 < i3) {
                    i2 = m15309d(bArr, i2, aVar);
                    i7 = aVar.f13541a;
                    if (i7 == i6) {
                        break;
                    }
                    i2 = m15294a(i7, bArr, i2, i3, aVar);
                }
                if (i2 <= i3 && i7 == i6) {
                    return i2;
                }
                throw C5061a0.m15277g();
            } else if (i5 == 5) {
                return i2 + 4;
            } else {
                throw C5061a0.m15272b();
            }
        } else {
            throw C5061a0.m15272b();
        }
    }
}
