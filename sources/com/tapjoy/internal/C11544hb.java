package com.tapjoy.internal;

import android.app.Activity;
import android.opengl.GLSurfaceView;

/* renamed from: com.tapjoy.internal.hb */
public final class C11544hb {

    /* renamed from: a */
    public static final C11279au f27700a = new C11279au() {
        /* renamed from: a */
        public final boolean mo69681a(Runnable runnable) {
            GLSurfaceView gLSurfaceView = (GLSurfaceView) C11544hb.f27702c.mo69750a();
            if (gLSurfaceView == null) {
                return false;
            }
            gLSurfaceView.queueEvent(runnable);
            return true;
        }
    };

    /* renamed from: b */
    private static Activity f27701b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C11312bs<GLSurfaceView> f27702c = new C11312bs<>();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final C11312bs<Thread> f27703d = new C11312bs<>();

    private C11544hb() {
    }

    /* renamed from: a */
    static void m31600a(GLSurfaceView gLSurfaceView) {
        Object[] objArr = new Object[1];
        f27702c.mo69751a(gLSurfaceView);
        gLSurfaceView.queueEvent(new Runnable() {
            public final void run() {
                Class<C11544hb> cls = C11544hb.class;
                Object[] objArr = new Object[1];
                C11544hb.f27703d.mo69751a(Thread.currentThread());
            }
        });
    }

    /* renamed from: a */
    public static Activity m31599a() {
        Activity activity = f27701b;
        return activity == null ? C11285b.m30879a() : activity;
    }

    /* renamed from: b */
    public static Thread m31601b() {
        return f27703d.mo69750a();
    }
}
