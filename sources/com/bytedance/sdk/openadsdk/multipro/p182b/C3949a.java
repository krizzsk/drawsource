package com.bytedance.sdk.openadsdk.multipro.p182b;

import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.b.a */
/* compiled from: VideoControllerDataModel */
public class C3949a {

    /* renamed from: a */
    public boolean f10056a;

    /* renamed from: b */
    public boolean f10057b;

    /* renamed from: c */
    public boolean f10058c;

    /* renamed from: d */
    public boolean f10059d;

    /* renamed from: e */
    public long f10060e;

    /* renamed from: f */
    public long f10061f;

    /* renamed from: g */
    public long f10062g;

    /* renamed from: com.bytedance.sdk.openadsdk.multipro.b.a$a */
    /* compiled from: VideoControllerDataModel */
    public interface C3950a {
        /* renamed from: f */
        C3949a mo18856f();
    }

    /* renamed from: a */
    public C3949a mo20848a(boolean z) {
        this.f10059d = z;
        return this;
    }

    /* renamed from: b */
    public C3949a mo20851b(boolean z) {
        this.f10056a = z;
        return this;
    }

    /* renamed from: c */
    public C3949a mo20853c(boolean z) {
        this.f10057b = z;
        return this;
    }

    /* renamed from: d */
    public C3949a mo20854d(boolean z) {
        this.f10058c = z;
        return this;
    }

    /* renamed from: a */
    public C3949a mo20847a(long j) {
        this.f10060e = j;
        return this;
    }

    /* renamed from: b */
    public C3949a mo20850b(long j) {
        this.f10061f = j;
        return this;
    }

    /* renamed from: c */
    public C3949a mo20852c(long j) {
        this.f10062g = j;
        return this;
    }

    /* renamed from: a */
    public JSONObject mo20849a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isCompleted", this.f10056a);
            jSONObject.put("isFromVideoDetailPage", this.f10057b);
            jSONObject.put("isFromDetailPage", this.f10058c);
            jSONObject.put("duration", this.f10060e);
            jSONObject.put("totalPlayDuration", this.f10061f);
            jSONObject.put("currentPlayPosition", this.f10062g);
            jSONObject.put("isAutoPlay", this.f10059d);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static C3949a m12960a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C3949a aVar = new C3949a();
        aVar.mo20851b(jSONObject.optBoolean("isCompleted"));
        aVar.mo20853c(jSONObject.optBoolean("isFromVideoDetailPage"));
        aVar.mo20854d(jSONObject.optBoolean("isFromDetailPage"));
        aVar.mo20847a(jSONObject.optLong("duration"));
        aVar.mo20850b(jSONObject.optLong("totalPlayDuration"));
        aVar.mo20852c(jSONObject.optLong("currentPlayPosition"));
        aVar.mo20848a(jSONObject.optBoolean("isAutoPlay"));
        return aVar;
    }
}
