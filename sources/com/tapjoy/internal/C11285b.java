package com.tapjoy.internal;

import android.app.Activity;
import android.app.Application;
import java.util.Collections;
import java.util.Set;
import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.b */
public final class C11285b {

    /* renamed from: a */
    private static Application f26944a;

    /* renamed from: b */
    private static int f26945b;

    /* renamed from: c */
    private static final C11312bs<Activity> f26946c = new C11312bs<>();

    /* renamed from: d */
    private static final Set<Activity> f26947d = Collections.synchronizedSet(new C11277as());

    /* renamed from: e */
    private static final C11312bs<Activity> f26948e = new C11312bs<>();

    /* renamed from: b */
    public static boolean m30883b() {
        return f26945b > 0;
    }

    @Nullable
    /* renamed from: c */
    public static Activity m30884c() {
        Activity a = f26946c.mo69750a();
        if (a != null) {
            return a;
        }
        synchronized (f26947d) {
            if (!f26947d.iterator().hasNext()) {
                return null;
            }
            Activity next = f26947d.iterator().next();
            return next;
        }
    }

    /* renamed from: a */
    public static void m30880a(Activity activity) {
        f26946c.mo69751a(activity);
    }

    /* renamed from: a */
    public static synchronized void m30881a(Application application) {
        synchronized (C11285b.class) {
            if (f26944a != application) {
                f26944a = application;
            }
        }
    }

    /* renamed from: b */
    public static void m30882b(Activity activity) {
        f26945b++;
        f26946c.mo69751a(activity);
        f26947d.add(activity);
    }

    /* renamed from: c */
    public static void m30885c(Activity activity) {
        f26945b--;
        f26946c.f27002a = null;
        f26947d.remove(activity);
        if (f26945b < 0) {
            f26945b = 0;
        }
    }

    @Nullable
    /* renamed from: a */
    public static Activity m30879a() {
        Activity a = f26948e.mo69750a();
        return a == null ? m30884c() : a;
    }
}
