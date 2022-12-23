package com.tapjoy.internal;

import java.util.Arrays;

/* renamed from: com.tapjoy.internal.jk */
final class C11656jk extends C11648je {

    /* renamed from: f */
    final transient byte[][] f28101f;

    /* renamed from: g */
    final transient int[] f28102g;

    C11656jk(C11645jb jbVar, int i) {
        super((byte[]) null);
        C11661jo.m31993a(jbVar.f28075b, 0, (long) i);
        C11654ji jiVar = jbVar.f28074a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            if (jiVar.f28094c != jiVar.f28093b) {
                i3 += jiVar.f28094c - jiVar.f28093b;
                i4++;
                jiVar = jiVar.f28097f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f28101f = new byte[i4][];
        this.f28102g = new int[(i4 * 2)];
        C11654ji jiVar2 = jbVar.f28074a;
        int i5 = 0;
        while (i2 < i) {
            this.f28101f[i5] = jiVar2.f28092a;
            i2 += jiVar2.f28094c - jiVar2.f28093b;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.f28102g;
            iArr[i5] = i2;
            iArr[this.f28101f.length + i5] = jiVar2.f28093b;
            jiVar2.f28095d = true;
            i5++;
            jiVar2 = jiVar2.f28097f;
        }
    }

    /* renamed from: a */
    public final String mo70278a() {
        return m31978e().mo70278a();
    }

    /* renamed from: b */
    public final String mo70281b() {
        return m31978e().mo70281b();
    }

    /* renamed from: a */
    public final C11648je mo70277a(int i, int i2) {
        return m31978e().mo70277a(i, i2);
    }

    /* renamed from: a */
    public final byte mo70276a(int i) {
        int i2;
        C11661jo.m31993a((long) this.f28102g[this.f28101f.length - 1], (long) i, 1);
        int b = m31977b(i);
        if (b == 0) {
            i2 = 0;
        } else {
            i2 = this.f28102g[b - 1];
        }
        int[] iArr = this.f28102g;
        byte[][] bArr = this.f28101f;
        return bArr[b][(i - i2) + iArr[bArr.length + b]];
    }

    /* renamed from: b */
    private int m31977b(int i) {
        int binarySearch = Arrays.binarySearch(this.f28102g, 0, this.f28101f.length, i + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    /* renamed from: c */
    public final int mo70282c() {
        return this.f28102g[this.f28101f.length - 1];
    }

    /* renamed from: d */
    public final byte[] mo70284d() {
        int[] iArr = this.f28102g;
        byte[][] bArr = this.f28101f;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.f28102g;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.f28101f[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo70279a(C11645jb jbVar) {
        int length = this.f28101f.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f28102g;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            C11654ji jiVar = new C11654ji(this.f28101f[i], i3, (i3 + i4) - i2);
            if (jbVar.f28074a == null) {
                jiVar.f28098g = jiVar;
                jiVar.f28097f = jiVar;
                jbVar.f28074a = jiVar;
            } else {
                jbVar.f28074a.f28098g.mo70293a(jiVar);
            }
            i++;
            i2 = i4;
        }
        jbVar.f28075b += (long) i2;
    }

    /* renamed from: a */
    public final boolean mo70280a(int i, byte[] bArr, int i2, int i3) {
        int i4;
        if (i < 0 || i > mo70282c() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int b = m31977b(i);
        while (i3 > 0) {
            if (b == 0) {
                i4 = 0;
            } else {
                i4 = this.f28102g[b - 1];
            }
            int min = Math.min(i3, ((this.f28102g[b] - i4) + i4) - i);
            int[] iArr = this.f28102g;
            byte[][] bArr2 = this.f28101f;
            if (!C11661jo.m31995a(bArr2[b], (i - i4) + iArr[bArr2.length + b], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            b++;
        }
        return true;
    }

    /* renamed from: e */
    private C11648je m31978e() {
        return new C11648je(mo70284d());
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r12) {
        /*
            r11 = this;
            r0 = 1
            if (r12 != r11) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r12 instanceof com.tapjoy.internal.C11648je
            r2 = 0
            if (r1 == 0) goto L_0x005d
            com.tapjoy.internal.je r12 = (com.tapjoy.internal.C11648je) r12
            int r1 = r12.mo70282c()
            int r3 = r11.mo70282c()
            if (r1 != r3) goto L_0x005d
            int r1 = r11.mo70282c()
            int r3 = r11.mo70282c()
            int r3 = r3 - r1
            if (r3 >= 0) goto L_0x0022
        L_0x0020:
            r12 = r2
            goto L_0x005a
        L_0x0022:
            int r3 = r11.m31977b(r2)
            r4 = r2
            r5 = r4
        L_0x0028:
            if (r1 <= 0) goto L_0x0059
            if (r3 != 0) goto L_0x002e
            r6 = r2
            goto L_0x0034
        L_0x002e:
            int[] r6 = r11.f28102g
            int r7 = r3 + -1
            r6 = r6[r7]
        L_0x0034:
            int[] r7 = r11.f28102g
            r7 = r7[r3]
            int r7 = r7 - r6
            int r7 = r7 + r6
            int r7 = r7 - r4
            int r7 = java.lang.Math.min(r1, r7)
            int[] r8 = r11.f28102g
            byte[][] r9 = r11.f28101f
            int r10 = r9.length
            int r10 = r10 + r3
            r8 = r8[r10]
            int r6 = r4 - r6
            int r6 = r6 + r8
            r8 = r9[r3]
            boolean r6 = r12.mo70280a(r5, r8, r6, r7)
            if (r6 != 0) goto L_0x0053
            goto L_0x0020
        L_0x0053:
            int r4 = r4 + r7
            int r5 = r5 + r7
            int r1 = r1 - r7
            int r3 = r3 + 1
            goto L_0x0028
        L_0x0059:
            r12 = r0
        L_0x005a:
            if (r12 == 0) goto L_0x005d
            return r0
        L_0x005d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11656jk.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = this.f28079d;
        if (i != 0) {
            return i;
        }
        int length = this.f28101f.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            byte[] bArr = this.f28101f[i2];
            int[] iArr = this.f28102g;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.f28079d = i3;
        return i3;
    }

    public final String toString() {
        return m31978e().toString();
    }
}
