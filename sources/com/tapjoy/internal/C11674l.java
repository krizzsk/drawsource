package com.tapjoy.internal;

import android.content.SharedPreferences;

/* renamed from: com.tapjoy.internal.l */
public abstract class C11674l<T> {

    /* renamed from: a */
    protected SharedPreferences f28182a;

    /* renamed from: b */
    protected String f28183b;

    public C11674l(SharedPreferences sharedPreferences, String str) {
        this.f28182a = sharedPreferences;
        this.f28183b = str;
    }

    /* renamed from: c */
    public final void mo70310c() {
        this.f28182a.edit().remove(this.f28183b).apply();
    }
}
