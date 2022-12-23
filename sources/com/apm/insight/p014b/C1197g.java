package com.apm.insight.p014b;

import android.content.Context;

/* renamed from: com.apm.insight.b.g */
public class C1197g {

    /* renamed from: a */
    private static volatile C1197g f1011a;

    /* renamed from: c */
    private static C1198h f1012c;

    /* renamed from: b */
    private final C1188b f1013b;

    private C1197g(Context context) {
        this.f1013b = new C1188b(context);
        C1198h hVar = new C1198h(0);
        f1012c = hVar;
        hVar.mo12424b();
    }

    /* renamed from: a */
    public static C1197g m1356a(Context context) {
        if (f1011a == null) {
            synchronized (C1197g.class) {
                if (f1011a == null) {
                    f1011a = new C1197g(context);
                }
            }
        }
        return f1011a;
    }

    /* renamed from: b */
    public static C1198h m1357b() {
        return f1012c;
    }

    /* renamed from: a */
    public C1188b mo12419a() {
        return this.f1013b;
    }

    /* renamed from: c */
    public void mo12420c() {
        this.f1013b.mo12403a();
    }

    /* renamed from: d */
    public void mo12421d() {
        this.f1013b.mo12405b();
    }
}
