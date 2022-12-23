package com.apm.insight.p025k;

import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.apm.insight.C1250h;
import com.apm.insight.entity.C1228b;
import com.apm.insight.p026l.C1308i;
import com.apm.insight.p026l.C1318o;
import com.apm.insight.p026l.C1321q;
import com.apm.insight.runtime.C1351a;
import com.apm.insight.runtime.C1374e;
import com.apm.insight.runtime.C1394p;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: com.apm.insight.k.k */
public class C1291k {

    /* renamed from: a */
    private static File f1297a = null;

    /* renamed from: b */
    private static boolean f1298b = false;

    /* renamed from: c */
    private static boolean f1299c = false;

    /* renamed from: d */
    private static String f1300d = "exception_modules";

    /* renamed from: e */
    private static String f1301e = "npth";

    /* renamed from: f */
    private static Map<String, String> f1302f;

    /* renamed from: a */
    public static void m1759a(String str) {
        if (f1302f == null) {
            f1302f = new HashMap();
        }
        f1302f.put(str, String.valueOf(System.currentTimeMillis()));
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0013 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m1760a(boolean r2, org.json.JSONArray r3) {
        /*
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x0013 }
            android.content.Context r0 = com.apm.insight.C1250h.m1615g()     // Catch:{ IOException -> 0x0013 }
            java.lang.String r0 = com.apm.insight.p026l.C1318o.m1917j((android.content.Context) r0)     // Catch:{ IOException -> 0x0013 }
            java.lang.String r1 = "apminsight/configCrash/configFile"
            r2.<init>(r0, r1)     // Catch:{ IOException -> 0x0013 }
            r0 = 0
            com.apm.insight.p026l.C1308i.m1828a((java.io.File) r2, (org.json.JSONArray) r3, (boolean) r0)     // Catch:{ IOException -> 0x0013 }
        L_0x0013:
            java.io.File r2 = m1767f()     // Catch:{ all -> 0x001c }
            java.util.Map<java.lang.String, java.lang.String> r3 = f1302f     // Catch:{ all -> 0x001c }
            com.apm.insight.p026l.C1308i.m1827a((java.io.File) r2, (java.util.Map<java.lang.String, java.lang.String>) r3)     // Catch:{ all -> 0x001c }
        L_0x001c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.p025k.C1291k.m1760a(boolean, org.json.JSONArray):void");
    }

    /* renamed from: a */
    static boolean m1761a() {
        return f1298b;
    }

    /* renamed from: a */
    static boolean m1762a(boolean z) {
        try {
            Map<String, String> e = f1302f == null ? C1308i.m1847e(m1767f()) : f1302f;
            f1302f = e;
            if (e == null) {
                f1302f = new HashMap();
                return true;
            } else if (e.size() < C1228b.m1511c()) {
                return true;
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                boolean z2 = false;
                for (Map.Entry next : f1302f.entrySet()) {
                    if (currentTimeMillis - Long.decode((String) next.getValue()).longValue() > C1374e.m2238e((String) next.getKey())) {
                        z2 = true;
                    }
                }
                C1321q.m1927a((Object) z2 ? "config should be updated" : "config should not be updated");
                return z2;
            }
        } catch (Throwable th) {
            Log.e("npth", NotificationCompat.CATEGORY_ERROR, th);
            return true;
        }
    }

    /* renamed from: b */
    static boolean m1763b() {
        return f1299c;
    }

    /* renamed from: c */
    static void m1764c() {
        if (!f1298b) {
            f1299c = true;
            File file = new File(C1318o.m1917j(C1250h.m1615g()), "apminsight/configCrash/configFile");
            if (file.exists()) {
                try {
                    C1351a.m2096a(new JSONArray(C1308i.m1841c(file)), false);
                    f1298b = true;
                } catch (Throwable unused) {
                    C1351a.m2096a((JSONArray) null, false);
                }
            }
        }
    }

    /* renamed from: d */
    public static void m1765d() {
        m1764c();
        if (m1762a(false)) {
            C1266a.m1664a();
        }
    }

    /* renamed from: e */
    public static void m1766e() {
        C1394p.m2321b().mo12749a((Runnable) new Runnable() {
            public void run() {
                if (C1291k.m1762a(false)) {
                    C1266a.m1664a();
                }
            }
        });
    }

    /* renamed from: f */
    private static File m1767f() {
        if (f1297a == null) {
            f1297a = new File(C1318o.m1917j(C1250h.m1615g()), "apminsight/configCrash/configInvalid");
        }
        return f1297a;
    }
}
