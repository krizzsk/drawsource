package com.tapjoy.internal;

import android.os.Looper;

/* renamed from: com.tapjoy.internal.hg */
public final class C11554hg {

    /* renamed from: a */
    public static boolean f27724a;

    /* renamed from: a */
    public static void m31620a(String str) {
        if (f27724a) {
            C11689w.m32058a(4, "Tapjoy", str, (Throwable) null);
        }
    }

    /* renamed from: a */
    public static void m31622a(String str, Object... objArr) {
        if (f27724a) {
            C11689w.m32059a(4, "Tapjoy", str, objArr);
        }
    }

    /* renamed from: b */
    public static void m31625b(String str) {
        if (f27724a) {
            C11689w.m32060a("Tapjoy", str);
        }
    }

    /* renamed from: b */
    public static void m31626b(String str, Object... objArr) {
        if (f27724a) {
            C11689w.m32061a("Tapjoy", str, objArr);
        }
    }

    /* renamed from: a */
    public static void m31621a(String str, String str2, String str3) {
        if (f27724a) {
            C11689w.m32061a("Tapjoy", "{}: {} {}", str, str2, str3);
        }
    }

    /* renamed from: a */
    public static boolean m31623a(Object obj, String str) {
        if (obj != null) {
            return true;
        }
        if (!f27724a) {
            return false;
        }
        m31625b(str);
        return false;
    }

    /* renamed from: a */
    public static boolean m31624a(boolean z, String str) {
        if (!f27724a || z) {
            return z;
        }
        m31625b(str);
        throw new IllegalStateException(str);
    }

    /* renamed from: c */
    static boolean m31627c(String str) {
        boolean z = Looper.myLooper() == Looper.getMainLooper();
        return m31624a(z, str + ": Must be called on the main/ui thread");
    }

    /* renamed from: d */
    static void m31628d(String str) {
        if (f27724a) {
            m31625b(str + ": Should be called after initializing the SDK");
        }
    }

    /* renamed from: e */
    static void m31629e(String str) {
        if (f27724a) {
            m31625b(str + ": Should be called after initializing the SDK");
        }
    }
}
