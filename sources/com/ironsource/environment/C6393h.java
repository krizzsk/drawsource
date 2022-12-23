package com.ironsource.environment;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.graphics.Paint;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.provider.Settings;
import android.support.p003v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.ironsource.environment.p204e.C6387c;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.smaato.sdk.core.gdpr.CmpApiConstants;
import java.io.File;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import java.util.UUID;

/* renamed from: com.ironsource.environment.h */
public final class C6393h {

    /* renamed from: a */
    private static String f16182a = null;

    /* renamed from: b */
    private static String f16183b = null;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static String f16184c = "";
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static String f16185d = "";

    /* renamed from: e */
    private static volatile String[] f16186e;

    /* renamed from: A */
    public static String m19088A(Context context) {
        return m19105c(context) ? "Tablet" : "Phone";
    }

    /* renamed from: B */
    public static String m19089B(Context context) {
        C6392g gVar = C6392g.f16178a;
        if (!C6392g.m19083a()) {
            return "";
        }
        try {
            Class<?> cls = Class.forName("com.google.android.gms.appset.AppSet");
            Object invoke = cls.getMethod("getClient", new Class[]{Context.class}).invoke(cls, new Object[]{context});
            Object invoke2 = invoke.getClass().getMethod("getAppSetIdInfo", new Class[0]).invoke(invoke, new Object[0]);
            Class<?> cls2 = Class.forName("com.google.android.gms.tasks.OnSuccessListener");
            invoke2.getClass().getMethod("addOnSuccessListener", new Class[]{cls2}).invoke(invoke2, new Object[]{Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{cls2}, new InvocationHandler() {
                public final Object invoke(Object obj, Method method, Object[] objArr) {
                    if (objArr == null) {
                        return null;
                    }
                    try {
                        if (objArr.length <= 0 || objArr[0] == null) {
                            return null;
                        }
                        String obj2 = objArr[0].getClass().getMethod("getId", new Class[0]).invoke(objArr[0], new Object[0]).toString();
                        if (TextUtils.isEmpty(obj2)) {
                            return null;
                        }
                        String unused = C6393h.f16185d = obj2;
                        return null;
                    } catch (Exception unused2) {
                        return null;
                    }
                }
            })});
            return !TextUtils.isEmpty(f16185d) ? f16185d : "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: C */
    public static String[] m19090C(Context context) {
        String[] strArr = new String[0];
        C6392g gVar = C6392g.f16178a;
        if (!C6392g.m19085b()) {
            return strArr;
        }
        try {
            C6392g gVar2 = C6392g.f16178a;
            if (!C6392g.m19087c()) {
                return m19093F(context);
            }
            if (f16186e != null) {
                return f16186e;
            }
            String[] F = m19093F(context);
            if (TextUtils.isEmpty(F[0])) {
                return F;
            }
            f16186e = F;
            return F;
        } catch (Exception unused) {
            return strArr;
        }
    }

    /* renamed from: D */
    public static int m19091D(Context context) {
        try {
            return IronSourceSharedPreferencesUtilities.getIntFromDefaultSharedPrefs(context, CmpApiConstants.IABTCF_GDPR_APPLIES, -1);
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: E */
    public static String m19092E(Context context) {
        try {
            return IronSourceSharedPreferencesUtilities.getStringFromDefaultSharedPrefs(context, CmpApiConstants.IABTCF_TC_STRING, (String) null);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: F */
    private static String[] m19093F(Context context) {
        Class<?> cls = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
        Object invoke = cls.getMethod("getAdvertisingIdInfo", new Class[]{Context.class}).invoke(cls, new Object[]{context});
        Method method = invoke.getClass().getMethod("getId", new Class[0]);
        Method method2 = invoke.getClass().getMethod("isLimitAdTrackingEnabled", new Class[0]);
        String obj = method.invoke(invoke, new Object[0]).toString();
        boolean booleanValue = ((Boolean) method2.invoke(invoke, new Object[0])).booleanValue();
        StringBuilder sb = new StringBuilder();
        sb.append(booleanValue);
        return new String[]{obj, sb.toString()};
    }

    /* renamed from: a */
    public static long m19094a() {
        return Calendar.getInstance(TimeZone.getDefault()).getTime().getTime();
    }

    /* renamed from: a */
    private static long m19095a(File file) {
        long j;
        long j2;
        StatFs statFs = new StatFs(file.getPath());
        if (Build.VERSION.SDK_INT < 19) {
            j2 = (long) statFs.getAvailableBlocks();
            j = (long) statFs.getBlockSize();
        } else {
            j2 = statFs.getAvailableBlocksLong();
            j = statFs.getBlockSizeLong();
        }
        return (j2 * j) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
    }

    /* renamed from: a */
    public static long m19096a(String str) {
        return m19095a(new File(str));
    }

    /* renamed from: a */
    public static String m19097a(Context context) {
        return context.getResources().getConfiguration().locale.getLanguage();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0010, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m19098a(android.content.Context r3, java.lang.String r4) {
        /*
            java.lang.Class<com.ironsource.environment.h> r0 = com.ironsource.environment.C6393h.class
            monitor-enter(r0)
            java.lang.String r1 = "Mediation_Shared_Preferences"
            java.lang.String r2 = "browser_user_agent"
            com.ironsource.environment.IronSourceSharedPreferencesUtilities.saveStringToSharedPrefs(r3, r1, r2, r4)     // Catch:{ Exception -> 0x000f, all -> 0x000c }
            monitor-exit(r0)
            return
        L_0x000c:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        L_0x000f:
            monitor-exit(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.environment.C6393h.m19098a(android.content.Context, java.lang.String):void");
    }

    /* renamed from: a */
    public static boolean m19099a(Activity activity) {
        int systemUiVisibility = activity.getWindow().getDecorView().getSystemUiVisibility();
        return (systemUiVisibility | 4096) == systemUiVisibility || (systemUiVisibility | 2048) == systemUiVisibility;
    }

    /* renamed from: b */
    public static int m19100b() {
        return -(TimeZone.getDefault().getOffset(m19094a()) / 60000);
    }

    /* renamed from: b */
    public static String m19101b(Context context) {
        return context.getResources().getConfiguration().locale.getCountry();
    }

    /* renamed from: c */
    public static String m19103c() {
        String id = TimeZone.getDefault().getID();
        return id != null ? id : "";
    }

    /* renamed from: c */
    public static boolean m19105c(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            if (((float) displayMetrics.widthPixels) / displayMetrics.density >= 600.0f) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static long m19106d(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        if (activityManager == null) {
            return -1;
        }
        activityManager.getMemoryInfo(memoryInfo);
        if (Build.VERSION.SDK_INT >= 16) {
            return memoryInfo.totalMem;
        }
        return -1;
    }

    /* renamed from: d */
    public static boolean m19107d() {
        return "mounted".equals(Environment.getExternalStorageState()) && Environment.isExternalStorageRemovable();
    }

    /* renamed from: d */
    private static boolean m19108d(String str) {
        try {
            String[] strArr = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};
            for (int i = 0; i < 8; i++) {
                if (new File(strArr[i] + str).exists()) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: e */
    public static String m19109e() {
        return Build.VERSION.RELEASE;
    }

    /* renamed from: e */
    public static boolean m19110e(Context context) {
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int i = -1;
        if (registerReceiver != null) {
            i = registerReceiver.getIntExtra("status", -1);
        }
        return i == 2 || i == 5;
    }

    /* renamed from: f */
    public static int m19111f() {
        return Build.VERSION.SDK_INT;
    }

    /* renamed from: f */
    public static int m19112f(Context context) {
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return registerReceiver.getIntExtra("plugged", -1);
        }
        return -1;
    }

    /* renamed from: g */
    public static String m19113g() {
        return Build.MODEL;
    }

    /* renamed from: g */
    public static boolean m19114g(Context context) {
        try {
            return Build.VERSION.SDK_INT >= 17 && Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /* renamed from: h */
    public static String m19115h() {
        return Build.MANUFACTURER;
    }

    /* renamed from: h */
    public static boolean m19116h(Context context) {
        try {
            return Build.VERSION.SDK_INT >= 17 && Settings.Global.getInt(context.getContentResolver(), "stay_on_while_plugged_in", 0) != 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /* renamed from: i */
    public static String m19117i() {
        return "android";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = (android.telephony.TelephonyManager) r2.getSystemService("phone");
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m19118i(android.content.Context r2) {
        /*
            java.lang.String r0 = ""
            if (r2 == 0) goto L_0x0013
            java.lang.String r1 = "phone"
            java.lang.Object r2 = r2.getSystemService(r1)
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2
            if (r2 == 0) goto L_0x0013
            java.lang.String r2 = r2.getNetworkOperatorName()
            return r2
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.environment.C6393h.m19118i(android.content.Context):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = (android.telephony.TelephonyManager) r2.getSystemService("phone");
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m19119j(android.content.Context r2) {
        /*
            java.lang.String r0 = ""
            if (r2 == 0) goto L_0x0013
            java.lang.String r1 = "phone"
            java.lang.Object r2 = r2.getSystemService(r1)
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2
            if (r2 == 0) goto L_0x0013
            java.lang.String r2 = r2.getNetworkCountryIso()
            return r2
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.environment.C6393h.m19119j(android.content.Context):java.lang.String");
    }

    /* renamed from: j */
    public static boolean m19120j() {
        return m19108d(DownloadCommon.DOWNLOAD_REPORT_SUCCESS);
    }

    /* renamed from: k */
    public static int m19121k() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    /* renamed from: k */
    public static int m19122k(Context context) {
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
    }

    /* renamed from: l */
    public static float m19123l(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        try {
            return ((float) audioManager.getStreamVolume(3)) / ((float) audioManager.getStreamMaxVolume(3));
        } catch (Exception e) {
            e.printStackTrace();
            return -1.0f;
        }
    }

    /* renamed from: l */
    public static int m19124l() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    /* renamed from: m */
    public static int m19125m() {
        return m19121k();
    }

    /* renamed from: m */
    public static int m19126m(Context context) {
        if (context instanceof Activity) {
            return ((Activity) context).getRequestedOrientation();
        }
        return -1;
    }

    /* renamed from: n */
    public static int m19127n() {
        return m19124l();
    }

    /* renamed from: n */
    public static String m19128n(Context context) {
        if (context == null) {
            return "";
        }
        int m = m19126m(context);
        if (m != 0) {
            if (m != 1) {
                if (m != 11) {
                    if (m != 12) {
                        switch (m) {
                            case 6:
                            case 8:
                                break;
                            case 7:
                            case 9:
                                break;
                            default:
                                return "none";
                        }
                    }
                }
            }
            return "portrait";
        }
        return "landscape";
    }

    /* renamed from: o */
    public static float m19129o() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    /* renamed from: o */
    public static int m19130o(Context context) {
        return context.getResources().getConfiguration().orientation;
    }

    /* renamed from: p */
    public static long m19131p() {
        return m19095a(Environment.getDataDirectory());
    }

    /* renamed from: p */
    public static List<ApplicationInfo> m19132p(Context context) {
        return context.getPackageManager().getInstalledApplications(0);
    }

    /* renamed from: q */
    public static void m19133q() {
        final Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        if (applicationContext == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            try {
                String defaultUserAgent = WebSettings.getDefaultUserAgent(applicationContext);
                f16184c = defaultUserAgent;
                m19098a(applicationContext, defaultUserAgent);
            } catch (Exception unused) {
            }
        } else {
            C6387c.m19068a(new Runnable() {
                public final void run() {
                    try {
                        WebView webView = new WebView(applicationContext);
                        webView.setLayerType(1, (Paint) null);
                        String unused = C6393h.f16184c = webView.getSettings().getUserAgentString();
                        webView.destroy();
                        C6393h.m19098a(applicationContext, C6393h.f16184c);
                    } catch (Exception unused2) {
                    }
                }
            }, 0);
        }
    }

    /* renamed from: q */
    public static boolean m19134q(Context context) {
        return Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation", 0) != 1;
    }

    /* renamed from: r */
    public static File m19135r(Context context) {
        return context.getExternalCacheDir();
    }

    /* renamed from: r */
    public static String m19136r() {
        Context applicationContext;
        if (!f16184c.isEmpty() || (applicationContext = ContextProvider.getInstance().getApplicationContext()) == null) {
            return f16184c;
        }
        try {
            return IronSourceSharedPreferencesUtilities.getStringFromSharedPrefs(applicationContext, "Mediation_Shared_Preferences", "browser_user_agent", "");
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: s */
    public static File m19137s(Context context) {
        return context.getExternalFilesDir((String) null);
    }

    /* renamed from: t */
    public static File m19139t(Context context) {
        return context.getCacheDir();
    }

    /* renamed from: u */
    public static File m19140u(Context context) {
        return context.getFilesDir();
    }

    /* renamed from: v */
    public static int m19141v(Context context) {
        try {
            Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int i = 0;
            int intExtra = registerReceiver != null ? registerReceiver.getIntExtra("level", -1) : 0;
            if (registerReceiver != null) {
                i = registerReceiver.getIntExtra("scale", -1);
            }
            if (intExtra == -1 || i == -1) {
                return -1;
            }
            return (int) ((((float) intExtra) / ((float) i)) * 100.0f);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    /* renamed from: w */
    public static boolean m19142w(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((PowerManager) context.getSystemService("power")).isPowerSaveMode();
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: x */
    public static synchronized String m19143x(Context context) {
        synchronized (C6393h.class) {
            if (!TextUtils.isEmpty(f16182a)) {
                String str = f16182a;
                return str;
            }
            if (IronSourceSharedPreferencesUtilities.m18996a(context, "Mediation_Shared_Preferences", "uuidEnabled", true)) {
                String stringFromSharedPrefs = IronSourceSharedPreferencesUtilities.getStringFromSharedPrefs(context, "Mediation_Shared_Preferences", "cachedUUID", "");
                if (TextUtils.isEmpty(stringFromSharedPrefs)) {
                    String uuid = UUID.randomUUID().toString();
                    f16182a = uuid;
                    IronSourceSharedPreferencesUtilities.saveStringToSharedPrefs(context, "Mediation_Shared_Preferences", "cachedUUID", uuid);
                } else {
                    f16182a = stringFromSharedPrefs;
                }
            }
            String str2 = f16182a;
            return str2;
        }
    }

    /* renamed from: y */
    public static synchronized String m19144y(Context context) {
        synchronized (C6393h.class) {
            if (!TextUtils.isEmpty(f16183b)) {
                String str = f16183b;
                return str;
            } else if (context == null) {
                return "";
            } else {
                String stringFromSharedPrefs = IronSourceSharedPreferencesUtilities.getStringFromSharedPrefs(context, "supersonic_shared_preferen", "auid", "");
                f16183b = stringFromSharedPrefs;
                if (TextUtils.isEmpty(stringFromSharedPrefs)) {
                    String uuid = UUID.randomUUID().toString();
                    f16183b = uuid;
                    IronSourceSharedPreferencesUtilities.saveStringToSharedPrefs(context, "supersonic_shared_preferen", "auid", uuid);
                }
                String str2 = f16183b;
                return str2;
            }
        }
    }

    /* renamed from: z */
    public static int m19145z(Context context) {
        if (context != null) {
            return Settings.System.getInt(context.getContentResolver(), "screen_brightness", -1);
        }
        return -1;
    }
}
