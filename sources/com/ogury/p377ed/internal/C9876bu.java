package com.ogury.p377ed.internal;

import android.app.Activity;

/* renamed from: com.ogury.ed.internal.bu */
public final class C9876bu {

    /* renamed from: a */
    private final C10044g f24891a;

    /* renamed from: b */
    private final C9816aj f24892b;

    /* renamed from: c */
    private final C10329s f24893c;

    private C9876bu(C10044g gVar, C9816aj ajVar, C10329s sVar) {
        C10263mq.m29882b(gVar, "adLayout");
        C10263mq.m29882b(ajVar, "adController");
        C10263mq.m29882b(sVar, "oguryAds");
        this.f24891a = gVar;
        this.f24892b = ajVar;
        this.f24893c = sVar;
    }

    public /* synthetic */ C9876bu(C10044g gVar, C9816aj ajVar) {
        this(gVar, ajVar, C10329s.f25652a);
    }

    /* renamed from: a */
    public final void mo64401a(Activity activity) {
        C10263mq.m29882b(activity, "activity");
        if (C10329s.m29988c() && this.f24891a.getParent() == null && this.f24892b.mo64321i()) {
            C10329s.m29984a(true);
            C10044g gVar = this.f24891a;
            activity.addContentView(gVar, gVar.getLayoutParams());
            m28520b(activity);
        }
    }

    /* renamed from: b */
    private final void m28520b(Activity activity) {
        if (activity.hasWindowFocus()) {
            this.f24892b.mo64328p();
        } else {
            this.f24892b.mo64327o();
        }
    }

    /* renamed from: a */
    public final void mo64400a() {
        if (this.f24891a.getParent() != null && !this.f24892b.mo64333u()) {
            this.f24892b.mo64327o();
            this.f24891a.mo64735a();
        }
    }
}
