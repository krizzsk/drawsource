package com.ogury.p377ed.internal;

import android.graphics.Rect;
import android.view.View;
import com.ogury.p377ed.internal.C10146iz;
import java.util.List;

/* renamed from: com.ogury.ed.internal.be */
public final class C9854be {

    /* renamed from: a */
    private final C9852bc f24838a;

    /* renamed from: b */
    private final C9863bl f24839b;

    /* renamed from: c */
    private final List<C9862bk> f24840c;

    private C9854be(C9852bc bcVar, C9863bl blVar) {
        C10263mq.m29882b(bcVar, "rectHelper");
        C10263mq.m29882b(blVar, "screenRotationAdjustment");
        this.f24838a = bcVar;
        this.f24839b = blVar;
        this.f24840c = C10190km.m29758b(new C9861bj(), new C9858bg(), this.f24839b, new C9860bi(1.0f));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C9854be() {
        /*
            r4 = this;
            com.ogury.ed.internal.bc r0 = new com.ogury.ed.internal.bc
            r0.<init>()
            com.ogury.ed.internal.bl r1 = new com.ogury.ed.internal.bl
            android.content.res.Resources r2 = android.content.res.Resources.getSystem()
            android.content.res.Configuration r2 = r2.getConfiguration()
            java.lang.String r3 = "getSystem().configuration"
            com.ogury.p377ed.internal.C10263mq.m29879a((java.lang.Object) r2, (java.lang.String) r3)
            r1.<init>(r2)
            r4.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogury.p377ed.internal.C9854be.<init>():void");
    }

    /* renamed from: a */
    public final C10146iz mo64370a(View view, C10146iz izVar) {
        if (izVar == null || view == null) {
            return null;
        }
        Rect g = izVar.mo64957g();
        Rect c = C9852bc.m28441c(view);
        g.offset(c.left, c.top);
        C10146iz a = m28443a(view, g);
        if (a != null) {
            a.mo64954e(izVar.mo64956f());
        }
        return a;
    }

    /* renamed from: com.ogury.ed.internal.be$a */
    /* synthetic */ class C9855a extends C10262mp implements C10228lk<C10044g, C10182ke> {
        C9855a(Object obj) {
            super(1, obj, C9854be.class, "onMouseUp", "onMouseUp(Lio/presage/ads/viewer/AdLayout;)V");
        }

        /* renamed from: a */
        private void m28448a(C10044g gVar) {
            C10263mq.m29882b(gVar, "p0");
            ((C9854be) this.f25588a).m28445a(gVar);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo64242a(Object obj) {
            m28448a((C10044g) obj);
            return C10182ke.f25542a;
        }
    }

    /* renamed from: a */
    public final C10146iz mo64371a(C10044g gVar, View view) {
        C10263mq.m29882b(gVar, "adLayout");
        C10263mq.m29882b(view, TtmlNode.RUBY_CONTAINER);
        Rect c = C9852bc.m28441c(gVar);
        gVar.setOnMouseUpListener(new C9855a(this));
        return m28443a(view, c);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m28445a(C10044g gVar) {
        this.f24839b.mo64377a(C9852bc.m28441c(gVar));
    }

    /* renamed from: a */
    private final C10146iz m28443a(View view, Rect rect) {
        Rect c = C9852bc.m28441c(view);
        if (C9853bd.m28442a(view, c)) {
            return null;
        }
        for (C9862bk a : this.f24840c) {
            a.mo64373a(rect, c);
        }
        this.f24839b.mo64377a(rect);
        rect.offset(-c.left, -c.top);
        C10146iz.C10147a aVar = C10146iz.f25479a;
        return C10146iz.C10147a.m29656a(rect);
    }
}
