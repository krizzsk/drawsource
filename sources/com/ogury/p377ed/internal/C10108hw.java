package com.ogury.p377ed.internal;

import org.json.JSONObject;

/* renamed from: com.ogury.ed.internal.hw */
public final class C10108hw {

    /* renamed from: a */
    public static final C10108hw f25383a = new C10108hw();

    private C10108hw() {
    }

    /* renamed from: a */
    public static C10106hv m29431a(String str) {
        C10263mq.m29882b(str, "zoneJson");
        try {
            return m29432a(new JSONObject(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static C10106hv m29432a(JSONObject jSONObject) {
        C10263mq.m29882b(jSONObject, "zoneJson");
        C10106hv hvVar = new C10106hv();
        String optString = jSONObject.optString("url", "");
        C10263mq.m29879a((Object) optString, "zoneJson.optString(\"url\", \"\")");
        hvVar.mo64860a(optString);
        String optString2 = jSONObject.optString("content", "");
        C10263mq.m29879a((Object) optString2, "zoneJson.optString(\"content\", \"\")");
        hvVar.mo64864b(optString2);
        String optString3 = jSONObject.optString("webViewId", jSONObject.optString("id", ""));
        C10263mq.m29879a((Object) optString3, "zoneJson.optString(\"webViewId\", id)");
        hvVar.mo64868c(optString3);
        JSONObject optJSONObject = jSONObject.optJSONObject("size");
        int i = -1;
        hvVar.mo64863b(optJSONObject == null ? -1 : optJSONObject.optInt("width", -1));
        JSONObject optJSONObject2 = jSONObject.optJSONObject("size");
        hvVar.mo64859a(optJSONObject2 == null ? -1 : optJSONObject2.optInt("height", -1));
        JSONObject optJSONObject3 = jSONObject.optJSONObject("position");
        hvVar.mo64871d(optJSONObject3 == null ? -1 : optJSONObject3.optInt("x", -1));
        JSONObject optJSONObject4 = jSONObject.optJSONObject("position");
        if (optJSONObject4 != null) {
            i = optJSONObject4.optInt("y", -1);
        }
        hvVar.mo64867c(i);
        hvVar.mo64861a(jSONObject.optBoolean("enableTracking", false));
        hvVar.mo64865b(jSONObject.optBoolean("keepAlive", false));
        hvVar.mo64869c(jSONObject.optBoolean("isLandingPage", false));
        return hvVar;
    }
}
