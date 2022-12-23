package com.ogury.p377ed.internal;

import android.graphics.Rect;
import java.util.List;

/* renamed from: com.ogury.ed.internal.ay */
public final class C9847ay {
    /* renamed from: a */
    public static final int m28423a(Rect rect) {
        C10263mq.m29882b(rect, "<this>");
        return rect.width() * rect.height();
    }

    /* renamed from: a */
    public static final void m28425a(Rect rect, Rect rect2) {
        C10263mq.m29882b(rect, "<this>");
        C10263mq.m29882b(rect2, "screenRect");
        rect.offset(-rect2.left, -rect2.top);
    }

    /* renamed from: a */
    public static final void m28426a(List<Rect> list, Rect rect) {
        C10263mq.m29882b(list, "<this>");
        C10263mq.m29882b(rect, "containerRect");
        for (Rect a : list) {
            m28425a(a, rect);
        }
    }

    /* renamed from: a */
    public static final boolean m28427a(Rect rect, List<Rect> list) {
        C10263mq.m29882b(rect, "<this>");
        C10263mq.m29882b(list, "rectangles");
        return list.contains(rect);
    }

    /* renamed from: b */
    public static final int m28429b(Rect rect, Rect rect2) {
        C10263mq.m29882b(rect, "<this>");
        C10263mq.m29882b(rect2, "rect2");
        if (rect.left >= rect2.right || rect2.left >= rect.right || rect.top >= rect2.bottom || rect2.top >= rect.bottom) {
            return 0;
        }
        int max = Math.max(rect.left, rect2.left);
        int max2 = Math.max(rect.top, rect2.top);
        return (Math.min(rect.right, rect2.right) - max) * (Math.min(rect.bottom, rect2.bottom) - max2);
    }

    /* renamed from: a */
    public static final boolean m28428a(List<Rect> list, int i, int i2) {
        C10263mq.m29882b(list, "<this>");
        for (Rect contains : list) {
            if (contains.contains(i, i2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static final Rect m28430c(Rect rect, Rect rect2) {
        C10263mq.m29882b(rect, "<this>");
        C10263mq.m29882b(rect2, "rect2");
        Rect rect3 = new Rect(rect);
        if (!rect3.intersect(rect2)) {
            return null;
        }
        return rect3;
    }

    /* renamed from: a */
    public static final void m28424a(Rect rect, float f) {
        C10263mq.m29882b(rect, "<this>");
        rect.bottom = rect.top + ((int) (((float) rect.height()) / f));
        rect.right = rect.left + ((int) (((float) rect.width()) / f));
    }
}
