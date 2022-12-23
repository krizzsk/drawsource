package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.ironsource.environment.p204e.C6387c;
import com.ironsource.lifecycle.C6405b;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ironsource.lifecycle.d */
public final class C6408d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    static AtomicBoolean f16206a = new AtomicBoolean(false);

    /* renamed from: j */
    private static C6408d f16207j = new C6408d();

    /* renamed from: b */
    int f16208b = 0;

    /* renamed from: c */
    int f16209c = 0;

    /* renamed from: d */
    boolean f16210d = true;

    /* renamed from: e */
    boolean f16211e = true;

    /* renamed from: f */
    int f16212f = C6415e.f16223a;
    /* access modifiers changed from: package-private */

    /* renamed from: g */
    public List<C6407c> f16213g = new CopyOnWriteArrayList();

    /* renamed from: h */
    Runnable f16214h = new Runnable() {
        public final void run() {
            C6408d.m19165a(C6408d.this);
            C6408d.this.m19168c();
        }
    };

    /* renamed from: i */
    private String f16215i = "IronsourceLifecycleManager";

    /* renamed from: k */
    private C6405b.C6406a f16216k = new C6405b.C6406a() {
        /* renamed from: a */
        public final void mo35918a(Activity activity) {
            C6408d dVar = C6408d.this;
            dVar.f16208b++;
            if (dVar.f16208b == 1 && dVar.f16211e) {
                C6387c.f16171a.mo35897c(new Runnable() {
                    public final void run() {
                        for (C6407c a : C6408d.this.f16213g) {
                            a.mo35910a();
                        }
                    }
                });
                dVar.f16211e = false;
                dVar.f16212f = C6415e.f16224b;
            }
        }

        /* renamed from: b */
        public final void mo35919b(Activity activity) {
            C6408d dVar = C6408d.this;
            dVar.f16209c++;
            if (dVar.f16209c != 1) {
                return;
            }
            if (dVar.f16210d) {
                C6387c.f16171a.mo35897c(new Runnable() {
                    public final void run() {
                        Iterator it = C6408d.this.f16213g.iterator();
                        while (it.hasNext()) {
                            it.next();
                        }
                    }
                });
                dVar.f16210d = false;
                dVar.f16212f = C6415e.f16225c;
                return;
            }
            C6387c cVar = C6387c.f16171a;
            C6387c.m19070b(dVar.f16214h);
        }
    };

    /* renamed from: a */
    public static C6408d m19164a() {
        return f16207j;
    }

    /* renamed from: a */
    static /* synthetic */ void m19165a(C6408d dVar) {
        if (dVar.f16209c == 0) {
            dVar.f16210d = true;
            C6387c.f16171a.mo35897c(new Runnable() {
                public final void run() {
                    Iterator it = C6408d.this.f16213g.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
            });
            dVar.f16212f = C6415e.f16226d;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m19168c() {
        if (this.f16208b == 0 && this.f16210d) {
            C6387c.f16171a.mo35897c(new Runnable() {
                public final void run() {
                    for (C6407c b : C6408d.this.f16213g) {
                        b.mo35911b();
                    }
                }
            });
            this.f16211e = true;
            this.f16212f = C6415e.f16227e;
        }
    }

    /* renamed from: a */
    public final void mo35920a(C6407c cVar) {
        if (IronsourceLifecycleProvider.m19155a() && !this.f16213g.contains(cVar)) {
            this.f16213g.add(cVar);
        }
    }

    /* renamed from: b */
    public final boolean mo35921b() {
        return this.f16212f == C6415e.f16227e;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C6405b.m19159b(activity);
        C6405b a = C6405b.m19158a(activity);
        if (a != null) {
            a.f16205a = this.f16216k;
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
        int i = this.f16209c - 1;
        this.f16209c = i;
        if (i == 0) {
            C6387c cVar = C6387c.f16171a;
            C6387c.m19068a(this.f16214h, 700);
        }
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
        this.f16208b--;
        m19168c();
    }
}
