package com.ogury.p377ed.internal;

import java.util.List;

/* renamed from: com.ogury.ed.internal.ij */
public final class C10124ij implements C10130in {

    /* renamed from: a */
    private final C10127il f25428a;

    /* renamed from: a */
    public final void mo64907a() {
    }

    public C10124ij(C10127il ilVar) {
        C10263mq.m29882b(ilVar, "loadCallback");
        this.f25428a = ilVar;
    }

    /* renamed from: a */
    public final void mo64908a(List<? extends C10133iq> list) {
        C10263mq.m29882b(list, "loadCommands");
        for (C10133iq a : list) {
            a.mo64909a(this.f25428a);
        }
    }
}
