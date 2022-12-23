package com.applovin.impl.mediation.p032b.p033a;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.applovin.impl.mediation.b.a.c */
public class C1622c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final WeakHashMap<View, Integer> f2225a = new WeakHashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f2226b = new Object();

    /* renamed from: c */
    private final Handler f2227c = new Handler();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f2228d = false;

    /* renamed from: e */
    private final WeakReference<View> f2229e;

    /* renamed from: f */
    private final ViewTreeObserver.OnPreDrawListener f2230f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C1625a f2231g;

    /* renamed from: com.applovin.impl.mediation.b.a.c$a */
    public interface C1625a {
        /* renamed from: a */
        void mo13572a(int i, int i2);
    }

    public C1622c(View view) {
        this.f2229e = new WeakReference<>(view);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            C16231 r0 = new ViewTreeObserver.OnPreDrawListener() {
                public boolean onPreDraw() {
                    C1622c.this.m3244b();
                    return true;
                }
            };
            this.f2230f = r0;
            viewTreeObserver.addOnPreDrawListener(r0);
            return;
        }
        this.f2230f = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m3244b() {
        if (!this.f2228d) {
            this.f2228d = true;
            this.f2227c.postDelayed(new Runnable() {
                public void run() {
                    synchronized (C1622c.this.f2226b) {
                        boolean unused = C1622c.this.f2228d = false;
                        int i = -1;
                        int i2 = -1;
                        for (Map.Entry entry : C1622c.this.f2225a.entrySet()) {
                            if (C1622c.this.m3245b((View) entry.getKey())) {
                                Integer num = (Integer) entry.getValue();
                                if (i == -1 && i2 == -1) {
                                    i = num.intValue();
                                    i2 = num.intValue();
                                } else {
                                    i = Math.min(i, ((Integer) entry.getValue()).intValue());
                                    i2 = Math.max(i2, ((Integer) entry.getValue()).intValue());
                                }
                            }
                        }
                        if (C1622c.this.f2231g != null) {
                            C1622c.this.f2231g.mo13572a(i, i2);
                        }
                    }
                }
            }, 100);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m3245b(View view) {
        return (view == null || view.getVisibility() != 0 || view.getParent() == null) ? false : true;
    }

    /* renamed from: a */
    public void mo13566a() {
        ViewTreeObserver.OnPreDrawListener onPreDrawListener;
        this.f2231g = null;
        View view = (View) this.f2229e.get();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive() && (onPreDrawListener = this.f2230f) != null) {
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            }
            this.f2229e.clear();
        }
    }

    /* renamed from: a */
    public void mo13567a(View view) {
        synchronized (this.f2226b) {
            this.f2225a.remove(view);
        }
    }

    /* renamed from: a */
    public void mo13568a(View view, int i) {
        synchronized (this.f2226b) {
            this.f2225a.put(view, Integer.valueOf(i));
            m3244b();
        }
    }

    /* renamed from: a */
    public void mo13569a(C1625a aVar) {
        this.f2231g = aVar;
    }
}
