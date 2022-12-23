package com.applovin.impl.mediation.ads;

import android.text.TextUtils;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.C1614a;
import com.applovin.impl.mediation.p031a.C1586d;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.utils.C2049g;
import com.applovin.impl.sdk.utils.C2053j;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

public class MaxNativeAdLoaderImpl extends C1614a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1612a f2190a = new C1612a();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f2191b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f2192c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public MaxNativeAdListener f2193d;

    /* renamed from: e */
    private final Map<String, MaxNativeAdView> f2194e = new HashMap();

    /* renamed from: f */
    private final Object f2195f = new Object();

    /* renamed from: com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl$a */
    private class C1612a implements C1614a.C1615a {
        private C1612a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m3203a(MaxNativeAdView maxNativeAdView) {
            C1586d c;
            C1616b adViewTracker = maxNativeAdView.getAdViewTracker();
            if (adViewTracker != null && (c = adViewTracker.mo13531c()) != null) {
                MaxNativeAdLoaderImpl.this.logger.mo15012b(MaxNativeAdLoaderImpl.this.tag, "Destroying previous ad");
                MaxNativeAdLoaderImpl.this.destroy(c);
            }
        }

        public void onAdClicked(MaxAd maxAd) {
            C2053j.m4994a(MaxNativeAdLoaderImpl.this.f2193d, maxAd, true);
        }

        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        }

        public void onAdDisplayed(MaxAd maxAd) {
        }

        public void onAdHidden(MaxAd maxAd) {
        }

        public void onAdLoadFailed(String str, MaxError maxError) {
            MaxNativeAdView unused = MaxNativeAdLoaderImpl.this.m3193a(((MaxErrorImpl) maxError).getLoadTag());
            C2053j.m4996a(MaxNativeAdLoaderImpl.this.f2193d, str, maxError, true);
        }

        public void onAdLoaded(final MaxAd maxAd) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    MaxNativeAdLoaderImpl.this.logger.mo15012b(MaxNativeAdLoaderImpl.this.tag, "Native ad loaded");
                    C1586d dVar = (C1586d) maxAd;
                    dVar.mo13464d(MaxNativeAdLoaderImpl.this.f2191b);
                    dVar.mo13465e(MaxNativeAdLoaderImpl.this.f2192c);
                    MaxNativeAdView a = MaxNativeAdLoaderImpl.this.m3193a(dVar.mo13356a());
                    if (a == null) {
                        MaxNativeAdLoaderImpl.this.logger.mo15012b(MaxNativeAdLoaderImpl.this.tag, "No custom view provided, checking template");
                        String v = dVar.mo13418v();
                        if (StringUtils.isValidString(v)) {
                            C2102v vVar = MaxNativeAdLoaderImpl.this.logger;
                            String str = MaxNativeAdLoaderImpl.this.tag;
                            vVar.mo15012b(str, "Using template: " + v + APSSharedUtil.TRUNCATE_SEPARATOR);
                            a = new MaxNativeAdView(v, MaxNativeAdLoaderImpl.this.sdk.mo14520L());
                        }
                    }
                    if (a == null) {
                        MaxNativeAdLoaderImpl.this.logger.mo15012b(MaxNativeAdLoaderImpl.this.tag, "No native ad view to render. Returning the native ad to be rendered later.");
                        C2053j.m4995a(MaxNativeAdLoaderImpl.this.f2193d, (MaxNativeAdView) null, maxAd, true);
                        return;
                    }
                    C1612a.this.m3203a(a);
                    MaxNativeAdLoaderImpl.this.m3197a(a, dVar, dVar.getNativeAd());
                    C2053j.m4995a(MaxNativeAdLoaderImpl.this.f2193d, a, maxAd, true);
                    MaxNativeAdLoaderImpl.this.m3196a(a);
                }
            });
        }

        public void onAdRevenuePaid(MaxAd maxAd) {
            C2053j.m4991a(MaxNativeAdLoaderImpl.this.revenueListener, maxAd, true);
        }
    }

    public MaxNativeAdLoaderImpl(String str, C1969m mVar) {
        super(str, MaxAdFormat.NATIVE, "MaxNativeAdLoader", mVar);
        if (C2102v.m5104a()) {
            C2102v vVar = this.logger;
            String str2 = this.tag;
            vVar.mo15012b(str2, "Created new MaxNativeAdLoader (" + this + ")");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public MaxNativeAdView m3193a(String str) {
        MaxNativeAdView remove;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f2195f) {
            remove = this.f2194e.remove(str);
        }
        return remove;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3196a(MaxNativeAdView maxNativeAdView) {
        C1616b adViewTracker = maxNativeAdView.getAdViewTracker();
        if (adViewTracker != null) {
            if (C2049g.m4941c()) {
                if (!maxNativeAdView.isAttachedToWindow()) {
                    return;
                }
            } else if (maxNativeAdView.getParent() == null) {
                return;
            }
            adViewTracker.mo13530b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3197a(final MaxNativeAdView maxNativeAdView, final C1586d dVar, final MaxNativeAd maxNativeAd) {
        dVar.mo13417a(maxNativeAdView);
        mo13522a(dVar);
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                maxNativeAdView.render(dVar, MaxNativeAdLoaderImpl.this.f2190a, MaxNativeAdLoaderImpl.this.sdk);
                maxNativeAd.setNativeAdView(maxNativeAdView);
                maxNativeAd.prepareViewForInteraction(maxNativeAdView);
            }
        });
    }

    /* renamed from: a */
    private void m3198a(String str, MaxNativeAdView maxNativeAdView) {
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.f2195f) {
                this.f2194e.put(str, maxNativeAdView);
            }
        }
    }

    public void destroy() {
        this.f2193d = null;
        super.destroy();
    }

    public void destroy(MaxAd maxAd) {
        if (maxAd instanceof C1586d) {
            C1586d dVar = (C1586d) maxAd;
            if (!dVar.mo13419w()) {
                MaxNativeAdView u = dVar.mo13397u();
                if (u != null) {
                    C1616b adViewTracker = u.getAdViewTracker();
                    if (adViewTracker != null && maxAd.equals(adViewTracker.mo13531c())) {
                        u.recycle();
                    }
                } else if (C2102v.m5104a()) {
                    C2102v vVar = this.logger;
                    String str = this.tag;
                    vVar.mo15012b(str, "Destroy failed on native ad(" + dVar + "): native ad view not found");
                }
                this.sdk.mo14513E().destroyAd(dVar);
            } else if (C2102v.m5104a()) {
                C2102v vVar2 = this.logger;
                String str2 = this.tag;
                vVar2.mo15012b(str2, "Native ad(" + dVar + ") has already been destroyed");
            }
        } else if (C2102v.m5104a()) {
            C2102v vVar3 = this.logger;
            String str3 = this.tag;
            vVar3.mo15012b(str3, "Destroy failed on non-native ad(" + maxAd + ")");
        }
    }

    public String getPlacement() {
        return this.f2191b;
    }

    public void loadAd(MaxNativeAdView maxNativeAdView) {
        if (C2102v.m5104a()) {
            C2102v vVar = this.logger;
            String str = this.tag;
            vVar.mo15012b(str, "Loading native ad for '" + this.adUnitId + "' and notifying " + this.f2190a + APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        this.extraParameters.put("integration_type", maxNativeAdView != null ? "custom_ad_view" : "no_ad_view");
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        m3198a(lowerCase, maxNativeAdView);
        this.sdk.mo14513E().loadAd(this.adUnitId, lowerCase, MaxAdFormat.NATIVE, this.localExtraParameters, this.extraParameters, this.sdk.mo14520L(), this.f2190a);
    }

    public boolean render(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        if (!(maxAd instanceof C1586d)) {
            C2102v.m5110i(this.tag, "Failed to render native ad. `ad` needs to be of type `MediatedNativeAd` to render.");
            return false;
        } else if (maxNativeAdView == null) {
            C2102v.m5110i(this.tag, "Failed to render native ad. `adView` to render cannot be null.");
            return false;
        } else {
            C1586d dVar = (C1586d) maxAd;
            MaxNativeAd nativeAd = dVar.getNativeAd();
            if (nativeAd == null) {
                this.logger.mo15016e(this.tag, "Failed to render native ad. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
                return false;
            }
            m3197a(maxNativeAdView, dVar, nativeAd);
            m3196a(maxNativeAdView);
            return true;
        }
    }

    public void setCustomData(String str) {
        Utils.maybeLogCustomDataSizeLimit(str, this.tag);
        this.f2192c = str;
    }

    public void setNativeAdListener(MaxNativeAdListener maxNativeAdListener) {
        if (C2102v.m5104a()) {
            C2102v vVar = this.logger;
            String str = this.tag;
            vVar.mo15012b(str, "Setting native ad listener: " + maxNativeAdListener);
        }
        this.f2193d = maxNativeAdListener;
    }

    public void setPlacement(String str) {
        this.f2191b = str;
    }

    public String toString() {
        return "MaxNativeAdLoader{adUnitId='" + this.adUnitId + '\'' + ", nativeAdListener=" + this.f2193d + ", revenueListener=" + this.revenueListener + '}';
    }
}
