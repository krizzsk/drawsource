package com.apm.insight.runtime;

import android.os.Build;
import android.system.Os;
import android.system.OsConstants;

/* renamed from: com.apm.insight.runtime.q */
public class C1395q {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static long f1491a = -1;

    /* renamed from: com.apm.insight.runtime.q$a */
    public static class C1396a {

        /* renamed from: a */
        private static long f1492a = -1;

        /* renamed from: a */
        public static long m2324a() {
            if (C1395q.f1491a == -1) {
                long unused = C1395q.f1491a = 1000 / m2327b();
            }
            return C1395q.f1491a;
        }

        /* renamed from: a */
        public static long m2325a(long j) {
            long j2 = f1492a;
            if (j2 > 0) {
                return j2;
            }
            long sysconf = Build.VERSION.SDK_INT >= 21 ? Os.sysconf(OsConstants._SC_CLK_TCK) : Build.VERSION.SDK_INT >= 14 ? m2326a("_SC_CLK_TCK", j) : j;
            if (sysconf > 0) {
                j = sysconf;
            }
            f1492a = j;
            return j;
        }

        /* renamed from: a */
        private static long m2326a(String str, long j) {
            try {
                int i = Class.forName("libcore.io.OsConstants").getField(str).getInt((Object) null);
                Class<?> cls = Class.forName("libcore.io.Libcore");
                Class<?> cls2 = Class.forName("libcore.io.Os");
                Object obj = cls.getField("os").get((Object) null);
                return ((Long) cls2.getMethod("sysconf", new Class[]{Integer.TYPE}).invoke(obj, new Object[]{Integer.valueOf(i)})).longValue();
            } catch (Throwable th) {
                th.printStackTrace();
                return j;
            }
        }

        /* renamed from: b */
        public static long m2327b() {
            return m2325a(100);
        }
    }
}
