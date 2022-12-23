package com.applovin.impl.sdk.p050b;

import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.p049ad.AppLovinAdImpl;
import com.applovin.impl.sdk.p049ad.C1839e;
import com.applovin.impl.sdk.p049ad.C1845f;
import com.applovin.impl.sdk.p049ad.C1846g;
import com.applovin.impl.sdk.p052d.C1881f;
import com.applovin.impl.sdk.p053e.C1887a;
import com.applovin.impl.sdk.p053e.C1888aa;
import com.applovin.impl.sdk.p053e.C1918o;
import com.applovin.impl.sdk.p053e.C1937v;
import com.applovin.impl.sdk.utils.C2053j;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.SoftReference;
import java.util.Map;

/* renamed from: com.applovin.impl.sdk.b.a */
public class C1850a {

    /* renamed from: a */
    protected final C1969m f3008a;

    /* renamed from: b */
    protected final AppLovinAdServiceImpl f3009b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public AppLovinAd f3010c;

    /* renamed from: d */
    private String f3011d;

    /* renamed from: e */
    private SoftReference<AppLovinAdLoadListener> f3012e;

    /* renamed from: f */
    private final Object f3013f = new Object();

    /* renamed from: g */
    private volatile String f3014g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public volatile boolean f3015h = false;

    /* renamed from: com.applovin.impl.sdk.b.a$a */
    private class C1852a implements AppLovinAdLoadListener {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final AppLovinAdLoadListener f3018b;

        C1852a(AppLovinAdLoadListener appLovinAdLoadListener) {
            this.f3018b = appLovinAdLoadListener;
        }

        public void adReceived(final AppLovinAd appLovinAd) {
            AppLovinAd unused = C1850a.this.f3010c = appLovinAd;
            if (this.f3018b != null) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() {
                    public void run() {
                        try {
                            C1852a.this.f3018b.adReceived(appLovinAd);
                        } catch (Throwable th) {
                            if (C2102v.m5104a()) {
                                C2102v.m5106c("AppLovinIncentivizedInterstitial", "Unable to notify ad listener about a newly loaded ad", th);
                            }
                        }
                    }
                });
            }
        }

        public void failedToReceiveAd(final int i) {
            if (this.f3018b != null) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() {
                    public void run() {
                        try {
                            C1852a.this.f3018b.failedToReceiveAd(i);
                        } catch (Throwable th) {
                            if (C2102v.m5104a()) {
                                C2102v.m5106c("AppLovinIncentivizedInterstitial", "Unable to notify listener about ad load failure", th);
                            }
                        }
                    }
                });
            }
        }
    }

    /* renamed from: com.applovin.impl.sdk.b.a$b */
    private class C1855b implements C1846g, AppLovinAdClickListener, AppLovinAdRewardListener, AppLovinAdVideoPlaybackListener {

        /* renamed from: b */
        private final AppLovinAdDisplayListener f3024b;

        /* renamed from: c */
        private final AppLovinAdClickListener f3025c;

        /* renamed from: d */
        private final AppLovinAdVideoPlaybackListener f3026d;

        /* renamed from: e */
        private final AppLovinAdRewardListener f3027e;

        private C1855b(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
            this.f3024b = appLovinAdDisplayListener;
            this.f3025c = appLovinAdClickListener;
            this.f3026d = appLovinAdVideoPlaybackListener;
            this.f3027e = appLovinAdRewardListener;
        }

        /* renamed from: a */
        private void m4055a(C1839e eVar) {
            String str;
            int i;
            String a = C1850a.this.m4047d();
            if (!StringUtils.isValidString(a) || !C1850a.this.f3015h) {
                if (C2102v.m5104a()) {
                    C2102v A = C1850a.this.f3008a.mo14509A();
                    A.mo15016e("IncentivizedAdController", "Invalid reward state - result: " + a + " and wasFullyEngaged: " + C1850a.this.f3015h);
                    C1850a.this.f3008a.mo14509A().mo15012b("IncentivizedAdController", "Cancelling any incoming reward requests for this ad");
                }
                eVar.mo14197aF();
                if (C1850a.this.f3015h) {
                    if (C2102v.m5104a()) {
                        C1850a.this.f3008a.mo14509A().mo15016e("IncentivizedAdController", "User close the ad after fully watching but reward validation task did not return on time");
                    }
                    i = AppLovinErrorCodes.INCENTIVIZED_SERVER_TIMEOUT;
                    str = "network_timeout";
                } else {
                    if (C2102v.m5104a()) {
                        C1850a.this.f3008a.mo14509A().mo15016e("IncentivizedAdController", "User close the ad prematurely");
                    }
                    i = AppLovinErrorCodes.INCENTIVIZED_USER_CLOSED_VIDEO;
                    str = "user_closed_video";
                }
                eVar.mo14190a(C1864c.m4068a(str));
                if (C2102v.m5104a()) {
                    C1850a.this.f3008a.mo14509A().mo15012b("IncentivizedAdController", "Notifying listener of reward validation failure");
                }
                C2053j.m5000a(this.f3027e, (AppLovinAd) eVar, i);
            }
            C1850a.this.m4037a((AppLovinAd) eVar);
            if (C2102v.m5104a()) {
                C1850a.this.f3008a.mo14509A().mo15012b("IncentivizedAdController", "Notifying listener of rewarded ad dismissal");
            }
            C2053j.m5010b(this.f3024b, (AppLovinAd) eVar);
            if (!eVar.mo14210ag().getAndSet(true)) {
                if (C2102v.m5104a()) {
                    C1850a.this.f3008a.mo14509A().mo15012b("IncentivizedAdController", "Scheduling report rewarded ad...");
                }
                C1850a.this.f3008a.mo14526S().mo14429a((C1887a) new C1937v(eVar, C1850a.this.f3008a), C1918o.C1920a.REWARD);
            }
        }

        public void adClicked(AppLovinAd appLovinAd) {
            C2053j.m4997a(this.f3025c, appLovinAd);
        }

        public void adDisplayed(AppLovinAd appLovinAd) {
            C2053j.m4998a(this.f3024b, appLovinAd);
        }

        public void adHidden(AppLovinAd appLovinAd) {
            if (appLovinAd instanceof C1845f) {
                appLovinAd = ((C1845f) appLovinAd).mo14243a();
            }
            if (appLovinAd instanceof C1839e) {
                m4055a((C1839e) appLovinAd);
            } else if (C2102v.m5104a()) {
                C2102v A = C1850a.this.f3008a.mo14509A();
                A.mo15016e("IncentivizedAdController", "Something is terribly wrong. Received `adHidden` callback for invalid ad of type: " + appLovinAd);
            }
        }

        public void onAdDisplayFailed(String str) {
            C2053j.m4999a(this.f3024b, str);
        }

        public void userOverQuota(AppLovinAd appLovinAd, Map<String, String> map) {
            C1850a.this.m4040a("quota_exceeded");
            C2053j.m5011b(this.f3027e, appLovinAd, map);
        }

        public void userRewardRejected(AppLovinAd appLovinAd, Map<String, String> map) {
            C1850a.this.m4040a("rejected");
            C2053j.m5015c(this.f3027e, appLovinAd, map);
        }

        public void userRewardVerified(AppLovinAd appLovinAd, Map<String, String> map) {
            C1850a.this.m4040a("accepted");
            C2053j.m5001a(this.f3027e, appLovinAd, map);
        }

        public void validationRequestFailed(AppLovinAd appLovinAd, int i) {
            C1850a.this.m4040a("network_timeout");
            C2053j.m5000a(this.f3027e, appLovinAd, i);
        }

        public void videoPlaybackBegan(AppLovinAd appLovinAd) {
            C2053j.m5002a(this.f3026d, appLovinAd);
        }

        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d, boolean z) {
            C2053j.m5003a(this.f3026d, appLovinAd, d, z);
            boolean unused = C1850a.this.f3015h = z;
        }
    }

    public C1850a(String str, AppLovinSdk appLovinSdk) {
        this.f3008a = appLovinSdk.coreSdk;
        this.f3009b = (AppLovinAdServiceImpl) appLovinSdk.getAdService();
        this.f3011d = str;
    }

    /* renamed from: a */
    private void m4032a(AppLovinAdImpl appLovinAdImpl, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAdImpl.getType() == AppLovinAdType.INCENTIVIZED || appLovinAdImpl.getType() == AppLovinAdType.AUTO_INCENTIVIZED) {
            AppLovinAd maybeRetrieveNonDummyAd = Utils.maybeRetrieveNonDummyAd(appLovinAdImpl, this.f3008a);
            if (maybeRetrieveNonDummyAd == null) {
                m4039a(appLovinAdImpl, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener);
                return;
            }
            AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(this.f3008a.mo14532Y(), context);
            C1855b bVar = new C1855b(appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
            create.setAdDisplayListener(bVar);
            create.setAdVideoPlaybackListener(bVar);
            create.setAdClickListener(bVar);
            create.showAndRender(maybeRetrieveNonDummyAd);
            if (maybeRetrieveNonDummyAd instanceof C1839e) {
                m4034a((C1839e) maybeRetrieveNonDummyAd, (AppLovinAdRewardListener) bVar);
                return;
            }
            return;
        }
        if (C2102v.m5104a()) {
            C2102v A = this.f3008a.mo14509A();
            A.mo15016e("IncentivizedAdController", "Failed to render an ad of type " + appLovinAdImpl.getType() + " in an Incentivized Ad interstitial.");
        }
        m4039a(appLovinAdImpl, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener);
    }

    /* renamed from: a */
    private void m4033a(AppLovinAdImpl appLovinAdImpl, ViewGroup viewGroup, Lifecycle lifecycle, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        AppLovinAdImpl appLovinAdImpl2 = appLovinAdImpl;
        AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener2 = appLovinAdVideoPlaybackListener;
        AppLovinAdDisplayListener appLovinAdDisplayListener2 = appLovinAdDisplayListener;
        if (appLovinAdImpl.getType() == AppLovinAdType.INCENTIVIZED || appLovinAdImpl.getType() == AppLovinAdType.AUTO_INCENTIVIZED) {
            AppLovinAd maybeRetrieveNonDummyAd = Utils.maybeRetrieveNonDummyAd(appLovinAdImpl, this.f3008a);
            if (maybeRetrieveNonDummyAd == null) {
                m4039a(appLovinAdImpl, appLovinAdVideoPlaybackListener2, appLovinAdDisplayListener2);
                return;
            }
            Context context2 = context;
            AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(this.f3008a.mo14532Y(), context);
            C1855b bVar = new C1855b(appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
            create.setAdDisplayListener(bVar);
            create.setAdVideoPlaybackListener(bVar);
            create.setAdClickListener(bVar);
            ViewGroup viewGroup2 = viewGroup;
            Lifecycle lifecycle2 = lifecycle;
            create.showAndRender(maybeRetrieveNonDummyAd, viewGroup, lifecycle);
            if (maybeRetrieveNonDummyAd instanceof C1839e) {
                m4034a((C1839e) maybeRetrieveNonDummyAd, (AppLovinAdRewardListener) bVar);
                return;
            }
            return;
        }
        if (C2102v.m5104a()) {
            C2102v A = this.f3008a.mo14509A();
            A.mo15016e("IncentivizedAdController", "Failed to render an ad of type " + appLovinAdImpl.getType() + " in an Incentivized Ad interstitial.");
        }
        m4039a(appLovinAdImpl, appLovinAdVideoPlaybackListener2, appLovinAdDisplayListener2);
    }

    /* renamed from: a */
    private void m4034a(C1839e eVar, AppLovinAdRewardListener appLovinAdRewardListener) {
        this.f3008a.mo14526S().mo14429a((C1887a) new C1888aa(eVar, appLovinAdRewardListener, this.f3008a), C1918o.C1920a.REWARD);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m4037a(AppLovinAd appLovinAd) {
        AppLovinAd appLovinAd2 = this.f3010c;
        if (appLovinAd2 != null) {
            if (appLovinAd2 instanceof C1845f) {
                if (appLovinAd != ((C1845f) appLovinAd2).mo14243a()) {
                    return;
                }
            } else if (appLovinAd != appLovinAd2) {
                return;
            }
            this.f3010c = null;
        }
    }

    /* renamed from: a */
    private void m4038a(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAd == null) {
            appLovinAd = this.f3010c;
        }
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        if (appLovinAdImpl != null) {
            m4032a(appLovinAdImpl, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
            return;
        }
        if (C2102v.m5104a()) {
            C2102v.m5110i("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
        }
        m4046c();
    }

    /* renamed from: a */
    private void m4039a(AppLovinAd appLovinAd, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f3008a.mo14527T().mo14351a(C1881f.f3474j);
        C2053j.m5003a(appLovinAdVideoPlaybackListener, appLovinAd, 0.0d, false);
        C2053j.m5010b(appLovinAdDisplayListener, appLovinAd);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m4040a(String str) {
        synchronized (this.f3013f) {
            this.f3014g = str;
        }
    }

    /* renamed from: b */
    private void m4043b(AppLovinAd appLovinAd, ViewGroup viewGroup, Lifecycle lifecycle, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        AppLovinAdImpl appLovinAdImpl;
        if (appLovinAd != null) {
            appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        } else {
            appLovinAdImpl = (AppLovinAdImpl) this.f3010c;
        }
        if (appLovinAdImpl != null) {
            m4033a(appLovinAdImpl, viewGroup, lifecycle, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
            return;
        }
        if (C2102v.m5104a()) {
            C2102v.m5110i("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
        }
        m4046c();
    }

    /* renamed from: b */
    private void m4044b(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f3009b.loadNextIncentivizedAd(this.f3011d, appLovinAdLoadListener);
    }

    /* renamed from: c */
    private void m4046c() {
        AppLovinAdLoadListener appLovinAdLoadListener;
        SoftReference<AppLovinAdLoadListener> softReference = this.f3012e;
        if (softReference != null && (appLovinAdLoadListener = softReference.get()) != null) {
            appLovinAdLoadListener.failedToReceiveAd(AppLovinErrorCodes.INCENTIVIZED_NO_AD_PRELOADED);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public String m4047d() {
        String str;
        synchronized (this.f3013f) {
            str = this.f3014g;
        }
        return str;
    }

    /* renamed from: e */
    private AppLovinAdRewardListener m4048e() {
        return new AppLovinAdRewardListener() {
            public void userOverQuota(AppLovinAd appLovinAd, Map<String, String> map) {
                if (C2102v.m5104a()) {
                    C2102v A = C1850a.this.f3008a.mo14509A();
                    A.mo15016e("IncentivizedAdController", "User over quota: " + map);
                }
            }

            public void userRewardRejected(AppLovinAd appLovinAd, Map<String, String> map) {
                if (C2102v.m5104a()) {
                    C2102v A = C1850a.this.f3008a.mo14509A();
                    A.mo15016e("IncentivizedAdController", "Reward rejected: " + map);
                }
            }

            public void userRewardVerified(AppLovinAd appLovinAd, Map<String, String> map) {
                if (C2102v.m5104a()) {
                    C2102v A = C1850a.this.f3008a.mo14509A();
                    A.mo15012b("IncentivizedAdController", "Reward validated: " + map);
                }
            }

            public void validationRequestFailed(AppLovinAd appLovinAd, int i) {
                if (C2102v.m5104a()) {
                    C2102v A = C1850a.this.f3008a.mo14509A();
                    A.mo15016e("IncentivizedAdController", "Reward validation failed: " + i);
                }
            }
        };
    }

    /* renamed from: a */
    public void mo14250a(AppLovinAd appLovinAd, Context context, String str, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAdRewardListener == null) {
            appLovinAdRewardListener = m4048e();
        }
        m4038a(appLovinAd, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    /* renamed from: a */
    public void mo14251a(AppLovinAd appLovinAd, ViewGroup viewGroup, Lifecycle lifecycle, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        m4043b(appLovinAd, viewGroup, lifecycle, context, appLovinAdRewardListener == null ? m4048e() : appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    /* renamed from: a */
    public void mo14252a(AppLovinAdLoadListener appLovinAdLoadListener) {
        if (C2102v.m5104a()) {
            this.f3008a.mo14509A().mo15012b("IncentivizedAdController", "User requested preload of incentivized ad...");
        }
        this.f3012e = new SoftReference<>(appLovinAdLoadListener);
        if (mo14253a()) {
            if (C2102v.m5104a()) {
                C2102v.m5110i("IncentivizedAdController", "Attempted to call preloadAndNotify: while an ad was already loaded or currently being played. Do not call preloadAndNotify: again until the last ad has been closed (adHidden).");
            }
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.adReceived(this.f3010c);
                return;
            }
            return;
        }
        m4044b((AppLovinAdLoadListener) new C1852a(appLovinAdLoadListener));
    }

    /* renamed from: a */
    public boolean mo14253a() {
        return this.f3010c != null;
    }

    /* renamed from: b */
    public String mo14254b() {
        return this.f3011d;
    }
}
