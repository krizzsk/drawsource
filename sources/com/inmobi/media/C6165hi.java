package com.inmobi.media;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;

/* renamed from: com.inmobi.media.hi */
/* compiled from: KeyValueStore */
public final class C6165hi {

    /* renamed from: b */
    private static HashMap<String, C6165hi> f15565b = new HashMap<>();

    /* renamed from: c */
    private static final Object f15566c = new Object();

    /* renamed from: a */
    public SharedPreferences f15567a;

    private C6165hi(Context context, String str) {
        this.f15567a = context.getSharedPreferences(str, 0);
    }

    /* renamed from: a */
    public static String m18258a(String str) {
        return "com.im.keyValueStore.".concat(String.valueOf(str));
    }

    /* renamed from: a */
    public static C6165hi m18257a(Context context, String str) {
        String a = m18258a(str);
        C6165hi hiVar = f15565b.get(a);
        if (hiVar != null) {
            return hiVar;
        }
        synchronized (f15566c) {
            C6165hi hiVar2 = f15565b.get(a);
            if (hiVar2 != null) {
                return hiVar2;
            }
            C6165hi hiVar3 = new C6165hi(context, a);
            f15565b.put(a, hiVar3);
            return hiVar3;
        }
    }

    /* renamed from: a */
    public final void mo35369a(String str, String str2) {
        SharedPreferences.Editor edit = this.f15567a.edit();
        edit.putString(str, str2);
        edit.apply();
    }

    /* renamed from: b */
    public final String mo35372b(String str) {
        return this.f15567a.getString(str, (String) null);
    }

    /* renamed from: a */
    public final void mo35367a(String str, int i) {
        SharedPreferences.Editor edit = this.f15567a.edit();
        edit.putInt(str, i);
        edit.apply();
    }

    /* renamed from: c */
    public final int mo35374c(String str) {
        return this.f15567a.getInt(str, Integer.MIN_VALUE);
    }

    /* renamed from: a */
    public final void mo35368a(String str, long j) {
        SharedPreferences.Editor edit = this.f15567a.edit();
        edit.putLong(str, j);
        edit.apply();
    }

    /* renamed from: b */
    public final long mo35371b(String str, long j) {
        return this.f15567a.getLong(str, j);
    }

    /* renamed from: a */
    public final void mo35370a(String str, boolean z) {
        SharedPreferences.Editor edit = this.f15567a.edit();
        edit.putBoolean(str, z);
        edit.apply();
    }

    /* renamed from: b */
    public final boolean mo35373b(String str, boolean z) {
        return this.f15567a.getBoolean(str, z);
    }

    /* renamed from: d */
    public final boolean mo35375d(String str) {
        return this.f15567a.contains(str);
    }

    /* renamed from: e */
    public final boolean mo35376e(String str) {
        if (!mo35375d(str)) {
            return false;
        }
        SharedPreferences.Editor edit = this.f15567a.edit();
        edit.remove(str);
        edit.apply();
        return true;
    }
}
