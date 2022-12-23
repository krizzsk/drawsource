package com.bytedance.sdk.component.p088a;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.a.p */
/* compiled from: Java2JsMsg */
public final class C2508p {

    /* renamed from: a */
    private final Map<String, Object> f5277a = new ConcurrentHashMap();

    /* renamed from: a */
    public static C2508p m6277a() {
        return new C2508p();
    }

    private C2508p() {
    }

    /* renamed from: a */
    public C2508p mo16513a(String str, Object obj) {
        if (!TextUtils.isEmpty(str) && obj != null) {
            this.f5277a.put(str, obj);
        }
        return this;
    }

    /* renamed from: b */
    public String mo16514b() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry next : this.f5277a.entrySet()) {
                jSONObject.put((String) next.getKey(), next.getValue());
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }
}
