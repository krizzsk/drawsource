package com.fyber.inneractive.sdk.player.exoplayer2.util;

import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.f */
public final class C4971f {

    /* renamed from: a */
    public int f13220a;

    /* renamed from: b */
    public long[] f13221b;

    public C4971f(int i) {
        this.f13221b = new long[i];
    }

    /* renamed from: a */
    public void mo25507a(long j) {
        int i = this.f13220a;
        long[] jArr = this.f13221b;
        if (i == jArr.length) {
            this.f13221b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.f13221b;
        int i2 = this.f13220a;
        this.f13220a = i2 + 1;
        jArr2[i2] = j;
    }

    /* renamed from: a */
    public long mo25506a(int i) {
        if (i >= 0 && i < this.f13220a) {
            return this.f13221b[i];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + this.f13220a);
    }
}
