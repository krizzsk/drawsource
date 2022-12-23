package com.fyber.inneractive.sdk.config;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.g */
public class C4218g {

    /* renamed from: a */
    public final Map<String, C4217f> f10409a = new HashMap();

    public C4218g() {
    }

    /* renamed from: a */
    public final void mo24229a(JSONObject jSONObject) {
        JSONArray names;
        if (jSONObject != null) {
            JSONArray names2 = jSONObject.names();
            for (int i = 0; i < names2.length(); i++) {
                String optString = names2.optString(i, (String) null);
                JSONObject optJSONObject = jSONObject.optJSONObject(optString);
                C4217f fVar = new C4217f();
                if (!(optJSONObject == null || (names = optJSONObject.names()) == null)) {
                    for (int i2 = 0; i2 < names.length(); i2++) {
                        String optString2 = names.optString(i2, (String) null);
                        String optString3 = optJSONObject.optString(optString2, (String) null);
                        if (!(optString2 == null || optString3 == null)) {
                            fVar.f10408a.put(optString2, optString3);
                        }
                    }
                }
                this.f10409a.put(optString, fVar);
            }
        }
    }

    public C4218g(JSONObject jSONObject) {
        mo24229a(jSONObject);
    }
}
