package com.tapjoy.internal;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.tapjoy.internal.hk */
public class C11560hk implements C11540gy {

    /* renamed from: a */
    private static final C11560hk f27762a = new C11560hk() {
        /* renamed from: a */
        public final void mo69155a(String str) {
        }

        /* renamed from: a */
        public final void mo69156a(String str, C11537gv gvVar) {
        }

        /* renamed from: a */
        public final void mo69157a(String str, String str2, C11537gv gvVar) {
        }

        /* renamed from: b */
        public final void mo69158b(String str) {
        }

        /* renamed from: c */
        public final void mo69159c(String str) {
        }

        /* renamed from: d */
        public final void mo69160d(String str) {
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C11540gy f27763b;

    /* renamed from: c */
    private final C11279au f27764c;

    /* synthetic */ C11560hk(byte b) {
        this();
    }

    /* renamed from: a */
    public static C11560hk m31676a(C11540gy gyVar) {
        if (gyVar != null) {
            return new C11560hk(gyVar);
        }
        return f27762a;
    }

    private C11560hk() {
        this.f27763b = null;
        this.f27764c = null;
    }

    private C11560hk(C11540gy gyVar) {
        Handler handler;
        this.f27763b = gyVar;
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            C11533gr.m31570a(myLooper);
            handler = myLooper == Looper.getMainLooper() ? C11683t.m32049a() : new Handler(myLooper);
        } else {
            handler = null;
        }
        if (handler != null) {
            this.f27764c = C11683t.m32050a(handler);
            Object[] objArr = new Object[1];
            handler.getLooper();
        } else if (Thread.currentThread() == C11544hb.m31601b()) {
            this.f27764c = C11544hb.f27700a;
        } else {
            this.f27764c = C11683t.m32050a(C11683t.m32049a());
        }
    }

    /* renamed from: a */
    public void mo69155a(final String str) {
        this.f27764c.mo69681a(new Runnable() {
            public final void run() {
                C11560hk.this.f27763b.mo69155a(str);
            }
        });
    }

    /* renamed from: b */
    public void mo69158b(final String str) {
        this.f27764c.mo69681a(new Runnable() {
            public final void run() {
                C11560hk.this.f27763b.mo69158b(str);
            }
        });
    }

    /* renamed from: c */
    public void mo69159c(final String str) {
        this.f27764c.mo69681a(new Runnable() {
            public final void run() {
                C11560hk.this.f27763b.mo69159c(str);
            }
        });
    }

    /* renamed from: d */
    public void mo69160d(final String str) {
        this.f27764c.mo69681a(new Runnable() {
            public final void run() {
                C11560hk.this.f27763b.mo69160d(str);
            }
        });
    }

    /* renamed from: a */
    public void mo69156a(final String str, final C11537gv gvVar) {
        this.f27764c.mo69681a(new Runnable() {
            public final void run() {
                C11560hk.this.f27763b.mo69156a(str, gvVar);
            }
        });
    }

    /* renamed from: a */
    public void mo69157a(final String str, final String str2, final C11537gv gvVar) {
        this.f27764c.mo69681a(new Runnable() {
            public final void run() {
                C11560hk.this.f27763b.mo69157a(str, str2, gvVar);
            }
        });
    }
}
