package com.ogury.p377ed.internal;

import android.graphics.Rect;
import android.view.View;

/* renamed from: com.ogury.ed.internal.bc */
public final class C9852bc {
    /* renamed from: a */
    public static Rect m28439a(View view) {
        C10263mq.m29882b(view, "view");
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }

    /* renamed from: b */
    public static Rect m28440b(View view) {
        C10263mq.m29882b(view, "view");
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        return rect;
    }

    /* renamed from: c */
    public static Rect m28441c(View view) {
        C10263mq.m29882b(view, "view");
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        if (rect.width() != view.getWidth()) {
            rect.right = rect.left + view.getWidth();
        }
        if (rect.height() != view.getHeight()) {
            rect.bottom = rect.top + view.getHeight();
        }
        return rect;
    }
}
