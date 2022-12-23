package com.bytedance.sdk.openadsdk.p128b.p130b.p132b;

import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.b.b.d */
/* compiled from: FeedBreakModel */
public class C3073d implements C3072c {

    /* renamed from: a */
    public long f7184a;

    /* renamed from: b */
    public long f7185b;

    /* renamed from: c */
    public int f7186c;

    /* renamed from: d */
    public int f7187d = 0;

    /* renamed from: a */
    public void mo18595a(long j) {
        this.f7184a = j;
    }

    /* renamed from: b */
    public void mo18597b(long j) {
        this.f7185b = j;
    }

    /* renamed from: a */
    public void mo18594a(int i) {
        this.f7186c = i;
    }

    /* renamed from: b */
    public void mo18596b(int i) {
        this.f7187d = i;
    }

    /* renamed from: a */
    public void mo18591a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("total_duration", this.f7184a);
                jSONObject.put("buffers_time", this.f7185b);
                jSONObject.put("break_reason", this.f7186c);
                jSONObject.put("video_backup", this.f7187d);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
