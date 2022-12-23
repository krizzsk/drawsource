package com.ogury.p377ed.internal;

import android.content.res.Configuration;
import android.graphics.Rect;

/* renamed from: com.ogury.ed.internal.bl */
public final class C9863bl implements C9862bk {

    /* renamed from: a */
    private final Configuration f24849a;

    /* renamed from: b */
    private Rect f24850b = new Rect();

    /* renamed from: c */
    private Rect f24851c = new Rect();

    /* renamed from: d */
    private int f24852d = this.f24849a.orientation;

    public C9863bl(Configuration configuration) {
        C10263mq.m29882b(configuration, "configuration");
        this.f24849a = configuration;
    }

    /* renamed from: a */
    public final void mo64373a(Rect rect, Rect rect2) {
        C10263mq.m29882b(rect, "adLayoutRect");
        C10263mq.m29882b(rect2, "containerRect");
        int i = this.f24849a.orientation;
        if (this.f24852d != i) {
            m28469b(rect, rect2);
            m28470c(rect, rect2);
        }
        this.f24850b = new Rect(rect2);
        this.f24852d = i;
    }

    /* renamed from: b */
    private final void m28469b(Rect rect, Rect rect2) {
        int i = this.f24851c.left - this.f24850b.left;
        int width = this.f24850b.width() - this.f24851c.width();
        if (width != 0) {
            float f = ((float) i) / ((float) width);
            int width2 = rect.width();
            rect.left = rect2.left + C10276nc.m29907a(((float) (rect2.width() - width2)) * f);
            rect.right = rect.left + width2;
        }
    }

    /* renamed from: c */
    private final void m28470c(Rect rect, Rect rect2) {
        int i = this.f24851c.top - this.f24850b.top;
        int height = this.f24850b.height() - this.f24851c.height();
        if (height != 0) {
            float f = ((float) i) / ((float) height);
            int height2 = rect.height();
            rect.top = rect2.top + C10276nc.m29907a(((float) (rect2.height() - height2)) * f);
            rect.bottom = rect.top + height2;
        }
    }

    /* renamed from: a */
    public final void mo64377a(Rect rect) {
        C10263mq.m29882b(rect, "adLayoutRect");
        this.f24851c = new Rect(rect);
    }
}
