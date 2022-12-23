package com.unity3d.services.ads.gmascar.finder;

import com.unity3d.services.ads.gmascar.bridges.C11841a;
import com.unity3d.services.ads.gmascar.bridges.C11844c;
import com.unity3d.services.ads.gmascar.bridges.C11846d;
import com.unity3d.services.ads.gmascar.bridges.C11849e;

/* renamed from: com.unity3d.services.ads.gmascar.finder.b */
/* compiled from: PresenceDetector */
public class C11852b {

    /* renamed from: a */
    private C11849e f28771a;

    /* renamed from: b */
    private C11846d f28772b;

    /* renamed from: c */
    private C11844c f28773c;

    /* renamed from: d */
    private C11841a f28774d;

    public C11852b(C11849e eVar, C11846d dVar, C11844c cVar, C11841a aVar) {
        this.f28771a = eVar;
        this.f28772b = dVar;
        this.f28773c = cVar;
        this.f28774d = aVar;
    }

    /* renamed from: a */
    public boolean mo70799a() {
        C11849e eVar = this.f28771a;
        if (eVar == null || this.f28772b == null || this.f28773c == null || this.f28774d == null || !eVar.mo71236f() || !this.f28772b.mo71236f() || !this.f28773c.mo71236f() || !this.f28774d.mo71236f()) {
            return false;
        }
        return true;
    }
}
