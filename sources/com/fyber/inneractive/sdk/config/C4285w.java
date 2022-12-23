package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.C5297m0;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.w */
public class C4285w implements C5297m0.C5298a {

    /* renamed from: a */
    public UnitDisplayType f10541a;

    /* renamed from: a */
    public JSONObject mo24189a() {
        JSONObject jSONObject = new JSONObject();
        C5297m0.m16518a(jSONObject, "unitDisplayType", this.f10541a);
        return jSONObject;
    }
}
