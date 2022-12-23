package com.bytedance.sdk.openadsdk.p128b;

import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.j */
/* compiled from: AdShowTime */
public class C3100j {

    /* renamed from: a */
    private long f7275a;

    /* renamed from: b */
    private long f7276b;

    /* renamed from: c */
    private long f7277c;

    /* renamed from: d */
    private long f7278d;

    /* renamed from: e */
    private long f7279e;

    /* renamed from: a */
    public JSONObject mo18679a(JSONObject jSONObject) {
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (Exception unused) {
            }
        }
        if (this.f7275a > 0) {
            jSONObject.put("show_start", this.f7275a);
            if (this.f7276b > 0) {
                jSONObject.put("show_firstQuartile", this.f7276b);
                if (this.f7277c > 0) {
                    jSONObject.put("show_mid", this.f7277c);
                    if (this.f7278d > 0) {
                        jSONObject.put("show_thirdQuartile", this.f7278d);
                        if (this.f7279e > 0) {
                            jSONObject.put("show_full", this.f7279e);
                        }
                    }
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public void mo18680a(long j) {
        if (this.f7275a <= 0) {
            this.f7275a = j;
        }
    }

    /* renamed from: a */
    public void mo18681a(long j, float f) {
        if (f > 0.0f) {
            mo18680a(j);
        }
        double d = (double) f;
        if (d >= 0.25d) {
            mo18680a(j);
            mo18684b(j);
        }
        if (d >= 0.5d) {
            mo18680a(j);
            mo18684b(j);
            mo18685c(j);
        }
        if (d >= 0.75d) {
            mo18680a(j);
            mo18684b(j);
            mo18685c(j);
            mo18686d(j);
        }
        if (f >= 1.0f) {
            mo18680a(j);
            mo18684b(j);
            mo18685c(j);
            mo18686d(j);
            mo18687e(j);
        }
    }

    /* renamed from: a */
    public boolean mo18682a() {
        return this.f7275a > 0;
    }

    /* renamed from: b */
    public JSONObject mo18683b() {
        return mo18679a((JSONObject) null);
    }

    /* renamed from: b */
    public void mo18684b(long j) {
        if (this.f7276b <= 0) {
            this.f7276b = j;
        }
    }

    /* renamed from: c */
    public void mo18685c(long j) {
        if (this.f7277c <= 0) {
            this.f7277c = j;
        }
    }

    /* renamed from: d */
    public void mo18686d(long j) {
        if (this.f7278d <= 0) {
            this.f7278d = j;
        }
    }

    /* renamed from: e */
    public void mo18687e(long j) {
        if (this.f7279e <= 0) {
            this.f7279e = j;
        }
    }
}
