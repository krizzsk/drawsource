package com.applovin.mediation.nativeAds;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.mediation.ads.C1614a;
import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.sdk.AppLovinSdk;

public class MaxNativeAdLoader {

    /* renamed from: a */
    private final MaxNativeAdLoaderImpl f4448a;

    public MaxNativeAdLoader(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public MaxNativeAdLoader(String str, AppLovinSdk appLovinSdk, Context context) {
        C1614a.logApiCall("MaxNativeAdLoader", "MaxNativeAdLoader(adUnitId=" + str + ", sdk=" + appLovinSdk + ")");
        if (str == null) {
            throw new IllegalArgumentException("No ad unit ID specified");
        } else if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Empty ad unit ID specified");
        } else if (appLovinSdk == null) {
            throw new IllegalArgumentException("No sdk specified");
        } else if (context != null) {
            this.f4448a = new MaxNativeAdLoaderImpl(str, appLovinSdk.coreSdk);
        } else {
            throw new IllegalArgumentException("No context specified");
        }
    }

    public void destroy() {
        this.f4448a.logApiCall("destroy()");
        this.f4448a.destroy();
    }

    public void destroy(MaxAd maxAd) {
        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = this.f4448a;
        maxNativeAdLoaderImpl.logApiCall("destroy(nativeAd=" + maxAd + ")");
        this.f4448a.destroy(maxAd);
    }

    public String getAdUnitId() {
        return this.f4448a.getAdUnitId();
    }

    public String getPlacement() {
        this.f4448a.logApiCall("getPlacement()");
        return this.f4448a.getPlacement();
    }

    public void loadAd() {
        loadAd((MaxNativeAdView) null);
    }

    public void loadAd(MaxNativeAdView maxNativeAdView) {
        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = this.f4448a;
        maxNativeAdLoaderImpl.logApiCall("loadAd(adView=" + maxNativeAdView + ")");
        this.f4448a.loadAd(maxNativeAdView);
    }

    public boolean render(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = this.f4448a;
        maxNativeAdLoaderImpl.logApiCall("render(adView=" + maxNativeAdView + ", ad=" + maxAd + ")");
        return this.f4448a.render(maxNativeAdView, maxAd);
    }

    public void setCustomData(String str) {
        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = this.f4448a;
        maxNativeAdLoaderImpl.logApiCall("setCustomData(value=" + str + ")");
        this.f4448a.setCustomData(str);
    }

    public void setExtraParameter(String str, String str2) {
        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = this.f4448a;
        maxNativeAdLoaderImpl.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f4448a.setExtraParameter(str, str2);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = this.f4448a;
        maxNativeAdLoaderImpl.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f4448a.setLocalExtraParameter(str, obj);
    }

    public void setNativeAdListener(MaxNativeAdListener maxNativeAdListener) {
        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = this.f4448a;
        maxNativeAdLoaderImpl.logApiCall("setNativeAdListener(listener=" + maxNativeAdListener + ")");
        this.f4448a.setNativeAdListener(maxNativeAdListener);
    }

    public void setPlacement(String str) {
        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = this.f4448a;
        maxNativeAdLoaderImpl.logApiCall("setPlacement(placement=" + str + ")");
        this.f4448a.setPlacement(str);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = this.f4448a;
        maxNativeAdLoaderImpl.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f4448a.setRevenueListener(maxAdRevenueListener);
    }
}
