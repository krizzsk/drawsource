package com.bytedance.sdk.component.adexpress.dynamic.animation.p097a;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2610a;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.a.c */
/* compiled from: AnimatorFactory */
public class C2591c {

    /* renamed from: a */
    private static volatile C2591c f5524a;

    private C2591c() {
    }

    /* renamed from: a */
    public static C2591c m6703a() {
        if (f5524a == null) {
            synchronized (C2591c.class) {
                if (f5524a == null) {
                    f5524a = new C2591c();
                }
            }
        }
        return f5524a;
    }

    /* renamed from: a */
    public C2592d mo16804a(View view, C2610a aVar) {
        if (aVar == null) {
            return null;
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).setClipChildren(false);
        }
        if (view.getParent().getParent() != null) {
            ((ViewGroup) view.getParent().getParent()).setClipChildren(false);
        }
        if ("scale".equals(aVar.mo16858h())) {
            return new C2602h(view, aVar);
        }
        if ("translate".equals(aVar.mo16858h())) {
            return new C2605k(view, aVar);
        }
        if ("ripple".equals(aVar.mo16858h())) {
            return new C2598f(view, aVar);
        }
        if ("marquee".equals(aVar.mo16858h())) {
            return new C2597e(view, aVar);
        }
        if ("waggle".equals(aVar.mo16858h())) {
            return new C2606l(view, aVar);
        }
        if ("shine".equals(aVar.mo16858h())) {
            return new C2603i(view, aVar);
        }
        if ("swing".equals(aVar.mo16858h())) {
            return new C2604j(view, aVar);
        }
        if ("fade".equals(aVar.mo16858h())) {
            return new C2589a(view, aVar);
        }
        if ("rubIn".equals(aVar.mo16858h())) {
            return new C2599g(view, aVar);
        }
        return null;
    }
}
