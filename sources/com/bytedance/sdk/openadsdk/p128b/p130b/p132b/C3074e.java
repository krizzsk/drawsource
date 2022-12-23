package com.bytedance.sdk.openadsdk.p128b.p130b.p132b;

import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.b.b.e */
/* compiled from: FeedContinueModel */
public class C3074e implements C3072c {

    /* renamed from: a */
    private long f7188a;

    /* renamed from: b */
    private long f7189b;

    /* renamed from: a */
    public void mo18598a(long j) {
        this.f7188a = j;
    }

    /* renamed from: b */
    public void mo18599b(long j) {
        this.f7189b = j;
    }

    /* renamed from: a */
    public void mo18591a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("buffers_time", this.f7188a);
                jSONObject.put("total_duration", this.f7189b);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
