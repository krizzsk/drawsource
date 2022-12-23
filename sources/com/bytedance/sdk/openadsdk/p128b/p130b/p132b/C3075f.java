package com.bytedance.sdk.openadsdk.p128b.p130b.p132b;

import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.b.b.f */
/* compiled from: FeedOverModel */
public class C3075f implements C3072c {

    /* renamed from: a */
    private long f7190a;

    /* renamed from: b */
    private long f7191b;

    /* renamed from: c */
    private int f7192c = 0;

    /* renamed from: a */
    public void mo18601a(long j) {
        this.f7190a = j;
    }

    /* renamed from: b */
    public void mo18602b(long j) {
        this.f7191b = j;
    }

    /* renamed from: a */
    public void mo18600a(int i) {
        this.f7192c = i;
    }

    /* renamed from: a */
    public void mo18591a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("total_duration", this.f7190a);
                jSONObject.put("buffers_time", this.f7191b);
                jSONObject.put("video_backup", this.f7192c);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
