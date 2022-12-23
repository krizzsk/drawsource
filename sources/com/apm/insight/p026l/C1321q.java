package com.apm.insight.p026l;

import android.util.Log;
import com.apm.insight.C1250h;

/* renamed from: com.apm.insight.l.q */
public final class C1321q {
    /* renamed from: a */
    public static void m1927a(Object obj) {
        if (C1250h.m1617i().isDebugMode()) {
            Log.i("npth", String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static void m1928a(String str) {
        if (C1250h.m1617i().isDebugMode()) {
            Log.w("npth", str);
        }
    }

    /* renamed from: a */
    public static void m1929a(String str, Object obj) {
        if (C1250h.m1617i().isDebugMode()) {
            Log.i("npth", str + " " + obj);
        }
    }

    /* renamed from: a */
    public static void m1930a(String str, Object obj, Throwable th) {
        if (C1250h.m1617i().isDebugMode()) {
            Log.e("npth", str + " " + obj, th);
        }
    }

    /* renamed from: a */
    public static void m1931a(String str, Throwable th) {
        if (C1250h.m1617i().isDebugMode()) {
            Log.e("npth", str + " NPTH Catch Error", th);
        }
    }

    /* renamed from: a */
    public static void m1932a(Throwable th) {
        if (C1250h.m1617i().isDebugMode()) {
            Log.e("npth", "NPTH Catch Error", th);
        }
    }

    /* renamed from: b */
    public static void m1933b(Object obj) {
        if (C1250h.m1617i().isDebugMode()) {
            Log.d("npth", String.valueOf(obj));
        }
    }

    /* renamed from: b */
    public static void m1934b(Throwable th) {
        if (C1250h.m1617i().isDebugMode()) {
            Log.w("npth", "NPTH Catch Error", th);
        }
    }
}
