package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.mediation.p031a.C1583a;
import com.applovin.impl.mediation.p031a.C1585c;
import com.applovin.impl.mediation.p031a.C1588f;
import com.applovin.impl.mediation.p031a.C1591h;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.p053e.C1887a;
import com.applovin.impl.sdk.p053e.C1918o;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxInterstitialAdViewAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdViewAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxRewardedInterstitialAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.tapjoy.TapjoyConstants;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.mediation.g */
public class C1740g {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Handler f2680a = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1969m f2681b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C2102v f2682c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final String f2683d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C1588f f2684e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final String f2685f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public MaxAdapter f2686g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f2687h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C1583a f2688i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public View f2689j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public MaxNativeAd f2690k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public MaxNativeAdView f2691l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C1760a f2692m = new C1760a();
    /* access modifiers changed from: private */

    /* renamed from: n */
    public MaxAdapterResponseParameters f2693n;

    /* renamed from: o */
    private final AtomicBoolean f2694o = new AtomicBoolean(true);
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final AtomicBoolean f2695p = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final AtomicBoolean f2696q = new AtomicBoolean(false);

    /* renamed from: r */
    private final boolean f2697r;

    /* renamed from: com.applovin.impl.mediation.g$a */
    private class C1760a implements MaxAdViewAdapterListener, MaxInterstitialAdapterListener, MaxNativeAdAdapterListener, MaxRewardedAdapterListener, MaxRewardedInterstitialAdapterListener {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public MediationServiceImpl.C1579a f2755b;

        private C1760a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m3749a(MediationServiceImpl.C1579a aVar) {
            if (aVar != null) {
                this.f2755b = aVar;
                return;
            }
            throw new IllegalArgumentException("No listener specified");
        }

        /* renamed from: a */
        private void m3752a(String str, final Bundle bundle) {
            C1740g.this.f2696q.set(true);
            m3753a(str, (MaxAdListener) this.f2755b, (Runnable) new Runnable() {
                public void run() {
                    if (C1740g.this.f2695p.compareAndSet(false, true)) {
                        C1760a.this.f2755b.mo13346a(C1740g.this.f2688i, bundle);
                    }
                }
            });
        }

        /* renamed from: a */
        private void m3753a(final String str, final MaxAdListener maxAdListener, final Runnable runnable) {
            C1740g.this.f2680a.post(new Runnable() {
                public void run() {
                    try {
                        runnable.run();
                    } catch (Exception e) {
                        MaxAdListener maxAdListener = maxAdListener;
                        String name = maxAdListener != null ? maxAdListener.getClass().getName() : null;
                        if (C2102v.m5104a()) {
                            C2102v.m5106c("MediationAdapterWrapper", "Failed to forward call (" + str + ") to " + name, e);
                        }
                    }
                }
            });
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m3754a(String str, final MaxError maxError) {
            m3753a(str, (MaxAdListener) this.f2755b, (Runnable) new Runnable() {
                public void run() {
                    if (C1740g.this.f2695p.compareAndSet(false, true)) {
                        C1760a.this.f2755b.onAdLoadFailed(C1740g.this.f2687h, maxError);
                    }
                }
            });
        }

        /* renamed from: b */
        private void m3756b(String str, final Bundle bundle) {
            if (C1740g.this.f2688i.mo13392s().compareAndSet(false, true)) {
                m3753a(str, (MaxAdListener) this.f2755b, (Runnable) new Runnable() {
                    public void run() {
                        C1760a.this.f2755b.mo13347b(C1740g.this.f2688i, bundle);
                    }
                });
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m3757b(String str, final MaxError maxError) {
            m3753a(str, (MaxAdListener) this.f2755b, (Runnable) new Runnable() {
                public void run() {
                    C1760a.this.f2755b.onAdDisplayFailed(C1740g.this.f2688i, maxError);
                }
            });
        }

        public void onAdViewAdClicked() {
            onAdViewAdClicked((Bundle) null);
        }

        public void onAdViewAdClicked(final Bundle bundle) {
            if (C2102v.m5104a()) {
                C2102v c = C1740g.this.f2682c;
                c.mo15014c("MediationAdapterWrapper", C1740g.this.f2685f + ": adview ad clicked with extra info: " + bundle);
            }
            m3753a("onAdViewAdClicked", (MaxAdListener) this.f2755b, (Runnable) new Runnable() {
                public void run() {
                    C1760a.this.f2755b.mo13349d(C1740g.this.f2688i, bundle);
                }
            });
        }

        public void onAdViewAdCollapsed() {
            if (C2102v.m5104a()) {
                C2102v c = C1740g.this.f2682c;
                c.mo15014c("MediationAdapterWrapper", C1740g.this.f2685f + ": adview ad collapsed");
            }
            m3753a("onAdViewAdCollapsed", (MaxAdListener) this.f2755b, (Runnable) new Runnable() {
                public void run() {
                    C1760a.this.f2755b.onAdCollapsed(C1740g.this.f2688i);
                }
            });
        }

        public void onAdViewAdDisplayFailed(MaxAdapterError maxAdapterError) {
            if (C2102v.m5104a()) {
                C2102v c = C1740g.this.f2682c;
                c.mo15015d("MediationAdapterWrapper", C1740g.this.f2685f + ": adview ad failed to display with error: " + maxAdapterError);
            }
            m3757b("onAdViewAdDisplayFailed", (MaxError) maxAdapterError);
        }

        public void onAdViewAdDisplayed() {
            onAdViewAdDisplayed((Bundle) null);
        }

        public void onAdViewAdDisplayed(Bundle bundle) {
            if (C2102v.m5104a()) {
                C2102v c = C1740g.this.f2682c;
                c.mo15014c("MediationAdapterWrapper", C1740g.this.f2685f + ": adview ad displayed with extra info: " + bundle);
            }
            m3756b("onAdViewAdDisplayed", bundle);
        }

        public void onAdViewAdExpanded() {
            if (C2102v.m5104a()) {
                C2102v c = C1740g.this.f2682c;
                c.mo15014c("MediationAdapterWrapper", C1740g.this.f2685f + ": adview ad expanded");
            }
            m3753a("onAdViewAdExpanded", (MaxAdListener) this.f2755b, (Runnable) new Runnable() {
                public void run() {
                    C1760a.this.f2755b.onAdExpanded(C1740g.this.f2688i);
                }
            });
        }

        public void onAdViewAdHidden() {
            onAdViewAdHidden((Bundle) null);
        }

        public void onAdViewAdHidden(final Bundle bundle) {
            if (C2102v.m5104a()) {
                C2102v c = C1740g.this.f2682c;
                c.mo15014c("MediationAdapterWrapper", C1740g.this.f2685f + ": adview ad hidden with extra info: " + bundle);
            }
            m3753a("onAdViewAdHidden", (MaxAdListener) this.f2755b, (Runnable) new Runnable() {
                public void run() {
                    C1760a.this.f2755b.mo13348c(C1740g.this.f2688i, bundle);
                }
            });
        }

        public void onAdViewAdLoadFailed(MaxAdapterError maxAdapterError) {
            if (C2102v.m5104a()) {
                C2102v c = C1740g.this.f2682c;
                c.mo15015d("MediationAdapterWrapper", C1740g.this.f2685f + ": adview ad ad failed to load with error: " + maxAdapterError);
            }
            m3754a("onAdViewAdLoadFailed", (MaxError) maxAdapterError);
        }

        public void onAdViewAdLoaded(View view) {
            onAdViewAdLoaded(view, (Bundle) null);
        }

        public void onAdViewAdLoaded(View view, Bundle bundle) {
            if (C2102v.m5104a()) {
                C2102v c = C1740g.this.f2682c;
                c.mo15014c("MediationAdapterWrapper", C1740g.this.f2685f + ": adview ad loaded with extra info: " + bundle);
            }
            View unused = C1740g.this.f2689j = view;
            m3752a("onAdViewAdLoaded", bundle);
        }

        public void onInterstitialAdClicked() {
            onInterstitialAdClicked((Bundle) null);
        }

        public void onInterstitialAdClicked(final Bundle bundle) {
            if (C2102v.m5104a()) {
                C2102v c = C1740g.this.f2682c;
                c.mo15014c("MediationAdapterWrapper", C1740g.this.f2685f + ": interstitial ad clicked with extra info: " + bundle);
            }
            m3753a("onInterstitialAdClicked", (MaxAdListener) this.f2755b, (Runnable) new Runnable() {
                public void run() {
                    C1760a.this.f2755b.mo13349d(C1740g.this.f2688i, bundle);
                }
            });
        }

        public void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError) {
            if (C2102v.m5104a()) {
                C2102v c = C1740g.this.f2682c;
                c.mo15015d("MediationAdapterWrapper", C1740g.this.f2685f + ": interstitial ad failed to display with error " + maxAdapterError);
            }
            m3757b("onInterstitialAdDisplayFailed", (MaxError) maxAdapterError);
        }

        public void onInterstitialAdDisplayed() {
            onInterstitialAdDisplayed((Bundle) null);
        }

        public void onInterstitialAdDisplayed(Bundle bundle) {
            if (C2102v.m5104a()) {
                C2102v c = C1740g.this.f2682c;
                c.mo15014c("MediationAdapterWrapper", C1740g.this.f2685f + ": interstitial ad displayed with extra info: " + bundle);
            }
            m3756b("onInterstitialAdDisplayed", bundle);
        }

        public void onInterstitialAdHidden() {
            onInterstitialAdHidden((Bundle) null);
        }

        public void onInterstitialAdHidden(final Bundle bundle) {
            if (C2102v.m5104a()) {
                C2102v c = C1740g.this.f2682c;
                c.mo15014c("MediationAdapterWrapper", C1740g.this.f2685f + ": interstitial ad hidden with extra info " + bundle);
            }
            m3753a("onInterstitialAdHidden", (MaxAdListener) this.f2755b, (Runnable) new Runnable() {
                public void run() {
                    C1760a.this.f2755b.mo13348c(C1740g.this.f2688i, bundle);
                }
            });
        }

        public void onInterstitialAdLoadFailed(MaxAdapterError maxAdapterError) {
            if (C2102v.m5104a()) {
                C2102v c = C1740g.this.f2682c;
                c.mo15015d("MediationAdapterWrapper", C1740g.this.f2685f + ": interstitial ad failed to load with error " + maxAdapterError);
            }
            m3754a("onInterstitialAdLoadFailed", (MaxError) maxAdapterError);
        }

        public void onInterstitialAdLoaded() {
            onInterstitialAdLoaded((Bundle) null);
        }

        public void onInterstitialAdLoaded(Bundle bundle) {
            if (C2102v.m5104a()) {
                C2102v c = C1740g.this.f2682c;
                c.mo15014c("MediationAdapterWrapper", C1740g.this.f2685f + ": interstitial ad loaded with extra info: " + bundle);
            }
            m3752a("onInterstitialAdLoaded", bundle);
        }

        public void onNativeAdClicked() {
            if (C2102v.m5104a()) {
                C2102v c = C1740g.this.f2682c;
                c.mo15014c("MediationAdapterWrapper", C1740g.this.f2685f + ": native ad clicked");
            }
            m3753a("onNativeAdClicked", (MaxAdListener) this.f2755b, (Runnable) new Runnable() {
                public void run() {
                    C1760a.this.f2755b.onAdClicked(C1740g.this.f2688i);
                }
            });
        }

        public void onNativeAdDisplayed(Bundle bundle) {
            if (C2102v.m5104a()) {
                C2102v c = C1740g.this.f2682c;
                c.mo15014c("MediationAdapterWrapper", C1740g.this.f2685f + ": native ad displayed with extra info: " + bundle);
            }
            m3756b("onNativeAdDisplayed", bundle);
        }

        public void onNativeAdLoadFailed(MaxAdapterError maxAdapterError) {
            if (C2102v.m5104a()) {
                C2102v c = C1740g.this.f2682c;
                c.mo15015d("MediationAdapterWrapper", C1740g.this.f2685f + ": native ad ad failed to load with error: " + maxAdapterError);
            }
            m3754a("onNativeAdLoadFailed", (MaxError) maxAdapterError);
        }

        public void onNativeAdLoaded(MaxNativeAd maxNativeAd, Bundle bundle) {
            if (C2102v.m5104a()) {
                C2102v c = C1740g.this.f2682c;
                c.mo15014c("MediationAdapterWrapper", C1740g.this.f2685f + ": native ad loaded with extra info: " + bundle);
            }
            MaxNativeAd unused = C1740g.this.f2690k = maxNativeAd;
            m3752a("onNativeAdLoaded", bundle);
        }

        public void onRewardedAdClicked() {
            onRewardedAdClicked((Bundle) null);
        }

        public void onRewardedAdClicked(final Bundle bundle) {
            if (C2102v.m5104a()) {
                C2102v c = C1740g.this.f2682c;
                c.mo15014c("MediationAdapterWrapper", C1740g.this.f2685f + ": rewarded ad clicked with extra info: " + bundle);
            }
            m3753a("onRewardedAdClicked", (MaxAdListener) this.f2755b, (Runnable) new Runnable() {
                public void run() {
                    C1760a.this.f2755b.mo13349d(C1740g.this.f2688i, bundle);
                }
            });
        }

        public void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError) {
            if (C2102v.m5104a()) {
                C2102v c = C1740g.this.f2682c;
                c.mo15015d("MediationAdapterWrapper", C1740g.this.f2685f + ": rewarded ad display failed with error: " + maxAdapterError);
            }
            m3757b("onRewardedAdDisplayFailed", (MaxError) maxAdapterError);
        }

        public void onRewardedAdDisplayed() {
            onRewardedAdDisplayed((Bundle) null);
        }

        public void onRewardedAdDisplayed(Bundle bundle) {
            if (C2102v.m5104a()) {
                C2102v c = C1740g.this.f2682c;
                c.mo15014c("MediationAdapterWrapper", C1740g.this.f2685f + ": rewarded ad displayed with extra info: " + bundle);
            }
            m3756b("onRewardedAdDisplayed", bundle);
        }

        public void onRewardedAdHidden() {
            onRewardedAdHidden((Bundle) null);
        }

        public void onRewardedAdHidden(final Bundle bundle) {
            if (C2102v.m5104a()) {
                C2102v c = C1740g.this.f2682c;
                c.mo15014c("MediationAdapterWrapper", C1740g.this.f2685f + ": rewarded ad hidden with extra info: " + bundle);
            }
            m3753a("onRewardedAdHidden", (MaxAdListener) this.f2755b, (Runnable) new Runnable() {
                public void run() {
                    C1760a.this.f2755b.mo13348c(C1740g.this.f2688i, bundle);
                }
            });
        }

        public void onRewardedAdLoadFailed(MaxAdapterError maxAdapterError) {
            if (C2102v.m5104a()) {
                C2102v c = C1740g.this.f2682c;
                c.mo15015d("MediationAdapterWrapper", C1740g.this.f2685f + ": rewarded ad failed to load with error: " + maxAdapterError);
            }
            m3754a("onRewardedAdLoadFailed", (MaxError) maxAdapterError);
        }

        public void onRewardedAdLoaded() {
            onRewardedAdLoaded((Bundle) null);
        }

        public void onRewardedAdLoaded(Bundle bundle) {
            if (C2102v.m5104a()) {
                C2102v c = C1740g.this.f2682c;
                c.mo15014c("MediationAdapterWrapper", C1740g.this.f2685f + ": rewarded ad loaded with extra info: " + bundle);
            }
            m3752a("onRewardedAdLoaded", bundle);
        }

        public void onRewardedAdVideoCompleted() {
            if (C2102v.m5104a()) {
                C2102v c = C1740g.this.f2682c;
                c.mo15014c("MediationAdapterWrapper", C1740g.this.f2685f + ": rewarded video completed");
            }
            m3753a("onRewardedAdVideoCompleted", (MaxAdListener) this.f2755b, (Runnable) new Runnable() {
                public void run() {
                    C1760a.this.f2755b.onRewardedVideoCompleted(C1740g.this.f2688i);
                }
            });
        }

        public void onRewardedAdVideoStarted() {
            if (C2102v.m5104a()) {
                C2102v c = C1740g.this.f2682c;
                c.mo15014c("MediationAdapterWrapper", C1740g.this.f2685f + ": rewarded video started");
            }
            m3753a("onRewardedAdVideoStarted", (MaxAdListener) this.f2755b, (Runnable) new Runnable() {
                public void run() {
                    C1760a.this.f2755b.onRewardedVideoStarted(C1740g.this.f2688i);
                }
            });
        }

        public void onRewardedInterstitialAdClicked() {
            onRewardedInterstitialAdClicked((Bundle) null);
        }

        public void onRewardedInterstitialAdClicked(final Bundle bundle) {
            if (C2102v.m5104a()) {
                C2102v c = C1740g.this.f2682c;
                c.mo15014c("MediationAdapterWrapper", C1740g.this.f2685f + ": rewarded interstitial ad clicked with extra info: " + bundle);
            }
            m3753a("onRewardedInterstitialAdClicked", (MaxAdListener) this.f2755b, (Runnable) new Runnable() {
                public void run() {
                    C1760a.this.f2755b.mo13349d(C1740g.this.f2688i, bundle);
                }
            });
        }

        public void onRewardedInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError) {
            if (C2102v.m5104a()) {
                C2102v c = C1740g.this.f2682c;
                c.mo15015d("MediationAdapterWrapper", C1740g.this.f2685f + ": rewarded interstitial ad display failed with error: " + maxAdapterError);
            }
            m3757b("onRewardedInterstitialAdDisplayFailed", (MaxError) maxAdapterError);
        }

        public void onRewardedInterstitialAdDisplayed() {
            onRewardedInterstitialAdDisplayed((Bundle) null);
        }

        public void onRewardedInterstitialAdDisplayed(Bundle bundle) {
            if (C2102v.m5104a()) {
                C2102v c = C1740g.this.f2682c;
                c.mo15014c("MediationAdapterWrapper", C1740g.this.f2685f + ": rewarded interstitial ad displayed with extra info: " + bundle);
            }
            m3756b("onRewardedInterstitialAdDisplayed", bundle);
        }

        public void onRewardedInterstitialAdHidden() {
            onRewardedInterstitialAdHidden((Bundle) null);
        }

        public void onRewardedInterstitialAdHidden(final Bundle bundle) {
            if (C2102v.m5104a()) {
                C2102v c = C1740g.this.f2682c;
                c.mo15014c("MediationAdapterWrapper", C1740g.this.f2685f + ": rewarded interstitial ad hidden with extra info: " + bundle);
            }
            m3753a("onRewardedInterstitialAdHidden", (MaxAdListener) this.f2755b, (Runnable) new Runnable() {
                public void run() {
                    C1760a.this.f2755b.mo13348c(C1740g.this.f2688i, bundle);
                }
            });
        }

        public void onRewardedInterstitialAdLoadFailed(MaxAdapterError maxAdapterError) {
            if (C2102v.m5104a()) {
                C2102v c = C1740g.this.f2682c;
                c.mo15015d("MediationAdapterWrapper", C1740g.this.f2685f + ": rewarded ad failed to load with error: " + maxAdapterError);
            }
            m3754a("onRewardedInterstitialAdLoadFailed", (MaxError) maxAdapterError);
        }

        public void onRewardedInterstitialAdLoaded() {
            onRewardedInterstitialAdLoaded((Bundle) null);
        }

        public void onRewardedInterstitialAdLoaded(Bundle bundle) {
            if (C2102v.m5104a()) {
                C2102v c = C1740g.this.f2682c;
                c.mo15014c("MediationAdapterWrapper", C1740g.this.f2685f + ": rewarded interstitial ad loaded with extra info: " + bundle);
            }
            m3752a("onRewardedInterstitialAdLoaded", bundle);
        }

        public void onRewardedInterstitialAdVideoCompleted() {
            if (C2102v.m5104a()) {
                C2102v c = C1740g.this.f2682c;
                c.mo15014c("MediationAdapterWrapper", C1740g.this.f2685f + ": rewarded interstitial completed");
            }
            m3753a("onRewardedInterstitialAdVideoCompleted", (MaxAdListener) this.f2755b, (Runnable) new Runnable() {
                public void run() {
                    C1760a.this.f2755b.onRewardedVideoCompleted(C1740g.this.f2688i);
                }
            });
        }

        public void onRewardedInterstitialAdVideoStarted() {
            if (C2102v.m5104a()) {
                C2102v c = C1740g.this.f2682c;
                c.mo15014c("MediationAdapterWrapper", C1740g.this.f2685f + ": rewarded interstitial started");
            }
            m3753a("onRewardedInterstitialAdVideoStarted", (MaxAdListener) this.f2755b, (Runnable) new Runnable() {
                public void run() {
                    C1760a.this.f2755b.onRewardedVideoStarted(C1740g.this.f2688i);
                }
            });
        }

        public void onUserRewarded(final MaxReward maxReward) {
            if (C1740g.this.f2688i instanceof C1585c) {
                final C1585c cVar = (C1585c) C1740g.this.f2688i;
                if (cVar.mo13410H().compareAndSet(false, true)) {
                    if (C2102v.m5104a()) {
                        C2102v c = C1740g.this.f2682c;
                        c.mo15014c("MediationAdapterWrapper", C1740g.this.f2685f + ": user was rewarded: " + maxReward);
                    }
                    m3753a("onUserRewarded", (MaxAdListener) this.f2755b, (Runnable) new Runnable() {
                        public void run() {
                            C1760a.this.f2755b.onUserRewarded(cVar, maxReward);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: com.applovin.impl.mediation.g$b */
    private static class C1782b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C1591h f2794a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final MaxSignalCollectionListener f2795b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final AtomicBoolean f2796c = new AtomicBoolean();

        C1782b(C1591h hVar, MaxSignalCollectionListener maxSignalCollectionListener) {
            this.f2794a = hVar;
            this.f2795b = maxSignalCollectionListener;
        }
    }

    /* renamed from: com.applovin.impl.mediation.g$c */
    private class C1783c extends C1887a {
        private C1783c() {
            super("TaskTimeoutMediatedAd", C1740g.this.f2681b);
        }

        /* renamed from: a */
        private void m3761a(C1583a aVar) {
            if (aVar != null) {
                this.f3496b.mo14516H().mo13940a(aVar);
            }
        }

        public void run() {
            if (C1740g.this.f2695p.get()) {
                return;
            }
            if (C1740g.this.f2688i.mo13384k()) {
                if (C2102v.m5104a()) {
                    mo14365a(C1740g.this.f2685f + " is timing out, considering JS Tag ad loaded: " + C1740g.this.f2688i);
                }
                m3761a(C1740g.this.f2688i);
                return;
            }
            if (C2102v.m5104a()) {
                mo14370d(C1740g.this.f2685f + " is timing out " + C1740g.this.f2688i + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            m3761a(C1740g.this.f2688i);
            C1740g.this.f2692m.m3754a(mo14371e(), (MaxError) new MaxErrorImpl(-5101, "Adapter timed out"));
        }
    }

    /* renamed from: com.applovin.impl.mediation.g$d */
    private class C1784d extends C1887a {

        /* renamed from: c */
        private final C1782b f2799c;

        private C1784d(C1782b bVar) {
            super("TaskTimeoutSignalCollection", C1740g.this.f2681b);
            this.f2799c = bVar;
        }

        public void run() {
            if (!this.f2799c.f2796c.get()) {
                if (C2102v.m5104a()) {
                    mo14370d(C1740g.this.f2685f + " is timing out " + this.f2799c.f2794a + APSSharedUtil.TRUNCATE_SEPARATOR);
                }
                C1740g gVar = C1740g.this;
                gVar.m3718b("The adapter (" + C1740g.this.f2685f + ") timed out", this.f2799c);
            }
        }
    }

    C1740g(C1588f fVar, MaxAdapter maxAdapter, boolean z, C1969m mVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("No adapter name specified");
        } else if (maxAdapter == null) {
            throw new IllegalArgumentException("No adapter specified");
        } else if (mVar != null) {
            this.f2683d = fVar.mo13431L();
            this.f2686g = maxAdapter;
            this.f2681b = mVar;
            this.f2682c = mVar.mo14509A();
            this.f2684e = fVar;
            this.f2685f = maxAdapter.getClass().getSimpleName();
            this.f2697r = z;
        } else {
            throw new IllegalArgumentException("No sdk specified");
        }
    }

    /* renamed from: a */
    private void m3712a(final Runnable runnable, final C1583a aVar) {
        m3715a("show_ad", (Runnable) new Runnable() {
            public void run() {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    String str = "Failed to start displaying ad" + aVar + " : " + th;
                    if (C2102v.m5104a()) {
                        C2102v.m5110i("MediationAdapterWrapper", str);
                    }
                    C1740g.this.f2692m.m3757b("show_ad", (MaxError) new MaxErrorImpl(-1, str));
                    C1740g.this.m3713a("show_ad");
                    C1740g.this.f2681b.mo14511C().mo13823a(C1740g.this.f2684e.mo13430K(), "show_ad", C1740g.this.f2688i);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3713a(String str) {
        if (C2102v.m5104a()) {
            C2102v vVar = this.f2682c;
            vVar.mo15014c("MediationAdapterWrapper", "Marking " + this.f2685f + " as disabled due to: " + str);
        }
        this.f2694o.set(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3714a(String str, C1782b bVar) {
        if (bVar.f2796c.compareAndSet(false, true) && bVar.f2795b != null) {
            bVar.f2795b.onSignalCollected(str);
        }
    }

    /* renamed from: a */
    private void m3715a(final String str, final Runnable runnable) {
        C17588 r0 = new Runnable() {
            public void run() {
                try {
                    if (C2102v.m5104a()) {
                        C2102v c = C1740g.this.f2682c;
                        c.mo15012b("MediationAdapterWrapper", C1740g.this.f2685f + ": running " + str + APSSharedUtil.TRUNCATE_SEPARATOR);
                    }
                    runnable.run();
                    if (C2102v.m5104a()) {
                        C2102v c2 = C1740g.this.f2682c;
                        c2.mo15012b("MediationAdapterWrapper", C1740g.this.f2685f + ": finished " + str + "");
                    }
                } catch (Throwable th) {
                    if (C2102v.m5104a()) {
                        C2102v.m5106c("MediationAdapterWrapper", "Unable to run adapter operation " + str + ", marking " + C1740g.this.f2685f + " as disabled", th);
                    }
                    C1740g gVar = C1740g.this;
                    gVar.m3713a("fail_" + str);
                    if (!str.equals("destroy")) {
                        C1740g.this.f2681b.mo14511C().mo13823a(C1740g.this.f2684e.mo13430K(), str, C1740g.this.f2688i);
                    }
                }
            }
        };
        if (this.f2684e.mo13438S()) {
            this.f2680a.post(r0);
        } else {
            r0.run();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m3718b(String str, C1782b bVar) {
        if (bVar.f2796c.compareAndSet(false, true) && bVar.f2795b != null) {
            bVar.f2795b.onSignalCollectionFailed(str);
        }
    }

    /* renamed from: b */
    private boolean m3719b(C1583a aVar, Activity activity) {
        MaxErrorImpl maxErrorImpl;
        if (aVar != null) {
            if (aVar.mo13366g() == null) {
                if (C2102v.m5104a()) {
                    C2102v.m5110i("MediationAdapterWrapper", "Adapter has been garbage collected");
                }
                maxErrorImpl = new MaxErrorImpl(-1, "Adapter has been garbage collected");
            } else if (aVar.mo13366g() != this) {
                throw new IllegalArgumentException("Mediated ad belongs to a different adapter");
            } else if (activity == null) {
                throw new IllegalArgumentException("No activity specified");
            } else if (!this.f2694o.get()) {
                String str = "Mediation adapter '" + this.f2685f + "' is disabled. Showing ads with this adapter is disabled.";
                if (C2102v.m5104a()) {
                    C2102v.m5110i("MediationAdapterWrapper", str);
                }
                maxErrorImpl = new MaxErrorImpl(-1, str);
            } else if (mo13843g()) {
                return true;
            } else {
                throw new IllegalStateException("Mediation adapter '" + this.f2685f + "' does not have an ad loaded. Please load an ad first");
            }
            this.f2692m.m3757b("ad_show", (MaxError) maxErrorImpl);
            return false;
        }
        throw new IllegalArgumentException("No mediated ad specified");
    }

    /* renamed from: a */
    public View mo13830a() {
        return this.f2689j;
    }

    /* renamed from: a */
    public void mo13831a(C1583a aVar, final Activity activity) {
        Runnable runnable;
        if (m3719b(aVar, activity)) {
            if (aVar.getFormat() == MaxAdFormat.INTERSTITIAL) {
                runnable = new Runnable() {
                    public void run() {
                        ((MaxInterstitialAdapter) C1740g.this.f2686g).showInterstitialAd(C1740g.this.f2693n, activity, C1740g.this.f2692m);
                    }
                };
            } else if (aVar.getFormat() == MaxAdFormat.REWARDED) {
                runnable = new Runnable() {
                    public void run() {
                        ((MaxRewardedAdapter) C1740g.this.f2686g).showRewardedAd(C1740g.this.f2693n, activity, C1740g.this.f2692m);
                    }
                };
            } else if (aVar.getFormat() == MaxAdFormat.REWARDED_INTERSTITIAL) {
                runnable = new Runnable() {
                    public void run() {
                        ((MaxRewardedInterstitialAdapter) C1740g.this.f2686g).showRewardedInterstitialAd(C1740g.this.f2693n, activity, C1740g.this.f2692m);
                    }
                };
            } else {
                throw new IllegalStateException("Failed to show " + aVar + ": " + aVar.getFormat() + " is not a supported ad format");
            }
            m3712a(runnable, aVar);
        }
    }

    /* renamed from: a */
    public void mo13832a(C1583a aVar, final ViewGroup viewGroup, final Lifecycle lifecycle, final Activity activity) {
        Runnable runnable;
        if (m3719b(aVar, activity)) {
            if (aVar.getFormat() == MaxAdFormat.INTERSTITIAL) {
                runnable = new Runnable() {
                    public void run() {
                        ((MaxInterstitialAdViewAdapter) C1740g.this.f2686g).showInterstitialAd(C1740g.this.f2693n, viewGroup, lifecycle, activity, C1740g.this.f2692m);
                    }
                };
            } else if (aVar.getFormat() == MaxAdFormat.REWARDED) {
                runnable = new Runnable() {
                    public void run() {
                        ((MaxRewardedAdViewAdapter) C1740g.this.f2686g).showRewardedAd(C1740g.this.f2693n, viewGroup, lifecycle, activity, C1740g.this.f2692m);
                    }
                };
            } else {
                throw new IllegalStateException("Failed to show " + aVar + ": " + aVar.getFormat() + " is not a supported ad format");
            }
            m3712a(runnable, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo13833a(final MaxAdapterInitializationParameters maxAdapterInitializationParameters, final Activity activity, final Runnable runnable) {
        m3715a("initialize", (Runnable) new Runnable() {
            public void run() {
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                if (C2102v.m5104a()) {
                    C2102v c = C1740g.this.f2682c;
                    c.mo15012b("MediationAdapterWrapper", "Initializing " + C1740g.this.f2685f + " on thread: " + Thread.currentThread() + " with 'run_on_ui_thread' value: " + C1740g.this.f2684e.mo13438S());
                }
                C1740g.this.f2686g.initialize(maxAdapterInitializationParameters, activity, new MaxAdapter.OnCompletionListener() {
                    public void onCompletion(final MaxAdapter.InitializationStatus initializationStatus, final String str) {
                        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                            public void run() {
                                C1740g.this.f2681b.mo14512D().mo13812a(C1740g.this.f2684e, SystemClock.elapsedRealtime() - elapsedRealtime, initializationStatus, str);
                                if (runnable != null) {
                                    runnable.run();
                                }
                            }
                        }, C1740g.this.f2684e.mo13443X());
                    }
                });
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo13834a(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, C1591h hVar, Activity activity, MaxSignalCollectionListener maxSignalCollectionListener) {
        if (maxSignalCollectionListener == null) {
            throw new IllegalArgumentException("No callback specified");
        } else if (!this.f2694o.get()) {
            if (C2102v.m5104a()) {
                C2102v.m5110i("MediationAdapterWrapper", "Mediation adapter '" + this.f2685f + "' is disabled. Signal collection ads with this adapter is disabled.");
            }
            maxSignalCollectionListener.onSignalCollectionFailed("The adapter (" + this.f2685f + ") is disabled");
        } else {
            final C1782b bVar = new C1782b(hVar, maxSignalCollectionListener);
            MaxAdapter maxAdapter = this.f2686g;
            if (maxAdapter instanceof MaxSignalProvider) {
                final MaxSignalProvider maxSignalProvider = (MaxSignalProvider) maxAdapter;
                final MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters2 = maxAdapterSignalCollectionParameters;
                final Activity activity2 = activity;
                final C1591h hVar2 = hVar;
                m3715a("collect_signal", (Runnable) new Runnable() {
                    public void run() {
                        try {
                            maxSignalProvider.collectSignal(maxAdapterSignalCollectionParameters2, activity2, new MaxSignalCollectionListener() {
                                public void onSignalCollected(String str) {
                                    C1740g.this.m3714a(str, bVar);
                                }

                                public void onSignalCollectionFailed(String str) {
                                    C1740g.this.m3718b(str, bVar);
                                }
                            });
                        } catch (Throwable th) {
                            C1740g gVar = C1740g.this;
                            gVar.m3718b("Failed signal collection for " + C1740g.this.f2683d + " due to exception: " + th, bVar);
                            C1740g.this.m3713a("collect_signal");
                            C1740g.this.f2681b.mo14511C().mo13823a(C1740g.this.f2684e.mo13430K(), "collect_signal", C1740g.this.f2688i);
                        }
                        if (bVar.f2796c.get()) {
                            return;
                        }
                        if (hVar2.mo13442W() == 0) {
                            if (C2102v.m5104a()) {
                                C2102v c = C1740g.this.f2682c;
                                c.mo15012b("MediationAdapterWrapper", "Failing signal collection " + hVar2 + " since it has 0 timeout");
                            }
                            C1740g gVar2 = C1740g.this;
                            gVar2.m3718b("The adapter (" + C1740g.this.f2685f + ") has 0 timeout", bVar);
                        } else if (hVar2.mo13442W() > 0) {
                            if (C2102v.m5104a()) {
                                C2102v c2 = C1740g.this.f2682c;
                                c2.mo15012b("MediationAdapterWrapper", "Setting timeout " + hVar2.mo13442W() + "ms. for " + hVar2);
                            }
                            C1740g.this.f2681b.mo14526S().mo14430a((C1887a) new C1784d(bVar), C1918o.C1920a.MEDIATION_TIMEOUT, hVar2.mo13442W());
                        } else if (C2102v.m5104a()) {
                            C2102v c3 = C1740g.this.f2682c;
                            c3.mo15012b("MediationAdapterWrapper", "Negative timeout set for " + hVar2 + ", not scheduling a timeout");
                        }
                    }
                });
                return;
            }
            m3718b("The adapter (" + this.f2685f + ") does not support signal collection", bVar);
        }
    }

    /* renamed from: a */
    public void mo13835a(MaxNativeAdView maxNativeAdView) {
        this.f2691l = maxNativeAdView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo13836a(String str, C1583a aVar) {
        this.f2687h = str;
        this.f2688i = aVar;
    }

    /* renamed from: a */
    public void mo13837a(String str, final MaxAdapterResponseParameters maxAdapterResponseParameters, final C1583a aVar, final Activity activity, MediationServiceImpl.C1579a aVar2) {
        final Runnable runnable;
        if (aVar == null) {
            throw new IllegalArgumentException("No mediated ad specified");
        } else if (!this.f2694o.get()) {
            String str2 = "Mediation adapter '" + this.f2685f + "' was disabled due to earlier failures. Loading ads with this adapter is disabled.";
            if (C2102v.m5104a()) {
                C2102v.m5110i("MediationAdapterWrapper", str2);
            }
            aVar2.onAdLoadFailed(str, new MaxErrorImpl(-1, str2));
        } else {
            this.f2693n = maxAdapterResponseParameters;
            this.f2692m.m3749a(aVar2);
            if (aVar.getFormat() == MaxAdFormat.INTERSTITIAL) {
                runnable = new Runnable() {
                    public void run() {
                        ((MaxInterstitialAdapter) C1740g.this.f2686g).loadInterstitialAd(maxAdapterResponseParameters, activity, C1740g.this.f2692m);
                    }
                };
            } else if (aVar.getFormat() == MaxAdFormat.REWARDED) {
                runnable = new Runnable() {
                    public void run() {
                        ((MaxRewardedAdapter) C1740g.this.f2686g).loadRewardedAd(maxAdapterResponseParameters, activity, C1740g.this.f2692m);
                    }
                };
            } else if (aVar.getFormat() == MaxAdFormat.REWARDED_INTERSTITIAL) {
                runnable = new Runnable() {
                    public void run() {
                        ((MaxRewardedInterstitialAdapter) C1740g.this.f2686g).loadRewardedInterstitialAd(maxAdapterResponseParameters, activity, C1740g.this.f2692m);
                    }
                };
            } else if (aVar.getFormat() == MaxAdFormat.NATIVE) {
                runnable = new Runnable() {
                    public void run() {
                        ((MediationAdapterBase) C1740g.this.f2686g).loadNativeAd(maxAdapterResponseParameters, activity, C1740g.this.f2692m);
                    }
                };
            } else if (aVar.getFormat().isAdViewAd()) {
                runnable = new Runnable() {
                    public void run() {
                        ((MaxAdViewAdapter) C1740g.this.f2686g).loadAdViewAd(maxAdapterResponseParameters, aVar.getFormat(), activity, C1740g.this.f2692m);
                    }
                };
            } else {
                throw new IllegalStateException("Failed to load " + aVar + ": " + aVar.getFormat() + " is not a supported ad format");
            }
            m3715a("load_ad", (Runnable) new Runnable() {
                public void run() {
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        String str = "Failed start loading " + aVar + " : " + th;
                        if (C2102v.m5104a()) {
                            C2102v.m5110i("MediationAdapterWrapper", str);
                        }
                        C1740g.this.f2692m.m3754a("load_ad", (MaxError) new MaxErrorImpl(-1, str));
                        C1740g.this.m3713a("load_ad");
                        C1740g.this.f2681b.mo14511C().mo13823a(C1740g.this.f2684e.mo13430K(), "load_ad", C1740g.this.f2688i);
                    }
                    if (!C1740g.this.f2695p.get()) {
                        long W = C1740g.this.f2684e.mo13442W();
                        if (W > 0) {
                            if (C2102v.m5104a()) {
                                C1740g.this.f2682c.mo15012b("MediationAdapterWrapper", "Setting timeout " + W + "ms. for " + aVar);
                            }
                            C1740g.this.f2681b.mo14526S().mo14430a((C1887a) new C1783c(), C1918o.C1920a.MEDIATION_TIMEOUT, W);
                        } else if (C2102v.m5104a()) {
                            C1740g.this.f2682c.mo15012b("MediationAdapterWrapper", "Negative timeout set for " + aVar + ", not scheduling a timeout");
                        }
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public MaxNativeAd mo13838b() {
        return this.f2690k;
    }

    /* renamed from: c */
    public MaxNativeAdView mo13839c() {
        return this.f2691l;
    }

    /* renamed from: d */
    public String mo13840d() {
        return this.f2683d;
    }

    /* renamed from: e */
    public MediationServiceImpl.C1579a mo13841e() {
        return this.f2692m.f2755b;
    }

    /* renamed from: f */
    public boolean mo13842f() {
        return this.f2694o.get();
    }

    /* renamed from: g */
    public boolean mo13843g() {
        return this.f2695p.get() && this.f2696q.get();
    }

    /* renamed from: h */
    public String mo13844h() {
        MaxAdapter maxAdapter = this.f2686g;
        if (maxAdapter == null) {
            return null;
        }
        try {
            return maxAdapter.getSdkVersion();
        } catch (Throwable th) {
            if (C2102v.m5104a()) {
                C2102v.m5106c("MediationAdapterWrapper", "Unable to get adapter's SDK version, marking " + this + " as disabled", th);
            }
            m3713a("sdk_version");
            this.f2681b.mo14511C().mo13823a(this.f2684e.mo13430K(), "sdk_version", this.f2688i);
            return null;
        }
    }

    /* renamed from: i */
    public String mo13845i() {
        MaxAdapter maxAdapter = this.f2686g;
        if (maxAdapter == null) {
            return null;
        }
        try {
            return maxAdapter.getAdapterVersion();
        } catch (Throwable th) {
            if (C2102v.m5104a()) {
                C2102v.m5106c("MediationAdapterWrapper", "Unable to get adapter version, marking " + this + " as disabled", th);
            }
            m3713a(TapjoyConstants.TJC_ADAPTER_VERSION);
            this.f2681b.mo14511C().mo13823a(this.f2684e.mo13430K(), TapjoyConstants.TJC_ADAPTER_VERSION, this.f2688i);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo13846j() {
        if (!this.f2697r) {
            m3715a("destroy", (Runnable) new Runnable() {
                public void run() {
                    C1740g.this.m3713a("destroy");
                    C1740g.this.f2686g.onDestroy();
                    MaxAdapter unused = C1740g.this.f2686g = null;
                    View unused2 = C1740g.this.f2689j = null;
                    MaxNativeAd unused3 = C1740g.this.f2690k = null;
                    MaxNativeAdView unused4 = C1740g.this.f2691l = null;
                }
            });
        }
    }

    public String toString() {
        return "MediationAdapterWrapper{adapterTag='" + this.f2685f + "'" + '}';
    }
}
