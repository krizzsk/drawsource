package com.inmobi.ads;

import org.json.JSONObject;

public final class AdMetaInfo {

    /* renamed from: a */
    private String f19538a;

    /* renamed from: b */
    private JSONObject f19539b;

    public AdMetaInfo(String str, JSONObject jSONObject) {
        this.f19538a = str;
        this.f19539b = jSONObject;
    }

    public final double getBid() {
        JSONObject jSONObject = this.f19539b;
        if (jSONObject == null) {
            return 0.0d;
        }
        return jSONObject.optDouble("buyerPrice");
    }

    public final JSONObject getBidInfo() {
        JSONObject jSONObject = this.f19539b;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public final String getCreativeID() {
        return this.f19538a;
    }

    public final String getBidKeyword() {
        JSONObject jSONObject = this.f19539b;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.optString("bidKeyword");
    }
}
