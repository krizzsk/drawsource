package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.MBridgeConstans;

/* renamed from: com.mbridge.msdk.foundation.tools.v */
/* compiled from: SameLogTool */
public final class C8672v {

    /* renamed from: a */
    public static boolean f21233a = false;

    /* renamed from: b */
    public static boolean f21234b = false;

    /* renamed from: c */
    public static boolean f21235c = false;

    /* renamed from: d */
    public static boolean f21236d = false;

    /* renamed from: e */
    public static boolean f21237e = false;

    /* renamed from: f */
    public static boolean f21238f = false;

    /* renamed from: g */
    public static boolean f21239g = false;

    /* renamed from: h */
    public static boolean f21240h = false;

    static {
        if (!MBridgeConstans.DEBUG) {
        }
    }

    /* renamed from: a */
    public static void m24874a(String str, String str2) {
        if (f21234b && !TextUtils.isEmpty(str2)) {
            Log.d(m24873a(str), str2);
        }
    }

    /* renamed from: b */
    public static void m24876b(String str, String str2) {
        if (f21235c && !TextUtils.isEmpty(str2)) {
            Log.i(m24873a(str), str2);
        }
    }

    /* renamed from: c */
    public static void m24877c(String str, String str2) {
        if (f21236d && !TextUtils.isEmpty(str2)) {
            Log.w(m24873a(str), str2);
        }
    }

    /* renamed from: d */
    public static void m24878d(String str, String str2) {
        if (f21237e && str2 != null) {
            Log.e(m24873a(str), str2);
        }
    }

    /* renamed from: a */
    public static void m24875a(String str, String str2, Throwable th) {
        if (f21237e && str2 != null && th != null) {
            Log.e(m24873a(str), str2, th);
        }
    }

    /* renamed from: a */
    private static String m24873a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return "MBRIDGE_" + str;
    }
}
