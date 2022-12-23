package com.ogury.p377ed.internal;

import android.app.Application;
import com.ogury.p377ed.internal.C9816aj;

/* renamed from: com.ogury.ed.internal.by */
public final class C9884by {

    /* renamed from: a */
    private final C9835ap f24916a;

    public C9884by(C9835ap apVar) {
        C10263mq.m29882b(apVar, "interstitialShowCommand");
        this.f24916a = apVar;
    }

    /* renamed from: a */
    public final C9816aj mo64418a(Application application, C10044g gVar) {
        C10263mq.m29882b(application, "application");
        C10263mq.m29882b(gVar, "adLayout");
        return new C9816aj.C9817a(application, gVar, new C9834ao(C9989ej.OVERLAY_THUMBNAIL, this.f24916a), false).mo64354p();
    }
}
