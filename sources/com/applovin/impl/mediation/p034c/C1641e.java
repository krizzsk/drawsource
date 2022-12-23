package com.applovin.impl.mediation.p034c;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.applovin.impl.mediation.MaxAdWaterfallInfoImpl;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.MaxMediatedNetworkInfoImpl;
import com.applovin.impl.mediation.MaxNetworkResponseInfoImpl;
import com.applovin.impl.mediation.ads.C1614a;
import com.applovin.impl.mediation.p031a.C1583a;
import com.applovin.impl.mediation.p035d.C1653a;
import com.applovin.impl.mediation.p035d.C1655c;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.p052d.C1881f;
import com.applovin.impl.sdk.p052d.C1882g;
import com.applovin.impl.sdk.p053e.C1887a;
import com.applovin.impl.sdk.utils.C2046e;
import com.applovin.impl.sdk.utils.C2053j;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdWaterfallInfo;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxNetworkResponseInfo;
import com.applovin.sdk.AppLovinSdkUtils;
import com.facebook.internal.security.CertificateUtil;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.c.e */
public class C1641e extends C1887a {

    /* renamed from: a */
    private static final AtomicBoolean f2277a = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final String f2278c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final MaxAdFormat f2279d;

    /* renamed from: e */
    private final JSONObject f2280e;

    /* renamed from: f */
    private final List<C1583a> f2281f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C1614a.C1615a f2282g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final WeakReference<Context> f2283h;

    /* renamed from: i */
    private long f2284i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final List<MaxNetworkResponseInfo> f2285j;

    /* renamed from: com.applovin.impl.mediation.c.e$a */
    private class C1644a extends C1887a {
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final long f2290c = SystemClock.elapsedRealtime();
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final int f2291d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final C1583a f2292e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final List<C1583a> f2293f;

        C1644a(int i, List<C1583a> list) {
            super(C1641e.this.mo14371e(), C1641e.this.f3496b);
            this.f2291d = i;
            this.f2292e = list.get(i);
            this.f2293f = list;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m3318a(C1583a aVar, MaxNetworkResponseInfo.AdLoadState adLoadState, long j, MaxError maxError) {
            MaxNetworkResponseInfo.AdLoadState adLoadState2 = adLoadState;
            C1641e.this.f2285j.add(new MaxNetworkResponseInfoImpl(adLoadState2, aVar.mo13381h(), new MaxMediatedNetworkInfoImpl(C1655c.m3372a(aVar.mo13430K(), this.f3496b)), j, maxError));
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public void m3327e(String str) {
        }

        public void run() {
            if (C2102v.m5104a()) {
                mo14365a("Loading ad " + (this.f2291d + 1) + " of " + this.f2293f.size() + ": " + this.f2292e.mo13431L());
            }
            m3327e("started to load ad");
            Context context = (Context) C1641e.this.f2283h.get();
            this.f3496b.mo14513E().loadThirdPartyMediatedAd(C1641e.this.f2278c, this.f2292e, context instanceof Activity ? (Activity) context : this.f3496b.mo14564an(), new C1653a(C1641e.this.f2282g) {
                public void onAdLoadFailed(String str, MaxError maxError) {
                    long elapsedRealtime = SystemClock.elapsedRealtime() - C1644a.this.f2290c;
                    if (C2102v.m5104a()) {
                        C1644a aVar = C1644a.this;
                        aVar.mo14365a("Ad failed to load in " + elapsedRealtime + " ms with error: " + maxError);
                    }
                    if (C2102v.m5104a()) {
                        C1644a aVar2 = C1644a.this;
                        aVar2.m3327e("failed to load ad: " + maxError.getCode());
                    }
                    C1644a aVar3 = C1644a.this;
                    aVar3.m3318a(aVar3.f2292e, MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD, elapsedRealtime, maxError);
                    if (C1644a.this.f2291d < C1644a.this.f2293f.size() - 1) {
                        C1644a.this.f3496b.mo14526S().mo14429a((C1887a) new C1644a(C1644a.this.f2291d + 1, C1644a.this.f2293f), C1655c.m3369a(C1641e.this.f2279d));
                        return;
                    }
                    C1641e.this.m3310a((MaxError) new MaxErrorImpl(-5001, "MAX returned eligible ads from mediated networks, but all ads failed to load. Inspect getWaterfall() for more info."));
                }

                public void onAdLoaded(MaxAd maxAd) {
                    C1644a.this.m3327e("loaded ad");
                    long elapsedRealtime = SystemClock.elapsedRealtime() - C1644a.this.f2290c;
                    if (C2102v.m5104a()) {
                        C1644a aVar = C1644a.this;
                        aVar.mo14365a("Ad loaded in " + elapsedRealtime + "ms");
                    }
                    C1583a aVar2 = (C1583a) maxAd;
                    C1644a.this.m3318a(aVar2, MaxNetworkResponseInfo.AdLoadState.AD_LOADED, elapsedRealtime, (MaxError) null);
                    int b = C1644a.this.f2291d;
                    while (true) {
                        b++;
                        if (b < C1644a.this.f2293f.size()) {
                            C1644a aVar3 = C1644a.this;
                            aVar3.m3318a((C1583a) aVar3.f2293f.get(b), MaxNetworkResponseInfo.AdLoadState.AD_LOAD_NOT_ATTEMPTED, -1, (MaxError) null);
                        } else {
                            C1641e.this.m3307a(aVar2);
                            return;
                        }
                    }
                }
            });
        }
    }

    C1641e(String str, MaxAdFormat maxAdFormat, Map<String, Object> map, JSONObject jSONObject, Context context, C1969m mVar, C1614a.C1615a aVar) {
        super("TaskProcessMediationWaterfall:" + str + CertificateUtil.DELIMITER + maxAdFormat.getLabel(), mVar);
        this.f2278c = str;
        this.f2279d = maxAdFormat;
        this.f2280e = jSONObject;
        this.f2282g = aVar;
        this.f2283h = new WeakReference<>(context);
        this.f2281f = new ArrayList(jSONObject.length());
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, CampaignUnit.JSON_KEY_ADS, new JSONArray());
        for (int i = 0; i < jSONArray.length(); i++) {
            this.f2281f.add(C1583a.m3000a(map, JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null), jSONObject, mVar));
        }
        this.f2285j = new ArrayList(this.f2281f.size());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3307a(C1583a aVar) {
        this.f3496b.mo14514F().mo15018a(aVar);
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f2284i;
        if (C2102v.m5104a()) {
            mo14367b("Waterfall loaded in " + elapsedRealtime + "ms for " + aVar.mo13431L());
        }
        aVar.mo13358a((MaxAdWaterfallInfo) new MaxAdWaterfallInfoImpl(aVar, elapsedRealtime, this.f2285j));
        C2053j.m4982a((MaxAdListener) this.f2282g, (MaxAd) aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3310a(MaxError maxError) {
        C1882g T;
        C1881f fVar;
        if (maxError.getCode() == 204) {
            T = this.f3496b.mo14527T();
            fVar = C1881f.f3480p;
        } else if (maxError.getCode() == -5001) {
            T = this.f3496b.mo14527T();
            fVar = C1881f.f3481q;
        } else {
            T = this.f3496b.mo14527T();
            fVar = C1881f.f3482r;
        }
        T.mo14351a(fVar);
        ArrayList arrayList = new ArrayList(this.f2285j.size());
        for (MaxNetworkResponseInfo next : this.f2285j) {
            if (next.getAdLoadState() == MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD) {
                arrayList.add(next);
            }
        }
        if (arrayList.size() > 0) {
            StringBuilder sb = new StringBuilder("======FAILED AD LOADS======");
            sb.append("\n");
            int i = 0;
            while (i < arrayList.size()) {
                MaxNetworkResponseInfo maxNetworkResponseInfo = (MaxNetworkResponseInfo) arrayList.get(i);
                i++;
                sb.append(i);
                sb.append(") ");
                sb.append(maxNetworkResponseInfo.getMediatedNetwork().getName());
                sb.append("\n");
                sb.append("..code: ");
                sb.append(maxNetworkResponseInfo.getError().getCode());
                sb.append("\n");
                sb.append("..message: ");
                sb.append(maxNetworkResponseInfo.getError().getMessage());
                sb.append("\n");
            }
            ((MaxErrorImpl) maxError).setAdLoadFailureInfo(sb.toString());
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f2284i;
        if (C2102v.m5104a()) {
            mo14367b("Waterfall failed in " + elapsedRealtime + "ms with error: " + maxError);
        }
        ((MaxErrorImpl) maxError).setWaterfall(new MaxAdWaterfallInfoImpl((C1583a) null, JsonUtils.getString(this.f2280e, "waterfall_name", ""), JsonUtils.getString(this.f2280e, "waterfall_test_name", ""), elapsedRealtime, this.f2285j));
        C2053j.m4988a((MaxAdListener) this.f2282g, this.f2278c, maxError);
    }

    public void run() {
        this.f2284i = SystemClock.elapsedRealtime();
        if (this.f2280e.optBoolean("is_testing", false) && !this.f3496b.mo14518J().mo13806a() && f2277a.compareAndSet(false, true)) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    Utils.showAlert("MAX SDK Not Initialized In Test Mode", "Test ads may not load. Please force close and restart the app if you experience issues.", C1641e.this.f3496b.mo14564an());
                }
            });
        }
        if (this.f2281f.size() > 0) {
            if (C2102v.m5104a()) {
                mo14365a("Starting waterfall for " + this.f2281f.size() + " ad(s)...");
            }
            this.f3496b.mo14526S().mo14428a((C1887a) new C1644a(0, this.f2281f));
            return;
        }
        if (C2102v.m5104a()) {
            mo14368c("No ads were returned from the server");
        }
        Utils.maybeHandleNoFillResponseForPublisher(this.f2278c, this.f2279d, this.f2280e, this.f3496b);
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f2280e, "settings", new JSONObject());
        long j = JsonUtils.getLong(jSONObject, "alfdcs", 0);
        final MaxErrorImpl maxErrorImpl = new MaxErrorImpl(204, "MAX returned no eligible ads from any mediated networks for this app/device.");
        if (j > 0) {
            long millis = TimeUnit.SECONDS.toMillis(j);
            C16432 r5 = new Runnable() {
                public void run() {
                    C1641e.this.m3310a(maxErrorImpl);
                }
            };
            if (JsonUtils.getBoolean(jSONObject, "alfdcs_iba", false).booleanValue()) {
                C2046e.m4933a(millis, this.f3496b, r5);
            } else {
                AppLovinSdkUtils.runOnUiThreadDelayed(r5, millis);
            }
        } else {
            m3310a((MaxError) maxErrorImpl);
        }
    }
}
