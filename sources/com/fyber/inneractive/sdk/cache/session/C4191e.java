package com.fyber.inneractive.sdk.cache.session;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.cache.session.e */
public class C4191e {

    /* renamed from: a */
    public int f10302a;

    /* renamed from: b */
    public int f10303b;

    /* renamed from: c */
    public int f10304c;

    /* renamed from: d */
    public long f10305d;

    public C4191e() {
        this(0, 0, 0, System.currentTimeMillis());
    }

    /* renamed from: a */
    public JSONObject mo24180a(boolean z, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        if (z) {
            try {
                jSONObject.put("time", this.f10305d);
            } catch (JSONException unused) {
            }
        }
        jSONObject.put("imp", this.f10302a);
        if (z2) {
            jSONObject.put("com", this.f10304c);
        }
        jSONObject.put("cli", this.f10303b);
        return jSONObject;
    }

    public C4191e(int i, int i2, int i3, long j) {
        this.f10305d = j;
        this.f10302a = i;
        this.f10303b = i2;
        this.f10304c = i3;
    }

    /* renamed from: a */
    public static C4191e m13170a(JSONObject jSONObject) {
        long optLong = jSONObject.optLong("time");
        int optInt = jSONObject.optInt("cli", -1);
        int optInt2 = jSONObject.optInt("imp", -1);
        int optInt3 = jSONObject.optInt("com", -1);
        if (optLong == 0 || optInt < 0 || optInt2 < 0 || optInt3 < 0) {
            return null;
        }
        return new C4191e(optInt2, optInt, optInt3, optLong);
    }
}
