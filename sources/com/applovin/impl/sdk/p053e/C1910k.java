package com.applovin.impl.sdk.p053e;

import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.p049ad.C1838d;
import com.applovin.impl.sdk.utils.C2050h;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.k */
public class C1910k extends C1903h {

    /* renamed from: c */
    private final AppLovinAdLoadListener f3535c;

    public C1910k(C1838d dVar, AppLovinAdLoadListener appLovinAdLoadListener, C1969m mVar) {
        this(dVar, appLovinAdLoadListener, "TaskFetchNextAd", mVar);
    }

    public C1910k(C1838d dVar, AppLovinAdLoadListener appLovinAdLoadListener, String str, C1969m mVar) {
        super(dVar, str, mVar);
        this.f3535c = appLovinAdLoadListener;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1887a mo14405a(JSONObject jSONObject) {
        return new C1924p(jSONObject, this.f3526a, mo14411h(), this.f3535c, this.f3496b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14407a(int i) {
        super.mo14407a(i);
        this.f3535c.failedToReceiveAd(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo14408b() {
        return C2050h.m4967g(this.f3496b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo14410c() {
        return C2050h.m4968h(this.f3496b);
    }
}
