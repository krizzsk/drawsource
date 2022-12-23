package com.adcolony.sdk;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Build;
import android.provider.Settings;
import android.security.NetworkSecurityPolicy;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;
import com.adcolony.sdk.C0826e0;
import com.adjust.sdk.Constants;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.tapjoy.TapjoyConstants;
import com.vungle.warren.utility.platform.Platform;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.Callable;

/* renamed from: com.adcolony.sdk.q */
class C0943q {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C0829f f716a = new C0829f();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C0829f f717b = new C0829f();

    /* renamed from: c */
    private String f718c = "";

    /* renamed from: d */
    private boolean f719d;

    /* renamed from: e */
    private String f720e = "";

    /* renamed from: f */
    private C0832f1 f721f = C0773c0.m379b();

    /* renamed from: g */
    private String f722g = "";

    /* renamed from: com.adcolony.sdk.q$a */
    class C0944a implements C0865j0 {

        /* renamed from: com.adcolony.sdk.q$a$a */
        class C0945a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C0850h0 f723a;

            /* renamed from: com.adcolony.sdk.q$a$a$a */
            class C0946a implements Runnable {

                /* renamed from: a */
                final /* synthetic */ C0832f1 f724a;

                C0946a(C0832f1 f1Var) {
                    this.f724a = f1Var;
                }

                public void run() {
                    C0945a.this.f723a.mo10835a(this.f724a).mo10838c();
                }
            }

            C0945a(C0944a aVar, C0850h0 h0Var) {
                this.f723a = h0Var;
            }

            public void run() {
                C1047z0.m1259b((Runnable) new C0946a(C0723a.m193b().mo10905n().mo11040c(2000)));
            }
        }

        C0944a(C0943q qVar) {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            if (!C1047z0.m1243a((Runnable) new C0945a(this, h0Var))) {
                new C0826e0.C0827a().mo10746a("Error retrieving device info, disabling AdColony.").mo10747a(C0826e0.f462i);
                AdColony.disable();
            }
        }
    }

    /* renamed from: com.adcolony.sdk.q$b */
    class C0947b implements Callable<C0832f1> {

        /* renamed from: a */
        final /* synthetic */ long f726a;

        C0947b(long j) {
            this.f726a = j;
        }

        /* renamed from: b */
        public C0832f1 call() {
            if (!C0943q.this.mo11023N() && this.f726a > 0) {
                C0943q.this.f716a.mo10762a(this.f726a);
            }
            return C0943q.this.mo11033b();
        }
    }

    /* renamed from: com.adcolony.sdk.q$c */
    class C0948c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f728a;

        /* renamed from: b */
        final /* synthetic */ C1031y f729b;

        C0948c(Context context, C1031y yVar) {
            this.f728a = context;
            this.f729b = yVar;
        }

        public void run() {
            boolean z;
            String str;
            if (C0723a.f208e) {
                str = "00000000-0000-0000-0000-000000000000";
                z = true;
            } else {
                str = null;
                z = false;
                try {
                    AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.f728a);
                    str = advertisingIdInfo.getId();
                    z = advertisingIdInfo.isLimitAdTrackingEnabled();
                } catch (NoClassDefFoundError unused) {
                    new C0826e0.C0827a().mo10746a("Google Play Services Ads dependencies are missing.").mo10747a(C0826e0.f459f);
                } catch (NoSuchMethodError unused2) {
                    new C0826e0.C0827a().mo10746a("Google Play Services is out of date, please update to GPS 4.0+.").mo10747a(C0826e0.f459f);
                } catch (Exception e) {
                    new C0826e0.C0827a().mo10746a("Query Advertising ID failed with: ").mo10746a(Log.getStackTraceString(e)).mo10747a(C0826e0.f460g);
                }
                if (str == null && Build.MANUFACTURER.equals(Platform.MANUFACTURER_AMAZON)) {
                    str = C0943q.this.mo11046g();
                    z = C0943q.this.mo11047h();
                }
            }
            if (str == null) {
                new C0826e0.C0827a().mo10746a("Advertising ID is not available. ").mo10746a("Collecting Android ID instead of Advertising ID.").mo10747a(C0826e0.f459f);
                C1031y yVar = this.f729b;
                if (yVar != null) {
                    yVar.mo10920a(new Throwable("Advertising ID is not available."));
                }
            } else {
                C0943q.this.mo11031a(str);
                C0962s0 a = C0723a.m193b().mo10908q().mo10822a();
                if (a != null) {
                    a.f771d.put("advertisingId", C0943q.this.mo11045f());
                }
                C0943q.this.mo11042c(z);
                C1031y yVar2 = this.f729b;
                if (yVar2 != null) {
                    yVar2.mo10918a(C0943q.this.mo11045f());
                }
            }
            C0943q.this.mo11032a(true);
        }
    }

    /* renamed from: com.adcolony.sdk.q$d */
    class C0949d implements Callable<C0832f1> {

        /* renamed from: a */
        final /* synthetic */ long f731a;

        C0949d(long j) {
            this.f731a = j;
        }

        /* renamed from: b */
        public C0832f1 call() {
            if (!C0943q.this.mo11024O() && this.f731a > 0) {
                C0943q.this.f717b.mo10762a(this.f731a);
            }
            return C0943q.this.mo11039c();
        }
    }

    /* renamed from: com.adcolony.sdk.q$e */
    class C0950e implements OnCompleteListener<AppSetIdInfo> {

        /* renamed from: a */
        final /* synthetic */ C1031y f733a;

        C0950e(C1031y yVar) {
            this.f733a = yVar;
        }

        public void onComplete(Task<AppSetIdInfo> task) {
            Throwable th;
            if (task.isSuccessful()) {
                C0943q.this.mo11037b(task.getResult().getId());
                C1031y yVar = this.f733a;
                if (yVar != null) {
                    yVar.mo10918a(C0943q.this.mo11050k());
                }
            } else {
                if (task.getException() != null) {
                    th = task.getException();
                } else {
                    th = new Throwable("Task failed with unknown exception.");
                }
                new C0826e0.C0827a().mo10746a("App Set ID is not available. Unexpected exception occurred: ").mo10746a(Log.getStackTraceString(th)).mo10747a(C0826e0.f460g);
                C1031y yVar2 = this.f733a;
                if (yVar2 != null) {
                    yVar2.mo10920a(th);
                }
            }
            C0943q.this.mo11038b(true);
        }
    }

    C0943q() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean mo11010A() {
        return this.f719d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public String mo11011B() {
        return "";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public String mo11012C() {
        return Build.MANUFACTURER;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public int mo11013D() {
        ActivityManager activityManager;
        Context a = C0723a.m186a();
        if (a == null || (activityManager = (ActivityManager) a.getSystemService("activity")) == null) {
            return 0;
        }
        return activityManager.getMemoryClass();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public long mo11014E() {
        Runtime runtime = Runtime.getRuntime();
        return (runtime.totalMemory() - runtime.freeMemory()) / ((long) 1048576);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public String mo11015F() {
        return Build.MODEL;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public int mo11016G() {
        Context a = C0723a.m186a();
        if (a == null) {
            return 2;
        }
        int i = a.getResources().getConfiguration().orientation;
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return 2;
        }
        return 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public String mo11017H() {
        return Build.VERSION.RELEASE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public String mo11018I() {
        return "4.8.0";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public String mo11019J() {
        TelephonyManager telephonyManager;
        Context a = C0723a.m186a();
        if (a == null || (telephonyManager = (TelephonyManager) a.getSystemService("phone")) == null) {
            return "";
        }
        return telephonyManager.getSimCountryIso();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public int mo11020K() {
        return TimeZone.getDefault().getOffset(15) / 60000;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public String mo11021L() {
        return TimeZone.getDefault().getID();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public void mo11022M() {
        mo11032a(false);
        mo11038b(false);
        C0723a.m192a("Device.get_info", (C0865j0) new C0944a(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public boolean mo11023N() {
        return this.f716a.mo10764a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public boolean mo11024O() {
        return this.f717b.mo10764a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public boolean mo11025P() {
        Context a = C0723a.m186a();
        if (a == null) {
            return false;
        }
        DisplayMetrics displayMetrics = a.getResources().getDisplayMetrics();
        float f = ((float) displayMetrics.widthPixels) / displayMetrics.xdpi;
        float f2 = ((float) displayMetrics.heightPixels) / displayMetrics.ydpi;
        if (Math.sqrt((double) ((f * f) + (f2 * f2))) >= 6.0d) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo11042c(boolean z) {
        this.f719d = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C0832f1 mo11043d() {
        C0832f1 b = C0773c0.m379b();
        C0866k b2 = C0723a.m193b();
        C0773c0.m376a(b, TapjoyConstants.TJC_CARRIER_NAME, mo11052m());
        C0773c0.m376a(b, "data_path", b2.mo10917z().mo11155b());
        C0773c0.m383b(b, "device_api", mo11049j());
        Rect w = mo11062w();
        C0773c0.m383b(b, "screen_width", w.width());
        C0773c0.m383b(b, "screen_height", w.height());
        C0773c0.m383b(b, "display_dpi", mo11061v());
        C0773c0.m376a(b, TapjoyConstants.TJC_DEVICE_TYPE_NAME, mo11060u());
        C0773c0.m376a(b, "locale_language_code", mo11064y());
        C0773c0.m376a(b, "ln", mo11064y());
        C0773c0.m376a(b, "locale_country_code", mo11055p());
        C0773c0.m376a(b, "locale", mo11055p());
        C0773c0.m376a(b, "mac_address", mo11011B());
        C0773c0.m376a(b, "manufacturer", mo11012C());
        C0773c0.m376a(b, "device_brand", mo11012C());
        C0773c0.m376a(b, "media_path", b2.mo10917z().mo11156c());
        C0773c0.m376a(b, "temp_storage_path", b2.mo10917z().mo11157d());
        C0773c0.m383b(b, "memory_class", mo11013D());
        C0773c0.m384b(b, "memory_used_mb", mo11014E());
        C0773c0.m376a(b, DeviceRequestsHelper.DEVICE_INFO_MODEL, mo11015F());
        C0773c0.m376a(b, "device_model", mo11015F());
        C0773c0.m376a(b, TapjoyConstants.TJC_SDK_TYPE, "android_native");
        C0773c0.m376a(b, "sdk_version", mo11018I());
        C0773c0.m376a(b, "network_type", b2.mo10910s().mo10946e());
        C0773c0.m376a(b, TapjoyConstants.TJC_DEVICE_OS_VERSION_NAME, mo11017H());
        C0773c0.m376a(b, "os_name", "android");
        C0773c0.m376a(b, TapjoyConstants.TJC_PLATFORM, "android");
        C0773c0.m376a(b, "arch", mo11026a());
        C0773c0.m376a(b, "user_id", C0773c0.m393h(b2.mo10912u().mo10383b(), "user_id"));
        C0773c0.m376a(b, "app_id", b2.mo10912u().mo10382a());
        C0773c0.m376a(b, "app_bundle_name", C1047z0.m1252b());
        C0773c0.m376a(b, "app_bundle_version", C1047z0.m1262c());
        C0773c0.m373a(b, "battery_level", mo11051l());
        C0773c0.m376a(b, "cell_service_country_code", mo11019J());
        C0773c0.m376a(b, "timezone_ietf", mo11021L());
        C0773c0.m383b(b, "timezone_gmt_m", mo11020K());
        C0773c0.m383b(b, "timezone_dst_m", mo11056q());
        C0773c0.m375a(b, "launch_metadata", mo11065z());
        C0773c0.m376a(b, "controller_version", b2.mo10897f());
        C0773c0.m383b(b, "current_orientation", mo11016G());
        C0773c0.m385b(b, "cleartext_permitted", mo11053n());
        C0773c0.m373a(b, "density", (double) mo11058s());
        C0773c0.m385b(b, "dark_mode", mo11057r());
        C0773c0.m376a(b, "adc_alt_id", mo11044e());
        C0828e1 a = C0773c0.m365a();
        if (C1047z0.m1264c("com.android.vending")) {
            a.mo10754b(Constants.REFERRER_API_GOOGLE);
        }
        if (C1047z0.m1264c("com.amazon.venezia")) {
            a.mo10754b("amazon");
        }
        if (C1047z0.m1264c("com.huawei.appmarket")) {
            a.mo10754b("huawei");
        }
        if (C1047z0.m1264c("com.sec.android.app.samsungapps")) {
            a.mo10754b("samsung");
        }
        C0773c0.m374a(b, "available_stores", a);
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo11044e() {
        return C1047z0.m1237a(C0723a.m193b().mo10917z());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public String mo11045f() {
        return this.f718c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public String mo11046g() {
        Context a = C0723a.m186a();
        if (a == null) {
            return null;
        }
        return Settings.Secure.getString(a.getContentResolver(), TapjoyConstants.TJC_ADVERTISING_ID);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo11047h() {
        Context a = C0723a.m186a();
        if (a == null) {
            return false;
        }
        try {
            if (Settings.Secure.getInt(a.getContentResolver(), "limit_ad_tracking") != 0) {
                return true;
            }
            return false;
        } catch (Settings.SettingNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public String mo11048i() {
        Context a = C0723a.m186a();
        if (a == null) {
            return "";
        }
        return Settings.Secure.getString(a.getContentResolver(), "android_id");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo11049j() {
        return Build.VERSION.SDK_INT;
    }

    /* renamed from: k */
    public String mo11050k() {
        return this.f720e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public double mo11051l() {
        Context a = C0723a.m186a();
        if (a == null) {
            return 0.0d;
        }
        try {
            Intent registerReceiver = a.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver == null) {
                return 0.0d;
            }
            int intExtra = registerReceiver.getIntExtra("level", -1);
            int intExtra2 = registerReceiver.getIntExtra("scale", -1);
            if (intExtra < 0 || intExtra2 < 0) {
                return 0.0d;
            }
            return ((double) intExtra) / ((double) intExtra2);
        } catch (RuntimeException unused) {
            return 0.0d;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public String mo11052m() {
        Context a = C0723a.m186a();
        String str = "";
        if (a == null) {
            return str;
        }
        TelephonyManager telephonyManager = (TelephonyManager) a.getSystemService("phone");
        if (telephonyManager != null) {
            str = telephonyManager.getNetworkOperatorName();
        }
        return str.length() == 0 ? "unknown" : str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo11053n() {
        return Build.VERSION.SDK_INT < 23 || NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public String mo11054o() {
        return this.f722g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public String mo11055p() {
        return Locale.getDefault().getCountry();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public int mo11056q() {
        TimeZone timeZone = TimeZone.getDefault();
        if (!timeZone.inDaylightTime(new Date())) {
            return 0;
        }
        return timeZone.getDSTSavings() / 60000;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean mo11057r() {
        int i;
        Context a = C0723a.m186a();
        if (a == null || Build.VERSION.SDK_INT < 29 || (i = a.getResources().getConfiguration().uiMode & 48) == 16 || i != 32) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public float mo11058s() {
        Context a = C0723a.m186a();
        if (a == null) {
            return 0.0f;
        }
        return a.getResources().getDisplayMetrics().density;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public C0832f1 mo11059t() {
        if (!mo11023N()) {
            try {
                return C1047z0.m1251b(C0773c0.m370a(mo11043d(), mo11027a(2000).call()));
            } catch (Exception unused) {
            }
        }
        return C1047z0.m1251b(C0773c0.m370a(mo11043d(), mo11033b()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public String mo11060u() {
        return mo11025P() ? "tablet" : "phone";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public int mo11061v() {
        Context a = C0723a.m186a();
        if (a == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            return a.getResources().getConfiguration().densityDpi;
        }
        try {
            WindowManager windowManager = (WindowManager) a.getSystemService("window");
            if (windowManager == null) {
                return 0;
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics.densityDpi;
        } catch (RuntimeException unused) {
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public Rect mo11062w() {
        Rect rect = new Rect();
        Context a = C0723a.m186a();
        if (a == null) {
            return rect;
        }
        try {
            WindowManager windowManager = (WindowManager) a.getSystemService("window");
            if (windowManager == null) {
                return rect;
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            return new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
        } catch (RuntimeException unused) {
            return rect;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:32|33) */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r1 = r2.getWindowInsets().getInsetsIgnoringVisibility((android.view.WindowInsets.Type.navigationBars() | android.view.WindowInsets.Type.displayCutout()) | android.view.WindowInsets.Type.statusBars());
        r1 = new android.graphics.Rect(0, 0, r2.getBounds().width() - (r1.right + r1.left), r2.getBounds().height() - (r1.top + r1.bottom));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x00d8 */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Rect mo11063x() {
        /*
            r8 = this;
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.content.Context r1 = com.adcolony.sdk.C0723a.m186a()
            if (r1 == 0) goto L_0x0111
            java.lang.String r2 = "window"
            java.lang.Object r2 = r1.getSystemService(r2)     // Catch:{ RuntimeException -> 0x0111 }
            android.view.WindowManager r2 = (android.view.WindowManager) r2     // Catch:{ RuntimeException -> 0x0111 }
            if (r2 == 0) goto L_0x0111
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ RuntimeException -> 0x0111 }
            r4 = 17
            r5 = 0
            if (r3 >= r4) goto L_0x0039
            android.util.DisplayMetrics r3 = new android.util.DisplayMetrics     // Catch:{ RuntimeException -> 0x0111 }
            r3.<init>()     // Catch:{ RuntimeException -> 0x0111 }
            android.view.Display r2 = r2.getDefaultDisplay()     // Catch:{ RuntimeException -> 0x0111 }
            r2.getMetrics(r3)     // Catch:{ RuntimeException -> 0x0111 }
            android.graphics.Rect r2 = new android.graphics.Rect     // Catch:{ RuntimeException -> 0x0111 }
            int r4 = r3.widthPixels     // Catch:{ RuntimeException -> 0x0111 }
            int r3 = r3.heightPixels     // Catch:{ RuntimeException -> 0x0111 }
            int r1 = com.adcolony.sdk.C1047z0.m1271f((android.content.Context) r1)     // Catch:{ RuntimeException -> 0x0111 }
            int r3 = r3 - r1
            r2.<init>(r5, r5, r4, r3)     // Catch:{ RuntimeException -> 0x0111 }
            r0 = r2
            goto L_0x0111
        L_0x0039:
            r4 = 30
            if (r3 >= r4) goto L_0x008d
            android.util.DisplayMetrics r3 = new android.util.DisplayMetrics     // Catch:{ RuntimeException -> 0x0111 }
            r3.<init>()     // Catch:{ RuntimeException -> 0x0111 }
            android.util.DisplayMetrics r4 = new android.util.DisplayMetrics     // Catch:{ RuntimeException -> 0x0111 }
            r4.<init>()     // Catch:{ RuntimeException -> 0x0111 }
            android.view.Display r2 = r2.getDefaultDisplay()     // Catch:{ RuntimeException -> 0x0111 }
            r2.getMetrics(r3)     // Catch:{ RuntimeException -> 0x0111 }
            r2.getRealMetrics(r4)     // Catch:{ RuntimeException -> 0x0111 }
            int r2 = com.adcolony.sdk.C1047z0.m1271f((android.content.Context) r1)     // Catch:{ RuntimeException -> 0x0111 }
            int r1 = com.adcolony.sdk.C1047z0.m1248b((android.content.Context) r1)     // Catch:{ RuntimeException -> 0x0111 }
            int r6 = r4.heightPixels     // Catch:{ RuntimeException -> 0x0111 }
            int r7 = r3.heightPixels     // Catch:{ RuntimeException -> 0x0111 }
            int r6 = r6 - r7
            if (r6 > 0) goto L_0x006d
            android.graphics.Rect r1 = new android.graphics.Rect     // Catch:{ RuntimeException -> 0x0111 }
            int r4 = r3.widthPixels     // Catch:{ RuntimeException -> 0x0111 }
            int r3 = r3.heightPixels     // Catch:{ RuntimeException -> 0x0111 }
            int r3 = r3 - r2
            r1.<init>(r5, r5, r4, r3)     // Catch:{ RuntimeException -> 0x0111 }
        L_0x006a:
            r0 = r1
            goto L_0x0111
        L_0x006d:
            if (r1 <= 0) goto L_0x0082
            if (r6 > r2) goto L_0x0074
            if (r1 <= r2) goto L_0x0074
            goto L_0x0082
        L_0x0074:
            android.graphics.Rect r6 = new android.graphics.Rect     // Catch:{ RuntimeException -> 0x0111 }
            int r3 = r3.widthPixels     // Catch:{ RuntimeException -> 0x0111 }
            int r4 = r4.heightPixels     // Catch:{ RuntimeException -> 0x0111 }
            int r1 = r1 + r2
            int r4 = r4 - r1
            r6.<init>(r5, r5, r3, r4)     // Catch:{ RuntimeException -> 0x0111 }
            r0 = r6
            goto L_0x0111
        L_0x0082:
            android.graphics.Rect r1 = new android.graphics.Rect     // Catch:{ RuntimeException -> 0x0111 }
            int r3 = r3.widthPixels     // Catch:{ RuntimeException -> 0x0111 }
            int r4 = r4.heightPixels     // Catch:{ RuntimeException -> 0x0111 }
            int r4 = r4 - r2
            r1.<init>(r5, r5, r3, r4)     // Catch:{ RuntimeException -> 0x0111 }
            goto L_0x006a
        L_0x008d:
            android.view.WindowMetrics r2 = r2.getCurrentWindowMetrics()     // Catch:{ RuntimeException -> 0x0111 }
            android.graphics.Point r3 = new android.graphics.Point     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            r3.<init>()     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            android.graphics.Point r4 = new android.graphics.Point     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            r4.<init>()     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            android.view.Display r1 = r1.getDisplay()     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            r1.getCurrentSizeRange(r3, r4)     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            android.graphics.Rect r1 = r2.getBounds()     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            int r1 = r1.width()     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            android.graphics.Rect r6 = r2.getBounds()     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            int r6 = r6.height()     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            r7 = 2
            if (r1 <= r6) goto L_0x00b7
            r1 = r7
            goto L_0x00b8
        L_0x00b7:
            r1 = 1
        L_0x00b8:
            if (r1 != r7) goto L_0x00c4
            android.graphics.Point r1 = new android.graphics.Point     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            int r4 = r4.x     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            int r3 = r3.y     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            r1.<init>(r4, r3)     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            goto L_0x00cd
        L_0x00c4:
            android.graphics.Point r1 = new android.graphics.Point     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            int r3 = r3.x     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            int r4 = r4.y     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            r1.<init>(r3, r4)     // Catch:{ UnsupportedOperationException -> 0x00d8 }
        L_0x00cd:
            android.graphics.Rect r3 = new android.graphics.Rect     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            int r4 = r1.x     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            int r1 = r1.y     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            r3.<init>(r5, r5, r4, r1)     // Catch:{ UnsupportedOperationException -> 0x00d8 }
            r0 = r3
            goto L_0x0111
        L_0x00d8:
            android.view.WindowInsets r1 = r2.getWindowInsets()     // Catch:{ RuntimeException -> 0x0111 }
            int r3 = android.view.WindowInsets.Type.navigationBars()     // Catch:{ RuntimeException -> 0x0111 }
            int r4 = android.view.WindowInsets.Type.displayCutout()     // Catch:{ RuntimeException -> 0x0111 }
            r3 = r3 | r4
            int r4 = android.view.WindowInsets.Type.statusBars()     // Catch:{ RuntimeException -> 0x0111 }
            r3 = r3 | r4
            android.graphics.Insets r1 = r1.getInsetsIgnoringVisibility(r3)     // Catch:{ RuntimeException -> 0x0111 }
            android.graphics.Rect r3 = r2.getBounds()     // Catch:{ RuntimeException -> 0x0111 }
            int r3 = r3.width()     // Catch:{ RuntimeException -> 0x0111 }
            int r4 = r1.right     // Catch:{ RuntimeException -> 0x0111 }
            int r6 = r1.left     // Catch:{ RuntimeException -> 0x0111 }
            int r4 = r4 + r6
            int r3 = r3 - r4
            android.graphics.Rect r2 = r2.getBounds()     // Catch:{ RuntimeException -> 0x0111 }
            int r2 = r2.height()     // Catch:{ RuntimeException -> 0x0111 }
            int r4 = r1.top     // Catch:{ RuntimeException -> 0x0111 }
            int r1 = r1.bottom     // Catch:{ RuntimeException -> 0x0111 }
            int r4 = r4 + r1
            int r2 = r2 - r4
            android.graphics.Rect r1 = new android.graphics.Rect     // Catch:{ RuntimeException -> 0x0111 }
            r1.<init>(r5, r5, r3, r2)     // Catch:{ RuntimeException -> 0x0111 }
            goto L_0x006a
        L_0x0111:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C0943q.mo11063x():android.graphics.Rect");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public String mo11064y() {
        return Locale.getDefault().getLanguage();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public C0832f1 mo11065z() {
        return this.f721f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11030a(C0832f1 f1Var) {
        this.f721f = f1Var;
    }

    /* renamed from: b */
    public void mo11037b(String str) {
        this.f720e = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo11041c(String str) {
        this.f722g = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11031a(String str) {
        this.f718c = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo11038b(boolean z) {
        this.f717b.mo10763a(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11032a(boolean z) {
        this.f716a.mo10763a(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0832f1 mo11033b() {
        C0832f1 b = C0773c0.m379b();
        String f = mo11045f();
        C0773c0.m376a(b, "advertiser_id", f);
        C0773c0.m385b(b, "limit_tracking", mo11010A());
        if (f == null || f.isEmpty()) {
            C0773c0.m376a(b, "android_id_sha1", C1047z0.m1256b(mo11048i()));
        }
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0832f1 mo11040c(long j) {
        if (j <= 0) {
            return C0773c0.m370a(mo11043d(), mo11033b(), mo11039c());
        }
        ArrayList arrayList = new ArrayList(Collections.singletonList(mo11043d()));
        C0951q0 q0Var = new C0951q0();
        if (mo11023N()) {
            arrayList.add(mo11033b());
        } else {
            q0Var.mo11075a(mo11027a(j));
        }
        if (mo11024O()) {
            arrayList.add(mo11039c());
        } else {
            q0Var.mo11075a(mo11034b(j));
        }
        if (!q0Var.mo11076b()) {
            arrayList.addAll(q0Var.mo11073a());
        }
        return C0773c0.m370a((C0832f1[]) arrayList.toArray(new C0832f1[0]));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo11026a() {
        return System.getProperty("os.arch").toLowerCase(Locale.ENGLISH);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Callable<C0832f1> mo11027a(long j) {
        return new C0947b(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11028a(Context context) {
        mo11029a(context, (C1031y<String>) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11029a(Context context, C1031y<String> yVar) {
        if (context != null) {
            if (mo11045f().isEmpty()) {
                mo11032a(false);
            }
            if (!C1047z0.m1243a((Runnable) new C0948c(context, yVar))) {
                new C0826e0.C0827a().mo10746a("Executing Query Advertising ID failed.").mo10747a(C0826e0.f462i);
                if (yVar != null) {
                    yVar.mo10920a(new Throwable("Query Advertising ID failed on execute."));
                }
            } else {
                return;
            }
        } else if (yVar != null) {
            yVar.mo10920a(new Throwable("Context cannot be null."));
        }
        mo11032a(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Callable<C0832f1> mo11034b(long j) {
        return new C0949d(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo11035b(Context context) {
        mo11036b(context, (C1031y<String>) null);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0078  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11036b(android.content.Context r3, com.adcolony.sdk.C1031y<java.lang.String> r4) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x000f
            if (r4 == 0) goto L_0x0080
            java.lang.Throwable r3 = new java.lang.Throwable
            java.lang.String r0 = "Context cannot be null."
            r3.<init>(r0)
            r4.mo10920a((java.lang.Throwable) r3)
            goto L_0x0080
        L_0x000f:
            java.lang.String r0 = r2.mo11050k()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0023
            if (r4 == 0) goto L_0x0080
            java.lang.String r3 = r2.mo11050k()
            r4.mo10918a(r3)
            goto L_0x0080
        L_0x0023:
            r0 = 0
            r2.mo11038b((boolean) r0)
            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ NoClassDefFoundError | NoSuchMethodError -> 0x0056, Exception -> 0x003c }
            com.google.android.gms.appset.AppSetIdClient r3 = com.google.android.gms.appset.AppSet.getClient(r3)     // Catch:{ NoClassDefFoundError | NoSuchMethodError -> 0x0056, Exception -> 0x003c }
            com.google.android.gms.tasks.Task r3 = r3.getAppSetIdInfo()     // Catch:{ NoClassDefFoundError | NoSuchMethodError -> 0x0056, Exception -> 0x003c }
            com.adcolony.sdk.q$e r0 = new com.adcolony.sdk.q$e     // Catch:{ NoClassDefFoundError | NoSuchMethodError -> 0x0056, Exception -> 0x003c }
            r0.<init>(r4)     // Catch:{ NoClassDefFoundError | NoSuchMethodError -> 0x0056, Exception -> 0x003c }
            r3.addOnCompleteListener(r0)     // Catch:{ NoClassDefFoundError | NoSuchMethodError -> 0x0056, Exception -> 0x003c }
            return
        L_0x003c:
            r3 = move-exception
            com.adcolony.sdk.e0$a r0 = new com.adcolony.sdk.e0$a
            r0.<init>()
            java.lang.String r1 = "Query App Set ID failed with: "
            com.adcolony.sdk.e0$a r0 = r0.mo10746a((java.lang.String) r1)
            java.lang.String r3 = android.util.Log.getStackTraceString(r3)
            com.adcolony.sdk.e0$a r3 = r0.mo10746a((java.lang.String) r3)
            com.adcolony.sdk.e0 r0 = com.adcolony.sdk.C0826e0.f460g
            r3.mo10747a((com.adcolony.sdk.C0826e0) r0)
            goto L_0x0066
        L_0x0056:
            com.adcolony.sdk.e0$a r3 = new com.adcolony.sdk.e0$a
            r3.<init>()
            java.lang.String r0 = "Google Play Services App Set dependency is missing."
            com.adcolony.sdk.e0$a r3 = r3.mo10746a((java.lang.String) r0)
            com.adcolony.sdk.e0 r0 = com.adcolony.sdk.C0826e0.f459f
            r3.mo10747a((com.adcolony.sdk.C0826e0) r0)
        L_0x0066:
            com.adcolony.sdk.e0$a r3 = new com.adcolony.sdk.e0$a
            r3.<init>()
            java.lang.String r0 = "App Set ID is not available."
            com.adcolony.sdk.e0$a r3 = r3.mo10746a((java.lang.String) r0)
            com.adcolony.sdk.e0 r1 = com.adcolony.sdk.C0826e0.f459f
            r3.mo10747a((com.adcolony.sdk.C0826e0) r1)
            if (r4 == 0) goto L_0x0080
            java.lang.Throwable r3 = new java.lang.Throwable
            r3.<init>(r0)
            r4.mo10920a((java.lang.Throwable) r3)
        L_0x0080:
            r3 = 1
            r2.mo11038b((boolean) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C0943q.mo11036b(android.content.Context, com.adcolony.sdk.y):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0832f1 mo11039c() {
        C0832f1 b = C0773c0.m379b();
        C0773c0.m376a(b, TapjoyConstants.TJC_APP_SET_ID, mo11050k());
        return b;
    }
}
