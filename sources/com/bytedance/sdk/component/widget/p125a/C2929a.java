package com.bytedance.sdk.component.widget.p125a;

/* renamed from: com.bytedance.sdk.component.widget.a.a */
/* compiled from: BaseAdapterInstance */
public class C2929a {

    /* renamed from: b */
    private static volatile C2929a f6573b;

    /* renamed from: a */
    private volatile C2930b f6574a;

    private C2929a() {
    }

    /* renamed from: a */
    public static C2929a m8227a() {
        if (f6573b == null) {
            synchronized (C2929a.class) {
                if (f6573b == null) {
                    f6573b = new C2929a();
                }
            }
        }
        return f6573b;
    }

    /* renamed from: a */
    public void mo17906a(C2930b bVar) {
        this.f6574a = bVar;
    }

    /* renamed from: b */
    public C2930b mo17907b() {
        return this.f6574a;
    }
}
