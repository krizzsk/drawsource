package com.ogury.p377ed.internal;

import android.graphics.Rect;

/* renamed from: com.ogury.ed.internal.bj */
public final class C9861bj implements C9862bk {

    /* renamed from: a */
    private int f24848a;

    /* renamed from: a */
    public final void mo64373a(Rect rect, Rect rect2) {
        C10263mq.m29882b(rect, "adLayoutRect");
        C10263mq.m29882b(rect2, "containerRect");
        int i = rect2.top - this.f24848a;
        if (i != 0) {
            this.f24848a = rect2.top;
            rect.top -= i;
            rect.bottom -= i;
        }
    }
}
