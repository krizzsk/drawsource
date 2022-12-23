package com.ogury.p376cm.internal;

import com.ogury.p376cm.internal.bbacb;

/* renamed from: com.ogury.cm.internal.abacb */
public final class abacb<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public bbaaa<? extends T> f24310a;

    /* renamed from: com.ogury.cm.internal.abacb$aaaaa */
    static final class aaaaa extends bbaca implements bbaaa<babcc> {

        /* renamed from: a */
        final /* synthetic */ abacb f24311a;

        /* renamed from: b */
        final /* synthetic */ bbaab f24312b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aaaaa(abacb abacb, bbaab bbaab) {
            super(0);
            this.f24311a = abacb;
            this.f24312b = bbaab;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo63787a() {
            final bbacb.aaaab aaaab = new bbacb.aaaab();
            aaaab.f24528a = this.f24311a.f24310a.mo63787a();
            abbac abbac = abbac.f24317a;
            abbac.m27818b().mo63835a(new bbaaa<babcc>(this) {

                /* renamed from: a */
                final /* synthetic */ aaaaa f24313a;

                {
                    this.f24313a = r1;
                }

                /* renamed from: a */
                public final /* bridge */ /* synthetic */ Object mo63787a() {
                    this.f24313a.f24312b.mo63791a(aaaab.f24528a);
                    return babcc.f24512a;
                }
            });
            return babcc.f24512a;
        }
    }

    public abacb(bbaaa<? extends T> bbaaa) {
        bbabc.m28052b(bbaaa, "action");
        this.f24310a = bbaaa;
    }

    /* renamed from: a */
    public final void mo63837a(bbaab<? super T, babcc> bbaab) {
        bbabc.m28052b(bbaab, "callback");
        abbac abbac = abbac.f24317a;
        abbac.m27817a().mo63835a(new aaaaa(this, bbaab));
    }
}
