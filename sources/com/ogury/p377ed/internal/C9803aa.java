package com.ogury.p377ed.internal;

import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: com.ogury.ed.internal.aa */
public final class C9803aa implements C9832am {
    /* renamed from: a */
    public final void mo64282a(C10044g gVar, C9816aj ajVar) {
        C10263mq.m29882b(gVar, "adLayout");
        C10263mq.m29882b(ajVar, "adController");
        ViewGroup.LayoutParams layoutParams = gVar.getLayoutParams();
        if (layoutParams != null) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 0;
            gVar.setLeft(0);
            gVar.setTop(0);
            gVar.mo64739c();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }
}
