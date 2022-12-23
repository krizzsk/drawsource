package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.C4722b;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.c */
public final class C4724c implements C4722b.C4723a {

    /* renamed from: a */
    public final long[] f12076a;

    /* renamed from: b */
    public final long[] f12077b;

    /* renamed from: c */
    public final long f12078c;

    public C4724c(long[] jArr, long[] jArr2, long j) {
        this.f12076a = jArr;
        this.f12077b = jArr2;
        this.f12078c = j;
    }

    /* renamed from: a */
    public long mo25054a(long j) {
        return this.f12077b[C4991u.m15143b(this.f12076a, j, true, true)];
    }

    /* renamed from: a */
    public boolean mo25055a() {
        return true;
    }

    /* renamed from: b */
    public long mo25182b(long j) {
        return this.f12076a[C4991u.m15143b(this.f12077b, j, true, true)];
    }

    /* renamed from: c */
    public long mo25056c() {
        return this.f12078c;
    }
}
