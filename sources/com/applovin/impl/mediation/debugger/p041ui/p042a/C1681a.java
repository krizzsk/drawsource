package com.applovin.impl.mediation.debugger.p041ui.p042a;

import android.content.DialogInterface;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.mediation.debugger.p036a.C1661a;
import com.applovin.impl.mediation.debugger.p036a.C1663b;
import com.applovin.impl.mediation.debugger.p037b.p038a.C1665a;
import com.applovin.impl.mediation.debugger.p037b.p038a.C1666b;
import com.applovin.impl.mediation.debugger.p041ui.C1678a;
import com.applovin.impl.mediation.debugger.p041ui.p042a.C1687b;
import com.applovin.impl.mediation.debugger.p041ui.p046d.C1715a;
import com.applovin.impl.mediation.debugger.p041ui.p046d.C1717c;
import com.applovin.impl.mediation.debugger.p041ui.p046d.C1721d;
import com.applovin.impl.mediation.debugger.p041ui.testmode.AdControlButton;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
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
import java.util.List;

/* renamed from: com.applovin.impl.mediation.debugger.ui.a.a */
public class C1681a extends C1678a implements C1661a.C1662a, AdControlButton.C1730a, MaxAdRevenueListener, MaxAdViewAdListener, MaxRewardedAdListener {

    /* renamed from: a */
    private C1969m f2433a;

    /* renamed from: b */
    private C1665a f2434b;

    /* renamed from: c */
    private C1687b f2435c;

    /* renamed from: d */
    private C1666b f2436d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public MaxAdView f2437e;

    /* renamed from: f */
    private MaxInterstitialAd f2438f;

    /* renamed from: g */
    private MaxRewardedInterstitialAd f2439g;

    /* renamed from: h */
    private MaxRewardedAd f2440h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public MaxNativeAdView f2441i;

    /* renamed from: j */
    private MaxNativeAdLoader f2442j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C1694d f2443k;

    /* renamed from: l */
    private ListView f2444l;

    /* renamed from: m */
    private View f2445m;

    /* renamed from: n */
    private AdControlButton f2446n;

    /* renamed from: o */
    private TextView f2447o;

    /* renamed from: p */
    private C1661a f2448p;

    /* renamed from: a */
    private void m3483a() {
        String a = this.f2434b.mo13622a();
        if (this.f2434b.mo13626d().isAdViewAd()) {
            MaxAdView maxAdView = new MaxAdView(a, this.f2434b.mo13626d(), this.f2433a.mo14532Y(), this);
            this.f2437e = maxAdView;
            maxAdView.setListener(this);
        } else if (MaxAdFormat.INTERSTITIAL == this.f2434b.mo13626d()) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd(a, this.f2433a.mo14532Y(), this);
            this.f2438f = maxInterstitialAd;
            maxInterstitialAd.setListener(this);
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == this.f2434b.mo13626d()) {
            MaxRewardedInterstitialAd maxRewardedInterstitialAd = new MaxRewardedInterstitialAd(a, this.f2433a.mo14532Y(), this);
            this.f2439g = maxRewardedInterstitialAd;
            maxRewardedInterstitialAd.setListener(this);
        } else if (MaxAdFormat.REWARDED == this.f2434b.mo13626d()) {
            MaxRewardedAd instance = MaxRewardedAd.getInstance(a, this.f2433a.mo14532Y(), this);
            this.f2440h = instance;
            instance.setListener(this);
        } else if (MaxAdFormat.NATIVE == this.f2434b.mo13626d()) {
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(a, this.f2433a.mo14532Y(), this);
            this.f2442j = maxNativeAdLoader;
            maxNativeAdLoader.setNativeAdListener(new MaxNativeAdListener() {
                public void onNativeAdClicked(MaxAd maxAd) {
                    C1681a.this.onAdClicked(maxAd);
                }

                public void onNativeAdLoadFailed(String str, MaxError maxError) {
                    C1681a.this.onAdLoadFailed(str, maxError);
                }

                public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
                    MaxNativeAdView unused = C1681a.this.f2441i = maxNativeAdView;
                    C1681a.this.onAdLoaded(maxAd);
                }
            });
            this.f2442j.setRevenueListener(this);
        }
    }

    /* renamed from: a */
    private void m3484a(final ViewGroup viewGroup, AppLovinSdkUtils.Size size, DialogInterface.OnShowListener onShowListener) {
        if (this.f2443k == null) {
            C1694d dVar = new C1694d(viewGroup, size, this);
            this.f2443k = dVar;
            dVar.setOnShowListener(onShowListener);
            this.f2443k.setOnDismissListener(new DialogInterface.OnDismissListener() {
                public void onDismiss(DialogInterface dialogInterface) {
                    ViewGroup viewGroup = viewGroup;
                    if (viewGroup instanceof MaxAdView) {
                        ((MaxAdView) viewGroup).stopAutoRefresh();
                    }
                    C1694d unused = C1681a.this.f2443k = null;
                }
            });
            this.f2443k.show();
        }
    }

    /* renamed from: a */
    private void m3486a(MaxAdFormat maxAdFormat) {
        if (this.f2436d != null) {
            this.f2433a.mo14518J().mo13803a(this.f2436d.mo13629a().mo13639a());
            this.f2433a.mo14518J().mo13805a(true);
        }
        if (maxAdFormat.isAdViewAd()) {
            this.f2437e.setPlacement("[Mediation Debugger Live Ad]");
            this.f2437e.loadAd();
        } else if (MaxAdFormat.INTERSTITIAL == this.f2434b.mo13626d()) {
            this.f2438f.loadAd();
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == this.f2434b.mo13626d()) {
            this.f2439g.loadAd();
        } else if (MaxAdFormat.REWARDED == this.f2434b.mo13626d()) {
            this.f2440h.loadAd();
        } else if (MaxAdFormat.NATIVE == this.f2434b.mo13626d()) {
            this.f2442j.setPlacement("[Mediation Debugger Live Ad]");
            this.f2442j.loadAd();
        } else {
            Utils.showToast("Live ads currently unavailable for ad format", this);
        }
    }

    /* renamed from: b */
    private void m3487b(MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            m3484a(this.f2437e, maxAdFormat.getSize(), new DialogInterface.OnShowListener() {
                public void onShow(DialogInterface dialogInterface) {
                    C1681a.this.f2437e.startAutoRefresh();
                }
            });
        } else if (MaxAdFormat.INTERSTITIAL == this.f2434b.mo13626d()) {
            this.f2438f.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == this.f2434b.mo13626d()) {
            this.f2439g.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.REWARDED == this.f2434b.mo13626d()) {
            this.f2440h.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.NATIVE == this.f2434b.mo13626d()) {
            m3484a(this.f2441i, MaxAdFormat.MREC.getSize(), (DialogInterface.OnShowListener) null);
        }
    }

    /* access modifiers changed from: protected */
    public C1969m getSdk() {
        return this.f2433a;
    }

    public void initialize(final C1665a aVar, C1666b bVar, final C1969m mVar) {
        this.f2433a = mVar;
        this.f2434b = aVar;
        this.f2436d = bVar;
        C1687b bVar2 = new C1687b(aVar, bVar, this);
        this.f2435c = bVar2;
        bVar2.mo13777a((C1721d.C1723a) new C1721d.C1723a() {
            /* renamed from: a */
            public void mo13699a(C1715a aVar, final C1717c cVar) {
                if (cVar instanceof C1687b.C1688a) {
                    C1681a.this.startActivity(MaxDebuggerAdUnitDetailActivity.class, mVar.mo14556af(), new C1678a.C1680a<MaxDebuggerAdUnitDetailActivity>() {
                        /* renamed from: a */
                        public void mo13696a(MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
                            maxDebuggerAdUnitDetailActivity.initialize(aVar, ((C1687b.C1688a) cVar).mo13708a(), mVar);
                        }
                    });
                }
            }
        });
        m3483a();
        List<C1663b> d = aVar.mo13627e().mo13637d();
        if (d != null && d.size() > 0) {
            if (bVar == null || bVar.mo13629a().mo13641c().mo13676x()) {
                this.f2448p = new C1661a(d, aVar.mo13626d(), (C1661a.C1662a) this);
            }
        }
    }

    public void onAdClicked(MaxAd maxAd) {
        Utils.showToast("onAdClicked", maxAd, this);
    }

    public void onAdCollapsed(MaxAd maxAd) {
        Utils.showToast("onAdCollapsed", maxAd, this);
    }

    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        this.f2446n.setControlState(AdControlButton.C1731b.LOAD);
        this.f2447o.setText("");
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
        if (maxAdFormat.isAdViewAd()) {
            this.f2437e.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f2438f.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.f2439g.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f2440h.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f2442j.setLocalExtraParameter("amazon_ad_error", adError);
        }
        m3486a(maxAdFormat);
    }

    public void onAdLoadFailed(String str, MaxError maxError) {
        this.f2446n.setControlState(AdControlButton.C1731b.LOAD);
        this.f2447o.setText("");
        if (204 == maxError.getCode()) {
            Utils.showAlert("No Fill", "No fills often happen in live environments. Please make sure to use the Mediation Debugger test mode before you go live.", this);
            return;
        }
        Utils.showAlert("", "Failed to load with error code: " + maxError.getCode(), this);
    }

    public void onAdLoaded(MaxAd maxAd) {
        TextView textView = this.f2447o;
        textView.setText(maxAd.getNetworkName() + " ad loaded");
        this.f2446n.setControlState(AdControlButton.C1731b.SHOW);
        if (maxAd.getFormat().isAdViewAd()) {
            m3484a(this.f2437e, maxAd.getFormat().getSize(), (DialogInterface.OnShowListener) null);
        } else if (MaxAdFormat.NATIVE == this.f2434b.mo13626d()) {
            m3484a(this.f2441i, MaxAdFormat.MREC.getSize(), (DialogInterface.OnShowListener) null);
        }
    }

    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.f2437e.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f2438f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.f2439g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f2440h.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f2442j.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        }
        m3486a(maxAdFormat);
    }

    public void onAdRevenuePaid(MaxAd maxAd) {
        Utils.showToast("onAdRevenuePaid", maxAd, this);
    }

    public void onClick(AdControlButton adControlButton) {
        if (this.f2433a.mo14518J().mo13806a()) {
            Utils.showAlert("Not Supported", "Ad loads are not supported while Test Mode is enabled. Please restart the app.", this);
            return;
        }
        MaxAdFormat d = this.f2434b.mo13626d();
        if (AdControlButton.C1731b.LOAD == adControlButton.getControlState()) {
            adControlButton.setControlState(AdControlButton.C1731b.LOADING);
            C1661a aVar = this.f2448p;
            if (aVar != null) {
                aVar.mo13617a();
            } else {
                m3486a(d);
            }
        } else if (AdControlButton.C1731b.SHOW == adControlButton.getControlState()) {
            if (!d.isAdViewAd() && d != MaxAdFormat.NATIVE) {
                adControlButton.setControlState(AdControlButton.C1731b.LOAD);
            }
            m3487b(d);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C2271R.layout.mediation_debugger_ad_unit_detail_activity);
        setTitle(this.f2435c.mo13704a());
        this.f2444l = (ListView) findViewById(C2271R.C2273id.listView);
        this.f2445m = findViewById(C2271R.C2273id.ad_presenter_view);
        this.f2446n = (AdControlButton) findViewById(C2271R.C2273id.ad_control_button);
        this.f2447o = (TextView) findViewById(C2271R.C2273id.status_textview);
        this.f2444l.setAdapter(this.f2435c);
        this.f2447o.setText(this.f2433a.mo14518J().mo13806a() ? "Not Supported while Test Mode is enabled" : "Tap to load an ad");
        this.f2447o.setTypeface(Typeface.DEFAULT_BOLD);
        this.f2446n.setOnClickListener(this);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setPadding(0, 10, 0, 0);
        shapeDrawable.getPaint().setColor(-1);
        shapeDrawable.getPaint().setShadowLayer((float) 10, 0.0f, (float) -10, 855638016);
        shapeDrawable.setShape(new RectShape());
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable});
        layerDrawable.setLayerInset(0, 0, 10, 0, 0);
        this.f2445m.setBackground(layerDrawable);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (this.f2436d != null) {
            this.f2433a.mo14518J().mo13803a((String) null);
            this.f2433a.mo14518J().mo13805a(false);
        }
        MaxAdView maxAdView = this.f2437e;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.f2438f;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.f2440h;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
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
