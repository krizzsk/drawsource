package com.tapjoy.internal;

/* renamed from: com.tapjoy.internal.hu */
public abstract class C11582hu {

    /* renamed from: a */
    protected static C11583a f27852a;

    /* renamed from: b */
    private static C11582hu f27853b;

    /* renamed from: com.tapjoy.internal.hu$a */
    public static class C11583a {

        /* renamed from: a */
        public final String f27854a;

        /* renamed from: b */
        public final String f27855b;

        /* renamed from: c */
        public final C11474fk f27856c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo70023a(C11583a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo70024b();

    /* renamed from: a */
    public static void m31754a(C11582hu huVar) {
        synchronized (C11582hu.class) {
            f27853b = huVar;
            C11583a aVar = f27852a;
            if (aVar != null) {
                f27852a = null;
                huVar.mo70023a(aVar);
            }
        }
    }

    /* renamed from: c */
    public static boolean m31755c() {
        C11582hu huVar = f27853b;
        if (huVar != null && huVar.mo70024b()) {
            return true;
        }
        C11583a aVar = f27852a;
        if (aVar == null || aVar.f27856c.mo69991a()) {
            return false;
        }
        return true;
    }
}
