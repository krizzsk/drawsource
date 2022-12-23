package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.exoplayer2.C4811i;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.r */
public final class C4889r {

    /* renamed from: a */
    public final int f12993a;

    /* renamed from: b */
    public final C4811i[] f12994b;

    /* renamed from: c */
    public int f12995c;

    public C4889r(C4811i... iVarArr) {
        C4965a.m15051b(iVarArr.length > 0);
        this.f12994b = iVarArr;
        this.f12993a = iVarArr.length;
    }

    /* renamed from: a */
    public C4811i mo25407a(int i) {
        return this.f12994b[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4889r.class != obj.getClass()) {
            return false;
        }
        C4889r rVar = (C4889r) obj;
        if (this.f12993a != rVar.f12993a || !Arrays.equals(this.f12994b, rVar.f12994b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f12995c == 0) {
            this.f12995c = Arrays.hashCode(this.f12994b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        }
        return this.f12995c;
    }

    /* renamed from: a */
    public int mo25406a(C4811i iVar) {
        int i = 0;
        while (true) {
            C4811i[] iVarArr = this.f12994b;
            if (i >= iVarArr.length) {
                return -1;
            }
            if (iVar == iVarArr[i]) {
                return i;
            }
            i++;
        }
    }
}
