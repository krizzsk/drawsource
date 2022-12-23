package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.util.Log;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.i */
public final class C4974i {

    /* renamed from: a */
    public static final byte[] f13222a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final float[] f13223b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c */
    public static final Object f13224c = new Object();

    /* renamed from: d */
    public static int[] f13225d = new int[10];

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.i$a */
    public static final class C4975a {

        /* renamed from: a */
        public final int f13226a;

        /* renamed from: b */
        public final int f13227b;

        /* renamed from: c */
        public final boolean f13228c;

        public C4975a(int i, int i2, boolean z) {
            this.f13226a = i;
            this.f13227b = i2;
            this.f13228c = z;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.i$b */
    public static final class C4976b {

        /* renamed from: a */
        public final int f13229a;

        /* renamed from: b */
        public final int f13230b;

        /* renamed from: c */
        public final int f13231c;

        /* renamed from: d */
        public final float f13232d;

        /* renamed from: e */
        public final boolean f13233e;

        /* renamed from: f */
        public final boolean f13234f;

        /* renamed from: g */
        public final int f13235g;

        /* renamed from: h */
        public final int f13236h;

        /* renamed from: i */
        public final int f13237i;

        /* renamed from: j */
        public final boolean f13238j;

        public C4976b(int i, int i2, int i3, float f, boolean z, boolean z2, int i4, int i5, int i6, boolean z3) {
            this.f13229a = i;
            this.f13230b = i2;
            this.f13231c = i3;
            this.f13232d = f;
            this.f13233e = z;
            this.f13234f = z2;
            this.f13235g = i4;
            this.f13236h = i5;
            this.f13237i = i6;
            this.f13238j = z3;
        }
    }

    /* renamed from: a */
    public static int m15067a(byte[] bArr, int i) {
        int i2;
        synchronized (f13224c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    }
                    try {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = f13225d;
                    if (iArr.length <= i4) {
                        f13225d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f13225d[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = f13225d[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i10 + 1;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }

    /* renamed from: b */
    public static C4976b m15071b(byte[] bArr, int i, int i2) {
        boolean z;
        int i3;
        int i4;
        boolean z2;
        int i5;
        float f;
        C4979l lVar = new C4979l(bArr, i, i2);
        lVar.mo25548d(8);
        int b = lVar.mo25543b(8);
        lVar.mo25548d(16);
        int d = lVar.mo25547d();
        int i6 = 1;
        if (b == 100 || b == 110 || b == 122 || b == 244 || b == 44 || b == 83 || b == 86 || b == 118 || b == 128 || b == 138) {
            i3 = lVar.mo25547d();
            boolean c = i3 == 3 ? lVar.mo25545c() : false;
            lVar.mo25547d();
            lVar.mo25547d();
            lVar.mo25550f();
            if (lVar.mo25545c()) {
                int i7 = i3 != 3 ? 8 : 12;
                int i8 = 0;
                while (i8 < i7) {
                    if (lVar.mo25545c()) {
                        int i9 = i8 < 6 ? 16 : 64;
                        int i10 = 8;
                        int i11 = 8;
                        for (int i12 = 0; i12 < i9; i12++) {
                            if (i10 != 0) {
                                i10 = ((lVar.mo25549e() + i11) + 256) % 256;
                            }
                            if (i10 != 0) {
                                i11 = i10;
                            }
                        }
                    }
                    i8++;
                }
            }
            z = c;
        } else {
            z = false;
            i3 = 1;
        }
        int d2 = lVar.mo25547d() + 4;
        int d3 = lVar.mo25547d();
        if (d3 == 0) {
            i4 = d;
            z2 = false;
            i5 = lVar.mo25547d() + 4;
        } else if (d3 == 1) {
            boolean c2 = lVar.mo25545c();
            lVar.mo25549e();
            lVar.mo25549e();
            long d4 = (long) lVar.mo25547d();
            i4 = d;
            for (int i13 = 0; ((long) i13) < d4; i13++) {
                lVar.mo25547d();
            }
            i5 = 0;
            z2 = c2;
        } else {
            i4 = d;
            i5 = 0;
            z2 = false;
        }
        lVar.mo25547d();
        lVar.mo25550f();
        int d5 = lVar.mo25547d() + 1;
        boolean c3 = lVar.mo25545c();
        int i14 = true - (c3 ? 1 : 0);
        int d6 = (lVar.mo25547d() + 1) * i14;
        if (!c3) {
            lVar.mo25550f();
        }
        lVar.mo25550f();
        int i15 = d5 * 16;
        int i16 = d6 * 16;
        if (lVar.mo25545c()) {
            int d7 = lVar.mo25547d();
            int d8 = lVar.mo25547d();
            int d9 = lVar.mo25547d();
            int d10 = lVar.mo25547d();
            if (i3 != 0) {
                int i17 = i3 == 3 ? 1 : 2;
                if (i3 == 1) {
                    i6 = 2;
                }
                i14 *= i6;
                i6 = i17;
            }
            i15 -= (d7 + d8) * i6;
            i16 -= (d9 + d10) * i14;
        }
        int i18 = i15;
        int i19 = i16;
        if (lVar.mo25545c() && lVar.mo25545c()) {
            int b2 = lVar.mo25543b(8);
            if (b2 == 255) {
                int b3 = lVar.mo25543b(16);
                int b4 = lVar.mo25543b(16);
                if (!(b3 == 0 || b4 == 0)) {
                    f = ((float) b3) / ((float) b4);
                    return new C4976b(i4, i18, i19, f, z, c3, d2, d3, i5, z2);
                }
            } else {
                float[] fArr = f13223b;
                if (b2 < fArr.length) {
                    f = fArr[b2];
                    return new C4976b(i4, i18, i19, f, z, c3, d2, d3, i5, z2);
                }
                Log.w("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + b2);
            }
        }
        f = 1.0f;
        return new C4976b(i4, i18, i19, f, z, c3, d2, d3, i5, z2);
    }

    /* renamed from: a */
    public static C4975a m15069a(byte[] bArr, int i, int i2) {
        C4979l lVar = new C4979l(bArr, i, i2);
        lVar.mo25548d(8);
        int d = lVar.mo25547d();
        int d2 = lVar.mo25547d();
        lVar.mo25550f();
        return new C4975a(d, d2, lVar.mo25545c());
    }

    /* JADX WARNING: Removed duplicated region for block: B:75:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00b8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m15068a(byte[] r7, int r8, int r9, boolean[] r10) {
        /*
            int r0 = r9 - r8
            r1 = 0
            r2 = 1
            if (r0 < 0) goto L_0x0008
            r3 = r2
            goto L_0x0009
        L_0x0008:
            r3 = r1
        L_0x0009:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a.m15051b(r3)
            if (r0 != 0) goto L_0x000f
            return r9
        L_0x000f:
            r3 = 2
            if (r10 == 0) goto L_0x0040
            boolean r4 = r10[r1]
            if (r4 == 0) goto L_0x001c
            m15070a(r10)
            int r8 = r8 + -3
            return r8
        L_0x001c:
            if (r0 <= r2) goto L_0x002b
            boolean r4 = r10[r2]
            if (r4 == 0) goto L_0x002b
            byte r4 = r7[r8]
            if (r4 != r2) goto L_0x002b
            m15070a(r10)
            int r8 = r8 - r3
            return r8
        L_0x002b:
            if (r0 <= r3) goto L_0x0040
            boolean r4 = r10[r3]
            if (r4 == 0) goto L_0x0040
            byte r4 = r7[r8]
            if (r4 != 0) goto L_0x0040
            int r4 = r8 + 1
            byte r4 = r7[r4]
            if (r4 != r2) goto L_0x0040
            m15070a(r10)
            int r8 = r8 - r2
            return r8
        L_0x0040:
            int r4 = r9 + -1
            int r8 = r8 + r3
        L_0x0043:
            if (r8 >= r4) goto L_0x0067
            byte r5 = r7[r8]
            r5 = r5 & 254(0xfe, float:3.56E-43)
            if (r5 == 0) goto L_0x004c
            goto L_0x0064
        L_0x004c:
            int r5 = r8 + -2
            byte r6 = r7[r5]
            if (r6 != 0) goto L_0x0062
            int r6 = r8 + -1
            byte r6 = r7[r6]
            if (r6 != 0) goto L_0x0062
            byte r6 = r7[r8]
            if (r6 != r2) goto L_0x0062
            if (r10 == 0) goto L_0x0061
            m15070a(r10)
        L_0x0061:
            return r5
        L_0x0062:
            int r8 = r8 + -2
        L_0x0064:
            int r8 = r8 + 3
            goto L_0x0043
        L_0x0067:
            if (r10 == 0) goto L_0x00bb
            if (r0 <= r3) goto L_0x007c
            int r8 = r9 + -3
            byte r8 = r7[r8]
            if (r8 != 0) goto L_0x0097
            int r8 = r9 + -2
            byte r8 = r7[r8]
            if (r8 != 0) goto L_0x0097
            byte r8 = r7[r4]
            if (r8 != r2) goto L_0x0097
            goto L_0x0095
        L_0x007c:
            if (r0 != r3) goto L_0x008d
            boolean r8 = r10[r3]
            if (r8 == 0) goto L_0x0097
            int r8 = r9 + -2
            byte r8 = r7[r8]
            if (r8 != 0) goto L_0x0097
            byte r8 = r7[r4]
            if (r8 != r2) goto L_0x0097
            goto L_0x0095
        L_0x008d:
            boolean r8 = r10[r2]
            if (r8 == 0) goto L_0x0097
            byte r8 = r7[r4]
            if (r8 != r2) goto L_0x0097
        L_0x0095:
            r8 = r2
            goto L_0x0098
        L_0x0097:
            r8 = r1
        L_0x0098:
            r10[r1] = r8
            if (r0 <= r2) goto L_0x00a7
            int r8 = r9 + -2
            byte r8 = r7[r8]
            if (r8 != 0) goto L_0x00b1
            byte r8 = r7[r4]
            if (r8 != 0) goto L_0x00b1
            goto L_0x00af
        L_0x00a7:
            boolean r8 = r10[r3]
            if (r8 == 0) goto L_0x00b1
            byte r8 = r7[r4]
            if (r8 != 0) goto L_0x00b1
        L_0x00af:
            r8 = r2
            goto L_0x00b2
        L_0x00b1:
            r8 = r1
        L_0x00b2:
            r10[r2] = r8
            byte r7 = r7[r4]
            if (r7 != 0) goto L_0x00b9
            r1 = r2
        L_0x00b9:
            r10[r3] = r1
        L_0x00bb:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.util.C4974i.m15068a(byte[], int, int, boolean[]):int");
    }

    /* renamed from: a */
    public static void m15070a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }
}
