package com.fyber.inneractive.sdk.web;

import android.content.Context;
import android.view.ViewTreeObserver;

/* renamed from: com.fyber.inneractive.sdk.web.e */
public class C5361e implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    public final /* synthetic */ Context f14165a;

    /* renamed from: b */
    public final /* synthetic */ C5349d f14166b;

    public C5361e(C5349d dVar, Context context) {
        this.f14166b = dVar;
        this.f14165a = context;
    }

    public boolean onPreDraw() {
        C5347c cVar = this.f14166b.f14079b;
        if (cVar == null) {
            return false;
        }
        cVar.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f14166b.mo26469a(this.f14165a, true);
        return false;
    }
}
