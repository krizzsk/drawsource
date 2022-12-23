package com.tapjoy.internal;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.tapjoy.internal.hx */
public final class C11589hx {

    /* renamed from: a */
    public static final ScheduledExecutorService f27868a = Executors.newScheduledThreadPool(1);

    /* renamed from: b */
    public static final CountDownLatch f27869b = new CountDownLatch(1);

    /* renamed from: c */
    public static final CountDownLatch f27870c = new CountDownLatch(1);

    /* renamed from: d */
    private static final Runnable f27871d = new Runnable() {
        public final void run() {
            if (C11685u.m32056c()) {
                C11589hx.f27869b.countDown();
            } else if (C11685u.m32054a()) {
                C11589hx.f27869b.countDown();
            } else {
                C11589hx.f27868a.schedule(this, 300, TimeUnit.SECONDS);
            }
        }
    };

    /* renamed from: e */
    private static String f27872e;

    /* renamed from: f */
    private static boolean f27873f;

    /* renamed from: a */
    public static void m31769a() {
        f27868a.execute(f27871d);
    }

    /* renamed from: a */
    public static void m31770a(String str, boolean z) {
        f27872e = str;
        f27873f = z;
        f27870c.countDown();
    }

    /* renamed from: b */
    public static String m31771b() {
        return f27872e;
    }

    /* renamed from: c */
    public static boolean m31772c() {
        return f27873f;
    }
}
