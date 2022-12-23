package com.apm.insight.p026l;

import android.os.Build;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStreamReader;
import java.util.Locale;

/* renamed from: com.apm.insight.l.t */
public class C1324t {

    /* renamed from: a */
    private static final CharSequence f1338a = "sony";

    /* renamed from: b */
    private static final CharSequence f1339b = "amigo";

    /* renamed from: c */
    private static final CharSequence f1340c = "funtouch";

    /* renamed from: a */
    public static String m1943a() {
        if (C1301d.m1802c()) {
            return m1953j();
        }
        if (C1301d.m1804d()) {
            return m1955l();
        }
        if (m1956m()) {
            return m1957n();
        }
        String k = m1954k();
        if (!TextUtils.isEmpty(k)) {
            return k;
        }
        if (m1948e()) {
            return m1947d();
        }
        if (m1949f()) {
            return m1950g();
        }
        if (m1946c()) {
            return m1945b();
        }
        String h = m1951h();
        return !TextUtils.isEmpty(h) ? h : Build.DISPLAY;
    }

    /* renamed from: a */
    private static String m1944a(String str) {
        String str2 = "";
        BufferedReader bufferedReader = null;
        try {
            Runtime runtime = Runtime.getRuntime();
            Process exec = runtime.exec("getprop " + str);
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(exec.getInputStream()), 1024);
            try {
                str2 = bufferedReader2.readLine();
                exec.destroy();
                C1310k.m1852a((Closeable) bufferedReader2);
                return str2;
            } catch (Throwable unused) {
                bufferedReader = bufferedReader2;
                C1310k.m1852a((Closeable) bufferedReader);
                return str2;
            }
        } catch (Throwable unused2) {
            C1310k.m1852a((Closeable) bufferedReader);
            return str2;
        }
    }

    /* renamed from: b */
    public static String m1945b() {
        return m1944a("ro.build.uiversion") + "_" + Build.DISPLAY;
    }

    /* renamed from: c */
    public static boolean m1946c() {
        String str = Build.MANUFACTURER + Build.BRAND;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.getDefault());
        return lowerCase.contains("360") || lowerCase.contains("qiku");
    }

    /* renamed from: d */
    public static String m1947d() {
        return m1944a("ro.vivo.os.build.display.id") + "_" + m1944a("ro.vivo.product.version");
    }

    /* renamed from: e */
    public static boolean m1948e() {
        String a = m1944a("ro.vivo.os.build.display.id");
        return !TextUtils.isEmpty(a) && a.toLowerCase(Locale.getDefault()).contains(f1340c);
    }

    /* renamed from: f */
    public static boolean m1949f() {
        return !TextUtils.isEmpty(Build.DISPLAY) && Build.DISPLAY.toLowerCase(Locale.getDefault()).contains(f1339b);
    }

    /* renamed from: g */
    public static String m1950g() {
        return Build.DISPLAY + "_" + m1944a("ro.gn.sv.version");
    }

    /* renamed from: h */
    public static String m1951h() {
        if (!m1952i()) {
            return "";
        }
        return "eui_" + m1944a("ro.letv.release.version") + "_" + Build.DISPLAY;
    }

    /* renamed from: i */
    public static boolean m1952i() {
        return !TextUtils.isEmpty(m1944a("ro.letv.release.version"));
    }

    /* renamed from: j */
    public static String m1953j() {
        if (!C1301d.m1802c()) {
            return "";
        }
        return "miui_" + m1944a("ro.miui.ui.version.name") + "_" + Build.VERSION.INCREMENTAL;
    }

    /* renamed from: k */
    public static String m1954k() {
        String a = C1301d.m1797a();
        if (a == null || !a.toLowerCase(Locale.getDefault()).contains("emotionui")) {
            return "";
        }
        return a + "_" + Build.DISPLAY;
    }

    /* renamed from: l */
    public static String m1955l() {
        String str = Build.DISPLAY;
        return (str == null || !str.toLowerCase(Locale.getDefault()).contains("flyme")) ? "" : str;
    }

    /* renamed from: m */
    public static boolean m1956m() {
        String str = Build.MANUFACTURER;
        if (!TextUtils.isEmpty(str)) {
            return str.toLowerCase(Locale.getDefault()).contains("oppo");
        }
        return false;
    }

    /* renamed from: n */
    public static String m1957n() {
        if (!m1956m()) {
            return "";
        }
        return "coloros_" + m1944a("ro.build.version.opporom") + "_" + Build.DISPLAY;
    }
}
