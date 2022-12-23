package com.tapjoy.internal;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.tapjoy.internal.t */
public final class C11683t {

    /* renamed from: a */
    private static Handler f28191a;

    /* renamed from: a */
    public static synchronized Handler m32049a() {
        Handler handler;
        synchronized (C11683t.class) {
            if (f28191a == null) {
                f28191a = new Handler(Looper.getMainLooper());
            }
            handler = f28191a;
        }
        return handler;
    }

    /* renamed from: a */
    public static C11279au m32050a(final Handler handler) {
        return new C11279au() {
            /* renamed from: a */
            public final boolean mo69681a(Runnable runnable) {
                return handler.post(runnable);
            }
        };
    }
}
