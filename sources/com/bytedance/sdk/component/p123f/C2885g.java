package com.bytedance.sdk.component.p123f;

/* renamed from: com.bytedance.sdk.component.f.g */
/* compiled from: TTRunnable */
public abstract class C2885g implements Comparable<C2885g>, Runnable {

    /* renamed from: a */
    private int f6496a;

    /* renamed from: b */
    private String f6497b;

    public C2885g(String str, int i) {
        this.f6496a = 0;
        this.f6496a = i == 0 ? 5 : i;
        this.f6497b = str;
    }

    public C2885g(String str) {
        this.f6496a = 0;
        this.f6496a = 5;
        this.f6497b = str;
    }

    /* renamed from: a */
    public void mo17800a(int i) {
        this.f6496a = i;
    }

    /* renamed from: a */
    public int mo17798a() {
        return this.f6496a;
    }

    /* renamed from: a */
    public int compareTo(C2885g gVar) {
        if (mo17798a() < gVar.mo17798a()) {
            return 1;
        }
        return mo17798a() >= gVar.mo17798a() ? -1 : 0;
    }

    /* renamed from: b */
    public String mo17801b() {
        return this.f6497b;
    }
}
