package com.unity3d.services.core.log;

import android.util.Log;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.io.File;
import java.lang.reflect.Method;
import java.util.HashMap;

/* renamed from: com.unity3d.services.core.log.a */
/* compiled from: DeviceLog */
public class C12065a {

    /* renamed from: a */
    private static boolean f29441a = true;

    /* renamed from: b */
    private static boolean f29442b = true;

    /* renamed from: c */
    private static boolean f29443c = true;

    /* renamed from: d */
    private static boolean f29444d = true;

    /* renamed from: e */
    private static boolean f29445e = true;

    /* renamed from: f */
    private static final HashMap<C12067b, C12069c> f29446f;

    /* renamed from: com.unity3d.services.core.log.a$a */
    /* compiled from: DeviceLog */
    static /* synthetic */ class C12066a {

        /* renamed from: a */
        static final /* synthetic */ int[] f29447a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.unity3d.services.core.log.a$b[] r0 = com.unity3d.services.core.log.C12065a.C12067b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f29447a = r0
                com.unity3d.services.core.log.a$b r1 = com.unity3d.services.core.log.C12065a.C12067b.INFO     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f29447a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.unity3d.services.core.log.a$b r1 = com.unity3d.services.core.log.C12065a.C12067b.DEBUG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f29447a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.unity3d.services.core.log.a$b r1 = com.unity3d.services.core.log.C12065a.C12067b.WARNING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f29447a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.unity3d.services.core.log.a$b r1 = com.unity3d.services.core.log.C12065a.C12067b.ERROR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.log.C12065a.C12066a.<clinit>():void");
        }
    }

    /* renamed from: com.unity3d.services.core.log.a$b */
    /* compiled from: DeviceLog */
    public enum C12067b {
        INFO,
        DEBUG,
        WARNING,
        ERROR
    }

    static {
        HashMap<C12067b, C12069c> hashMap = new HashMap<>();
        f29446f = hashMap;
        if (hashMap.size() == 0) {
            hashMap.put(C12067b.INFO, new C12069c("i"));
            hashMap.put(C12067b.DEBUG, new C12069c(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D));
            hashMap.put(C12067b.WARNING, new C12069c("w"));
            hashMap.put(C12067b.ERROR, new C12069c("e"));
        }
        if (new File("/data/local/tmp/UnityAdsForceDebugMode").exists()) {
        }
    }

    /* renamed from: a */
    public static void m32840a(int i) {
        if (i >= 8) {
            f29441a = true;
            f29442b = true;
            f29443c = true;
            f29444d = true;
        } else if (i >= 4) {
            f29441a = true;
            f29442b = true;
            f29443c = true;
            f29444d = false;
        } else if (i >= 2) {
            f29441a = true;
            f29442b = true;
            f29443c = false;
            f29444d = false;
        } else if (i >= 1) {
            f29441a = true;
            f29442b = false;
            f29443c = false;
            f29444d = false;
        } else {
            f29441a = false;
            f29442b = false;
            f29443c = false;
            f29444d = false;
        }
    }

    /* renamed from: b */
    public static void m32845b(String str) {
        if (m32847b()) {
            if (str.length() > 3072) {
                m32845b(str.substring(0, 3072));
                if (str.length() < 30720) {
                    m32845b(str.substring(3072));
                    return;
                }
                return;
            }
            m32844b(C12067b.DEBUG, m32838a(str));
        }
    }

    /* renamed from: c */
    public static void m32849c(String str, Object... objArr) {
        m32851e(String.format(str, objArr));
    }

    /* renamed from: d */
    public static void m32850d(String str) {
        m32844b(C12067b.INFO, m32838a(str));
    }

    /* renamed from: e */
    public static void m32851e(String str) {
        m32844b(C12067b.WARNING, m32838a(str));
    }

    /* renamed from: c */
    public static void m32848c(String str) {
        m32844b(C12067b.ERROR, m32838a(str));
    }

    /* renamed from: b */
    private static boolean m32847b() {
        return f29444d || f29445e;
    }

    /* renamed from: b */
    public static void m32846b(String str, Object... objArr) {
        m32848c(String.format(str, objArr));
    }

    /* renamed from: b */
    private static void m32844b(C12067b bVar, String str) {
        boolean z;
        int i = C12066a.f29447a[bVar.ordinal()];
        boolean z2 = true;
        if (i == 1) {
            z = f29443c;
        } else if (i == 2) {
            z = f29444d;
        } else if (i != 3) {
            z = i != 4 ? true : f29441a;
        } else {
            z = f29442b;
        }
        if (!f29445e) {
            z2 = z;
        }
        if (z2) {
            m32841a(m32836a(bVar, str));
        }
    }

    /* renamed from: a */
    public static void m32839a() {
        m32845b("ENTERED METHOD");
    }

    /* renamed from: a */
    public static void m32843a(String str, Object... objArr) {
        if (m32847b()) {
            m32845b(String.format(str, objArr));
        }
    }

    /* renamed from: a */
    public static void m32842a(String str, Exception exc) {
        String str2 = "";
        if (str != null) {
            str2 = str2 + str;
        }
        if (exc != null) {
            str2 = str2 + ": " + exc.getMessage();
        }
        if (!(exc == null || exc.getCause() == null)) {
            str2 = str2 + ": " + exc.getCause().getMessage();
        }
        m32844b(C12067b.ERROR, str2);
    }

    /* renamed from: a */
    private static String m32838a(String str) {
        return (str == null || str.length() == 0) ? "DO NOT USE EMPTY MESSAGES, use DeviceLog.entered() instead" : str;
    }

    /* renamed from: a */
    private static C12069c m32837a(C12067b bVar) {
        return f29446f.get(bVar);
    }

    /* renamed from: a */
    private static C12068b m32836a(C12067b bVar, String str) {
        Class<C12065a> cls = C12065a.class;
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        C12069c a = m32837a(bVar);
        if (a == null) {
            return null;
        }
        int i = 0;
        boolean z = false;
        while (i < stackTrace.length) {
            StackTraceElement stackTraceElement = stackTrace[i];
            if (stackTraceElement.getClassName().equals(cls.getName())) {
                z = true;
            }
            if (!stackTraceElement.getClassName().equals(cls.getName()) && z) {
                break;
            }
            i++;
        }
        StackTraceElement stackTraceElement2 = i < stackTrace.length ? stackTrace[i] : null;
        if (stackTraceElement2 != null) {
            return new C12068b(a, str, stackTraceElement2);
        }
        return null;
    }

    /* renamed from: a */
    private static void m32841a(C12068b bVar) {
        Method method;
        if (bVar != null && bVar.mo71207a() != null) {
            try {
                method = Log.class.getMethod(bVar.mo71207a().mo71210b(), new Class[]{String.class, String.class});
            } catch (Exception e) {
                Log.e("UnityAds", "Writing to log failed!", e);
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke((Object) null, new Object[]{bVar.mo71207a().mo71209a(), bVar.mo71208b()});
                } catch (Exception e2) {
                    Log.e("UnityAds", "Writing to log failed!", e2);
                }
            }
        }
    }
}
