package com.ogury.p377ed.internal;

import android.view.ViewParent;
import android.widget.FrameLayout;
import com.smaato.sdk.video.vast.model.C11130Ad;

/* renamed from: com.ogury.ed.internal.ao */
public final class C9834ao implements C9832am {

    /* renamed from: a */
    private final C9989ej f24804a;

    /* renamed from: b */
    private final C9835ap f24805b;

    /* renamed from: c */
    private final C9842aw f24806c;

    private C9834ao(C9989ej ejVar, C9835ap apVar, C9842aw awVar) {
        C10263mq.m29882b(ejVar, C11130Ad.AD_TYPE);
        C10263mq.m29882b(apVar, "interstitialShowCommand");
        C10263mq.m29882b(awVar, "expandCacheStore");
        this.f24804a = ejVar;
        this.f24805b = apVar;
        this.f24806c = awVar;
    }

    public /* synthetic */ C9834ao(C9989ej ejVar, C9835ap apVar) {
        this(ejVar, apVar, C9842aw.f24821a);
    }

    /* renamed from: a */
    public final void mo64282a(C10044g gVar, C9816aj ajVar) {
        C10263mq.m29882b(gVar, "adLayout");
        C10263mq.m29882b(ajVar, "adController");
        ViewParent parent = gVar.getParent();
        FrameLayout frameLayout = parent instanceof FrameLayout ? (FrameLayout) parent : null;
        if (frameLayout != null) {
            gVar.mo64735a();
            ajVar.mo64320h();
            ajVar.mo64327o();
            gVar.setupDrag(false);
            if (this.f24804a.mo64572e()) {
                gVar.setLeft(0);
                gVar.setTop(0);
            }
            String a = C9842aw.m28410a(new C9841av(this.f24804a, frameLayout, gVar, ajVar));
            C9981eb f = ajVar.mo64318f();
            if (f != null) {
                this.f24805b.mo64362a(ajVar.mo64302a(), a, f, ajVar.mo64317e());
            }
        }
    }
}
