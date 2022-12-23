package com.bytedance.sdk.openadsdk.p128b.p130b.p132b;

import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.b.b.k */
/* compiled from: LoadVideoStartModel */
public class C3080k implements C3072c {

    /* renamed from: a */
    private String f7206a;

    /* renamed from: b */
    private long f7207b;

    public C3080k(String str, long j) {
        this.f7206a = str;
        this.f7207b = j;
    }

    /* renamed from: a */
    public void mo18591a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("preload_url", this.f7206a);
                jSONObject.put("preload_size", this.f7207b);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
