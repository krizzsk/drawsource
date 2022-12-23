package com.apm.insight.p025k;

import com.apm.insight.C1250h;
import com.apm.insight.entity.C1228b;
import com.apm.insight.p026l.C1295a;
import com.apm.insight.p026l.C1319p;
import com.apm.insight.p026l.C1321q;
import com.apm.insight.runtime.C1394p;
import com.apm.insight.runtime.C1403u;
import java.util.Map;

/* renamed from: com.apm.insight.k.a */
public class C1266a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static Runnable f1219a = new Runnable() {
        public void run() {
            long j;
            Runnable runnable;
            C1403u uVar;
            if (C1319p.m1925b(C1250h.m1615g())) {
                C1266a.m1672i();
            }
            if (C1266a.f1220b > 0) {
                if (C1295a.m1781b(C1250h.m1615g())) {
                    uVar = C1394p.m2321b();
                    runnable = C1266a.f1219a;
                    j = 15000;
                } else {
                    uVar = C1394p.m2321b();
                    runnable = C1266a.f1219a;
                    j = 60000;
                }
                uVar.mo12750a(runnable, j);
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static int f1220b = 0;

    /* renamed from: a */
    public static void m1664a() {
        f1220b = 40;
        C1394p.m2321b().mo12749a(f1219a);
    }

    /* renamed from: b */
    public static void m1665b() {
        if (!C1291k.m1763b()) {
            C1291k.m1764c();
        }
        if (C1319p.m1925b(C1250h.m1615g()) && C1291k.m1762a(false)) {
            m1672i();
        }
    }

    /* renamed from: c */
    public static boolean m1666c() {
        return false;
    }

    /* renamed from: d */
    public static void m1667d() {
    }

    /* renamed from: h */
    private static byte[] m1671h() {
        try {
            return C1280e.m1721a(C1250h.m1617i().getConfigUrl(), (Map<String, String>) null, C1228b.m1501a().toString().getBytes());
        } catch (Throwable th) {
            C1321q.m1932a(th);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0065, code lost:
        if (com.apm.insight.p025k.C1291k.m1761a() != false) goto L_0x0054;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m1672i() {
        /*
            java.lang.Class<com.apm.insight.k.a> r0 = com.apm.insight.p025k.C1266a.class
            monitor-enter(r0)
            int r1 = f1220b     // Catch:{ all -> 0x006a }
            r2 = 1
            if (r1 <= 0) goto L_0x000d
            int r1 = f1220b     // Catch:{ all -> 0x006a }
            int r1 = r1 - r2
            f1220b = r1     // Catch:{ all -> 0x006a }
        L_0x000d:
            java.lang.String r1 = "try fetchApmConfig"
            com.apm.insight.p026l.C1321q.m1927a((java.lang.Object) r1)     // Catch:{ all -> 0x006a }
            android.content.Context r1 = com.apm.insight.C1250h.m1615g()     // Catch:{ all -> 0x006a }
            boolean r1 = com.apm.insight.p026l.C1295a.m1781b(r1)     // Catch:{ all -> 0x006a }
            r3 = 0
            if (r1 == 0) goto L_0x005e
            r1 = 0
            byte[] r4 = m1671h()     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x003b
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x0035 }
            java.lang.String r6 = new java.lang.String     // Catch:{ all -> 0x0035 }
            r6.<init>(r4)     // Catch:{ all -> 0x0035 }
            r5.<init>(r6)     // Catch:{ all -> 0x0035 }
            java.lang.String r4 = "data"
            org.json.JSONArray r1 = r5.optJSONArray(r4)     // Catch:{ all -> 0x0035 }
            goto L_0x003b
        L_0x0035:
            r4 = move-exception
            java.lang.String r5 = "npth"
            com.apm.insight.p026l.C1321q.m1931a((java.lang.String) r5, (java.lang.Throwable) r4)     // Catch:{ all -> 0x006a }
        L_0x003b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x006a }
            r4.<init>()     // Catch:{ all -> 0x006a }
            java.lang.String r5 = "after fetchApmConfig net "
            r4.append(r5)     // Catch:{ all -> 0x006a }
            r4.append(r1)     // Catch:{ all -> 0x006a }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x006a }
            com.apm.insight.p026l.C1321q.m1927a((java.lang.Object) r4)     // Catch:{ all -> 0x006a }
            if (r1 == 0) goto L_0x0057
            com.apm.insight.runtime.C1351a.m2096a((org.json.JSONArray) r1, (boolean) r2)     // Catch:{ all -> 0x006a }
        L_0x0054:
            f1220b = r3     // Catch:{ all -> 0x006a }
            goto L_0x0068
        L_0x0057:
            int r1 = f1220b     // Catch:{ all -> 0x006a }
            int r1 = r1 + -10
            f1220b = r1     // Catch:{ all -> 0x006a }
            goto L_0x0068
        L_0x005e:
            com.apm.insight.p025k.C1291k.m1764c()     // Catch:{ all -> 0x006a }
            boolean r1 = com.apm.insight.p025k.C1291k.m1761a()     // Catch:{ all -> 0x006a }
            if (r1 == 0) goto L_0x0068
            goto L_0x0054
        L_0x0068:
            monitor-exit(r0)
            return
        L_0x006a:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.p025k.C1266a.m1672i():void");
    }
}
