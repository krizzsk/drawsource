package com.fyber.inneractive.sdk.response;

/* renamed from: com.fyber.inneractive.sdk.response.a */
public enum C5229a {
    RETURNED_ADTYPE_HTML(4),
    RETURNED_ADTYPE_MRAID(6),
    RETURNED_ADTYPE_VAST(8),
    RETURNED_ADTYPE_MOBILE_ADS(15);
    

    /* renamed from: a */
    public int f13853a;

    /* access modifiers changed from: public */
    C5229a(int i) {
        this.f13853a = i;
    }

    /* renamed from: a */
    public static C5229a m16362a(int i) {
        for (C5229a aVar : values()) {
            if (aVar.f13853a == i) {
                return aVar;
            }
        }
        return null;
    }
}
