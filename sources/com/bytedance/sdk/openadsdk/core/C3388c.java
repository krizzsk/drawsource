package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.sdk.openadsdk.multipro.C3948b;
import com.bytedance.sdk.openadsdk.multipro.p184d.C3961a;

/* renamed from: com.bytedance.sdk.openadsdk.core.c */
/* compiled from: AdPreference */
public class C3388c {

    /* renamed from: a */
    private static volatile C3388c f8170a;

    /* renamed from: b */
    private final SharedPreferences f8171b;

    private C3388c(Context context) {
        this.f8171b = context.getSharedPreferences("ttopenadsdk", 0);
    }

    /* renamed from: a */
    public static C3388c m10078a(Context context) {
        Class<C3388c> cls = C3388c.class;
        if (f8170a == null) {
            synchronized (cls) {
                if (f8170a == null) {
                    f8170a = new C3388c(context);
                }
            }
        }
        return f8170a;
    }

    /* renamed from: a */
    public void mo19364a(String str, int i) {
        if (C3948b.m12959c()) {
            C3961a.m13027a("ttopenadsdk", str, Integer.valueOf(i));
        } else {
            this.f8171b.edit().putInt(str, i).apply();
        }
    }

    /* renamed from: a */
    public void mo19365a(String str, long j) {
        if (C3948b.m12959c()) {
            C3961a.m13028a("ttopenadsdk", str, Long.valueOf(j));
        } else {
            this.f8171b.edit().putLong(str, j).apply();
        }
    }

    /* renamed from: a */
    public void mo19366a(String str, String str2) {
        if (C3948b.m12959c()) {
            C3961a.m13029a("ttopenadsdk", str, str2);
        } else {
            this.f8171b.edit().putString(str, str2).apply();
        }
    }

    /* renamed from: a */
    public void mo19367a(String str, boolean z) {
        if (C3948b.m12959c()) {
            C3961a.m13025a("ttopenadsdk", str, Boolean.valueOf(z));
        } else {
            this.f8171b.edit().putBoolean(str, z).apply();
        }
    }

    /* renamed from: b */
    public int mo19368b(String str, int i) {
        return C3948b.m12959c() ? C3961a.m13020a("ttopenadsdk", str, i) : this.f8171b.getInt(str, i);
    }

    /* renamed from: b */
    public Long mo19369b(String str, long j) {
        return Long.valueOf(C3948b.m12959c() ? C3961a.m13021a("ttopenadsdk", str, j) : this.f8171b.getLong(str, j));
    }

    /* renamed from: b */
    public String mo19370b(String str, String str2) {
        return C3948b.m12959c() ? C3961a.m13035b("ttopenadsdk", str, str2) : this.f8171b.getString(str, str2);
    }

    /* renamed from: b */
    public boolean mo19371b(String str, boolean z) {
        return C3948b.m12959c() ? C3961a.m13032a("ttopenadsdk", str, z) : this.f8171b.getBoolean(str, z);
    }
}
