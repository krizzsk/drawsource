package com.apm.insight.runtime;

import com.apm.insight.C1250h;
import com.apm.insight.MonitorCrash;

/* renamed from: com.apm.insight.runtime.m */
public class C1387m {

    /* renamed from: a */
    private static MonitorCrash f1473a = null;

    /* renamed from: b */
    private static int f1474b = -1;

    /* renamed from: c */
    private static int f1475c;

    /* renamed from: a */
    public static MonitorCrash m2269a() {
        if (f1473a == null) {
            MonitorCrash initSDK = MonitorCrash.initSDK(C1250h.m1615g(), "239017", 1030820, "1.3.8.nourl-alpha.0", "com.apm.insight");
            f1473a = initSDK;
            initSDK.config().setChannel("release");
        }
        return f1473a;
    }

    /* renamed from: a */
    public static void m2270a(Throwable th, String str) {
        if (C1250h.m1615g() != null && m2271b()) {
            m2269a().reportCustomErr(str, "INNER", th);
        }
    }

    /* renamed from: b */
    private static boolean m2271b() {
        if (f1474b == -1) {
            f1474b = 5;
        }
        int i = f1475c;
        if (i >= f1474b) {
            return false;
        }
        f1475c = i + 1;
        return true;
    }
}
