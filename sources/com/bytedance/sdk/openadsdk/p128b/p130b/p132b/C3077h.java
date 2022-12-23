package com.bytedance.sdk.openadsdk.p128b.p130b.p132b;

import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.b.b.h */
/* compiled from: FeedPlayModel */
public class C3077h implements C3072c {

    /* renamed from: a */
    private long f7195a;

    /* renamed from: b */
    private long f7196b;

    /* renamed from: c */
    private int f7197c;

    /* renamed from: a */
    public void mo18606a(long j) {
        this.f7195a = j;
    }

    /* renamed from: b */
    public void mo18607b(long j) {
        this.f7196b = j;
    }

    /* renamed from: a */
    public void mo18605a(int i) {
        this.f7197c = i;
    }

    /* renamed from: a */
    public void mo18591a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("video_start_duration", this.f7195a);
                jSONObject.put("video_cache_size", this.f7196b);
                jSONObject.put("is_auto_play", this.f7197c);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
