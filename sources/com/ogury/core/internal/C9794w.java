package com.ogury.core.internal;

/* renamed from: com.ogury.core.internal.w */
/* compiled from: Thread.kt */
public class C9794w {

    /* renamed from: a */
    private final int f24695a;

    /* renamed from: b */
    private final String f24696b;

    /* renamed from: com.ogury.core.internal.w$a */
    /* compiled from: Thread.kt */
    public static final class C9795a extends Thread {

        /* renamed from: a */
        private /* synthetic */ C9713ae f24697a;

        C9795a(C9713ae aeVar) {
            this.f24697a = aeVar;
        }

        public final void run() {
            this.f24697a.mo64059a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static Thread m28245a(boolean z, boolean z2, ClassLoader classLoader, String str, int i, C9713ae<C9775g> aeVar) {
        C9717ai.m28145b(aeVar, "block");
        C9795a aVar = new C9795a(aeVar);
        if (z2) {
            aVar.setDaemon(true);
        }
        if (i > 0) {
            aVar.setPriority(i);
        }
        if (str != null) {
            aVar.setName(str);
        }
        if (classLoader != null) {
            aVar.setContextClassLoader(classLoader);
        }
        if (z) {
            aVar.start();
        }
        return aVar;
    }

    /* renamed from: a */
    public int mo64211a() {
        return this.f24695a;
    }

    /* renamed from: b */
    public String mo64212b() {
        return this.f24696b;
    }

    public C9794w(int i, String str) {
        C9717ai.m28145b(str, "name");
        this.f24695a = i;
        this.f24696b = str;
    }
}
