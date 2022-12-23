package com.apm.insight.runtime;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.apm.insight.C1218d;
import com.apm.insight.C1221e;
import com.apm.insight.C1233f;
import com.apm.insight.C1250h;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.IOOMCallback;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.p013a.C1182a;
import com.apm.insight.p013a.C1184b;
import com.apm.insight.p013a.C1185c;
import com.apm.insight.p014b.C1191c;
import com.apm.insight.p014b.C1193d;
import com.apm.insight.p014b.C1197g;
import com.apm.insight.p016d.C1219a;
import com.apm.insight.p021g.C1241a;
import com.apm.insight.p021g.C1246c;
import com.apm.insight.p021g.C1247d;
import com.apm.insight.p023i.C1258b;
import com.apm.insight.p025k.C1280e;
import com.apm.insight.p025k.C1288h;
import com.apm.insight.p026l.C1295a;
import com.apm.insight.p026l.C1321q;
import java.io.File;
import java.util.Map;

/* renamed from: com.apm.insight.runtime.o */
public class C1389o {

    /* renamed from: a */
    private static boolean f1477a = false;

    /* renamed from: b */
    private static boolean f1478b = false;

    /* renamed from: c */
    private static boolean f1479c = false;

    /* renamed from: d */
    private static boolean f1480d = false;

    /* renamed from: e */
    private static boolean f1481e = false;

    /* renamed from: f */
    private static C1371c f1482f = new C1371c();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static volatile boolean f1483g = false;

    /* renamed from: h */
    private static boolean f1484h = false;

    /* renamed from: a */
    public static C1371c m2279a() {
        return f1482f;
    }

    /* renamed from: a */
    public static void m2280a(long j) {
        NativeImpl.m2005a(j);
    }

    /* renamed from: a */
    public static synchronized void m2281a(Application application, Context context, boolean z, boolean z2, boolean z3, boolean z4, long j) {
        synchronized (C1389o.class) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (!f1477a) {
                f1477a = true;
                if (context == null || application == null) {
                    throw new IllegalArgumentException("context or Application must be not null.");
                }
                C1250h.m1604a(application, context);
                if (z || z2) {
                    C1241a a = C1241a.m1565a();
                    if (z2) {
                        a.mo12517a((C1246c) new C1258b(context));
                    }
                    if (z) {
                        a.mo12520b((C1246c) new C1247d(context));
                    }
                    f1478b = true;
                }
                NativeImpl.m2009a();
                if (z3) {
                    boolean a2 = NativeImpl.m2010a(context);
                    f1480d = a2;
                    if (!a2) {
                        f1481e = true;
                    }
                }
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    f1483g = true;
                    NativeImpl.m2028h();
                }
                m2303c(z4);
                C1321q.m1927a((Object) "Npth.init takes " + (SystemClock.uptimeMillis() - uptimeMillis) + " ms.");
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m2282a(Context context, boolean z, boolean z2, boolean z3, boolean z4, long j) {
        String str;
        Application application;
        synchronized (C1389o.class) {
            if (C1250h.m1616h() != null) {
                application = C1250h.m1616h();
            } else if (context instanceof Application) {
                application = (Application) context;
                if (application.getBaseContext() == null) {
                    throw new IllegalArgumentException("初始化时传入的Application还未attach, 请在init时传入attachBaseContext的参数, 并在init之前手动调用Npth.setApplication(Application).");
                }
            } else {
                try {
                    application = (Application) context.getApplicationContext();
                    if (application == null) {
                        throw new IllegalArgumentException(str);
                    } else if (application.getBaseContext() != null) {
                        context = application.getBaseContext();
                    }
                } finally {
                    str = "初始化时传入了baseContext, 导致无法获取Application实例, 请在init之前手动调用Npth.setApplication(Application).";
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(str);
                }
            }
            m2281a(application, context, z, z2, z3, z4, j);
        }
    }

    /* renamed from: a */
    public static void m2283a(ICrashCallback iCrashCallback, CrashType crashType) {
        m2279a().mo12704a(iCrashCallback, crashType);
    }

    /* renamed from: a */
    public static void m2284a(IOOMCallback iOOMCallback) {
        m2279a().mo12705a(iOOMCallback);
    }

    /* renamed from: a */
    public static void m2285a(IOOMCallback iOOMCallback, CrashType crashType) {
        m2279a().mo12708b(iOOMCallback);
    }

    /* renamed from: a */
    public static void m2286a(C1218d dVar) {
        C1250h.m1617i().setEncryptImpl(dVar);
    }

    /* renamed from: a */
    public static void m2287a(C1288h hVar) {
        C1280e.m1717a(hVar);
    }

    /* renamed from: a */
    public static void m2288a(C1383j jVar) {
        C1384k.m2260a(jVar);
    }

    /* renamed from: a */
    public static void m2289a(String str) {
        if (!TextUtils.isEmpty(str)) {
            C1219a.m1420a(str);
        }
    }

    /* renamed from: a */
    public static void m2290a(String str, C1184b bVar, C1185c cVar) {
        if (!TextUtils.isEmpty(str) && new File(str).exists()) {
            C1182a.m1301a().mo12400a(str, bVar, cVar);
        }
    }

    /* renamed from: a */
    public static void m2291a(final String str, final C1221e eVar) {
        C1394p.m2321b().mo12749a((Runnable) new Runnable() {
            public void run() {
                if (C1295a.m1781b(C1250h.m1615g())) {
                    C1193d.m1347a(str, eVar);
                }
            }
        });
    }

    /* renamed from: a */
    public static void m2292a(String str, Map<? extends String, ? extends String> map, Map<String, String> map2, C1233f fVar) {
        if (!TextUtils.isEmpty(str)) {
            C1219a.m1421a(str, map, map2, fVar);
        }
    }

    /* renamed from: a */
    public static void m2293a(String str, Map<? extends String, ? extends String> map, Map<String, String> map2, Map<String, String> map3, C1233f fVar) {
        if (!TextUtils.isEmpty(str)) {
            C1219a.m1422a(str, map, map2, map3, fVar);
        }
    }

    @Deprecated
    /* renamed from: a */
    public static void m2294a(Throwable th) {
        if (C1250h.m1617i().isReportErrorEnable()) {
            C1241a.m1569a(th);
        }
    }

    /* renamed from: b */
    public static void m2296b(long j) {
        NativeImpl.m2013b(j);
    }

    /* renamed from: b */
    public static void m2297b(ICrashCallback iCrashCallback, CrashType crashType) {
        m2279a().mo12707b(iCrashCallback, crashType);
    }

    @Deprecated
    /* renamed from: b */
    public static void m2298b(String str) {
        if (C1250h.m1617i().isReportErrorEnable()) {
            C1241a.m1574c(str);
        }
    }

    /* renamed from: b */
    public static boolean m2300b() {
        return f1478b;
    }

    /* renamed from: c */
    public static void m2301c(long j) {
        NativeImpl.m2018c(j);
    }

    /* renamed from: c */
    public static void m2302c(String str) {
        NativeImpl.m2014b(str);
    }

    /* renamed from: c */
    private static void m2303c(final boolean z) {
        C1394p.m2321b().mo12750a((Runnable) new Runnable() {
            public void run() {
                if (!C1389o.f1483g) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        public void run() {
                            boolean unused = C1389o.f1483g = true;
                            NativeImpl.m2028h();
                        }
                    });
                }
                C1389o.m2305d(z);
            }
        }, 0);
    }

    /* renamed from: c */
    public static boolean m2304c() {
        return f1479c;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x004f  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m2305d(boolean r3) {
        /*
            android.content.Context r0 = com.apm.insight.C1250h.m1615g()
            com.apm.insight.runtime.p027a.C1362f.m2195a()
            com.apm.insight.runtime.C1387m.m2269a()
            java.lang.String r1 = "Npth.initAsync-createCallbackThread"
            com.apm.insight.C1260j.m1656a(r1)
            int r1 = com.apm.insight.nativecrash.NativeImpl.m2011b()
            com.apm.insight.C1260j.m1655a()
            com.apm.insight.nativecrash.NativeImpl.m2017c()
            boolean r2 = f1481e
            if (r2 == 0) goto L_0x0027
            com.apm.insight.c r1 = com.apm.insight.C1186b.m1306a()
            java.lang.String r2 = "NativeLibraryLoad faild"
        L_0x0023:
            r1.mo12439a((java.lang.String) r2)
            goto L_0x0030
        L_0x0027:
            if (r1 >= 0) goto L_0x0030
            com.apm.insight.c r1 = com.apm.insight.C1186b.m1306a()
            java.lang.String r2 = "createCallbackThread faild"
            goto L_0x0023
        L_0x0030:
            java.lang.String r1 = "Npth.initAsync-NpthDataManager"
            com.apm.insight.C1260j.m1656a(r1)
            com.apm.insight.e.a r1 = com.apm.insight.p017e.C1222a.m1424a()
            r1.mo12447a((android.content.Context) r0)
            com.apm.insight.C1260j.m1655a()
            com.apm.insight.C1186b.m1306a()
            java.lang.String r1 = "Npth.initAsync-LaunchScanner"
            com.apm.insight.C1260j.m1656a(r1)
            com.apm.insight.p025k.C1289i.m1751a(r0)
            com.apm.insight.C1260j.m1655a()
            if (r3 == 0) goto L_0x0060
            java.lang.String r1 = "Npth.initAsync-CrashANRHandler"
            com.apm.insight.C1260j.m1656a(r1)
            com.apm.insight.b.g r1 = com.apm.insight.p014b.C1197g.m1356a(r0)
            r1.mo12420c()
            com.apm.insight.C1260j.m1655a()
            f1479c = r3
        L_0x0060:
            java.lang.String r3 = "Npth.initAsync-EventUploadQueue"
            com.apm.insight.C1260j.m1656a(r3)
            com.apm.insight.k.g r3 = com.apm.insight.p025k.C1284g.m1737a()
            r3.mo12561b()
            com.apm.insight.C1260j.m1655a()
            java.lang.String r3 = "Npth.initAsync-BlockMonitor"
            com.apm.insight.C1260j.m1656a(r3)
            com.apm.insight.C1260j.m1655a()
            java.lang.String r3 = "Npth.initAsync-OriginExceptionMonitor"
            com.apm.insight.C1260j.m1656a(r3)
            com.apm.insight.C1260j.m1655a()
            com.apm.insight.nativecrash.NativeImpl.m2023f()
            com.apm.insight.C1256i.m1645a()
            java.lang.String r3 = "fastbot"
            java.io.File r3 = r0.getExternalFilesDir(r3)     // Catch:{ all -> 0x00a9 }
            android.content.Context r0 = com.apm.insight.C1250h.m1615g()     // Catch:{ all -> 0x00a9 }
            boolean r0 = com.apm.insight.p026l.C1295a.m1781b(r0)     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x00a9
            if (r3 == 0) goto L_0x00a9
            boolean r0 = r3.exists()     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x00a9
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ all -> 0x00a9 }
            com.apm.insight.runtime.o$3 r0 = new com.apm.insight.runtime.o$3     // Catch:{ all -> 0x00a9 }
            r0.<init>()     // Catch:{ all -> 0x00a9 }
            com.apm.insight.p014b.C1193d.m1347a((java.lang.String) r3, (com.apm.insight.C1221e) r0)     // Catch:{ all -> 0x00a9 }
        L_0x00a9:
            com.apm.insight.p025k.C1291k.m1765d()
            com.apm.insight.nativecrash.NativeImpl.m2031j()
            java.lang.String r3 = "afterNpthInitAsync"
            java.lang.String r0 = "noValue"
            com.apm.insight.runtime.C1397r.m2331a((java.lang.String) r3, (java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.runtime.C1389o.m2305d(boolean):void");
    }

    /* renamed from: d */
    public static boolean m2306d() {
        return f1480d;
    }

    /* renamed from: e */
    public static boolean m2307e() {
        return f1477a;
    }

    /* renamed from: f */
    public static void m2308f() {
        if (f1477a && !f1478b) {
            Context g = C1250h.m1615g();
            C1241a a = C1241a.m1565a();
            a.mo12517a((C1246c) new C1258b(g));
            a.mo12520b((C1246c) new C1247d(g));
        }
    }

    /* renamed from: g */
    public static void m2309g() {
        if (f1477a) {
            C1197g.m1356a(C1250h.m1615g()).mo12420c();
            f1479c = true;
        }
    }

    /* renamed from: h */
    public static boolean m2310h() {
        if (f1477a && !f1480d) {
            boolean a = NativeImpl.m2010a(C1250h.m1615g());
            f1480d = a;
            if (!a) {
                f1481e = true;
            }
        }
        return f1480d;
    }

    /* renamed from: i */
    public static boolean m2311i() {
        return C1191c.m1340c();
    }

    /* renamed from: j */
    public static void m2312j() {
        if (f1477a) {
            C1197g.m1356a(C1250h.m1615g()).mo12421d();
            f1479c = false;
        }
    }

    /* renamed from: k */
    public static boolean m2313k() {
        return C1241a.m1572b() || NativeImpl.m2020d();
    }

    /* renamed from: l */
    public static boolean m2314l() {
        return C1241a.m1576c() || NativeImpl.m2020d();
    }

    /* renamed from: m */
    public static boolean m2315m() {
        return C1241a.m1572b();
    }

    /* renamed from: n */
    public static boolean m2316n() {
        return f1484h;
    }

    /* renamed from: o */
    public static void m2317o() {
        f1484h = true;
    }
}
