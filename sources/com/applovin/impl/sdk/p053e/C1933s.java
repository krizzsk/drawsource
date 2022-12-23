package com.applovin.impl.sdk.p053e;

import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.p049ad.C1834a;
import com.applovin.impl.sdk.p049ad.C1835b;
import com.applovin.impl.sdk.p051c.C1867b;
import com.applovin.impl.sdk.p053e.C1918o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.s */
class C1933s extends C1887a {

    /* renamed from: a */
    private final JSONObject f3593a;

    /* renamed from: c */
    private final JSONObject f3594c;

    /* renamed from: d */
    private final AppLovinAdLoadListener f3595d;

    /* renamed from: e */
    private final C1835b f3596e;

    C1933s(JSONObject jSONObject, JSONObject jSONObject2, C1835b bVar, AppLovinAdLoadListener appLovinAdLoadListener, C1969m mVar) {
        super("TaskRenderAppLovinAd", mVar);
        this.f3593a = jSONObject;
        this.f3594c = jSONObject2;
        this.f3596e = bVar;
        this.f3595d = appLovinAdLoadListener;
    }

    public void run() {
        if (C2102v.m5104a()) {
            mo14365a("Rendering ad...");
        }
        C1834a aVar = new C1834a(this.f3593a, this.f3594c, this.f3596e, this.f3496b);
        boolean booleanValue = JsonUtils.getBoolean(this.f3593a, "gs_load_immediately", false).booleanValue();
        boolean booleanValue2 = JsonUtils.getBoolean(this.f3593a, "vs_load_immediately", true).booleanValue();
        C1896d dVar = new C1896d(aVar, this.f3496b, this.f3595d);
        dVar.mo14400a(booleanValue2);
        dVar.mo14401b(booleanValue);
        C1918o.C1920a aVar2 = C1918o.C1920a.CACHING_OTHER;
        if (((Boolean) this.f3496b.mo14534a(C1867b.f3187bi)).booleanValue()) {
            if (aVar.getSize() == AppLovinAdSize.INTERSTITIAL && aVar.getType() == AppLovinAdType.REGULAR) {
                aVar2 = C1918o.C1920a.CACHING_INTERSTITIAL;
            } else if (aVar.getSize() == AppLovinAdSize.INTERSTITIAL && aVar.getType() == AppLovinAdType.INCENTIVIZED) {
                aVar2 = C1918o.C1920a.CACHING_INCENTIVIZED;
            }
        }
        this.f3496b.mo14526S().mo14429a((C1887a) dVar, aVar2);
    }
}
