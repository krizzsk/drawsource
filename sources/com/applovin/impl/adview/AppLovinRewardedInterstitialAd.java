package com.applovin.impl.adview;

import android.content.Context;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;

public class AppLovinRewardedInterstitialAd {

    /* renamed from: a */
    private final AppLovinIncentivizedInterstitial f1655a;

    /* renamed from: b */
    private AppLovinAdDisplayListener f1656b;

    /* renamed from: c */
    private AppLovinAdClickListener f1657c;

    /* renamed from: d */
    private AppLovinAdVideoPlaybackListener f1658d;

    public AppLovinRewardedInterstitialAd(AppLovinSdk appLovinSdk) {
        this.f1655a = new AppLovinIncentivizedInterstitial(appLovinSdk);
    }

    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        this.f1657c = appLovinAdClickListener;
    }

    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f1656b = appLovinAdDisplayListener;
    }

    public void setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f1658d = appLovinAdVideoPlaybackListener;
    }

    public void show(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener) {
        this.f1655a.show(appLovinAd, context, appLovinAdRewardListener, this.f1658d, this.f1656b, this.f1657c);
    }

    public String toString() {
        return "AppLovinRewardedInterstitialAd{}";
    }
}
