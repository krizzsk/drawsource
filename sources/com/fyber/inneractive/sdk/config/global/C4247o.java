package com.fyber.inneractive.sdk.config.global;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.global.o */
public class C4247o implements C4246n {

    /* renamed from: a */
    public JSONObject f10448a;

    public C4247o(JSONObject jSONObject) {
        this.f10448a = jSONObject;
    }

    /* renamed from: a */
    public Double mo24236a(String str) {
        return Double.valueOf(this.f10448a.optDouble(str, 0.0d));
    }

    /* renamed from: b */
    public Integer mo24240b(String str) {
        if (this.f10448a.has(str)) {
            try {
                return Integer.valueOf(this.f10448a.getInt(str));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: c */
    public String mo24241c(String str) {
        if (this.f10448a.has(str)) {
            try {
                return this.f10448a.getString(str);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: d */
    public Boolean mo24242d(String str) {
        if (this.f10448a.has(str)) {
            try {
                return Boolean.valueOf(this.f10448a.getBoolean(str));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public String toString() {
        JSONObject jSONObject = this.f10448a;
        return jSONObject != null ? jSONObject.toString() : "no params";
    }

    /* renamed from: a */
    public String mo24237a(String str, String str2) {
        return this.f10448a.optString(str, str2);
    }

    /* renamed from: a */
    public Map<String, Object> mo24261a() {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = this.f10448a.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                hashMap.put(next, this.f10448a.get(next));
            } catch (Exception unused) {
            }
        }
        return hashMap;
    }
}
