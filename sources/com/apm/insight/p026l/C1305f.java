package com.apm.insight.p026l;

import com.apm.insight.C1250h;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.C1351a;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/* renamed from: com.apm.insight.l.f */
public class C1305f {
    /* renamed from: a */
    public static File m1808a(String str, int i, int i2) {
        File file = new File(C1318o.m1888a(C1250h.m1615g(), str), "logcat.txt");
        if (file.exists() && file.length() > 0) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        NativeImpl.m2007a(file.getAbsolutePath(), String.valueOf(i), String.valueOf(i2));
        return file;
    }

    /* renamed from: a */
    public static void m1809a() {
        try {
            m1808a(C1250h.m1614f(), C1250h.m1617i().getLogcatDumpCount(), C1250h.m1617i().getLogcatLevel());
            m1810b();
            m1812d();
            m1811c();
            m1813e();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static File m1810b() {
        File file = new File(C1318o.m1903e(C1250h.m1615g()), "maps.txt");
        if (file.exists()) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        NativeImpl.m2024f(file.getAbsolutePath());
        return file;
    }

    /* renamed from: c */
    public static File m1811c() {
        File file = new File(C1318o.m1903e(C1250h.m1615g()), "meminfo.txt");
        if (file.exists()) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        NativeImpl.m2019d(file.getAbsolutePath());
        return file;
    }

    /* renamed from: d */
    public static File m1812d() {
        File file = new File(C1318o.m1903e(C1250h.m1615g()), "fds.txt");
        if (file.exists()) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        NativeImpl.m2021e(file.getAbsolutePath());
        return file;
    }

    /* renamed from: e */
    public static File m1813e() {
        File file = new File(C1318o.m1903e(C1250h.m1615g()), "threads.txt");
        if (file.exists()) {
            return file;
        }
        file.getParentFile().mkdirs();
        try {
            file.createNewFile();
        } catch (IOException unused) {
        }
        NativeImpl.m2025g(file.getAbsolutePath());
        return file;
    }

    /* renamed from: f */
    public static File m1814f() {
        BufferedWriter bufferedWriter;
        File file = new File(C1318o.m1903e(C1250h.m1615g()), "anr_trace.txt");
        if (file.exists() || !C1351a.m2106f()) {
            return file;
        }
        File file2 = new File("/data/anr/traces.txt");
        if (!file2.exists()) {
            return file;
        }
        BufferedReader bufferedReader = null;
        try {
            file.getParentFile().mkdirs();
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file2));
            try {
                bufferedWriter = new BufferedWriter(new FileWriter(file));
                int i = 0;
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine != null) {
                            bufferedWriter.write(readLine);
                            bufferedWriter.write(10);
                            i += readLine.length();
                            if (i >= 1048576) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } catch (IOException unused) {
                        bufferedReader = bufferedReader2;
                        C1310k.m1852a((Closeable) bufferedReader);
                        C1310k.m1852a((Closeable) bufferedWriter);
                        return file;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        C1310k.m1852a((Closeable) bufferedReader);
                        C1310k.m1852a((Closeable) bufferedWriter);
                        throw th;
                    }
                }
                C1310k.m1852a((Closeable) bufferedReader2);
            } catch (IOException unused2) {
                bufferedWriter = null;
                bufferedReader = bufferedReader2;
                C1310k.m1852a((Closeable) bufferedReader);
                C1310k.m1852a((Closeable) bufferedWriter);
                return file;
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = null;
                bufferedReader = bufferedReader2;
                C1310k.m1852a((Closeable) bufferedReader);
                C1310k.m1852a((Closeable) bufferedWriter);
                throw th;
            }
        } catch (IOException unused3) {
            bufferedWriter = null;
            C1310k.m1852a((Closeable) bufferedReader);
            C1310k.m1852a((Closeable) bufferedWriter);
            return file;
        } catch (Throwable th3) {
            th = th3;
            bufferedWriter = null;
            C1310k.m1852a((Closeable) bufferedReader);
            C1310k.m1852a((Closeable) bufferedWriter);
            throw th;
        }
        C1310k.m1852a((Closeable) bufferedWriter);
        return file;
    }
}
