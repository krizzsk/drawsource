package com.bytedance.sdk.openadsdk.p178l;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.multipro.C3948b;
import com.bytedance.sdk.openadsdk.multipro.p184d.C3961a;

/* renamed from: com.bytedance.sdk.openadsdk.l.r */
/* compiled from: SpAdUtile */
public class C3892r {
    /* renamed from: f */
    private static String m12717f() {
        return "sp_last_ad_show_cache_show_ad";
    }

    /* renamed from: e */
    private static Context m12716e() {
        return C3513m.m10963a();
    }

    /* renamed from: a */
    private static SharedPreferences m12710a(String str) {
        try {
            if (m12716e() != null) {
                return m12716e().getSharedPreferences(str, 0);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* renamed from: a */
    public static String m12711a() {
        try {
            if (C3948b.m12959c()) {
                return C3961a.m13035b(m12717f(), "material_data", (String) null);
            }
            SharedPreferences a = m12710a(m12717f());
            if (a != null) {
                return a.getString("material_data", (String) null);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m12713b() {
        try {
            if (C3948b.m12959c()) {
                return C3961a.m13035b(m12717f(), "show_ad_tag", (String) null);
            }
            SharedPreferences a = m12710a(m12717f());
            if (a != null) {
                return a.getString("show_ad_tag", (String) null);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static long m12714c() {
        try {
            if (C3948b.m12959c()) {
                return C3961a.m13021a(m12717f(), "show_time", 0);
            }
            SharedPreferences a = m12710a(m12717f());
            if (a != null) {
                return a.getLong("show_time", 0);
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static void m12712a(String str, String str2) {
        try {
            if (C3948b.m12959c()) {
                C3961a.m13028a(m12717f(), "show_time", Long.valueOf(System.currentTimeMillis()));
                C3961a.m13029a(m12717f(), "material_data", str);
                C3961a.m13029a(m12717f(), "show_ad_tag", str2);
                return;
            }
            SharedPreferences a = m12710a(m12717f());
            if (a != null) {
                a.edit().putLong("show_time", System.currentTimeMillis()).putString("material_data", str).putString("show_ad_tag", str2).apply();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: d */
    public static void m12715d() {
        try {
            if (C3948b.m12959c()) {
                C3961a.m13023a(m12717f());
                return;
            }
            SharedPreferences a = m12710a(m12717f());
            if (a != null) {
                a.edit().clear().apply();
            }
        } catch (Throwable unused) {
        }
    }
}
