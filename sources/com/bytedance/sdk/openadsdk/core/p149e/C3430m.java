package com.bytedance.sdk.openadsdk.core.p149e;

/* renamed from: com.bytedance.sdk.openadsdk.core.e.m */
/* compiled from: LoadingInfo */
public class C3430m {

    /* renamed from: a */
    private long f8352a = 10000;

    /* renamed from: b */
    private long f8353b = 10000;

    /* renamed from: c */
    private String f8354c = "";

    /* renamed from: a */
    public long mo19499a() {
        return this.f8352a;
    }

    /* renamed from: a */
    public void mo19500a(long j) {
        if (j <= 0) {
            this.f8352a = 10;
        } else {
            this.f8352a = j;
        }
    }

    /* renamed from: b */
    public long mo19502b() {
        return this.f8353b;
    }

    /* renamed from: b */
    public void mo19503b(long j) {
        if (j < 0) {
            this.f8353b = 20;
        } else {
            this.f8353b = j;
        }
    }

    /* renamed from: c */
    public String mo19504c() {
        return this.f8354c;
    }

    /* renamed from: a */
    public void mo19501a(String str) {
        this.f8354c = str;
    }
}
