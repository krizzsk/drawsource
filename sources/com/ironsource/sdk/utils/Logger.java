package com.ironsource.sdk.utils;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.sdk.p285g.C8293d;

public class Logger {

    /* renamed from: a */
    private static boolean f20312a;

    /* renamed from: d */
    public static void m23745d(String str, String str2) {
        if (f20312a) {
            Log.d(str, str2);
        }
    }

    /* renamed from: d */
    public static void m23746d(String str, String str2, Throwable th) {
        if (f20312a) {
            Log.d(str, str2, th);
        }
    }

    /* renamed from: e */
    public static void m23747e(String str, String str2) {
        if (f20312a) {
            Log.e(str, str2);
        }
    }

    /* renamed from: e */
    public static void m23748e(String str, String str2, Throwable th) {
        if (f20312a) {
            Log.e(str, str2, th);
        }
    }

    public static void enableLogging(int i) {
        f20312a = C8293d.C8297d.MODE_0.f20249d != i;
    }

    /* renamed from: i */
    public static void m23749i(String str, String str2) {
        if (f20312a) {
            Log.i(str, str2);
        }
    }

    /* renamed from: i */
    public static void m23750i(String str, String str2, Throwable th) {
        if (f20312a && !TextUtils.isEmpty(str2)) {
            Log.i(str, str2, th);
        }
    }

    /* renamed from: v */
    public static void m23751v(String str, String str2) {
        if (f20312a) {
            Log.v(str, str2);
        }
    }

    /* renamed from: v */
    public static void m23752v(String str, String str2, Throwable th) {
        if (f20312a) {
            Log.v(str, str2, th);
        }
    }

    /* renamed from: w */
    public static void m23753w(String str, String str2) {
        if (f20312a) {
            Log.w(str, str2);
        }
    }

    /* renamed from: w */
    public static void m23754w(String str, String str2, Throwable th) {
        if (f20312a) {
            Log.w(str, str2, th);
        }
    }
}
