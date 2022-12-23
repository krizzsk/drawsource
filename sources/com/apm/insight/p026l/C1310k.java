package com.apm.insight.p026l;

import com.apm.insight.p022h.C1251a;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.ZipFile;

/* renamed from: com.apm.insight.l.k */
public final class C1310k {
    /* renamed from: a */
    public static void m1852a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m1853a(String str, int i) {
        C1251a.m1627a("android.os.FileUtils", "setPermissions", str, Integer.valueOf(i), -1, -1);
    }

    /* renamed from: a */
    public static void m1854a(ZipFile zipFile) {
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (IOException unused) {
            }
        }
    }
}
