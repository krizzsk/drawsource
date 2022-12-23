package com.bykv.p054vk.openvk.component.video.api.p074f;

import android.util.Log;

/* renamed from: com.bykv.vk.openvk.component.video.api.f.c */
/* compiled from: VLogger */
public class C2415c {

    /* renamed from: a */
    private static boolean f4921a = false;

    /* renamed from: b */
    private static int f4922b = 4;

    /* renamed from: a */
    public static void m5826a(int i) {
        f4922b = i;
    }

    /* renamed from: a */
    public static void m5825a() {
        f4921a = true;
        m5826a(3);
    }

    /* renamed from: b */
    public static boolean m5834b() {
        return f4921a;
    }

    /* renamed from: a */
    public static void m5828a(String str, String str2) {
        if (f4921a && str2 != null && f4922b <= 3) {
            Log.d(str, str2);
        }
    }

    /* renamed from: a */
    public static void m5829a(String str, String str2, Throwable th) {
        if (f4921a) {
            if (!(str2 == null && th == null) && f4922b <= 3) {
                Log.d(str, str2, th);
            }
        }
    }

    /* renamed from: a */
    public static void m5830a(String str, Object... objArr) {
        if (f4921a && objArr != null && f4922b <= 3) {
            Log.v(str, m5824a(objArr));
        }
    }

    /* renamed from: a */
    public static void m5827a(String str) {
        if (f4921a) {
            m5831b("Logger", str);
        }
    }

    /* renamed from: b */
    public static void m5831b(String str, String str2) {
        if (f4921a && str2 != null && f4922b <= 4) {
            Log.i(str, str2);
        }
    }

    /* renamed from: b */
    public static void m5832b(String str, String str2, Throwable th) {
        if (f4921a) {
            if (!(str2 == null && th == null) && f4922b <= 4) {
                Log.i(str, str2, th);
            }
        }
    }

    /* renamed from: b */
    public static void m5833b(String str, Object... objArr) {
        if (f4921a && objArr != null && f4922b <= 4) {
            Log.v(str, m5824a(objArr));
        }
    }

    /* renamed from: c */
    public static void m5835c(String str, String str2) {
        if (f4921a && str2 != null && f4922b <= 6) {
            Log.e(str, str2);
        }
    }

    /* renamed from: c */
    public static void m5836c(String str, String str2, Throwable th) {
        if (f4921a) {
            if (!(str2 == null && th == null) && f4922b <= 6) {
                Log.e(str, str2, th);
            }
        }
    }

    /* renamed from: a */
    private static String m5824a(Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj : objArr) {
            if (obj != null) {
                sb.append(obj.toString());
            } else {
                sb.append(" null ");
            }
            sb.append(" ");
        }
        return sb.toString();
    }
}
