package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.a */
public final class C4656a implements C4709m {

    /* renamed from: a */
    public final long[] f11664a;

    /* renamed from: b */
    public final long[] f11665b;

    /* renamed from: c */
    public final long f11666c;

    public C4656a(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f11664a = jArr;
        this.f11665b = jArr3;
        int length = iArr.length;
        if (length > 0) {
            int i = length - 1;
            this.f11666c = jArr2[i] + jArr3[i];
            return;
        }
        this.f11666c = 0;
    }

    /* renamed from: a */
    public long mo25054a(long j) {
        return this.f11664a[C4991u.m15143b(this.f11665b, j, true, true)];
    }

    /* renamed from: a */
    public boolean mo25055a() {
        return true;
    }

    /* renamed from: c */
    public long mo25056c() {
        return this.f11666c;
    }
}
