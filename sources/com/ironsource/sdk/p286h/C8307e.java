package com.ironsource.sdk.p286h;

import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.h.e */
public final class C8307e {

    /* renamed from: a */
    public JSONObject f20269a;

    public C8307e(JSONObject jSONObject) {
        this.f20269a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    /* renamed from: a */
    public final boolean mo56757a() {
        return this.f20269a.optBoolean("useCacheDir", false);
    }
}
