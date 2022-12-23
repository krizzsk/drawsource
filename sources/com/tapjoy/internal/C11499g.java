package com.tapjoy.internal;

import android.content.SharedPreferences;

/* renamed from: com.tapjoy.internal.g */
public final class C11499g extends C11674l<Boolean> {

    /* renamed from: c */
    private final boolean f27598c = false;

    public C11499g(SharedPreferences sharedPreferences, String str) {
        super(sharedPreferences, str);
    }

    /* renamed from: a */
    public final void mo70028a(boolean z) {
        this.f28182a.edit().putBoolean(this.f28183b, z).apply();
    }

    /* renamed from: a */
    public final Boolean mo70027a() {
        return Boolean.valueOf(this.f28182a.getBoolean(this.f28183b, this.f27598c));
    }
}
