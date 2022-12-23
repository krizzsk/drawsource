package com.ironsource.mediationsdk.p206a;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.a.e */
final class C6519e extends C6508a {

    /* renamed from: d */
    private final String f16803d = "https://outcome-ssp.supersonicads.com/mediation?adUnit=2";

    /* renamed from: e */
    private final String f16804e = "super.dwh.mediation_events";

    /* renamed from: f */
    private final String f16805f = "table";

    /* renamed from: g */
    private final String f16806g = "data";

    C6519e(int i) {
        this.f16735b = i;
    }

    /* renamed from: a */
    public final String mo36332a(ArrayList<C6517c> arrayList, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        this.f16734a = jSONObject;
        try {
            JSONArray jSONArray = new JSONArray();
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator<C6517c> it = arrayList.iterator();
                while (it.hasNext()) {
                    JSONObject a = m19679a(it.next());
                    if (a != null) {
                        jSONArray.put(a);
                    }
                }
            }
            jSONObject2.put("table", "super.dwh.mediation_events");
            jSONObject2.put("data", mo36333a(jSONArray));
            return jSONObject2.toString();
        } catch (JSONException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: b */
    public final String mo36334b() {
        return "https://outcome-ssp.supersonicads.com/mediation?adUnit=2";
    }

    /* renamed from: c */
    public final String mo36335c() {
        return "ironbeast";
    }
}
