package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.C4722b;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.a */
public final class C4721a implements C4722b.C4723a {

    /* renamed from: a */
    public final long f12058a;

    /* renamed from: b */
    public final int f12059b;

    /* renamed from: c */
    public final long f12060c;

    public C4721a(long j, int i, long j2) {
        long j3;
        this.f12058a = j;
        this.f12059b = i;
        if (j2 == -1) {
            j3 = -9223372036854775807L;
        } else {
            j3 = mo25182b(j2);
        }
        this.f12060c = j3;
    }

    /* renamed from: a */
    public boolean mo25055a() {
        return this.f12060c != -9223372036854775807L;
    }

    /* renamed from: b */
    public long mo25182b(long j) {
        return ((Math.max(0, j - this.f12058a) * 1000000) * 8) / ((long) this.f12059b);
    }

    /* renamed from: c */
    public long mo25056c() {
        return this.f12060c;
    }

    /* renamed from: a */
    public long mo25054a(long j) {
        long j2 = this.f12060c;
        if (j2 == -9223372036854775807L) {
            return 0;
        }
        int i = C4991u.f13270a;
        return this.f12058a + ((Math.max(0, Math.min(j, j2)) * ((long) this.f12059b)) / 8000000);
    }
}
