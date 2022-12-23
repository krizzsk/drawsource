package com.applovin.impl.sdk.p053e;

import androidx.browser.trusted.sharing.ShareTarget;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.network.C2000c;
import com.applovin.impl.sdk.p049ad.C1835b;
import com.applovin.impl.sdk.p049ad.C1838d;
import com.applovin.impl.sdk.p051c.C1867b;
import com.applovin.impl.sdk.p052d.C1881f;
import com.applovin.impl.sdk.p052d.C1882g;
import com.applovin.impl.sdk.utils.C2050h;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.h */
public abstract class C1903h extends C1887a {

    /* renamed from: a */
    protected final C1838d f3526a;

    public C1903h(C1838d dVar, String str, C1969m mVar) {
        super(str, mVar);
        this.f3526a = dVar;
    }

    /* renamed from: a */
    private void m4259a(C1882g gVar) {
        long b = gVar.mo14354b(C1881f.f3467c);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - b > TimeUnit.MINUTES.toMillis((long) ((Integer) this.f3496b.mo14534a(C1867b.f3293dk)).intValue())) {
            gVar.mo14356b(C1881f.f3467c, currentTimeMillis);
            gVar.mo14357c(C1881f.f3468d);
        }
    }

    /* renamed from: i */
    private Map<String, String> m4260i() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("AppLovin-Zone-Id", this.f3526a.mo14154a());
        if (this.f3526a.mo14156c() != null) {
            hashMap.put("AppLovin-Ad-Size", this.f3526a.mo14156c().getLabel());
        }
        if (this.f3526a.mo14157d() != null) {
            hashMap.put("AppLovin-Ad-Type", this.f3526a.mo14157d().getLabel());
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C1887a mo14405a(JSONObject jSONObject);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Map<String, String> mo14406a() {
        HashMap hashMap = new HashMap(4);
        hashMap.put("zone_id", this.f3526a.mo14154a());
        if (this.f3526a.mo14156c() != null) {
            hashMap.put("size", this.f3526a.mo14156c().getLabel());
        }
        if (this.f3526a.mo14157d() != null) {
            hashMap.put("require", this.f3526a.mo14157d().getLabel());
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14407a(int i) {
        if (C2102v.m5104a()) {
            mo14370d("Unable to fetch " + this.f3526a + " ad: server returned " + i);
        }
        if (i == -800) {
            this.f3496b.mo14527T().mo14351a(C1881f.f3472h);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String mo14408b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo14409b(JSONObject jSONObject) {
        C2050h.m4962d(jSONObject, this.f3496b);
        C2050h.m4961c(jSONObject, this.f3496b);
        C2050h.m4964e(jSONObject, this.f3496b);
        C1838d.m3904a(jSONObject);
        this.f3496b.mo14526S().mo14428a(mo14405a(jSONObject));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract String mo14410c();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C1835b mo14411h() {
        return this.f3526a.mo14158e() ? C1835b.APPLOVIN_PRIMARY_ZONE : C1835b.APPLOVIN_CUSTOM_ZONE;
    }

    public void run() {
        Map<String, String> map;
        if (C2102v.m5104a()) {
            mo14365a("Fetching next ad of zone: " + this.f3526a);
        }
        if (((Boolean) this.f3496b.mo14534a(C1867b.f3262dF)).booleanValue() && Utils.isVPNConnected() && C2102v.m5104a()) {
            mo14365a("User is connected to a VPN");
        }
        C1882g T = this.f3496b.mo14527T();
        T.mo14351a(C1881f.f3465a);
        if (T.mo14354b(C1881f.f3467c) == 0) {
            T.mo14356b(C1881f.f3467c, System.currentTimeMillis());
        }
        try {
            JSONObject andResetCustomPostBody = this.f3496b.mo14592u().getAndResetCustomPostBody();
            boolean booleanValue = ((Boolean) this.f3496b.mo14534a(C1867b.f3287de)).booleanValue();
            String str = ShareTarget.METHOD_POST;
            if (booleanValue) {
                JSONObject jSONObject = new JSONObject(this.f3496b.mo14529V().mo14821a(mo14406a(), false, true));
                map = new HashMap<>();
                map.put("rid", UUID.randomUUID().toString());
                if (!((Boolean) this.f3496b.mo14534a(C1867b.f3348ep)).booleanValue()) {
                    map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f3496b.mo14597z());
                }
                if (andResetCustomPostBody != null) {
                    JsonUtils.putAll(jSONObject, andResetCustomPostBody);
                }
                andResetCustomPostBody = jSONObject;
            } else {
                Map<String, String> stringifyObjectMap = Utils.stringifyObjectMap(this.f3496b.mo14529V().mo14821a(mo14406a(), false, false));
                if (andResetCustomPostBody == null) {
                    andResetCustomPostBody = null;
                    str = ShareTarget.METHOD_GET;
                }
                map = stringifyObjectMap;
            }
            if (Utils.isDspDemoApp(mo14372f())) {
                map.putAll(this.f3496b.mo14592u().getAndResetCustomQueryParams());
            }
            HashMap hashMap = new HashMap();
            hashMap.putAll(m4260i());
            m4259a(T);
            C2000c.C2001a<T> b = C2000c.m4627a(this.f3496b).mo14724a(mo14408b()).mo14734c(mo14410c()).mo14725a(map).mo14730b(str).mo14731b((Map<String, String>) hashMap).mo14723a(new JSONObject()).mo14722a(((Integer) this.f3496b.mo14534a(C1867b.f3223cS)).intValue()).mo14727a(((Boolean) this.f3496b.mo14534a(C1867b.f3224cT)).booleanValue()).mo14732b(((Boolean) this.f3496b.mo14534a(C1867b.f3225cU)).booleanValue()).mo14729b(((Integer) this.f3496b.mo14534a(C1867b.f3222cR)).intValue());
            if (andResetCustomPostBody != null) {
                b.mo14726a(andResetCustomPostBody);
                b.mo14736d(((Boolean) this.f3496b.mo14534a(C1867b.f3356ex)).booleanValue());
            }
            C19041 r1 = new C1935u<JSONObject>(b.mo14728a(), this.f3496b) {
                /* renamed from: a */
                public void mo13585a(int i, String str, JSONObject jSONObject) {
                    C1903h.this.mo14407a(i);
                }

                /* renamed from: a */
                public void mo13587a(JSONObject jSONObject, int i) {
                    if (i == 200) {
                        JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", this.f3601d.mo14698a());
                        JsonUtils.putLong(jSONObject, "ad_fetch_response_size", this.f3601d.mo14699b());
                        C1903h.this.mo14409b(jSONObject);
                        return;
                    }
                    C1903h.this.mo14407a(i);
                }
            };
            r1.mo14453a(C1867b.f3117aR);
            r1.mo14455b(C1867b.f3118aS);
            this.f3496b.mo14526S().mo14428a((C1887a) r1);
        } catch (Throwable th) {
            if (C2102v.m5104a()) {
                mo14366a("Unable to fetch ad " + this.f3526a, th);
            }
            mo14407a(0);
        }
    }
}
