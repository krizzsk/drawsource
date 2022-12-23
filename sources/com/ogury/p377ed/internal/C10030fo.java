package com.ogury.p377ed.internal;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.tapjoy.TJAdUnitConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ogury.ed.internal.fo */
public final class C10030fo {

    /* renamed from: a */
    public static final C10030fo f25241a = new C10030fo();

    private C10030fo() {
    }

    /* renamed from: a */
    public static C10032fq m29118a(JSONObject jSONObject) {
        C10263mq.m29882b(jSONObject, "jsonObject");
        if (jSONObject.optBoolean("force")) {
            return C10021fg.f25206a;
        }
        if (C10050ge.m29189a(jSONObject)) {
            return C10027fl.f25217a;
        }
        try {
            return m29123b(jSONObject);
        } catch (JSONException e) {
            C9925da daVar = C9925da.f24975a;
            C9925da.m28653a(e);
            return C10027fl.f25217a;
        }
    }

    /* renamed from: b */
    private static C10028fm m29123b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        C10028fm fmVar = new C10028fm();
        JSONObject optJSONObject = jSONObject.optJSONObject("profig");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        m29122a(optJSONObject, fmVar);
        fmVar.mo64689a(C10050ge.m29186a(optJSONObject.optJSONObject("max_per_day"), "profig", 10));
        fmVar.mo64698c(C10031fp.m29126a(C10050ge.m29186a(optJSONObject.optJSONObject("timeout"), CampaignUnit.JSON_KEY_ADS, 3)));
        fmVar.mo64691a(C10050ge.m29188a(optJSONObject.optJSONObject("logs"), "crash_report", ""));
        fmVar.mo64703d(C10050ge.m29186a(optJSONObject, "adsync_permissions", 0));
        fmVar.mo64707e(C10050ge.m29186a(optJSONObject, "trackers_permissions", 0));
        fmVar.mo64711f(C10050ge.m29186a(optJSONObject, "children_whitelist", 0));
        m29124b(optJSONObject, fmVar);
        m29125c(optJSONObject, fmVar);
        m29121a(optJSONObject, fmVar.mo64720n(), fmVar.mo64721o());
        m29120a(optJSONObject, fmVar.mo64722p());
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("cache");
        if (optJSONObject2 == null) {
            jSONObject2 = null;
        } else {
            jSONObject2 = optJSONObject2.optJSONObject("ads_to_precache");
        }
        fmVar.mo64694b(C10050ge.m29186a(jSONObject2, "max", -1));
        fmVar.mo64704d(C10031fp.m29127a(C10050ge.m29187a(optJSONObject2, "ad_expiration", 14400)));
        return fmVar;
    }

    /* renamed from: a */
    private static void m29122a(JSONObject jSONObject, C10028fm fmVar) {
        JSONObject optJSONObject = jSONObject.optJSONObject("timing_finder");
        fmVar.mo64695b(C10031fp.m29127a(C10050ge.m29187a(optJSONObject, "profig", 43200)));
        fmVar.mo64690a(C10031fp.m29127a(C10050ge.m29187a(optJSONObject, "no_internet_retry", 7200)));
        fmVar.mo64708e(C10031fp.m29127a(C10050ge.m29187a(optJSONObject, "show_close_button", 2)));
    }

    /* renamed from: b */
    private static void m29124b(JSONObject jSONObject, C10028fm fmVar) {
        JSONObject optJSONObject = jSONObject.optJSONObject("webview");
        fmVar.mo64709e(C10050ge.m29190a(optJSONObject, "back_button_enabled", false));
        fmVar.mo64712f(C10050ge.m29190a(optJSONObject, "close_ad_when_leaving_app", true));
        fmVar.mo64699c(C10031fp.m29127a(C10050ge.m29187a(optJSONObject, "webview_load_timeout", 80)));
    }

    /* renamed from: c */
    private static void m29125c(JSONObject jSONObject, C10028fm fmVar) {
        JSONArray optJSONArray = jSONObject.optJSONArray(TJAdUnitConstants.String.ENABLED);
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        String jSONArray = optJSONArray.toString();
        C10263mq.m29879a((Object) jSONArray, "enabledArray.toString()");
        CharSequence charSequence = jSONArray;
        fmVar.mo64692a(C10312oc.m29970b(charSequence, (CharSequence) "profig"));
        fmVar.mo64696b(C10312oc.m29970b(charSequence, (CharSequence) CampaignUnit.JSON_KEY_ADS));
        fmVar.mo64700c(C10312oc.m29970b(charSequence, (CharSequence) "launch"));
        fmVar.mo64705d(C10312oc.m29970b(charSequence, (CharSequence) CampaignEx.KEY_OMID));
    }

    /* renamed from: a */
    private static void m29121a(JSONObject jSONObject, C10022fh fhVar, C10024fj fjVar) {
        JSONObject optJSONObject = jSONObject.optJSONObject("overlay_config");
        if (optJSONObject != null) {
            fhVar.mo64657a(optJSONObject.optBoolean("multiactivity_enabled", fhVar.mo64658a()));
            m29119a((C10023fi) fhVar, optJSONObject);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("overlay_fragment_config");
        if (optJSONObject2 != null) {
            fjVar.mo64669a(optJSONObject2.optBoolean("fragment_filter_enabled", fjVar.mo64670a()));
            m29119a((C10023fi) fjVar, optJSONObject2);
        }
    }

    /* renamed from: a */
    private static void m29120a(JSONObject jSONObject, C10001eu euVar) {
        JSONObject optJSONObject = jSONObject.optJSONObject("overlay_defaults");
        if (optJSONObject != null) {
            euVar.mo64604a(optJSONObject.optInt("gravity", euVar.mo64603a()));
            euVar.mo64606b(optJSONObject.optInt("x_margin", euVar.mo64605b()));
            euVar.mo64608c(optJSONObject.optInt("y_margin", euVar.mo64607c()));
            euVar.mo64610d(optJSONObject.optInt("max_width", euVar.mo64609d()));
            euVar.mo64612e(optJSONObject.optInt("max_height", euVar.mo64611e()));
        }
    }

    /* renamed from: a */
    private static void m29119a(C10023fi fiVar, JSONObject jSONObject) {
        fiVar.mo64661b(jSONObject.optBoolean("default_whitelist_enabled", fiVar.mo64662b()));
        fiVar.mo64665d(jSONObject.optBoolean("publisher_blacklist_enabled", fiVar.mo64666d()));
        fiVar.mo64663c(jSONObject.optBoolean("publisher_whitelist_enabled", fiVar.mo64664c()));
        fiVar.mo64659a(C10049gd.m29185a(jSONObject.optJSONArray("whitelist")));
        fiVar.mo64660b(C10049gd.m29185a(jSONObject.optJSONArray("blacklist")));
    }

    /* renamed from: a */
    public static C10028fm m29117a(String str) {
        C10263mq.m29882b(str, "profigFullResponse");
        try {
            if (!(str.length() > 0) || C10263mq.m29881a((Object) str, (Object) JsonUtils.EMPTY_JSON)) {
                return null;
            }
            return m29123b(new JSONObject(str));
        } catch (Exception unused) {
            return null;
        }
    }
}
