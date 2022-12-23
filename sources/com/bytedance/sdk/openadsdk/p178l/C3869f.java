package com.bytedance.sdk.openadsdk.p178l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityManager;
import com.bytedance.JProtect;
import com.bytedance.sdk.component.p123f.C2882e;
import com.bytedance.sdk.component.p123f.C2885g;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.component.utils.C2906m;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.openadsdk.core.C3388c;
import com.bytedance.sdk.openadsdk.core.C3472j;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.C3576r;
import com.bytedance.sdk.openadsdk.core.p153i.C3471f;
import com.bytedance.sdk.openadsdk.p178l.C3858c;
import com.com.bytedance.overseas.sdk.p186b.C3970a;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.smaato.sdk.video.vast.model.Verification;
import com.tapjoy.TapjoyConstants;
import com.vungle.warren.VungleApiClient;
import java.io.IOException;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.l.f */
/* compiled from: DeviceUtils */
public class C3869f {

    /* renamed from: a */
    public static String f9929a = "";

    /* renamed from: b */
    private static volatile boolean f9930b = false;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static volatile boolean f9931c = false;

    /* renamed from: d */
    private static volatile boolean f9932d = false;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static volatile boolean f9933e = true;

    /* renamed from: f */
    private static long f9934f;

    /* renamed from: g */
    private static int f9935g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static int f9936h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static int f9937i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static int f9938j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static int f9939k;

    @JProtect
    /* renamed from: a */
    public static JSONObject m12607a(Context context, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sys_adb_status", m12624f(context));
            m12609a(jSONObject);
            jSONObject.put("type", m12621d(context));
            int i = 1;
            jSONObject.put("os", 1);
            jSONObject.put(TapjoyConstants.TJC_DEVICE_OS_VERSION_NAME, Build.VERSION.RELEASE + "");
            jSONObject.put(Verification.VENDOR, Build.MANUFACTURER);
            jSONObject.put("conn_type", C3898x.m12832p(context));
            jSONObject.put("screen_width", C3904y.m12877c(context));
            jSONObject.put("screen_height", C3904y.m12881d(context));
            if (C3513m.m10973h().mo19826C()) {
                jSONObject.put("sec_did", C3576r.m11309a().mo20126c());
            }
            C3471f h = C3513m.m10973h();
            if (h.mo19876p("boot")) {
                jSONObject.put("boot", (System.currentTimeMillis() - SystemClock.elapsedRealtime()) + "");
                jSONObject.put("power_on_time", SystemClock.elapsedRealtime() + "");
            }
            jSONObject.put("uuid", C3472j.m10778c(context));
            jSONObject.put("rom_version", C3886o.m12676a());
            jSONObject.put("sys_compiling_time", C3472j.m10777b(context));
            jSONObject.put(TapjoyConstants.TJC_DEVICE_TIMEZONE, C3898x.m12834q());
            jSONObject.put("language", C3472j.m10773a());
            jSONObject.put(TapjoyConstants.TJC_CARRIER_NAME, C3889p.m12703a());
            jSONObject.put("total_mem", String.valueOf(Long.parseLong(z ? C3898x.m12753a(context) : C3898x.m12770b(context)) * 1024));
            jSONObject.put("locale_language", m12618c());
            jSONObject.put("screen_bright", Math.ceil((double) (m12620d() * 10.0f)) / 10.0d);
            if (m12610a()) {
                i = 0;
            }
            jSONObject.put("is_screen_off", i);
            jSONObject.put("cpu_num", C3898x.m12777c(context));
            jSONObject.put("cpu_max_freq", C3898x.m12783d(context));
            jSONObject.put("cpu_min_freq", C3898x.m12789e(context));
            C3858c.C3861a a = C3858c.m12584a();
            jSONObject.put("battery_remaining_pct", (int) a.f9919b);
            jSONObject.put("is_charging", a.f9918a);
            jSONObject.put("total_space", String.valueOf(C3898x.m12795f(context)));
            jSONObject.put("free_space_in", String.valueOf(C3898x.m12800g(context)));
            jSONObject.put("sdcard_size", String.valueOf(C3898x.m12805h(context)));
            jSONObject.put("rooted", C3898x.m12808i(context));
            jSONObject.put("enable_assisted_clicking", m12622e());
            jSONObject.put("force_language", C2914t.m8151a(context, "tt_choose_language"));
            jSONObject.put("airplane", m12626g(context));
            jSONObject.put("darkmode", m12636m(context));
            jSONObject.put("headset", m12637n(context));
            jSONObject.put("ringmute", m12638o(context));
            jSONObject.put("screenscale", (double) m12639p(context));
            jSONObject.put(TapjoyConstants.TJC_VOLUME, m12640q(context));
            jSONObject.put("low_power_mode", m12641r(context));
            if (h.mo19876p("mnc")) {
                jSONObject.put("mnc", C3889p.m12705c());
            }
            if (h.mo19876p("mcc")) {
                jSONObject.put("mcc", C3889p.m12704b());
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    @JProtect
    /* renamed from: a */
    public static void m12608a(Context context) {
        if (!f9930b) {
            try {
                PowerManager powerManager = (PowerManager) context.getSystemService("power");
                if (powerManager != null) {
                    f9933e = powerManager.isScreenOn();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            try {
                C3874c cVar = new C3874c();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                context.registerReceiver(cVar, intentFilter);
                f9930b = true;
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private static void m12609a(JSONObject jSONObject) throws JSONException {
        m12614b(jSONObject);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        switch(r2) {
            case 52: goto L_0x0054;
            case 53: goto L_0x0043;
            case 54: goto L_0x0037;
            default: goto L_0x0042;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        switch(r3) {
            case 29: goto L_0x0037;
            case 30: goto L_0x0054;
            case 31: goto L_0x003f;
            default: goto L_0x0046;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0046, code lost:
        r3 = 30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e A[Catch:{ all -> 0x0057 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0049 A[Catch:{ all -> 0x0057 }] */
    @com.bytedance.JProtect
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m12610a() {
        /*
            boolean r0 = f9933e
            if (r0 != 0) goto L_0x005b
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = f9934f
            long r0 = r0 - r2
            r2 = 10000(0x2710, double:4.9407E-320)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x005b
            long r0 = android.os.SystemClock.elapsedRealtime()
            f9934f = r0
            android.content.Context r0 = com.bytedance.sdk.openadsdk.core.C3513m.m10963a()     // Catch:{ all -> 0x0057 }
            java.lang.String r1 = "power"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch:{ all -> 0x0057 }
            android.os.PowerManager r0 = (android.os.PowerManager) r0     // Catch:{ all -> 0x0057 }
            if (r0 == 0) goto L_0x005b
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0057 }
            r2 = 20
            r3 = 55
            if (r1 < r2) goto L_0x0033
            boolean r0 = r0.isInteractive()     // Catch:{ all -> 0x0057 }
            r1 = 0
            goto L_0x0051
        L_0x0033:
            boolean r0 = r0.isScreenOn()     // Catch:{ all -> 0x0057 }
        L_0x0037:
            r1 = 73
            r2 = 16
        L_0x003b:
            switch(r1) {
                case 72: goto L_0x005b;
                case 73: goto L_0x0049;
                case 74: goto L_0x003f;
                default: goto L_0x003e;
            }     // Catch:{ all -> 0x0057 }
        L_0x003e:
            goto L_0x0054
        L_0x003f:
            switch(r2) {
                case 52: goto L_0x0054;
                case 53: goto L_0x0043;
                case 54: goto L_0x0037;
                default: goto L_0x0042;
            }     // Catch:{ all -> 0x0057 }
        L_0x0042:
            goto L_0x0050
        L_0x0043:
            switch(r3) {
                case 29: goto L_0x0037;
                case 30: goto L_0x0054;
                case 31: goto L_0x003f;
                default: goto L_0x0046;
            }     // Catch:{ all -> 0x0057 }
        L_0x0046:
            r3 = 30
            goto L_0x0043
        L_0x0049:
            r1 = 57
            if (r2 > r1) goto L_0x0050
            f9933e = r0     // Catch:{ all -> 0x0057 }
            goto L_0x005b
        L_0x0050:
            r1 = r2
        L_0x0051:
            f9933e = r0     // Catch:{ all -> 0x0057 }
            r2 = r1
        L_0x0054:
            r1 = 72
            goto L_0x003b
        L_0x0057:
            r0 = move-exception
            r0.printStackTrace()
        L_0x005b:
            boolean r0 = f9933e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.p178l.C3869f.m12610a():boolean");
    }

    /* renamed from: b */
    public static int m12612b() {
        return C3388c.m10078a(C3513m.m10963a()).mo19368b("limit_ad_track", -1);
    }

    /* renamed from: b */
    private static void m12614b(JSONObject jSONObject) throws JSONException {
        jSONObject.put(DeviceRequestsHelper.DEVICE_INFO_MODEL, Build.MODEL);
        if (C3513m.m10973h().mo19876p(VungleApiClient.GAID)) {
            jSONObject.put(VungleApiClient.GAID, C3970a.m13090a().mo20862b());
        }
    }

    /* renamed from: b */
    public static boolean m12615b(Context context) {
        try {
            return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static String m12618c() {
        if (Build.VERSION.SDK_INT < 21) {
            return Locale.getDefault().getLanguage();
        }
        String languageTag = Locale.getDefault().toLanguageTag();
        return !TextUtils.isEmpty(languageTag) ? languageTag : "";
    }

    /* renamed from: c */
    public static boolean m12619c(Context context) {
        try {
            return (context.getResources().getConfiguration().uiMode & 15) == 4;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: d */
    public static float m12620d() {
        int i = -1;
        try {
            Context a = C3513m.m10963a();
            if (a != null) {
                i = Settings.System.getInt(a.getContentResolver(), "screen_brightness", -1);
            }
        } catch (Throwable th) {
            C2905l.m8118e("DeviceUtils", th.getMessage());
        }
        if (i < 0) {
            return -1.0f;
        }
        return ((float) Math.round((((float) i) / 255.0f) * 10.0f)) / 10.0f;
    }

    /* renamed from: d */
    public static int m12621d(Context context) {
        if (m12619c(context)) {
            return 3;
        }
        return m12615b(context) ? 2 : 1;
    }

    /* renamed from: e */
    public static int m12622e() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) C3513m.m10963a().getSystemService("accessibility");
        if (accessibilityManager == null) {
            return -1;
        }
        return accessibilityManager.isEnabled() ? 1 : 0;
    }

    /* renamed from: e */
    public static JSONObject m12623e(Context context) {
        return m12607a(context, false);
    }

    /* renamed from: f */
    public static int m12624f(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            return Settings.Secure.getInt(Build.VERSION.SDK_INT >= 17 ? context.getContentResolver() : context.getContentResolver(), "adb_enabled", -1);
        } catch (Throwable th) {
            C2905l.m8118e("DeviceUtils", th.getMessage());
            return -1;
        }
    }

    @JProtect
    /* renamed from: f */
    public static void m12625f() {
        new C3875d().run();
        Context a = C3513m.m10963a();
        if (a != null) {
            C3388c.m10078a(a).mo19364a("cpu_count", C3898x.m12804h());
            C3388c.m10078a(a).mo19364a("cpu_max_frequency", C3898x.m12776c(C3898x.m12804h()));
            C3388c.m10078a(a).mo19364a("cpu_min_frequency", C3898x.m12782d(C3898x.m12804h()));
            String e = C3898x.m12792e(a, "MemTotal");
            if (e != null) {
                C3388c.m10078a(a).mo19366a("total_memory", e);
            }
            C3388c.m10078a(a).mo19365a("total_internal_storage", C3898x.m12809i());
            C3388c.m10078a(a).mo19365a("free_internal_storage", C2906m.m8119a());
            C3388c.m10078a(a).mo19365a("total_sdcard_storage", C3898x.m12812j());
            C3388c.m10078a(a).mo19364a("is_root", C3898x.m12818k() ? 1 : 0);
            if (TextUtils.isEmpty(m12629h(a))) {
                try {
                    Class.forName("com.unity3d.player.UnityPlayer");
                    f9929a = TapjoyConstants.TJC_PLUGIN_UNITY;
                } catch (ClassNotFoundException unused) {
                    f9929a = "native";
                }
                C3388c.m10078a(a).mo19366a("framework_name", f9929a);
            }
            m12627g();
            m12642s(a);
            f9939k = m12644u(a);
        }
    }

    /* renamed from: g */
    public static int m12626g(Context context) {
        try {
            return Build.VERSION.SDK_INT >= 17 ? Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0 ? 1 : 0 : Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0 ? 1 : 0;
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: g */
    public static void m12627g() {
        try {
            int ringerMode = ((AudioManager) C3513m.m10963a().getSystemService("audio")).getRingerMode();
            if (ringerMode == 2) {
                f9935g = 1;
            } else if (ringerMode == 1) {
                f9935g = 2;
            } else {
                f9935g = 0;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: h */
    public static String m12629h(Context context) {
        if (TextUtils.isEmpty(f9929a)) {
            f9929a = C3388c.m10078a(context).mo19370b("framework_name", "");
        }
        return f9929a;
    }

    /* renamed from: i */
    public static void m12631i(Context context) {
        if (context != null) {
            C3872a.m12648b(context.getApplicationContext());
        }
    }

    /* renamed from: j */
    public static void m12632j(Context context) {
        Context applicationContext;
        if (!f9932d && context != null && (applicationContext = context.getApplicationContext()) != null) {
            try {
                if (Build.MANUFACTURER.equalsIgnoreCase("XIAOMI")) {
                    m12646w(applicationContext);
                } else {
                    C3873b.m12650b(applicationContext);
                }
                f9932d = true;
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: m */
    private static int m12636m(Context context) {
        try {
            int i = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
            if (i == 32) {
                return 1;
            }
            return i == 16 ? 0 : -1;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: n */
    private static int m12637n(Context context) {
        return f9938j;
    }

    /* renamed from: o */
    private static int m12638o(Context context) {
        return f9935g;
    }

    /* renamed from: p */
    private static float m12639p(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: q */
    private static int m12640q(Context context) {
        return f9937i;
    }

    /* renamed from: r */
    private static int m12641r(Context context) {
        return f9939k;
    }

    /* renamed from: s */
    private static void m12642s(Context context) {
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            f9936h = audioManager.getStreamMaxVolume(3);
            int streamVolume = audioManager.getStreamVolume(3);
            f9937i = streamVolume;
            f9937i = (int) ((((double) streamVolume) / ((double) f9936h)) * 100.0d);
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static void m12643t(Context context) {
        if (context != null) {
            final Context applicationContext = context.getApplicationContext();
            C2882e.m8036a(new C2885g("DeviceUtils_get_low_power_mode") {
                public void run() {
                    int unused = C3869f.f9939k = C3869f.m12644u(applicationContext);
                }
            }, 5);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public static int m12644u(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            if (!Build.MANUFACTURER.equalsIgnoreCase("XIAOMI")) {
                if (!Build.MANUFACTURER.equalsIgnoreCase("HUAWEI")) {
                    return (Build.VERSION.SDK_INT < 21 || !((PowerManager) context.getSystemService("power")).isPowerSaveMode()) ? 0 : 1;
                }
            }
            return m12645v(context);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        if (android.provider.Settings.System.getInt(r4.getContentResolver(), "SmartModeStatus") == 4) goto L_0x001a;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m12645v(android.content.Context r4) {
        /*
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x0035 }
            java.lang.String r1 = "XIAOMI"
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch:{ all -> 0x0035 }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001c
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{ all -> 0x0035 }
            java.lang.String r0 = "POWER_SAVE_MODE_OPEN"
            int r4 = android.provider.Settings.System.getInt(r4, r0)     // Catch:{ all -> 0x0035 }
            if (r4 != r1) goto L_0x0019
            goto L_0x001a
        L_0x0019:
            r1 = r2
        L_0x001a:
            r2 = r1
            goto L_0x0034
        L_0x001c:
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x0035 }
            java.lang.String r3 = "HUAWEI"
            boolean r0 = r0.equalsIgnoreCase(r3)     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0034
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{ all -> 0x0035 }
            java.lang.String r0 = "SmartModeStatus"
            int r4 = android.provider.Settings.System.getInt(r4, r0)     // Catch:{ all -> 0x0035 }
            r0 = 4
            if (r4 != r0) goto L_0x0019
            goto L_0x001a
        L_0x0034:
            return r2
        L_0x0035:
            r4 = -1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.p178l.C3869f.m12645v(android.content.Context):int");
    }

    /* renamed from: w */
    private static void m12646w(Context context) {
        final Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context.getContentResolver().registerContentObserver(Uri.parse("content://settings/system/POWER_SAVE_MODE_OPEN"), false, new ContentObserver((Handler) null) {
                public void onChange(boolean z) {
                    super.onChange(z);
                    C3869f.m12643t(applicationContext);
                }
            });
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.l.f$c */
    /* compiled from: DeviceUtils */
    static class C3874c extends BroadcastReceiver {
        C3874c() {
        }

        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
                boolean unused = C3869f.f9933e = true;
                C2905l.m8114c("DeviceUtils", "screen_on");
            } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                boolean unused2 = C3869f.f9933e = false;
                C2905l.m8114c("DeviceUtils", "screen_off");
            }
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.l.f$d */
    /* compiled from: DeviceUtils */
    public static class C3875d implements Runnable {
        public void run() {
            int i;
            try {
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(C3513m.m10963a());
                if (advertisingIdInfo != null) {
                    i = advertisingIdInfo.isLimitAdTrackingEnabled() ? 1 : 0;
                    if (C3513m.m10973h().mo19876p(VungleApiClient.GAID)) {
                        String id = advertisingIdInfo.getId();
                        if (!TextUtils.isEmpty(id)) {
                            C3970a.m13090a().mo20863b(id);
                            C3970a.m13091a(id);
                        }
                    }
                } else {
                    i = -1;
                }
                if (i != -1) {
                    C3388c.m10078a(C3513m.m10963a()).mo19364a("limit_ad_track", i);
                }
            } catch (IOException e) {
                C2905l.m8115c("DeviceUtils", "getLmtTask error : signaling connection to Google Play Services failed.", e);
            } catch (GooglePlayServicesNotAvailableException e2) {
                C2905l.m8115c("DeviceUtils", "getLmtTask error : indicating that Google Play is not installed on this device.", e2);
            } catch (GooglePlayServicesRepairableException e3) {
                C2905l.m8115c("DeviceUtils", "getLmtTask error : indicating that there was a recoverable error connecting to Google Play Services.", e3);
            } catch (Throwable th) {
                C2905l.m8118e("DeviceUtils", th.getMessage());
            }
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.l.f$a */
    /* compiled from: DeviceUtils */
    static class C3872a extends BroadcastReceiver {
        C3872a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction())) {
                    if (intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3) {
                        int unused = C3869f.f9937i = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", 0);
                        if (C3869f.f9936h != 0) {
                            int unused2 = C3869f.f9937i = (int) ((((double) C3869f.f9937i) / ((double) C3869f.f9936h)) * 100.0d);
                        }
                    }
                } else if ("android.intent.action.HEADSET_PLUG".equals(intent.getAction())) {
                    int unused3 = C3869f.f9938j = intent.getIntExtra("state", 0);
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static void m12648b(Context context) {
            if (!C3869f.f9931c && context != null) {
                try {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
                    intentFilter.addAction("android.intent.action.HEADSET_PLUG");
                    context.registerReceiver(new C3872a(), intentFilter);
                    boolean unused = C3869f.f9931c = true;
                } catch (Throwable unused2) {
                }
            }
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.l.f$b */
    /* compiled from: DeviceUtils */
    private static class C3873b extends BroadcastReceiver {
        private C3873b() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null && context != null) {
                if ("android.os.action.POWER_SAVE_MODE_CHANGED".equals(intent.getAction())) {
                    C3869f.m12643t(context);
                } else if ("huawei.intent.action.POWER_MODE_CHANGED_ACTION".equals(intent.getAction())) {
                    int i = 0;
                    if (intent.getIntExtra("state", 0) == 1) {
                        i = 1;
                    }
                    int unused = C3869f.f9939k = i;
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static void m12650b(Context context) {
            if (Build.VERSION.SDK_INT >= 21 && context != null) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                intentFilter.addAction("huawei.intent.action.POWER_MODE_CHANGED_ACTION");
                context.registerReceiver(new C3873b(), intentFilter);
            }
        }
    }
}
