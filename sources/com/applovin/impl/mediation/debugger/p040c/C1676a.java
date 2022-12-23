package com.applovin.impl.mediation.debugger.p040c;

import androidx.browser.trusted.sharing.ShareTarget;
import com.applovin.impl.mediation.p035d.C1654b;
import com.applovin.impl.mediation.p035d.C1655c;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.network.C1995b;
import com.applovin.impl.sdk.network.C2000c;
import com.applovin.impl.sdk.p051c.C1866a;
import com.applovin.impl.sdk.p051c.C1867b;
import com.applovin.impl.sdk.p053e.C1887a;
import com.applovin.impl.sdk.p053e.C1935u;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TapjoyConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.debugger.c.a */
public class C1676a extends C1887a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1995b.C1999c<JSONObject> f2427a;

    public C1676a(C1995b.C1999c<JSONObject> cVar, C1969m mVar) {
        super("TaskFetchMediationDebuggerInfo", mVar, true);
        this.f2427a = cVar;
    }

    /* renamed from: a */
    private JSONObject m3472a(C1969m mVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("installed_mediation_adapters", C1655c.m3371a(mVar));
        } catch (JSONException e) {
            mo14366a("Failed to create mediation debugger request post body", e);
        }
        return jSONObject;
    }

    /* renamed from: b */
    private JSONObject m3473b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("installed_mediation_adapters", C1655c.m3371a(this.f3496b));
        } catch (JSONException e) {
            mo14366a("Failed to construct JSON body", e);
        }
        return jSONObject;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Map<String, String> mo13688a() {
        HashMap hashMap = new HashMap();
        hashMap.put("sdk_version", AppLovinSdk.VERSION);
        if (!((Boolean) this.f3496b.mo14534a(C1867b.f3348ep)).booleanValue()) {
            hashMap.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f3496b.mo14597z());
        }
        Map<String, Object> h = this.f3496b.mo14529V().mo14829h();
        hashMap.put(CampaignEx.JSON_KEY_PACKAGE_NAME, String.valueOf(h.get(CampaignEx.JSON_KEY_PACKAGE_NAME)));
        hashMap.put(TapjoyConstants.TJC_APP_VERSION_NAME, String.valueOf(h.get(TapjoyConstants.TJC_APP_VERSION_NAME)));
        Map<String, Object> b = this.f3496b.mo14529V().mo14823b();
        hashMap.put(TapjoyConstants.TJC_PLATFORM, String.valueOf(b.get(TapjoyConstants.TJC_PLATFORM)));
        hashMap.put("os", String.valueOf(b.get("os")));
        return hashMap;
    }

    public void run() {
        C16771 r1 = new C1935u<JSONObject>(C2000c.m4627a(this.f3496b).mo14730b(ShareTarget.METHOD_POST).mo14724a(C1654b.m3367c(this.f3496b)).mo14734c(C1654b.m3368d(this.f3496b)).mo14725a(mo13688a()).mo14726a(m3472a(this.f3496b)).mo14723a(new JSONObject()).mo14729b(((Long) this.f3496b.mo14534a(C1866a.f3075g)).intValue()).mo14726a(m3473b()).mo14728a(), this.f3496b, mo14373g()) {
            /* renamed from: a */
            public void mo13585a(int i, String str, JSONObject jSONObject) {
                C1676a.this.f2427a.mo13585a(i, str, jSONObject);
            }

            /* renamed from: a */
            public void mo13587a(JSONObject jSONObject, int i) {
                C1676a.this.f2427a.mo13587a(jSONObject, i);
            }
        };
        r1.mo14453a(C1866a.f3071c);
        r1.mo14455b(C1866a.f3072d);
        this.f3496b.mo14526S().mo14428a((C1887a) r1);
    }
}
