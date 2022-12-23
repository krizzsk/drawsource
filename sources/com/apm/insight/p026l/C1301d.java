package com.apm.insight.p026l;

import android.os.Build;
import android.text.TextUtils;
import com.apm.insight.p025k.C1280e;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.apm.insight.l.d */
public class C1301d {

    /* renamed from: a */
    private static boolean f1314a = false;

    /* renamed from: b */
    private static int f1315b = -1;

    /* renamed from: c */
    private static final Pattern f1316c = Pattern.compile("^0-([\\d]+)$");

    /* renamed from: a */
    public static String m1797a() {
        return m1799b("ro.build.version.emui");
    }

    /* renamed from: a */
    public static boolean m1798a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = m1797a();
        }
        if (TextUtils.isEmpty(str) || !str.toLowerCase(Locale.getDefault()).startsWith("emotionui")) {
            return m1800b();
        }
        return true;
    }

    /* renamed from: b */
    private static String m1799b(String str) {
        BufferedReader bufferedReader;
        String str2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop " + str).getInputStream()), 1024);
            try {
                str2 = bufferedReader.readLine();
                bufferedReader.close();
                C1310k.m1852a((Closeable) bufferedReader);
                return str2;
            } catch (Throwable unused) {
                C1310k.m1852a((Closeable) bufferedReader);
                return str2;
            }
        } catch (Throwable unused2) {
            bufferedReader = null;
            C1310k.m1852a((Closeable) bufferedReader);
            return str2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (android.os.Build.BRAND.toLowerCase(java.util.Locale.getDefault()).startsWith("huawei") == false) goto L_0x001b;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m1800b() {
        /*
            r0 = 0
            java.lang.String r1 = android.os.Build.BRAND     // Catch:{ all -> 0x0034 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0034 }
            java.lang.String r2 = "huawei"
            if (r1 != 0) goto L_0x001b
            java.lang.String r1 = android.os.Build.BRAND     // Catch:{ all -> 0x0034 }
            java.util.Locale r3 = java.util.Locale.getDefault()     // Catch:{ all -> 0x0034 }
            java.lang.String r1 = r1.toLowerCase(r3)     // Catch:{ all -> 0x0034 }
            boolean r1 = r1.startsWith(r2)     // Catch:{ all -> 0x0034 }
            if (r1 != 0) goto L_0x0033
        L_0x001b:
            java.lang.String r1 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x0034 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0034 }
            if (r1 != 0) goto L_0x0034
            java.lang.String r1 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x0034 }
            java.util.Locale r3 = java.util.Locale.getDefault()     // Catch:{ all -> 0x0034 }
            java.lang.String r1 = r1.toLowerCase(r3)     // Catch:{ all -> 0x0034 }
            boolean r1 = r1.startsWith(r2)     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x0034
        L_0x0033:
            r0 = 1
        L_0x0034:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.p026l.C1301d.m1800b():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0025 A[Catch:{ IOException -> 0x0028 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m1801c(java.lang.String r3) {
        /*
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x0023 }
            r1.<init>(r3)     // Catch:{ all -> 0x0023 }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x0023 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ all -> 0x0023 }
            r2.<init>(r1)     // Catch:{ all -> 0x0023 }
            r3.<init>(r2)     // Catch:{ all -> 0x0023 }
            java.lang.String r0 = r3.readLine()     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x001e
            int r0 = m1803d(r0)     // Catch:{ all -> 0x0022 }
            r3.close()     // Catch:{ IOException -> 0x001d }
        L_0x001d:
            return r0
        L_0x001e:
            r3.close()     // Catch:{ IOException -> 0x0028 }
            goto L_0x0028
        L_0x0022:
            r0 = r3
        L_0x0023:
            if (r0 == 0) goto L_0x0028
            r0.close()     // Catch:{ IOException -> 0x0028 }
        L_0x0028:
            r3 = -1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.p026l.C1301d.m1801c(java.lang.String):int");
    }

    /* renamed from: c */
    public static boolean m1802c() {
        if (!f1314a) {
            try {
                if (Class.forName("miui.os.Build") != null) {
                    C1280e.f1261a = true;
                    f1314a = true;
                    return C1280e.f1261a;
                }
            } catch (Exception unused) {
            }
            f1314a = true;
        }
        return C1280e.f1261a;
    }

    /* renamed from: d */
    private static int m1803d(String str) {
        Matcher matcher = f1316c.matcher(str);
        if (matcher.matches()) {
            try {
                return Integer.parseInt(matcher.group(1)) + 1;
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    /* renamed from: d */
    public static boolean m1804d() {
        return Build.DISPLAY.contains("Flyme") || Build.USER.equals("flyme");
    }

    /* renamed from: e */
    public static int m1805e() {
        int i = f1315b;
        if (i > 0) {
            return i;
        }
        int c = m1801c("/sys/devices/system/cpu/possible");
        if (c <= 0) {
            c = m1801c("/sys/devices/system/cpu/present");
        }
        if (c <= 0) {
            c = m1806e("/sys/devices/system/cpu/");
        }
        if (c <= 0) {
            c = Runtime.getRuntime().availableProcessors();
        }
        if (c <= 0) {
            c = 1;
        }
        f1315b = c;
        return c;
    }

    /* renamed from: e */
    private static int m1806e(String str) {
        try {
            File[] listFiles = new File(str).listFiles(new FilenameFilter() {

                /* renamed from: a */
                private final Pattern f1317a = Pattern.compile("^cpu[\\d]+$");

                public boolean accept(File file, String str) {
                    return this.f1317a.matcher(str).matches();
                }
            });
            if (listFiles == null || listFiles.length <= 0) {
                return -1;
            }
            return listFiles.length;
        } catch (Throwable unused) {
            return -1;
        }
    }
}
