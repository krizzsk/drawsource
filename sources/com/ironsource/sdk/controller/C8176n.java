package com.ironsource.sdk.controller;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.controller.n */
public final class C8176n {

    /* renamed from: a */
    String f19868a;

    /* renamed from: b */
    JSONObject f19869b;

    /* renamed from: c */
    String f19870c;

    /* renamed from: d */
    String f19871d;

    public C8176n(JSONObject jSONObject) {
        this.f19868a = jSONObject.optString("functionName");
        this.f19869b = jSONObject.optJSONObject("functionParams");
        this.f19870c = jSONObject.optString("success");
        this.f19871d = jSONObject.optString("fail");
    }

    /* renamed from: a */
    public final JSONObject mo56468a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("functionName", this.f19868a);
            jSONObject.put("functionParams", this.f19869b);
            jSONObject.put("success", this.f19870c);
            jSONObject.put("fail", this.f19871d);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }
}
