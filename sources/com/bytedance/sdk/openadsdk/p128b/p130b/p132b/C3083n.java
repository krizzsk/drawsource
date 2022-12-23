package com.bytedance.sdk.openadsdk.p128b.p130b.p132b;

import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.b.b.n */
/* compiled from: PlayErrorModel */
public class C3083n implements C3072c {

    /* renamed from: a */
    private long f7215a;

    /* renamed from: b */
    private long f7216b;

    /* renamed from: c */
    private int f7217c;

    /* renamed from: d */
    private int f7218d;

    /* renamed from: e */
    private String f7219e;

    /* renamed from: a */
    public void mo18622a(long j) {
        this.f7215a = j;
    }

    /* renamed from: b */
    public void mo18624b(long j) {
        this.f7216b = j;
    }

    /* renamed from: a */
    public void mo18621a(int i) {
        this.f7217c = i;
    }

    /* renamed from: b */
    public void mo18623b(int i) {
        this.f7218d = i;
    }

    /* renamed from: a */
    public void mo18591a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("buffers_time", this.f7215a);
                jSONObject.put("total_duration", this.f7216b);
                jSONObject.put("error_code", this.f7217c);
                jSONObject.put("extra_error_code", this.f7218d);
                jSONObject.put("error_message", this.f7219e);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
