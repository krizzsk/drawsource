package com.bytedance.sdk.component.adexpress.dynamic.p098b;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.b.d */
/* compiled from: DynamicDiffPlugin */
public class C2613d {

    /* renamed from: a */
    public List<C2614a> f5581a;

    /* renamed from: b */
    public String f5582b;

    /* renamed from: c */
    public String f5583c;

    /* renamed from: d */
    public String f5584d;

    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.b.d$a */
    /* compiled from: DynamicDiffPlugin */
    public static class C2614a {

        /* renamed from: a */
        public int f5585a;

        /* renamed from: b */
        public JSONObject f5586b;
    }

    /* renamed from: a */
    public static C2613d m6764a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C2613d dVar = new C2613d();
        String optString = jSONObject.optString("custom_components");
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(optString);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    C2614a aVar = new C2614a();
                    aVar.f5585a = optJSONObject.optInt("id");
                    aVar.f5586b = new JSONObject(optJSONObject.optString("componentLayout"));
                    arrayList.add(aVar);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        dVar.f5581a = arrayList;
        dVar.f5582b = jSONObject.optString("diff_data");
        dVar.f5583c = jSONObject.optString("style_diff");
        dVar.f5584d = jSONObject.optString("tag_diff");
        return dVar;
    }
}
