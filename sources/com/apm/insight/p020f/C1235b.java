package com.apm.insight.p020f;

import android.text.TextUtils;
import com.apm.insight.CrashType;
import com.apm.insight.entity.C1227a;
import com.apm.insight.entity.C1228b;
import com.apm.insight.entity.C1230c;
import com.apm.insight.p025k.C1284g;
import com.apm.insight.p026l.C1321q;
import com.apm.insight.p026l.C1326v;
import com.apm.insight.runtime.C1394p;
import com.apm.insight.runtime.p027a.C1362f;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.apm.insight.f.b */
public final class C1235b {
    /* renamed from: a */
    private static String m1536a(StackTraceElement[] stackTraceElementArr, int i) {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        while (i < stackTraceElementArr.length) {
            C1326v.m1964a(stackTraceElementArr[i], sb);
            i++;
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static void m1538a(Object obj, Throwable th, String str, boolean z, Map<String, String> map, String str2, String str3) {
        try {
            final Object obj2 = obj;
            final Throwable th2 = th;
            final String str4 = str;
            final boolean z2 = z;
            final Map<String, String> map2 = map;
            final String str5 = str2;
            final String str6 = str3;
            C1394p.m2321b().mo12749a((Runnable) new Runnable() {
                public void run() {
                    C1235b.m1548c(obj2, th2, str4, z2, map2, str5, str6);
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m1539a(Throwable th, String str, boolean z) {
        m1540a(th, str, z, "core_exception_monitor");
    }

    /* renamed from: a */
    public static void m1540a(Throwable th, String str, boolean z, String str2) {
        m1541a(th, str, z, (Map<String, String>) null, str2);
    }

    /* renamed from: a */
    public static void m1541a(Throwable th, String str, boolean z, Map<String, String> map, String str2) {
        try {
            final Throwable th2 = th;
            final String str3 = str;
            final boolean z2 = z;
            final Map<String, String> map2 = map;
            final String str4 = str2;
            C1394p.m2321b().mo12749a((Runnable) new Runnable() {
                public void run() {
                    C1235b.m1545b((Object) null, th2, str3, z2, (Map<String, String>) map2, str4);
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static void m1542a(Map<String, String> map, C1230c cVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (map != null) {
                for (String next : map.keySet()) {
                    jSONObject.put(next, map.get(next));
                }
                cVar.mo12474a("custom", (Object) jSONObject);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m1544a(StackTraceElement[] stackTraceElementArr, int i, String str, String str2, Map<String, String> map) {
        try {
            final StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
            final int i2 = i;
            final String str3 = str;
            final String str4 = str2;
            final Map<String, String> map2 = map;
            C1394p.m2321b().mo12749a((Runnable) new Runnable() {
                public void run() {
                    C1235b.m1547b(stackTraceElementArr2, i2, str3, str4, "core_exception_monitor", (Map<String, String>) map2);
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m1545b(Object obj, Throwable th, String str, boolean z, Map<String, String> map, String str2) {
        m1548c(obj, th, str, z, map, "EnsureNotReachHere", str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m1547b(StackTraceElement[] stackTraceElementArr, int i, String str, String str2, String str3, Map<String, String> map) {
        if (stackTraceElementArr != null) {
            try {
                if (stackTraceElementArr.length > i + 1) {
                    StackTraceElement stackTraceElement = stackTraceElementArr[i];
                    if (stackTraceElement != null) {
                        String a = m1536a(stackTraceElementArr, i);
                        if (!TextUtils.isEmpty(a)) {
                            C1230c a2 = C1230c.m1513a(stackTraceElement, a, str, Thread.currentThread().getName(), true, str2, str3);
                            m1542a(map, a2);
                            C1362f.m2195a().mo12700a(CrashType.ENSURE, (C1227a) a2);
                            C1284g.m1739a(a2);
                            C1321q.m1933b((Object) "[report] " + str);
                        }
                    }
                }
            } catch (Throwable th) {
                C1321q.m1934b(th);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m1548c(Object obj, Throwable th, String str, boolean z, Map<String, String> map, String str2, String str3) {
        if (th != null) {
            try {
                StackTraceElement[] stackTrace = th.getStackTrace();
                StackTraceElement stackTraceElement = stackTrace[0];
                if (stackTraceElement != null) {
                    String a = C1326v.m1960a(th);
                    if (!TextUtils.isEmpty(a)) {
                        C1230c a2 = C1230c.m1513a(stackTraceElement, a, str, Thread.currentThread().getName(), z, str2, str3);
                        if (obj != null) {
                            a2.mo12474a("exception_line_num", (Object) C1228b.m1503a(obj, th, stackTrace));
                        }
                        m1542a(map, a2);
                        C1362f.m2195a().mo12700a(CrashType.ENSURE, (C1227a) a2);
                        C1284g.m1740a(obj, a2);
                        C1321q.m1933b((Object) "[reportException] " + str);
                    }
                }
            } catch (Throwable th2) {
                C1321q.m1934b(th2);
            }
        }
    }
}
