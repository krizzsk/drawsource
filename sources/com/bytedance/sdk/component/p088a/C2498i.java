package com.bytedance.sdk.component.p088a;

import android.util.Log;

/* renamed from: com.bytedance.sdk.component.a.i */
/* compiled from: DebugUtil */
class C2498i {

    /* renamed from: a */
    private static boolean f5260a;

    /* renamed from: a */
    static void m6253a(boolean z) {
        f5260a = z;
    }

    /* renamed from: a */
    static void m6251a(String str) {
        if (f5260a) {
            Log.i("JsBridge2", str);
        }
    }

    /* renamed from: b */
    static void m6254b(String str) {
        if (f5260a) {
            Log.w("JsBridge2", str);
        }
    }

    /* renamed from: a */
    static void m6252a(String str, Throwable th) {
        if (f5260a) {
            Log.w("JsBridge2", str, th);
            Log.w("JsBridge2", "Stacktrace: " + Log.getStackTraceString(th));
        }
    }

    /* renamed from: b */
    static void m6255b(String str, Throwable th) {
        if (f5260a) {
            Log.e("JsBridge2", str, th);
            Log.e("JsBridge2", "Stacktrace: " + Log.getStackTraceString(th));
        }
    }

    /* renamed from: a */
    static void m6250a(RuntimeException runtimeException) {
        if (f5260a) {
            throw runtimeException;
        }
    }
}
