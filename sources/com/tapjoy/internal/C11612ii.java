package com.tapjoy.internal;

import com.google.firebase.analytics.FirebaseAnalytics;

/* renamed from: com.tapjoy.internal.ii */
final class C11612ii extends C11591hy implements C11543ha {

    /* renamed from: a */
    public static final C11288bc<C11612ii> f27928a = new C11288bc<C11612ii>() {
        /* renamed from: a */
        public final /* synthetic */ Object mo69701a(C11296bh bhVar) {
            bhVar.mo69722h();
            String str = null;
            String str2 = null;
            int i = 1;
            String str3 = null;
            while (bhVar.mo69724j()) {
                String l = bhVar.mo69726l();
                if ("id".equals(l)) {
                    str = bhVar.mo69727m();
                } else if ("name".equals(l)) {
                    str3 = bhVar.mo69727m();
                } else if (FirebaseAnalytics.Param.QUANTITY.equals(l)) {
                    i = bhVar.mo69732r();
                } else if ("token".equals(l)) {
                    str2 = bhVar.mo69727m();
                } else {
                    bhVar.mo69733s();
                }
            }
            bhVar.mo69723i();
            return new C11612ii(str, str3, i, str2);
        }
    };

    /* renamed from: b */
    private final String f27929b;

    /* renamed from: c */
    private final String f27930c;

    /* renamed from: d */
    private final int f27931d;

    /* renamed from: e */
    private final String f27932e;

    C11612ii(String str, String str2, int i, String str3) {
        this.f27929b = str;
        this.f27930c = str2;
        this.f27931d = i;
        this.f27932e = str3;
    }

    /* renamed from: a */
    public final String mo70085a() {
        return this.f27929b;
    }

    /* renamed from: b */
    public final String mo70086b() {
        return this.f27930c;
    }

    /* renamed from: c */
    public final int mo70087c() {
        return this.f27931d;
    }

    /* renamed from: d */
    public final String mo70088d() {
        return this.f27932e;
    }
}
