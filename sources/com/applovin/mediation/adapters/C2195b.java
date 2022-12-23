package com.applovin.mediation.adapters;

import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.saygames.saypromo.SayPromoAdLoadCallback;
import com.saygames.saypromo.SayPromoAdLoadError;

/* renamed from: com.applovin.mediation.adapters.b */
public final class C2195b implements SayPromoAdLoadCallback {

    /* renamed from: a */
    final /* synthetic */ MaxInterstitialAdapterListener f4195a;

    /* renamed from: b */
    final /* synthetic */ SayGamesMediationAdapter f4196b;

    C2195b(MaxInterstitialAdapterListener maxInterstitialAdapterListener, SayGamesMediationAdapter sayGamesMediationAdapter) {
        this.f4195a = maxInterstitialAdapterListener;
        this.f4196b = sayGamesMediationAdapter;
    }

    public final void onError(SayPromoAdLoadError sayPromoAdLoadError) {
        this.f4195a.onInterstitialAdLoadFailed(this.f4196b.m5145a(sayPromoAdLoadError));
    }

    public final void onSuccess() {
        this.f4195a.onInterstitialAdLoaded();
    }
}
