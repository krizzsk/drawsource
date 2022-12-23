package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ImageView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.C8460e;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p298db.C8412f;
import com.mbridge.msdk.foundation.p298db.C8414g;
import com.mbridge.msdk.foundation.p298db.C8416i;
import com.mbridge.msdk.foundation.p298db.C8417j;
import com.mbridge.msdk.foundation.tools.C8649n;
import com.mbridge.msdk.p078c.C2440a;
import com.mbridge.msdk.p078c.C2445b;
import com.tapjoy.TapjoyConstants;
import java.lang.reflect.InvocationTargetException;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.mbridge.msdk.foundation.tools.z */
/* compiled from: SameTool */
public final class C8677z extends C8638h {

    /* renamed from: a */
    private static char[] f21255a = {'A', 'p', 'p', 'l', 'i', 'c', 'a', 't', 'i', 'o', 'n', 'I', 'n', 'f', 'o'};

    /* renamed from: b */
    private static char[] f21256b = {'.', 'X'};

    /* renamed from: c */
    private static int f21257c = 0;

    /* renamed from: d */
    private static int f21258d = 1;

    /* renamed from: e */
    private static int f21259e = 2;

    /* renamed from: f */
    private static int f21260f = 3;

    /* renamed from: g */
    private static int f21261g = 0;

    /* renamed from: h */
    private static int f21262h = 7;

    /* renamed from: i */
    private static int f21263i = 14;

    /* renamed from: j */
    private static int f21264j = 19;

    /* renamed from: k */
    private static int f21265k = 16;

    /* renamed from: l */
    private static int f21266l = 26;

    /* renamed from: m */
    private static String f21267m = "[一-龥]";

    /* renamed from: n */
    private static Pattern f21268n = Pattern.compile("[一-龥]");

    /* renamed from: o */
    private static int f21269o = 1;

    /* renamed from: p */
    private static boolean f21270p = true;

    /* renamed from: q */
    private static Map<String, String> f21271q;

    /* renamed from: r */
    private static Map<String, String> f21272r;

    /* renamed from: s */
    private static volatile Boolean f21273s = null;

    /* renamed from: b */
    public static int m24923b(int i) {
        if ((i > 100 && i < 199) || i == 2) {
            return 1;
        }
        if ((i <= 200 || i >= 299) && i != 4) {
            return (i <= 500 || i >= 599) ? -1 : 5;
        }
        return 2;
    }

    /* renamed from: a */
    public static <T extends String> boolean m24920a(T t) {
        return t == null || t.length() == 0;
    }

    /* renamed from: b */
    public static boolean m24929b(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !TapjoyConstants.TJC_CONNECTION_TYPE_WIFI.equals(activeNetworkInfo.getTypeName().toLowerCase(Locale.US))) {
                return false;
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m24933c(Context context) {
        try {
            if (((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo() != null) {
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m24919a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            return !TextUtils.isEmpty(campaignEx.getDeepLinkURL());
        }
        return false;
    }

    /* renamed from: d */
    public static float m24936d(Context context) {
        if (context == null) {
            return 2.5f;
        }
        try {
            float f = context.getResources().getDisplayMetrics().density;
            if (f == 0.0f) {
                return 2.5f;
            }
            return f;
        } catch (Exception e) {
            e.printStackTrace();
            return 2.5f;
        }
    }

    /* renamed from: a */
    public static int m24906a(Context context, float f) {
        float f2 = 2.5f;
        if (context != null) {
            try {
                float f3 = context.getResources().getDisplayMetrics().density;
                if (f3 != 0.0f) {
                    f2 = f3;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return (int) ((f / f2) + 0.5f);
    }

    /* renamed from: b */
    public static int m24924b(Context context, float f) {
        Resources resources;
        if (context == null || (resources = context.getResources()) == null) {
            return 0;
        }
        return (int) ((f * resources.getDisplayMetrics().density) + 0.5f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001d, code lost:
        if (r2 != null) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002a, code lost:
        if (r2 != null) goto L_0x001f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0026 A[SYNTHETIC, Splitter:B:19:0x0026] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m24908a(java.io.File r4) throws java.lang.Exception {
        /*
            r0 = 0
            r2 = 0
            boolean r3 = r4.exists()     // Catch:{ Exception -> 0x002a, all -> 0x0023 }
            if (r3 == 0) goto L_0x001a
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Exception -> 0x002a, all -> 0x0023 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x002a, all -> 0x0023 }
            int r4 = r3.available()     // Catch:{ Exception -> 0x0018, all -> 0x0015 }
            long r0 = (long) r4
            r2 = r3
            goto L_0x001d
        L_0x0015:
            r4 = move-exception
            r2 = r3
            goto L_0x0024
        L_0x0018:
            r2 = r3
            goto L_0x002a
        L_0x001a:
            r4.createNewFile()     // Catch:{ Exception -> 0x002a, all -> 0x0023 }
        L_0x001d:
            if (r2 == 0) goto L_0x002d
        L_0x001f:
            r2.close()     // Catch:{ Exception -> 0x002d }
            goto L_0x002d
        L_0x0023:
            r4 = move-exception
        L_0x0024:
            if (r2 == 0) goto L_0x0029
            r2.close()     // Catch:{ Exception -> 0x0029 }
        L_0x0029:
            throw r4
        L_0x002a:
            if (r2 == 0) goto L_0x002d
            goto L_0x001f
        L_0x002d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.C8677z.m24908a(java.io.File):long");
    }

    /* renamed from: e */
    public static int m24940e(Context context) {
        try {
            Class<?> cls = Class.forName("com.android.internal.R$dimen");
            return context.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("status_bar_height").get(cls.newInstance()).toString()));
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: f */
    public static float m24942f(Context context) {
        return (float) context.getResources().getDisplayMetrics().widthPixels;
    }

    /* renamed from: a */
    public static int m24905a() {
        int i = f21269o;
        f21269o = i + 1;
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004c A[Catch:{ Exception -> 0x005f }, LOOP:0: B:17:0x004a->B:18:0x004c, LOOP_END] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m24909a(int r6) {
        /*
            java.lang.String r0 = ""
            com.mbridge.msdk.c.b r1 = com.mbridge.msdk.p078c.C2445b.m6020a()     // Catch:{ Exception -> 0x005f }
            com.mbridge.msdk.foundation.controller.a r2 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ Exception -> 0x005f }
            java.lang.String r2 = r2.mo56914h()     // Catch:{ Exception -> 0x005f }
            com.mbridge.msdk.c.a r1 = r1.mo16286b(r2)     // Catch:{ Exception -> 0x005f }
            if (r1 != 0) goto L_0x001c
            com.mbridge.msdk.c.b r1 = com.mbridge.msdk.p078c.C2445b.m6020a()     // Catch:{ Exception -> 0x005f }
            com.mbridge.msdk.c.a r1 = r1.mo16285b()     // Catch:{ Exception -> 0x005f }
        L_0x001c:
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ Exception -> 0x005f }
            r2.<init>()     // Catch:{ Exception -> 0x005f }
            if (r1 == 0) goto L_0x0054
            int r1 = r1.mo16163R()     // Catch:{ Exception -> 0x005f }
            r3 = 1
            if (r1 != r3) goto L_0x0054
            com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ Exception -> 0x005f }
            android.content.Context r1 = r1.mo56913g()     // Catch:{ Exception -> 0x005f }
            com.mbridge.msdk.foundation.db.g r1 = com.mbridge.msdk.foundation.p298db.C8414g.m23969a((android.content.Context) r1)     // Catch:{ Exception -> 0x005f }
            com.mbridge.msdk.foundation.db.j r1 = com.mbridge.msdk.foundation.p298db.C8417j.m23986a((com.mbridge.msdk.foundation.p298db.C8412f) r1)     // Catch:{ Exception -> 0x005f }
            long[] r1 = r1.mo57030a()     // Catch:{ Exception -> 0x005f }
            if (r1 == 0) goto L_0x0054
            int r3 = r1.length     // Catch:{ Exception -> 0x005f }
            if (r3 <= r6) goto L_0x0049
            if (r6 != 0) goto L_0x0046
            goto L_0x0049
        L_0x0046:
            int r6 = r3 - r6
            goto L_0x004a
        L_0x0049:
            r6 = 0
        L_0x004a:
            if (r6 >= r3) goto L_0x0054
            r4 = r1[r6]     // Catch:{ Exception -> 0x005f }
            r2.put(r4)     // Catch:{ Exception -> 0x005f }
            int r6 = r6 + 1
            goto L_0x004a
        L_0x0054:
            int r6 = r2.length()     // Catch:{ Exception -> 0x005f }
            if (r6 <= 0) goto L_0x0063
            java.lang.String r0 = m24912a((org.json.JSONArray) r2)     // Catch:{ Exception -> 0x005f }
            goto L_0x0063
        L_0x005f:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0063:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.C8677z.m24909a(int):java.lang.String");
    }

    /* renamed from: a */
    public static String m24912a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return "";
        }
        C2440a b = C2445b.m6020a().mo16286b(C8388a.m23845e().mo56914h());
        if (b == null) {
            b = C2445b.m6020a().mo16285b();
        }
        int J = b.mo16155J();
        if (jSONArray.length() <= J) {
            return jSONArray.toString();
        }
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < J; i++) {
            try {
                jSONArray2.put(jSONArray.get(i));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONArray2.toString();
    }

    /* renamed from: a */
    public static boolean m24921a(String str, Context context) {
        try {
            if (context.getPackageManager().checkPermission(str, context.getPackageName()) == 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m24930b(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                return campaignEx.getRetarget_offer() == 1;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /* renamed from: b */
    public static double m24922b(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return Double.parseDouble(str);
            }
            return 0.0d;
        } catch (Exception e) {
            e.printStackTrace();
            return 0.0d;
        }
    }

    /* renamed from: a */
    public static int m24907a(Object obj) {
        if (obj == null) {
            return 0;
        }
        try {
            if (obj instanceof String) {
                return Integer.parseInt((String) obj);
            }
            return 0;
        } catch (Throwable th) {
            C8672v.m24875a("SameTools", th.getMessage(), th);
            return 0;
        }
    }

    /* renamed from: a */
    public static double m24904a(Double d) {
        try {
            String format = new DecimalFormat("0.00", DecimalFormatSymbols.getInstance(Locale.US)).format(d);
            if (C8616ad.m24718b(format)) {
                return Double.parseDouble(format);
            }
            return 0.0d;
        } catch (Exception e) {
            e.printStackTrace();
            return 0.0d;
        }
    }

    /* renamed from: n */
    private static DisplayMetrics m24959n(Context context) {
        if (context == null) {
            return null;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            if (Build.VERSION.SDK_INT >= 17) {
                defaultDisplay.getRealMetrics(displayMetrics);
                return displayMetrics;
            }
            defaultDisplay.getMetrics(displayMetrics);
            return displayMetrics;
        } catch (Throwable th) {
            th.printStackTrace();
            return context.getResources().getDisplayMetrics();
        }
    }

    /* renamed from: g */
    public static int m24945g(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return m24959n(context).heightPixels;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: h */
    public static int m24947h(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return m24959n(context).widthPixels;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: i */
    public static int m24949i(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getResources().getDisplayMetrics().widthPixels;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: j */
    public static int m24951j(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getResources().getDisplayMetrics().heightPixels;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: a */
    public static void m24915a(View view) {
        if (view != null) {
            try {
                if (Build.VERSION.SDK_INT >= 11) {
                    view.setSystemUiVisibility(4102);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: k */
    public static int m24953k(Context context) {
        if (context != null) {
            return 0;
        }
        try {
            if (context.getResources().getIdentifier("config_showNavigationBar", "bool", "android") != 0) {
                return context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("navigation_bar_height", "dimen", "android"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    /* renamed from: a */
    public static void m24916a(ImageView imageView) {
        if (imageView != null) {
            try {
                imageView.setImageResource(0);
                imageView.setImageDrawable((Drawable) null);
                imageView.setImageURI((Uri) null);
                imageView.setImageBitmap((Bitmap) null);
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    th.printStackTrace();
                }
            }
        }
    }

    /* renamed from: b */
    public static List<String> m24927b(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        try {
            if (jSONArray.length() <= 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                String optString = jSONArray.optString(i);
                if (C8616ad.m24718b(optString)) {
                    arrayList.add(optString);
                }
            }
            return arrayList;
        } catch (Throwable th) {
            C8672v.m24875a("SameTools", th.getMessage(), th);
            return null;
        }
    }

    /* renamed from: c */
    public static String m24931c(String str) {
        try {
            if (C8616ad.m24718b(str)) {
                return URLEncoder.encode(str, "utf-8");
            }
            return "";
        } catch (Throwable th) {
            C8672v.m24875a("SameTools", th.getMessage(), th);
            return "";
        }
    }

    /* renamed from: b */
    public static boolean m24928b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: l */
    public static boolean m24956l(Context context) {
        try {
            return ((PowerManager) context.getSystemService("power")).isScreenOn();
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    /* renamed from: m */
    public static int m24957m(Context context) {
        PackageInfo packageInfo;
        if (context == null) {
            return 0;
        }
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                packageInfo = WebView.getCurrentWebViewPackage();
            } else {
                packageInfo = context.getPackageManager().getPackageInfo("com.google.android.webview", 1);
            }
            C2440a b = C2445b.m6020a().mo16286b(C8388a.m23845e().mo56914h());
            if (b == null) {
                b = C2445b.m6020a().mo16285b();
            }
            if (packageInfo == null || TextUtils.isEmpty(packageInfo.versionName) || !packageInfo.versionName.equals("77.0.3865.92")) {
                return b.mo16177aA();
            }
            return 5;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static JSONArray m24914a(Context context, String str) {
        JSONArray jSONArray = new JSONArray();
        try {
            C2440a b = C2445b.m6020a().mo16286b(C8388a.m23845e().mo56914h());
            if (b == null) {
                b = C2445b.m6020a().mo16285b();
            }
            if (b != null && b.mo16163R() == 1) {
                C8672v.m24876b("SameTools", "fqci cfc:" + b.mo16163R());
                long[] a = C8417j.m23986a((C8412f) C8414g.m23969a(context)).mo57030a();
                if (a != null) {
                    for (long put : a) {
                        C8672v.m24876b("SameTools", "cfc campaignIds:" + a);
                        jSONArray.put(put);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONArray;
    }

    /* renamed from: b */
    public static String m24926b(Context context, String str) {
        String str2 = "";
        try {
            JSONArray a = m24914a(context, str);
            if (a.length() > 0) {
                str2 = m24912a(a);
            }
            C8672v.m24876b("SameTools", "get excludes:" + str2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str2;
    }

    /* renamed from: a */
    public static void m24917a(String str, CampaignEx campaignEx, int i) {
        if (!TextUtils.isEmpty(str) && campaignEx != null && C8388a.m23845e().mo56913g() != null) {
            C8416i a = C8416i.m23982a((C8412f) C8414g.m23969a(C8388a.m23845e().mo56913g()));
            C8460e eVar = new C8460e();
            eVar.mo57715a(System.currentTimeMillis());
            eVar.mo57718b(str);
            eVar.mo57716a(campaignEx.getId());
            eVar.mo57714a(i);
            a.mo57026a(eVar);
        }
    }

    /* renamed from: c */
    public static synchronized boolean m24934c(Context context, String str) {
        boolean z;
        synchronized (C8677z.class) {
            z = false;
            if (context != null) {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        if (m24925b(str, context) != null) {
                            z = true;
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return z;
    }

    /* renamed from: c */
    public static boolean m24932c() {
        if (TextUtils.isEmpty(C8388a.m23845e().mo56915i())) {
            return false;
        }
        try {
            Class.forName("com.tencent.mm.opensdk.openapi.WXAPIFactory");
            Class.forName("com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram");
            return true;
        } catch (ClassNotFoundException e) {
            C8672v.m24878d("SameTools", e.getMessage());
            return false;
        }
    }

    /* renamed from: d */
    public static Object m24938d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Class.forName("com.tencent.mm.opensdk.openapi.WXAPIFactory").getMethod("createWXAPI", new Class[]{Context.class, String.class}).invoke((Object) null, new Object[]{C8388a.m23845e().mo56913g(), str});
        } catch (ClassNotFoundException e) {
            C8672v.m24878d("SameTools", e.getMessage());
            return null;
        } catch (NoSuchMethodException e2) {
            C8672v.m24878d("SameTools", e2.getMessage());
            return null;
        } catch (IllegalAccessException e3) {
            C8672v.m24878d("SameTools", e3.getMessage());
            return null;
        } catch (InvocationTargetException e4) {
            C8672v.m24878d("SameTools", e4.getMessage());
            return null;
        }
    }

    /* renamed from: d */
    public static int m24937d() {
        try {
            return ((Integer) Class.forName("com.tencent.mm.opensdk.constants.Build").getField("SDK_INT").get((Object) null)).intValue();
        } catch (Throwable th) {
            C8672v.m24878d("SameTools", th.getMessage());
            return 0;
        }
    }

    /* renamed from: e */
    public static int m24941e(String str) {
        try {
            return ((Integer) Class.forName("com.tencent.mm.opensdk.openapi.IWXAPI").getMethod("getWXAppSupportAPI", new Class[0]).invoke(C8660r.m24805a(str), new Object[0])).intValue();
        } catch (Throwable th) {
            C8672v.m24878d("SameTools", th.getMessage());
            return 0;
        }
    }

    /* renamed from: b */
    private static Object m24925b(String str, Context context) {
        try {
            return Class.forName(String.valueOf(m24935c(f21257c))).getMethod(String.valueOf(m24935c(f21259e)), new Class[]{String.class, Integer.TYPE}).invoke(Class.forName(String.valueOf(m24935c(f21258d))).getMethod(String.valueOf(m24935c(f21260f)), new Class[0]).invoke(context, new Object[0]), new Object[]{str, 8192});
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static final char[] m24935c(int i) {
        StringBuilder sb;
        if (i == 0) {
            sb = new StringBuilder();
            sb.append(String.valueOf(Arrays.copyOf(C8675y.f21254b, f21262h)));
            sb.append(f21256b[f21261g]);
            sb.append(String.valueOf(Arrays.copyOfRange(C8675y.f21254b, f21262h, f21263i)));
            sb.append(f21256b[f21261g]);
            sb.append(String.valueOf(Arrays.copyOfRange(C8675y.f21254b, f21263i, f21265k)));
            sb.append(f21256b[f21261g]);
            sb.append(String.valueOf(C8674x.f21247c));
        } else if (i == 1) {
            sb = new StringBuilder();
            sb.append(String.valueOf(Arrays.copyOf(C8675y.f21254b, f21262h)));
            sb.append(f21256b[f21261g]);
            sb.append(String.valueOf(Arrays.copyOfRange(C8675y.f21254b, f21262h, f21263i)));
            sb.append(f21256b[f21261g]);
            sb.append(String.valueOf(Arrays.copyOfRange(C8675y.f21254b, f21264j, f21266l)));
        } else if (i == 2) {
            sb = new StringBuilder();
            sb.append(String.valueOf(Arrays.copyOfRange(C8675y.f21254b, f21265k, f21264j)));
            sb.append(String.valueOf(f21255a));
        } else if (i != 3) {
            sb = null;
        } else {
            sb = new StringBuilder();
            sb.append(String.valueOf(Arrays.copyOfRange(C8675y.f21254b, f21265k, f21264j)));
            sb.append(String.valueOf(C8674x.f21247c));
        }
        return sb.toString().toCharArray();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r2 = new java.lang.StringBuilder("&rtins_type=");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r2.append(0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0025 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0042 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized java.lang.String m24911a(java.lang.String r2, android.content.Context r3, java.lang.String r4) {
        /*
            java.lang.Class<com.mbridge.msdk.foundation.tools.z> r0 = com.mbridge.msdk.foundation.tools.C8677z.class
            monitor-enter(r0)
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch:{ Exception -> 0x0025 }
            java.util.Set r2 = r2.getQueryParameterNames()     // Catch:{ Exception -> 0x0025 }
            if (r2 == 0) goto L_0x001b
            int r2 = r2.size()     // Catch:{ Exception -> 0x0025 }
            if (r2 <= 0) goto L_0x001b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0025 }
            java.lang.String r1 = "&rtins_type="
            r2.<init>(r1)     // Catch:{ Exception -> 0x0025 }
            goto L_0x002c
        L_0x001b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0025 }
            java.lang.String r1 = "?rtins_type="
            r2.<init>(r1)     // Catch:{ Exception -> 0x0025 }
            goto L_0x002c
        L_0x0023:
            r2 = move-exception
            goto L_0x004b
        L_0x0025:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0023 }
            java.lang.String r1 = "&rtins_type="
            r2.<init>(r1)     // Catch:{ all -> 0x0023 }
        L_0x002c:
            r1 = 0
            java.lang.Object r3 = m24925b((java.lang.String) r4, (android.content.Context) r3)     // Catch:{ Exception -> 0x0042 }
            r4 = 1
            if (r3 == 0) goto L_0x0036
            r3 = r4
            goto L_0x0037
        L_0x0036:
            r3 = r1
        L_0x0037:
            if (r3 == 0) goto L_0x003d
            r2.append(r4)     // Catch:{ Exception -> 0x0042 }
            goto L_0x0045
        L_0x003d:
            r3 = 2
            r2.append(r3)     // Catch:{ Exception -> 0x0042 }
            goto L_0x0045
        L_0x0042:
            r2.append(r1)     // Catch:{ all -> 0x0023 }
        L_0x0045:
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0023 }
            monitor-exit(r0)
            return r2
        L_0x004b:
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.C8677z.m24911a(java.lang.String, android.content.Context, java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|4|5|6|7|8) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000f */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.lang.String m24910a(android.content.Context r2, java.lang.String r3, java.lang.String r4) {
        /*
            java.lang.Class<com.mbridge.msdk.foundation.tools.z> r0 = com.mbridge.msdk.foundation.tools.C8677z.class
            monitor-enter(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0015 }
            r1.<init>(r4)     // Catch:{ all -> 0x0015 }
            java.lang.String r2 = m24911a((java.lang.String) r4, (android.content.Context) r2, (java.lang.String) r3)     // Catch:{ Exception -> 0x000f }
            r1.append(r2)     // Catch:{ Exception -> 0x000f }
        L_0x000f:
            java.lang.String r2 = r1.toString()     // Catch:{ all -> 0x0015 }
            monitor-exit(r0)
            return r2
        L_0x0015:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.C8677z.m24910a(android.content.Context, java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x012d, code lost:
        return r2;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized java.lang.String m24944f(java.lang.String r10) {
        /*
            java.lang.Class<com.mbridge.msdk.foundation.tools.z> r0 = com.mbridge.msdk.foundation.tools.C8677z.class
            monitor-enter(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0138 }
            r1.<init>()     // Catch:{ Exception -> 0x0138 }
            com.mbridge.msdk.foundation.controller.a r2 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ Exception -> 0x0138 }
            java.lang.String r2 = r2.mo56914h()     // Catch:{ Exception -> 0x0138 }
            r1.append(r2)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r2 = "_"
            r1.append(r2)     // Catch:{ Exception -> 0x0138 }
            r1.append(r10)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r10 = r1.toString()     // Catch:{ Exception -> 0x0138 }
            com.mbridge.msdk.c.b r1 = com.mbridge.msdk.p078c.C2445b.m6020a()     // Catch:{ Exception -> 0x0138 }
            com.mbridge.msdk.foundation.controller.a r2 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ Exception -> 0x0138 }
            java.lang.String r2 = r2.mo56914h()     // Catch:{ Exception -> 0x0138 }
            com.mbridge.msdk.c.a r1 = r1.mo16286b(r2)     // Catch:{ Exception -> 0x0138 }
            r2 = 3
            r3 = 0
            if (r1 == 0) goto L_0x0047
            boolean r2 = r1.mo16196an()     // Catch:{ Exception -> 0x0138 }
            boolean r4 = r1.mo16194al()     // Catch:{ Exception -> 0x0138 }
            int r1 = r1.mo16195am()     // Catch:{ Exception -> 0x0138 }
            int r1 = java.lang.Math.max(r3, r1)     // Catch:{ Exception -> 0x0138 }
            r9 = r2
            r2 = r1
            r1 = r9
            goto L_0x0049
        L_0x0047:
            r1 = 1
            r4 = r3
        L_0x0049:
            if (r4 == 0) goto L_0x0132
            if (r2 != 0) goto L_0x004f
            goto L_0x0132
        L_0x004f:
            if (r1 == 0) goto L_0x0067
            java.util.Map<java.lang.String, java.lang.String> r4 = f21271q     // Catch:{ Exception -> 0x0138 }
            if (r4 == 0) goto L_0x0067
            java.util.Map<java.lang.String, java.lang.String> r4 = f21271q     // Catch:{ Exception -> 0x0138 }
            boolean r4 = r4.containsKey(r10)     // Catch:{ Exception -> 0x0138 }
            if (r4 == 0) goto L_0x0067
            java.util.Map<java.lang.String, java.lang.String> r1 = f21271q     // Catch:{ Exception -> 0x0138 }
            java.lang.Object r10 = r1.get(r10)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x0138 }
            monitor-exit(r0)
            return r10
        L_0x0067:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0138 }
            java.lang.String r5 = ""
            r4.<init>(r5)     // Catch:{ Exception -> 0x0138 }
            java.lang.Exception r5 = new java.lang.Exception     // Catch:{ Exception -> 0x0138 }
            r5.<init>()     // Catch:{ Exception -> 0x0138 }
            java.lang.StackTraceElement[] r5 = r5.getStackTrace()     // Catch:{ Exception -> 0x0138 }
            if (r5 == 0) goto L_0x0142
            int r6 = r5.length     // Catch:{ Exception -> 0x0138 }
            if (r6 <= 0) goto L_0x0142
            java.util.List r5 = m24913a((java.lang.StackTraceElement[]) r5)     // Catch:{ Exception -> 0x0138 }
            java.util.Collections.reverse(r5)     // Catch:{ Exception -> 0x0138 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x0138 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x0138 }
            r6.<init>()     // Catch:{ Exception -> 0x0138 }
        L_0x008c:
            boolean r7 = r5.hasNext()     // Catch:{ Exception -> 0x0138 }
            if (r7 == 0) goto L_0x00ca
            java.lang.Object r7 = r5.next()     // Catch:{ Exception -> 0x0138 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x0138 }
            java.lang.String r8 = "com.android"
            boolean r8 = r7.startsWith(r8)     // Catch:{ Exception -> 0x0138 }
            if (r8 != 0) goto L_0x008c
            java.lang.String r8 = "android.os"
            boolean r8 = r7.startsWith(r8)     // Catch:{ Exception -> 0x0138 }
            if (r8 != 0) goto L_0x008c
            java.lang.String r8 = "android.app"
            boolean r8 = r7.startsWith(r8)     // Catch:{ Exception -> 0x0138 }
            if (r8 != 0) goto L_0x008c
            java.lang.String r8 = "java.lang.reflect.Method"
            boolean r8 = r7.startsWith(r8)     // Catch:{ Exception -> 0x0138 }
            if (r8 != 0) goto L_0x008c
            java.lang.String r8 = "android.view"
            boolean r8 = r7.startsWith(r8)     // Catch:{ Exception -> 0x0138 }
            if (r8 != 0) goto L_0x008c
            boolean r8 = r6.contains(r7)     // Catch:{ Exception -> 0x0138 }
            if (r8 != 0) goto L_0x008c
            r6.add(r7)     // Catch:{ Exception -> 0x0138 }
            goto L_0x008c
        L_0x00ca:
            int r5 = r6.size()     // Catch:{ Exception -> 0x0138 }
            int r2 = java.lang.Math.min(r5, r2)     // Catch:{ Exception -> 0x0138 }
            if (r2 <= 0) goto L_0x00eb
        L_0x00d4:
            if (r3 >= r2) goto L_0x00eb
            java.lang.Object r5 = r6.get(r3)     // Catch:{ Exception -> 0x0138 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0138 }
            r4.append(r5)     // Catch:{ Exception -> 0x0138 }
            int r5 = r2 + -1
            if (r3 >= r5) goto L_0x00e8
            java.lang.String r5 = "|"
            r4.append(r5)     // Catch:{ Exception -> 0x0138 }
        L_0x00e8:
            int r3 = r3 + 1
            goto L_0x00d4
        L_0x00eb:
            r2 = 0
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x0138 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x0138 }
            if (r3 != 0) goto L_0x0104
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0138 }
            r2.<init>()     // Catch:{ Exception -> 0x0138 }
            java.lang.String r3 = "1"
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0138 }
            r2.put(r3, r4)     // Catch:{ Exception -> 0x0138 }
        L_0x0104:
            if (r2 == 0) goto L_0x012e
            int r3 = r2.length()     // Catch:{ Exception -> 0x0138 }
            if (r3 <= 0) goto L_0x012e
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0138 }
            java.lang.String r2 = com.mbridge.msdk.foundation.tools.C8611a.m24708a(r2)     // Catch:{ Exception -> 0x0138 }
            if (r1 == 0) goto L_0x012c
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0138 }
            if (r1 != 0) goto L_0x012c
            java.util.Map<java.lang.String, java.lang.String> r1 = f21271q     // Catch:{ Exception -> 0x0138 }
            if (r1 != 0) goto L_0x0127
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ Exception -> 0x0138 }
            r1.<init>()     // Catch:{ Exception -> 0x0138 }
            f21271q = r1     // Catch:{ Exception -> 0x0138 }
        L_0x0127:
            java.util.Map<java.lang.String, java.lang.String> r1 = f21271q     // Catch:{ Exception -> 0x0138 }
            r1.put(r10, r2)     // Catch:{ Exception -> 0x0138 }
        L_0x012c:
            monitor-exit(r0)
            return r2
        L_0x012e:
            java.lang.String r10 = ""
            monitor-exit(r0)
            return r10
        L_0x0132:
            java.lang.String r10 = ""
            monitor-exit(r0)
            return r10
        L_0x0136:
            r10 = move-exception
            goto L_0x0146
        L_0x0138:
            r10 = move-exception
            java.lang.String r1 = "SameTools"
            java.lang.String r10 = r10.getMessage()     // Catch:{ all -> 0x0136 }
            com.mbridge.msdk.foundation.tools.C8672v.m24878d(r1, r10)     // Catch:{ all -> 0x0136 }
        L_0x0142:
            java.lang.String r10 = ""
            monitor-exit(r0)
            return r10
        L_0x0146:
            monitor-exit(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.C8677z.m24944f(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static synchronized void m24918a(String str, String str2) {
        synchronized (C8677z.class) {
            if (f21272r == null) {
                f21272r = new HashMap();
            }
            f21272r.put(C8388a.m23845e().mo56914h() + "_" + str, str2);
        }
    }

    /* renamed from: g */
    public static synchronized String m24946g(String str) {
        synchronized (C8677z.class) {
            String str2 = C8388a.m23845e().mo56914h() + "_" + str;
            if (f21272r == null || !f21272r.containsKey(str2)) {
                return null;
            }
            String str3 = f21272r.get(str2);
            return str3;
        }
    }

    /* renamed from: a */
    private static List<String> m24913a(StackTraceElement[] stackTraceElementArr) {
        ArrayList arrayList = new ArrayList();
        if (stackTraceElementArr != null && stackTraceElementArr.length > 0) {
            for (StackTraceElement className : stackTraceElementArr) {
                arrayList.add(className.getClassName());
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public static final int m24939e() {
        if (f21273s == null) {
            try {
                f21273s = C8649n.C8655a.f21197a.mo58150e();
            } catch (Exception e) {
                C8672v.m24878d("SameTools", e.getMessage());
            }
        }
        if (f21273s != null) {
            return f21273s.booleanValue() ? 1 : 0;
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x002c */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[ExcHandler: all (unused java.lang.Throwable), SYNTHETIC, Splitter:B:3:0x0008] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m24948h(java.lang.String r4) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch:{ Exception -> 0x0046, all -> 0x0053 }
            r0 = 1
            if (r4 == 0) goto L_0x0045
            java.lang.String r2 = "dyview"
            java.lang.String r2 = r4.getQueryParameter(r2)     // Catch:{ Exception -> 0x0046, all -> 0x0053 }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0046, all -> 0x0053 }
            if (r3 == 0) goto L_0x0021
            java.lang.String r2 = "view"
            java.lang.String r2 = r4.getQueryParameter(r2)     // Catch:{ Exception -> 0x0046, all -> 0x0053 }
        L_0x0021:
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0046, all -> 0x0053 }
            if (r3 != 0) goto L_0x0032
            r3 = -1
            int r3 = java.lang.Integer.parseInt(r2)     // Catch:{ Exception -> 0x002c, all -> 0x0053 }
        L_0x002c:
            int r3 = r3 % 2
            if (r3 != 0) goto L_0x0032
            r2 = r0
            goto L_0x0033
        L_0x0032:
            r2 = r1
        L_0x0033:
            java.lang.String r3 = "natmp"
            java.lang.String r4 = r4.getQueryParameter(r3)     // Catch:{ Exception -> 0x0043 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x0043 }
            if (r4 != 0) goto L_0x0041
            r1 = r0
            goto L_0x0045
        L_0x0041:
            r1 = r2
            goto L_0x0045
        L_0x0043:
            r4 = move-exception
            goto L_0x0048
        L_0x0045:
            return r1
        L_0x0046:
            r4 = move-exception
            r2 = r1
        L_0x0048:
            java.lang.String r0 = "SameTools"
            java.lang.String r4 = r4.getMessage()     // Catch:{ all -> 0x0052 }
            com.mbridge.msdk.foundation.tools.C8672v.m24878d(r0, r4)     // Catch:{ all -> 0x0052 }
            return r1
        L_0x0052:
            r1 = r2
        L_0x0053:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.C8677z.m24948h(java.lang.String):boolean");
    }

    /* renamed from: i */
    public static boolean m24950i(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse == null || TextUtils.isEmpty(parse.getQueryParameter(MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW))) {
                return false;
            }
            return true;
        } catch (Exception e) {
            C8672v.m24878d("SameTools", e.getMessage());
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: j */
    public static boolean m24952j(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                return false;
            }
            String queryParameter = parse.getQueryParameter(MBridgeConstans.ENDCARD_URL_IS_PLAYABLE);
            if (!TextUtils.isEmpty(queryParameter)) {
                return queryParameter.equals("0");
            }
            return false;
        } catch (Exception e) {
            C8672v.m24878d("SameTools", e.getMessage());
            return false;
        }
    }

    /* renamed from: k */
    public static boolean m24954k(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                return false;
            }
            String queryParameter = parse.getQueryParameter(MBridgeConstans.DYNAMIC_VIEW_CAN_ANIM);
            if (!TextUtils.isEmpty(queryParameter)) {
                return queryParameter.equals("1");
            }
            return false;
        } catch (Exception e) {
            C8672v.m24878d("SameTools", e.getMessage());
            return false;
        }
    }

    /* renamed from: l */
    public static int m24955l(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                return -1;
            }
            String queryParameter = parse.getQueryParameter(MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW);
            if (TextUtils.isEmpty(queryParameter)) {
                queryParameter = parse.getQueryParameter("view");
            }
            if (TextUtils.isEmpty(queryParameter)) {
                return -1;
            }
            try {
                return Integer.parseInt(queryParameter);
            } catch (Exception unused) {
                return -1;
            }
        } catch (Exception e) {
            C8672v.m24878d("SameTools", e.getMessage());
            return -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
        if ((r5 + (r3 * 1000)) >= r7) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006f, code lost:
        if ((r5 + (r3.mo16156K() * 1000)) >= r7) goto L_0x0073;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m24958m(java.lang.String r14) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            java.util.concurrent.ConcurrentHashMap r14 = com.mbridge.msdk.foundation.same.p300a.C8473d.m24278a(r14)
            if (r14 == 0) goto L_0x009a
            int r0 = r14.size()
            if (r0 <= 0) goto L_0x009a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Collection r14 = r14.values()
            java.util.Iterator r14 = r14.iterator()
        L_0x0022:
            boolean r2 = r14.hasNext()
            if (r2 == 0) goto L_0x0085
            java.lang.Object r2 = r14.next()
            com.mbridge.msdk.foundation.entity.b r2 = (com.mbridge.msdk.foundation.entity.C8457b) r2
            if (r2 == 0) goto L_0x0022
            long r3 = r2.mo57682d()
            long r5 = r2.mo57683e()
            long r7 = java.lang.System.currentTimeMillis()
            r9 = 0
            int r9 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            r10 = 1
            r11 = 0
            r12 = 1000(0x3e8, double:4.94E-321)
            if (r9 <= 0) goto L_0x004d
            long r3 = r3 * r12
            long r5 = r5 + r3
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 < 0) goto L_0x0072
            goto L_0x0073
        L_0x004d:
            com.mbridge.msdk.c.b r3 = com.mbridge.msdk.p078c.C2445b.m6020a()
            com.mbridge.msdk.foundation.controller.a r4 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()
            java.lang.String r4 = r4.mo56914h()
            com.mbridge.msdk.c.a r3 = r3.mo16286b(r4)
            if (r3 != 0) goto L_0x0067
            com.mbridge.msdk.c.b r3 = com.mbridge.msdk.p078c.C2445b.m6020a()
            com.mbridge.msdk.c.a r3 = r3.mo16285b()
        L_0x0067:
            long r3 = r3.mo16156K()
            long r3 = r3 * r12
            long r5 = r5 + r3
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 < 0) goto L_0x0072
            goto L_0x0073
        L_0x0072:
            r10 = r11
        L_0x0073:
            if (r10 == 0) goto L_0x0022
            java.util.List r2 = r2.mo57679c()
            if (r2 == 0) goto L_0x0022
            int r3 = r2.size()
            if (r3 <= 0) goto L_0x0022
            r0.addAll(r2)
            goto L_0x0022
        L_0x0085:
            int r14 = r0.size()
            if (r14 <= 0) goto L_0x009a
            java.util.HashSet r14 = new java.util.HashSet
            r14.<init>(r0)
            r0.clear()
            r0.addAll(r14)
            java.lang.String r1 = r0.toString()
        L_0x009a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.C8677z.m24958m(java.lang.String):java.lang.String");
    }

    /* renamed from: f */
    public static final String m24943f() {
        return C8649n.C8655a.f21197a.mo58151f();
    }
}
