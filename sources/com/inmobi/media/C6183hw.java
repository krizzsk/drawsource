package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.inmobi.media.hw */
/* compiled from: SdkContext */
public final class C6183hw {

    /* renamed from: a */
    private static final String f15603a = C6183hw.class.getSimpleName();

    /* renamed from: b */
    private static Context f15604b;

    /* renamed from: c */
    private static String f15605c = "";

    /* renamed from: d */
    private static String f15606d = null;

    /* renamed from: e */
    private static String f15607e = null;

    /* renamed from: f */
    private static AtomicBoolean f15608f = new AtomicBoolean();

    /* renamed from: g */
    private static boolean f15609g = false;

    /* renamed from: h */
    private static final ExecutorService f15610h = Executors.newSingleThreadExecutor(new C6194ib(f15603a));

    /* renamed from: a */
    public static void m18316a(Runnable runnable) {
        f15610h.submit(runnable);
    }

    /* renamed from: e */
    private static void m18330e(Context context) {
        m18311a(context.getApplicationContext());
        f15608f.set(true);
        if (Build.VERSION.SDK_INT < 17 && f15605c == null) {
            try {
                f15605c = new WebView(context).getSettings().getUserAgentString();
            } catch (Exception unused) {
                m18311a((Context) null);
            }
        }
    }

    /* renamed from: a */
    public static void m18314a(Context context, String str) {
        m18330e(context);
        f15606d = str;
    }

    /* renamed from: b */
    public static void m18320b(Context context, String str) {
        m18330e(context);
        f15607e = str;
    }

    /* renamed from: a */
    public static boolean m18318a() {
        return f15604b != null;
    }

    /* renamed from: b */
    public static boolean m18323b() {
        return (f15604b == null || f15606d == null) ? false : true;
    }

    /* renamed from: c */
    public static Context m18324c() {
        return f15604b;
    }

    /* renamed from: d */
    public static Application m18327d() {
        Context context = f15604b;
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            return (Application) applicationContext;
        }
        return null;
    }

    /* renamed from: a */
    public static void m18311a(Context context) {
        f15604b = context;
    }

    /* renamed from: a */
    public static void m18317a(boolean z) {
        f15609g = z;
    }

    /* renamed from: e */
    public static boolean m18331e() {
        return f15609g;
    }

    /* renamed from: f */
    public static String m18332f() {
        String str = f15606d;
        return str == null ? f15607e : str;
    }

    /* renamed from: g */
    public static String m18334g() {
        return f15606d;
    }

    /* renamed from: h */
    public static String m18336h() {
        return f15607e;
    }

    /* renamed from: i */
    public static String m18337i() {
        if (TextUtils.isEmpty(f15605c) && Build.VERSION.SDK_INT >= 17) {
            f15605c = m18333f(f15604b);
        }
        return f15605c;
    }

    /* renamed from: j */
    public static boolean m18338j() {
        return f15608f.get();
    }

    /* renamed from: b */
    public static void m18322b(boolean z) {
        f15608f.set(z);
    }

    /* renamed from: b */
    public static File m18319b(Context context) {
        return new File(context.getFilesDir(), "im_cached_content");
    }

    /* renamed from: c */
    public static File m18325c(Context context) {
        return new File(context.getFilesDir(), "as_cached_content");
    }

    /* renamed from: a */
    public static void m18315a(File file, String str) {
        if (str == null || str.trim().length() == 0) {
            C6237jb.m18540a(file);
        } else {
            C6237jb.m18540a(new File(file, str));
        }
    }

    /* renamed from: k */
    public static void m18339k() {
        Context c = m18324c();
        if (c != null) {
            File b = m18319b(c);
            if (!b.mkdir()) {
                b.isDirectory();
            }
        }
    }

    /* renamed from: l */
    public static void m18340l() {
        Context c = m18324c();
        if (c != null) {
            File c2 = m18325c(c);
            if (!c2.mkdir()) {
                c2.isDirectory();
            }
        }
    }

    /* renamed from: f */
    private static String m18333f(Context context) {
        try {
            return m18335g(context);
        } catch (C5844bt e) {
            C6130gj.m18161a().mo35310a(new C6167hk(e));
            try {
                String property = System.getProperty("http.agent");
                if (property == null) {
                    return "";
                }
                return property;
            } catch (Exception e2) {
                C6130gj.m18161a().mo35310a(new C6167hk(e2));
                return "";
            }
        }
    }

    /* renamed from: g */
    private static String m18335g(Context context) throws C5844bt {
        try {
            return WebSettings.getDefaultUserAgent(context.getApplicationContext());
        } catch (Exception e) {
            throw new C5844bt(e.getMessage());
        }
    }

    /* renamed from: c */
    public static boolean m18326c(Context context, String str) {
        if (context == null || str == null) {
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if (Build.VERSION.SDK_INT >= 23) {
            return m18329d(context, str);
        }
        if (packageManager.checkPermission(str, packageManager.getNameForUid(Binder.getCallingUid())) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static boolean m18329d(Context context, String str) {
        if (!(context == null || str == null)) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
                if (packageInfo.requestedPermissions != null) {
                    for (String equals : packageInfo.requestedPermissions) {
                        if (equals.equals(str)) {
                            return true;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m18312a(Context context, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            activity.getApplication().unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
            activity.getApplication().registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    /* renamed from: a */
    public static void m18313a(Context context, Intent intent) {
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        context.startActivity(intent);
    }

    /* renamed from: a */
    public static File m18310a(String str) {
        m18339k();
        File b = m18319b(m18324c());
        int length = str.length() / 2;
        String valueOf = String.valueOf(str.substring(0, length).hashCode() & Integer.MAX_VALUE);
        return new File(b, valueOf + String.valueOf(str.substring(length).hashCode() & Integer.MAX_VALUE));
    }

    /* renamed from: b */
    public static void m18321b(String str) {
        if (m18324c() != null) {
            C6165hi.m18257a(m18324c(), "coppa_store").mo35369a("im_accid", str);
        }
    }

    /* renamed from: m */
    public static String m18341m() {
        if (m18324c() != null) {
            return C6165hi.m18257a(m18324c(), "coppa_store").mo35372b("im_accid");
        }
        return null;
    }

    /* renamed from: d */
    public static void m18328d(Context context) {
        try {
            File file = new File(context.getCacheDir(), "im_cached_content");
            if (file.exists()) {
                C6237jb.m18540a(file);
            }
        } catch (Exception unused) {
        }
    }
}
