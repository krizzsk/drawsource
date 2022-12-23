package com.applovin.impl.sdk.nativeAd;

import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.p049ad.C1838d;
import com.applovin.impl.sdk.p053e.C1887a;
import com.applovin.impl.sdk.p053e.C1903h;
import com.applovin.impl.sdk.utils.C2050h;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.nativeAd.c */
public class C1989c extends C1903h {

    /* renamed from: c */
    private final AppLovinNativeAdLoadListener f3773c;

    public C1989c(C1838d dVar, String str, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, C1969m mVar) {
        super(dVar, str, mVar);
        this.f3773c = appLovinNativeAdLoadListener;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1887a mo14405a(JSONObject jSONObject) {
        return new C1990d(jSONObject, this.f3773c, this.f3496b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14407a(int i) {
        super.mo14407a(i);
        this.f3773c.onNativeAdLoadFailed(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo14408b() {
        return C2050h.m4969i(this.f3496b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo14410c() {
        return C2050h.m4970j(this.f3496b);
    }
}
