package com.fyber.inneractive.sdk.player.exoplayer2.source;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.h */
public final class C4871h implements C4887p {

    /* renamed from: a */
    public final C4887p[] f12923a;

    public C4871h(C4887p[] pVarArr) {
        this.f12923a = pVarArr;
    }

    /* renamed from: a */
    public long mo25114a() {
        long j = Long.MAX_VALUE;
        for (C4887p a : this.f12923a) {
            long a2 = a.mo25114a();
            if (a2 != Long.MIN_VALUE) {
                j = Math.min(j, a2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    /* renamed from: a */
    public boolean mo25120a(long j) {
        boolean z;
        boolean z2 = false;
        do {
            long a = mo25114a();
            if (a == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (C4887p pVar : this.f12923a) {
                if (pVar.mo25114a() == a) {
                    z |= pVar.mo25120a(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }
}
