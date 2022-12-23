package com.apm.insight.p015c;

import com.apm.insight.C1250h;
import java.io.File;

/* renamed from: com.apm.insight.c.a */
public class C1216a {
    /* renamed from: a */
    public static void m1415a() {
        File[] listFiles;
        File file = new File(C1250h.m1615g().getFilesDir(), "apminsight/crashCommand");
        if (file.exists() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                try {
                    String[] split = file2.getName().split("_");
                    if (split[0].equals(String.valueOf(0))) {
                        m1416a(split);
                    }
                    file2.delete();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private static void m1416a(String... strArr) {
    }
}
