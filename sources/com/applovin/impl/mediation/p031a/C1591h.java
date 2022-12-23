package com.applovin.impl.mediation.p031a;

import com.applovin.impl.sdk.C1969m;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.a.h */
public class C1591h extends C1588f {
    public C1591h(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, C1969m mVar) {
        super(map, jSONObject, jSONObject2, mVar);
    }

    /* renamed from: a */
    public boolean mo13356a() {
        return mo13456b("only_collect_signal_when_initialized", (Boolean) false).booleanValue();
    }

    public String toString() {
        return "SignalProviderSpec{adObject=" + mo13429J() + '}';
    }
}
