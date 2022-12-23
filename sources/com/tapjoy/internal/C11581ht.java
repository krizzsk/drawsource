package com.tapjoy.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.adjust.sdk.Constants;
import com.tapjoy.TapjoyConstants;
import java.io.File;
import java.io.IOException;

/* renamed from: com.tapjoy.internal.ht */
public final class C11581ht {

    /* renamed from: A */
    final C11676n f27822A = new C11676n(this.f27827b, "idfa");

    /* renamed from: B */
    final C11499g f27823B = new C11499g(this.f27827b, "idfa.optout");

    /* renamed from: C */
    final C11499g f27824C = new C11499g(this.f27827b, "push.optout");

    /* renamed from: D */
    final C11676n f27825D = new C11676n(this.f27827b, "appId");

    /* renamed from: a */
    final Context f27826a;

    /* renamed from: b */
    final SharedPreferences f27827b;

    /* renamed from: c */
    final C11676n f27828c = new C11676n(this.f27827b, "sdk");

    /* renamed from: d */
    final C11676n f27829d = new C11676n(this.f27827b, "ir");

    /* renamed from: e */
    final C11642j f27830e = new C11642j(this.f27827b, "fql", 0);

    /* renamed from: f */
    final C11642j f27831f = new C11642j(this.f27827b, "fq", 0);

    /* renamed from: g */
    final C11676n f27832g = new C11676n(this.f27827b, Constants.PUSH);

    /* renamed from: h */
    final C11642j f27833h = new C11642j(this.f27827b, "ss", 0);

    /* renamed from: i */
    final C11673k f27834i = new C11673k(this.f27827b, "std");

    /* renamed from: j */
    final C11673k f27835j = new C11673k(this.f27827b, "slt");

    /* renamed from: k */
    final C11673k f27836k = new C11673k(this.f27827b, "sld");

    /* renamed from: l */
    final C11676n f27837l = new C11676n(this.f27827b, "ptc");

    /* renamed from: m */
    final C11642j f27838m = new C11642j(this.f27827b, "pc", 0);

    /* renamed from: n */
    final C11594i f27839n = new C11594i(this.f27827b, "ptp");

    /* renamed from: o */
    final C11673k f27840o = new C11673k(this.f27827b, "lpt");

    /* renamed from: p */
    final C11594i f27841p = new C11594i(this.f27827b, "plp");

    /* renamed from: q */
    final C11676n f27842q = new C11676n(this.f27827b, "adv");

    /* renamed from: r */
    final C11676n f27843r = new C11676n(this.f27827b, "ui");

    /* renamed from: s */
    final C11642j f27844s = new C11642j(this.f27827b, "ul", -1);

    /* renamed from: t */
    final C11642j f27845t = new C11642j(this.f27827b, "uf", -1);

    /* renamed from: u */
    final C11676n f27846u = new C11676n(this.f27827b, TapjoyConstants.TJC_USER_VARIABLE_1);

    /* renamed from: v */
    final C11676n f27847v = new C11676n(this.f27827b, TapjoyConstants.TJC_USER_VARIABLE_2);

    /* renamed from: w */
    final C11676n f27848w = new C11676n(this.f27827b, TapjoyConstants.TJC_USER_VARIABLE_3);

    /* renamed from: x */
    final C11676n f27849x = new C11676n(this.f27827b, TapjoyConstants.TJC_USER_VARIABLE_4);

    /* renamed from: y */
    final C11676n f27850y = new C11676n(this.f27827b, TapjoyConstants.TJC_USER_VARIABLE_5);

    /* renamed from: z */
    final C11676n f27851z = new C11676n(this.f27827b, "utags");

    /* renamed from: a */
    public static C11581ht m31750a(Context context) {
        return new C11581ht(context);
    }

    private C11581ht(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f27826a = applicationContext;
        this.f27827b = applicationContext.getSharedPreferences("fiverocks", 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final SharedPreferences.Editor mo70166a() {
        return this.f27827b.edit();
    }

    /* renamed from: b */
    public final String mo70168b() {
        String string = this.f27827b.getString("ir", (String) null);
        if (string == null) {
            File file = new File(C11558hj.m31649c(this.f27826a), "referrer");
            if (file.exists()) {
                try {
                    string = C11286ba.m30887a(file, C11262af.f26924c);
                } catch (IOException unused) {
                }
            }
            this.f27827b.edit().putString("ir", string != null ? string : "").apply();
            if (string == null || string.length() <= 0) {
                return null;
            }
            return string;
        } else if (string.length() > 0) {
            return string;
        } else {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo70167a(boolean z) {
        C11675m.m32037a(this.f27827b, "gcm.onServer", z);
    }
}
