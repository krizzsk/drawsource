package com.applovin.impl.mediation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.mediation.ads.C1614a;
import com.applovin.impl.mediation.p031a.C1583a;
import com.applovin.impl.mediation.p031a.C1585c;
import com.applovin.impl.mediation.p031a.C1587e;
import com.applovin.impl.mediation.p031a.C1588f;
import com.applovin.impl.mediation.p031a.C1589g;
import com.applovin.impl.mediation.p031a.C1591h;
import com.applovin.impl.mediation.p034c.C1639d;
import com.applovin.impl.mediation.p034c.C1646f;
import com.applovin.impl.mediation.p034c.C1647g;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.p051c.C1866a;
import com.applovin.impl.sdk.p053e.C1887a;
import com.applovin.impl.sdk.p053e.C1918o;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.C2053j;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

public class MediationServiceImpl implements AppLovinBroadcastManager.Receiver {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1969m f2051a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2102v f2052b;

    /* renamed from: c */
    private final AtomicReference<JSONObject> f2053c = new AtomicReference<>();

    /* renamed from: com.applovin.impl.mediation.MediationServiceImpl$a */
    public class C1579a implements C1614a.C1615a, MaxAdListener, MaxAdRevenueListener, MaxAdViewAdListener, MaxRewardedAdListener {

        /* renamed from: b */
        private final C1583a f2075b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C1614a.C1615a f2076c;

        public C1579a(C1583a aVar, C1614a.C1615a aVar2) {
            this.f2075b = aVar;
            this.f2076c = aVar2;
        }

        /* renamed from: a */
        public void mo13345a(C1614a.C1615a aVar) {
            this.f2076c = aVar;
        }

        /* renamed from: a */
        public void mo13346a(MaxAd maxAd, Bundle bundle) {
            this.f2075b.mo13391r();
            this.f2075b.mo13357a(bundle);
            MediationServiceImpl.this.m2977a(this.f2075b);
            C2053j.m4982a((MaxAdListener) this.f2076c, maxAd);
        }

        /* renamed from: b */
        public void mo13347b(MaxAd maxAd, Bundle bundle) {
            if (C2102v.m5104a()) {
                MediationServiceImpl.this.f2052b.mo15012b("MediationService", "Scheduling impression for ad via callback...");
            }
            MediationServiceImpl.this.processCallbackAdImpressionPostback(this.f2075b, this.f2076c);
            this.f2075b.mo13357a(bundle);
            MediationServiceImpl.this.f2051a.mo14557ag().mo14482a(this.f2075b, "DID_DISPLAY");
            if (maxAd.getFormat().isFullscreenAd()) {
                MediationServiceImpl.this.f2051a.mo14555ae().mo14866a((Object) maxAd);
                MediationServiceImpl.this.f2051a.mo14561ak().mo14604a((Object) maxAd);
            }
            C2053j.m5008b((MaxAdListener) this.f2076c, maxAd);
        }

        /* renamed from: c */
        public void mo13348c(final MaxAd maxAd, Bundle bundle) {
            if (bundle != null && bundle.size() > 0) {
                ((C1583a) maxAd).mo13360a(BundleUtils.toJSONObject(bundle.getBundle(Utils.KEY_AD_VALUES)));
            }
            MediationServiceImpl.this.f2051a.mo14557ag().mo14482a((C1583a) maxAd, "DID_HIDE");
            long j = 0;
            if (maxAd instanceof C1585c) {
                j = ((C1585c) maxAd).mo13403A();
            }
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                public void run() {
                    if (maxAd.getFormat().isFullscreenAd()) {
                        MediationServiceImpl.this.f2051a.mo14555ae().mo14869b((Object) maxAd);
                        MediationServiceImpl.this.f2051a.mo14561ak().mo14603a();
                    }
                    C2053j.m5013c(C1579a.this.f2076c, maxAd);
                }
            }, j);
        }

        /* renamed from: d */
        public void mo13349d(MaxAd maxAd, Bundle bundle) {
            if (bundle != null && bundle.size() > 0) {
                ((C1583a) maxAd).mo13360a(BundleUtils.toJSONObject(bundle.getBundle(Utils.KEY_AD_VALUES)));
            }
            MediationServiceImpl.this.m2978a(this.f2075b, this.f2076c);
            C2053j.m5016d(this.f2076c, maxAd);
        }

        public void onAdClicked(MaxAd maxAd) {
            mo13349d(maxAd, (Bundle) null);
        }

        public void onAdCollapsed(MaxAd maxAd) {
            C2053j.m5024h(this.f2076c, maxAd);
        }

        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            MediationServiceImpl.this.m2989b(this.f2075b, maxError, this.f2076c);
            if ((maxAd.getFormat() == MaxAdFormat.REWARDED || maxAd.getFormat() == MaxAdFormat.REWARDED_INTERSTITIAL) && (maxAd instanceof C1585c)) {
                ((C1585c) maxAd).mo13408F();
            }
        }

        public void onAdDisplayed(MaxAd maxAd) {
            mo13347b(maxAd, (Bundle) null);
        }

        public void onAdExpanded(MaxAd maxAd) {
            C2053j.m5022g(this.f2076c, maxAd);
        }

        public void onAdHidden(MaxAd maxAd) {
            mo13348c(maxAd, (Bundle) null);
        }

        public void onAdLoadFailed(String str, MaxError maxError) {
            this.f2075b.mo13391r();
            MediationServiceImpl.this.m2979a(this.f2075b, maxError, (MaxAdListener) this.f2076c);
        }

        public void onAdLoaded(MaxAd maxAd) {
            mo13346a(maxAd, (Bundle) null);
        }

        public void onAdRevenuePaid(MaxAd maxAd) {
        }

        public void onRewardedVideoCompleted(MaxAd maxAd) {
            C2053j.m5020f(this.f2076c, maxAd);
        }

        public void onRewardedVideoStarted(MaxAd maxAd) {
            C2053j.m5018e(this.f2076c, maxAd);
        }

        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            C2053j.m4985a((MaxAdListener) this.f2076c, maxAd, maxReward);
            MediationServiceImpl.this.f2051a.mo14526S().mo14429a((C1887a) new C1646f((C1585c) maxAd, MediationServiceImpl.this.f2051a), C1918o.C1920a.MEDIATION_REWARD);
        }
    }

    public MediationServiceImpl(C1969m mVar) {
        this.f2051a = mVar;
        this.f2052b = mVar.mo14509A();
        mVar.mo14560aj().registerReceiver(this, new IntentFilter("com.applovin.render_process_gone"));
    }

    /* renamed from: a */
    private C1740g m2969a(C1585c cVar) {
        C1740g g = cVar.mo13366g();
        if (g != null) {
            return g;
        }
        this.f2051a.mo14555ae().mo14867a(false);
        if (C2102v.m5104a()) {
            C2102v vVar = this.f2052b;
            vVar.mo15015d("MediationService", "Failed to show " + cVar + ": adapter not found");
            C2102v.m5110i("MediationService", "There may be an integration problem with the adapter for ad unit id '" + cVar.getAdUnitId() + "'. Please check if you have a supported version of that SDK integrated into your project.");
        }
        throw new IllegalStateException("Could not find adapter for provided ad");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2977a(C1583a aVar) {
        this.f2051a.mo14557ag().mo14482a(aVar, "DID_LOAD");
        if (aVar.mo13363d().endsWith("load")) {
            this.f2051a.mo14557ag().mo14481a(aVar);
        }
        long o = aVar.mo13388o();
        HashMap hashMap = new HashMap(1);
        hashMap.put("{LOAD_TIME_MS}", String.valueOf(o));
        m2985a("load", (Map<String, String>) hashMap, (C1588f) aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2978a(C1583a aVar, C1614a.C1615a aVar2) {
        this.f2051a.mo14557ag().mo14482a(aVar, "DID_CLICKED");
        this.f2051a.mo14557ag().mo14482a(aVar, "DID_CLICK");
        if (aVar.mo13363d().endsWith("click")) {
            this.f2051a.mo14557ag().mo14481a(aVar);
            C2053j.m4990a((MaxAdRevenueListener) aVar2, (MaxAd) aVar);
        }
        m2983a("mclick", (C1588f) aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2979a(C1583a aVar, MaxError maxError, MaxAdListener maxAdListener) {
        m2982a(maxError, aVar);
        destroyAd(aVar);
        C2053j.m4988a(maxAdListener, aVar.getAdUnitId(), maxError);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2980a(C1585c cVar, C1614a.C1615a aVar) {
        this.f2051a.mo14555ae().mo14867a(false);
        m2981a(cVar, (MaxAdListener) aVar);
        if (C2102v.m5104a()) {
            this.f2052b.mo15012b("MediationService", "Scheduling impression for ad manually...");
        }
        processRawAdImpressionPostback(cVar, aVar);
    }

    /* renamed from: a */
    private void m2981a(C1585c cVar, MaxAdListener maxAdListener) {
        long longValue = ((Long) this.f2051a.mo14534a(C1866a.f3052F)).longValue();
        if (longValue > 0) {
            final C1585c cVar2 = cVar;
            final long j = longValue;
            final MaxAdListener maxAdListener2 = maxAdListener;
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                public void run() {
                    if (!cVar2.mo13392s().get()) {
                        String str = "Ad (" + cVar2.mo13432M() + ") has not been displayed after " + j + "ms. Failing ad display...";
                        if (C2102v.m5104a()) {
                            C2102v.m5110i("MediationService", str);
                        }
                        MediationServiceImpl.this.m2989b(cVar2, new MaxErrorImpl(-1, str), maxAdListener2);
                        MediationServiceImpl.this.f2051a.mo14555ae().mo14869b((Object) cVar2);
                        MediationServiceImpl.this.f2051a.mo14561ak().mo14603a();
                    }
                }
            }, longValue);
        }
    }

    /* renamed from: a */
    private void m2982a(MaxError maxError, C1583a aVar) {
        long o = aVar.mo13388o();
        HashMap hashMap = new HashMap(1);
        hashMap.put("{LOAD_TIME_MS}", String.valueOf(o));
        m2986a("mlerr", (Map<String, String>) hashMap, maxError, (C1588f) aVar);
    }

    /* renamed from: a */
    private void m2983a(String str, C1588f fVar) {
        m2986a(str, (Map<String, String>) Collections.EMPTY_MAP, (MaxError) null, fVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m2984a(String str, C1591h hVar, C1740g gVar) {
        HashMap hashMap = new HashMap(2);
        Utils.putObjectForStringIfValid("{ADAPTER_VERSION}", gVar.mo13845i(), hashMap);
        Utils.putObjectForStringIfValid("{SDK_VERSION}", gVar.mo13844h(), hashMap);
        m2986a("serr", (Map<String, String>) hashMap, (MaxError) new MaxErrorImpl(str), (C1588f) hVar);
    }

    /* renamed from: a */
    private void m2985a(String str, Map<String, String> map, C1588f fVar) {
        m2986a(str, map, (MaxError) null, fVar);
    }

    /* renamed from: a */
    private void m2986a(String str, Map<String, String> map, MaxError maxError, C1588f fVar) {
        HashMap hashMap = new HashMap(map);
        hashMap.put("{PLACEMENT}", StringUtils.emptyIfNull(fVar.getPlacement()));
        hashMap.put("{CUSTOM_DATA}", StringUtils.emptyIfNull(fVar.mo13445Z()));
        if (fVar instanceof C1583a) {
            hashMap.put("{CREATIVE_ID}", StringUtils.emptyIfNull(((C1583a) fVar).getCreativeId()));
        }
        this.f2051a.mo14526S().mo14429a((C1887a) new C1639d(str, hashMap, maxError, fVar, this.f2051a), C1918o.C1920a.MEDIATION_POSTBACKS);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m2989b(C1583a aVar, MaxError maxError, MaxAdListener maxAdListener) {
        this.f2051a.mo14557ag().mo14482a(aVar, "DID_FAIL_DISPLAY");
        processAdDisplayErrorPostback(maxError, aVar);
        if (aVar.mo13392s().compareAndSet(false, true)) {
            C2053j.m4983a(maxAdListener, (MaxAd) aVar, maxError);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m2990b(C1585c cVar) {
        if (cVar.getFormat() == MaxAdFormat.REWARDED || cVar.getFormat() == MaxAdFormat.REWARDED_INTERSTITIAL) {
            this.f2051a.mo14526S().mo14429a((C1887a) new C1647g(cVar, this.f2051a), C1918o.C1920a.MEDIATION_REWARD);
        }
    }

    public void collectSignal(MaxAdFormat maxAdFormat, final C1591h hVar, Context context, final C1589g.C1590a aVar) {
        String str;
        C2102v vVar;
        String str2;
        StringBuilder sb;
        if (hVar == null) {
            throw new IllegalArgumentException("No spec specified");
        } else if (context == null) {
            throw new IllegalArgumentException("No context specified");
        } else if (aVar != null) {
            final C1740g a = this.f2051a.mo14511C().mo13821a(hVar, true);
            if (a != null) {
                Activity an = context instanceof Activity ? (Activity) context : this.f2051a.mo14564an();
                MaxAdapterParametersImpl a2 = MaxAdapterParametersImpl.m2968a(hVar, maxAdFormat);
                if (((Boolean) this.f2051a.mo14534a(C1866a.f3064R)).booleanValue()) {
                    this.f2051a.mo14512D().mo13813a((C1588f) hVar, an);
                }
                C15773 r1 = new MaxSignalCollectionListener() {
                    public void onSignalCollected(String str) {
                        aVar.mo13476a(C1589g.m3106a(hVar, a, str));
                        a.mo13846j();
                    }

                    public void onSignalCollectionFailed(String str) {
                        MediationServiceImpl.this.m2984a(str, hVar, a);
                        aVar.mo13476a(C1589g.m3108b(hVar, a, str));
                        a.mo13846j();
                    }
                };
                if (!hVar.mo13356a()) {
                    if (C2102v.m5104a()) {
                        vVar = this.f2052b;
                        sb = new StringBuilder();
                        str2 = "Collecting signal for adapter: ";
                    }
                    a.mo13834a((MaxAdapterSignalCollectionParameters) a2, hVar, an, (MaxSignalCollectionListener) r1);
                    return;
                } else if (this.f2051a.mo14512D().mo13817a((C1588f) hVar)) {
                    if (C2102v.m5104a()) {
                        vVar = this.f2052b;
                        sb = new StringBuilder();
                        str2 = "Collecting signal for now-initialized adapter: ";
                    }
                    a.mo13834a((MaxAdapterSignalCollectionParameters) a2, hVar, an, (MaxSignalCollectionListener) r1);
                    return;
                } else {
                    if (C2102v.m5104a()) {
                        C2102v vVar2 = this.f2052b;
                        vVar2.mo15016e("MediationService", "Skip collecting signal for not-initialized adapter: " + a.mo13840d());
                    }
                    str = "Adapter not initialized yet";
                }
                sb.append(str2);
                sb.append(a.mo13840d());
                vVar.mo15012b("MediationService", sb.toString());
                a.mo13834a((MaxAdapterSignalCollectionParameters) a2, hVar, an, (MaxSignalCollectionListener) r1);
                return;
            }
            str = "Could not load adapter";
            aVar.mo13476a(C1589g.m3107a(hVar, str));
        } else {
            throw new IllegalArgumentException("No callback specified");
        }
    }

    public void destroyAd(MaxAd maxAd) {
        if (maxAd instanceof C1583a) {
            if (C2102v.m5104a()) {
                C2102v vVar = this.f2052b;
                vVar.mo15014c("MediationService", "Destroying " + maxAd);
            }
            C1583a aVar = (C1583a) maxAd;
            C1740g g = aVar.mo13366g();
            if (g != null) {
                g.mo13846j();
                aVar.mo13393t();
            }
            this.f2051a.mo14510B().mo14362c(aVar.mo13365f());
        }
    }

    public JSONObject getAndResetCustomPostBodyData() {
        return this.f2053c.getAndSet((Object) null);
    }

    public void loadAd(String str, String str2, MaxAdFormat maxAdFormat, Map<String, Object> map, Map<String, Object> map2, Context context, C1614a.C1615a aVar) {
        String str3 = str;
        C1614a.C1615a aVar2 = aVar;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No ad unit ID specified");
        } else if (context == null) {
            throw new IllegalArgumentException("No context specified");
        } else if (aVar2 != null) {
            if (C2102v.m5104a() && TextUtils.isEmpty(this.f2051a.mo14590t())) {
                C2102v.m5110i("AppLovinSdk", "Mediation provider is null. Please set AppLovin SDK mediation provider via AppLovinSdk.getInstance(context).setMediationProvider()");
            }
            if (C2102v.m5104a() && !this.f2051a.mo14574d()) {
                C2102v.m5109h("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
            }
            this.f2051a.mo14537a();
            if (str.length() != 16 && !str.startsWith("test_mode") && !this.f2051a.mo14597z().startsWith("05TMD") && C2102v.m5104a()) {
                C2102v.m5110i("MediationService", "Please double-check the ad unit " + str + " for " + maxAdFormat.getLabel() + " : " + Log.getStackTraceString(new Throwable("")));
            }
            MaxAdFormat maxAdFormat2 = maxAdFormat;
            if (this.f2051a.mo14550a(maxAdFormat)) {
                if (C2102v.m5104a()) {
                    C2102v.m5110i("MediationService", "Ad load failed due to disabled ad format " + maxAdFormat.getLabel());
                }
                C2053j.m4988a((MaxAdListener) aVar2, str, (MaxError) new MaxErrorImpl(-1, "Disabled ad format " + maxAdFormat.getLabel()));
                return;
            }
            this.f2051a.mo14517I().mo13604a(str, str2, maxAdFormat, map, map2, context, aVar);
        } else {
            throw new IllegalArgumentException("No listener specified");
        }
    }

    public void loadThirdPartyMediatedAd(String str, C1583a aVar, Activity activity, C1614a.C1615a aVar2) {
        if (aVar != null) {
            if (C2102v.m5104a()) {
                this.f2052b.mo15012b("MediationService", "Loading " + aVar + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            this.f2051a.mo14557ag().mo14482a(aVar, "WILL_LOAD");
            C1740g a = this.f2051a.mo14511C().mo13820a((C1588f) aVar);
            if (a != null) {
                MaxAdapterParametersImpl a2 = MaxAdapterParametersImpl.m2966a(aVar);
                if (((Boolean) this.f2051a.mo14534a(C1866a.f3065S)).booleanValue()) {
                    this.f2051a.mo14512D().mo13813a((C1588f) aVar, activity);
                }
                C1583a a3 = aVar.mo13355a(a);
                a.mo13836a(str, a3);
                a3.mo13389p();
                a.mo13837a(str, a2, a3, activity, new C1579a(a3, aVar2));
                return;
            }
            String str2 = "Failed to load " + aVar + ": adapter not loaded";
            if (C2102v.m5104a()) {
                C2102v.m5110i("MediationService", str2);
            }
            m2979a(aVar, (MaxError) new MaxErrorImpl(-5001, str2), (MaxAdListener) aVar2);
            return;
        }
        throw new IllegalArgumentException("No mediated ad specified");
    }

    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        if ("com.applovin.render_process_gone".equals(intent.getAction())) {
            Object c = this.f2051a.mo14555ae().mo14871c();
            if (c instanceof C1583a) {
                processAdDisplayErrorPostback(MaxAdapterError.WEBVIEW_ERROR, (C1583a) c);
            }
        }
    }

    public void processAdDisplayErrorPostback(MaxError maxError, C1583a aVar) {
        m2986a("mierr", (Map<String, String>) Collections.EMPTY_MAP, maxError, (C1588f) aVar);
    }

    public void processAdLossPostback(C1583a aVar, Float f) {
        String f2 = f != null ? f.toString() : "";
        HashMap hashMap = new HashMap(1);
        hashMap.put("{MBR}", f2);
        m2985a("mloss", (Map<String, String>) hashMap, (C1588f) aVar);
    }

    public void processAdapterInitializationPostback(C1588f fVar, long j, MaxAdapter.InitializationStatus initializationStatus, String str) {
        HashMap hashMap = new HashMap(3);
        hashMap.put("{INIT_STATUS}", String.valueOf(initializationStatus.getCode()));
        hashMap.put("{INIT_TIME_MS}", String.valueOf(j));
        m2986a("minit", (Map<String, String>) hashMap, (MaxError) new MaxErrorImpl(str), fVar);
    }

    public void processCallbackAdImpressionPostback(C1583a aVar, C1614a.C1615a aVar2) {
        if (aVar.mo13363d().endsWith("cimp")) {
            this.f2051a.mo14557ag().mo14481a(aVar);
            C2053j.m4990a((MaxAdRevenueListener) aVar2, (MaxAd) aVar);
        }
        m2983a("mcimp", (C1588f) aVar);
    }

    public void processRawAdImpressionPostback(C1583a aVar, C1614a.C1615a aVar2) {
        this.f2051a.mo14557ag().mo14482a(aVar, "WILL_DISPLAY");
        if (aVar.mo13363d().endsWith("mimp")) {
            this.f2051a.mo14557ag().mo14481a(aVar);
            C2053j.m4990a((MaxAdRevenueListener) aVar2, (MaxAd) aVar);
        }
        HashMap hashMap = new HashMap(1);
        if (aVar instanceof C1585c) {
            hashMap.put("{TIME_TO_SHOW_MS}", String.valueOf(((C1585c) aVar).mo13415y()));
        }
        m2985a("mimp", (Map<String, String>) hashMap, (C1588f) aVar);
    }

    public void processViewabilityAdImpressionPostback(C1587e eVar, long j, C1614a.C1615a aVar) {
        if (eVar.mo13363d().endsWith("vimp")) {
            this.f2051a.mo14557ag().mo14481a((C1583a) eVar);
            C2053j.m4990a((MaxAdRevenueListener) aVar, (MaxAd) eVar);
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("{VIEWABILITY_FLAGS}", String.valueOf(j));
        hashMap.put("{USED_VIEWABILITY_TIMER}", String.valueOf(eVar.mo13426G()));
        m2985a("mvimp", (Map<String, String>) hashMap, (C1588f) eVar);
    }

    public void setCustomPostBodyData(JSONObject jSONObject) {
        this.f2053c.set(jSONObject);
    }

    public void showFullscreenAd(C1585c cVar, Activity activity, C1614a.C1615a aVar) {
        if (cVar == null) {
            throw new IllegalArgumentException("No ad specified");
        } else if (activity != null) {
            this.f2051a.mo14555ae().mo14867a(true);
            final C1740g a = m2969a(cVar);
            long z = cVar.mo13416z();
            if (C2102v.m5104a()) {
                C2102v vVar = this.f2052b;
                vVar.mo15014c("MediationService", "Showing ad " + cVar.getAdUnitId() + " with delay of " + z + "ms...");
            }
            final C1585c cVar2 = cVar;
            final Activity activity2 = activity;
            final C1614a.C1615a aVar2 = aVar;
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                public void run() {
                    MediationServiceImpl.this.m2990b(cVar2);
                    a.mo13831a((C1583a) cVar2, activity2);
                    MediationServiceImpl.this.m2980a(cVar2, aVar2);
                }
            }, z);
        } else {
            throw new IllegalArgumentException("No activity specified");
        }
    }

    public void showFullscreenAd(C1585c cVar, ViewGroup viewGroup, Lifecycle lifecycle, Activity activity, C1614a.C1615a aVar) {
        if (cVar == null) {
            throw new IllegalArgumentException("No ad specified");
        } else if (activity != null) {
            this.f2051a.mo14555ae().mo14867a(true);
            final C1740g a = m2969a(cVar);
            long z = cVar.mo13416z();
            if (C2102v.m5104a()) {
                C2102v vVar = this.f2052b;
                vVar.mo15014c("MediationService", "Showing ad " + cVar.getAdUnitId() + " with delay of " + z + "ms...");
            }
            final C1585c cVar2 = cVar;
            final ViewGroup viewGroup2 = viewGroup;
            final Lifecycle lifecycle2 = lifecycle;
            final Activity activity2 = activity;
            final C1614a.C1615a aVar2 = aVar;
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                public void run() {
                    MediationServiceImpl.this.m2990b(cVar2);
                    a.mo13832a((C1583a) cVar2, viewGroup2, lifecycle2, activity2);
                    MediationServiceImpl.this.m2980a(cVar2, aVar2);
                }
            }, z);
        } else {
            throw new IllegalArgumentException("No activity specified");
        }
    }
}
