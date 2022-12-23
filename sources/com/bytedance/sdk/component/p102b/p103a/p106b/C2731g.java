package com.bytedance.sdk.component.p102b.p103a.p106b;

import java.util.Arrays;

/* renamed from: com.bytedance.sdk.component.b.a.b.g */
/* compiled from: SegmentedByteString */
final class C2731g extends C2728d {

    /* renamed from: g */
    final transient byte[][] f6080g;

    /* renamed from: h */
    final transient int[] f6081h;

    C2731g(C2725a aVar, int i) {
        super((byte[]) null);
        C2733i.m7400a(aVar.f6064b, 0, (long) i);
        C2729e eVar = aVar.f6063a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            if (eVar.f6073c != eVar.f6072b) {
                i3 += eVar.f6073c - eVar.f6072b;
                i4++;
                eVar = eVar.f6076f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f6080g = new byte[i4][];
        this.f6081h = new int[(i4 * 2)];
        C2729e eVar2 = aVar.f6063a;
        int i5 = 0;
        while (i2 < i) {
            this.f6080g[i5] = eVar2.f6071a;
            i2 += eVar2.f6073c - eVar2.f6072b;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.f6081h;
            iArr[i5] = i2;
            iArr[this.f6080g.length + i5] = eVar2.f6072b;
            eVar2.f6074d = true;
            i5++;
            eVar2 = eVar2.f6076f;
        }
    }

    /* renamed from: a */
    public String mo17462a() {
        return m7385e().mo17462a();
    }

    /* renamed from: b */
    public String mo17465b() {
        return m7385e().mo17465b();
    }

    /* renamed from: a */
    public C2728d mo17461a(int i, int i2) {
        return m7385e().mo17461a(i, i2);
    }

    /* renamed from: a */
    public byte mo17459a(int i) {
        int i2;
        C2733i.m7400a((long) this.f6081h[this.f6080g.length - 1], (long) i, 1);
        int b = m7384b(i);
        if (b == 0) {
            i2 = 0;
        } else {
            i2 = this.f6081h[b - 1];
        }
        int[] iArr = this.f6081h;
        byte[][] bArr = this.f6080g;
        return bArr[b][(i - i2) + iArr[bArr.length + b]];
    }

    /* renamed from: b */
    private int m7384b(int i) {
        int binarySearch = Arrays.binarySearch(this.f6081h, 0, this.f6080g.length, i + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    /* renamed from: c */
    public int mo17466c() {
        return this.f6081h[this.f6080g.length - 1];
    }

    /* renamed from: d */
    public byte[] mo17468d() {
        int[] iArr = this.f6081h;
        byte[][] bArr = this.f6080g;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.f6081h;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.f6080g[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    /* renamed from: a */
    public boolean mo17463a(int i, C2728d dVar, int i2, int i3) {
        int i4;
        if (i < 0 || i > mo17466c() - i3) {
            return false;
        }
        int b = m7384b(i);
        while (i3 > 0) {
            if (b == 0) {
                i4 = 0;
            } else {
                i4 = this.f6081h[b - 1];
            }
            int min = Math.min(i3, ((this.f6081h[b] - i4) + i4) - i);
            int[] iArr = this.f6081h;
            byte[][] bArr = this.f6080g;
            if (!dVar.mo17464a(i2, bArr[b], (i - i4) + iArr[bArr.length + b], min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            b++;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo17464a(int i, byte[] bArr, int i2, int i3) {
        int i4;
        if (i < 0 || i > mo17466c() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int b = m7384b(i);
        while (i3 > 0) {
            if (b == 0) {
                i4 = 0;
            } else {
                i4 = this.f6081h[b - 1];
            }
            int min = Math.min(i3, ((this.f6081h[b] - i4) + i4) - i);
            int[] iArr = this.f6081h;
            byte[][] bArr2 = this.f6080g;
            if (!C2733i.m7402a(bArr2[b], (i - i4) + iArr[bArr2.length + b], bArr, i2, min)) {
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
    private C2728d m7385e() {
        return new C2728d(mo17468d());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2728d) {
            C2728d dVar = (C2728d) obj;
            if (dVar.mo17466c() == mo17466c() && mo17463a(0, dVar, 0, mo17466c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.f6069e;
        if (i != 0) {
            return i;
        }
        int length = this.f6080g.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            byte[] bArr = this.f6080g[i2];
            int[] iArr = this.f6081h;
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
        this.f6069e = i3;
        return i3;
    }

    public String toString() {
        return m7385e().toString();
    }
}
