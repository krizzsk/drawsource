package com.unity3d.services.core.preferences;

import android.content.SharedPreferences;
import com.unity3d.services.core.log.C12065a;
import com.unity3d.services.core.properties.C12084a;

/* renamed from: com.unity3d.services.core.preferences.a */
/* compiled from: AndroidPreferences */
public class C12082a {
    /* renamed from: a */
    public static Boolean m32888a(String str, String str2) {
        SharedPreferences sharedPreferences = C12084a.m32908e().getSharedPreferences(str, 0);
        if (sharedPreferences != null && sharedPreferences.contains(str2)) {
            try {
                return Boolean.valueOf(sharedPreferences.getBoolean(str2, false));
            } catch (ClassCastException e) {
                C12065a.m32848c("Unity Ads failed to cast " + str2 + ": " + e.getMessage());
            }
        }
        return null;
    }

    /* renamed from: b */
    public static Float m32894b(String str, String str2) {
        SharedPreferences sharedPreferences = C12084a.m32908e().getSharedPreferences(str, 0);
        if (sharedPreferences != null && sharedPreferences.contains(str2)) {
            try {
                return Float.valueOf(sharedPreferences.getFloat(str2, Float.NaN));
            } catch (ClassCastException e) {
                C12065a.m32848c("Unity Ads failed to cast " + str2 + ": " + e.getMessage());
            }
        }
        return null;
    }

    /* renamed from: c */
    public static Integer m32895c(String str, String str2) {
        SharedPreferences sharedPreferences = C12084a.m32908e().getSharedPreferences(str, 0);
        if (sharedPreferences != null && sharedPreferences.contains(str2)) {
            try {
                return Integer.valueOf(sharedPreferences.getInt(str2, -1));
            } catch (ClassCastException e) {
                C12065a.m32848c("Unity Ads failed to cast " + str2 + ": " + e.getMessage());
            }
        }
        return null;
    }

    /* renamed from: d */
    public static Long m32896d(String str, String str2) {
        SharedPreferences sharedPreferences = C12084a.m32908e().getSharedPreferences(str, 0);
        if (sharedPreferences != null && sharedPreferences.contains(str2)) {
            try {
                return Long.valueOf(sharedPreferences.getLong(str2, -1));
            } catch (ClassCastException e) {
                C12065a.m32848c("Unity Ads failed to cast " + str2 + ": " + e.getMessage());
            }
        }
        return null;
    }

    /* renamed from: e */
    public static String m32897e(String str, String str2) {
        SharedPreferences sharedPreferences = C12084a.m32908e().getSharedPreferences(str, 0);
        if (sharedPreferences != null && sharedPreferences.contains(str2)) {
            try {
                return sharedPreferences.getString(str2, "");
            } catch (ClassCastException e) {
                C12065a.m32848c("Unity Ads failed to cast " + str2 + ": " + e.getMessage());
            }
        }
        return null;
    }

    /* renamed from: f */
    public static boolean m32898f(String str, String str2) {
        SharedPreferences sharedPreferences = C12084a.m32908e().getSharedPreferences(str, 0);
        if (sharedPreferences == null || !sharedPreferences.contains(str2)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static void m32899g(String str, String str2) {
        SharedPreferences sharedPreferences = C12084a.m32908e().getSharedPreferences(str, 0);
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.remove(str2);
            edit.commit();
        }
    }

    /* renamed from: a */
    public static void m32893a(String str, String str2, String str3) {
        SharedPreferences sharedPreferences = C12084a.m32908e().getSharedPreferences(str, 0);
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString(str2, str3);
            edit.commit();
        }
    }

    /* renamed from: a */
    public static void m32891a(String str, String str2, Integer num) {
        SharedPreferences sharedPreferences = C12084a.m32908e().getSharedPreferences(str, 0);
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt(str2, num.intValue());
            edit.commit();
        }
    }

    /* renamed from: a */
    public static void m32892a(String str, String str2, Long l) {
        SharedPreferences sharedPreferences = C12084a.m32908e().getSharedPreferences(str, 0);
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putLong(str2, l.longValue());
            edit.commit();
        }
    }

    /* renamed from: a */
    public static void m32889a(String str, String str2, Boolean bool) {
        SharedPreferences sharedPreferences = C12084a.m32908e().getSharedPreferences(str, 0);
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean(str2, bool.booleanValue());
            edit.commit();
        }
    }

    /* renamed from: a */
    public static void m32890a(String str, String str2, Double d) {
        SharedPreferences sharedPreferences = C12084a.m32908e().getSharedPreferences(str, 0);
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putFloat(str2, d.floatValue());
            edit.commit();
        }
    }
}
