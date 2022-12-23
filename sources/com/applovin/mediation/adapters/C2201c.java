package com.applovin.mediation.adapters;

import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.saygames.saypromo.SayPromoAdLoadCallback;
import com.saygames.saypromo.SayPromoAdLoadError;

/* renamed from: com.applovin.mediation.adapters.c */
public final class C2201c implements SayPromoAdLoadCallback {

    /* renamed from: a */
    final /* synthetic */ MaxRewardedAdapterListener f4220a;

    /* renamed from: b */
    final /* synthetic */ SayGamesMediationAdapter f4221b;

    C2201c(MaxRewardedAdapterListener maxRewardedAdapterListener, SayGamesMediationAdapter sayGamesMediationAdapter) {
        this.f4220a = maxRewardedAdapterListener;
        this.f4221b = sayGamesMediationAdapter;
    }

    public final void onError(SayPromoAdLoadError sayPromoAdLoadError) {
        this.f4220a.onRewardedAdLoadFailed(this.f4221b.m5145a(sayPromoAdLoadError));
    }

    public final void onSuccess() {
        this.f4220a.onRewardedAdLoaded();
    }
}
