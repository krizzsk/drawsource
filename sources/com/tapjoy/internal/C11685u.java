package com.tapjoy.internal;

import android.os.SystemClock;

/* renamed from: com.tapjoy.internal.u */
public final class C11685u {

    /* renamed from: a */
    private static String f28193a = "pool.ntp.org";

    /* renamed from: b */
    private static long f28194b = 20000;

    /* renamed from: c */
    private static volatile boolean f28195c = false;

    /* renamed from: d */
    private static volatile String f28196d;

    /* renamed from: e */
    private static volatile long f28197e;

    /* renamed from: f */
    private static volatile long f28198f;

    /* renamed from: g */
    private static volatile long f28199g;

    /* renamed from: h */
    private static volatile long f28200h;

    /* renamed from: i */
    private static volatile long f28201i;

    static {
        m32053a(false, "System", System.currentTimeMillis(), SystemClock.elapsedRealtime(), Long.MAX_VALUE);
    }

    /* renamed from: a */
    private static synchronized void m32053a(boolean z, String str, long j, long j2, long j3) {
        synchronized (C11685u.class) {
            f28195c = z;
            f28196d = str;
            f28197e = j;
            f28198f = j2;
            f28199g = j3;
            f28200h = f28197e - f28198f;
            f28201i = (SystemClock.elapsedRealtime() + f28200h) - System.currentTimeMillis();
        }
    }

    /* renamed from: a */
    public static boolean m32054a() {
        String str = f28193a;
        long j = f28194b;
        C11536gu guVar = new C11536gu();
        if (!guVar.mo70081a(str, (int) j)) {
            return false;
        }
        m32053a(true, "SNTP", guVar.f27697a, guVar.f27698b, guVar.f27699c / 2);
        return true;
    }

    /* renamed from: b */
    public static long m32055b() {
        return SystemClock.elapsedRealtime() + f28200h;
    }

    /* renamed from: a */
    public static long m32052a(long j) {
        return j + f28200h;
    }

    /* renamed from: c */
    public static boolean m32056c() {
        return f28195c;
    }
}
