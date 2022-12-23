package com.ogury.p377ed.internal;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.ogury.ed.internal.cb */
public final class C9889cb {

    /* renamed from: a */
    private final View f24922a;

    public C9889cb(Activity activity) {
        C10263mq.m29882b(activity, "activity");
        View decorView = activity.getWindow().getDecorView();
        if (decorView != null) {
            this.f24922a = ((ViewGroup) decorView).getChildAt(0);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* renamed from: a */
    public final int mo64427a() {
        return this.f24922a.getMeasuredWidth();
    }

    /* renamed from: b */
    public final int mo64428b() {
        return this.f24922a.getMeasuredHeight();
    }
}
