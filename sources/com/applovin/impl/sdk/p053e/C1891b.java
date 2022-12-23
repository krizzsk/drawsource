package com.applovin.impl.sdk.p053e;

import android.text.TextUtils;
import androidx.browser.trusted.sharing.ShareTarget;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2022o;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.network.C2000c;
import com.applovin.impl.sdk.p051c.C1867b;
import com.applovin.impl.sdk.utils.C2050h;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdk;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.tapjoy.TapjoyConstants;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.b */
class C1891b extends C1887a {
    C1891b(C1969m mVar) {
        super("TaskApiSubmitData", mVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m4209a(JSONObject jSONObject) {
        try {
            JSONObject a = C2050h.m4952a(jSONObject);
            this.f3496b.mo14519K().mo14286a((C1867b<?>) C1867b.f3096X, (Object) a.getString("device_id"));
            this.f3496b.mo14519K().mo14286a((C1867b<?>) C1867b.f3098Z, (Object) a.getString("device_token"));
            this.f3496b.mo14519K().mo14286a((C1867b<?>) C1867b.f3126aa, (Object) Long.valueOf(a.getLong("publisher_id")));
            C2050h.m4962d(a, this.f3496b);
            C2050h.m4964e(a, this.f3496b);
            String string = JsonUtils.getString(a, "latest_version", "");
            if (!TextUtils.isEmpty(string) && !AppLovinSdk.VERSION.equals(string) && C2102v.m5104a()) {
                String str = "Current SDK version (" + AppLovinSdk.VERSION + ") is outdated. Please integrate the latest version of the AppLovin SDK (" + string + "). Doing so will improve your CPMs and ensure you have access to the latest revenue earning features.";
                if (JsonUtils.valueExists(a, "sdk_update_message")) {
                    str = JsonUtils.getString(a, "sdk_update_message", str);
                }
                C2102v.m5109h("AppLovinSdk", str);
            }
            this.f3496b.mo14527T().mo14355b();
        } catch (Throwable th) {
            if (C2102v.m5104a()) {
                mo14366a("Unable to parse API response", th);
            }
        }
    }

    /* renamed from: b */
    private void m4210b(JSONObject jSONObject) throws JSONException {
        C2022o V = this.f3496b.mo14529V();
        Map<String, Object> d = V.mo14825d();
        Utils.renameKeyInObjectMap(TapjoyConstants.TJC_PLATFORM, "type", d);
        Utils.renameKeyInObjectMap("api_level", "sdk_version", d);
        jSONObject.put(DeviceRequestsHelper.DEVICE_INFO_PARAM, new JSONObject(d));
        Map<String, Object> h = V.mo14829h();
        Utils.renameKeyInObjectMap("sdk_version", "applovin_sdk_version", h);
        Utils.renameKeyInObjectMap("ia", "installed_at", h);
        jSONObject.put("app_info", new JSONObject(h));
    }

    /* renamed from: c */
    private void m4211c(JSONObject jSONObject) {
        C18921 r0 = new C1935u<JSONObject>(C2000c.m4627a(this.f3496b).mo14724a(C2050h.m4950a("2.0/device", this.f3496b)).mo14734c(C2050h.m4960b("2.0/device", this.f3496b)).mo14725a(C2050h.m4963e(this.f3496b)).mo14730b(ShareTarget.METHOD_POST).mo14726a(jSONObject).mo14736d(((Boolean) this.f3496b.mo14534a(C1867b.f3355ew)).booleanValue()).mo14723a(new JSONObject()).mo14722a(((Integer) this.f3496b.mo14534a(C1867b.f3226cV)).intValue()).mo14728a(), this.f3496b) {
            /* renamed from: a */
            public void mo13585a(int i, String str, JSONObject jSONObject) {
                C2050h.m4953a(i, this.f3496b);
            }

            /* renamed from: a */
            public void mo13587a(JSONObject jSONObject, int i) {
                C1891b.this.m4209a(jSONObject);
            }
        };
        r0.mo14453a(C1867b.f3119aT);
        r0.mo14455b(C1867b.f3120aU);
        this.f3496b.mo14526S().mo14428a((C1887a) r0);
    }

    public void run() {
        try {
            if (C2102v.m5104a()) {
                mo14367b("Submitting user data...");
            }
            JSONObject jSONObject = new JSONObject();
            m4210b(jSONObject);
            m4211c(jSONObject);
        } catch (JSONException e) {
            if (C2102v.m5104a()) {
                mo14366a("Unable to build JSON message with collected data", e);
            }
        }
    }
}
