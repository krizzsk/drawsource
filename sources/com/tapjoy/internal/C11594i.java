package com.tapjoy.internal;

import android.content.SharedPreferences;

/* renamed from: com.tapjoy.internal.i */
public final class C11594i extends C11674l<Double> {

    /* renamed from: c */
    private final double f27876c = 0.0d;

    public C11594i(SharedPreferences sharedPreferences, String str) {
        super(sharedPreferences, str);
    }

    /* renamed from: a */
    public final double mo70180a() {
        String string = this.f28182a.getString(this.f28183b, (String) null);
        if (string != null) {
            try {
                return Double.parseDouble(string);
            } catch (NumberFormatException unused) {
            }
        }
        return this.f27876c;
    }

    /* renamed from: a */
    public final SharedPreferences.Editor mo70181a(SharedPreferences.Editor editor) {
        return editor.remove(this.f28183b);
    }

    /* renamed from: a */
    public final SharedPreferences.Editor mo70182a(SharedPreferences.Editor editor, double d) {
        return editor.putString(this.f28183b, Double.toString(d));
    }
}
