package com.apm.insight.p022h;

import com.apm.insight.C1186b;
import com.apm.insight.C1250h;
import com.apm.insight.p026l.C1308i;
import com.apm.insight.p026l.C1321q;
import com.apm.insight.runtime.C1394p;
import com.apm.insight.runtime.C1397r;
import java.io.File;
import java.util.HashMap;

/* renamed from: com.apm.insight.h.b */
public class C1253b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static HashMap<String, String> f1196a;

    /* renamed from: a */
    public static String m1633a() {
        return C1250h.m1615g().getFilesDir() + "/apminsight/selflib/";
    }

    /* renamed from: a */
    public static String m1634a(String str) {
        return C1250h.m1615g().getFilesDir() + "/apminsight/selflib/" + "lib" + str + ".so";
    }

    /* renamed from: b */
    public static void m1636b(final String str) {
        C1394p.m2321b().mo12749a((Runnable) new Runnable() {

            /* renamed from: a */
            boolean f1197a = false;

            public void run() {
                String str;
                String str2;
                C1253b.m1640d();
                if (!C1253b.m1642f(str)) {
                    C1397r.m2331a("updateSo", str);
                    File file = new File(C1253b.m1634a(str));
                    file.getParentFile().mkdirs();
                    if (file.exists()) {
                        file.delete();
                    }
                    C1321q.m1928a("doUnpackLibrary: " + str);
                    String str3 = null;
                    try {
                        str3 = C1255c.m1643a(C1250h.m1615g(), str, file);
                    } catch (Throwable th) {
                        C1397r.m2331a("updateSoError", str);
                        C1186b.m1306a().mo12441a("NPTH_CATCH", th);
                    }
                    if (str3 == null) {
                        C1253b.f1196a.put(file.getName(), "1.3.8.nourl-alpha.0");
                        try {
                            C1308i.m1826a(new File(C1253b.m1641e(str)), "1.3.8.nourl-alpha.0", false);
                        } catch (Throwable unused) {
                        }
                        str2 = str;
                        str = "updateSoSuccess";
                    } else if (!this.f1197a) {
                        this.f1197a = true;
                        C1397r.m2331a("updateSoPostRetry", str);
                        C1394p.m2321b().mo12750a((Runnable) this, 3000);
                        return;
                    } else {
                        str2 = str;
                        str = "updateSoFailed";
                    }
                    C1397r.m2331a(str, str2);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m1640d() {
        if (f1196a == null) {
            f1196a = new HashMap<>();
            File file = new File(C1250h.m1615g().getFilesDir(), "/apminsight/selflib/");
            String[] list = file.list();
            if (list != null) {
                for (String str : list) {
                    if (str.endsWith(".ver")) {
                        try {
                            f1196a.put(str.substring(0, str.length() - 4), C1308i.m1842c(file.getAbsolutePath() + "/" + str));
                        } catch (Throwable th) {
                            C1186b.m1306a().mo12441a("NPTH_CATCH", th);
                        }
                    } else if (!str.endsWith(".so")) {
                        C1308i.m1834a(new File(file, str));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static String m1641e(String str) {
        return C1250h.m1615g().getFilesDir() + "/apminsight/selflib/" + str + ".ver";
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static boolean m1642f(String str) {
        return "1.3.8.nourl-alpha.0".equals(f1196a.get(str)) && new File(m1634a(str)).exists();
    }
}
