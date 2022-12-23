package com.tapjoy.internal;

import android.content.SharedPreferences;

/* renamed from: com.tapjoy.internal.n */
public final class C11676n extends C11674l<String> {

    /* renamed from: c */
    private final String f28184c = null;

    public C11676n(SharedPreferences sharedPreferences, String str) {
        super(sharedPreferences, str);
    }

    /* renamed from: a */
    public final String mo70312a() {
        return this.f28182a.getString(this.f28183b, this.f28184c);
    }

    /* renamed from: a */
    public final void mo70313a(String str) {
        this.f28182a.edit().putString(this.f28183b, str).apply();
    }

    /* renamed from: a */
    public final SharedPreferences.Editor mo70311a(SharedPreferences.Editor editor, String str) {
        return str != null ? editor.putString(this.f28183b, str) : editor.remove(this.f28183b);
    }
}
