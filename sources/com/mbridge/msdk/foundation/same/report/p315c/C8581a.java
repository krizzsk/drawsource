package com.mbridge.msdk.foundation.same.report.p315c;

/* renamed from: com.mbridge.msdk.foundation.same.report.c.a */
/* compiled from: LogFileController */
public class C8581a {

    /* renamed from: a */
    public static final String f21084a = C8581a.class.getSimpleName();

    /* renamed from: b */
    private static C8581a f21085b = null;

    private C8581a() {
    }

    /* renamed from: a */
    public static synchronized C8581a m24613a() {
        C8581a aVar;
        synchronized (C8581a.class) {
            if (f21085b == null) {
                f21085b = new C8581a();
            }
            aVar = f21085b;
        }
        return aVar;
    }
}
