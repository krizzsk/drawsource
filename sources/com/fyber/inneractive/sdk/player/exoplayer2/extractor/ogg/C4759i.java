package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.i */
public final class C4759i {

    /* renamed from: a */
    public final byte[] f12386a;

    /* renamed from: b */
    public final int f12387b;

    /* renamed from: c */
    public int f12388c;

    /* renamed from: d */
    public int f12389d;

    public C4759i(byte[] bArr) {
        this.f12386a = bArr;
        this.f12387b = bArr.length;
    }

    /* renamed from: a */
    public boolean mo25216a() {
        boolean z = (((this.f12386a[this.f12388c] & 255) >> this.f12389d) & 1) == 1;
        mo25217b(1);
        return z;
    }

    /* renamed from: b */
    public void mo25217b(int i) {
        int i2;
        int i3 = i / 8;
        int i4 = this.f12388c + i3;
        this.f12388c = i4;
        int i5 = this.f12389d + (i - (i3 * 8));
        this.f12389d = i5;
        boolean z = true;
        if (i5 > 7) {
            this.f12388c = i4 + 1;
            this.f12389d = i5 - 8;
        }
        int i6 = this.f12388c;
        if (i6 < 0 || (i6 >= (i2 = this.f12387b) && !(i6 == i2 && this.f12389d == 0))) {
            z = false;
        }
        C4965a.m15051b(z);
    }

    /* renamed from: a */
    public int mo25215a(int i) {
        int i2 = this.f12388c;
        int min = Math.min(i, 8 - this.f12389d);
        int i3 = i2 + 1;
        int i4 = ((this.f12386a[i2] & 255) >> this.f12389d) & (255 >> (8 - min));
        while (min < i) {
            i4 |= (this.f12386a[i3] & 255) << min;
            min += 8;
            i3++;
        }
        int i5 = i4 & (-1 >>> (32 - i));
        mo25217b(i);
        return i5;
    }
}
