package com.apm.insight.nativecrash;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.apm.insight.C1250h;
import com.apm.insight.p014b.C1193d;
import com.apm.insight.p014b.C1196f;
import com.apm.insight.p014b.C1197g;
import com.apm.insight.p022h.C1253b;
import com.apm.insight.p026l.C1318o;
import com.apm.insight.p026l.C1325u;
import com.apm.insight.p026l.C1329x;
import java.io.File;

public class NativeImpl {

    /* renamed from: a */
    private static volatile boolean f1347a = false;

    /* renamed from: b */
    private static volatile boolean f1348b = false;

    /* renamed from: c */
    private static boolean f1349c = true;

    /* renamed from: a */
    public static int m2002a(int i) {
        if (f1347a && i >= 0) {
            try {
                return doLock("", i);
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static String m2003a(String str) {
        if (!f1347a) {
            return null;
        }
        return doGetCrashHeader(str);
    }

    /* renamed from: a */
    public static void m2004a(int i, String str) {
        if (f1347a && !TextUtils.isEmpty(str)) {
            try {
                doWriteFile(i, str, str.length());
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m2005a(long j) {
    }

    /* renamed from: a */
    public static void m2006a(File file) {
        if (f1347a) {
            doRebuildTombstone(C1318o.m1897c(file).getAbsolutePath(), C1318o.m1893b(file).getAbsolutePath(), C1318o.m1901d(file).getAbsolutePath());
        }
    }

    /* renamed from: a */
    public static void m2007a(String str, String str2, String str3) {
        if (f1347a) {
            try {
                doDumpLogcat(str, str2, str3);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m2008a(boolean z) {
        f1349c = z;
        if (f1347a) {
            doSetResendSigQuit(z ? 1 : 0);
        }
    }

    /* renamed from: a */
    public static boolean m2009a() {
        if (f1348b) {
            return f1347a;
        }
        f1348b = true;
        if (!f1347a) {
            f1347a = C1325u.m1958a("apminsighta");
        }
        return f1347a;
    }

    /* renamed from: a */
    public static boolean m2010a(Context context) {
        String str;
        boolean a = m2009a();
        if (a) {
            String str2 = C1318o.m1917j(context) + "/apminsight";
            if (new File(context.getApplicationInfo().nativeLibraryDir, "libapminsightb.so").exists()) {
                str = context.getApplicationInfo().nativeLibraryDir;
            } else {
                str = C1253b.m1633a();
                C1253b.m1636b("apminsightb");
            }
            doStart(Build.VERSION.SDK_INT, str, str2, C1250h.m1614f(), C1250h.m1620l());
        }
        return a;
    }

    /* renamed from: b */
    public static int m2011b() {
        if (!f1347a) {
            return -1;
        }
        return doCreateCallbackThread();
    }

    /* renamed from: b */
    public static void m2012b(int i) {
        if (f1347a) {
            try {
                doCloseFile(i);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public static void m2013b(long j) {
        if (f1347a) {
            try {
                doSetAlogFlushAddr(j);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public static void m2014b(String str) {
        if (f1347a) {
            doDumpHprof(str);
        }
    }

    /* renamed from: c */
    public static int m2015c(String str) {
        if (f1347a && !TextUtils.isEmpty(str)) {
            try {
                return doLock(str, -1);
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    /* renamed from: c */
    public static long m2016c(int i) {
        if (!f1347a) {
            return 0;
        }
        return doGetThreadCpuTime(i);
    }

    /* renamed from: c */
    public static void m2017c() {
    }

    /* renamed from: c */
    public static void m2018c(long j) {
        if (f1347a) {
            try {
                doSetAlogLogDirAddr(j);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: d */
    public static void m2019d(String str) {
        if (f1347a) {
            try {
                doDumpMemInfo(str);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: d */
    public static boolean m2020d() {
        if (!f1347a) {
            return false;
        }
        try {
            return doCheckNativeCrash();
        } catch (Throwable unused) {
            return false;
        }
    }

    private static native boolean doCheckNativeCrash();

    private static native void doCloseFile(int i);

    private static native int doCreateCallbackThread();

    private static native void doDump(String str);

    private static native void doDumpFds(String str);

    private static native void doDumpHprof(String str);

    private static native void doDumpLogcat(String str, String str2, String str3);

    private static native void doDumpMaps(String str);

    private static native void doDumpMemInfo(String str);

    private static native void doDumpThreads(String str);

    private static native long doGetAppCpuTime();

    private static native long doGetChildCpuTime();

    private static native String doGetCrashHeader(String str);

    private static native long doGetDeviceCpuTime();

    private static native int doGetFDCount();

    private static native String[] doGetFdDump(int i, int i2, int[] iArr, String[] strArr);

    private static native long doGetFreeMemory();

    private static native long doGetThreadCpuTime(int i);

    private static native int doGetThreadsCount();

    private static native long doGetTotalMemory();

    private static native long doGetVMSize();

    private static native void doInitThreadDump();

    private static native int doLock(String str, int i);

    private static native int doOpenFile(String str);

    private static native void doRebuildTombstone(String str, String str2, String str3);

    private static native void doSetAlogConfigPath(String str);

    private static native void doSetAlogFlushAddr(long j);

    private static native void doSetAlogLogDirAddr(long j);

    private static native void doSetResendSigQuit(int i);

    private static native void doSetUploadEnd();

    private static native void doSignalMainThread();

    private static native int doStart(int i, String str, String str2, String str3, int i2);

    private static native void doStartAnrMonitor(int i);

    private static native void doWriteFile(int i, String str, int i2);

    /* renamed from: e */
    public static void m2021e(String str) {
        if (f1347a) {
            try {
                doDumpFds(str);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: e */
    public static boolean m2022e() {
        if (!f1347a) {
            return false;
        }
        try {
            return is64Bit();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: f */
    public static void m2023f() {
        C1329x.m1994a(new Runnable() {
            public void run() {
                try {
                    NativeImpl.m2033l();
                } catch (Throwable unused) {
                }
            }
        }, "NPTH-AnrMonitor");
    }

    /* renamed from: f */
    public static void m2024f(String str) {
        if (f1347a) {
            try {
                doDumpMaps(str);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: g */
    public static void m2025g(String str) {
        if (f1347a) {
            try {
                doDumpThreads(str);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: g */
    public static boolean m2026g() {
        return f1349c;
    }

    /* renamed from: h */
    public static int m2027h(String str) {
        if (!f1347a) {
            return -1;
        }
        try {
            return doOpenFile(str);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: h */
    public static void m2028h() {
        if (f1347a) {
            doSignalMainThread();
        }
    }

    private static void handleNativeCrash(String str) {
        NativeCrashCollector.onNativeCrash(str);
    }

    /* renamed from: i */
    public static void m2029i() {
        if (f1347a) {
            doSetUploadEnd();
        }
    }

    /* renamed from: i */
    public static void m2030i(String str) {
        if (f1347a) {
            doDump(str);
        }
    }

    private static native boolean is64Bit();

    /* renamed from: j */
    public static void m2031j() {
        if (f1347a) {
            doInitThreadDump();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static void m2033l() {
        if (f1347a) {
            try {
                doStartAnrMonitor(Build.VERSION.SDK_INT);
            } catch (Throwable unused) {
            }
        }
    }

    private static void reportEventForAnrMonitor() {
        try {
            System.currentTimeMillis();
            C1250h.m1618j();
            C1196f.m1355b(true);
            C1193d.m1349b();
            C1197g.m1356a(C1250h.m1615g()).mo12419a().mo12408e();
        } catch (Throwable unused) {
        }
    }
}
