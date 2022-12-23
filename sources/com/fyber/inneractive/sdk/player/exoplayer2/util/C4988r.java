package com.fyber.inneractive.sdk.player.exoplayer2.util;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.r */
public final class C4988r {

    /* renamed from: a */
    public long f13267a;

    /* renamed from: b */
    public long f13268b;

    /* renamed from: c */
    public volatile long f13269c = -9223372036854775807L;

    public C4988r(long j) {
        mo25561c(j);
    }

    /* renamed from: a */
    public long mo25558a() {
        if (this.f13267a == Long.MAX_VALUE) {
            return 0;
        }
        if (this.f13269c == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f13268b;
    }

    /* renamed from: b */
    public long mo25560b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f13269c != -9223372036854775807L) {
            long j2 = (this.f13269c * 90000) / 1000000;
            long j3 = (4294967296L + j2) / 8589934592L;
            long j4 = ((j3 - 1) * 8589934592L) + j;
            j += j3 * 8589934592L;
            if (Math.abs(j4 - j2) < Math.abs(j - j2)) {
                j = j4;
            }
        }
        return mo25559a((j * 1000000) / 90000);
    }

    /* renamed from: c */
    public synchronized void mo25561c(long j) {
        C4965a.m15051b(this.f13269c == -9223372036854775807L);
        this.f13267a = j;
    }

    /* renamed from: a */
    public long mo25559a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f13269c != -9223372036854775807L) {
            this.f13269c = j;
        } else {
            long j2 = this.f13267a;
            if (j2 != Long.MAX_VALUE) {
                this.f13268b = j2 - j;
            }
            synchronized (this) {
                this.f13269c = j;
                notifyAll();
            }
        }
        return j + this.f13268b;
    }
}
