package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.C5297m0;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.r */
public class C4269r implements C5297m0.C5298a {

    /* renamed from: a */
    public Integer f10489a = null;

    /* renamed from: b */
    public UnitDisplayType f10490b;

    /* renamed from: c */
    public Boolean f10491c;

    /* renamed from: d */
    public Integer f10492d;

    /* renamed from: a */
    public JSONObject mo24189a() {
        JSONObject jSONObject = new JSONObject();
        C5297m0.m16518a(jSONObject, "refresh", this.f10489a);
        C5297m0.m16518a(jSONObject, "unitDisplayType", this.f10490b);
        C5297m0.m16518a(jSONObject, "close", this.f10491c);
        C5297m0.m16518a(jSONObject, "hideDelay", this.f10492d);
        return jSONObject;
    }
}
