package com.ironsource.mediationsdk.model;

import com.ironsource.mediationsdk.IronSource;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.model.a */
public final class C6650a {

    /* renamed from: a */
    public NetworkSettings f17320a;

    /* renamed from: b */
    public JSONObject f17321b;

    /* renamed from: c */
    public boolean f17322c;

    /* renamed from: d */
    public int f17323d;

    /* renamed from: e */
    public int f17324e;

    /* renamed from: f */
    public IronSource.AD_UNIT f17325f;

    public C6650a(NetworkSettings networkSettings, JSONObject jSONObject, IronSource.AD_UNIT ad_unit) {
        this.f17320a = networkSettings;
        this.f17321b = jSONObject;
        int optInt = jSONObject.optInt("instanceType");
        this.f17323d = optInt;
        this.f17322c = optInt == 2;
        this.f17324e = jSONObject.optInt("maxAdsPerSession", 99);
        this.f17325f = ad_unit;
    }
}
