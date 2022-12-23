package com.apm.insight.p026l;

import android.content.Context;
import android.text.TextUtils;
import com.apm.insight.C1250h;
import java.io.File;

/* renamed from: com.apm.insight.l.o */
public class C1318o {

    /* renamed from: a */
    private static String f1332a;

    /* renamed from: b */
    private static File f1333b;

    /* renamed from: c */
    private static File f1334c;

    /* renamed from: d */
    private static File f1335d;

    /* renamed from: a */
    public static File m1886a() {
        File file = f1334c;
        return file == null ? m1900d(C1250h.m1615g()) : file;
    }

    /* renamed from: a */
    public static File m1887a(Context context) {
        return new File(m1917j(context), "apminsight/CrashLogJava");
    }

    /* renamed from: a */
    public static File m1888a(Context context, String str) {
        return new File(m1917j(context) + '/' + "apminsight/CrashCommonLog" + '/' + str);
    }

    /* renamed from: a */
    public static File m1889a(File file) {
        return new File(file, "flog.txt");
    }

    /* renamed from: a */
    public static File m1890a(File file, String str) {
        return new File(file, file.getName() + str);
    }

    /* renamed from: a */
    public static String m1891a(String str) {
        return "dart_" + str;
    }

    /* renamed from: b */
    public static File m1892b(Context context) {
        return new File(m1917j(context), "apminsight/CrashLogSimple");
    }

    /* renamed from: b */
    public static File m1893b(File file) {
        return new File(file, "tombstone.txt");
    }

    /* renamed from: b */
    public static File m1894b(String str) {
        return new File(m1888a(C1250h.m1615g(), str), "fds.txt");
    }

    /* renamed from: b */
    public static String m1895b() {
        return "anr_" + C1250h.m1613e();
    }

    /* renamed from: c */
    public static File m1896c(Context context) {
        return new File(m1917j(context), "apminsight/RuntimeContext");
    }

    /* renamed from: c */
    public static File m1897c(File file) {
        return new File(file, "header.bin");
    }

    /* renamed from: c */
    public static File m1898c(String str) {
        return new File(m1888a(C1250h.m1615g(), str), "threads.txt");
    }

    /* renamed from: c */
    public static String m1899c() {
        return String.format("ensure_%s", new Object[]{C1250h.m1613e()});
    }

    /* renamed from: d */
    public static File m1900d(Context context) {
        if (f1334c == null) {
            if (context == null) {
                context = C1250h.m1615g();
            }
            f1334c = new File(m1917j(context), "apminsight/CrashLogNative");
        }
        return f1334c;
    }

    /* renamed from: d */
    public static File m1901d(File file) {
        return new File(m1888a(C1250h.m1615g(), file.getName()), "maps.txt");
    }

    /* renamed from: d */
    public static File m1902d(String str) {
        return new File(m1888a(C1250h.m1615g(), str), "meminfo.txt");
    }

    /* renamed from: e */
    public static File m1903e(Context context) {
        if (f1335d == null) {
            f1335d = new File(m1917j(context) + '/' + "apminsight/CrashCommonLog" + '/' + C1250h.m1614f());
        }
        return f1335d;
    }

    /* renamed from: e */
    public static File m1904e(File file) {
        return new File(file, "callback.json");
    }

    /* renamed from: e */
    public static File m1905e(String str) {
        return new File(m1888a(C1250h.m1615g(), str), "pthreads.txt");
    }

    /* renamed from: f */
    public static File m1906f(Context context) {
        return new File(m1917j(context), "apminsight/CrashCommonLog");
    }

    /* renamed from: f */
    public static File m1907f(File file) {
        return new File(file, "upload.json");
    }

    /* renamed from: f */
    public static File m1908f(String str) {
        return new File(m1888a(C1250h.m1615g(), str), "rountines.txt");
    }

    /* renamed from: g */
    public static File m1909g(Context context) {
        return new File(m1917j(context), "apminsight/issueCrashTimes");
    }

    /* renamed from: g */
    public static File m1910g(File file) {
        return new File(file, "javastack.txt");
    }

    /* renamed from: g */
    public static File m1911g(String str) {
        return new File(m1888a(C1250h.m1615g(), str), "leakd_threads.txt");
    }

    /* renamed from: h */
    public static File m1912h(Context context) {
        return new File(m1917j(context) + '/' + "apminsight/issueCrashTimes" + '/' + "current.times");
    }

    /* renamed from: h */
    public static File m1913h(File file) {
        return new File(m1888a(C1250h.m1615g(), file.getName()), "logcat.txt");
    }

    /* renamed from: i */
    public static File m1914i(Context context) {
        return new File(m1917j(context), "apminsight/alogCrash");
    }

    /* renamed from: i */
    public static File m1915i(File file) {
        return new File(m1888a(C1250h.m1615g(), file.getName()), "fds.txt");
    }

    /* renamed from: j */
    public static File m1916j(File file) {
        return new File(m1888a(C1250h.m1615g(), file.getName()), "threads.txt");
    }

    /* renamed from: j */
    public static String m1917j(Context context) {
        if (TextUtils.isEmpty(f1332a)) {
            try {
                f1332a = context.getFilesDir().getAbsolutePath();
            } catch (Exception e) {
                f1332a = "/sdcard/";
                e.printStackTrace();
            }
        }
        return f1332a;
    }

    /* renamed from: k */
    public static File m1918k(File file) {
        return new File(m1888a(C1250h.m1615g(), file.getName()), "meminfo.txt");
    }

    /* renamed from: l */
    public static File m1919l(File file) {
        return new File(m1888a(C1250h.m1615g(), file.getName()), "pthreads.txt");
    }

    /* renamed from: m */
    public static File m1920m(File file) {
        return new File(m1888a(C1250h.m1615g(), file.getName()), "rountines.txt");
    }

    /* renamed from: n */
    public static File m1921n(File file) {
        return new File(m1888a(C1250h.m1615g(), file.getName()), "leakd_threads.txt");
    }

    /* renamed from: o */
    public static File m1922o(File file) {
        return new File(file, "abortmsg.txt");
    }
}
