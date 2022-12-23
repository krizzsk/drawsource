package com.bytedance.sdk.openadsdk.p128b.p130b.p132b;

import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.b.b.b */
/* compiled from: EndcardSkipModel */
public class C3071b implements C3072c {

    /* renamed from: a */
    private long f7180a;

    /* renamed from: b */
    private long f7181b;

    /* renamed from: c */
    private int f7182c;

    /* renamed from: d */
    private int f7183d;

    /* renamed from: a */
    public void mo18590a(long j) {
        this.f7180a = j;
    }

    /* renamed from: b */
    public void mo18593b(long j) {
        this.f7181b = j;
    }

    /* renamed from: a */
    public void mo18589a(int i) {
        this.f7182c = i;
    }

    /* renamed from: b */
    public void mo18592b(int i) {
        this.f7183d = i;
    }

    /* renamed from: a */
    public void mo18591a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("buffers_time", this.f7180a);
                jSONObject.put("total_duration", this.f7181b);
                jSONObject.put("vbtt_skip_type", this.f7182c);
                jSONObject.put("skip_reason", this.f7183d);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
