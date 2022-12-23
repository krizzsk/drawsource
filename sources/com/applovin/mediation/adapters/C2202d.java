package com.applovin.mediation.adapters;

import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.saygames.saypromo.SayPromoAdShowCallback;
import com.saygames.saypromo.SayPromoAdShowError;

/* renamed from: com.applovin.mediation.adapters.d */
public final class C2202d implements SayPromoAdShowCallback {

    /* renamed from: a */
    final /* synthetic */ MaxInterstitialAdapterListener f4222a;

    C2202d(MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        this.f4222a = maxInterstitialAdapterListener;
    }

    public final void onClick() {
        this.f4222a.onInterstitialAdClicked();
    }

    public final void onDisplayed() {
        this.f4222a.onInterstitialAdDisplayed();
    }

    public final void onError(SayPromoAdShowError sayPromoAdShowError) {
        this.f4222a.onInterstitialAdHidden();
    }

    public final void onHidden() {
        this.f4222a.onInterstitialAdHidden();
    }
}
