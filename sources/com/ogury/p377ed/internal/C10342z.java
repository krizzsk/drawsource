package com.ogury.p377ed.internal;

import android.app.Application;
import com.ogury.p377ed.internal.C9816aj;

/* renamed from: com.ogury.ed.internal.z */
public final class C10342z {

    /* renamed from: a */
    private final C9835ap f25681a;

    public C10342z(C9835ap apVar) {
        C10263mq.m29882b(apVar, "interstitialShowCommand");
        this.f25681a = apVar;
    }

    /* renamed from: a */
    public final C9816aj mo65181a(Application application, C10044g gVar) {
        C10263mq.m29882b(application, "application");
        C10263mq.m29882b(gVar, "adLayout");
        C9807ae aeVar = new C9807ae(gVar);
        C9816aj.C9817a aVar = new C9816aj.C9817a(application, gVar, new C9834ao(C9989ej.SMALL_BANNER, this.f25681a), false);
        aVar.mo64339a(aeVar);
        return aVar.mo64354p();
    }
}
