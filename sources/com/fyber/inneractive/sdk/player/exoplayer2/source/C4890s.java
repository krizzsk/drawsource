package com.fyber.inneractive.sdk.player.exoplayer2.source;

import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.s */
public final class C4890s {

    /* renamed from: d */
    public static final C4890s f12996d = new C4890s(new C4889r[0]);

    /* renamed from: a */
    public final int f12997a;

    /* renamed from: b */
    public final C4889r[] f12998b;

    /* renamed from: c */
    public int f12999c;

    public C4890s(C4889r... rVarArr) {
        this.f12998b = rVarArr;
        this.f12997a = rVarArr.length;
    }

    /* renamed from: a */
    public int mo25410a(C4889r rVar) {
        for (int i = 0; i < this.f12997a; i++) {
            if (this.f12998b[i] == rVar) {
                return i;
            }
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4890s.class != obj.getClass()) {
            return false;
        }
        C4890s sVar = (C4890s) obj;
        if (this.f12997a != sVar.f12997a || !Arrays.equals(this.f12998b, sVar.f12998b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f12999c == 0) {
            this.f12999c = Arrays.hashCode(this.f12998b);
        }
        return this.f12999c;
    }
}
