package com.apm.insight.runtime;

import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.C1395q;
import java.util.Comparator;

/* renamed from: com.apm.insight.runtime.g */
public class C1377g {

    /* renamed from: a */
    private static final Comparator<C1379a> f1456a = new Comparator<C1379a>() {
        /* renamed from: a */
        public final int compare(C1379a aVar, C1379a aVar2) {
            int i = aVar.f1459b + aVar.f1460c;
            int i2 = aVar2.f1459b + aVar2.f1460c;
            if (i != i2) {
                return i > i2 ? -1 : 1;
            }
            return 0;
        }
    };

    /* renamed from: b */
    private static byte[] f1457b = new byte[4096];

    /* renamed from: com.apm.insight.runtime.g$a */
    public static class C1379a {

        /* renamed from: a */
        public String f1458a = "unknown";

        /* renamed from: b */
        public int f1459b;

        /* renamed from: c */
        public int f1460c;

        C1379a() {
        }
    }

    /* renamed from: a */
    public static long m2250a(int i) {
        return NativeImpl.m2016c(i) * C1395q.C1396a.m2324a();
    }
}
