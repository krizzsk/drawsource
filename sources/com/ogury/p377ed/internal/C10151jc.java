package com.ogury.p377ed.internal;

import com.smaato.sdk.core.injections.CoreLightModuleInterface;
import com.tapjoy.TJAdUnitConstants;

/* renamed from: com.ogury.ed.internal.jc */
public final class C10151jc implements C10154je {

    /* renamed from: a */
    private final C10008ez f25494a;

    /* renamed from: b */
    private final C10154je f25495b;

    /* renamed from: c */
    private final C9981eb f25496c;

    public C10151jc(C10008ez ezVar, C10154je jeVar, C9981eb ebVar) {
        C10263mq.m29882b(ezVar, "androidDevice");
        C10263mq.m29882b(jeVar, "orientationChangedCommand");
        C10263mq.m29882b(ebVar, "ad");
        this.f25494a = ezVar;
        this.f25495b = jeVar;
        this.f25496c = ebVar;
    }

    /* renamed from: a */
    public final void mo64962a(C10078hb hbVar) {
        C10263mq.m29882b(hbVar, "mraidCommandExecutor");
        C10158jh a = hbVar.mo64799a();
        int a2 = C10054gi.m29195a(a.getWidth());
        int a3 = C10054gi.m29195a(a.getHeight());
        int a4 = C10054gi.m29194a(a.getX());
        int a5 = C10054gi.m29194a(a.getY());
        this.f25495b.mo64962a(hbVar);
        hbVar.mo64804a(C9992el.m28924a(this.f25496c) ? "interstitial" : TJAdUnitConstants.String.INLINE);
        hbVar.mo64807a(false);
        hbVar.mo64800a(this.f25494a.mo64625m());
        hbVar.mo64809b();
        hbVar.mo64802a(a2, a3, a4, a5);
        hbVar.mo64811b(a2, a3, a4, a5);
        hbVar.mo64816c(a2, a3, a4, a5);
        hbVar.mo64815c(a2, a3);
        hbVar.mo64812b(CoreLightModuleInterface.NAME_DEFAULT_HTTP_HANDLER);
    }
}
