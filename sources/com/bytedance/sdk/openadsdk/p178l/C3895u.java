package com.bytedance.sdk.openadsdk.p178l;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.sdk.openadsdk.l.u */
/* compiled from: TempSPUtils */
public class C3895u {

    /* renamed from: a */
    private static Map<String, C3895u> f9961a = new HashMap();

    /* renamed from: b */
    private SharedPreferences f9962b;

    /* renamed from: a */
    public static C3895u m12724a(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            str = "tt_ad_sdk_sp";
        }
        C3895u uVar = f9961a.get(str);
        if (uVar != null) {
            return uVar;
        }
        C3895u uVar2 = new C3895u(str, context);
        f9961a.put(str, uVar2);
        return uVar2;
    }

    private C3895u(String str, Context context) {
        if (context != null) {
            this.f9962b = context.getApplicationContext().getSharedPreferences(str, 0);
        }
    }

    /* renamed from: a */
    public void mo20752a(String str, String str2) {
        try {
            this.f9962b.edit().putString(str, str2).apply();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public String mo20748a(String str) {
        try {
            return mo20759b(str, "");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public String mo20759b(String str, String str2) {
        try {
            return this.f9962b.getString(str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    /* renamed from: a */
    public void mo20750a(String str, int i) {
        try {
            this.f9962b.edit().putInt(str, i).apply();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public int mo20756b(String str) {
        return mo20757b(str, -1);
    }

    /* renamed from: b */
    public int mo20757b(String str, int i) {
        try {
            return this.f9962b.getInt(str, i);
        } catch (Throwable unused) {
            return i;
        }
    }

    /* renamed from: a */
    public void mo20751a(String str, long j) {
        try {
            this.f9962b.edit().putLong(str, j).apply();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public long mo20758b(String str, long j) {
        try {
            return this.f9962b.getLong(str, j);
        } catch (Throwable unused) {
            return j;
        }
    }

    /* renamed from: a */
    public void mo20749a(String str, float f) {
        try {
            this.f9962b.edit().putFloat(str, f).apply();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public float mo20755b(String str, float f) {
        try {
            return this.f9962b.getFloat(str, f);
        } catch (Throwable unused) {
            return f;
        }
    }

    /* renamed from: a */
    public void mo20754a(String str, boolean z) {
        try {
            this.f9962b.edit().putBoolean(str, z).apply();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public boolean mo20761b(String str, boolean z) {
        try {
            return this.f9962b.getBoolean(str, z);
        } catch (Throwable unused) {
            return z;
        }
    }

    /* renamed from: a */
    public void mo20753a(String str, Set<String> set) {
        try {
            this.f9962b.edit().putStringSet(str, set).apply();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public Set<String> mo20760b(String str, Set<String> set) {
        try {
            return this.f9962b.getStringSet(str, set);
        } catch (Throwable unused) {
            return set;
        }
    }

    /* renamed from: c */
    public void mo20762c(String str) {
        try {
            this.f9962b.edit().remove(str).apply();
        } catch (Throwable unused) {
        }
    }
}
