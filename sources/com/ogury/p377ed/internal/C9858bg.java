package com.ogury.p377ed.internal;

import android.graphics.Rect;

/* renamed from: com.ogury.ed.internal.bg */
public final class C9858bg implements C9862bk {
    /* renamed from: a */
    private static float m28453a(int i, int i2) {
        return ((float) i) / ((float) i2);
    }

    /* renamed from: a */
    public final void mo64373a(Rect rect, Rect rect2) {
        C10263mq.m29882b(rect, "adLayoutRect");
        C10263mq.m29882b(rect2, "containerRect");
        m28454b(rect, rect2);
        m28455c(rect, rect2);
    }

    /* renamed from: b */
    private static void m28454b(Rect rect, Rect rect2) {
        if (rect.width() > rect2.width()) {
            C9847ay.m28424a(rect, m28453a(rect.width(), rect2.width()));
        }
    }

    /* renamed from: c */
    private static void m28455c(Rect rect, Rect rect2) {
        if (rect.height() > rect2.height()) {
            C9847ay.m28424a(rect, m28453a(rect.height(), rect2.height()));
        }
    }
}
