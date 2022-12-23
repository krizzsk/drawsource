package com.ironsource.sdk.p285g;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.g.f */
public class C8300f {

    /* renamed from: d */
    public JSONObject f20259d;

    public C8300f() {
        this.f20259d = new JSONObject();
    }

    public C8300f(String str) {
        try {
            this.f20259d = new JSONObject(str);
        } catch (Exception unused) {
            this.f20259d = new JSONObject();
        }
    }

    /* renamed from: a */
    private Object m23645a(Object obj) {
        if (obj == JSONObject.NULL) {
            return null;
        }
        return obj instanceof JSONObject ? m23646a((JSONObject) obj) : obj instanceof JSONArray ? mo56740a((JSONArray) obj) : obj;
    }

    /* renamed from: a */
    private Map<String, Object> m23646a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, m23645a(jSONObject.get(next)));
        }
        return hashMap;
    }

    /* renamed from: a */
    public final List mo56740a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(m23645a(jSONArray.get(i)));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo56741a(String str, String str2) {
        try {
            this.f20259d.put(str, str2);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo56742a(String str, JSONObject jSONObject) {
        try {
            this.f20259d.put(str, jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final boolean mo56743a(String str) {
        return this.f20259d.has(str);
    }

    /* renamed from: b */
    public final boolean mo56744b(String str) {
        return this.f20259d.isNull(str);
    }

    /* renamed from: c */
    public final Object mo56745c(String str) {
        try {
            return this.f20259d.get(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public final String mo56746d(String str) {
        try {
            return this.f20259d.getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public final boolean mo56747e(String str) {
        try {
            return this.f20259d.getBoolean(str);
        } catch (JSONException unused) {
            return false;
        }
    }

    public String toString() {
        JSONObject jSONObject = this.f20259d;
        return jSONObject == null ? "" : jSONObject.toString();
    }
}
