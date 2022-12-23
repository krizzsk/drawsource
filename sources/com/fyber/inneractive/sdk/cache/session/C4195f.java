package com.fyber.inneractive.sdk.cache.session;

import com.fyber.inneractive.sdk.cache.session.enums.C4193b;
import com.vungle.warren.model.SessionDataDBAdapter;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.cache.session.f */
public class C4195f {

    /* renamed from: a */
    public HashMap<C4193b, C4191e> f10322a = new C4196a(this);

    /* renamed from: com.fyber.inneractive.sdk.cache.session.f$a */
    public class C4196a extends HashMap<C4193b, C4191e> {
        public C4196a(C4195f fVar) {
            for (C4193b bVar : C4193b.values()) {
                if (bVar != C4193b.NONE) {
                    put(bVar, new C4191e());
                }
            }
        }
    }

    /* renamed from: a */
    public JSONObject mo24181a() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry next : this.f10322a.entrySet()) {
                C4193b bVar = (C4193b) next.getKey();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("type", bVar.f10319a.value());
                    if (bVar.name().toLowerCase().contains("video")) {
                        str = "video";
                    } else {
                        str = "display";
                    }
                    jSONObject2.put("subType", str);
                    jSONObject2.put(SessionDataDBAdapter.SessionDataColumns.TABLE_NAME, ((C4191e) next.getValue()).mo24180a(true, true));
                    jSONArray.put(jSONObject2);
                } catch (Exception unused) {
                }
            }
            jSONObject.put("content", jSONArray);
        } catch (Exception unused2) {
        }
        return jSONObject;
    }
}
