package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.p053e.C1887a;
import com.applovin.impl.sdk.p053e.C1900g;
import com.applovin.impl.sdk.p053e.C1918o;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinPostbackService;

public class PostbackServiceImpl implements AppLovinPostbackService {

    /* renamed from: a */
    private final C1969m f3798a;

    public PostbackServiceImpl(C1969m mVar) {
        this.f3798a = mVar;
    }

    public void dispatchPostbackAsync(String str, AppLovinPostbackListener appLovinPostbackListener) {
        dispatchPostbackRequest(C2020i.m4771b(this.f3798a).mo14724a(str).mo14735c(false).mo14728a(), appLovinPostbackListener);
    }

    public void dispatchPostbackRequest(C2020i iVar, C1918o.C1920a aVar, AppLovinPostbackListener appLovinPostbackListener) {
        this.f3798a.mo14526S().mo14429a((C1887a) new C1900g(iVar, aVar, this.f3798a, appLovinPostbackListener), aVar);
    }

    public void dispatchPostbackRequest(C2020i iVar, AppLovinPostbackListener appLovinPostbackListener) {
        dispatchPostbackRequest(iVar, C1918o.C1920a.POSTBACKS, appLovinPostbackListener);
    }

    public String toString() {
        return "PostbackService{}";
    }
}
