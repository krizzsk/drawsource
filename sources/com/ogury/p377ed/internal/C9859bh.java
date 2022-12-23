package com.ogury.p377ed.internal;

import android.graphics.Rect;

/* renamed from: com.ogury.ed.internal.bh */
public final class C9859bh implements C9862bk {

    /* renamed from: a */
    private final Rect f24844a;

    /* renamed from: b */
    private final Rect f24845b;

    /* renamed from: c */
    private final float f24846c;

    public C9859bh(Rect rect, Rect rect2, float f) {
        C10263mq.m29882b(rect, "adLayoutRect");
        C10263mq.m29882b(rect2, "containerRect");
        this.f24844a = rect;
        this.f24845b = rect2;
        this.f24846c = f;
    }

    /* renamed from: a */
    public final void mo64373a(Rect rect, Rect rect2) {
        C10263mq.m29882b(rect, "adLayoutRect");
        C10263mq.m29882b(rect2, "containerRect");
        mo64374a();
    }

    /* renamed from: a */
    public final boolean mo64374a() {
        return m28457c() || m28458d() || m28459e() || m28460f();
    }

    /* renamed from: c */
    private final boolean m28457c() {
        if (this.f24844a.left < this.f24845b.left) {
            this.f24844a.right += this.f24845b.left - this.f24844a.left;
            this.f24844a.left = this.f24845b.left;
        }
        return m28461g();
    }

    /* renamed from: d */
    private final boolean m28458d() {
        if (this.f24844a.top < this.f24845b.top) {
            this.f24844a.bottom += this.f24845b.top - this.f24844a.top;
            this.f24844a.top = this.f24845b.top;
        }
        return m28461g();
    }

    /* renamed from: e */
    private final boolean m28459e() {
        if (this.f24844a.right > this.f24845b.right) {
            int i = this.f24844a.right - this.f24845b.right;
            this.f24844a.left -= i;
            this.f24844a.right -= i;
        }
        return m28461g();
    }

    /* renamed from: f */
    private final boolean m28460f() {
        if (this.f24844a.bottom > this.f24845b.bottom) {
            int i = this.f24844a.bottom - this.f24845b.bottom;
            this.f24844a.top -= i;
            this.f24844a.bottom -= i;
        }
        return m28461g();
    }

    /* renamed from: g */
    private final boolean m28461g() {
        return mo64375b() >= this.f24846c;
    }

    /* renamed from: b */
    public final float mo64375b() {
        Rect c = C9847ay.m28430c(this.f24844a, this.f24845b);
        if (c == null) {
            return 0.0f;
        }
        return ((float) (c.width() * c.height())) / ((float) (this.f24844a.width() * this.f24844a.height()));
    }
}
