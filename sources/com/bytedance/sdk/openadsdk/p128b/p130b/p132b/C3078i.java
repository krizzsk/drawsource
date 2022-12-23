package com.bytedance.sdk.openadsdk.p128b.p130b.p132b;

import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.b.b.i */
/* compiled from: LoadVideoCancelModel */
public class C3078i implements C3072c {

    /* renamed from: a */
    private String f7198a;

    /* renamed from: b */
    private long f7199b;

    public C3078i(String str, long j) {
        this.f7198a = str;
        this.f7199b = j;
    }

    /* renamed from: a */
    public void mo18591a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("preload_url", this.f7198a);
                jSONObject.put("preload_size", this.f7199b);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
