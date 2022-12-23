package com.bytedance.sdk.openadsdk.multipro.p184d;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.d.b */
/* compiled from: SPMultiHelperImpl */
class C3962b {

    /* renamed from: a */
    private static SoftReference<ConcurrentHashMap<String, Map<String, Object>>> f10072a;

    /* renamed from: c */
    private static SharedPreferences m13054c(Context context, String str) {
        if (context == null) {
            return null;
        }
        return context.getSharedPreferences(m13044a(str), 0);
    }

    /* renamed from: a */
    private static String m13044a(String str) {
        return TextUtils.isEmpty(str) ? "sphelper_ttopenadsdk" : str;
    }

    /* renamed from: a */
    private static Object m13042a(String str, String str2) {
        ConcurrentHashMap concurrentHashMap;
        Map map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = f10072a;
        if (softReference == null || (concurrentHashMap = softReference.get()) == null || (map = (Map) concurrentHashMap.get(m13044a(str))) == null) {
            return null;
        }
        return map.get(str2);
    }

    /* renamed from: a */
    private static void m13047a(String str, String str2, Object obj) {
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = f10072a;
        if (softReference == null || softReference.get() == null) {
            f10072a = new SoftReference<>(new ConcurrentHashMap());
        }
        String a = m13044a(str);
        ConcurrentHashMap concurrentHashMap = f10072a.get();
        if (concurrentHashMap.get(a) == null) {
            concurrentHashMap.put(a, new HashMap());
        }
        ((Map) concurrentHashMap.get(a)).put(str2, obj);
    }

    /* renamed from: b */
    private static void m13053b(String str) {
        Map map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = f10072a;
        if (softReference != null && softReference.get() != null && (map = (Map) f10072a.get().get(m13044a(str))) != null) {
            map.clear();
        }
    }

    /* renamed from: a */
    static synchronized <T> void m13046a(Context context, String str, String str2, T t) {
        synchronized (C3962b.class) {
            SharedPreferences c = m13054c(context, str);
            if (c != null) {
                if (!t.equals(m13042a(str, str2))) {
                    SharedPreferences.Editor edit = c.edit();
                    if (t instanceof Boolean) {
                        edit.putBoolean(str2, ((Boolean) t).booleanValue());
                    }
                    if (t instanceof String) {
                        edit.putString(str2, (String) t);
                    }
                    if (t instanceof Integer) {
                        edit.putInt(str2, ((Integer) t).intValue());
                    }
                    if (t instanceof Long) {
                        edit.putLong(str2, ((Long) t).longValue());
                    }
                    if (t instanceof Float) {
                        edit.putFloat(str2, ((Float) t).floatValue());
                    }
                    edit.apply();
                    m13047a(str, str2, (Object) t);
                }
            }
        }
    }

    /* renamed from: a */
    static String m13043a(Context context, String str, String str2, String str3) {
        Object a = m13042a(str, str2);
        if (a != null) {
            return a + "";
        }
        Object b = m13050b(context, str, str2, str3);
        m13047a(str, str2, b);
        return b + "";
    }

    /* renamed from: b */
    private static Object m13050b(Context context, String str, String str2, String str3) {
        String a = m13044a(str);
        if (!m13048a(context, a, str2)) {
            return null;
        }
        if (str3.equalsIgnoreCase("string")) {
            return m13055c(context, a, str2, (String) null);
        }
        if (str3.equalsIgnoreCase("boolean")) {
            return Boolean.valueOf(m13049a(context, a, str2, false));
        }
        if (str3.equalsIgnoreCase("int")) {
            return Integer.valueOf(m13040a(context, a, str2, 0));
        }
        if (str3.equalsIgnoreCase(Constants.LONG)) {
            return Long.valueOf(m13041a(context, a, str2, 0));
        }
        if (str3.equalsIgnoreCase("float")) {
            return Float.valueOf(m13039a(context, a, str2, 0.0f));
        }
        if (str3.equalsIgnoreCase("string_set")) {
            return m13055c(context, a, str2, (String) null);
        }
        return null;
    }

    /* renamed from: c */
    private static String m13055c(Context context, String str, String str2, String str3) {
        SharedPreferences c = m13054c(context, str);
        if (c == null) {
            return str3;
        }
        return c.getString(str2, str3);
    }

    /* renamed from: a */
    private static int m13040a(Context context, String str, String str2, int i) {
        SharedPreferences c = m13054c(context, str);
        if (c == null) {
            return i;
        }
        return c.getInt(str2, i);
    }

    /* renamed from: a */
    private static float m13039a(Context context, String str, String str2, float f) {
        SharedPreferences c = m13054c(context, str);
        if (c == null) {
            return f;
        }
        return c.getFloat(str2, f);
    }

    /* renamed from: a */
    private static boolean m13049a(Context context, String str, String str2, boolean z) {
        SharedPreferences c = m13054c(context, str);
        if (c == null) {
            return z;
        }
        return c.getBoolean(str2, z);
    }

    /* renamed from: a */
    private static long m13041a(Context context, String str, String str2, long j) {
        SharedPreferences c = m13054c(context, str);
        if (c == null) {
            return j;
        }
        return c.getLong(str2, j);
    }

    /* renamed from: a */
    static boolean m13048a(Context context, String str, String str2) {
        SharedPreferences c = m13054c(context, str);
        return c != null && c.contains(str2);
    }

    /* renamed from: b */
    static void m13052b(Context context, String str, String str2) {
        try {
            SharedPreferences c = m13054c(context, str);
            if (c != null) {
                SharedPreferences.Editor edit = c.edit();
                edit.remove(str2);
                edit.apply();
                if (f10072a != null && f10072a.get() != null) {
                    Map map = (Map) f10072a.get().get(m13044a(str));
                    if (map == null) {
                        return;
                    }
                    if (map.size() != 0) {
                        map.remove(str2);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    static void m13045a(Context context, String str) {
        SharedPreferences.Editor edit = m13054c(context, str).edit();
        edit.clear();
        edit.apply();
        m13053b(str);
    }

    /* renamed from: b */
    static Map<String, ?> m13051b(Context context, String str) {
        return m13054c(context, str).getAll();
    }
}
