package com.inmobi.media;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;

/* renamed from: com.inmobi.media.if */
/* compiled from: PrefDao */
public final class C6198if {

    /* renamed from: a */
    private final C6165hi f15643a;

    public C6198if(Context context, String str) {
        this.f15643a = C6165hi.m18257a(context, str);
    }

    /* renamed from: a */
    public final void mo35412a(String str, String str2) {
        this.f15643a.mo35369a(str, str2);
    }

    /* renamed from: b */
    public final void mo35417b(String str, String str2) {
        this.f15643a.mo35369a(str, str2);
        mo35411a(System.currentTimeMillis() / 1000);
    }

    /* renamed from: a */
    public final void mo35413a(String str, Set<String> set) {
        SharedPreferences.Editor edit = this.f15643a.f15567a.edit();
        edit.putStringSet(str, set);
        edit.apply();
    }

    /* renamed from: a */
    public final void mo35414a(String str, boolean z) {
        this.f15643a.mo35370a(str, z);
    }

    /* renamed from: a */
    public final Set<String> mo35410a(String str) {
        return this.f15643a.f15567a.getStringSet(str, (Set) null);
    }

    /* renamed from: b */
    public final String mo35415b(String str) {
        return this.f15643a.mo35372b(str);
    }

    /* renamed from: c */
    public final Boolean mo35418c(String str) {
        if (this.f15643a.mo35375d(str)) {
            return Boolean.valueOf(this.f15643a.mo35373b(str, true));
        }
        return null;
    }

    /* renamed from: a */
    public final long mo35409a() {
        return this.f15643a.mo35371b("last_ts", 0);
    }

    /* renamed from: a */
    public final void mo35411a(long j) {
        this.f15643a.mo35368a("last_ts", j);
    }

    /* renamed from: d */
    public final boolean mo35419d(String str) {
        return this.f15643a.mo35375d(str);
    }

    /* renamed from: e */
    public final boolean mo35420e(String str) {
        return this.f15643a.mo35376e(str);
    }

    /* renamed from: b */
    public final void mo35416b() {
        SharedPreferences.Editor edit = this.f15643a.f15567a.edit();
        edit.clear();
        edit.apply();
    }
}
