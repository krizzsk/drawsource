package com.apm.insight;

import android.app.Application;
import android.content.Context;
import com.apm.insight.runtime.C1373d;
import com.apm.insight.runtime.C1381i;
import com.apm.insight.runtime.C1402t;
import com.apm.insight.runtime.ConfigManager;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.apm.insight.h */
public final class C1250h {

    /* renamed from: a */
    private static Context f1178a = null;

    /* renamed from: b */
    private static Application f1179b = null;

    /* renamed from: c */
    private static long f1180c = 0;

    /* renamed from: d */
    private static String f1181d = "default";

    /* renamed from: e */
    private static boolean f1182e = false;

    /* renamed from: f */
    private static C1373d f1183f;

    /* renamed from: g */
    private static ConfigManager f1184g = new ConfigManager();

    /* renamed from: h */
    private static C1181a f1185h = new C1181a();

    /* renamed from: i */
    private static volatile ConcurrentHashMap<Integer, String> f1186i;

    /* renamed from: j */
    private static C1402t f1187j = null;

    /* renamed from: k */
    private static volatile String f1188k = null;

    /* renamed from: l */
    private static Object f1189l = new Object();

    /* renamed from: m */
    private static volatile int f1190m = 0;

    /* renamed from: n */
    private static volatile String f1191n;

    /* renamed from: o */
    private static int f1192o = 0;

    /* renamed from: a */
    public static C1373d m1599a() {
        if (f1183f == null) {
            f1183f = C1381i.m2257a(f1178a);
        }
        return f1183f;
    }

    /* renamed from: a */
    public static String m1600a(long j, CrashType crashType, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append("_");
        sb.append(crashType.getName());
        sb.append('_');
        sb.append(m1614f());
        sb.append('_');
        String str = "normal_";
        sb.append(z ? "oom_" : str);
        sb.append(m1618j());
        sb.append('_');
        if (z2) {
            str = "ignore_";
        }
        sb.append(str);
        sb.append(Long.toHexString(new Random().nextLong()));
        sb.append("G");
        return sb.toString();
    }

    /* renamed from: a */
    public static void m1601a(int i) {
        f1192o = i;
    }

    /* renamed from: a */
    static void m1602a(int i, String str) {
        if (f1186i == null) {
            synchronized (C1250h.class) {
                if (f1186i == null) {
                    f1186i = new ConcurrentHashMap<>();
                }
            }
        }
        f1186i.put(Integer.valueOf(i), str);
    }

    /* renamed from: a */
    public static void m1603a(Application application) {
        if (application != null) {
            f1179b = application;
        }
    }

    /* renamed from: a */
    public static void m1604a(Application application, Context context) {
        if (f1179b == null) {
            f1180c = System.currentTimeMillis();
            f1178a = context;
            f1179b = application;
            f1188k = Long.toHexString(new Random().nextLong()) + "G";
        }
    }

    /* renamed from: a */
    static void m1605a(Application application, Context context, ICommonParams iCommonParams) {
        m1604a(application, context);
        f1183f = new C1373d(f1178a, iCommonParams, m1599a());
    }

    /* renamed from: a */
    public static void m1606a(C1373d dVar) {
        f1183f = dVar;
    }

    /* renamed from: a */
    static void m1607a(String str) {
        f1181d = str;
    }

    /* renamed from: a */
    static void m1608a(boolean z) {
        f1182e = z;
    }

    /* renamed from: b */
    public static C1181a m1609b() {
        return f1185h;
    }

    /* renamed from: b */
    static void m1610b(int i, String str) {
        f1190m = i;
        f1191n = str;
    }

    /* renamed from: c */
    public static C1402t m1611c() {
        if (f1187j == null) {
            synchronized (C1250h.class) {
                f1187j = new C1402t(f1178a);
            }
        }
        return f1187j;
    }

    /* renamed from: d */
    public static boolean m1612d() {
        return m1617i().isDebugMode() && m1622n().contains("local_test");
    }

    /* renamed from: e */
    public static String m1613e() {
        return m1614f() + '_' + Long.toHexString(new Random().nextLong()) + "G";
    }

    /* renamed from: f */
    public static String m1614f() {
        if (f1188k == null) {
            synchronized (f1189l) {
                if (f1188k == null) {
                    f1188k = Long.toHexString(new Random().nextLong()) + "U";
                }
            }
        }
        return f1188k;
    }

    /* renamed from: g */
    public static Context m1615g() {
        return f1178a;
    }

    /* renamed from: h */
    public static Application m1616h() {
        return f1179b;
    }

    /* renamed from: i */
    public static ConfigManager m1617i() {
        return f1184g;
    }

    /* renamed from: j */
    public static long m1618j() {
        return f1180c;
    }

    /* renamed from: k */
    public static String m1619k() {
        return f1181d;
    }

    /* renamed from: l */
    public static int m1620l() {
        return f1192o;
    }

    /* renamed from: m */
    public static boolean m1621m() {
        return f1182e;
    }

    /* renamed from: n */
    public static String m1622n() {
        Object obj = m1599a().mo12712a().get("channel");
        return obj == null ? "unknown" : String.valueOf(obj);
    }

    /* renamed from: o */
    public static ConcurrentHashMap<Integer, String> m1623o() {
        return f1186i;
    }

    /* renamed from: p */
    public static int m1624p() {
        return f1190m;
    }

    /* renamed from: q */
    public static String m1625q() {
        return f1191n;
    }
}
