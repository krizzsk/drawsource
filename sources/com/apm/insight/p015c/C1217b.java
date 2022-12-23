package com.apm.insight.p015c;

import com.apm.insight.C1250h;
import com.apm.insight.runtime.C1351a;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.apm.insight.c.b */
public class C1217b {

    /* renamed from: a */
    private static AtomicBoolean f1094a = new AtomicBoolean(false);

    /* renamed from: a */
    public static boolean m1417a() {
        synchronized (f1094a) {
            if (f1094a.get()) {
                return false;
            }
            f1094a.set(true);
            return m1418b();
        }
    }

    /* renamed from: b */
    public static boolean m1418b() {
        if (!C1351a.m2108h()) {
            return false;
        }
        try {
            File file = new File(C1250h.m1616h().getFilesDir(), "apminsight/crashCommand");
            file.mkdirs();
            new File(file, "0_" + System.currentTimeMillis()).createNewFile();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
