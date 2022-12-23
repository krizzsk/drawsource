package com.mbridge.msdk.p078c;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.p083a.p084a.C2461a;
import com.mbridge.msdk.foundation.same.C8469a;
import com.mbridge.msdk.foundation.tools.C8614ab;
import java.util.HashMap;

/* renamed from: com.mbridge.msdk.c.b */
/* compiled from: SettingManager */
public class C2445b {

    /* renamed from: a */
    public static final String f5053a = C2445b.class.getSimpleName();

    /* renamed from: b */
    private static C2445b f5054b = null;

    /* renamed from: c */
    private static HashMap<String, C2456d> f5055c = new HashMap<>();

    /* renamed from: d */
    private static volatile C2440a f5056d = null;

    private C2445b() {
    }

    /* renamed from: a */
    public static synchronized C2445b m6020a() {
        C2445b bVar;
        synchronized (C2445b.class) {
            if (f5054b == null) {
                f5054b = new C2445b();
            }
            bVar = f5054b;
        }
        return bVar;
    }

    /* renamed from: a */
    public final boolean mo16282a(String str) {
        C2440a b = mo16286b(str);
        if (b == null) {
            return true;
        }
        return b.mo16165T() + (b.mo16164S() * 1000) <= System.currentTimeMillis();
    }

    /* renamed from: a */
    public final boolean mo16283a(String str, int i, String str2) {
        try {
            Context g = C8388a.m23845e().mo56913g();
            String str3 = str + "_" + i + "_" + str2;
            long currentTimeMillis = System.currentTimeMillis();
            long j = 0;
            long longValue = ((Long) C8614ab.m24713b(g, str3, 0L)).longValue();
            C2440a b = mo16286b(str);
            if (b == null) {
                b = m6020a().mo16285b();
            } else {
                j = longValue;
            }
            if (j + (b.mo16158M() * 1000) > currentTimeMillis) {
                return false;
            }
            C8614ab.m24712a(g, str3, Long.valueOf(currentTimeMillis));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo16284a(String str, String str2) {
        C2440a b = mo16286b(str2);
        if (mo16282a(str2) && mo16283a(str2, 1, str)) {
            new C2452c().mo16302a(C8388a.m23845e().mo56913g(), str2, C8388a.m23845e().mo56916j());
        }
        C2456d e = mo16292e(str2, str);
        if (!(b == null || e == null)) {
            if (e.mo16329t() + (b.mo16160O() * 1000) > System.currentTimeMillis()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public final void mo16287b(String str, String str2) {
        C2461a.m6124a().mo16388a(str, str2);
        f5056d = C2440a.m5883c(str2);
        if (f5056d != null) {
            f5056d.mo16185ac();
        }
    }

    /* renamed from: b */
    public final C2440a mo16286b(String str) {
        if (f5056d == null) {
            try {
                f5056d = C2440a.m5883c(C2461a.m6124a().mo16390b(str));
                if (f5056d != null) {
                    f5056d.mo16185ac();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return f5056d;
    }

    /* renamed from: c */
    public final String mo16289c(String str) {
        if (str == null) {
            return "";
        }
        try {
            String b = C2461a.m6124a().mo16390b(str);
            return b == null ? "" : b;
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
            return "";
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022 A[SYNTHETIC, Splitter:B:8:0x0022] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m6021a(android.content.Context r5, java.lang.String r6) {
        /*
            com.mbridge.msdk.foundation.controller.b r0 = com.mbridge.msdk.foundation.controller.C8396b.m23890a()
            boolean r0 = r0.mo56951d()
            java.lang.String r1 = "mbridge"
            r2 = 0
            if (r0 == 0) goto L_0x001d
            com.mbridge.msdk.foundation.tools.FastKV$Builder r0 = new com.mbridge.msdk.foundation.tools.FastKV$Builder     // Catch:{ Exception -> 0x001d }
            com.mbridge.msdk.foundation.same.b.c r3 = com.mbridge.msdk.foundation.same.p301b.C8476c.MBRIDGE_700_CONFIG     // Catch:{ Exception -> 0x001d }
            java.lang.String r3 = com.mbridge.msdk.foundation.same.p301b.C8478e.m24306b(r3)     // Catch:{ Exception -> 0x001d }
            r0.<init>(r3, r1)     // Catch:{ Exception -> 0x001d }
            com.mbridge.msdk.foundation.tools.FastKV r0 = r0.build()     // Catch:{ Exception -> 0x001d }
            goto L_0x001e
        L_0x001d:
            r0 = r2
        L_0x001e:
            java.lang.String r3 = "_"
            if (r0 == 0) goto L_0x0066
            java.util.Map r2 = r0.getAll()     // Catch:{ Exception -> 0x0026 }
        L_0x0026:
            if (r2 == 0) goto L_0x00ac
            java.util.Set r5 = r2.keySet()     // Catch:{ Exception -> 0x0061 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x0061 }
        L_0x0030:
            boolean r0 = r5.hasNext()     // Catch:{ Exception -> 0x0061 }
            if (r0 == 0) goto L_0x00ac
            java.lang.Object r0 = r5.next()     // Catch:{ Exception -> 0x0061 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0061 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0061 }
            r1.<init>()     // Catch:{ Exception -> 0x0061 }
            r1.append(r6)     // Catch:{ Exception -> 0x0061 }
            r1.append(r3)     // Catch:{ Exception -> 0x0061 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0061 }
            boolean r1 = r0.startsWith(r1)     // Catch:{ Exception -> 0x0061 }
            if (r1 == 0) goto L_0x0030
            java.util.HashMap<java.lang.String, com.mbridge.msdk.c.d> r1 = f5055c     // Catch:{ Exception -> 0x0061 }
            java.lang.Object r4 = r2.get(r0)     // Catch:{ Exception -> 0x0061 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x0061 }
            com.mbridge.msdk.c.d r4 = com.mbridge.msdk.p078c.C2456d.m6068b((java.lang.String) r4)     // Catch:{ Exception -> 0x0061 }
            r1.put(r0, r4)     // Catch:{ Exception -> 0x0061 }
            goto L_0x0030
        L_0x0061:
            r5 = move-exception
            r5.printStackTrace()
            goto L_0x00ac
        L_0x0066:
            r0 = 0
            android.content.SharedPreferences r5 = r5.getSharedPreferences(r1, r0)     // Catch:{ Exception -> 0x00a8 }
            java.util.Map r5 = r5.getAll()     // Catch:{ Exception -> 0x00a8 }
            java.util.Set r0 = r5.keySet()     // Catch:{ Exception -> 0x00a8 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x00a8 }
        L_0x0077:
            boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x00a8 }
            if (r1 == 0) goto L_0x00ac
            java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x00a8 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a8 }
            r2.<init>()     // Catch:{ Exception -> 0x00a8 }
            r2.append(r6)     // Catch:{ Exception -> 0x00a8 }
            r2.append(r3)     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00a8 }
            boolean r2 = r1.startsWith(r2)     // Catch:{ Exception -> 0x00a8 }
            if (r2 == 0) goto L_0x0077
            java.util.HashMap<java.lang.String, com.mbridge.msdk.c.d> r2 = f5055c     // Catch:{ Exception -> 0x00a8 }
            java.lang.Object r4 = r5.get(r1)     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00a8 }
            com.mbridge.msdk.c.d r4 = com.mbridge.msdk.p078c.C2456d.m6068b((java.lang.String) r4)     // Catch:{ Exception -> 0x00a8 }
            r2.put(r1, r4)     // Catch:{ Exception -> 0x00a8 }
            goto L_0x0077
        L_0x00a8:
            r5 = move-exception
            r5.printStackTrace()
        L_0x00ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.p078c.C2445b.m6021a(android.content.Context, java.lang.String):void");
    }

    /* renamed from: c */
    public final C2456d mo16288c(String str, String str2) {
        C2456d e = mo16292e(str, str2);
        return e == null ? C2456d.m6073k() : e;
    }

    /* renamed from: e */
    public final C2456d mo16292e(String str, String str2) {
        C2456d g = m6022g(str, str2);
        if (g != null && g.mo16319i() == 0) {
            g.mo16312c(1);
        }
        return g;
    }

    /* renamed from: g */
    private C2456d m6022g(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = C8388a.m23845e().mo56914h();
        }
        String str3 = str + "_" + str2;
        C2456d dVar = null;
        if (f5055c.containsKey(str3)) {
            return f5055c.get(str3);
        }
        try {
            dVar = C2456d.m6068b(C2461a.m6124a().mo16390b(str3));
            f5055c.put(str3, dVar);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dVar;
    }

    /* renamed from: f */
    public final C2456d mo16295f(String str, String str2) {
        return m6022g(str, str2);
    }

    /* renamed from: a */
    public final void mo16281a(String str, String str2, String str3) {
        String str4 = str + "_" + str2;
        C2461a.m6124a().mo16388a(str4, str3);
        f5055c.put(str4, C2456d.m6068b(str3));
    }

    /* renamed from: d */
    public final String mo16291d(String str) {
        C2461a a = C2461a.m6124a();
        return a.mo16390b("ivreward_" + str);
    }

    /* renamed from: e */
    public final void mo16293e(String str) {
        C2461a a = C2461a.m6124a();
        a.mo16391c("ivreward_" + str);
    }

    /* renamed from: b */
    public final C2440a mo16285b() {
        C2440a aVar = new C2440a();
        aVar.mo16254r(1);
        aVar.mo16227e(true);
        aVar.mo16216c(3600);
        aVar.mo16220d(0);
        aVar.mo16222d(false);
        aVar.mo16217c(false);
        aVar.mo16174a(7200);
        aVar.mo16212b("mbridge");
        aVar.mo16250p(1);
        aVar.mo16211b(1800);
        aVar.mo16252q(259200);
        aVar.mo16225e(10);
        aVar.mo16240k(1);
        aVar.mo16237j(1);
        aVar.mo16242l(1);
        aVar.mo16244m(0);
        aVar.mo16246n(1);
        aVar.mo16248o(-1);
        aVar.mo16215c(0);
        aVar.mo16226e("https://cdn-adn-https.rayjump.com/cdn-adn/v2/portal/19/08/20/11/06/5d5b63cb457e2.js");
        aVar.mo16221d("https://mtg-native.rayjump.com/omsdk/omsdkjs_common_js.txt");
        aVar.mo16210b(120);
        aVar.mo16229f(false);
        aVar.mo16258t(0);
        aVar.mo16261u(120);
        aVar.mo16263v(1);
        aVar.mo16232g(C8469a.f20762w);
        aVar.mo16228f(C8469a.f20764y);
        aVar.mo16224e(C8469a.f20763x);
        aVar.mo16173a(10);
        aVar.mo16234h(C8469a.f20765z);
        aVar.mo16219d(10);
        aVar.mo16267x(0);
        aVar.mo16265w(0);
        aVar.mo16175a("");
        aVar.mo16269y(1);
        aVar.mo16213b(false);
        aVar.mo16256s(1);
        aVar.mo16176a(false);
        return aVar;
    }

    /* renamed from: f */
    public final C2440a mo16294f(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return mo16285b();
            }
            C2440a b = mo16286b(str);
            if (b == null) {
                return mo16285b();
            }
            return b;
        } catch (Exception unused) {
            return mo16285b();
        }
    }

    /* renamed from: d */
    public final C2456d mo16290d(String str, String str2) {
        C2456d g = m6022g(str, str2);
        return g == null ? C2456d.m6073k() : g;
    }
}
