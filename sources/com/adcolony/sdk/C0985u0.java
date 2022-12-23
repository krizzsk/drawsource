package com.adcolony.sdk;

import android.content.Context;
import com.adcolony.sdk.C0826e0;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.adcolony.sdk.u0 */
class C0985u0 {

    /* renamed from: a */
    private final ScheduledExecutorService f829a = Executors.newSingleThreadScheduledExecutor();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ScheduledFuture<?> f830b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public ScheduledFuture<?> f831c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C0969t0 f832d;

    /* renamed from: com.adcolony.sdk.u0$a */
    class C0986a implements Runnable {
        C0986a() {
        }

        public void run() {
            ScheduledFuture unused = C0985u0.this.f830b = null;
            C0985u0.this.m1086e();
        }
    }

    /* renamed from: com.adcolony.sdk.u0$b */
    class C0987b implements Runnable {
        C0987b() {
        }

        public void run() {
            if (C0985u0.this.f832d.mo11121g()) {
                C0723a.m193b().mo10909r().mo10855i();
                ScheduledFuture unused = C0985u0.this.f831c = null;
            }
        }
    }

    C0985u0(C0969t0 t0Var) {
        this.f832d = t0Var;
    }

    /* renamed from: d */
    private void m1085d() {
        if (this.f830b == null) {
            try {
                this.f830b = this.f829a.schedule(new C0986a(), this.f832d.mo11107a(), TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                new C0826e0.C0827a().mo10746a("RejectedExecutionException when scheduling session stop ").mo10746a(e.toString()).mo10747a(C0826e0.f462i);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m1086e() {
        new C0826e0.C0827a().mo10746a("AdColony session ending, releasing Context.").mo10747a(C0826e0.f457d);
        C0723a.m193b().mo10890c(true);
        C0723a.m188a((Context) null);
        this.f832d.mo11118f(true);
        this.f832d.mo11120g(true);
        this.f832d.mo11122j();
        if (C0723a.m193b().mo10909r().mo10853f()) {
            ScheduledFuture<?> scheduledFuture = this.f831c;
            if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
                this.f831c.cancel(false);
            }
            try {
                this.f831c = this.f829a.schedule(new C0987b(), 10, TimeUnit.SECONDS);
            } catch (RejectedExecutionException e) {
                new C0826e0.C0827a().mo10746a("RejectedExecutionException when scheduling message pumping stop ").mo10746a(e.toString()).mo10747a(C0826e0.f462i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo11141c() {
        m1081a();
    }

    /* renamed from: a */
    private void m1081a() {
        ScheduledFuture<?> scheduledFuture = this.f830b;
        if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
            this.f830b.cancel(false);
            this.f830b = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo11140b() {
        m1085d();
    }
}
