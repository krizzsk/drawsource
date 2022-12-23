package com.ogury.p377ed.internal;

/* renamed from: com.ogury.ed.internal.cl */
public final class C9902cl {

    /* renamed from: a */
    public static final C9902cl f24945a = new C9902cl();

    private C9902cl() {
    }

    /* renamed from: a */
    public static boolean m28597a() {
        return m28598a("androidx.fragment.app.Fragment");
    }

    /* renamed from: a */
    private static boolean m28598a(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
