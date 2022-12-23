package com.unity3d.services.core.lifecycle;

import com.unity3d.services.core.properties.C12084a;

/* renamed from: com.unity3d.services.core.lifecycle.a */
/* compiled from: CachedLifecycle */
public class C12059a {

    /* renamed from: a */
    private static C12061c f29424a;

    /* renamed from: a */
    public static C12061c m32828a() {
        return f29424a;
    }

    /* renamed from: b */
    public static void m32830b() {
        if (C12084a.m32907d() != null && m32828a() == null) {
            m32829a(new C12061c());
            C12084a.m32907d().registerActivityLifecycleCallbacks(m32828a());
        }
    }

    /* renamed from: a */
    public static void m32829a(C12061c cVar) {
        f29424a = cVar;
    }
}
