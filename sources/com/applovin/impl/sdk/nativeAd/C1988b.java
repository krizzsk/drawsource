package com.applovin.impl.sdk.nativeAd;

import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.p049ad.C1836c;
import com.applovin.impl.sdk.p049ad.C1838d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.applovin.impl.sdk.nativeAd.b */
public class C1988b extends C1989c {

    /* renamed from: c */
    private final C1836c f3772c;

    public C1988b(C1836c cVar, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, C1969m mVar) {
        super(C1838d.m3903a("adtoken_zone"), "TaskFetchNativeTokenAd", appLovinNativeAdLoadListener, mVar);
        this.f3772c = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Map<String, String> mo14406a() {
        HashMap hashMap = new HashMap(2);
        hashMap.put("adtoken", this.f3772c.mo14146a());
        hashMap.put("adtoken_prefix", this.f3772c.mo14148c());
        return hashMap;
    }
}
