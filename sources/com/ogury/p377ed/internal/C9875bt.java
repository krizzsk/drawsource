package com.ogury.p377ed.internal;

import android.app.Application;

/* renamed from: com.ogury.ed.internal.bt */
public final class C9875bt {

    /* renamed from: a */
    private final C9835ap f24890a;

    public C9875bt(C9835ap apVar) {
        C10263mq.m29882b(apVar, "interstitialShowCommand");
        this.f24890a = apVar;
    }

    /* renamed from: a */
    public final C9872bs mo64399a(Application application, C9891cd cdVar, C9901ck ckVar) {
        C10263mq.m29882b(application, "application");
        C10263mq.m29882b(cdVar, "publisherActivityFilter");
        C10263mq.m29882b(ckVar, "publisherFragmentFilter");
        return new C9872bs(application, new C9883bx(cdVar, ckVar), this.f24890a);
    }
}
