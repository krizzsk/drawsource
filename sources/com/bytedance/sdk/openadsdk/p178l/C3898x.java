package com.bytedance.sdk.openadsdk.p178l;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.adjust.sdk.Constants;
import com.bykv.p054vk.openvk.component.video.api.C2394a;
import com.bykv.p054vk.openvk.component.video.api.p071c.C2400b;
import com.bytedance.sdk.component.p107c.C2753a;
import com.bytedance.sdk.component.p123f.C2882e;
import com.bytedance.sdk.component.p123f.C2885g;
import com.bytedance.sdk.component.utils.C2889b;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.component.utils.C2909o;
import com.bytedance.sdk.component.utils.C2917v;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.core.C3333a;
import com.bytedance.sdk.openadsdk.core.C3388c;
import com.bytedance.sdk.openadsdk.core.C3457h;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.C3704y;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.multipro.C3948b;
import com.bytedance.sdk.openadsdk.multipro.p184d.C3961a;
import com.bytedance.sdk.openadsdk.p170h.C3753b;
import com.facebook.internal.security.CertificateUtil;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.smaato.sdk.core.SmaatoSdk;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.l.x */
/* compiled from: ToolUtils */
public class C3898x {

    /* renamed from: a */
    private static ExecutorService f9964a = Executors.newSingleThreadExecutor();

    /* renamed from: b */
    private static C3896v f9965b = new C3896v();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static volatile boolean f9966c = false;

    /* renamed from: d */
    private static String f9967d = null;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static volatile String f9968e = "";

    /* renamed from: f */
    private static String f9969f = null;

    /* renamed from: g */
    private static String f9970g = null;

    /* renamed from: h */
    private static String f9971h = null;

    /* renamed from: i */
    private static HashSet<String> f9972i = new HashSet<>(Arrays.asList(new String[]{"Asia/Shanghai", "Asia/Urumqi", "Asia/Chongqing", "Asia/Harbin", "Asia/Kashgar"}));

    /* renamed from: a */
    public static String m12752a(int i) {
        switch (i) {
            case 1:
                return "embeded_ad_landingpage";
            case 2:
                return "banner_ad_landingpage";
            case 3:
                return "interaction_landingpage";
            case 4:
                return "splash_ad_landingpage";
            case 5:
                return "fullscreen_interstitial_ad";
            case 6:
                return "draw_ad_landingpage";
            case 7:
                return "rewarded_video_landingpage";
            default:
                return null;
        }
    }

    /* renamed from: a */
    public static void m12759a(C3431n nVar, View view) {
    }

    /* renamed from: b */
    public static String m12769b(int i) {
        return i != 1 ? i != 2 ? (i == 3 || i == 4) ? "open_ad" : i != 7 ? i != 8 ? i != 9 ? "embeded_ad" : "draw_ad" : "fullscreen_interstitial_ad" : "rewarded_video" : "interaction" : "banner_ad";
    }

    /* renamed from: e */
    public static boolean m12793e(int i) {
        return i == 4;
    }

    /* renamed from: f */
    public static boolean m12798f(int i) {
        return i == 5;
    }

    /* renamed from: g */
    public static boolean m12803g(int i) {
        return i == 6;
    }

    /* renamed from: a */
    public static Intent m12750a(Context context, String str) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            return null;
        }
        if (!launchIntentForPackage.hasCategory("android.intent.category.LAUNCHER")) {
            launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
        }
        launchIntentForPackage.setPackage((String) null);
        launchIntentForPackage.addFlags(2097152);
        launchIntentForPackage.addFlags(268435456);
        return launchIntentForPackage;
    }

    /* renamed from: b */
    public static boolean m12773b(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (context.getPackageManager().getPackageInfo(str, 0) != null) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m12765a(Context context, Intent intent) {
        if (intent == null) {
            return false;
        }
        try {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
            if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m12780c(Context context, String str) {
        return C3457h.m10580d() != null && !C3457h.m10580d().mo19748a();
    }

    /* renamed from: d */
    public static boolean m12786d(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + Uri.encode(str)));
                if (!(context instanceof Activity)) {
                    intent.setFlags(268435456);
                }
                C2889b.m8066a(context, intent, (C2889b.C2890a) null);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public static String m12754a(C3431n nVar) {
        if (nVar == null) {
            return null;
        }
        try {
            return m12769b(m12790e(nVar));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m12747a(java.lang.String r8) {
        /*
            int r0 = r8.hashCode()
            r1 = 1
            r2 = 7
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 6
            switch(r0) {
                case -1695837674: goto L_0x0055;
                case -1364000502: goto L_0x004b;
                case -1263194568: goto L_0x0041;
                case -764631662: goto L_0x0037;
                case -712491894: goto L_0x002d;
                case 564365438: goto L_0x0023;
                case 1844104722: goto L_0x0019;
                case 1912999166: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x005f
        L_0x000f:
            java.lang.String r0 = "draw_ad"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x005f
            r8 = r1
            goto L_0x0060
        L_0x0019:
            java.lang.String r0 = "interaction"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x005f
            r8 = r5
            goto L_0x0060
        L_0x0023:
            java.lang.String r0 = "cache_splash_ad"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x005f
            r8 = r3
            goto L_0x0060
        L_0x002d:
            java.lang.String r0 = "embeded_ad"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x005f
            r8 = 0
            goto L_0x0060
        L_0x0037:
            java.lang.String r0 = "fullscreen_interstitial_ad"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x005f
            r8 = r7
            goto L_0x0060
        L_0x0041:
            java.lang.String r0 = "open_ad"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x005f
            r8 = r4
            goto L_0x0060
        L_0x004b:
            java.lang.String r0 = "rewarded_video"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x005f
            r8 = r2
            goto L_0x0060
        L_0x0055:
            java.lang.String r0 = "banner_ad"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x005f
            r8 = r6
            goto L_0x0060
        L_0x005f:
            r8 = -1
        L_0x0060:
            switch(r8) {
                case 1: goto L_0x0069;
                case 2: goto L_0x0068;
                case 3: goto L_0x0067;
                case 4: goto L_0x0066;
                case 5: goto L_0x0066;
                case 6: goto L_0x0065;
                case 7: goto L_0x0064;
                default: goto L_0x0063;
            }
        L_0x0063:
            return r1
        L_0x0064:
            return r2
        L_0x0065:
            return r3
        L_0x0066:
            return r4
        L_0x0067:
            return r5
        L_0x0068:
            return r6
        L_0x0069:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.p178l.C3898x.m12747a(java.lang.String):int");
    }

    /* renamed from: b */
    public static JSONObject m12771b(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return new JSONObject(str);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m12774b(C3431n nVar) {
        return nVar != null && m12790e(nVar) == 9;
    }

    /* renamed from: c */
    public static boolean m12781c(C3431n nVar) {
        return nVar != null && m12790e(nVar) == 7;
    }

    /* renamed from: d */
    public static boolean m12787d(C3431n nVar) {
        return nVar != null && m12790e(nVar) == 8;
    }

    /* renamed from: e */
    public static int m12790e(C3431n nVar) {
        JSONObject aH;
        int aI = nVar.mo19565aI();
        if (aI != 0 || (aH = nVar.mo19564aH()) == null) {
            return aI;
        }
        int optInt = aH.optInt("ad_slot_type", 0);
        nVar.mo19510C(optInt);
        return optInt;
    }

    /* renamed from: f */
    public static int m12794f(C3431n nVar) {
        JSONObject aH = nVar.mo19564aH();
        if (aH != null) {
            return aH.optInt("rit", 0);
        }
        return 0;
    }

    /* renamed from: c */
    public static long m12778c(String str) {
        return m12749a(m12771b(str));
    }

    /* renamed from: a */
    private static long m12749a(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optLong("uid", 0);
        }
        return 0;
    }

    /* renamed from: d */
    public static int m12784d(String str) {
        return m12767b(m12771b(str));
    }

    /* renamed from: b */
    private static int m12767b(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optInt("ut", 0);
        }
        return 0;
    }

    /* renamed from: e */
    public static double m12788e(String str) {
        return m12775c(m12771b(str));
    }

    /* renamed from: g */
    public static double m12799g(C3431n nVar) {
        return m12775c(nVar.mo19564aH());
    }

    /* renamed from: c */
    private static double m12775c(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optDouble("pack_time", 0.0d);
        }
        return 0.0d;
    }

    /* renamed from: h */
    public static String m12806h(C3431n nVar) {
        JSONObject aH;
        String aJ = nVar.mo19566aJ();
        if (TextUtils.isEmpty(aJ) && (aH = nVar.mo19564aH()) != null) {
            aJ = aH.optString("req_id", "");
            nVar.mo19651q(aJ);
        }
        if (aJ == null) {
            return "";
        }
        return aJ;
    }

    /* renamed from: a */
    public static String m12755a(C3431n nVar, String str) {
        JSONObject aH = nVar.mo19564aH();
        return aH != null ? aH.optString("rit", str) : str;
    }

    /* renamed from: i */
    public static String m12810i(C3431n nVar) {
        if (nVar == null || nVar.mo19567aa() == null || TextUtils.isEmpty(nVar.mo19567aa().mo19400a())) {
            return null;
        }
        return nVar.mo19567aa().mo19400a();
    }

    /* renamed from: a */
    public static String m12751a() {
        String str;
        String str2 = "unKnow";
        try {
            if (C3948b.m12959c()) {
                str = C3961a.m13035b("sp_multi_ua_data", "android_system_ua", str2);
            } else {
                str = C3388c.m10078a(C3513m.m10963a()).mo19370b("android_system_ua", str2);
            }
            if (str != null && !str2.equals(str)) {
                return str;
            }
            FutureTask futureTask = new FutureTask(new C3902a(2));
            f9964a.execute(futureTask);
            str2 = (String) futureTask.get(500, TimeUnit.MILLISECONDS);
            C2905l.m8118e("getUA", " getAndroidSystemUA userAgent" + str2);
            return str2;
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public static String m12768b() {
        if (!TextUtils.isEmpty(f9968e)) {
            return f9968e;
        }
        try {
            f9968e = C3457h.m10577a("sdk_local_web_ua", 86400000);
            if (TextUtils.isEmpty(f9968e)) {
                if (Build.VERSION.SDK_INT < 17) {
                    if (Looper.myLooper() != Looper.getMainLooper()) {
                        new Handler(Looper.getMainLooper()).post(new Runnable() {
                            public void run() {
                                try {
                                    if (TextUtils.isEmpty(C3898x.f9968e)) {
                                        SSWebView sSWebView = new SSWebView(C3513m.m10963a());
                                        sSWebView.setWebViewClient(new SSWebView.C2926a());
                                        String unused = C3898x.f9968e = sSWebView.getUserAgentString();
                                    }
                                } catch (Exception unused2) {
                                }
                            }
                        });
                    } else if (TextUtils.isEmpty(f9968e)) {
                        SSWebView sSWebView = new SSWebView(C3513m.m10963a());
                        sSWebView.setWebViewClient(new SSWebView.C2926a());
                        f9968e = sSWebView.getUserAgentString();
                    }
                } else if (TextUtils.isEmpty(f9968e)) {
                    f9968e = WebSettings.getDefaultUserAgent(C3513m.m10963a());
                }
                C3457h.m10579a("sdk_local_web_ua", f9968e);
            }
        } catch (Exception unused) {
        }
        return f9968e;
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public static String m12838u() {
        try {
            WebView webView = new WebView(C3513m.m10963a());
            webView.setWebViewClient(new SSWebView.C2926a());
            String userAgentString = webView.getSettings().getUserAgentString();
            if (userAgentString != null && !"unKnow".equals(userAgentString)) {
                if (C3948b.m12959c()) {
                    C3961a.m13029a("sp_multi_ua_data", "webview_ua", userAgentString);
                } else {
                    C3388c.m10078a(C3513m.m10963a()).mo19366a("webview_ua", userAgentString);
                }
            }
            return userAgentString;
        } catch (Throwable th) {
            C2905l.m8118e("getUA", "e:" + th.getMessage());
            return "unKnow";
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.l.x$a */
    /* compiled from: ToolUtils */
    public static class C3902a implements Callable<String> {

        /* renamed from: a */
        int f9975a = 1;

        C3902a(int i) {
            this.f9975a = i;
        }

        /* renamed from: a */
        public synchronized String call() throws Exception {
            String str;
            str = "unKnow";
            if (this.f9975a == 1) {
                str = m12841c();
            }
            if (this.f9975a == 2) {
                str = m12840b();
            }
            return str;
        }

        /* renamed from: b */
        private String m12840b() {
            String str;
            Throwable th;
            try {
                str = System.getProperty("http.agent");
                if (str != null) {
                    try {
                        if (!"unKnow".equals(str)) {
                            if (C3948b.m12959c()) {
                                C3961a.m13029a("sp_multi_ua_data", "android_system_ua", str);
                            } else {
                                C3388c.m10078a(C3513m.m10963a()).mo19366a("android_system_ua", str);
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        C2905l.m8118e("getUA", "e:" + th.getMessage());
                        return str;
                    }
                }
            } catch (Throwable th3) {
                Throwable th4 = th3;
                str = "unKnow";
                th = th4;
                C2905l.m8118e("getUA", "e:" + th.getMessage());
                return str;
            }
            return str;
        }

        /* renamed from: c */
        private synchronized String m12841c() {
            final String[] strArr;
            strArr = new String[]{"unKnow"};
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    strArr[0] = C3898x.m12838u();
                    C2905l.m8111b("getUA", "webview ua：" + strArr[0]);
                }
            });
            while ("unKnow".equals(strArr[0])) {
            }
            return strArr[0];
        }
    }

    /* renamed from: c */
    public static String m12779c() {
        return C3885n.m12675a();
    }

    /* renamed from: d */
    public static synchronized String m12785d() {
        String str;
        synchronized (C3898x.class) {
            if (TextUtils.isEmpty(f9969f) && C3513m.m10963a() != null) {
                try {
                    f9969f = C3513m.m10963a().getPackageName();
                } catch (Throwable th) {
                    C2905l.m8115c("ToolUtils", "ToolUtils getPackageName throws exception :", th);
                }
            }
            str = f9969f;
        }
        return str;
    }

    /* renamed from: e */
    public static synchronized String m12791e() {
        String str;
        synchronized (C3898x.class) {
            if (TextUtils.isEmpty(f9970g) && C3513m.m10963a() != null) {
                try {
                    PackageInfo packageInfo = C3513m.m10963a().getPackageManager().getPackageInfo(m12785d(), 0);
                    f9970g = String.valueOf(packageInfo.versionCode);
                    f9971h = packageInfo.versionName;
                } catch (Throwable th) {
                    C2905l.m8115c("ToolUtils", "ToolUtils getVersionCode throws exception :", th);
                }
            }
            str = f9970g;
        }
        return str;
    }

    /* renamed from: f */
    public static synchronized String m12797f() {
        String str;
        synchronized (C3898x.class) {
            if (TextUtils.isEmpty(f9971h) && C3513m.m10963a() != null) {
                try {
                    PackageInfo packageInfo = C3513m.m10963a().getPackageManager().getPackageInfo(m12785d(), 0);
                    f9970g = String.valueOf(packageInfo.versionCode);
                    f9971h = packageInfo.versionName;
                } catch (Throwable th) {
                    C2905l.m8115c("ToolUtils", "ToolUtils getVersionName throws exception :", th);
                }
            }
            str = f9971h;
        }
        return str;
    }

    /* renamed from: a */
    public static String m12753a(Context context) {
        String b = C3388c.m10078a(context).mo19370b("total_memory", (String) null);
        if (b == null || m12796f(b) <= 0) {
            b = m12792e(context, "MemTotal");
            if (m12796f(b) <= 0) {
                b = m12801g();
            }
            C3388c.m10078a(context).mo19366a("total_memory", b);
        }
        return b;
    }

    /* renamed from: f */
    public static long m12796f(String str) {
        try {
            return Long.parseLong(str);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: g */
    public static String m12801g() {
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) C3513m.m10963a().getSystemService("activity")).getMemoryInfo(memoryInfo);
            if (memoryInfo.totalMem > 0) {
                return String.valueOf(memoryInfo.totalMem / 1024);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m12770b(Context context) {
        return C3388c.m10078a(context).mo19370b("total_memory", "0");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.io.FileReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.io.FileReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.io.FileReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.io.FileReader} */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:17|18|19|20|21|22|23|24) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0020 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0048 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001d A[SYNTHETIC, Splitter:B:11:0x001d] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0059 A[SYNTHETIC, Splitter:B:34:0x0059] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x005e A[SYNTHETIC, Splitter:B:38:0x005e] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m12792e(android.content.Context r6, java.lang.String r7) {
        /*
            r6 = 0
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ all -> 0x0051 }
            java.lang.String r1 = "/proc/meminfo"
            r0.<init>(r1)     // Catch:{ all -> 0x0051 }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x004e }
            r2 = 4096(0x1000, float:5.74E-42)
            r1.<init>(r0, r2)     // Catch:{ all -> 0x004e }
        L_0x000f:
            java.lang.String r2 = r1.readLine()     // Catch:{ all -> 0x004c }
            if (r2 == 0) goto L_0x001b
            boolean r3 = r2.contains(r7)     // Catch:{ all -> 0x004c }
            if (r3 == 0) goto L_0x000f
        L_0x001b:
            if (r2 != 0) goto L_0x0024
            r1.close()     // Catch:{ Exception -> 0x0020 }
        L_0x0020:
            r0.close()     // Catch:{ Exception -> 0x0023 }
        L_0x0023:
            return r6
        L_0x0024:
            java.lang.String r7 = "\\s+"
            java.lang.String[] r7 = r2.split(r7)     // Catch:{ all -> 0x004c }
            java.lang.String r2 = "ToolUtils"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x004c }
            r3.<init>()     // Catch:{ all -> 0x004c }
            java.lang.String r4 = "getTotalMemory = "
            r3.append(r4)     // Catch:{ all -> 0x004c }
            r4 = 1
            r5 = r7[r4]     // Catch:{ all -> 0x004c }
            r3.append(r5)     // Catch:{ all -> 0x004c }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x004c }
            com.bytedance.sdk.component.utils.C2905l.m8111b((java.lang.String) r2, (java.lang.String) r3)     // Catch:{ all -> 0x004c }
            r6 = r7[r4]     // Catch:{ all -> 0x004c }
            r1.close()     // Catch:{ Exception -> 0x0048 }
        L_0x0048:
            r0.close()     // Catch:{ Exception -> 0x004b }
        L_0x004b:
            return r6
        L_0x004c:
            r7 = move-exception
            goto L_0x0054
        L_0x004e:
            r7 = move-exception
            r1 = r6
            goto L_0x0054
        L_0x0051:
            r7 = move-exception
            r0 = r6
            r1 = r0
        L_0x0054:
            r7.printStackTrace()     // Catch:{ all -> 0x0062 }
            if (r1 == 0) goto L_0x005c
            r1.close()     // Catch:{ Exception -> 0x005c }
        L_0x005c:
            if (r0 == 0) goto L_0x0061
            r0.close()     // Catch:{ Exception -> 0x0061 }
        L_0x0061:
            return r6
        L_0x0062:
            r6 = move-exception
            if (r1 == 0) goto L_0x0068
            r1.close()     // Catch:{ Exception -> 0x0068 }
        L_0x0068:
            if (r0 == 0) goto L_0x006d
            r0.close()     // Catch:{ Exception -> 0x006d }
        L_0x006d:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.p178l.C3898x.m12792e(android.content.Context, java.lang.String):java.lang.String");
    }

    /* renamed from: h */
    public static int m12804h() {
        File[] listFiles;
        if (Build.VERSION.SDK_INT >= 17) {
            return Math.max(Runtime.getRuntime().availableProcessors(), 0);
        }
        try {
            File file = new File("/sys/devices/system/cpu/");
            if (!file.exists() || (listFiles = file.listFiles(new FilenameFilter() {

                /* renamed from: a */
                private Pattern f9973a = Pattern.compile("^cpu[0-9]+$");

                public boolean accept(File file, String str) {
                    return this.f9973a.matcher(str).matches();
                }
            })) == null) {
                return 0;
            }
            return Math.max(listFiles.length, 0);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: c */
    public static int m12777c(Context context) {
        return C3388c.m10078a(context).mo19368b("cpu_count", 0);
    }

    /* renamed from: d */
    public static int m12783d(Context context) {
        return C3388c.m10078a(context).mo19368b("cpu_max_frequency", 0);
    }

    /* renamed from: e */
    public static int m12789e(Context context) {
        return C3388c.m10078a(context).mo19368b("cpu_min_frequency", 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x005c A[SYNTHETIC, Splitter:B:27:0x005c] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0061 A[Catch:{ Exception -> 0x0064 }, DONT_GENERATE] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m12776c(int r7) {
        /*
            r0 = 0
            r1 = 0
            r2 = r1
            r1 = r0
        L_0x0004:
            int r7 = r7 + -1
            if (r7 < 0) goto L_0x0072
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ all -> 0x004d }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x004d }
            r4.<init>()     // Catch:{ all -> 0x004d }
            java.lang.String r5 = "/sys/devices/system/cpu/cpu"
            r4.append(r5)     // Catch:{ all -> 0x004d }
            r4.append(r7)     // Catch:{ all -> 0x004d }
            java.lang.String r5 = "/cpufreq/cpuinfo_max_freq"
            r4.append(r5)     // Catch:{ all -> 0x004d }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x004d }
            r3.<init>(r4)     // Catch:{ all -> 0x004d }
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ all -> 0x0047 }
            r0.<init>(r3)     // Catch:{ all -> 0x0047 }
            java.lang.String r1 = r0.readLine()     // Catch:{ all -> 0x0042 }
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0042 }
            if (r4 != 0) goto L_0x0039
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ all -> 0x0042 }
            if (r1 <= r2) goto L_0x0039
            r2 = r1
        L_0x0039:
            r0.close()     // Catch:{ Exception -> 0x003f }
            r3.close()     // Catch:{ Exception -> 0x003f }
        L_0x003f:
            r1 = r0
            r0 = r3
            goto L_0x0004
        L_0x0042:
            r1 = move-exception
            r6 = r3
            r3 = r0
            r0 = r6
            goto L_0x0051
        L_0x0047:
            r0 = move-exception
            r6 = r1
            r1 = r0
            r0 = r3
            r3 = r6
            goto L_0x0051
        L_0x004d:
            r3 = move-exception
            r6 = r3
            r3 = r1
            r1 = r6
        L_0x0051:
            java.lang.String r4 = "ToolUtils"
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0066 }
            com.bytedance.sdk.component.utils.C2905l.m8118e(r4, r1)     // Catch:{ all -> 0x0066 }
            if (r3 == 0) goto L_0x005f
            r3.close()     // Catch:{ Exception -> 0x0064 }
        L_0x005f:
            if (r0 == 0) goto L_0x0064
            r0.close()     // Catch:{ Exception -> 0x0064 }
        L_0x0064:
            r1 = r3
            goto L_0x0004
        L_0x0066:
            r7 = move-exception
            if (r3 == 0) goto L_0x006c
            r3.close()     // Catch:{ Exception -> 0x0071 }
        L_0x006c:
            if (r0 == 0) goto L_0x0071
            r0.close()     // Catch:{ Exception -> 0x0071 }
        L_0x0071:
            throw r7
        L_0x0072:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.p178l.C3898x.m12776c(int):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x005f A[SYNTHETIC, Splitter:B:28:0x005f] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0064 A[Catch:{ Exception -> 0x0067 }, DONT_GENERATE] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m12782d(int r7) {
        /*
            r0 = 0
            r1 = 0
            r2 = r1
            r1 = r0
        L_0x0004:
            int r7 = r7 + -1
            if (r7 < 0) goto L_0x0075
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ all -> 0x0050 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0050 }
            r4.<init>()     // Catch:{ all -> 0x0050 }
            java.lang.String r5 = "/sys/devices/system/cpu/cpu"
            r4.append(r5)     // Catch:{ all -> 0x0050 }
            r4.append(r7)     // Catch:{ all -> 0x0050 }
            java.lang.String r5 = "/cpufreq/cpuinfo_min_freq"
            r4.append(r5)     // Catch:{ all -> 0x0050 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0050 }
            r3.<init>(r4)     // Catch:{ all -> 0x0050 }
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ all -> 0x004a }
            r0.<init>(r3)     // Catch:{ all -> 0x004a }
            java.lang.String r1 = r0.readLine()     // Catch:{ all -> 0x0045 }
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0045 }
            if (r4 != 0) goto L_0x003c
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ all -> 0x0045 }
            if (r1 >= r2) goto L_0x0039
            goto L_0x003b
        L_0x0039:
            if (r2 != 0) goto L_0x003c
        L_0x003b:
            r2 = r1
        L_0x003c:
            r0.close()     // Catch:{ Exception -> 0x0042 }
            r3.close()     // Catch:{ Exception -> 0x0042 }
        L_0x0042:
            r1 = r0
            r0 = r3
            goto L_0x0004
        L_0x0045:
            r1 = move-exception
            r6 = r3
            r3 = r0
            r0 = r6
            goto L_0x0054
        L_0x004a:
            r0 = move-exception
            r6 = r1
            r1 = r0
            r0 = r3
            r3 = r6
            goto L_0x0054
        L_0x0050:
            r3 = move-exception
            r6 = r3
            r3 = r1
            r1 = r6
        L_0x0054:
            java.lang.String r4 = "ToolUtils"
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0069 }
            com.bytedance.sdk.component.utils.C2905l.m8118e(r4, r1)     // Catch:{ all -> 0x0069 }
            if (r3 == 0) goto L_0x0062
            r3.close()     // Catch:{ Exception -> 0x0067 }
        L_0x0062:
            if (r0 == 0) goto L_0x0067
            r0.close()     // Catch:{ Exception -> 0x0067 }
        L_0x0067:
            r1 = r3
            goto L_0x0004
        L_0x0069:
            r7 = move-exception
            if (r3 == 0) goto L_0x006f
            r3.close()     // Catch:{ Exception -> 0x0074 }
        L_0x006f:
            if (r0 == 0) goto L_0x0074
            r0.close()     // Catch:{ Exception -> 0x0074 }
        L_0x0074:
            throw r7
        L_0x0075:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.p178l.C3898x.m12782d(int):int");
    }

    /* renamed from: f */
    public static long m12795f(Context context) {
        return C3388c.m10078a(context).mo19369b("total_internal_storage", 0).longValue();
    }

    /* renamed from: i */
    public static long m12809i() {
        long j;
        long j2;
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            if (Build.VERSION.SDK_INT >= 18) {
                j = statFs.getBlockSizeLong();
                j2 = statFs.getBlockCountLong();
            } else {
                j = (long) statFs.getBlockSize();
                j2 = (long) statFs.getBlockCount();
            }
            return j2 * j;
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: g */
    public static long m12800g(Context context) {
        return C3388c.m10078a(context).mo19369b("free_internal_storage", 0).longValue();
    }

    /* renamed from: h */
    public static long m12805h(Context context) {
        return C3388c.m10078a(context).mo19369b("total_sdcard_storage", 0).longValue();
    }

    /* renamed from: j */
    public static long m12812j() {
        try {
            if (!m12839v()) {
                return 0;
            }
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: v */
    private static boolean m12839v() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: i */
    public static int m12808i(Context context) {
        return C3388c.m10078a(context).mo19368b("is_root", -1);
    }

    /* renamed from: k */
    public static boolean m12818k() {
        try {
            return new File("/system/bin/su").exists() || new File("/system/xbin/su").exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: g */
    public static String m12802g(String str) {
        return m12756a(str, false);
    }

    /* renamed from: a */
    public static String m12756a(String str, boolean z) {
        String str2;
        String p = C3513m.m10973h().mo19875p();
        if (TextUtils.isEmpty(p)) {
            int o = m12828o();
            if (o == 1) {
                str2 = "https://" + "pangolin16.sgsnssdk.com" + str;
            } else if (o == 2) {
                str2 = "https://" + "pangolin16.sgsnssdk.com" + str;
            } else {
                str2 = "https://" + "pangolin16.isnssdk.com" + str;
            }
            if (!z) {
                return C3896v.m12743b(str2);
            }
            return m12833p(str2);
        }
        String str3 = "https://" + p + str;
        if (C3896v.m12741a() && !z) {
            str3 = C3896v.m12743b(str3);
        }
        return z ? m12833p(str3) : str3;
    }

    /* renamed from: p */
    private static String m12833p(String str) {
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter("aid", "1371").appendQueryParameter("device_platform", "android").appendQueryParameter("version_code", m12791e()).toString();
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: h */
    public static String m12807h(String str) {
        if (TextUtils.isEmpty(str)) {
            str = C3513m.m10973h().mo19877q();
        }
        if (TextUtils.isEmpty(str)) {
            return m12828o() == 2 ? "https://log.sgsnssdk.com/service/2/app_log/" : "https://log-mva.isnssdk.com/service/2/app_log/";
        }
        if (str.startsWith("http")) {
            return str;
        }
        return "https://" + str;
    }

    /* renamed from: l */
    public static String m12819l() {
        return String.format("https://%s", new Object[]{"log.byteoversea.com/service/2/app_log_test/"});
    }

    /* renamed from: m */
    public static String m12822m() {
        int o = m12828o();
        return (o == 1 || o == 2) ? "https://sf-tb-sg.ibytedtos.com/obj/ad-pattern-sg/renderer/package_sg.json" : "https://sf16-muse-va.ibytedtos.com/obj/ad-pattern-va/renderer/package_va.json";
    }

    /* renamed from: n */
    public static String m12826n() {
        try {
            return TimeZone.getDefault().getID();
        } catch (Exception e) {
            C2905l.m8118e("ToolUtils", e.toString());
            return "";
        }
    }

    /* renamed from: o */
    public static int m12828o() {
        try {
            String id = TimeZone.getDefault().getID();
            if (f9972i.contains(id)) {
                return 2;
            }
            if (id != null && id.startsWith("Asia/")) {
                return 2;
            }
            if (id == null || !id.startsWith("Europe/")) {
                return (id == null || !id.startsWith("America/")) ? 3 : 5;
            }
            return 4;
        } catch (Throwable th) {
            C2905l.m8118e("ToolUtils", th.toString());
            return 0;
        }
    }

    /* renamed from: j */
    public static String m12813j(Context context) {
        Locale locale;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                locale = context.getResources().getConfiguration().getLocales().get(0);
            } else {
                locale = Locale.getDefault();
            }
            String language = locale.getLanguage();
            String country = locale.getCountry();
            return language + "_" + country;
        } catch (Exception e) {
            C2905l.m8118e("ToolUtils", e.toString());
            return "";
        }
    }

    /* renamed from: k */
    public static String m12816k(Context context) {
        Locale locale;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                locale = context.getResources().getConfiguration().getLocales().get(0);
            } else {
                locale = Locale.getDefault();
            }
            return locale.getLanguage();
        } catch (Exception e) {
            C2905l.m8118e("ToolUtils", e.toString());
            return "";
        }
    }

    /* renamed from: p */
    public static int m12831p() {
        int rawOffset = TimeZone.getDefault().getRawOffset() / Constants.ONE_HOUR;
        if (rawOffset < -12) {
            rawOffset = -12;
        }
        if (rawOffset > 12) {
            return 12;
        }
        return rawOffset;
    }

    /* renamed from: q */
    public static String m12834q() {
        int i = -m12831p();
        if (i >= 0) {
            return "Etc/GMT+" + i;
        }
        return "Etc/GMT" + i;
    }

    /* renamed from: a */
    public static Map<String, Object> m12758a(boolean z, C3431n nVar, long j, long j2, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(CampaignEx.JSON_KEY_CREATIVE_ID, nVar.mo19532Y());
        hashMap.put("load_time", Long.valueOf(j));
        C2400b J = nVar.mo19517J();
        if (J != null) {
            hashMap.put(CampaignEx.JSON_KEY_VIDEO_SIZE, Long.valueOf(J.mo15943e()));
            hashMap.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, J.mo15949g());
        }
        if (!z) {
            hashMap.put("error_code", Long.valueOf(j2));
            if (TextUtils.isEmpty(str)) {
                str = "unknown";
            }
            hashMap.put("error_message", str);
        }
        return hashMap;
    }

    /* renamed from: a */
    public static Map<String, Object> m12757a(C3431n nVar, long j, C2394a aVar) {
        if (nVar == null) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap();
        hashMap.put(CampaignEx.JSON_KEY_CREATIVE_ID, nVar.mo19532Y());
        hashMap.put("buffers_time", Long.valueOf(j));
        C2400b J = nVar.mo19517J();
        if (J != null) {
            hashMap.put(CampaignEx.JSON_KEY_VIDEO_SIZE, Long.valueOf(J.mo15943e()));
            hashMap.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, J.mo15949g());
        }
        m12761a((Map<String, Object>) hashMap, aVar);
        return hashMap;
    }

    /* renamed from: a */
    private static void m12761a(Map<String, Object> map, C2394a aVar) {
        if (!map.containsKey(CampaignEx.JSON_KEY_VIDEO_RESOLUTION) && aVar != null) {
            try {
                int j = aVar.mo15883j();
                int k = aVar.mo15884k();
                map.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, String.format(Locale.getDefault(), "%d×%d", new Object[]{Integer.valueOf(j), Integer.valueOf(k)}));
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: i */
    public static boolean m12811i(String str) {
        try {
            return Pattern.compile("[一-龥]").matcher(str).find();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static void m12772b(C3431n nVar, String str) {
        if (nVar != null) {
            try {
                String O = nVar.mo19522O();
                if (TextUtils.isEmpty(O) && nVar.mo19568ab() != null && nVar.mo19568ab().mo19448c() == 1 && !TextUtils.isEmpty(nVar.mo19568ab().mo19446b())) {
                    O = nVar.mo19568ab().mo19446b();
                }
                String str2 = O;
                if (!TextUtils.isEmpty(str2)) {
                    C3704y.m12115a(C3513m.m10963a(), str2, nVar, m12747a(str), str, false);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: j */
    public static boolean m12814j(C3431n nVar) {
        if (nVar == null) {
            return true;
        }
        int c = C3513m.m10973h().mo19841c(m12794f(nVar));
        int c2 = C2909o.m8136c(C3513m.m10963a());
        if (c == 1) {
            return m12793e(c2);
        }
        if (c != 2) {
            if (c == 3) {
                return false;
            }
            if (c == 5 && !m12793e(c2) && !m12803g(c2)) {
                return false;
            }
            return true;
        } else if (m12798f(c2) || m12793e(c2) || m12803g(c2)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public static void m12763a(JSONObject jSONObject, boolean z) {
        String a;
        if (C3896v.m12741a() && (a = C3896v.m12740a("testGps.txt")) != null) {
            try {
                String[] split = a.split(",");
                if (split.length >= 2 && m12815j(split[1]) && m12815j(split[0])) {
                    if (z) {
                        m12762a(jSONObject, Float.valueOf(Float.parseFloat(split[0])), Float.valueOf(Float.parseFloat(split[1])));
                        return;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    m12762a(jSONObject2, Float.valueOf(Float.parseFloat(split[0])), Float.valueOf(Float.parseFloat(split[1])));
                    jSONObject.put(SmaatoSdk.KEY_GEO_LOCATION, jSONObject2);
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m12762a(JSONObject jSONObject, Float f, Float f2) {
        if (jSONObject != null) {
            try {
                jSONObject.put(C2753a.m7505a("w0yrwBEUr1ini9hm/p022A==", C3333a.m9921a()), f2);
                jSONObject.put(C2753a.m7505a("LeHrqxcsm457V3n1/LcJVw==", C3333a.m9921a()), f);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: j */
    public static boolean m12815j(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("^[+-]?([0-9]|([1-9][0-9]*))(\\.[0-9]+)?").matcher(str).matches();
    }

    /* renamed from: l */
    public static boolean m12821l(Context context) {
        if (context != null) {
            boolean z = context.getApplicationInfo().targetSdkVersion >= 30 && Build.VERSION.SDK_INT >= 30;
            StringBuilder sb = new StringBuilder();
            sb.append("can query all package = ");
            sb.append(!z);
            C2905l.m8114c("ToolUtils", sb.toString());
            return !z;
        }
        throw new IllegalArgumentException("params context is null");
    }

    /* renamed from: k */
    public static String m12817k(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.contains("KLLK")) {
            return str.replace("KLLK", "OPPO");
        }
        if (str.contains("kllk")) {
            return str.replace("kllk", "oppo");
        }
        return "";
    }

    /* renamed from: a */
    public static boolean m12764a(long j, long j2) {
        long j3 = j2 - j;
        return j3 < 86400000 && j3 > -86400000 && m12748a(j) == m12748a(j2);
    }

    /* renamed from: a */
    public static long m12748a(long j) {
        return (j + ((long) TimeZone.getDefault().getOffset(j))) / 86400000;
    }

    /* renamed from: a */
    public static void m12760a(String str, String str2, Context context) {
        int i;
        if (!TextUtils.isEmpty(str2) && context != null && m12824m(context)) {
            int i2 = 3572;
            int length = str2.length();
            int i3 = 0;
            int i4 = 1;
            if (length % 3572 == 0) {
                i = length / 3572;
            } else {
                i = (length / 3572) + 1;
            }
            while (i4 <= i) {
                if (i2 < length) {
                    Log.d(str, i + "-" + i4 + CertificateUtil.DELIMITER + str2.substring(i3, i2));
                    i4++;
                    i3 = i2;
                    i2 += 3572;
                } else {
                    Log.d(str, i + "-" + i4 + CertificateUtil.DELIMITER + str2.substring(i3));
                    return;
                }
            }
        }
    }

    /* renamed from: m */
    public static boolean m12824m(Context context) {
        if (context == null) {
            return false;
        }
        try {
            if ((context.getApplicationInfo().flags & 2) != 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: n */
    public static long m12825n(Context context) {
        int i = -1;
        try {
            i = context.getApplicationInfo().targetSdkVersion;
            C2905l.m8107a("ToolUtils", "targetSdkVersion = ", Integer.valueOf(i));
        } catch (Throwable unused) {
        }
        return (long) i;
    }

    /* renamed from: o */
    public static long m12829o(Context context) {
        int i = -1;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                i = context.getApplicationInfo().minSdkVersion;
                C2905l.m8107a("ToolUtils", "minSdkVersion = ", Integer.valueOf(i));
            }
        } catch (Throwable unused) {
        }
        return (long) i;
    }

    /* renamed from: l */
    public static void m12820l(final String str) {
        C2882e.m8036a(new C2885g("reportMultiLog") {
            public void run() {
                if (!C3898x.f9966c && C3513m.m10973h().mo19829F()) {
                    try {
                        boolean unused = C3898x.f9966c = true;
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("error", str);
                        C3753b.m12287a().mo20573a("reportMultiLog", jSONObject);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, 5);
    }

    /* renamed from: m */
    public static void m12823m(String str) {
        if (!TTAdSdk.isInitSuccess()) {
            C2905l.m8110b("You must use method '" + str + "' after initialization, please check.");
        }
    }

    /* renamed from: n */
    public static void m12827n(String str) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            C2905l.m8110b("You should use method '" + str + "' on the asynchronous thread,it may cause anr, please check.");
        }
    }

    /* renamed from: p */
    public static int m12832p(Context context) {
        int a = C2917v.m8175a(context, 0);
        if (a == 1) {
            return 0;
        }
        if (a == 4) {
            return 1;
        }
        if (a == 5) {
            return 4;
        }
        if (a != 6) {
            return a;
        }
        return 5;
    }
}
