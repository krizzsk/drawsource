package com.apm.insight.p026l;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.apm.insight.entity.C1227a;
import com.apm.insight.p014b.C1196f;
import com.apm.insight.runtime.p027a.C1353b;
import com.facebook.internal.security.CertificateUtil;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.apm.insight.l.a */
public final class C1295a {

    /* renamed from: a */
    private static String f1307a = null;

    /* renamed from: b */
    private static Class<?> f1308b = null;

    /* renamed from: c */
    private static Field f1309c = null;

    /* renamed from: d */
    private static Field f1310d = null;

    /* renamed from: e */
    private static boolean f1311e = false;

    /* renamed from: a */
    private static long m1772a(int i) {
        if (i < 0) {
            return 0;
        }
        return ((long) i) * 1024;
    }

    /* renamed from: a */
    public static ActivityManager.ProcessErrorStateInfo m1773a(Context context, int i) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return null;
        }
        int myPid = Process.myPid();
        int i2 = 0;
        while (i2 < i) {
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
            if (processesInErrorState != null) {
                for (ActivityManager.ProcessErrorStateInfo next : processesInErrorState) {
                    if (next.pid == myPid && next.condition == 2) {
                        return next;
                    }
                }
            }
            i2++;
            if (i == i2 || C1196f.m1354a()) {
                break;
            }
            SystemClock.sleep(200);
        }
        return null;
    }

    /* renamed from: a */
    private static String m1774a() {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + Process.myPid() + "/cmdline"), "iso-8859-1"));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    int read = bufferedReader.read();
                    if (read > 0) {
                        sb.append((char) read);
                    } else {
                        String sb2 = sb.toString();
                        C1310k.m1852a((Closeable) bufferedReader);
                        return sb2;
                    }
                }
            } catch (Throwable unused) {
                C1310k.m1852a((Closeable) bufferedReader);
                return null;
            }
        } catch (Throwable unused2) {
            bufferedReader = null;
            C1310k.m1852a((Closeable) bufferedReader);
            return null;
        }
    }

    /* renamed from: a */
    public static void m1775a(Context context, JSONObject jSONObject) {
        try {
            m1777a(jSONObject);
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                m1780b(jSONObject, activityManager);
            }
            m1778a(jSONObject, activityManager);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m1776a(String str) {
        f1307a = str;
    }

    /* renamed from: a */
    private static void m1777a(JSONObject jSONObject) {
        Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
        Debug.getMemoryInfo(memoryInfo);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("dalvikPrivateDirty", m1772a(memoryInfo.dalvikPrivateDirty));
        jSONObject2.put("dalvikPss", m1772a(memoryInfo.dalvikPss));
        jSONObject2.put("dalvikSharedDirty", m1772a(memoryInfo.dalvikSharedDirty));
        jSONObject2.put("nativePrivateDirty", m1772a(memoryInfo.nativePrivateDirty));
        jSONObject2.put("nativePss", m1772a(memoryInfo.nativePss));
        jSONObject2.put("nativeSharedDirty", m1772a(memoryInfo.nativeSharedDirty));
        jSONObject2.put("otherPrivateDirty", m1772a(memoryInfo.otherPrivateDirty));
        jSONObject2.put("otherPss", m1772a(memoryInfo.otherPss));
        jSONObject2.put("otherSharedDirty", memoryInfo.otherSharedDirty);
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                String memoryStat = memoryInfo.getMemoryStat("summary.graphics");
                if (!TextUtils.isEmpty(memoryStat)) {
                    jSONObject2.put("summary.graphics", m1772a(Integer.parseInt(memoryStat)));
                }
            } catch (Throwable unused) {
            }
        }
        jSONObject2.put("totalPrivateClean", C1297c.m1788a(memoryInfo));
        jSONObject2.put("totalPrivateDirty", memoryInfo.getTotalPrivateDirty());
        jSONObject2.put("totalPss", m1772a(memoryInfo.getTotalPss()));
        jSONObject2.put("totalSharedClean", C1297c.m1789b(memoryInfo));
        jSONObject2.put("totalSharedDirty", m1772a(memoryInfo.getTotalSharedDirty()));
        jSONObject2.put("totalSwappablePss", m1772a(C1297c.m1790c(memoryInfo)));
        jSONObject.put("memory_info", jSONObject2);
    }

    /* renamed from: a */
    private static void m1778a(JSONObject jSONObject, ActivityManager activityManager) {
        JSONObject jSONObject2 = new JSONObject();
        boolean z = true;
        C1227a.m1466a(jSONObject, "filters", "native_heap_leak", String.valueOf(Debug.getNativeHeapAllocatedSize() > 209715200));
        jSONObject2.put("native_heap_size", Debug.getNativeHeapSize());
        jSONObject2.put("native_heap_alloc_size", Debug.getNativeHeapAllocatedSize());
        jSONObject2.put("native_heap_free_size", Debug.getNativeHeapFreeSize());
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory();
        long freeMemory = runtime.freeMemory();
        long j = runtime.totalMemory();
        jSONObject2.put("max_memory", maxMemory);
        jSONObject2.put("free_memory", freeMemory);
        jSONObject2.put("total_memory", j);
        if (((float) (j - freeMemory)) <= ((float) maxMemory) * 0.95f) {
            z = false;
        }
        C1227a.m1466a(jSONObject, "filters", "java_heap_leak", String.valueOf(z));
        if (activityManager != null) {
            jSONObject2.put("memory_class", activityManager.getMemoryClass());
            jSONObject2.put("large_memory_class", activityManager.getLargeMemoryClass());
        }
        jSONObject.put("app_memory_info", jSONObject2);
    }

    /* renamed from: a */
    public static boolean m1779a(Context context) {
        return context == null ? C1353b.m2137d().mo12673f() : C1353b.m2137d().mo12673f() || m1785f(context);
    }

    /* renamed from: b */
    private static void m1780b(JSONObject jSONObject, ActivityManager activityManager) {
        JSONObject jSONObject2 = new JSONObject();
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        jSONObject2.put("availMem", memoryInfo.availMem);
        jSONObject2.put("lowMemory", memoryInfo.lowMemory);
        jSONObject2.put("threshold", memoryInfo.threshold);
        jSONObject2.put("totalMem", C1314n.m1883a(memoryInfo));
        jSONObject.put("sys_memory_info", jSONObject2);
    }

    /* renamed from: b */
    public static boolean m1781b(Context context) {
        String c = m1782c(context);
        if (c != null && c.contains(CertificateUtil.DELIMITER)) {
            return false;
        }
        if (c == null || !c.equals(context.getPackageName())) {
            return c != null && c.equals(context.getApplicationInfo().processName);
        }
        return true;
    }

    /* renamed from: c */
    public static String m1782c(Context context) {
        if (!TextUtils.isEmpty(f1307a)) {
            return f1307a;
        }
        try {
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                for (ActivityManager.RunningAppProcessInfo next : activityManager.getRunningAppProcesses()) {
                    if (next.pid == myPid) {
                        String str = next.processName;
                        f1307a = str;
                        return str;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        String a = m1774a();
        f1307a = a;
        return a == null ? "" : a;
    }

    /* renamed from: d */
    public static String m1783d(Context context) {
        Class<?> g = m1786g(context);
        if (f1309c == null && g != null) {
            try {
                f1309c = g.getDeclaredField("VERSION_NAME");
            } catch (NoSuchFieldException unused) {
            }
        }
        Field field = f1309c;
        if (field == null) {
            return "";
        }
        try {
            return String.valueOf(field.get((Object) null));
        } catch (Throwable unused2) {
            return "";
        }
    }

    /* renamed from: e */
    public static int m1784e(Context context) {
        Class<?> g = m1786g(context);
        if (f1310d == null && g != null) {
            try {
                f1310d = g.getDeclaredField("VERSION_CODE");
            } catch (NoSuchFieldException unused) {
            }
        }
        Field field = f1310d;
        if (field == null) {
            return -1;
        }
        try {
            return ((Integer) field.get((Object) null)).intValue();
        } catch (Throwable unused2) {
            return -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        r5 = r5.get(0).topActivity;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m1785f(android.content.Context r5) {
        /*
            java.lang.String r0 = r5.getPackageName()
            r1 = 0
            java.lang.String r2 = "activity"
            java.lang.Object r5 = r5.getSystemService(r2)     // Catch:{ all -> 0x005d }
            android.app.ActivityManager r5 = (android.app.ActivityManager) r5     // Catch:{ all -> 0x005d }
            if (r5 != 0) goto L_0x0010
            return r1
        L_0x0010:
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x005d }
            r3 = 21
            if (r2 >= r3) goto L_0x0038
            r2 = 1
            java.util.List r5 = r5.getRunningTasks(r2)     // Catch:{ all -> 0x005d }
            if (r5 == 0) goto L_0x005d
            boolean r3 = r5.isEmpty()     // Catch:{ all -> 0x005d }
            if (r3 != 0) goto L_0x005d
            java.lang.Object r5 = r5.get(r1)     // Catch:{ all -> 0x005d }
            android.app.ActivityManager$RunningTaskInfo r5 = (android.app.ActivityManager.RunningTaskInfo) r5     // Catch:{ all -> 0x005d }
            android.content.ComponentName r5 = r5.topActivity     // Catch:{ all -> 0x005d }
            if (r5 == 0) goto L_0x005d
            java.lang.String r5 = r5.getPackageName()     // Catch:{ all -> 0x005d }
            boolean r5 = r0.equals(r5)     // Catch:{ all -> 0x005d }
            if (r5 == 0) goto L_0x005d
            return r2
        L_0x0038:
            java.util.List r5 = r5.getRunningAppProcesses()     // Catch:{ all -> 0x005d }
            if (r5 == 0) goto L_0x005d
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x005d }
        L_0x0042:
            boolean r2 = r5.hasNext()     // Catch:{ all -> 0x005d }
            if (r2 == 0) goto L_0x005d
            java.lang.Object r2 = r5.next()     // Catch:{ all -> 0x005d }
            android.app.ActivityManager$RunningAppProcessInfo r2 = (android.app.ActivityManager.RunningAppProcessInfo) r2     // Catch:{ all -> 0x005d }
            int r3 = r2.importance     // Catch:{ all -> 0x005d }
            r4 = 100
            if (r3 != r4) goto L_0x0042
            java.lang.String[] r5 = r2.pkgList     // Catch:{ all -> 0x005d }
            r5 = r5[r1]     // Catch:{ all -> 0x005d }
            boolean r5 = r0.equals(r5)     // Catch:{ all -> 0x005d }
            return r5
        L_0x005d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.p026l.C1295a.m1785f(android.content.Context):boolean");
    }

    /* renamed from: g */
    private static Class<?> m1786g(Context context) {
        if (f1308b == null && !f1311e) {
            try {
                f1308b = Class.forName(context.getPackageName() + ".BuildConfig");
            } catch (ClassNotFoundException unused) {
            }
            f1311e = true;
        }
        return f1308b;
    }
}
