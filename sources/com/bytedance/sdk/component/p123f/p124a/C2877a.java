package com.bytedance.sdk.component.p123f.p124a;

import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.f.a.a */
/* compiled from: ThreadLogModel */
public class C2877a {

    /* renamed from: a */
    public int f6469a;

    /* renamed from: b */
    public int f6470b;

    /* renamed from: c */
    public int f6471c;

    /* renamed from: d */
    public int f6472d;

    public C2877a(int i, int i2, int i3, int i4) {
        this.f6469a = i;
        this.f6470b = i2;
        this.f6471c = i3;
        this.f6472d = i4;
    }

    /* renamed from: a */
    public JSONObject mo17784a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_thread_num", this.f6469a);
            jSONObject.put("sdk_max_thread_num", this.f6470b);
            jSONObject.put("app_thread_num", this.f6471c);
            jSONObject.put("app_max_thread_num", this.f6472d);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }
}
