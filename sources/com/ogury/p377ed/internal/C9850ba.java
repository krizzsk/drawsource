package com.ogury.p377ed.internal;

import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: com.ogury.ed.internal.ba */
public final class C9850ba {

    /* renamed from: a */
    private final ViewGroup f24836a;

    public C9850ba(ViewGroup viewGroup) {
        C10263mq.m29882b(viewGroup, "adLayout");
        this.f24836a = viewGroup;
    }

    /* renamed from: a */
    public final void mo64369a(C10074gy gyVar) {
        C10263mq.m29882b(gyVar, "adExposure");
        ViewParent parent = this.f24836a.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null && viewGroup.getVisibility() != 0) {
            gyVar.mo64794a(0.0f);
        }
    }
}
