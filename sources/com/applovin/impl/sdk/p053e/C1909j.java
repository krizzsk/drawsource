package com.applovin.impl.sdk.p053e;

import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.p049ad.C1835b;
import com.applovin.impl.sdk.p049ad.C1838d;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.applovin.impl.sdk.e.j */
public class C1909j extends C1910k {

    /* renamed from: c */
    private final List<String> f3534c;

    public C1909j(List<String> list, AppLovinAdLoadListener appLovinAdLoadListener, C1969m mVar) {
        super(C1838d.m3903a(m4285a(list)), appLovinAdLoadListener, "TaskFetchMultizoneAd", mVar);
        this.f3534c = Collections.unmodifiableList(list);
    }

    /* renamed from: a */
    private static String m4285a(List<String> list) {
        if (list != null && !list.isEmpty()) {
            return list.get(0);
        }
        throw new IllegalArgumentException("No zone identifiers specified");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Map<String, String> mo14406a() {
        HashMap hashMap = new HashMap(1);
        List<String> list = this.f3534c;
        hashMap.put("zone_ids", CollectionUtils.implode(list, list.size()));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C1835b mo14411h() {
        return C1835b.APPLOVIN_MULTIZONE;
    }
}
