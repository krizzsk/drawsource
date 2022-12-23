package com.apm.insight.runtime;

import com.apm.insight.C1250h;
import com.apm.insight.p026l.C1308i;
import com.apm.insight.p026l.C1318o;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.apm.insight.runtime.b */
public class C1370b {

    /* renamed from: a */
    private static long f1437a = -30000;

    /* renamed from: b */
    private static File f1438b;

    /* renamed from: a */
    public static String m2212a(long j, String str) {
        try {
            String j2 = C1318o.m1917j(C1250h.m1615g());
            return C1308i.m1841c(new File(j2, "apminsight/TrackInfo/" + ((j - (j % 86400000)) / 86400000) + "/" + str));
        } catch (Throwable th) {
            return th.getMessage();
        }
    }

    /* renamed from: a */
    public static void m2213a() {
        File file = new File(C1318o.m1917j(C1250h.m1615g()), "apminsight/TrackInfo/");
        String[] list = file.list();
        if (list != null && list.length > 5) {
            Arrays.sort(list);
            for (int i = 0; i < list.length - 5; i++) {
                C1308i.m1834a(new File(file, list[i]));
            }
        }
    }

    /* renamed from: a */
    public static void m2214a(long j) {
        if (j - f1437a >= 30000) {
            f1437a = j;
            try {
                C1308i.m1826a(m2215b(), String.valueOf(System.currentTimeMillis()), false);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    private static File m2215b() {
        if (f1438b == null) {
            long currentTimeMillis = System.currentTimeMillis();
            String j = C1318o.m1917j(C1250h.m1615g());
            f1438b = new File(j, "apminsight/TrackInfo/" + ((currentTimeMillis - (currentTimeMillis % 86400000)) / 86400000) + "/" + C1250h.m1614f());
        }
        return f1438b;
    }
}
