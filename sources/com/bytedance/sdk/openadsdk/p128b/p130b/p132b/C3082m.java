package com.bytedance.sdk.openadsdk.p128b.p130b.p132b;

import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.b.b.m */
/* compiled from: PlayBufferModel */
public class C3082m implements C3072c {

    /* renamed from: a */
    public long f7212a;

    /* renamed from: b */
    public int f7213b;

    /* renamed from: c */
    public long f7214c;

    /* renamed from: a */
    public void mo18619a(long j) {
        this.f7212a = j;
    }

    /* renamed from: a */
    public void mo18618a(int i) {
        this.f7213b = i;
    }

    /* renamed from: b */
    public void mo18620b(long j) {
        this.f7214c = j;
    }

    /* renamed from: a */
    public void mo18591a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("buffers_time", this.f7212a);
                jSONObject.put("buffers_count", this.f7213b);
                jSONObject.put("total_duration", this.f7214c);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
