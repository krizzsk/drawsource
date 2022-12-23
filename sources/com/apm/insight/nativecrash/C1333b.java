package com.apm.insight.nativecrash;

import android.content.Context;
import android.os.Environment;
import com.apm.insight.C1186b;
import com.apm.insight.C1250h;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashFilter;
import com.apm.insight.entity.C1227a;
import com.apm.insight.entity.C1231d;
import com.apm.insight.entity.Header;
import com.apm.insight.p017e.C1222a;
import com.apm.insight.p017e.p018a.C1223a;
import com.apm.insight.p026l.C1308i;
import com.apm.insight.p026l.C1310k;
import com.apm.insight.p026l.C1318o;
import com.apm.insight.p026l.C1323s;
import com.apm.insight.p026l.C1328w;
import com.apm.insight.runtime.C1395q;
import com.apm.insight.runtime.C1399s;
import com.facebook.internal.security.CertificateUtil;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.apm.insight.nativecrash.b */
public final class C1333b {

    /* renamed from: d */
    private static Boolean f1351d;

    /* renamed from: a */
    private final Context f1352a;

    /* renamed from: b */
    private JSONObject f1353b = null;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C1335b f1354c;

    /* renamed from: com.apm.insight.nativecrash.b$a */
    private static class C1334a {
        /* access modifiers changed from: private */
        /* renamed from: b */
        public static String m2067b(File file) {
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                try {
                    String readLine = bufferedReader2.readLine();
                    if (readLine == null) {
                        C1310k.m1852a((Closeable) bufferedReader2);
                        return "";
                    } else if (!readLine.startsWith("[FATAL:jni_android.cc") || !readLine.contains("Please include Java exception stack in crash report ttwebview:")) {
                        C1310k.m1852a((Closeable) bufferedReader2);
                        return "";
                    } else {
                        StringBuilder sb = new StringBuilder();
                        int indexOf = readLine.indexOf(" ttwebview:");
                        sb.append("Caused by: ");
                        sb.append("Please include Java exception stack in crash report");
                        sb.append("\n");
                        sb.append(readLine.substring(indexOf + 11));
                        while (true) {
                            sb.append("\n");
                            String readLine2 = bufferedReader2.readLine();
                            if (readLine2 != null) {
                                sb.append(readLine2);
                            } else {
                                String sb2 = sb.toString();
                                C1310k.m1852a((Closeable) bufferedReader2);
                                return sb2;
                            }
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    try {
                        C1186b.m1306a().mo12441a("NPTH_CATCH", th);
                        return "";
                    } finally {
                        C1310k.m1852a((Closeable) bufferedReader);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                C1186b.m1306a().mo12441a("NPTH_CATCH", th);
                return "";
            }
        }
    }

    /* renamed from: com.apm.insight.nativecrash.b$b */
    private class C1335b {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C1347d f1356b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final C1332a f1357c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final File f1358d;

        /* renamed from: e */
        private final File f1359e;

        public C1335b(File file) {
            this.f1358d = file;
            this.f1359e = C1318o.m1888a(C1250h.m1615g(), file.getName());
            this.f1357c = new C1332a(file);
            this.f1356b = new C1347d(file);
            if (this.f1357c.mo12599a() && this.f1356b.mo12623a() == null) {
                this.f1356b.mo12624a(file);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x001c A[Catch:{ all -> 0x0017 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo12614a() {
            /*
                r3 = this;
                com.apm.insight.nativecrash.a r0 = r3.f1357c
                java.util.Map r0 = r0.mo12601c()
                if (r0 == 0) goto L_0x0019
                boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x0017 }
                if (r1 != 0) goto L_0x0019
                java.lang.String r1 = "start_time"
                java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0017 }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0017 }
                goto L_0x001a
            L_0x0017:
                r0 = move-exception
                goto L_0x0021
            L_0x0019:
                r0 = 0
            L_0x001a:
                if (r0 == 0) goto L_0x002a
                long r0 = java.lang.Long.parseLong(r0)     // Catch:{ all -> 0x0017 }
                return r0
            L_0x0021:
                com.apm.insight.c r1 = com.apm.insight.C1186b.m1306a()
                java.lang.String r2 = "NPTH_CATCH"
                r1.mo12441a((java.lang.String) r2, (java.lang.Throwable) r0)
            L_0x002a:
                long r0 = java.lang.System.currentTimeMillis()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.nativecrash.C1333b.C1335b.mo12614a():long");
        }

        /* renamed from: b */
        public File mo12615b() {
            return this.f1358d;
        }

        /* renamed from: c */
        public boolean mo12616c() {
            return this.f1357c.mo12599a();
        }
    }

    /* renamed from: com.apm.insight.nativecrash.b$c */
    public class C1336c extends C1338e {
        C1336c() {
            super();
            this.f1363c = "Total FD Count:";
            this.f1362b = C1318o.m1915i(C1333b.this.f1354c.mo12615b());
            this.f1364d = CertificateUtil.DELIMITER;
            this.f1365e = -2;
        }
    }

    /* renamed from: com.apm.insight.nativecrash.b$d */
    public class C1337d extends C1338e {
        C1337d() {
            super();
            this.f1363c = "VmSize:";
            this.f1362b = C1318o.m1918k(C1333b.this.f1354c.mo12615b());
            this.f1364d = "\\s+";
            this.f1365e = -1;
        }
    }

    /* renamed from: com.apm.insight.nativecrash.b$e */
    public class C1338e {

        /* renamed from: b */
        protected File f1362b;

        /* renamed from: c */
        protected String f1363c;

        /* renamed from: d */
        protected String f1364d;

        /* renamed from: e */
        protected int f1365e;

        public C1338e() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0044 A[DONT_GENERATE] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo12617a() {
            /*
                r6 = this;
                java.io.File r0 = r6.f1362b
                boolean r0 = r0.exists()
                r1 = -1
                if (r0 == 0) goto L_0x0050
                java.io.File r0 = r6.f1362b
                boolean r0 = r0.isFile()
                if (r0 != 0) goto L_0x0012
                goto L_0x0050
            L_0x0012:
                r0 = 0
                java.io.FileReader r2 = new java.io.FileReader     // Catch:{ all -> 0x0035 }
                java.io.File r3 = r6.f1362b     // Catch:{ all -> 0x0035 }
                r2.<init>(r3)     // Catch:{ all -> 0x0035 }
                java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x0035 }
                r3.<init>(r2)     // Catch:{ all -> 0x0035 }
                r0 = r1
            L_0x0020:
                java.lang.String r2 = r3.readLine()     // Catch:{ all -> 0x0031 }
                if (r2 == 0) goto L_0x002d
                int r0 = r6.mo12618a(r2)     // Catch:{ all -> 0x0031 }
                if (r0 != r1) goto L_0x002d
                goto L_0x0020
            L_0x002d:
                com.apm.insight.p026l.C1310k.m1852a((java.io.Closeable) r3)
                goto L_0x0048
            L_0x0031:
                r1 = move-exception
                r2 = r0
                r0 = r3
                goto L_0x0039
            L_0x0035:
                r2 = move-exception
                r5 = r2
                r2 = r1
                r1 = r5
            L_0x0039:
                com.apm.insight.c r3 = com.apm.insight.C1186b.m1306a()     // Catch:{ all -> 0x0049 }
                java.lang.String r4 = "NPTH_CATCH"
                r3.mo12441a((java.lang.String) r4, (java.lang.Throwable) r1)     // Catch:{ all -> 0x0049 }
                if (r0 == 0) goto L_0x0047
                com.apm.insight.p026l.C1310k.m1852a((java.io.Closeable) r0)
            L_0x0047:
                r0 = r2
            L_0x0048:
                return r0
            L_0x0049:
                r1 = move-exception
                if (r0 == 0) goto L_0x004f
                com.apm.insight.p026l.C1310k.m1852a((java.io.Closeable) r0)
            L_0x004f:
                throw r1
            L_0x0050:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.nativecrash.C1333b.C1338e.mo12617a():int");
        }

        /* renamed from: a */
        public int mo12618a(String str) {
            int i = this.f1365e;
            if (!str.startsWith(this.f1363c)) {
                return i;
            }
            try {
                i = Integer.parseInt(str.split(this.f1364d)[1].trim());
            } catch (NumberFormatException e) {
                C1186b.m1306a().mo12441a("NPTH_CATCH", (Throwable) e);
            }
            if (i < 0) {
                return -2;
            }
            return i;
        }
    }

    /* renamed from: com.apm.insight.nativecrash.b$f */
    public class C1339f extends C1338e {
        C1339f() {
            super();
            this.f1363c = "Total Threads Count:";
            this.f1362b = C1318o.m1916j(C1333b.this.f1354c.mo12615b());
            this.f1364d = CertificateUtil.DELIMITER;
            this.f1365e = -2;
        }
    }

    public C1333b(Context context) {
        this.f1352a = context;
    }

    /* renamed from: a */
    private String m2038a(String str) {
        StringBuilder sb = new StringBuilder();
        try {
            if (str.length() < 16) {
                sb.append(str);
            } else {
                sb.append(str.charAt(6));
                sb.append(str.charAt(7));
                sb.append(str.charAt(4));
                sb.append(str.charAt(5));
                sb.append(str.charAt(2));
                sb.append(str.charAt(3));
                sb.append(str.charAt(0));
                sb.append(str.charAt(1));
                sb.append(str.charAt(10));
                sb.append(str.charAt(11));
                sb.append(str.charAt(8));
                sb.append(str.charAt(9));
                sb.append(str.charAt(14));
                sb.append(str.charAt(15));
                sb.append(str.charAt(12));
                sb.append(str.charAt(13));
                if (str.length() >= 32) {
                    sb.append(str, 16, 32);
                    sb.append('0');
                }
            }
        } catch (Throwable th) {
            C1186b.m1306a().mo12441a("NPTH_CATCH", th);
        }
        return sb.toString().toUpperCase();
    }

    /* renamed from: a */
    private void m2039a(C1227a aVar) {
        aVar.mo12467a(m2050n());
        aVar.mo12474a("is_native_crash", (Object) 1);
        aVar.mo12474a("repack_time", (Object) Long.valueOf(System.currentTimeMillis()));
        aVar.mo12474a("crash_uuid", (Object) this.f1354c.mo12615b().getName());
        aVar.mo12474a("jiffy", (Object) Long.valueOf(C1395q.C1396a.m2324a()));
    }

    /* renamed from: a */
    private void m2040a(Map<String, String> map) {
        String str = "true";
        map.put("has_fds_file", C1318o.m1915i(this.f1354c.mo12615b()).exists() ? str : "false");
        File h = C1318o.m1913h(this.f1354c.mo12615b());
        map.put("has_logcat_file", (!h.exists() || h.length() <= 128) ? "false" : str);
        map.put("has_maps_file", C1318o.m1901d(this.f1354c.mo12615b()).exists() ? str : "false");
        map.put("has_tombstone_file", C1318o.m1893b(this.f1354c.mo12615b()).exists() ? str : "false");
        map.put("has_meminfo_file", C1318o.m1918k(this.f1354c.mo12615b()).exists() ? str : "false");
        if (!C1318o.m1916j(this.f1354c.mo12615b()).exists()) {
            str = "false";
        }
        map.put("has_threads_file", str);
    }

    /* renamed from: b */
    private void m2041b(C1227a aVar) {
        C1231d.m1516b(aVar.mo12488h());
        HashMap hashMap = new HashMap();
        if (m2049m()) {
            hashMap.put("is_root", "true");
            aVar.mo12474a("is_root", (Object) "true");
        } else {
            hashMap.put("is_root", "false");
            aVar.mo12474a("is_root", (Object) "false");
        }
        m2040a((Map<String, String>) hashMap);
        int o = m2051o();
        if (o > 0) {
            if (o > 960) {
                hashMap.put("fd_leak", "true");
            } else {
                hashMap.put("fd_leak", "false");
            }
            aVar.mo12474a("fd_count", (Object) Integer.valueOf(o));
        }
        int p = m2052p();
        if (p > 0) {
            if (p > 350) {
                hashMap.put("threads_leak", "true");
            } else {
                hashMap.put("threads_leak", "false");
            }
            aVar.mo12474a("threads_count", (Object) Integer.valueOf(p));
        }
        int q = m2053q();
        if (q > 0) {
            if (((long) q) > m2048i()) {
                hashMap.put("memory_leak", "true");
            } else {
                hashMap.put("memory_leak", "false");
            }
            aVar.mo12474a("memory_size", (Object) Integer.valueOf(q));
        }
        hashMap.put("sdk_version", "1.3.8.nourl-alpha.0");
        hashMap.put("has_java_stack", String.valueOf(aVar.mo12488h().opt("java_data") != null));
        JSONArray a = C1340c.m2077a(C1318o.m1919l(this.f1354c.f1358d), C1318o.m1920m(this.f1354c.f1358d));
        hashMap.put("leak_threads_count", String.valueOf(a.length()));
        if (a.length() > 0) {
            try {
                C1308i.m1828a(C1318o.m1921n(this.f1354c.f1358d), a, false);
            } catch (Throwable unused) {
            }
        }
        aVar.mo12479b();
        aVar.mo12481c();
        aVar.mo12480c((Map<? extends String, ? extends String>) hashMap);
    }

    /* renamed from: c */
    private void m2042c(C1227a aVar) {
        Map<String, String> b = this.f1354c.f1356b.mo12625b();
        if (!b.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            for (String next : b.keySet()) {
                String a = m2038a(b.get(next));
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("lib_name", next);
                    jSONObject.put("lib_uuid", a);
                    jSONArray.put(jSONObject);
                } catch (JSONException e) {
                    C1186b.m1306a().mo12441a("NPTH_CATCH", (Throwable) e);
                }
            }
            aVar.mo12474a("crash_lib_uuid", (Object) jSONArray);
        }
    }

    /* renamed from: d */
    private void m2043d(C1227a aVar) {
        File e = C1318o.m1904e(this.f1354c.mo12615b());
        if (e.exists() || this.f1353b != null) {
            try {
                aVar.mo12482c(this.f1353b == null ? new JSONObject(C1308i.m1842c(e.getAbsolutePath())) : this.f1353b);
                aVar.mo12469a("has_callback", "true");
                if (aVar.mo12488h().opt("storage") == null) {
                    aVar.mo12478b(C1328w.m1985a(C1250h.m1615g()));
                }
                C1323s.m1941a(aVar, aVar.mo12489i(), CrashType.NATIVE);
            } catch (Throwable th) {
                C1186b.m1306a().mo12441a("NPTH_CATCH", th);
            }
            long j = -1;
            long optLong = aVar.mo12488h().optLong("crash_time", -1);
            long optLong2 = aVar.mo12488h().optLong("java_end", -1);
            if (!(optLong2 == -1 || optLong == -1)) {
                j = optLong2 - optLong;
            }
            try {
                aVar.mo12476b("total_cost", String.valueOf(j));
                aVar.mo12469a("total_cost", String.valueOf(j / 1000));
            } catch (Throwable unused) {
            }
        } else {
            aVar.mo12478b(C1328w.m1985a(C1250h.m1615g()));
            aVar.mo12469a("has_callback", "false");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005b A[Catch:{ all -> 0x0061 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0035  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2044e(com.apm.insight.entity.C1227a r5) {
        /*
            r4 = this;
            com.apm.insight.nativecrash.b$b r0 = r4.f1354c
            java.io.File r0 = r0.mo12615b()
            java.io.File r0 = com.apm.insight.p026l.C1318o.m1910g((java.io.File) r0)
            boolean r1 = r0.exists()
            java.lang.String r2 = "NPTH_CATCH"
            if (r1 == 0) goto L_0x0023
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x001b }
            java.lang.String r0 = com.apm.insight.p026l.C1326v.m1959a((java.lang.String) r0)     // Catch:{ all -> 0x001b }
            goto L_0x0025
        L_0x001b:
            r0 = move-exception
            com.apm.insight.c r1 = com.apm.insight.C1186b.m1306a()
            r1.mo12441a((java.lang.String) r2, (java.lang.Throwable) r0)
        L_0x0023:
            java.lang.String r0 = ""
        L_0x0025:
            com.apm.insight.nativecrash.b$b r1 = r4.f1354c
            java.io.File r1 = r1.mo12615b()
            java.io.File r1 = com.apm.insight.p026l.C1318o.m1922o(r1)
            boolean r3 = r1.exists()
            if (r3 == 0) goto L_0x0055
            java.lang.String r1 = com.apm.insight.nativecrash.C1333b.C1334a.m2067b(r1)
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L_0x0054
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = "\n"
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            goto L_0x0055
        L_0x0054:
            r0 = r1
        L_0x0055:
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x0061 }
            if (r1 != 0) goto L_0x0069
            java.lang.String r1 = "java_data"
            r5.mo12474a((java.lang.String) r1, (java.lang.Object) r0)     // Catch:{ all -> 0x0061 }
            goto L_0x0069
        L_0x0061:
            r5 = move-exception
            com.apm.insight.c r0 = com.apm.insight.C1186b.m1306a()
            r0.mo12441a((java.lang.String) r2, (java.lang.Throwable) r5)
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.nativecrash.C1333b.m2044e(com.apm.insight.entity.a):void");
    }

    /* renamed from: f */
    private void m2045f(C1227a aVar) {
        File a = C1318o.m1889a(this.f1354c.mo12615b());
        if (a.exists()) {
            try {
                aVar.mo12474a("native_log", (Object) C1308i.m1838b(C1308i.m1823a(a.getAbsolutePath(), "\n"), "\n"));
            } catch (Throwable th) {
                C1186b.m1306a().mo12441a("NPTH_CATCH", th);
            }
        }
    }

    /* renamed from: g */
    private void m2046g(C1227a aVar) {
        File h = C1318o.m1913h(this.f1354c.mo12615b());
        if (!h.exists()) {
            NativeImpl.m2007a(h.getAbsolutePath(), String.valueOf(C1250h.m1617i().getLogcatDumpCount()), String.valueOf(C1250h.m1617i().getLogcatLevel()));
        }
        BufferedReader bufferedReader = null;
        JSONArray jSONArray = new JSONArray();
        String str = " " + this.f1354c.f1357c.mo12601c().get("pid") + " ";
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(h));
            try {
                if (h.length() > 512000) {
                    bufferedReader2.skip(h.length() - 512000);
                }
                while (true) {
                    String readLine = bufferedReader2.readLine();
                    if (readLine == null) {
                        break;
                    }
                    if ((readLine.length() > 32 ? readLine.substring(0, 31) : readLine).contains(str)) {
                        jSONArray.put(readLine);
                    }
                }
                C1310k.m1852a((Closeable) bufferedReader2);
            } catch (Throwable unused) {
                bufferedReader = bufferedReader2;
                C1310k.m1852a((Closeable) bufferedReader);
                aVar.mo12474a("logcat", (Object) jSONArray);
            }
        } catch (Throwable unused2) {
            C1310k.m1852a((Closeable) bufferedReader);
            aVar.mo12474a("logcat", (Object) jSONArray);
        }
        aVar.mo12474a("logcat", (Object) jSONArray);
    }

    /* renamed from: h */
    private void m2047h(C1227a aVar) {
        Map<String, String> a = mo12602a();
        if (a != null && aVar != null) {
            String str = a.get("process_name");
            if (str != null) {
                aVar.mo12474a("process_name", (Object) str);
            }
            String str2 = a.get("start_time");
            if (str2 != null) {
                try {
                    aVar.mo12466a(Long.decode(str2).longValue());
                } catch (Throwable th) {
                    C1186b.m1306a().mo12441a("NPTH_CATCH", th);
                }
            }
            String str3 = a.get("pid");
            if (str3 != null) {
                try {
                    aVar.mo12474a("pid", (Object) Long.decode(str3));
                } catch (Throwable th2) {
                    C1186b.m1306a().mo12441a("NPTH_CATCH", th2);
                }
            }
            String str4 = a.get("crash_thread_name");
            if (str4 != null) {
                aVar.mo12474a("crash_thread_name", (Object) str4);
            }
            String str5 = a.get("crash_time");
            if (str5 != null) {
                try {
                    aVar.mo12474a("crash_time", (Object) Long.decode(str5));
                } catch (Throwable th3) {
                    C1186b.m1306a().mo12441a("NPTH_CATCH", th3);
                }
            }
            aVar.mo12474a("data", (Object) mo12604b());
        }
    }

    /* renamed from: i */
    public static long m2048i() {
        if (NativeImpl.m2022e()) {
            return Long.MAX_VALUE;
        }
        return Header.m1443a() ? 3891200 : 2867200;
    }

    /* renamed from: m */
    public static boolean m2049m() {
        Boolean bool = f1351d;
        if (bool != null) {
            return bool.booleanValue();
        }
        String[] strArr = {"/data/local/su", "/data/local/bin/su", "/data/local/xbin/su", "/system/xbin/su", "/system/bin/su", "/system/bin/.ext/su", "/system/bin/failsafe/su", "/system/sd/xbin/su", "/system/usr/we-need-root/su", "/sbin/su", "/su/bin/su"};
        int i = 0;
        while (i < 11) {
            try {
                if (new File(strArr[i]).exists()) {
                    Boolean bool2 = true;
                    f1351d = bool2;
                    return bool2.booleanValue();
                }
                i++;
            } catch (Throwable th) {
                C1186b.m1306a().mo12441a("NPTH_CATCH", th);
            }
        }
        Boolean bool3 = false;
        f1351d = bool3;
        return bool3.booleanValue();
    }

    /* renamed from: n */
    private Header m2050n() {
        Header header = new Header(this.f1352a);
        JSONObject a = C1399s.m2333a().mo12737a(this.f1354c.mo12614a());
        if (a != null) {
            header.mo12460a(a);
            header.mo12462d();
            header.mo12463e();
        }
        Header.m1445b(header);
        return header;
    }

    /* renamed from: o */
    private int m2051o() {
        return new C1336c().mo12617a();
    }

    /* renamed from: p */
    private int m2052p() {
        return new C1339f().mo12617a();
    }

    /* renamed from: q */
    private int m2053q() {
        return new C1337d().mo12617a();
    }

    /* renamed from: a */
    public Map<String, String> mo12602a() {
        C1335b bVar = this.f1354c;
        if (bVar != null) {
            return bVar.f1357c.mo12601c();
        }
        return null;
    }

    /* renamed from: a */
    public void mo12603a(File file) {
        this.f1354c = new C1335b(file);
    }

    /* renamed from: b */
    public String mo12604b() {
        C1335b bVar = this.f1354c;
        if (bVar == null) {
            return null;
        }
        String c = bVar.f1356b.mo12626c();
        return (c == null || c.isEmpty()) ? this.f1354c.f1357c.mo12600b() : c;
    }

    /* renamed from: c */
    public boolean mo12605c() {
        C1335b bVar = this.f1354c;
        if (bVar != null) {
            return bVar.mo12616c();
        }
        return false;
    }

    /* renamed from: d */
    public JSONObject mo12606d() {
        File f = C1318o.m1907f(this.f1354c.mo12615b());
        if (!f.exists()) {
            return null;
        }
        try {
            String c = C1308i.m1842c(f.getAbsolutePath());
            if (c != null && !c.isEmpty()) {
                return new JSONObject(c);
            }
        } catch (Throwable th) {
            C1186b.m1306a().mo12441a("NPTH_CATCH", th);
        }
        return null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:13|(4:16|(1:52)(3:18|19|(2:21|53)(1:51))|25|14)|49|26|27|28|(1:32)|33|34|(2:36|(3:(4:40|(2:42|55)(1:56)|43|38)|54|61)(1:59))(1:58)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00d2 */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d8 A[Catch:{ IOException -> 0x0110 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12607e() {
        /*
            r10 = this;
            java.lang.String r0 = "NPTH_CATCH"
            com.apm.insight.nativecrash.b$b r1 = r10.f1354c     // Catch:{ IOException -> 0x0110 }
            java.io.File r1 = r1.mo12615b()     // Catch:{ IOException -> 0x0110 }
            java.io.File r1 = com.apm.insight.p026l.C1318o.m1904e((java.io.File) r1)     // Catch:{ IOException -> 0x0110 }
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x0110 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0110 }
            r3.<init>()     // Catch:{ IOException -> 0x0110 }
            java.lang.String r4 = r1.getAbsolutePath()     // Catch:{ IOException -> 0x0110 }
            r3.append(r4)     // Catch:{ IOException -> 0x0110 }
            java.lang.String r4 = ".tmp'"
            r3.append(r4)     // Catch:{ IOException -> 0x0110 }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x0110 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0110 }
            boolean r3 = r2.exists()     // Catch:{ IOException -> 0x0110 }
            if (r3 == 0) goto L_0x002f
            r2.delete()     // Catch:{ IOException -> 0x0110 }
        L_0x002f:
            boolean r3 = r1.exists()     // Catch:{ IOException -> 0x0110 }
            r4 = 46
            r5 = 0
            if (r3 == 0) goto L_0x0065
        L_0x0038:
            int r2 = com.apm.insight.nativecrash.NativeCrashCollector.m1995a()     // Catch:{ IOException -> 0x0110 }
            if (r5 >= r2) goto L_0x0118
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x0110 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0110 }
            r3.<init>()     // Catch:{ IOException -> 0x0110 }
            java.lang.String r6 = r1.getAbsolutePath()     // Catch:{ IOException -> 0x0110 }
            r3.append(r6)     // Catch:{ IOException -> 0x0110 }
            r3.append(r4)     // Catch:{ IOException -> 0x0110 }
            r3.append(r5)     // Catch:{ IOException -> 0x0110 }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x0110 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0110 }
            boolean r3 = r2.exists()     // Catch:{ IOException -> 0x0110 }
            if (r3 == 0) goto L_0x0062
            r2.delete()     // Catch:{ IOException -> 0x0110 }
        L_0x0062:
            int r5 = r5 + 1
            goto L_0x0038
        L_0x0065:
            com.apm.insight.entity.a r3 = new com.apm.insight.entity.a     // Catch:{ IOException -> 0x0110 }
            r3.<init>()     // Catch:{ IOException -> 0x0110 }
            r6 = r5
        L_0x006b:
            int r7 = com.apm.insight.nativecrash.NativeCrashCollector.m1995a()     // Catch:{ IOException -> 0x0110 }
            if (r6 >= r7) goto L_0x00b5
            java.io.File r7 = new java.io.File     // Catch:{ IOException -> 0x0110 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0110 }
            r8.<init>()     // Catch:{ IOException -> 0x0110 }
            java.lang.String r9 = r1.getAbsolutePath()     // Catch:{ IOException -> 0x0110 }
            r8.append(r9)     // Catch:{ IOException -> 0x0110 }
            r8.append(r4)     // Catch:{ IOException -> 0x0110 }
            r8.append(r6)     // Catch:{ IOException -> 0x0110 }
            java.lang.String r8 = r8.toString()     // Catch:{ IOException -> 0x0110 }
            r7.<init>(r8)     // Catch:{ IOException -> 0x0110 }
            boolean r8 = r7.exists()     // Catch:{ IOException -> 0x0110 }
            if (r8 != 0) goto L_0x0093
            goto L_0x00b2
        L_0x0093:
            java.lang.String r7 = r7.getAbsolutePath()     // Catch:{ JSONException -> 0x00aa }
            java.lang.String r7 = com.apm.insight.p026l.C1308i.m1842c((java.lang.String) r7)     // Catch:{ JSONException -> 0x00aa }
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00aa }
            r8.<init>(r7)     // Catch:{ JSONException -> 0x00aa }
            int r7 = r8.length()     // Catch:{ JSONException -> 0x00aa }
            if (r7 <= 0) goto L_0x00b2
            r3.mo12482c((org.json.JSONObject) r8)     // Catch:{ JSONException -> 0x00aa }
            goto L_0x00b2
        L_0x00aa:
            r7 = move-exception
            com.apm.insight.c r8 = com.apm.insight.C1186b.m1306a()     // Catch:{ IOException -> 0x0110 }
            r8.mo12441a((java.lang.String) r0, (java.lang.Throwable) r7)     // Catch:{ IOException -> 0x0110 }
        L_0x00b2:
            int r6 = r6 + 1
            goto L_0x006b
        L_0x00b5:
            org.json.JSONObject r3 = r3.mo12488h()     // Catch:{ IOException -> 0x0110 }
            int r6 = r3.length()     // Catch:{ all -> 0x00d2 }
            if (r6 == 0) goto L_0x00d2
            java.lang.String r6 = "storage"
            java.lang.Object r6 = r3.opt(r6)     // Catch:{ all -> 0x00d2 }
            if (r6 != 0) goto L_0x00d2
            android.content.Context r6 = com.apm.insight.C1250h.m1615g()     // Catch:{ all -> 0x00d2 }
            org.json.JSONObject r6 = com.apm.insight.p026l.C1328w.m1985a((android.content.Context) r6)     // Catch:{ all -> 0x00d2 }
            com.apm.insight.entity.C1227a.m1469a((org.json.JSONObject) r3, (org.json.JSONObject) r6)     // Catch:{ all -> 0x00d2 }
        L_0x00d2:
            int r6 = r3.length()     // Catch:{ IOException -> 0x0110 }
            if (r6 == 0) goto L_0x0118
            r10.f1353b = r3     // Catch:{ IOException -> 0x0110 }
            com.apm.insight.p026l.C1308i.m1839b(r2, r3, r5)     // Catch:{ IOException -> 0x0110 }
            boolean r2 = r2.renameTo(r1)     // Catch:{ IOException -> 0x0110 }
            if (r2 == 0) goto L_0x0118
        L_0x00e3:
            int r2 = com.apm.insight.nativecrash.NativeCrashCollector.m1995a()     // Catch:{ IOException -> 0x0110 }
            if (r5 >= r2) goto L_0x0118
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x0110 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0110 }
            r3.<init>()     // Catch:{ IOException -> 0x0110 }
            java.lang.String r6 = r1.getAbsolutePath()     // Catch:{ IOException -> 0x0110 }
            r3.append(r6)     // Catch:{ IOException -> 0x0110 }
            r3.append(r4)     // Catch:{ IOException -> 0x0110 }
            r3.append(r5)     // Catch:{ IOException -> 0x0110 }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x0110 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0110 }
            boolean r3 = r2.exists()     // Catch:{ IOException -> 0x0110 }
            if (r3 == 0) goto L_0x010d
            r2.delete()     // Catch:{ IOException -> 0x0110 }
        L_0x010d:
            int r5 = r5 + 1
            goto L_0x00e3
        L_0x0110:
            r1 = move-exception
            com.apm.insight.c r2 = com.apm.insight.C1186b.m1306a()
            r2.mo12441a((java.lang.String) r0, (java.lang.Throwable) r1)
        L_0x0118:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.nativecrash.C1333b.mo12607e():void");
    }

    /* renamed from: f */
    public boolean mo12608f() {
        ICrashFilter b = C1250h.m1609b().mo12394b();
        if (b == null) {
            return true;
        }
        try {
            return b.onNativeCrashFilter(mo12604b(), "");
        } catch (Throwable th) {
            C1186b.m1306a().mo12441a("NPTH_CATCH", th);
            return true;
        }
    }

    /* renamed from: g */
    public boolean mo12609g() {
        return C1222a.m1424a().mo12449a(C1318o.m1907f(this.f1354c.mo12615b()).getAbsolutePath());
    }

    /* renamed from: h */
    public void mo12610h() {
        C1222a.m1424a().mo12448a(C1223a.m1429a(C1318o.m1907f(this.f1354c.mo12615b()).getAbsolutePath()));
    }

    /* renamed from: j */
    public JSONObject mo12611j() {
        try {
            C1227a aVar = new C1227a();
            m2039a(aVar);
            m2047h(aVar);
            m2042c(aVar);
            m2043d(aVar);
            m2044e(aVar);
            m2046g(aVar);
            m2045f(aVar);
            m2041b(aVar);
            File f = C1318o.m1907f(this.f1354c.mo12615b());
            JSONObject h = aVar.mo12488h();
            C1308i.m1829a(f, h, false);
            return h;
        } catch (Throwable th) {
            C1186b.m1306a().mo12441a("NPTH_CATCH", th);
            return null;
        }
    }

    /* renamed from: k */
    public boolean mo12612k() {
        return C1308i.m1834a(this.f1354c.mo12615b());
    }

    /* renamed from: l */
    public void mo12613l() {
        try {
            String absolutePath = this.f1354c.mo12615b().getAbsolutePath();
            C1308i.m1843c(absolutePath, Environment.getExternalStorageDirectory().getAbsolutePath() + "/" + "localDebug" + "/" + C1250h.m1615g().getPackageName() + "/" + this.f1354c.mo12615b().getName() + ".zip");
        } catch (Throwable th) {
            C1186b.m1306a().mo12441a("NPTH_CATCH", th);
        }
    }
}
