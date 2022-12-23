package com.google.android.datatransport.runtime.logging;

import android.os.Build;
import android.util.Log;

public final class Logging {
    private static final String LOG_PREFIX = "TRuntime.";
    private static final int MAX_LOG_TAG_SIZE_IN_SDK_N = 23;

    private Logging() {
    }

    private static String getTag(String str) {
        if (Build.VERSION.SDK_INT < 24) {
            return concatTag(LOG_PREFIX, str);
        }
        return LOG_PREFIX + str;
    }

    private static String concatTag(String str, String str2) {
        String str3 = str + str2;
        return str3.length() > 23 ? str3.substring(0, 23) : str3;
    }

    /* renamed from: d */
    public static void m16659d(String str, String str2) {
        String tag = getTag(str);
        if (Log.isLoggable(tag, 3)) {
            Log.d(tag, str2);
        }
    }

    /* renamed from: d */
    public static void m16660d(String str, String str2, Object obj) {
        String tag = getTag(str);
        if (Log.isLoggable(tag, 3)) {
            Log.d(tag, String.format(str2, new Object[]{obj}));
        }
    }

    /* renamed from: d */
    public static void m16661d(String str, String str2, Object obj, Object obj2) {
        String tag = getTag(str);
        if (Log.isLoggable(tag, 3)) {
            Log.d(tag, String.format(str2, new Object[]{obj, obj2}));
        }
    }

    /* renamed from: d */
    public static void m16662d(String str, String str2, Object... objArr) {
        String tag = getTag(str);
        if (Log.isLoggable(tag, 3)) {
            Log.d(tag, String.format(str2, objArr));
        }
    }

    /* renamed from: i */
    public static void m16664i(String str, String str2, Object obj) {
        String tag = getTag(str);
        if (Log.isLoggable(tag, 4)) {
            Log.i(tag, String.format(str2, new Object[]{obj}));
        }
    }

    /* renamed from: e */
    public static void m16663e(String str, String str2, Throwable th) {
        String tag = getTag(str);
        if (Log.isLoggable(tag, 6)) {
            Log.e(tag, str2, th);
        }
    }

    /* renamed from: w */
    public static void m16665w(String str, String str2, Object obj) {
        String tag = getTag(str);
        if (Log.isLoggable(tag, 5)) {
            Log.w(tag, String.format(str2, new Object[]{obj}));
        }
    }
}
