package com.ogury.p377ed.internal;

import android.graphics.Rect;

/* renamed from: com.ogury.ed.internal.bi */
public final class C9860bi implements C9862bk {

    /* renamed from: a */
    private final float f24847a;

    public C9860bi(float f) {
        this.f24847a = f;
    }

    /* renamed from: a */
    public final void mo64373a(Rect rect, Rect rect2) {
        C10263mq.m29882b(rect, "adLayoutRect");
        C10263mq.m29882b(rect2, "containerRect");
        new C9859bh(rect, rect2, this.f24847a).mo64373a(rect, rect2);
    }

    /* renamed from: b */
    public final C9859bh mo64376b(Rect rect, Rect rect2) {
        C10263mq.m29882b(rect, "adLayoutRect");
        C10263mq.m29882b(rect2, "containerRect");
        return new C9859bh(rect, rect2, this.f24847a);
    }
}
