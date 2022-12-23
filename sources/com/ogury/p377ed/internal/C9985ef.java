package com.ogury.p377ed.internal;

import com.ironsource.mediationsdk.adunit.data.DataKeys;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tapjoy.TapjoyConstants;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ogury.ed.internal.ef */
public final class C9985ef {

    /* renamed from: a */
    public static final C9985ef f25118a = new C9985ef();

    private C9985ef() {
    }

    /* renamed from: a */
    public static String m28871a(C9986eg egVar, C9982ec ecVar, String str, C9999es esVar) {
        C10263mq.m29882b(egVar, "requestDetails");
        C10263mq.m29882b(ecVar, "adContent");
        C10263mq.m29882b(str, DataKeys.USER_ID);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("connectivity", egVar.mo64553a());
        jSONObject.put("at", egVar.mo64554b());
        jSONObject.put("country", egVar.mo64555c());
        jSONObject.put("build", 30105);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(egVar.mo64556d());
        jSONObject.put("apps_publishers", jSONArray);
        jSONObject.put("version", egVar.mo64560h());
        jSONObject.put("device", m28872a(egVar));
        jSONObject.put("content", m28875b(egVar, ecVar, str, esVar));
        JSONObject b = m28874b(egVar);
        if (!C10050ge.m29189a(b)) {
            jSONObject.put("privacy_compliancy", b);
        }
        JSONObject d = m28877d(egVar);
        if (!C10050ge.m29189a(d)) {
            jSONObject.put("targeting", d);
        }
        JSONObject c = m28876c(egVar);
        if (!C10050ge.m29189a(c)) {
            jSONObject.put(TapjoyConstants.TJC_APP_PLACEMENT, c);
        }
        String jSONObject2 = jSONObject.toString();
        C10263mq.m29879a((Object) jSONObject2, "requestBody.toString()");
        return jSONObject2;
    }

    /* renamed from: a */
    private static JSONObject m28872a(C9986eg egVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", egVar.mo64558f());
        jSONObject.put("height", egVar.mo64559g());
        return jSONObject;
    }

    /* renamed from: b */
    private static JSONObject m28875b(C9986eg egVar, C9982ec ecVar, String str, C9999es esVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", ecVar.mo64549a());
        jSONObject.put("ad_sync_type", "load");
        if (esVar != null) {
            jSONObject.put("overlay", m28873a(esVar, egVar.mo64561i()));
        }
        if (ecVar.mo64550b() != null) {
            jSONObject.put("ad_unit_id", ecVar.mo64550b());
        }
        if (str.length() > 0) {
            jSONObject.put("app_user_id", str);
        }
        if (ecVar.mo64551c() != null) {
            jSONObject.put("campaign_to_load", ecVar.mo64551c());
        }
        if (ecVar.mo64552d() != null) {
            jSONObject.put(CampaignEx.JSON_KEY_CREATIVE_ID, ecVar.mo64552d());
        }
        jSONObject.put("is_omid_compliant", egVar.mo64557e());
        jSONObject.put("omid_integration_version", 3);
        return jSONObject;
    }

    /* renamed from: b */
    private static JSONObject m28874b(C9986eg egVar) {
        JSONObject jSONObject = new JSONObject();
        if (egVar.mo64562j() != null) {
            jSONObject.put("is_child_under_coppa", egVar.mo64562j());
        }
        if (egVar.mo64563k() != null) {
            jSONObject.put("is_under_age_of_gdpr_consent", egVar.mo64563k());
        }
        jSONObject.put("consent_token", egVar.mo64565m());
        return jSONObject;
    }

    /* renamed from: c */
    private static JSONObject m28876c(C9986eg egVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", egVar.mo64566n());
        return jSONObject;
    }

    /* renamed from: d */
    private static JSONObject m28877d(C9986eg egVar) {
        JSONObject jSONObject = new JSONObject();
        CharSequence l = egVar.mo64564l();
        if (!(l == null || l.length() == 0)) {
            jSONObject.put("ad_content_threshold", egVar.mo64564l());
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static JSONObject m28873a(C9999es esVar, float f) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("width", esVar.mo64595a());
        jSONObject2.put("height", esVar.mo64596b());
        jSONObject2.put("scaler", Float.valueOf(f));
        jSONObject.put("overlay_max_size", jSONObject2);
        return jSONObject;
    }
}
