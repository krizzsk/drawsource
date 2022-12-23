package com.fyber.inneractive.sdk.config.global;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.global.l */
public class C4244l {

    /* renamed from: a */
    public final Map<String, C4249q> f10447a = new HashMap();

    /* renamed from: a */
    public C4249q mo24257a(String str) {
        return this.f10447a.get(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4244l.class != obj.getClass()) {
            return false;
        }
        return this.f10447a.equals(((C4244l) obj).f10447a);
    }

    public int hashCode() {
        return this.f10447a.hashCode();
    }

    public String toString() {
        return String.format("remoteConfig - features: %s", new Object[]{this.f10447a.values()});
    }

    /* renamed from: a */
    public static C4244l m13251a(JSONObject jSONObject) throws Exception {
        C4244l lVar = new C4244l();
        JSONArray optJSONArray = jSONObject.optJSONArray("features");
        int i = 0;
        int i2 = 0;
        while (i2 < optJSONArray.length()) {
            JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
            C4249q qVar = new C4249q();
            qVar.f10450b = jSONObject2.getString("id");
            JSONObject optJSONObject = jSONObject2.optJSONObject("params");
            if (optJSONObject != null) {
                qVar.f10449a = new C4247o(optJSONObject);
            } else {
                Object[] objArr = new Object[1];
                objArr[i] = qVar.f10450b;
                IAlog.m16446a("RemoteFeature fromJson. feature %s has no params!", objArr);
            }
            JSONArray optJSONArray2 = jSONObject2.optJSONArray("experiments");
            if (optJSONArray2 != null) {
                int i3 = i;
                while (i3 < optJSONArray2.length()) {
                    JSONObject jSONObject3 = optJSONArray2.getJSONObject(i3);
                    C4220b bVar = new C4220b();
                    bVar.f10412a = jSONObject3.getString("id");
                    bVar.f10413b = jSONObject3.optInt("perc", 10);
                    JSONArray jSONArray = jSONObject3.getJSONArray("variants");
                    for (int i4 = i; i4 < jSONArray.length(); i4++) {
                        JSONObject jSONObject4 = jSONArray.getJSONObject(i4);
                        C4243k kVar = new C4243k();
                        kVar.f10445b = jSONObject4.getString("id");
                        kVar.f10446c = jSONObject4.getInt("perc");
                        JSONObject optJSONObject2 = jSONObject4.optJSONObject("params");
                        if (optJSONObject2 != null) {
                            kVar.f10449a = new C4247o(optJSONObject2);
                        }
                        bVar.f10414c.add(kVar);
                    }
                    C4220b.m13216a(bVar, jSONObject3.optJSONObject("include"), true);
                    C4220b.m13216a(bVar, jSONObject3.optJSONObject("exclude"), false);
                    qVar.f10451c.put(bVar.f10412a, bVar);
                    i3++;
                    i = 0;
                }
            }
            lVar.f10447a.put(qVar.f10450b, qVar);
            i2++;
            i = i;
        }
        return lVar;
    }
}
