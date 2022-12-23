package com.ogury.p377ed.internal;

import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ogury.ed.internal.ip */
public final class C10132ip implements C10130in {

    /* renamed from: a */
    private final C10127il f25443a;

    /* renamed from: b */
    private LinkedList<C10133iq> f25444b = new LinkedList<>();

    public C10132ip(C10127il ilVar) {
        C10263mq.m29882b(ilVar, "loadCallback");
        this.f25443a = ilVar;
    }

    /* renamed from: a */
    public final void mo64908a(List<? extends C10133iq> list) {
        C10263mq.m29882b(list, "loadCommands");
        this.f25444b.addAll(list);
        m29540b();
    }

    /* renamed from: a */
    public final void mo64907a() {
        m29540b();
    }

    /* renamed from: b */
    private final void m29540b() {
        C10133iq pollFirst = this.f25444b.pollFirst();
        if (pollFirst != null) {
            pollFirst.mo64909a(this.f25443a);
        }
    }
}
