package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.trackselection.f */
public final class C4908f {

    /* renamed from: a */
    public final int f13031a;

    /* renamed from: b */
    public final C4906e[] f13032b;

    /* renamed from: c */
    public int f13033c;

    public C4908f(C4906e... eVarArr) {
        this.f13032b = eVarArr;
        this.f13031a = eVarArr.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4908f.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f13032b, ((C4908f) obj).f13032b);
    }

    public int hashCode() {
        if (this.f13033c == 0) {
            this.f13033c = Arrays.hashCode(this.f13032b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        }
        return this.f13033c;
    }
}
