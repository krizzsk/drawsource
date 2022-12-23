package com.tapjoy.internal;

import android.content.SharedPreferences;

/* renamed from: com.tapjoy.internal.k */
public final class C11673k extends C11674l<Long> {

    /* renamed from: c */
    private final long f28181c = 0;

    public C11673k(SharedPreferences sharedPreferences, String str) {
        super(sharedPreferences, str);
    }

    /* renamed from: a */
    public final long mo70306a() {
        return this.f28182a.getLong(this.f28183b, this.f28181c);
    }

    /* renamed from: a */
    public final void mo70309a(long j) {
        this.f28182a.edit().putLong(this.f28183b, j).apply();
    }

    /* renamed from: a */
    public final SharedPreferences.Editor mo70307a(SharedPreferences.Editor editor) {
        return editor.remove(this.f28183b);
    }

    /* renamed from: a */
    public final SharedPreferences.Editor mo70308a(SharedPreferences.Editor editor, long j) {
        return editor.putLong(this.f28183b, j);
    }
}
