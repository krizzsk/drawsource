package com.applovin.impl.sdk.p049ad;

/* renamed from: com.applovin.impl.sdk.ad.b */
public enum C1835b {
    UNKNOWN(0),
    APPLOVIN_PRIMARY_ZONE(1),
    APPLOVIN_CUSTOM_ZONE(2),
    APPLOVIN_MULTIZONE(3),
    REGULAR_AD_TOKEN(4),
    DECODED_AD_TOKEN_JSON(5);
    

    /* renamed from: g */
    private final int f2957g;

    private C1835b(int i) {
        this.f2957g = i;
    }

    /* renamed from: a */
    public static C1835b m3894a(int i) {
        return i == 1 ? APPLOVIN_PRIMARY_ZONE : i == 2 ? APPLOVIN_CUSTOM_ZONE : i == 3 ? APPLOVIN_MULTIZONE : i == 4 ? REGULAR_AD_TOKEN : i == 5 ? DECODED_AD_TOKEN_JSON : UNKNOWN;
    }

    /* renamed from: a */
    public int mo14145a() {
        return this.f2957g;
    }
}
