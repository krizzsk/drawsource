package com.inmobi.media;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import com.inmobi.media.C5977el;
import java.lang.ref.WeakReference;

/* renamed from: com.inmobi.media.ed */
/* compiled from: DecorViewVisibilityTracker */
final class C5959ed extends C5977el {

    /* renamed from: a */
    private static final String f15100a = C5959ed.class.getSimpleName();

    /* renamed from: d */
    private ViewTreeObserver.OnPreDrawListener f15101d;

    /* renamed from: e */
    private final WeakReference<View> f15102e;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo35081a() {
        return 100;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo35082b() {
    }

    C5959ed(C5977el.C5978a aVar, Activity activity) {
        super(aVar, (byte) 1);
        View decorView = activity.getWindow().getDecorView();
        this.f15102e = new WeakReference<>(decorView);
        ViewTreeObserver viewTreeObserver = decorView.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            C59601 r3 = new ViewTreeObserver.OnPreDrawListener() {
                public final boolean onPreDraw() {
                    C5959ed.this.mo35111h();
                    return true;
                }
            };
            this.f15101d = r3;
            viewTreeObserver.addOnPreDrawListener(r3);
        }
    }

    /* renamed from: i */
    private void m17715i() {
        View view = (View) this.f15102e.get();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f15101d);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo35085e() {
        m17715i();
        super.mo35085e();
    }

    /* renamed from: c */
    public final void mo35083c() {
        if (!this.f15147b) {
            m17715i();
            super.mo35083c();
        }
    }

    /* renamed from: d */
    public final void mo35084d() {
        if (this.f15147b) {
            View view = (View) this.f15102e.get();
            if (view != null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnPreDrawListener(this.f15101d);
                }
            }
            super.mo35084d();
        }
    }
}
