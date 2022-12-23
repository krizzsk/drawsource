package com.bytedance.sdk.openadsdk.p128b.p130b.p132b;

import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.b.b.l */
/* compiled from: LoadVideoSuccessModel */
public class C3081l implements C3072c {

    /* renamed from: a */
    private String f7208a;

    /* renamed from: b */
    private long f7209b;

    /* renamed from: c */
    private long f7210c;

    /* renamed from: d */
    private long f7211d;

    /* renamed from: a */
    public void mo18615a(String str) {
        this.f7208a = str;
    }

    /* renamed from: a */
    public void mo18614a(long j) {
        this.f7209b = j;
    }

    /* renamed from: b */
    public void mo18616b(long j) {
        this.f7210c = j;
    }

    /* renamed from: c */
    public void mo18617c(long j) {
        this.f7211d = j;
    }

    /* renamed from: a */
    public void mo18591a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("preload_url", this.f7208a);
                jSONObject.put("preload_size", this.f7209b);
                jSONObject.put("load_time", this.f7210c);
                jSONObject.put("local_cache", this.f7211d);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
