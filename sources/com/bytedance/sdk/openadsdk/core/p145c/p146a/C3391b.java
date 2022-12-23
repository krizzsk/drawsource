package com.bytedance.sdk.openadsdk.core.p145c.p146a;

import com.bytedance.sdk.component.p108d.p117d.C2815g;
import com.bytedance.sdk.component.p118e.p121c.C2856c;
import com.bytedance.sdk.openadsdk.common.C3158a;
import com.bytedance.sdk.openadsdk.core.C3513m;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.c.a.b */
/* compiled from: DynamicAppInfo */
public class C3391b {
    /* renamed from: b */
    private List<String> m10091b() {
        return Arrays.asList(new String[]{C2856c.c1659536876586dc("aqrJjci"), C2856c.c1659536876586dc("aeKmbj"), C2856c.c1659536876586dc("gdvWahvki}oBbka")});
    }

    /* renamed from: a */
    public JSONObject mo19373a() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (String put : m10091b()) {
            jSONArray.put(put);
        }
        try {
            jSONObject.put(C2856c.c1659536876586dc("aqrMehc"), C3158a.m9134a());
            jSONObject.put(C2856c.c1659536876586dc("iolfvDvwFhgn"), C3158a.m9139e());
            jSONObject.put(C2815g.g1659536876620dc("ahf"), C3158a.m9136b());
            jSONObject.put(C2815g.g1659536876620dc("seiF`lrngg"), C3158a.m9137c());
            jSONObject.put(C2815g.g1659536876620dc("aqrUawungg"), C3158a.m9138d());
            jSONObject.put(C2815g.g1659536876620dc("ndvW}uc"), C3158a.m9140f());
            jSONObject.put(C2815g.g1659536876620dc("strskwrKaz~"), jSONArray);
            jSONObject.put(C2815g.g1659536876620dc("ddtjg`Oc"), C3158a.m9135a(C3513m.m10963a()));
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}
