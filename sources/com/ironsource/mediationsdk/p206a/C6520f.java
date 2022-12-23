package com.ironsource.mediationsdk.p206a;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.a.f */
final class C6520f extends C6508a {

    /* renamed from: d */
    private final String f16807d = "https://outcome-ssp.supersonicads.com/mediation?adUnit=3";

    C6520f(int i) {
        this.f16735b = i;
    }

    /* renamed from: a */
    public final String mo36332a(ArrayList<C6517c> arrayList, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        this.f16734a = jSONObject;
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
        return mo36333a(jSONArray);
    }

    /* renamed from: b */
    public final String mo36334b() {
        return "https://outcome-ssp.supersonicads.com/mediation?adUnit=3";
    }

    /* renamed from: c */
    public final String mo36335c() {
        return "outcome";
    }
}
