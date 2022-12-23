package com.applovin.mediation.adapters;

import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.saygames.saypromo.SayPromoAdShowCallback;
import com.saygames.saypromo.SayPromoAdShowError;

/* renamed from: com.applovin.mediation.adapters.e */
public final class C2203e implements SayPromoAdShowCallback {

    /* renamed from: a */
    final /* synthetic */ MaxRewardedAdapterListener f4223a;

    /* renamed from: b */
    final /* synthetic */ SayGamesMediationAdapter f4224b;

    C2203e(MaxRewardedAdapterListener maxRewardedAdapterListener, SayGamesMediationAdapter sayGamesMediationAdapter) {
        this.f4223a = maxRewardedAdapterListener;
        this.f4224b = sayGamesMediationAdapter;
    }

    public final void onClick() {
        this.f4223a.onRewardedAdClicked();
    }

    public final void onDisplayed() {
        this.f4223a.onRewardedAdDisplayed();
        this.f4223a.onRewardedAdVideoStarted();
    }

    public final void onError(SayPromoAdShowError sayPromoAdShowError) {
        this.f4223a.onRewardedAdVideoCompleted();
        this.f4223a.onRewardedAdHidden();
    }

    public final void onHidden() {
        this.f4223a.onRewardedAdVideoCompleted();
        this.f4223a.onUserRewarded(this.f4224b.getReward());
        this.f4223a.onRewardedAdHidden();
    }
}
