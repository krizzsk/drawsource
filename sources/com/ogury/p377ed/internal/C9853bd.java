package com.ogury.p377ed.internal;

import android.graphics.Rect;
import android.view.View;

/* renamed from: com.ogury.ed.internal.bd */
public final class C9853bd {
    /* renamed from: a */
    public static final boolean m28442a(View view, Rect rect) {
        C10263mq.m29882b(view, "<this>");
        C10263mq.m29882b(rect, "containerRect");
        return ((float) rect.height()) <= ((float) view.getRootView().getHeight()) * 0.4f;
    }
}
