package com.ogury.p377ed.internal;

import java.util.List;

/* renamed from: com.ogury.ed.internal.ck */
public final class C9901ck {

    /* renamed from: a */
    private List<String> f24943a = C10190km.m29757a();

    /* renamed from: b */
    private List<? extends Class<?>> f24944b = C10190km.m29757a();

    /* renamed from: a */
    public final List<String> mo64436a() {
        return this.f24943a;
    }

    /* renamed from: a */
    public final void mo64437a(List<String> list) {
        C10263mq.m29882b(list, "<set-?>");
        this.f24943a = list;
    }

    /* renamed from: b */
    public final List<Class<?>> mo64438b() {
        return this.f24944b;
    }

    /* renamed from: b */
    public final void mo64439b(List<? extends Class<?>> list) {
        C10263mq.m29882b(list, "<set-?>");
        this.f24944b = list;
    }

    /* renamed from: c */
    public final boolean mo64440c() {
        return this.f24943a.isEmpty() && this.f24944b.isEmpty();
    }
}
