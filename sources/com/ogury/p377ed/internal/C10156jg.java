package com.ogury.p377ed.internal;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: com.ogury.ed.internal.jg */
public final class C10156jg implements C10154je {

    /* renamed from: a */
    private final C10008ez f25504a;

    public C10156jg(C10008ez ezVar) {
        C10263mq.m29882b(ezVar, "androidDevice");
        this.f25504a = ezVar;
    }

    /* renamed from: com.ogury.ed.internal.jg$a */
    static final class C10157a extends C10264mr implements C10227lj<C10182ke> {

        /* renamed from: a */
        final /* synthetic */ C10156jg f25505a;

        /* renamed from: b */
        final /* synthetic */ C10078hb f25506b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10157a(C10156jg jgVar, C10078hb hbVar) {
            super(0);
            this.f25505a = jgVar;
            this.f25506b = hbVar;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo64355a() {
            m29684b();
            return C10182ke.f25542a;
        }

        /* renamed from: b */
        private void m29684b() {
            this.f25505a.m29682b(this.f25506b);
        }
    }

    /* renamed from: a */
    public final void mo64962a(C10078hb hbVar) {
        C10263mq.m29882b(hbVar, "mraidCommandExecutor");
        C10064gr.m29215a(hbVar.mo64799a(), new C10157a(this, hbVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m29682b(C10078hb hbVar) {
        C10158jh a = hbVar.mo64799a();
        int a2 = C10054gi.m29195a(a.getWidth());
        int a3 = C10054gi.m29195a(a.getHeight());
        ViewParent parent = a.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            viewGroup = a;
        }
        int a4 = C10054gi.m29194a(viewGroup.getX());
        int a5 = C10054gi.m29194a(viewGroup.getY());
        Rect a6 = this.f25504a.mo64618a((View) hbVar.mo64799a());
        hbVar.mo64810b(C10054gi.m29195a(a6.width()), C10054gi.m29195a(a6.height()));
        hbVar.mo64802a(a2, a3, a4, a5);
    }
}
