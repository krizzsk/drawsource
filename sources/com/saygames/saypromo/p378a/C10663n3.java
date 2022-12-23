package com.saygames.saypromo.p378a;

import android.content.Context;
import android.os.Build;
import java.util.Locale;
import kotlin.text.StringsKt;

/* renamed from: com.saygames.saypromo.a.n3 */
public final class C10663n3 implements C10647l3 {

    /* renamed from: a */
    private final int f26276a = Build.VERSION.SDK_INT;

    /* renamed from: b */
    private final String f26277b;

    /* renamed from: c */
    private final String f26278c;

    /* renamed from: d */
    private final String f26279d;

    /* renamed from: e */
    final /* synthetic */ Context f26280e;

    C10663n3(Context context) {
        this.f26280e = context;
        String str = Build.ID;
        this.f26277b = str == null ? "" : str;
        this.f26278c = Build.MANUFACTURER + ' ' + Build.MODEL;
        this.f26279d = "android";
    }

    /* renamed from: a */
    public final int mo65506a() {
        return this.f26276a;
    }

    /* renamed from: b */
    public final String mo65507b() {
        return this.f26277b;
    }

    /* renamed from: c */
    public final String mo65508c() {
        return StringsKt.removeSuffix(StringsKt.removePrefix(Locale.getDefault().toString(), (CharSequence) "_"), (CharSequence) "_");
    }

    /* renamed from: d */
    public final String mo65509d() {
        return this.f26278c;
    }

    /* renamed from: e */
    public final String mo65510e() {
        return this.f26279d;
    }

    /* renamed from: f */
    public final C10655m3 mo65511f() {
        return new C10655m3(this.f26280e.getResources().getDisplayMetrics());
    }
}
