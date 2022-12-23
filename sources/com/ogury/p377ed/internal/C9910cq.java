package com.ogury.p377ed.internal;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ogury.ed.internal.cq */
public final class C9910cq implements C9911cr {

    /* renamed from: a */
    private final List<C9911cr> f24955a = new ArrayList();

    /* renamed from: a */
    public final void mo64446a() {
        for (C9911cr a : this.f24955a) {
            a.mo64446a();
        }
        this.f24955a.clear();
    }

    /* renamed from: a */
    public final void mo64447a(C9911cr crVar) {
        C10263mq.m29882b(crVar, "disposable");
        this.f24955a.add(crVar);
    }
}
