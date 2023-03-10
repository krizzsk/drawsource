package com.fyber.inneractive.sdk.util;

import android.app.Application;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import java.io.Closeable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.util.l */
public class C5292l {

    /* renamed from: a */
    public static Application f14015a;

    /* renamed from: b */
    public static final Comparator<ResolveInfo> f14016b = new C5293a();

    /* renamed from: com.fyber.inneractive.sdk.util.l$a */
    public class C5293a implements Comparator<ResolveInfo> {
        public int compare(Object obj, Object obj2) {
            ActivityInfo activityInfo;
            String str;
            ResolveInfo resolveInfo = (ResolveInfo) obj2;
            ActivityInfo activityInfo2 = ((ResolveInfo) obj).activityInfo;
            if (activityInfo2 == null || (activityInfo = resolveInfo.activityInfo) == null || (str = activityInfo2.packageName) == null) {
                return 1;
            }
            return str.compareTo(activityInfo.packageName);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.util.l$b */
    public static class C5294b {

        /* renamed from: a */
        public static Map<String, String> f14017a = new HashMap();
    }

    /* renamed from: a */
    public static Application m16501a() {
        return f14015a;
    }

    /* renamed from: b */
    public static boolean m16510b(String str) {
        try {
            if (f14015a.checkCallingOrSelfPermission(str) == 0) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static int m16512c(int i) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) f14015a.getSystemService("window");
        if (windowManager == null) {
            return i;
        }
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return (int) ((((float) i) / displayMetrics.density) + 0.5f);
    }

    /* renamed from: d */
    public static int m16514d() {
        int i;
        WindowManager windowManager;
        Display defaultDisplay;
        Application application = f14015a;
        if (application == null || (windowManager = (WindowManager) application.getSystemService("window")) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            i = -1;
        } else {
            Point point = new Point();
            defaultDisplay.getSize(point);
            i = point.y;
        }
        if (i != -1) {
            return i;
        }
        try {
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            if (displayMetrics != null) {
                i = displayMetrics.heightPixels;
            }
        } catch (Throwable unused) {
        }
        if (i == -1) {
            return 480;
        }
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0023 A[SYNTHETIC, Splitter:B:12:0x0023] */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m16516e() {
        /*
            r0 = -1
            android.app.Application r1 = f14015a     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x0020
            java.lang.String r2 = "window"
            java.lang.Object r1 = r1.getSystemService(r2)     // Catch:{ all -> 0x0020 }
            android.view.WindowManager r1 = (android.view.WindowManager) r1     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x0020
            android.view.Display r1 = r1.getDefaultDisplay()     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x0020
            android.graphics.Point r2 = new android.graphics.Point     // Catch:{ all -> 0x0020 }
            r2.<init>()     // Catch:{ all -> 0x0020 }
            r1.getSize(r2)     // Catch:{ all -> 0x0020 }
            int r1 = r2.x     // Catch:{ all -> 0x0020 }
            goto L_0x0021
        L_0x0020:
            r1 = r0
        L_0x0021:
            if (r1 != r0) goto L_0x0033
            android.content.res.Resources r2 = android.content.res.Resources.getSystem()     // Catch:{ all -> 0x002f }
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()     // Catch:{ all -> 0x002f }
            if (r2 == 0) goto L_0x002f
            int r1 = r2.widthPixels     // Catch:{ all -> 0x002f }
        L_0x002f:
            if (r1 != r0) goto L_0x0033
            r1 = 320(0x140, float:4.48E-43)
        L_0x0033:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.util.C5292l.m16516e():int");
    }

    /* renamed from: f */
    public static String m16517f() {
        IAConfigManager iAConfigManager;
        int i = 0;
        while (true) {
            iAConfigManager = IAConfigManager.f10324J;
            if (!iAConfigManager.f10359y.f14052c.compareAndSet(true, true) && i < 25) {
                IAlog.m16446a("UserAgentProvider | waiting on user agent", new Object[0]);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException unused) {
                }
                i++;
            }
        }
        return iAConfigManager.f10359y.mo26394a();
    }

    /* renamed from: a */
    public static int m16499a(float f) {
        return (int) (TypedValue.applyDimension(1, f, f14015a.getResources().getDisplayMetrics()) + 0.5f);
    }

    /* renamed from: b */
    public static int m16507b(int i) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) f14015a.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return (int) ((((float) i) * displayMetrics.density) + 0.5f);
    }

    /* renamed from: a */
    public static int m16500a(int i) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) f14015a.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return Math.round((((float) i) * displayMetrics.density) + 0.5f);
    }

    /* renamed from: c */
    public static int m16511c() {
        Application application = f14015a;
        int i = (application == null || application.getResources() == null || application.getResources().getConfiguration() == null) ? 1 : application.getResources().getConfiguration().orientation;
        try {
            if (Settings.System.getInt(application.getContentResolver(), "accelerometer_rotation", 0) != 1) {
                i = 1;
            }
        } catch (Throwable th) {
            IAlog.m16445a("failed getOrientation. returning portrait orientation", th, new Object[0]);
        }
        Object[] objArr = new Object[1];
        objArr[0] = i == 1 ? "portrait" : "landscape";
        IAlog.m16446a("The device orientation: %s", objArr);
        return i;
    }

    /* renamed from: b */
    public static String m16509b(String str, Collection<String> collection) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C$r8$backportedMethods$utility$String$2$joinIterable.join(str, collection);
        }
        return TextUtils.join(str, collection);
    }

    /* renamed from: a */
    public static boolean m16504a(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m16506a(String... strArr) {
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= strArr.length) {
                return true;
            }
            try {
                Class.forName(strArr[i]);
            } catch (ClassNotFoundException unused) {
                z = false;
            }
            if (!z) {
                return false;
            }
            i++;
        }
    }

    /* renamed from: a */
    public static void m16503a(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    /* renamed from: a */
    public static String m16502a(String str, Collection<Integer> collection) {
        ArrayList arrayList = new ArrayList();
        for (Integer valueOf : collection) {
            arrayList.add(String.valueOf(valueOf));
        }
        return m16509b(str, arrayList);
    }

    /* renamed from: b */
    public static String m16508b() {
        try {
            return Environment.getExternalStorageState();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: d */
    public static Drawable m16515d(int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return f14015a.getDrawable(i);
        }
        return f14015a.getResources().getDrawable(i);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static boolean m16505a(String str, Context context, byte[] bArr) {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = context.openFileOutput(str, 0);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.flush();
                C5312s.m16537a((Closeable) fileOutputStream);
                return true;
            } catch (Throwable unused) {
                try {
                    IAlog.m16446a("writeFileWithContext failed writing %s", str);
                    C5312s.m16537a((Closeable) fileOutputStream);
                    return false;
                } catch (Throwable th) {
                    C5312s.m16537a((Closeable) fileOutputStream);
                    throw th;
                }
            }
        } catch (Throwable unused2) {
            fileOutputStream = null;
            IAlog.m16446a("writeFileWithContext failed writing %s", str);
            C5312s.m16537a((Closeable) fileOutputStream);
            return false;
        }
    }

    /* renamed from: c */
    public static String m16513c(String str) {
        String str2 = (String) ((HashMap) C5294b.f14017a).get(str);
        if (TextUtils.isEmpty(str2)) {
            IAlog.m16446a("Assets cache: reading file: %s", str);
            try {
                InputStream open = f14015a.getAssets().open(str, 3);
                StringBuffer stringBuffer = new StringBuffer();
                byte[] bArr = new byte[4096];
                for (int i = 0; i != -1; i = open.read(bArr)) {
                    stringBuffer.append(new String(bArr, 0, i));
                }
                open.close();
                str2 = stringBuffer.toString();
                IAlog.m16446a("Assets cache: success - %s", str);
            } catch (IOException e) {
                IAlog.m16446a("Assets cache: Could not read response from file", new Object[0]);
                IAlog.m16449d(C5312s.m16534a((Throwable) e), new Object[0]);
            }
            if (!TextUtils.isEmpty(str2)) {
                ((HashMap) C5294b.f14017a).put(str, str2);
            }
        } else {
            IAlog.m16446a("Assets cache: returning cached assets for %s", str);
        }
        return str2;
    }
}
