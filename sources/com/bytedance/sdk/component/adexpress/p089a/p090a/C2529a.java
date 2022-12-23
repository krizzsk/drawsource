package com.bytedance.sdk.component.adexpress.p089a.p090a;

import com.bytedance.sdk.component.p108d.C2831m;

/* renamed from: com.bytedance.sdk.component.adexpress.a.a.a */
/* compiled from: AdapterInstance */
public class C2529a {

    /* renamed from: e */
    private static volatile C2529a f5338e;

    /* renamed from: a */
    private volatile C2530b f5339a;

    /* renamed from: b */
    private volatile C2532d f5340b;

    /* renamed from: c */
    private volatile C2531c f5341c;

    /* renamed from: d */
    private volatile C2831m f5342d;

    private C2529a() {
    }

    /* renamed from: a */
    public static C2529a m6339a() {
        if (f5338e == null) {
            synchronized (C2529a.class) {
                if (f5338e == null) {
                    f5338e = new C2529a();
                }
            }
        }
        return f5338e;
    }

    /* renamed from: a */
    public void mo16545a(C2530b bVar) {
        this.f5339a = bVar;
    }

    /* renamed from: b */
    public C2530b mo16549b() {
        return this.f5339a;
    }

    /* renamed from: a */
    public void mo16546a(C2531c cVar) {
        this.f5341c = cVar;
    }

    /* renamed from: c */
    public C2531c mo16550c() {
        return this.f5341c;
    }

    /* renamed from: a */
    public void mo16547a(C2532d dVar) {
        this.f5340b = dVar;
    }

    /* renamed from: d */
    public C2532d mo16551d() {
        return this.f5340b;
    }

    /* renamed from: a */
    public void mo16548a(C2831m mVar) {
        this.f5342d = mVar;
    }

    /* renamed from: e */
    public C2831m mo16552e() {
        return this.f5342d;
    }
}
