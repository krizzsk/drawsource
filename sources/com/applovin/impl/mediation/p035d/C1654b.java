package com.applovin.impl.mediation.p035d;

import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.p051c.C1866a;
import com.applovin.impl.sdk.p051c.C1869d;
import com.applovin.impl.sdk.utils.C2050h;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.d.b */
public class C1654b extends C2050h {

    /* renamed from: a */
    private static final String[] f2325a = {CampaignUnit.JSON_KEY_ADS, "settings", "auto_init_adapters", "test_mode_idfas", "test_mode_auto_init_adapters"};

    /* renamed from: b */
    private static final String[] f2326b = {CampaignUnit.JSON_KEY_ADS, "settings", "signal_providers"};

    /* renamed from: a */
    public static String m3363a(C1969m mVar) {
        return C2050h.m4951a((String) mVar.mo14534a(C1866a.f3071c), "1.0/mediate", mVar);
    }

    /* renamed from: a */
    public static void m3364a(JSONObject jSONObject, C1969m mVar) {
        if (JsonUtils.valueExists(jSONObject, "signal_providers")) {
            JSONObject shallowCopy = JsonUtils.shallowCopy(jSONObject);
            JsonUtils.removeObjectsForKeys(shallowCopy, f2325a);
            mVar.mo14541a(C1869d.f3392x, shallowCopy.toString());
        }
    }

    /* renamed from: b */
    public static String m3365b(C1969m mVar) {
        return C2050h.m4951a((String) mVar.mo14534a(C1866a.f3072d), "1.0/mediate", mVar);
    }

    /* renamed from: b */
    public static void m3366b(JSONObject jSONObject, C1969m mVar) {
        if (jSONObject.length() != 0) {
            if (JsonUtils.valueExists(jSONObject, "auto_init_adapters") || JsonUtils.valueExists(jSONObject, "test_mode_auto_init_adapters")) {
                JSONObject shallowCopy = JsonUtils.shallowCopy(jSONObject);
                JsonUtils.removeObjectsForKeys(shallowCopy, f2326b);
                mVar.mo14541a(C1869d.f3393y, shallowCopy.toString());
                return;
            }
            mVar.mo14569b(C1869d.f3393y);
        }
    }

    /* renamed from: c */
    public static String m3367c(C1969m mVar) {
        return C2050h.m4951a((String) mVar.mo14534a(C1866a.f3071c), "1.0/mediate_debug", mVar);
    }

    /* renamed from: d */
    public static String m3368d(C1969m mVar) {
        return C2050h.m4951a((String) mVar.mo14534a(C1866a.f3072d), "1.0/mediate_debug", mVar);
    }
}
