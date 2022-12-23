package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.C4722b;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.d */
public final class C4725d implements C4722b.C4723a {

    /* renamed from: a */
    public final long f12079a;

    /* renamed from: b */
    public final long f12080b;

    /* renamed from: c */
    public final long f12081c;

    /* renamed from: d */
    public final long[] f12082d;

    /* renamed from: e */
    public final long f12083e;

    /* renamed from: f */
    public final int f12084f;

    public C4725d(long j, long j2, long j3, long[] jArr, long j4, int i) {
        this.f12079a = j;
        this.f12080b = j2;
        this.f12081c = j3;
        this.f12082d = jArr;
        this.f12083e = j4;
        this.f12084f = i;
    }

    /* renamed from: a */
    public boolean mo25055a() {
        return this.f12082d != null;
    }

    /* renamed from: b */
    public long mo25182b(long j) {
        long j2;
        long j3;
        long j4 = 0;
        if (mo25055a()) {
            long j5 = this.f12079a;
            if (j >= j5) {
                double d = (((double) (j - j5)) * 256.0d) / ((double) this.f12083e);
                int b = C4991u.m15143b(this.f12082d, (long) d, true, false) + 1;
                long j6 = this.f12080b;
                long j7 = (((long) b) * j6) / 100;
                if (b == 0) {
                    j2 = 0;
                } else {
                    j2 = this.f12082d[b - 1];
                }
                if (b == 99) {
                    j3 = 256;
                } else {
                    j3 = this.f12082d[b];
                }
                long j8 = (j6 * ((long) (b + 1))) / 100;
                if (j3 != j2) {
                    j4 = (long) ((((double) (j8 - j7)) * (d - ((double) j2))) / ((double) (j3 - j2)));
                }
                return j7 + j4;
            }
        }
        return 0;
    }

    /* renamed from: c */
    public long mo25056c() {
        return this.f12080b;
    }

    /* renamed from: a */
    public long mo25054a(long j) {
        long j2;
        if (!mo25055a()) {
            return this.f12079a;
        }
        float f = (((float) j) * 100.0f) / ((float) this.f12080b);
        float f2 = 0.0f;
        float f3 = 256.0f;
        if (f > 0.0f) {
            if (f >= 100.0f) {
                f2 = 256.0f;
            } else {
                int i = (int) f;
                if (i != 0) {
                    f2 = (float) this.f12082d[i - 1];
                }
                if (i < 99) {
                    f3 = (float) this.f12082d[i];
                }
                f2 += (f3 - f2) * (f - ((float) i));
            }
        }
        long round = Math.round(((double) f2) * 0.00390625d * ((double) this.f12083e));
        long j3 = this.f12079a;
        long j4 = round + j3;
        long j5 = this.f12081c;
        if (j5 != -1) {
            j2 = j5 - 1;
        } else {
            j2 = ((j3 - ((long) this.f12084f)) + this.f12083e) - 1;
        }
        return Math.min(j4, j2);
    }
}
