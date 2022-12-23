package com.apm.insight.p026l;

import android.app.ActivityManager;
import android.os.Build;

/* renamed from: com.apm.insight.l.n */
public class C1314n {

    /* renamed from: a */
    static final C1316a f1331a = (Build.VERSION.SDK_INT >= 16 ? new C1317b() : new C1316a());

    /* renamed from: com.apm.insight.l.n$a */
    private static class C1316a {
        private C1316a() {
        }

        /* renamed from: a */
        public long mo12596a(ActivityManager.MemoryInfo memoryInfo) {
            return 0;
        }
    }

    /* renamed from: com.apm.insight.l.n$b */
    private static class C1317b extends C1316a {
        private C1317b() {
            super();
        }

        /* renamed from: a */
        public long mo12596a(ActivityManager.MemoryInfo memoryInfo) {
            return memoryInfo.totalMem;
        }
    }

    /* renamed from: a */
    public static long m1883a(ActivityManager.MemoryInfo memoryInfo) {
        return f1331a.mo12596a(memoryInfo);
    }
}
