package com.ogury.p377ed.internal;

import android.app.Application;

/* renamed from: com.ogury.ed.internal.v */
public final class C10335v {

    /* renamed from: a */
    private final C9835ap f25665a;

    public C10335v(C9835ap apVar) {
        C10263mq.m29882b(apVar, "interstitialShowCommand");
        this.f25665a = apVar;
    }

    /* renamed from: a */
    public final C10331u mo65171a(Application application) {
        C10263mq.m29882b(application, "application");
        return new C10331u(application, this.f25665a);
    }
}
