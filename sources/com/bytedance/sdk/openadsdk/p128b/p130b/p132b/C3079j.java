package com.bytedance.sdk.openadsdk.p128b.p130b.p132b;

import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.b.b.j */
/* compiled from: LoadVideoErrorModel */
public class C3079j implements C3072c {

    /* renamed from: a */
    private String f7200a;

    /* renamed from: b */
    private long f7201b;

    /* renamed from: c */
    private long f7202c;

    /* renamed from: d */
    private int f7203d;

    /* renamed from: e */
    private String f7204e;

    /* renamed from: f */
    private String f7205f;

    /* renamed from: a */
    public void mo18610a(String str) {
        this.f7200a = str;
    }

    /* renamed from: a */
    public void mo18609a(long j) {
        this.f7201b = j;
    }

    /* renamed from: b */
    public void mo18611b(long j) {
        this.f7202c = j;
    }

    /* renamed from: a */
    public void mo18608a(int i) {
        this.f7203d = i;
    }

    /* renamed from: b */
    public void mo18612b(String str) {
        this.f7204e = str;
    }

    /* renamed from: c */
    public void mo18613c(String str) {
        this.f7205f = str;
    }

    /* renamed from: a */
    public void mo18591a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("preload_url", this.f7200a);
                jSONObject.put("preload_size", this.f7201b);
                jSONObject.put("load_time", this.f7202c);
                jSONObject.put("error_code", this.f7203d);
                jSONObject.put("error_message", this.f7204e);
                jSONObject.put("error_message_server", this.f7205f);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
