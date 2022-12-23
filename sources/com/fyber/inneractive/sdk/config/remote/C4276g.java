package com.fyber.inneractive.sdk.config.remote;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.remote.g */
public class C4276g {

    /* renamed from: a */
    public UnitDisplayType f10509a;

    /* renamed from: a */
    public static C4276g m13307a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C4276g gVar = new C4276g();
        UnitDisplayType fromValue = UnitDisplayType.fromValue(jSONObject.optString("unitDisplayType"));
        if (fromValue == null) {
            return null;
        }
        gVar.f10509a = fromValue;
        return gVar;
    }
}
