package com.ironsource.mediationsdk.adunit.p209c;

import com.ironsource.mediationsdk.C6604ai;
import com.ironsource.mediationsdk.adunit.p209c.p211b.C6555a;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.mediationsdk.adunit.c.c */
public final class C6557c {

    /* renamed from: a */
    C6555a f16960a;

    /* renamed from: b */
    C6604ai f16961b;

    /* renamed from: c */
    private Timer f16962c;

    public C6557c(C6555a aVar, C6604ai aiVar) {
        this.f16960a = aVar;
        this.f16961b = aiVar;
    }

    /* renamed from: c */
    private void m19894c() {
        Timer timer = this.f16962c;
        if (timer != null) {
            timer.cancel();
            this.f16962c = null;
        }
    }

    /* renamed from: a */
    public final void mo36509a() {
        if (this.f16960a.f16952a != C6555a.C6556a.MANUAL) {
            mo36510a(this.f16960a.f16954c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo36510a(long j) {
        m19894c();
        Timer timer = new Timer();
        this.f16962c = timer;
        timer.schedule(new TimerTask() {
            public final void run() {
                C6557c.this.f16961b.mo36176e();
            }
        }, j);
    }

    /* renamed from: b */
    public final void mo36511b() {
        if (this.f16960a.f16952a != C6555a.C6556a.MANUAL) {
            mo36510a(0);
        }
    }
}
