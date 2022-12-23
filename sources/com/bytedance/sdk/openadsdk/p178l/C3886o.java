package com.bytedance.sdk.openadsdk.p178l;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.component.p123f.C2882e;
import com.bytedance.sdk.component.p123f.C2884f;
import com.bytedance.sdk.component.p123f.C2885g;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.openadsdk.core.C3457h;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.multipro.C3948b;
import com.bytedance.sdk.openadsdk.multipro.p184d.C3961a;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.sdk.openadsdk.l.o */
/* compiled from: RomUtils */
public class C3886o {

    /* renamed from: a */
    public static boolean f9944a = false;

    /* renamed from: b */
    public static boolean f9945b = false;

    /* renamed from: c */
    private static final CharSequence f9946c = "sony";

    /* renamed from: d */
    private static final CharSequence f9947d = "amigo";

    /* renamed from: e */
    private static final CharSequence f9948e = "funtouch";

    /* renamed from: f */
    private static String f9949f = null;

    /* renamed from: g */
    private static int f9950g = Integer.MAX_VALUE;

    /* renamed from: a */
    public static String m12676a() {
        if (!TextUtils.isEmpty(f9949f)) {
            return f9949f;
        }
        String a = C3457h.m10577a("sdk_local_rom_info", 604800000);
        f9949f = a;
        if (TextUtils.isEmpty(a)) {
            String u = m12700u();
            f9949f = u;
            C3457h.m10579a("sdk_local_rom_info", u);
        }
        return f9949f;
    }

    /* renamed from: a */
    public static boolean m12677a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = m12693n();
        }
        return (!TextUtils.isEmpty(str) && str.toLowerCase().startsWith("emotionui")) || m12699t();
    }

    /* renamed from: b */
    public static boolean m12679b() {
        return Build.DISPLAY.contains("Flyme") || Build.USER.equals("flyme");
    }

    /* renamed from: c */
    public static String m12680c() {
        return m12682d("ro.build.uiversion") + "_" + Build.DISPLAY;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        r5 = null;
        r3 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0073, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045 A[ExcHandler: all (r4v1 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0007] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005e A[SYNTHETIC, Splitter:B:21:0x005e] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0079 A[SYNTHETIC, Splitter:B:39:0x0079] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m12681c(java.lang.String r8) {
        /*
            java.lang.String r0 = "Exception while closing InputStream"
            java.lang.String r1 = "ToolUtils"
            java.lang.String r2 = ""
            r3 = 0
            java.lang.Runtime r4 = java.lang.Runtime.getRuntime()     // Catch:{ IllegalThreadStateException -> 0x0073, all -> 0x0045 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IllegalThreadStateException -> 0x0073, all -> 0x0045 }
            r5.<init>()     // Catch:{ IllegalThreadStateException -> 0x0073, all -> 0x0045 }
            java.lang.String r6 = "getprop "
            r5.append(r6)     // Catch:{ IllegalThreadStateException -> 0x0073, all -> 0x0045 }
            r5.append(r8)     // Catch:{ IllegalThreadStateException -> 0x0073, all -> 0x0045 }
            java.lang.String r5 = r5.toString()     // Catch:{ IllegalThreadStateException -> 0x0073, all -> 0x0045 }
            java.lang.Process r4 = r4.exec(r5)     // Catch:{ IllegalThreadStateException -> 0x0073, all -> 0x0045 }
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ IllegalThreadStateException -> 0x0042, all -> 0x0045 }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ IllegalThreadStateException -> 0x0042, all -> 0x0045 }
            java.io.InputStream r7 = r4.getInputStream()     // Catch:{ IllegalThreadStateException -> 0x0042, all -> 0x0045 }
            r6.<init>(r7)     // Catch:{ IllegalThreadStateException -> 0x0042, all -> 0x0045 }
            r7 = 1024(0x400, float:1.435E-42)
            r5.<init>(r6, r7)     // Catch:{ IllegalThreadStateException -> 0x0042, all -> 0x0045 }
            java.lang.String r2 = r5.readLine()     // Catch:{ IllegalThreadStateException -> 0x0043, all -> 0x0040 }
            r4.exitValue()     // Catch:{ IllegalThreadStateException -> 0x0043, all -> 0x0040 }
            r5.close()     // Catch:{ IOException -> 0x003b }
            goto L_0x007c
        L_0x003b:
            r8 = move-exception
            com.bytedance.sdk.component.utils.C2905l.m8115c(r1, r0, r8)
            goto L_0x007c
        L_0x0040:
            r3 = move-exception
            goto L_0x0048
        L_0x0042:
            r5 = r3
        L_0x0043:
            r3 = r4
            goto L_0x0074
        L_0x0045:
            r4 = move-exception
            r5 = r3
            r3 = r4
        L_0x0048:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0067 }
            r4.<init>()     // Catch:{ all -> 0x0067 }
            java.lang.String r6 = "Unable to read sysprop "
            r4.append(r6)     // Catch:{ all -> 0x0067 }
            r4.append(r8)     // Catch:{ all -> 0x0067 }
            java.lang.String r8 = r4.toString()     // Catch:{ all -> 0x0067 }
            com.bytedance.sdk.component.utils.C2905l.m8115c(r1, r8, r3)     // Catch:{ all -> 0x0067 }
            if (r5 == 0) goto L_0x0066
            r5.close()     // Catch:{ IOException -> 0x0062 }
            goto L_0x0066
        L_0x0062:
            r8 = move-exception
            com.bytedance.sdk.component.utils.C2905l.m8115c(r1, r0, r8)
        L_0x0066:
            return r2
        L_0x0067:
            r8 = move-exception
            if (r5 == 0) goto L_0x0072
            r5.close()     // Catch:{ IOException -> 0x006e }
            goto L_0x0072
        L_0x006e:
            r2 = move-exception
            com.bytedance.sdk.component.utils.C2905l.m8115c(r1, r0, r2)
        L_0x0072:
            throw r8
        L_0x0073:
            r5 = r3
        L_0x0074:
            r3.destroy()     // Catch:{ all -> 0x0077 }
        L_0x0077:
            if (r5 == 0) goto L_0x007c
            r5.close()     // Catch:{ IOException -> 0x003b }
        L_0x007c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.p178l.C3886o.m12681c(java.lang.String):java.lang.String");
    }

    /* renamed from: d */
    private static String m12682d(String str) {
        String str2;
        try {
            str2 = m12701v();
            try {
                if (TextUtils.isEmpty(str2)) {
                    final C2884f fVar = new C2884f(new C3888a(str), 5, 2);
                    C2882e.m8036a(new C2885g("_getSystemPropertyTask") {
                        public void run() {
                            fVar.run();
                        }
                    }, 5);
                    str2 = (String) fVar.get(1, TimeUnit.SECONDS);
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            str2 = "";
        }
        return str2 == null ? "" : str2;
    }

    /* renamed from: d */
    public static boolean m12683d() {
        String str = Build.MANUFACTURER + Build.BRAND;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        return lowerCase.contains("360") || lowerCase.contains("qiku");
    }

    /* renamed from: e */
    public static boolean m12684e() {
        if (!f9945b) {
            try {
                if (Class.forName("miui.os.Build") != null) {
                    f9944a = true;
                    f9945b = true;
                    return true;
                }
            } catch (Exception unused) {
            }
            f9945b = true;
        }
        return f9944a;
    }

    /* renamed from: f */
    public static String m12685f() {
        return m12682d("ro.vivo.os.build.display.id") + "_" + m12682d("ro.vivo.product.version");
    }

    /* renamed from: g */
    public static boolean m12686g() {
        String d = m12682d("ro.vivo.os.build.display.id");
        return !TextUtils.isEmpty(d) && d.toLowerCase().contains(f9948e);
    }

    /* renamed from: h */
    public static boolean m12687h() {
        return !TextUtils.isEmpty(Build.DISPLAY) && Build.DISPLAY.toLowerCase().contains(f9947d);
    }

    /* renamed from: i */
    public static String m12688i() {
        return Build.DISPLAY + "_" + m12682d("ro.gn.sv.version");
    }

    /* renamed from: j */
    public static String m12689j() {
        if (!m12690k()) {
            return "";
        }
        return "eui_" + m12682d("ro.letv.release.version") + "_" + Build.DISPLAY;
    }

    /* renamed from: k */
    public static boolean m12690k() {
        return !TextUtils.isEmpty(m12682d("ro.letv.release.version"));
    }

    /* renamed from: l */
    public static String m12691l() {
        if (!m12684e()) {
            return "";
        }
        return "miui_" + m12682d("ro.miui.ui.version.name") + "_" + Build.VERSION.INCREMENTAL;
    }

    /* renamed from: m */
    public static String m12692m() {
        String n = m12693n();
        if (n == null || !n.toLowerCase().contains("emotionui")) {
            return "";
        }
        return n + "_" + Build.DISPLAY;
    }

    /* renamed from: n */
    public static String m12693n() {
        return m12682d("ro.build.version.emui");
    }

    /* renamed from: o */
    public static boolean m12694o() {
        return "smartisan".equalsIgnoreCase(Build.MANUFACTURER) || "smartisan".equalsIgnoreCase(Build.BRAND);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r0 = 'I';
        r1 = '`';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        switch(r1) {
            case 55: goto L_0x0026;
            case 56: goto L_0x0026;
            case 57: goto L_0x000f;
            default: goto L_0x000e;
        };
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String o1659536876602dc(java.lang.String r2) {
        /*
        L_0x0000:
            r0 = 74
            r1 = 55
        L_0x0004:
            switch(r0) {
                case 72: goto L_0x0000;
                case 73: goto L_0x0008;
                case 74: goto L_0x000b;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x002b
        L_0x0008:
            switch(r1) {
                case 94: goto L_0x0026;
                case 95: goto L_0x000f;
                case 96: goto L_0x000f;
                default: goto L_0x000b;
            }
        L_0x000b:
            switch(r1) {
                case 55: goto L_0x0026;
                case 56: goto L_0x0026;
                case 57: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0026
        L_0x000f:
            char[] r2 = r2.toCharArray()
            r0 = 0
        L_0x0014:
            int r1 = r2.length
            if (r0 >= r1) goto L_0x0020
            char r1 = r2[r0]
            r1 = r1 ^ r0
            char r1 = (char) r1
            r2[r0] = r1
            int r0 = r0 + 1
            goto L_0x0014
        L_0x0020:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            return r0
        L_0x0026:
            r0 = 73
            r1 = 96
            goto L_0x0004
        L_0x002b:
            r0 = 72
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.p178l.C3886o.o1659536876602dc(java.lang.String):java.lang.String");
    }

    /* renamed from: p */
    public static String m12695p() {
        if (m12694o()) {
            try {
                String d = m12682d("ro.smartisan.version");
                return "smartisan_" + d;
            } catch (Throwable unused) {
            }
        }
        return Build.DISPLAY;
    }

    /* renamed from: q */
    public static String m12696q() {
        String str = Build.DISPLAY;
        return (str == null || !str.toLowerCase().contains("flyme")) ? "" : str;
    }

    /* renamed from: r */
    public static boolean m12697r() {
        if (f9950g == Integer.MAX_VALUE) {
            String str = Build.MANUFACTURER;
            String k = C3898x.m12817k("kllk");
            if (TextUtils.isEmpty(str) || !str.toLowerCase().contains(k)) {
                f9950g = 0;
            } else {
                f9950g = 1;
            }
        }
        return f9950g == 1;
    }

    /* renamed from: s */
    public static String m12698s() {
        if (!m12697r()) {
            return "";
        }
        String k = C3898x.m12817k("ro.build.version.kllkrom");
        return "coloros_" + m12682d(k) + "_" + Build.DISPLAY;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (android.os.Build.BRAND.toLowerCase().startsWith("huawei") == false) goto L_0x0019;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m12699t() {
        /*
            r0 = 0
            java.lang.String r1 = android.os.Build.BRAND     // Catch:{ all -> 0x0030 }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ all -> 0x0030 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0030 }
            java.lang.String r2 = "huawei"
            if (r1 != 0) goto L_0x0019
            java.lang.String r1 = android.os.Build.BRAND     // Catch:{ all -> 0x0030 }
            java.lang.String r1 = r1.toLowerCase()     // Catch:{ all -> 0x0030 }
            boolean r1 = r1.startsWith(r2)     // Catch:{ all -> 0x0030 }
            if (r1 != 0) goto L_0x002f
        L_0x0019:
            java.lang.String r1 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x0030 }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ all -> 0x0030 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0030 }
            if (r1 != 0) goto L_0x0030
            java.lang.String r1 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x0030 }
            java.lang.String r1 = r1.toLowerCase()     // Catch:{ all -> 0x0030 }
            boolean r1 = r1.startsWith(r2)     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x0030
        L_0x002f:
            r0 = 1
        L_0x0030:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.p178l.C3886o.m12699t():boolean");
    }

    /* renamed from: u */
    private static String m12700u() {
        if (m12694o()) {
            return m12695p();
        }
        if (m12684e()) {
            return m12691l();
        }
        if (m12679b()) {
            return m12696q();
        }
        if (m12697r()) {
            return m12698s();
        }
        String m = m12692m();
        if (!TextUtils.isEmpty(m)) {
            return m;
        }
        if (m12686g()) {
            return m12685f();
        }
        if (m12687h()) {
            return m12688i();
        }
        if (m12683d()) {
            return m12680c();
        }
        String j = m12689j();
        return !TextUtils.isEmpty(j) ? j : Build.DISPLAY;
    }

    /* renamed from: v */
    private static String m12701v() {
        try {
            if (C3948b.m12959c()) {
                String b = C3961a.m13035b("rom_info", "rom_property_info", "");
                C2905l.m8114c("RomUtils", "get Property From SPMultiHelper..." + b);
                return b;
            }
            String b2 = C3895u.m12724a("rom_info", C3513m.m10963a()).mo20759b("rom_property_info", "");
            C2905l.m8114c("RomUtils", "get Property From SP...=" + b2);
            return b2;
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.l.o$a */
    /* compiled from: RomUtils */
    public static class C3888a implements Callable<String> {

        /* renamed from: a */
        private String f9952a;

        public C3888a(String str) {
            this.f9952a = str;
        }

        /* renamed from: a */
        public String call() throws Exception {
            long currentTimeMillis = System.currentTimeMillis();
            String b = C3886o.m12681c(this.f9952a);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            C2905l.m8111b("RomUtils", "property:" + b + ",getSystemProperty use time :" + currentTimeMillis2);
            if (!TextUtils.isEmpty(b)) {
                try {
                    if (C3948b.m12959c()) {
                        C2905l.m8117d("RomUtils", "SPMultiHelper-getPropertyFromSPMultiHelper:" + b);
                        C3961a.m13029a("rom_info", "rom_property_info", b);
                    } else {
                        C2905l.m8117d("RomUtils", "SP-getPropertyFromSP:" + b);
                        C3895u.m12724a("rom_info", C3513m.m10963a()).mo20752a("rom_property_info", b);
                    }
                } catch (Throwable unused) {
                }
            }
            return b;
        }
    }
}
