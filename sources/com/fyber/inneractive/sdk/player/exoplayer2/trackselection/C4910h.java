package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import com.fyber.inneractive.sdk.player.exoplayer2.C4854o;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C4890s;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h */
public final class C4910h {

    /* renamed from: a */
    public final C4890s f13034a;

    /* renamed from: b */
    public final C4908f f13035b;

    /* renamed from: c */
    public final Object f13036c;

    /* renamed from: d */
    public final C4854o[] f13037d;

    public C4910h(C4890s sVar, C4908f fVar, Object obj, C4854o[] oVarArr) {
        this.f13034a = sVar;
        this.f13035b = fVar;
        this.f13036c = obj;
        this.f13037d = oVarArr;
    }

    /* renamed from: a */
    public boolean mo25435a(C4910h hVar, int i) {
        if (hVar != null && C4991u.m15140a((Object) this.f13035b.f13032b[i], (Object) hVar.f13035b.f13032b[i]) && C4991u.m15140a((Object) this.f13037d[i], (Object) hVar.f13037d[i])) {
            return true;
        }
        return false;
    }
}
