package com.applovin.impl.sdk.p053e;

import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.p049ad.C1835b;
import com.applovin.impl.sdk.p049ad.C1836c;
import com.applovin.impl.sdk.p049ad.C1838d;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.applovin.impl.sdk.e.l */
public class C1911l extends C1910k {

    /* renamed from: c */
    private final C1836c f3536c;

    public C1911l(C1836c cVar, AppLovinAdLoadListener appLovinAdLoadListener, C1969m mVar) {
        super(C1838d.m3903a("adtoken_zone"), appLovinAdLoadListener, "TaskFetchTokenAd", mVar);
        this.f3536c = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Map<String, String> mo14406a() {
        HashMap hashMap = new HashMap(2);
        hashMap.put("adtoken", this.f3536c.mo14146a());
        hashMap.put("adtoken_prefix", this.f3536c.mo14148c());
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C1835b mo14411h() {
        return C1835b.REGULAR_AD_TOKEN;
    }
}
