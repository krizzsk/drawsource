package com.ironsource.mediationsdk.p215b;

import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.mediationsdk.b.a */
public abstract class C6613a<T> {

    /* renamed from: a */
    protected T f17151a;

    /* renamed from: b */
    private Timer f17152b;

    /* renamed from: c */
    private long f17153c;

    public C6613a(long j) {
        this.f17153c = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo36625a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo36626a(T t) {
        if (!(this.f17153c <= 0) && t != null) {
            this.f17151a = t;
            mo36627b();
            Timer timer = new Timer();
            this.f17152b = timer;
            timer.schedule(new TimerTask() {
                public final void run() {
                    C6613a.this.mo36625a();
                }
            }, this.f17153c);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo36627b() {
        Timer timer = this.f17152b;
        if (timer != null) {
            timer.cancel();
            this.f17152b = null;
        }
    }

    /* renamed from: c */
    public final void mo36628c() {
        this.f17151a = null;
    }
}
