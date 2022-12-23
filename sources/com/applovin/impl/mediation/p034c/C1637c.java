package com.applovin.impl.mediation.p034c;

import android.content.Context;
import androidx.browser.trusted.sharing.ShareTarget;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.C1614a;
import com.applovin.impl.mediation.p031a.C1583a;
import com.applovin.impl.mediation.p035d.C1654b;
import com.applovin.impl.mediation.p035d.C1655c;
import com.applovin.impl.sdk.C1945f;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.network.C2000c;
import com.applovin.impl.sdk.p051c.C1866a;
import com.applovin.impl.sdk.p051c.C1867b;
import com.applovin.impl.sdk.p052d.C1881f;
import com.applovin.impl.sdk.p052d.C1882g;
import com.applovin.impl.sdk.p053e.C1887a;
import com.applovin.impl.sdk.p053e.C1935u;
import com.applovin.impl.sdk.utils.C2050h;
import com.applovin.impl.sdk.utils.C2053j;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tapjoy.TapjoyConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.c.c */
public class C1637c extends C1887a {

    /* renamed from: a */
    private final String f2262a;

    /* renamed from: c */
    private final MaxAdFormat f2263c;

    /* renamed from: d */
    private final Map<String, Object> f2264d;

    /* renamed from: e */
    private final Map<String, Object> f2265e;

    /* renamed from: f */
    private final JSONArray f2266f;

    /* renamed from: g */
    private final Context f2267g;

    /* renamed from: h */
    private final C1614a.C1615a f2268h;

    public C1637c(String str, MaxAdFormat maxAdFormat, Map<String, Object> map, Map<String, Object> map2, JSONArray jSONArray, Context context, C1969m mVar, C1614a.C1615a aVar) {
        super("TaskFetchMediatedAd " + str, mVar);
        this.f2262a = str;
        this.f2263c = maxAdFormat;
        this.f2264d = map;
        this.f2265e = map2;
        this.f2266f = jSONArray;
        this.f2267g = context;
        this.f2268h = aVar;
    }

    /* renamed from: a */
    private String m3279a() {
        return C1654b.m3363a(this.f3496b);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3280a(int i, String str) {
        if (C2102v.m5104a()) {
            mo14370d("Unable to fetch " + this.f2262a + " ad: server returned " + i);
        }
        if (i == -800) {
            this.f3496b.mo14527T().mo14351a(C1881f.f3479o);
        }
        C2053j.m4988a((MaxAdListener) this.f2268h, this.f2262a, (MaxError) i == -1009 ? new MaxErrorImpl(-1009, str) : i == -1001 ? new MaxErrorImpl(-1001, str) : StringUtils.isValidString(str) ? new MaxErrorImpl(-1000, str) : new MaxErrorImpl(-1));
    }

    /* renamed from: a */
    private void m3283a(C1882g gVar) {
        long b = gVar.mo14354b(C1881f.f3467c);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - b > TimeUnit.MINUTES.toMillis((long) ((Integer) this.f3496b.mo14534a(C1867b.f3293dk)).intValue())) {
            gVar.mo14356b(C1881f.f3467c, currentTimeMillis);
            gVar.mo14357c(C1881f.f3468d);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m3284a(JSONObject jSONObject) {
        try {
            C2050h.m4962d(jSONObject, this.f3496b);
            C2050h.m4961c(jSONObject, this.f3496b);
            C2050h.m4964e(jSONObject, this.f3496b);
            C2050h.m4966f(jSONObject, this.f3496b);
            C1654b.m3364a(jSONObject, this.f3496b);
            C1654b.m3366b(jSONObject, this.f3496b);
            C1945f.m4387a(this.f3496b);
            if (this.f2263c != MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, FirebaseAnalytics.Param.AD_FORMAT, (String) null)) && C2102v.m5104a()) {
                C2102v.m5110i(mo14371e(), "Ad format requested does not match ad unit id's format.");
            }
            this.f3496b.mo14526S().mo14428a((C1887a) m3285b(jSONObject));
        } catch (Throwable th) {
            if (C2102v.m5104a()) {
                mo14366a("Unable to process mediated ad response", th);
            }
            throw new RuntimeException("Unable to process ad: " + th);
        }
    }

    /* renamed from: b */
    private C1641e m3285b(JSONObject jSONObject) {
        return new C1641e(this.f2262a, this.f2263c, this.f2264d, jSONObject, this.f2267g, this.f3496b, this.f2268h);
    }

    /* renamed from: b */
    private String m3286b() {
        return C1654b.m3365b(this.f3496b);
    }

    /* renamed from: c */
    private Map<String, String> m3287c() {
        HashMap hashMap = new HashMap(2);
        hashMap.put("AppLovin-Ad-Unit-Id", this.f2262a);
        hashMap.put("AppLovin-Ad-Format", this.f2263c.getLabel());
        return hashMap;
    }

    /* renamed from: c */
    private void m3288c(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("disabled", new JSONArray(this.f3496b.mo14511C().mo13825c()));
            jSONObject2.put(TapjoyConstants.TJC_INSTALLED, C1655c.m3371a(this.f3496b));
            jSONObject2.put("initialized", this.f3496b.mo14512D().mo13819c());
            jSONObject2.put("initialized_classnames", new JSONArray(this.f3496b.mo14512D().mo13818b()));
            jSONObject2.put("loaded_classnames", new JSONArray(this.f3496b.mo14511C().mo13822a()));
            jSONObject2.put("failed_classnames", new JSONArray(this.f3496b.mo14511C().mo13824b()));
            jSONObject.put("adapters_info", jSONObject2);
        } catch (Exception e) {
            if (C2102v.m5104a()) {
                mo14366a("Failed to populate adapter classNames", e);
            }
            throw new RuntimeException("Failed to populate classNames: " + e);
        }
    }

    /* renamed from: d */
    private void m3289d(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = this.f2266f;
        if (jSONArray != null) {
            jSONObject.put("signal_data", jSONArray);
        }
    }

    /* renamed from: e */
    private void m3290e(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("ad_unit_id", this.f2262a);
        jSONObject2.put(FirebaseAnalytics.Param.AD_FORMAT, this.f2263c.getLabel());
        HashMap hashMap = new HashMap(this.f2265e);
        C1583a a = this.f3496b.mo14514F().mo15017a(this.f2262a);
        if (a != null) {
            hashMap.put("previous_winning_network", a.mo13431L());
            hashMap.put("previous_winning_network_name", a.getNetworkName());
        }
        jSONObject2.put("extra_parameters", CollectionUtils.toJson(hashMap));
        jSONObject.put("ad_info", jSONObject2);
    }

    /* renamed from: f */
    private void m3291f(JSONObject jSONObject) {
        JSONObject andResetCustomPostBodyData = this.f3496b.mo14513E().getAndResetCustomPostBodyData();
        if (andResetCustomPostBodyData != null && Utils.isDspDemoApp(this.f3496b.mo14520L())) {
            JsonUtils.putAll(jSONObject, andResetCustomPostBodyData);
        }
    }

    /* renamed from: g */
    private void m3292g(JSONObject jSONObject) {
        JsonUtils.putObject(jSONObject, "sdk_extra_parameters", new JSONObject(this.f3496b.mo14586p().getExtraParameters()));
    }

    /* renamed from: h */
    private JSONObject m3293h() throws JSONException {
        JSONObject jSONObject = new JSONObject(this.f3496b.mo14529V().mo14821a((Map<String, String>) null, false, true));
        m3290e(jSONObject);
        m3289d(jSONObject);
        m3288c(jSONObject);
        m3291f(jSONObject);
        m3292g(jSONObject);
        return jSONObject;
    }

    public void run() {
        if (C2102v.m5104a()) {
            mo14365a("Fetching next ad for ad unit id: " + this.f2262a + " and format: " + this.f2263c);
        }
        if (((Boolean) this.f3496b.mo14534a(C1867b.f3262dF)).booleanValue() && Utils.isVPNConnected() && C2102v.m5104a()) {
            mo14365a("User is connected to a VPN");
        }
        C1882g T = this.f3496b.mo14527T();
        T.mo14351a(C1881f.f3478n);
        if (T.mo14354b(C1881f.f3467c) == 0) {
            T.mo14356b(C1881f.f3467c, System.currentTimeMillis());
        }
        try {
            JSONObject h = m3293h();
            HashMap hashMap = new HashMap();
            hashMap.put("rid", UUID.randomUUID().toString());
            if (!((Boolean) this.f3496b.mo14534a(C1867b.f3348ep)).booleanValue()) {
                hashMap.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f3496b.mo14597z());
            }
            if (this.f3496b.mo14518J().mo13806a()) {
                hashMap.put("test_mode", "1");
            }
            String c = this.f3496b.mo14518J().mo13809c();
            if (StringUtils.isValidString(c)) {
                hashMap.put("filter_ad_network", c);
                if (!this.f3496b.mo14518J().mo13806a()) {
                    hashMap.put("fhkZsVqYC7", "1");
                }
                if (this.f3496b.mo14518J().mo13808b()) {
                    hashMap.put("force_ad_network", c);
                }
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.putAll(m3287c());
            m3283a(T);
            C16381 r1 = new C1935u<JSONObject>(C2000c.m4627a(this.f3496b).mo14730b(ShareTarget.METHOD_POST).mo14731b((Map<String, String>) hashMap2).mo14724a(m3279a()).mo14734c(m3286b()).mo14725a((Map<String, String>) hashMap).mo14726a(h).mo14736d(((Boolean) this.f3496b.mo14534a(C1866a.f3067U)).booleanValue()).mo14723a(new JSONObject()).mo14729b(((Long) this.f3496b.mo14534a(C1866a.f3074f)).intValue()).mo14722a(((Integer) this.f3496b.mo14534a(C1867b.f3223cS)).intValue()).mo14733c(((Long) this.f3496b.mo14534a(C1866a.f3073e)).intValue()).mo14728a(), this.f3496b) {
                /* renamed from: a */
                public void mo13585a(int i, String str, JSONObject jSONObject) {
                    C1637c.this.m3280a(i, str);
                }

                /* renamed from: a */
                public void mo13587a(JSONObject jSONObject, int i) {
                    if (i == 200) {
                        JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", this.f3601d.mo14698a());
                        JsonUtils.putLong(jSONObject, "ad_fetch_response_size", this.f3601d.mo14699b());
                        C1637c.this.m3284a(jSONObject);
                        return;
                    }
                    C1637c.this.m3280a(i, (String) null);
                }
            };
            r1.mo14453a(C1866a.f3071c);
            r1.mo14455b(C1866a.f3072d);
            this.f3496b.mo14526S().mo14428a((C1887a) r1);
        } catch (Throwable th) {
            if (C2102v.m5104a()) {
                mo14366a("Unable to fetch ad " + this.f2262a, th);
            }
            throw new RuntimeException("Unable to fetch ad: " + th);
        }
    }
}
