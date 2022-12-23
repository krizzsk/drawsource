package com.ogury.p377ed.internal;

import android.graphics.Rect;
import android.view.View;

/* renamed from: com.ogury.ed.internal.jf */
public final class C10155jf implements C10154je {

    /* renamed from: a */
    private final C10008ez f25502a;

    /* renamed from: b */
    private final boolean f25503b;

    public C10155jf(C10008ez ezVar, boolean z) {
        C10263mq.m29882b(ezVar, "androidDevice");
        this.f25502a = ezVar;
        this.f25503b = z;
    }

    /* renamed from: a */
    public final void mo64962a(C10078hb hbVar) {
        C10263mq.m29882b(hbVar, "mraidCommandExecutor");
        int a = C10054gi.m29195a(this.f25502a.mo64623k());
        int a2 = C10054gi.m29195a(this.f25502a.mo64624l());
        Rect a3 = this.f25502a.mo64618a((View) hbVar.mo64799a());
        hbVar.mo64801a(a, a2);
        hbVar.mo64810b(C10054gi.m29195a(a3.width()), C10054gi.m29195a(a3.height()));
        m29679b(hbVar);
    }

    /* renamed from: b */
    private final void m29679b(C10078hb hbVar) {
        String n = this.f25502a.mo64626n();
        hbVar.mo64806a(n, this.f25503b);
        if (!this.f25503b) {
            n = "none";
        }
        hbVar.mo64808a(!this.f25503b, n);
    }
}
