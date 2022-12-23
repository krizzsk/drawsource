package com.ogury.p377ed.internal;

import org.json.JSONObject;

/* renamed from: com.ogury.ed.internal.do */
public final class C9959do {
    /* renamed from: a */
    public static void m28749a(JSONObject jSONObject) throws C9997eq {
        C10263mq.m29882b(jSONObject, "rootJsonResponse");
        if (jSONObject.has("error")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("error");
            C9997eq eqVar = new C9997eq();
            String optString = jSONObject2.optString("type", "");
            C10263mq.m29879a((Object) optString, "error.optString(\"type\", \"\")");
            eqVar.mo64592a(optString);
            String optString2 = jSONObject2.optString("message", "");
            C10263mq.m29879a((Object) optString2, "error.optString(\"message\", \"\")");
            eqVar.mo64593b(optString2);
            throw eqVar;
        }
    }
}
