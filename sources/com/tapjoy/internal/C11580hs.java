package com.tapjoy.internal;

import android.content.Context;
import android.content.SharedPreferences;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.tapjoy.internal.hs */
public final class C11580hs {

    /* renamed from: a */
    final C11676n f27819a = new C11676n(this.f27821c, "noMoreToday.date");

    /* renamed from: b */
    public final C11676n f27820b = new C11676n(this.f27821c, "noMoreToday.actionIds");

    /* renamed from: c */
    private final SharedPreferences f27821c;

    public C11580hs(Context context) {
        this.f27821c = context.getApplicationContext().getSharedPreferences("fiverocks", 0);
        mo70165b();
    }

    /* renamed from: a */
    static String m31748a() {
        return new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
    }

    /* renamed from: b */
    public final void mo70165b() {
        String a = this.f27819a.mo70312a();
        if (a != null && !m31748a().equals(a)) {
            this.f27819a.mo70313a((String) null);
            this.f27820b.mo70313a((String) null);
        }
    }
}
