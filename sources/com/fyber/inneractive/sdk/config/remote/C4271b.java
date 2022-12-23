package com.fyber.inneractive.sdk.config.remote;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.remote.b */
public class C4271b {

    /* renamed from: a */
    public UnitDisplayType f10500a;

    /* renamed from: b */
    public Boolean f10501b;

    /* renamed from: c */
    public Integer f10502c;

    /* renamed from: d */
    public Integer f10503d;

    /* renamed from: a */
    public static C4271b m13302a(JSONObject jSONObject) {
        Integer num = null;
        if (jSONObject == null) {
            return null;
        }
        C4271b bVar = new C4271b();
        Integer valueOf = Integer.valueOf(jSONObject.optInt("hide", Integer.MIN_VALUE));
        Integer valueOf2 = Integer.valueOf(jSONObject.optInt("refresh", Integer.MIN_VALUE));
        bVar.f10500a = UnitDisplayType.fromValue(jSONObject.optString("unitDisplayType"));
        bVar.f10501b = jSONObject.has("close") ? Boolean.valueOf(jSONObject.optBoolean("close", true)) : null;
        if (valueOf.intValue() == Integer.MIN_VALUE) {
            valueOf = null;
        }
        bVar.f10503d = valueOf;
        if (valueOf2.intValue() != Integer.MIN_VALUE) {
            num = valueOf2;
        }
        bVar.f10502c = num;
        return bVar;
    }
}
