package com.tapjoy.internal;

import android.content.SharedPreferences;

/* renamed from: com.tapjoy.internal.j */
public final class C11642j extends C11674l<Integer> {

    /* renamed from: c */
    private final int f28063c;

    public C11642j(SharedPreferences sharedPreferences, String str, int i) {
        super(sharedPreferences, str);
        this.f28063c = i;
    }

    /* renamed from: a */
    public final Integer mo70235a() {
        return Integer.valueOf(mo70238b());
    }

    /* renamed from: b */
    public final int mo70238b() {
        return this.f28182a.getInt(this.f28183b, this.f28063c);
    }

    /* renamed from: a */
    public final void mo70237a(Integer num) {
        if (num != null) {
            mo70236a(num.intValue());
        } else {
            mo70310c();
        }
    }

    /* renamed from: a */
    public final void mo70236a(int i) {
        this.f28182a.edit().putInt(this.f28183b, i).apply();
    }

    /* renamed from: a */
    public final SharedPreferences.Editor mo70234a(SharedPreferences.Editor editor, int i) {
        return editor.putInt(this.f28183b, i);
    }
}
