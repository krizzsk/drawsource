package com.applovin.impl.sdk.utils;

import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAd;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdEventListener;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.impl.sdk.p049ad.AppLovinAdImpl;
import com.applovin.impl.sdk.p049ad.C1846g;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Map;

/* renamed from: com.applovin.impl.sdk.utils.j */
public class C2053j {
    /* renamed from: a */
    public static void m4978a(final AppLovinAdViewEventListener appLovinAdViewEventListener, final AppLovinAd appLovinAd, final AppLovinAdView appLovinAdView) {
        if (appLovinAd != null && appLovinAdViewEventListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        AppLovinAdViewEventListener.this.adOpenedFullscreen(C2053j.m5006b(appLovinAd), appLovinAdView);
                    } catch (Throwable th) {
                        if (C2102v.m5104a()) {
                            C2102v.m5106c("ListenerCallbackInvoker", "Unable to notify ad event listener about fullscreen opened event", th);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m4979a(final AppLovinAdViewEventListener appLovinAdViewEventListener, final AppLovinAd appLovinAd, final AppLovinAdView appLovinAdView, final AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode) {
        if (appLovinAd != null && appLovinAdViewEventListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        AppLovinAdViewEventListener.this.adFailedToDisplay(C2053j.m5006b(appLovinAd), appLovinAdView, appLovinAdViewDisplayErrorCode);
                    } catch (Throwable th) {
                        if (C2102v.m5104a()) {
                            C2102v.m5106c("ListenerCallbackInvoker", "Unable to notify ad event listener about display failed event", th);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m4980a(final AppLovinNativeAdEventListener appLovinNativeAdEventListener, final AppLovinNativeAd appLovinNativeAd) {
        if (appLovinNativeAdEventListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        AppLovinNativeAdEventListener.this.onNativeAdClicked(appLovinNativeAd);
                    } catch (Throwable th) {
                        if (C2102v.m5104a()) {
                            C2102v.m5106c("ListenerCallbackInvoker", "Unable to notify native ad event listener about ad click", th);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m4981a(final AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, final int i) {
        if (appLovinNativeAdLoadListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        AppLovinNativeAdLoadListener.this.onNativeAdLoadFailed(i);
                    } catch (Throwable th) {
                        if (C2102v.m5104a()) {
                            C2102v.m5106c("ListenerCallbackInvoker", "Unable to notify native ad event listener about ad failing to load", th);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m4982a(MaxAdListener maxAdListener, MaxAd maxAd) {
        m4987a(maxAdListener, maxAd, false);
    }

    /* renamed from: a */
    public static void m4983a(MaxAdListener maxAdListener, MaxAd maxAd, MaxError maxError) {
        m4984a(maxAdListener, maxAd, maxError, false);
    }

    /* renamed from: a */
    public static void m4984a(final MaxAdListener maxAdListener, final MaxAd maxAd, final MaxError maxError, boolean z) {
        if (maxAd != null && maxAdListener != null) {
            AppLovinSdkUtils.runOnUiThread(z, new Runnable() {
                public void run() {
                    try {
                        MaxAdListener.this.onAdDisplayFailed(maxAd, maxError);
                    } catch (Throwable th) {
                        if (C2102v.m5104a()) {
                            C2102v.m5106c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad failing to display", th);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m4985a(MaxAdListener maxAdListener, MaxAd maxAd, MaxReward maxReward) {
        m4986a(maxAdListener, maxAd, maxReward, false);
    }

    /* renamed from: a */
    public static void m4986a(final MaxAdListener maxAdListener, final MaxAd maxAd, final MaxReward maxReward, boolean z) {
        if (maxAd != null && (maxAdListener instanceof MaxRewardedAdListener)) {
            AppLovinSdkUtils.runOnUiThread(z, new Runnable() {
                public void run() {
                    try {
                        ((MaxRewardedAdListener) MaxAdListener.this).onUserRewarded(maxAd, maxReward);
                    } catch (Throwable th) {
                        if (C2102v.m5104a()) {
                            C2102v.m5106c("ListenerCallbackInvoker", "Unable to notify ad event listener about user being rewarded", th);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m4987a(final MaxAdListener maxAdListener, final MaxAd maxAd, boolean z) {
        if (maxAd != null && maxAdListener != null) {
            AppLovinSdkUtils.runOnUiThread(z, new Runnable() {
                public void run() {
                    try {
                        MaxAdListener.this.onAdLoaded(maxAd);
                    } catch (Throwable th) {
                        if (C2102v.m5104a()) {
                            C2102v.m5106c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being loaded", th);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m4988a(MaxAdListener maxAdListener, String str, MaxError maxError) {
        m4989a(maxAdListener, str, maxError, false);
    }

    /* renamed from: a */
    public static void m4989a(final MaxAdListener maxAdListener, final String str, final MaxError maxError, boolean z) {
        if (str != null && maxAdListener != null) {
            AppLovinSdkUtils.runOnUiThread(z, new Runnable() {
                public void run() {
                    try {
                        MaxAdListener.this.onAdLoadFailed(str, maxError);
                    } catch (Throwable th) {
                        if (C2102v.m5104a()) {
                            C2102v.m5106c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad failing to load", th);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m4990a(MaxAdRevenueListener maxAdRevenueListener, MaxAd maxAd) {
        m4991a(maxAdRevenueListener, maxAd, false);
    }

    /* renamed from: a */
    public static void m4991a(final MaxAdRevenueListener maxAdRevenueListener, final MaxAd maxAd, boolean z) {
        if (maxAd != null && maxAdRevenueListener != null) {
            AppLovinSdkUtils.runOnUiThread(z, new Runnable() {
                public void run() {
                    try {
                        MaxAdRevenueListener.this.onAdRevenuePaid(maxAd);
                    } catch (Throwable th) {
                        if (C2102v.m5104a()) {
                            C2102v.m5106c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad revenue being paid", th);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m4992a(MaxAdReviewListener maxAdReviewListener, String str, MaxAd maxAd) {
        m4993a(maxAdReviewListener, str, maxAd, false);
    }

    /* renamed from: a */
    public static void m4993a(final MaxAdReviewListener maxAdReviewListener, final String str, final MaxAd maxAd, boolean z) {
        if (maxAdReviewListener != null) {
            AppLovinSdkUtils.runOnUiThread(z, new Runnable() {
                public void run() {
                    try {
                        MaxAdReviewListener.this.onCreativeIdGenerated(str, maxAd);
                    } catch (Throwable th) {
                        if (C2102v.m5104a()) {
                            C2102v.m5106c("ListenerCallbackInvoker", "Unable to notify Ad Review creative id generated", th);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m4994a(final MaxNativeAdListener maxNativeAdListener, final MaxAd maxAd, boolean z) {
        if (maxAd != null && maxNativeAdListener != null) {
            AppLovinSdkUtils.runOnUiThread(z, new Runnable() {
                public void run() {
                    try {
                        MaxNativeAdListener.this.onNativeAdClicked(maxAd);
                    } catch (Throwable th) {
                        if (C2102v.m5104a()) {
                            C2102v.m5106c("ListenerCallbackInvoker", "Unable to notify ad event listener about native ad being clicked", th);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m4995a(final MaxNativeAdListener maxNativeAdListener, final MaxNativeAdView maxNativeAdView, final MaxAd maxAd, boolean z) {
        if (maxAd != null && maxNativeAdListener != null) {
            AppLovinSdkUtils.runOnUiThread(z, new Runnable() {
                public void run() {
                    try {
                        MaxNativeAdListener.this.onNativeAdLoaded(maxNativeAdView, maxAd);
                    } catch (Throwable th) {
                        if (C2102v.m5104a()) {
                            C2102v.m5106c("ListenerCallbackInvoker", "Unable to notify ad event listener about native ad being loaded", th);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m4996a(final MaxNativeAdListener maxNativeAdListener, final String str, final MaxError maxError, boolean z) {
        if (str != null && maxNativeAdListener != null) {
            AppLovinSdkUtils.runOnUiThread(z, new Runnable() {
                public void run() {
                    try {
                        MaxNativeAdListener.this.onNativeAdLoadFailed(str, maxError);
                    } catch (Throwable th) {
                        if (C2102v.m5104a()) {
                            C2102v.m5106c("ListenerCallbackInvoker", "Unable to notify ad event listener about native ad failing to load", th);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m4997a(final AppLovinAdClickListener appLovinAdClickListener, final AppLovinAd appLovinAd) {
        if (appLovinAd != null && appLovinAdClickListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        AppLovinAdClickListener.this.adClicked(C2053j.m5006b(appLovinAd));
                    } catch (Throwable th) {
                        if (C2102v.m5104a()) {
                            C2102v.m5106c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being clicked", th);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m4998a(final AppLovinAdDisplayListener appLovinAdDisplayListener, final AppLovinAd appLovinAd) {
        if (appLovinAd != null && appLovinAdDisplayListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        AppLovinAdDisplayListener.this.adDisplayed(C2053j.m5006b(appLovinAd));
                    } catch (Throwable th) {
                        if (C2102v.m5104a()) {
                            C2102v.m5106c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being displayed", th);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m4999a(final AppLovinAdDisplayListener appLovinAdDisplayListener, final String str) {
        if (appLovinAdDisplayListener instanceof C1846g) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    ((C1846g) AppLovinAdDisplayListener.this).onAdDisplayFailed(str);
                }
            });
        }
    }

    /* renamed from: a */
    public static void m5000a(final AppLovinAdRewardListener appLovinAdRewardListener, final AppLovinAd appLovinAd, final int i) {
        if (appLovinAd != null && appLovinAdRewardListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        AppLovinAdRewardListener.this.validationRequestFailed(C2053j.m5006b(appLovinAd), i);
                    } catch (Throwable th) {
                        if (C2102v.m5104a()) {
                            C2102v.m5106c("ListenerCallbackInvoker", "Unable to notify ad reward listener about reward validation request failing", th);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m5001a(final AppLovinAdRewardListener appLovinAdRewardListener, final AppLovinAd appLovinAd, final Map<String, String> map) {
        if (appLovinAd != null && appLovinAdRewardListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        AppLovinAdRewardListener.this.userRewardVerified(C2053j.m5006b(appLovinAd), map);
                    } catch (Throwable th) {
                        if (C2102v.m5104a()) {
                            C2102v.m5106c("ListenerCallbackInvoker", "Unable to notify ad reward listener about successful reward validation request", th);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m5002a(final AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, final AppLovinAd appLovinAd) {
        if (appLovinAd != null && appLovinAdVideoPlaybackListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        AppLovinAdVideoPlaybackListener.this.videoPlaybackBegan(C2053j.m5006b(appLovinAd));
                    } catch (Throwable th) {
                        if (C2102v.m5104a()) {
                            C2102v.m5106c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad playback began", th);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m5003a(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAd appLovinAd, double d, boolean z) {
        if (appLovinAd != null && appLovinAdVideoPlaybackListener != null) {
            final AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener2 = appLovinAdVideoPlaybackListener;
            final AppLovinAd appLovinAd2 = appLovinAd;
            final double d2 = d;
            final boolean z2 = z;
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        AppLovinAdVideoPlaybackListener.this.videoPlaybackEnded(C2053j.m5006b(appLovinAd2), d2, z2);
                    } catch (Throwable th) {
                        if (C2102v.m5104a()) {
                            C2102v.m5106c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad playback ended", th);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m5004a(final AppLovinPostbackListener appLovinPostbackListener, final String str) {
        if (appLovinPostbackListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        AppLovinPostbackListener.this.onPostbackSuccess(str);
                    } catch (Throwable th) {
                        if (C2102v.m5104a()) {
                            C2102v.m5106c("ListenerCallbackInvoker", "Unable to notify AppLovinPostbackListener about postback URL (" + str + ") executed", th);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m5005a(final AppLovinPostbackListener appLovinPostbackListener, final String str, final int i) {
        if (appLovinPostbackListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        AppLovinPostbackListener.this.onPostbackFailure(str, i);
                    } catch (Throwable th) {
                        if (C2102v.m5104a()) {
                            C2102v.m5106c("ListenerCallbackInvoker", "Unable to notify AppLovinPostbackListener about postback URL (" + str + ") failing to execute with error code (" + i + "):", th);
                        }
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static AppLovinAd m5006b(AppLovinAd appLovinAd) {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        return appLovinAdImpl.getDummyAd() != null ? appLovinAdImpl.getDummyAd() : appLovinAd;
    }

    /* renamed from: b */
    public static void m5007b(final AppLovinAdViewEventListener appLovinAdViewEventListener, final AppLovinAd appLovinAd, final AppLovinAdView appLovinAdView) {
        if (appLovinAd != null && appLovinAdViewEventListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        AppLovinAdViewEventListener.this.adClosedFullscreen(C2053j.m5006b(appLovinAd), appLovinAdView);
                    } catch (Throwable th) {
                        if (C2102v.m5104a()) {
                            C2102v.m5106c("ListenerCallbackInvoker", "Unable to notify ad event listener about fullscreen closed event", th);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public static void m5008b(MaxAdListener maxAdListener, MaxAd maxAd) {
        m5009b(maxAdListener, maxAd, false);
    }

    /* renamed from: b */
    public static void m5009b(final MaxAdListener maxAdListener, final MaxAd maxAd, boolean z) {
        if (maxAd != null && maxAdListener != null) {
            AppLovinSdkUtils.runOnUiThread(z, new Runnable() {
                public void run() {
                    try {
                        MaxAdListener.this.onAdDisplayed(maxAd);
                    } catch (Throwable th) {
                        if (C2102v.m5104a()) {
                            C2102v.m5106c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being displayed", th);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public static void m5010b(final AppLovinAdDisplayListener appLovinAdDisplayListener, final AppLovinAd appLovinAd) {
        if (appLovinAd != null && appLovinAdDisplayListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        AppLovinAdDisplayListener.this.adHidden(C2053j.m5006b(appLovinAd));
                    } catch (Throwable th) {
                        if (C2102v.m5104a()) {
                            C2102v.m5106c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being hidden", th);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public static void m5011b(final AppLovinAdRewardListener appLovinAdRewardListener, final AppLovinAd appLovinAd, final Map<String, String> map) {
        if (appLovinAd != null && appLovinAdRewardListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        AppLovinAdRewardListener.this.userOverQuota(C2053j.m5006b(appLovinAd), map);
                    } catch (Throwable th) {
                        if (C2102v.m5104a()) {
                            C2102v.m5106c("ListenerCallbackInvoker", "Unable to notify ad reward listener about exceeding quota", th);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: c */
    public static void m5012c(final AppLovinAdViewEventListener appLovinAdViewEventListener, final AppLovinAd appLovinAd, final AppLovinAdView appLovinAdView) {
        if (appLovinAd != null && appLovinAdViewEventListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        AppLovinAdViewEventListener.this.adLeftApplication(C2053j.m5006b(appLovinAd), appLovinAdView);
                    } catch (Throwable th) {
                        if (C2102v.m5104a()) {
                            C2102v.m5106c("ListenerCallbackInvoker", "Unable to notify ad event listener about application leave event", th);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: c */
    public static void m5013c(MaxAdListener maxAdListener, MaxAd maxAd) {
        m5014c(maxAdListener, maxAd, false);
    }

    /* renamed from: c */
    public static void m5014c(final MaxAdListener maxAdListener, final MaxAd maxAd, boolean z) {
        if (maxAd != null && maxAdListener != null) {
            AppLovinSdkUtils.runOnUiThread(z, new Runnable() {
                public void run() {
                    try {
                        MaxAdListener.this.onAdHidden(maxAd);
                    } catch (Throwable th) {
                        if (C2102v.m5104a()) {
                            C2102v.m5106c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being hidden", th);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: c */
    public static void m5015c(final AppLovinAdRewardListener appLovinAdRewardListener, final AppLovinAd appLovinAd, final Map<String, String> map) {
        if (appLovinAd != null && appLovinAdRewardListener != null) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    try {
                        AppLovinAdRewardListener.this.userRewardRejected(C2053j.m5006b(appLovinAd), map);
                    } catch (Throwable th) {
                        if (C2102v.m5104a()) {
                            C2102v.m5106c("ListenerCallbackInvoker", "Unable to notify ad reward listener about reward validation request being rejected", th);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: d */
    public static void m5016d(MaxAdListener maxAdListener, MaxAd maxAd) {
        m5017d(maxAdListener, maxAd, false);
    }

    /* renamed from: d */
    public static void m5017d(final MaxAdListener maxAdListener, final MaxAd maxAd, boolean z) {
        if (maxAd != null && maxAdListener != null) {
            AppLovinSdkUtils.runOnUiThread(z, new Runnable() {
                public void run() {
                    try {
                        MaxAdListener.this.onAdClicked(maxAd);
                    } catch (Throwable th) {
                        if (C2102v.m5104a()) {
                            C2102v.m5106c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being clicked", th);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: e */
    public static void m5018e(MaxAdListener maxAdListener, MaxAd maxAd) {
        m5019e(maxAdListener, maxAd, false);
    }

    /* renamed from: e */
    public static void m5019e(final MaxAdListener maxAdListener, final MaxAd maxAd, boolean z) {
        if (maxAd != null && (maxAdListener instanceof MaxRewardedAdListener)) {
            AppLovinSdkUtils.runOnUiThread(z, new Runnable() {
                public void run() {
                    try {
                        ((MaxRewardedAdListener) MaxAdListener.this).onRewardedVideoStarted(maxAd);
                    } catch (Throwable th) {
                        if (C2102v.m5104a()) {
                            C2102v.m5106c("ListenerCallbackInvoker", "Unable to notify ad event listener about rewarded video starting", th);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: f */
    public static void m5020f(MaxAdListener maxAdListener, MaxAd maxAd) {
        m5021f(maxAdListener, maxAd, false);
    }

    /* renamed from: f */
    public static void m5021f(final MaxAdListener maxAdListener, final MaxAd maxAd, boolean z) {
        if (maxAd != null && (maxAdListener instanceof MaxRewardedAdListener)) {
            AppLovinSdkUtils.runOnUiThread(z, new Runnable() {
                public void run() {
                    try {
                        ((MaxRewardedAdListener) MaxAdListener.this).onRewardedVideoCompleted(maxAd);
                    } catch (Throwable th) {
                        if (C2102v.m5104a()) {
                            C2102v.m5106c("ListenerCallbackInvoker", "Unable to notify ad event listener about rewarded video completing", th);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: g */
    public static void m5022g(MaxAdListener maxAdListener, MaxAd maxAd) {
        m5023g(maxAdListener, maxAd, false);
    }

    /* renamed from: g */
    public static void m5023g(final MaxAdListener maxAdListener, final MaxAd maxAd, boolean z) {
        if (maxAd != null && (maxAdListener instanceof MaxAdViewAdListener)) {
            AppLovinSdkUtils.runOnUiThread(z, new Runnable() {
                public void run() {
                    try {
                        ((MaxAdViewAdListener) MaxAdListener.this).onAdExpanded(maxAd);
                    } catch (Throwable th) {
                        if (C2102v.m5104a()) {
                            C2102v.m5106c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being expanded", th);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: h */
    public static void m5024h(MaxAdListener maxAdListener, MaxAd maxAd) {
        m5025h(maxAdListener, maxAd, false);
    }

    /* renamed from: h */
    public static void m5025h(final MaxAdListener maxAdListener, final MaxAd maxAd, boolean z) {
        if (maxAd != null && (maxAdListener instanceof MaxAdViewAdListener)) {
            AppLovinSdkUtils.runOnUiThread(z, new Runnable() {
                public void run() {
                    try {
                        ((MaxAdViewAdListener) MaxAdListener.this).onAdCollapsed(maxAd);
                    } catch (Throwable th) {
                        if (C2102v.m5104a()) {
                            C2102v.m5106c("ListenerCallbackInvoker", "Unable to notify ad event listener about ad being collapsed", th);
                        }
                    }
                }
            });
        }
    }
}
