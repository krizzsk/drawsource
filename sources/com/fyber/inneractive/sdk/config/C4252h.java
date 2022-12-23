package com.fyber.inneractive.sdk.config;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.h */
public class C4252h {

    /* renamed from: a */
    public final Map<String, String> f10456a = new HashMap();

    /* renamed from: b */
    public final Map<String, C4218g> f10457b = new HashMap();

    /* renamed from: a */
    public static C4252h m13286a(JSONObject jSONObject) {
        C4252h hVar = new C4252h();
        JSONObject optJSONObject = jSONObject.optJSONObject("params");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("overrides");
        JSONArray names = optJSONObject.names();
        for (int i = 0; i < names.length(); i++) {
            String optString = names.optString(i, (String) null);
            String optString2 = optJSONObject.optString(optString, (String) null);
            if (!(optString == null || optString2 == null)) {
                hVar.f10456a.put(optString, optString2);
            }
        }
        if (optJSONObject2 != null) {
            JSONArray names2 = optJSONObject2.names();
            for (int i2 = 0; i2 < names2.length(); i2++) {
                String optString3 = names2.optString(i2, (String) null);
                JSONObject optJSONObject3 = optJSONObject2.optJSONObject(optString3);
                if (!(optString3 == null || optJSONObject3 == null)) {
                    hVar.f10457b.put(optString3, new C4218g(optJSONObject3));
                }
            }
        }
        return hVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4252h.class != obj.getClass()) {
            return false;
        }
        C4252h hVar = (C4252h) obj;
        if (!this.f10456a.equals(hVar.f10456a) || !this.f10457b.equals(hVar.f10457b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f10456a.hashCode();
    }

    /* renamed from: a */
    public int mo24271a(String str, int i, int i2) {
        String num = Integer.toString(i);
        if (this.f10456a.containsKey(str)) {
            num = this.f10456a.get(str);
        }
        try {
            i = Integer.parseInt(num);
        } catch (Throwable unused) {
        }
        return Math.max(i, i2);
    }

    /* renamed from: a */
    public boolean mo24273a(String str, boolean z) {
        String bool = Boolean.toString(z);
        if (this.f10456a.containsKey(str)) {
            bool = this.f10456a.get(str);
        }
        try {
            return Boolean.parseBoolean(bool);
        } catch (Throwable unused) {
            return z;
        }
    }

    /* renamed from: a */
    public C4217f mo24272a(String str) {
        C4218g gVar;
        String str2 = IAConfigManager.f10324J.f10338d;
        if (this.f10457b.containsKey(str2)) {
            gVar = this.f10457b.get(str2);
        } else {
            gVar = new C4218g();
        }
        gVar.getClass();
        return gVar.f10409a.containsKey(str) ? gVar.f10409a.get(str) : new C4217f();
    }
}
