package com.applovin.impl.mediation.debugger.p041ui.testmode;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.mediation.debugger.p036a.C1661a;
import com.applovin.impl.mediation.debugger.p037b.p039b.C1671b;
import com.applovin.impl.mediation.debugger.p041ui.C1678a;
import com.applovin.impl.mediation.debugger.p041ui.testmode.AdControlButton;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.mediation.ads.MaxRewardedAd;
import com.applovin.mediation.ads.MaxRewardedInterstitialAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.C2271R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.applovin.impl.mediation.debugger.ui.testmode.a */
public class C1732a extends C1678a implements C1661a.C1662a, AdControlButton.C1730a, MaxAdRevenueListener, MaxAdViewAdListener, MaxRewardedAdListener {

    /* renamed from: a */
    private C1671b f2633a;

    /* renamed from: b */
    private C1969m f2634b;

    /* renamed from: c */
    private MaxAdView f2635c;

    /* renamed from: d */
    private MaxAdView f2636d;

    /* renamed from: e */
    private MaxInterstitialAd f2637e;

    /* renamed from: f */
    private MaxRewardedInterstitialAd f2638f;

    /* renamed from: g */
    private MaxRewardedAd f2639g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public MaxAd f2640h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public MaxNativeAdLoader f2641i;

    /* renamed from: j */
    private String f2642j;

    /* renamed from: k */
    private AdControlButton f2643k;

    /* renamed from: l */
    private AdControlButton f2644l;

    /* renamed from: m */
    private AdControlButton f2645m;

    /* renamed from: n */
    private AdControlButton f2646n;

    /* renamed from: o */
    private AdControlButton f2647o;

    /* renamed from: p */
    private AdControlButton f2648p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public Button f2649q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public Button f2650r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public FrameLayout f2651s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public FrameLayout f2652t;

    /* renamed from: u */
    private Map<MaxAdFormat, C1661a> f2653u;

    /* renamed from: a */
    private AdControlButton m3664a(String str) {
        if (str.equals("test_mode_banner") || str.equals("test_mode_leader")) {
            return this.f2643k;
        }
        if (str.equals("test_mode_mrec")) {
            return this.f2644l;
        }
        if (str.equals("test_mode_interstitial")) {
            return this.f2645m;
        }
        if (str.equals("test_mode_rewarded_interstitial")) {
            return this.f2646n;
        }
        if (str.equals(this.f2642j)) {
            return this.f2647o;
        }
        if (str.equals("test_mode_native")) {
            return this.f2648p;
        }
        throw new IllegalArgumentException("Invalid test mode ad unit identifier provided " + str);
    }

    /* renamed from: a */
    private void m3666a() {
        String str;
        MaxAdFormat maxAdFormat;
        boolean isTablet = AppLovinSdkUtils.isTablet(this);
        FrameLayout frameLayout = (FrameLayout) findViewById(C2271R.C2273id.banner_ad_view_container);
        if (isTablet) {
            maxAdFormat = MaxAdFormat.LEADER;
            ((TextView) findViewById(C2271R.C2273id.banner_label)).setText("Leader");
            str = "test_mode_leader";
        } else {
            maxAdFormat = MaxAdFormat.BANNER;
            str = "test_mode_banner";
        }
        if (this.f2633a.mo13667p().contains(maxAdFormat)) {
            MaxAdView maxAdView = new MaxAdView(str, maxAdFormat, this.f2634b.mo14532Y(), this);
            this.f2635c = maxAdView;
            maxAdView.setListener(this);
            frameLayout.addView(this.f2635c, new FrameLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getWidth()), AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getHeight())));
            AdControlButton adControlButton = (AdControlButton) findViewById(C2271R.C2273id.banner_control_button);
            this.f2643k = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f2643k.setFormat(maxAdFormat);
            return;
        }
        findViewById(C2271R.C2273id.banner_control_view).setVisibility(8);
        frameLayout.setVisibility(8);
    }

    /* renamed from: a */
    private void m3667a(MaxAdFormat maxAdFormat) {
        MaxAdView maxAdView;
        this.f2634b.mo14518J().mo13803a(this.f2633a.mo13659h());
        if (MaxAdFormat.BANNER == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            maxAdView = this.f2635c;
        } else if (MaxAdFormat.MREC == maxAdFormat) {
            maxAdView = this.f2636d;
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f2637e.loadAd();
            return;
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.f2638f.loadAd();
            return;
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f2639g.loadAd();
            return;
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f2641i.loadAd();
            return;
        } else {
            return;
        }
        maxAdView.loadAd();
    }

    /* renamed from: b */
    private void m3669b() {
        this.f2651s = (FrameLayout) findViewById(C2271R.C2273id.mrec_ad_view_container);
        if (this.f2633a.mo13667p().contains(MaxAdFormat.MREC)) {
            MaxAdView maxAdView = new MaxAdView("test_mode_mrec", MaxAdFormat.MREC, this.f2634b.mo14532Y(), this);
            this.f2636d = maxAdView;
            maxAdView.setListener(this);
            this.f2651s.addView(this.f2636d, new FrameLayout.LayoutParams(-1, -1));
            AdControlButton adControlButton = (AdControlButton) findViewById(C2271R.C2273id.mrec_control_button);
            this.f2644l = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f2644l.setFormat(MaxAdFormat.MREC);
            return;
        }
        findViewById(C2271R.C2273id.mrec_control_view).setVisibility(8);
        this.f2651s.setVisibility(8);
    }

    /* renamed from: b */
    private void m3670b(MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f2637e.showAd();
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.f2638f.showAd();
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f2639g.showAd();
        }
    }

    /* renamed from: c */
    private void m3672c() {
        if (this.f2633a.mo13667p().contains(MaxAdFormat.INTERSTITIAL)) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd("test_mode_interstitial", this.f2634b.mo14532Y(), this);
            this.f2637e = maxInterstitialAd;
            maxInterstitialAd.setListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(C2271R.C2273id.interstitial_control_button);
            this.f2645m = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f2645m.setFormat(MaxAdFormat.INTERSTITIAL);
            return;
        }
        findViewById(C2271R.C2273id.interstitial_control_view).setVisibility(8);
    }

    /* renamed from: d */
    private void m3674d() {
        if (this.f2633a.mo13667p().contains(MaxAdFormat.REWARDED)) {
            String str = "test_mode_rewarded_" + this.f2633a.mo13659h();
            this.f2642j = str;
            MaxRewardedAd instance = MaxRewardedAd.getInstance(str, this.f2634b.mo14532Y(), this);
            this.f2639g = instance;
            instance.setListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(C2271R.C2273id.rewarded_control_button);
            this.f2647o = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f2647o.setFormat(MaxAdFormat.REWARDED);
            return;
        }
        findViewById(C2271R.C2273id.rewarded_control_view).setVisibility(8);
    }

    /* renamed from: e */
    private void m3676e() {
        this.f2652t = (FrameLayout) findViewById(C2271R.C2273id.native_ad_view_container);
        if (this.f2633a.mo13668q()) {
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader("test_mode_native", this.f2634b.mo14532Y(), this);
            this.f2641i = maxNativeAdLoader;
            maxNativeAdLoader.setNativeAdListener(new MaxNativeAdListener() {
                public void onNativeAdClicked(MaxAd maxAd) {
                    C1732a.this.onAdClicked(maxAd);
                }

                public void onNativeAdLoadFailed(String str, MaxError maxError) {
                    C1732a.this.onAdLoadFailed(str, maxError);
                }

                public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
                    if (C1732a.this.f2640h != null) {
                        C1732a.this.f2641i.destroy(C1732a.this.f2640h);
                    }
                    MaxAd unused = C1732a.this.f2640h = maxAd;
                    C1732a.this.f2652t.removeAllViews();
                    C1732a.this.f2652t.addView(maxNativeAdView);
                    C1732a.this.onAdLoaded(maxAd);
                }
            });
            this.f2641i.setRevenueListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(C2271R.C2273id.native_control_button);
            this.f2648p = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f2648p.setFormat(MaxAdFormat.NATIVE);
            return;
        }
        findViewById(C2271R.C2273id.native_control_view).setVisibility(8);
        this.f2652t.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public C1969m getSdk() {
        return this.f2634b;
    }

    public void initialize(C1671b bVar) {
        this.f2633a = bVar;
        this.f2634b = bVar.mo13674v();
    }

    public void onAdClicked(MaxAd maxAd) {
        Utils.showToast("onAdClicked", maxAd, this);
    }

    public void onAdCollapsed(MaxAd maxAd) {
        Utils.showToast("onAdCollapsed", maxAd, this);
    }

    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        m3664a(maxAd.getAdUnitId()).setControlState(AdControlButton.C1731b.LOAD);
        Utils.showAlert("Failed to display " + maxAd.getFormat().getDisplayName(), "MAX Error\nCode: " + maxError.getCode() + "\nMessage: " + maxError.getMessage() + "\n\n" + maxAd.getNetworkName() + " Display Error\nCode: " + maxError.getMediatedNetworkErrorCode() + "\nMessage: " + maxError.getMediatedNetworkErrorMessage(), this);
    }

    public void onAdDisplayed(MaxAd maxAd) {
        Utils.showToast("onAdDisplayed", maxAd, this);
    }

    public void onAdExpanded(MaxAd maxAd) {
        Utils.showToast("onAdExpanded", maxAd, this);
    }

    public void onAdHidden(MaxAd maxAd) {
        Utils.showToast("onAdHidden", maxAd, this);
    }

    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        MaxAdView maxAdView;
        if (MaxAdFormat.BANNER == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            maxAdView = this.f2635c;
        } else if (MaxAdFormat.MREC == maxAdFormat) {
            maxAdView = this.f2636d;
        } else {
            if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
                this.f2637e.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
                this.f2638f.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.REWARDED == maxAdFormat) {
                this.f2639g.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.NATIVE == maxAdFormat) {
                this.f2641i.setLocalExtraParameter("amazon_ad_error", adError);
            }
            m3667a(maxAdFormat);
        }
        maxAdView.setLocalExtraParameter("amazon_ad_error", adError);
        m3667a(maxAdFormat);
    }

    public void onAdLoadFailed(String str, MaxError maxError) {
        AdControlButton a = m3664a(str);
        a.setControlState(AdControlButton.C1731b.LOAD);
        Utils.showAlert("", "Failed to load " + a.getFormat().getLabel() + " with error code: " + maxError.getCode(), this);
    }

    public void onAdLoaded(MaxAd maxAd) {
        m3664a(maxAd.getAdUnitId()).setControlState((maxAd.getFormat().isAdViewAd() || maxAd.getFormat().equals(MaxAdFormat.NATIVE)) ? AdControlButton.C1731b.LOAD : AdControlButton.C1731b.SHOW);
    }

    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        MaxAdView maxAdView;
        if (MaxAdFormat.BANNER == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            maxAdView = this.f2635c;
        } else if (MaxAdFormat.MREC == maxAdFormat) {
            maxAdView = this.f2636d;
        } else {
            if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
                this.f2637e.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
                this.f2638f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            } else if (MaxAdFormat.REWARDED == maxAdFormat) {
                this.f2639g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            } else if (MaxAdFormat.NATIVE == maxAdFormat) {
                this.f2641i.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            }
            m3667a(maxAdFormat);
        }
        maxAdView.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        m3667a(maxAdFormat);
    }

    public void onAdRevenuePaid(MaxAd maxAd) {
        Utils.showToast("onAdRevenuePaid", maxAd, this);
    }

    public void onClick(AdControlButton adControlButton) {
        MaxAdFormat format = adControlButton.getFormat();
        if (AdControlButton.C1731b.LOAD == adControlButton.getControlState()) {
            adControlButton.setControlState(AdControlButton.C1731b.LOADING);
            Map<MaxAdFormat, C1661a> map = this.f2653u;
            if (map == null || map.get(format) == null) {
                m3667a(format);
            } else {
                this.f2653u.get(format).mo13617a();
            }
        } else if (AdControlButton.C1731b.SHOW == adControlButton.getControlState()) {
            adControlButton.setControlState(AdControlButton.C1731b.LOAD);
            m3670b(format);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f2633a == null) {
            C2102v.m5110i("MaxDebuggerMultiAdActivity", "Failed to initialize activity with a network model.");
            return;
        }
        setContentView(C2271R.layout.mediation_debugger_multi_ad_activity);
        setTitle(this.f2633a.mo13660i() + " Test Ads");
        m3666a();
        m3669b();
        m3672c();
        m3674d();
        m3676e();
        findViewById(C2271R.C2273id.rewarded_interstitial_control_view).setVisibility(8);
        this.f2649q = (Button) findViewById(C2271R.C2273id.show_mrec_button);
        this.f2650r = (Button) findViewById(C2271R.C2273id.show_native_button);
        if (!this.f2633a.mo13668q() || !this.f2633a.mo13667p().contains(MaxAdFormat.MREC)) {
            this.f2649q.setVisibility(8);
            this.f2650r.setVisibility(8);
        } else {
            this.f2652t.setVisibility(8);
            this.f2649q.setBackgroundColor(-1);
            this.f2650r.setBackgroundColor(-3355444);
            this.f2649q.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    C1732a.this.f2651s.setVisibility(0);
                    C1732a.this.f2652t.setVisibility(8);
                    C1732a.this.f2649q.setBackgroundColor(-1);
                    C1732a.this.f2650r.setBackgroundColor(-3355444);
                }
            });
            this.f2650r.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    C1732a.this.f2652t.setVisibility(0);
                    C1732a.this.f2651s.setVisibility(8);
                    C1732a.this.f2650r.setBackgroundColor(-1);
                    C1732a.this.f2649q.setBackgroundColor(-3355444);
                }
            });
        }
        if (StringUtils.isValidString(this.f2633a.mo13677y()) && this.f2633a.mo13678z() != null && this.f2633a.mo13678z().size() > 0) {
            AdRegistration.getInstance(this.f2633a.mo13677y(), this);
            AdRegistration.enableTesting(true);
            AdRegistration.enableLogging(true);
            HashMap hashMap = new HashMap(this.f2633a.mo13678z().size());
            for (MaxAdFormat next : this.f2633a.mo13678z().keySet()) {
                hashMap.put(next, new C1661a(this.f2633a.mo13678z().get(next), next, (C1661a.C1662a) this));
            }
            this.f2653u = hashMap;
        }
        try {
            setRequestedOrientation(7);
        } catch (Throwable th) {
            C2102v.m5106c("AppLovinSdk", "Failed to set portrait orientation", th);
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        MaxAd maxAd;
        super.onDestroy();
        this.f2634b.mo14518J().mo13803a((String) null);
        MaxAdView maxAdView = this.f2635c;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxAdView maxAdView2 = this.f2636d;
        if (maxAdView2 != null) {
            maxAdView2.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.f2637e;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.f2639g;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        MaxNativeAdLoader maxNativeAdLoader = this.f2641i;
        if (maxNativeAdLoader != null && (maxAd = this.f2640h) != null) {
            maxNativeAdLoader.destroy(maxAd);
        }
    }

    public void onRewardedVideoCompleted(MaxAd maxAd) {
        Utils.showToast("onRewardedVideoCompleted", maxAd, this);
    }

    public void onRewardedVideoStarted(MaxAd maxAd) {
        Utils.showToast("onRewardedVideoStarted", maxAd, this);
    }

    public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        Utils.showToast("onUserRewarded", maxAd, this);
    }
}
