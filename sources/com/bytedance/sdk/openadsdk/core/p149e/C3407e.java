package com.bytedance.sdk.openadsdk.core.p149e;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.e.e */
/* compiled from: AutoTestModel */
public class C3407e {

    /* renamed from: a */
    private String f8214a = "";

    /* renamed from: b */
    private List<String> f8215b = new ArrayList();

    public C3407e(String str) {
        HashMap<String, Object> hashMap = TextUtils.isEmpty(str) ? new HashMap<>() : m10163a(str);
        try {
            this.f8214a = (String) hashMap.get("auto_test_param");
            JSONArray jSONArray = new JSONArray((String) hashMap.get("auto_test_hosts"));
            this.f8215b = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                this.f8215b.add(jSONArray.optString(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public String mo19417a() {
        return this.f8214a;
    }

    /* renamed from: b */
    public List<String> mo19418b() {
        return this.f8215b;
    }

    /* renamed from: a */
    private static final HashMap<String, Object> m10163a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap<>();
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                hashMap.put(optJSONObject.optString("name"), optJSONObject.optString("value"));
            }
            return hashMap;
        } catch (Exception unused) {
            return new HashMap<>();
        }
    }
}
