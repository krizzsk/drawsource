package com.applovin.impl.mediation.debugger.p037b.p038a;

import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.debugger.b.a.e */
public class C1669e {

    /* renamed from: a */
    private final String f2373a;

    /* renamed from: b */
    private final String f2374b;

    public C1669e(JSONObject jSONObject, C1969m mVar) {
        this.f2373a = JsonUtils.getString(jSONObject, "id", "");
        this.f2374b = JsonUtils.getString(jSONObject, "price", (String) null);
    }

    /* renamed from: a */
    public String mo13645a() {
        return this.f2373a;
    }

    /* renamed from: b */
    public String mo13646b() {
        return this.f2374b;
    }
}
