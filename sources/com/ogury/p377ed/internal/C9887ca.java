package com.ogury.p377ed.internal;

import android.app.Activity;

/* renamed from: com.ogury.ed.internal.ca */
public final class C9887ca {

    /* renamed from: a */
    public static final C9888a f24920a = new C9888a((byte) 0);

    /* renamed from: b */
    private final C9889cb f24921b;

    /* renamed from: com.ogury.ed.internal.ca$a */
    public static final class C9888a {
        public /* synthetic */ C9888a(byte b) {
            this();
        }

        private C9888a() {
        }

        /* renamed from: a */
        public static C9887ca m28561a(Activity activity) {
            C10263mq.m29882b(activity, "activity");
            return new C9887ca(new C9889cb(activity));
        }
    }

    public C9887ca(C9889cb cbVar) {
        C10263mq.m29882b(cbVar, "overlayScreenArea");
        this.f24921b = cbVar;
    }

    /* renamed from: a */
    public final int mo64425a(C9885bz bzVar, C10000et etVar) {
        C10263mq.m29882b(bzVar, "overlayPosition");
        C10263mq.m29882b(etVar, "overlayAdResponse");
        if (C10007ey.m28965a(bzVar.mo64419a())) {
            return bzVar.mo64420b();
        }
        return C10054gi.m29195a((this.f24921b.mo64427a() - C10054gi.m29196b(bzVar.mo64420b())) - etVar.mo64600b());
    }

    /* renamed from: b */
    public final int mo64426b(C9885bz bzVar, C10000et etVar) {
        C10263mq.m29882b(bzVar, "overlayPosition");
        C10263mq.m29882b(etVar, "overlayAdResponse");
        if (C10007ey.m28966b(bzVar.mo64419a())) {
            return bzVar.mo64421c();
        }
        return C10054gi.m29195a((this.f24921b.mo64428b() - C10054gi.m29196b(bzVar.mo64421c())) - etVar.mo64602c());
    }
}
