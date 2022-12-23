package com.bytedance.sdk.component.adexpress.p089a.p091b;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.p099c.C2626c;
import com.bytedance.sdk.component.adexpress.p089a.p092c.C2544a;
import com.bytedance.sdk.component.adexpress.p089a.p092c.C2546b;
import com.bytedance.sdk.component.adexpress.p089a.p092c.C2547c;
import com.bytedance.sdk.component.p123f.C2882e;
import com.bytedance.sdk.component.p123f.C2885g;
import com.bytedance.sdk.component.utils.C2894f;
import java.io.File;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.a.b.a */
/* compiled from: TTDynamic */
public class C2533a {

    /* renamed from: a */
    static Object f5343a = new Object();

    /* renamed from: a */
    public static void m6366a() {
        C2535b.m6377a();
        C2626c.m7022a().mo17112c();
    }

    /* renamed from: b */
    public static void m6371b() {
        try {
            C2543e.m6420d();
            File f = C2535b.m6383f();
            if (f != null && f.exists()) {
                if (f.getParentFile() != null) {
                    C2894f.m8086c(f.getParentFile());
                } else {
                    C2894f.m8086c(f);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m6368a(C2547c cVar) {
        C2541d.m6403a().mo16588a(cVar, cVar.f5391f);
    }

    /* renamed from: c */
    public static String m6373c() {
        return C2539c.m6395c();
    }

    /* renamed from: a */
    public static C2546b m6365a(String str) {
        return C2541d.m6403a().mo16587a(str);
    }

    /* renamed from: b */
    public static Set<String> m6370b(String str) {
        return C2541d.m6403a().mo16590b(str);
    }

    /* renamed from: c */
    public static C2546b m6372c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C2546b a = C2541d.m6403a().mo16587a(str);
        if (a != null) {
            a.mo16611a(Long.valueOf(System.currentTimeMillis()));
            m6367a(a);
        }
        return a;
    }

    /* renamed from: a */
    private static void m6367a(final C2546b bVar) {
        C2882e.m8036a(new C2885g("updateTmplTime") {
            public void run() {
                synchronized (C2533a.f5343a) {
                    C2539c.m6394a().mo16581a(bVar);
                }
            }
        }, 10);
    }

    /* renamed from: d */
    public static C2544a m6374d() {
        return C2535b.m6377a().mo16574d();
    }

    /* renamed from: e */
    public static String m6375e() {
        if (m6374d() == null) {
            return null;
        }
        return m6374d().mo16597c();
    }

    /* renamed from: f */
    public static boolean m6376f() {
        return C2535b.m6377a().mo16573c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005a, code lost:
        if (r2.mo16607b().equals(r6) != false) goto L_0x005d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005f A[SYNTHETIC, Splitter:B:18:0x005f] */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.webkit.WebResourceResponse m6364a(java.lang.String r4, com.bytedance.sdk.component.adexpress.p094c.C2573c.C2574a r5, java.lang.String r6) {
        /*
            boolean r0 = m6376f()
            r1 = 0
            if (r0 == 0) goto L_0x005c
            com.bytedance.sdk.component.adexpress.a.c.a r0 = m6374d()
            java.util.List r0 = r0.mo16601e()
            java.util.Iterator r0 = r0.iterator()
        L_0x0013:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x005c
            java.lang.Object r2 = r0.next()
            com.bytedance.sdk.component.adexpress.a.c.a$a r2 = (com.bytedance.sdk.component.adexpress.p089a.p092c.C2544a.C2545a) r2
            java.lang.String r3 = r2.mo16604a()
            if (r3 == 0) goto L_0x0013
            java.lang.String r3 = r2.mo16604a()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0013
            java.lang.String r4 = r2.mo16604a()
            java.lang.String r4 = com.bytedance.sdk.component.utils.C2893e.m8077a((java.lang.String) r4)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x003e
            goto L_0x003f
        L_0x003e:
            r6 = r4
        L_0x003f:
            java.io.File r4 = new java.io.File
            java.io.File r0 = com.bytedance.sdk.component.adexpress.p089a.p091b.C2535b.m6383f()
            r4.<init>(r0, r6)
            java.lang.String r6 = com.bytedance.sdk.component.utils.C2893e.m8076a((java.io.File) r4)
            java.lang.String r0 = r2.mo16607b()
            if (r0 == 0) goto L_0x005c
            java.lang.String r0 = r2.mo16607b()
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L_0x005d
        L_0x005c:
            r4 = r1
        L_0x005d:
            if (r4 == 0) goto L_0x0079
            android.webkit.WebResourceResponse r6 = new android.webkit.WebResourceResponse     // Catch:{ all -> 0x0071 }
            java.lang.String r5 = r5.mo16734a()     // Catch:{ all -> 0x0071 }
            java.lang.String r0 = "utf-8"
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0071 }
            r2.<init>(r4)     // Catch:{ all -> 0x0071 }
            r6.<init>(r5, r0, r2)     // Catch:{ all -> 0x0071 }
            r1 = r6
            goto L_0x0079
        L_0x0071:
            r4 = move-exception
            java.lang.String r5 = "TTDynamic"
            java.lang.String r6 = "get html WebResourceResponse error"
            com.bytedance.sdk.component.utils.C2905l.m8115c(r5, r6, r4)
        L_0x0079:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.p089a.p091b.C2533a.m6364a(java.lang.String, com.bytedance.sdk.component.adexpress.c.c$a, java.lang.String):android.webkit.WebResourceResponse");
    }

    /* renamed from: a */
    public static boolean m6369a(JSONObject jSONObject) {
        Object opt;
        if (jSONObject == null || (opt = jSONObject.opt("template_Plugin")) == null || TextUtils.isEmpty(opt.toString())) {
            return false;
        }
        return true;
    }
}
