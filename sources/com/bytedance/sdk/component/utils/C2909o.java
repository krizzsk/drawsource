package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;
import com.tapjoy.TapjoyConstants;

/* renamed from: com.bytedance.sdk.component.utils.o */
/* compiled from: NetworkUtils */
public class C2909o {
    /* renamed from: a */
    public static boolean m8133a(Context context) {
        return m8136c(context) != 0;
    }

    /* renamed from: b */
    public static int m8135b(Context context) {
        int c = m8136c(context);
        if (c == 1) {
            return 0;
        }
        if (c == 4) {
            return 1;
        }
        if (c == 5) {
            return 4;
        }
        if (c != 6) {
            return c;
        }
        return 6;
    }

    /* renamed from: c */
    public static int m8136c(Context context) {
        return C2917v.m8175a(context, 60000);
    }

    /* renamed from: d */
    public static boolean m8137d(Context context) {
        return m8136c(context) == 4;
    }

    /* renamed from: e */
    public static boolean m8138e(Context context) {
        return m8136c(context) == 5;
    }

    /* renamed from: f */
    public static boolean m8139f(Context context) {
        return m8136c(context) == 6;
    }

    /* renamed from: g */
    public static String m8140g(Context context) {
        int c = m8136c(context);
        if (c == 2) {
            return "2g";
        }
        if (c == 3) {
            return "3g";
        }
        if (c == 4) {
            return TapjoyConstants.TJC_CONNECTION_TYPE_WIFI;
        }
        if (c != 5) {
            return c != 6 ? TapjoyConstants.TJC_CONNECTION_TYPE_MOBILE : "5g";
        }
        return "4g";
    }

    /* renamed from: a */
    public static boolean m8134a(String str) {
        return !TextUtils.isEmpty(str) && (str.startsWith("http://") || str.startsWith("https://"));
    }
}
