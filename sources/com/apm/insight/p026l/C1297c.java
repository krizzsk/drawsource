package com.apm.insight.p026l;

import android.os.Build;
import android.os.Debug;

/* renamed from: com.apm.insight.l.c */
public class C1297c {

    /* renamed from: a */
    static final C1299a f1313a = (Build.VERSION.SDK_INT >= 19 ? new C1300b() : new C1299a());

    /* renamed from: com.apm.insight.l.c$a */
    private static class C1299a {
        private C1299a() {
        }

        /* renamed from: a */
        public int mo12580a(Debug.MemoryInfo memoryInfo) {
            return -1;
        }

        /* renamed from: b */
        public int mo12581b(Debug.MemoryInfo memoryInfo) {
            return -1;
        }

        /* renamed from: c */
        public int mo12582c(Debug.MemoryInfo memoryInfo) {
            return -1;
        }
    }

    /* renamed from: com.apm.insight.l.c$b */
    private static class C1300b extends C1299a {
        private C1300b() {
            super();
        }

        /* renamed from: a */
        public int mo12580a(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalPrivateClean();
        }

        /* renamed from: b */
        public int mo12581b(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalSharedClean();
        }

        /* renamed from: c */
        public int mo12582c(Debug.MemoryInfo memoryInfo) {
            return memoryInfo.getTotalSwappablePss();
        }
    }

    /* renamed from: a */
    public static int m1788a(Debug.MemoryInfo memoryInfo) {
        return f1313a.mo12580a(memoryInfo);
    }

    /* renamed from: b */
    public static int m1789b(Debug.MemoryInfo memoryInfo) {
        return f1313a.mo12581b(memoryInfo);
    }

    /* renamed from: c */
    public static int m1790c(Debug.MemoryInfo memoryInfo) {
        return f1313a.mo12582c(memoryInfo);
    }
}
