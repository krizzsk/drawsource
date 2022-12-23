package com.fyber.marketplace.fairbid.bridge;

public enum MarketplaceAdShowError {
    GENERIC_SHOW_ERROR("Generic Error"),
    EXPIRED_AD_ERROR("Expired Ad Error");
    

    /* renamed from: a */
    public final String f14201a;

    /* access modifiers changed from: public */
    MarketplaceAdShowError(String str) {
        this.f14201a = str;
    }

    public String getMessage() {
        return this.f14201a;
    }
}
