package com.ogury.p377ed.internal;

import android.graphics.Rect;
import android.view.ViewGroup;

/* renamed from: com.ogury.ed.internal.bf */
public final class C9856bf {

    /* renamed from: a */
    public static final C9857a f24841a = new C9857a((byte) 0);

    /* renamed from: b */
    private final C9860bi f24842b;

    /* renamed from: c */
    private final int f24843c;

    private C9856bf(C9860bi biVar) {
        C10263mq.m29882b(biVar, "minVisibilityAdjustmentGateway");
        this.f24842b = biVar;
        this.f24843c = C10054gi.m29196b(50);
    }

    public /* synthetic */ C9856bf() {
        this(new C9860bi(0.75f));
    }

    /* renamed from: com.ogury.ed.internal.bf$a */
    public static final class C9857a {
        public /* synthetic */ C9857a(byte b) {
            this();
        }

        private C9857a() {
        }
    }

    /* renamed from: a */
    public final boolean mo64372a(ViewGroup viewGroup, C10146iz izVar) {
        C10263mq.m29882b(viewGroup, "adLayout");
        C10263mq.m29882b(izVar, "resizeProps");
        if (izVar.mo64947b() < this.f24843c || izVar.mo64949c() < this.f24843c) {
            return false;
        }
        Rect rect = new Rect();
        viewGroup.getWindowVisibleDisplayFrame(rect);
        Rect a = m28450a(rect, izVar);
        C9859bh b = this.f24842b.mo64376b(a, rect);
        float b2 = b.mo64375b();
        if (b2 < 0.5f) {
            return false;
        }
        if (!izVar.mo64946a() && b2 < 0.75f) {
            return false;
        }
        if (!izVar.mo64946a() || b2 >= 0.75f) {
            return true;
        }
        if (!b.mo64374a()) {
            return false;
        }
        m28451a(izVar, a, rect);
        return true;
    }

    /* renamed from: a */
    private static void m28451a(C10146iz izVar, Rect rect, Rect rect2) {
        izVar.mo64950c(rect.left - rect2.left);
        izVar.mo64952d(rect.top - rect2.top);
        izVar.mo64944a(rect.width());
        izVar.mo64948b(rect.height());
    }

    /* renamed from: a */
    private static Rect m28450a(Rect rect, C10146iz izVar) {
        Rect rect2 = new Rect();
        rect2.left = rect.left + izVar.mo64951d();
        rect2.top = rect.top + izVar.mo64953e();
        rect2.right = rect2.left + izVar.mo64947b();
        rect2.bottom = rect2.top + izVar.mo64949c();
        return rect2;
    }
}
