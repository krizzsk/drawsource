package com.applovin.impl.sdk;

import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.sdk.p049ad.AppLovinAdImpl;
import com.applovin.impl.sdk.p049ad.C1838d;
import com.applovin.impl.sdk.p049ad.C1845f;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.applovin.impl.sdk.c */
public class C1865c {

    /* renamed from: a */
    private final C1969m f3042a;

    /* renamed from: b */
    private final C2102v f3043b;

    /* renamed from: c */
    private final Object f3044c = new Object();

    /* renamed from: d */
    private final Map<C1838d, C2105x> f3045d = new HashMap();

    /* renamed from: e */
    private final Map<C1838d, C2105x> f3046e = new HashMap();

    C1865c(C1969m mVar) {
        this.f3042a = mVar;
        this.f3043b = mVar.mo14509A();
        for (C1838d next : C1838d.m3906f()) {
            this.f3045d.put(next, new C2105x());
            this.f3046e.put(next, new C2105x());
        }
    }

    /* renamed from: d */
    private C2105x m4072d(C1838d dVar) {
        C2105x xVar;
        synchronized (this.f3044c) {
            xVar = this.f3045d.get(dVar);
            if (xVar == null) {
                xVar = new C2105x();
                this.f3045d.put(dVar, xVar);
            }
        }
        return xVar;
    }

    /* renamed from: e */
    private C2105x m4073e(C1838d dVar) {
        C2105x xVar;
        synchronized (this.f3044c) {
            xVar = this.f3046e.get(dVar);
            if (xVar == null) {
                xVar = new C2105x();
                this.f3046e.put(dVar, xVar);
            }
        }
        return xVar;
    }

    /* renamed from: f */
    private C2105x m4074f(C1838d dVar) {
        synchronized (this.f3044c) {
            C2105x e = m4073e(dVar);
            if (e.mo15020a() > 0) {
                return e;
            }
            C2105x d = m4072d(dVar);
            return d;
        }
    }

    /* renamed from: a */
    public AppLovinAdImpl mo14275a(C1838d dVar) {
        C1845f fVar;
        StringBuilder sb;
        String str;
        synchronized (this.f3044c) {
            C2105x d = m4072d(dVar);
            if (d.mo15020a() > 0) {
                m4073e(dVar).mo15021a(d.mo15023c());
                fVar = new C1845f(dVar, this.f3042a);
            } else {
                fVar = null;
            }
        }
        if (C2102v.m5104a()) {
            C2102v vVar = this.f3043b;
            if (fVar != null) {
                str = "Retrieved ad of zone ";
            } else {
                sb = new StringBuilder();
                str = "Unable to retrieve ad of zone ";
            }
            sb.append(str);
            sb.append(dVar);
            sb.append(APSSharedUtil.TRUNCATE_SEPARATOR);
            vVar.mo15012b("AdPreloadManager", sb.toString());
        }
        return fVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo14276a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.f3044c) {
            m4072d(appLovinAdImpl.getAdZone()).mo15021a(appLovinAdImpl);
            if (C2102v.m5104a()) {
                C2102v vVar = this.f3043b;
                vVar.mo15012b("AdPreloadManager", "Ad enqueued: " + appLovinAdImpl);
            }
        }
    }

    /* renamed from: b */
    public AppLovinAdImpl mo14277b(C1838d dVar) {
        AppLovinAdImpl c;
        synchronized (this.f3044c) {
            c = m4074f(dVar).mo15023c();
        }
        return c;
    }

    /* renamed from: c */
    public AppLovinAdBase mo14278c(C1838d dVar) {
        AppLovinAdImpl d;
        synchronized (this.f3044c) {
            d = m4074f(dVar).mo15024d();
        }
        return d;
    }
}
