package com.bytedance.sdk.openadsdk.p128b.p130b.p132b;

import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.b.b.g */
/* compiled from: FeedPauseModel */
public class C3076g implements C3072c {

    /* renamed from: a */
    private long f7193a;

    /* renamed from: b */
    private long f7194b;

    /* renamed from: a */
    public void mo18603a(long j) {
        this.f7193a = j;
    }

    /* renamed from: b */
    public void mo18604b(long j) {
        this.f7194b = j;
    }

    /* renamed from: a */
    public void mo18591a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("buffers_time", this.f7193a);
                jSONObject.put("total_duration", this.f7194b);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
