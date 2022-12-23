package com.ogury.p377ed.internal;

import android.app.Activity;
import android.widget.FrameLayout;

/* renamed from: com.ogury.ed.internal.aq */
public final class C9836aq implements C9832am {

    /* renamed from: a */
    private final FrameLayout f24807a;

    /* renamed from: b */
    private final Activity f24808b;

    /* renamed from: c */
    private final C9832am f24809c;

    public C9836aq(FrameLayout frameLayout, Activity activity, C9832am amVar) {
        C10263mq.m29882b(activity, "interstitialActivity");
        C10263mq.m29882b(amVar, "closeCommandInCollapsedMode");
        this.f24807a = frameLayout;
        this.f24808b = activity;
        this.f24809c = amVar;
    }

    /* renamed from: a */
    public final void mo64282a(C10044g gVar, C9816aj ajVar) {
        C10263mq.m29882b(gVar, "adLayout");
        C10263mq.m29882b(ajVar, "adController");
        if (ajVar.mo64315c()) {
            this.f24808b.finish();
            return;
        }
        gVar.mo64735a();
        gVar.setupDrag(false);
        gVar.mo64739c();
        FrameLayout frameLayout = this.f24807a;
        if (frameLayout != null) {
            frameLayout.addView(gVar);
        }
        ajVar.mo64319g();
        this.f24808b.finish();
        ajVar.mo64311b(this.f24809c);
        ajVar.mo64304a((C9832am) new C9803aa());
    }
}
