package com.applovin.impl.mediation.p035d;

import com.applovin.impl.mediation.ads.C1614a;
import com.applovin.impl.sdk.utils.C2053j;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;

/* renamed from: com.applovin.impl.mediation.d.a */
public class C1653a implements C1614a.C1615a, MaxAdListener, MaxAdRevenueListener, MaxAdViewAdListener, MaxRewardedAdListener {

    /* renamed from: a */
    private final C1614a.C1615a f2324a;

    public C1653a(C1614a.C1615a aVar) {
        this.f2324a = aVar;
    }

    public void onAdClicked(MaxAd maxAd) {
        C2053j.m5016d(this.f2324a, maxAd);
    }

    public void onAdCollapsed(MaxAd maxAd) {
        C2053j.m5024h(this.f2324a, maxAd);
    }

    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        C2053j.m4983a((MaxAdListener) this.f2324a, maxAd, maxError);
    }

    public void onAdDisplayed(MaxAd maxAd) {
        C2053j.m5008b((MaxAdListener) this.f2324a, maxAd);
    }

    public void onAdExpanded(MaxAd maxAd) {
        C2053j.m5022g(this.f2324a, maxAd);
    }

    public void onAdHidden(MaxAd maxAd) {
        C2053j.m5013c(this.f2324a, maxAd);
    }

    public void onAdLoadFailed(String str, MaxError maxError) {
        C2053j.m4988a((MaxAdListener) this.f2324a, str, maxError);
    }

    public void onAdLoaded(MaxAd maxAd) {
        C2053j.m4982a((MaxAdListener) this.f2324a, maxAd);
    }

    public void onAdRevenuePaid(MaxAd maxAd) {
        C2053j.m4990a((MaxAdRevenueListener) this.f2324a, maxAd);
    }

    public void onRewardedVideoCompleted(MaxAd maxAd) {
        C2053j.m5020f(this.f2324a, maxAd);
    }

    public void onRewardedVideoStarted(MaxAd maxAd) {
        C2053j.m5018e(this.f2324a, maxAd);
    }

    public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        C2053j.m4985a((MaxAdListener) this.f2324a, maxAd, maxReward);
    }
}
