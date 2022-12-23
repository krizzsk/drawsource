package com.fyber.inneractive.sdk.player.exoplayer2.util;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.l */
public final class C4979l {

    /* renamed from: a */
    public byte[] f13246a;

    /* renamed from: b */
    public int f13247b;

    /* renamed from: c */
    public int f13248c;

    /* renamed from: d */
    public int f13249d;

    public C4979l(byte[] bArr, int i, int i2) {
        mo25541a(bArr, i, i2);
    }

    /* renamed from: a */
    public void mo25541a(byte[] bArr, int i, int i2) {
        this.f13246a = bArr;
        this.f13248c = i;
        this.f13247b = i2;
        this.f13249d = 0;
        mo25540a();
    }

    /* renamed from: b */
    public int mo25543b(int i) {
        int i2;
        int i3;
        this.f13249d += i;
        int i4 = 0;
        while (true) {
            i2 = this.f13249d;
            i3 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.f13249d = i5;
            byte[] bArr = this.f13246a;
            int i6 = this.f13248c;
            i4 |= (bArr[i6] & 255) << i5;
            if (!mo25546c(i6 + 1)) {
                i3 = 1;
            }
            this.f13248c = i6 + i3;
        }
        byte[] bArr2 = this.f13246a;
        int i7 = this.f13248c;
        int i8 = (-1 >>> (32 - i)) & (i4 | ((bArr2[i7] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f13249d = 0;
            if (!mo25546c(i7 + 1)) {
                i3 = 1;
            }
            this.f13248c = i7 + i3;
        }
        mo25540a();
        return i8;
    }

    /* renamed from: c */
    public boolean mo25545c() {
        boolean z = (this.f13246a[this.f13248c] & (128 >> this.f13249d)) != 0;
        mo25550f();
        return z;
    }

    /* renamed from: d */
    public void mo25548d(int i) {
        int i2 = this.f13248c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f13248c = i4;
        int i5 = this.f13249d + (i - (i3 * 8));
        this.f13249d = i5;
        if (i5 > 7) {
            this.f13248c = i4 + 1;
            this.f13249d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f13248c) {
                mo25540a();
                return;
            } else if (mo25546c(i2)) {
                this.f13248c++;
                i2 += 2;
            }
        }
    }

    /* renamed from: e */
    public int mo25549e() {
        int d = mo25547d();
        return (d % 2 == 0 ? -1 : 1) * ((d + 1) / 2);
    }

    /* renamed from: f */
    public void mo25550f() {
        int i = 1;
        int i2 = this.f13249d + 1;
        this.f13249d = i2;
        if (i2 == 8) {
            this.f13249d = 0;
            int i3 = this.f13248c;
            if (mo25546c(i3 + 1)) {
                i = 2;
            }
            this.f13248c = i3 + i;
        }
        mo25540a();
    }

    /* renamed from: c */
    public final boolean mo25546c(int i) {
        if (2 <= i && i < this.f13247b) {
            byte[] bArr = this.f13246a;
            return bArr[i] == 3 && bArr[i + -2] == 0 && bArr[i - 1] == 0;
        }
    }

    /* renamed from: a */
    public boolean mo25542a(int i) {
        int i2 = this.f13248c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.f13249d + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.f13247b) {
                int i6 = this.f13247b;
            } else if (mo25546c(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i62 = this.f13247b;
        if (i4 < i62) {
            return true;
        }
        if (i4 == i62 && i5 == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo25544b() {
        int i = this.f13248c;
        int i2 = this.f13249d;
        int i3 = 0;
        while (this.f13248c < this.f13247b && !mo25545c()) {
            i3++;
        }
        boolean z = this.f13248c == this.f13247b;
        this.f13248c = i;
        this.f13249d = i2;
        if (z || !mo25542a((i3 * 2) + 1)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final int mo25547d() {
        int i = 0;
        int i2 = 0;
        while (!mo25545c()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = mo25543b(i2);
        }
        return i3 + i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f13247b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25540a() {
        /*
            r2 = this;
            int r0 = r2.f13248c
            if (r0 < 0) goto L_0x0010
            int r1 = r2.f13247b
            if (r0 < r1) goto L_0x000e
            if (r0 != r1) goto L_0x0010
            int r0 = r2.f13249d
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a.m15051b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.util.C4979l.mo25540a():void");
    }
}
