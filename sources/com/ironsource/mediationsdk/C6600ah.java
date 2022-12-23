package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.utils.C6736c;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.mediationsdk.ah */
public final class C6600ah {

    /* renamed from: a */
    C6604ai f17105a;

    /* renamed from: b */
    private C6736c f17106b;

    /* renamed from: c */
    private Timer f17107c = null;

    public C6600ah(C6736c cVar, C6604ai aiVar) {
        this.f17106b = cVar;
        this.f17105a = aiVar;
    }

    /* renamed from: e */
    private void m20078e() {
        Timer timer = this.f17107c;
        if (timer != null) {
            timer.cancel();
            this.f17107c = null;
        }
    }

    /* renamed from: a */
    public final synchronized void mo36605a() {
        if (this.f17106b.f17581n) {
            m20078e();
            Timer timer = new Timer();
            this.f17107c = timer;
            timer.schedule(new TimerTask() {
                public final void run() {
                    C6600ah.this.f17105a.mo36176e();
                }
            }, this.f17106b.f17579l);
        }
    }

    /* renamed from: b */
    public final synchronized void mo36606b() {
        if (!this.f17106b.f17581n) {
            m20078e();
            Timer timer = new Timer();
            this.f17107c = timer;
            timer.schedule(new TimerTask() {
                public final void run() {
                    C6600ah.this.f17105a.mo36176e();
                }
            }, this.f17106b.f17579l);
        }
    }

    /* renamed from: c */
    public final void mo36607c() {
        synchronized (this) {
            m20078e();
        }
        this.f17105a.mo36176e();
    }

    /* renamed from: d */
    public final synchronized void mo36608d() {
        m20078e();
        Timer timer = new Timer();
        this.f17107c = timer;
        timer.schedule(new TimerTask() {
            public final void run() {
                C6600ah.this.f17105a.mo36176e();
            }
        }, this.f17106b.f17578k);
    }
}
