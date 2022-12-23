package com.ironsource.lifecycle;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.lifecycle.f */
public final class C6416f implements C6407c {

    /* renamed from: a */
    Runnable f16229a;

    /* renamed from: b */
    private String f16230b = "INTERNAL";

    /* renamed from: c */
    private Timer f16231c;

    /* renamed from: d */
    private boolean f16232d;

    /* renamed from: e */
    private Long f16233e;

    /* renamed from: f */
    private long f16234f;

    public C6416f(long j, Runnable runnable, boolean z) {
        this.f16234f = j;
        this.f16229a = runnable;
        this.f16232d = false;
        this.f16233e = null;
        if (0 == 0) {
            this.f16232d = true;
            C6408d.m19164a().mo35920a((C6407c) this);
            this.f16233e = Long.valueOf(System.currentTimeMillis() + this.f16234f);
            if (!C6408d.m19164a().mo35921b()) {
                m19173d();
            }
        }
    }

    /* renamed from: d */
    private void m19173d() {
        if (this.f16231c == null) {
            Timer timer = new Timer();
            this.f16231c = timer;
            timer.schedule(new TimerTask() {
                public final void run() {
                    C6416f.this.f16229a.run();
                }
            }, this.f16234f);
            Calendar.getInstance().setTimeInMillis(this.f16233e.longValue());
        }
    }

    /* renamed from: e */
    private void m19174e() {
        Timer timer = this.f16231c;
        if (timer != null) {
            timer.cancel();
            this.f16231c = null;
        }
    }

    /* renamed from: a */
    public final void mo35910a() {
        Long l;
        if (this.f16231c == null && (l = this.f16233e) != null) {
            long longValue = l.longValue() - System.currentTimeMillis();
            this.f16234f = longValue;
            if (longValue <= 0) {
                mo35934c();
                this.f16229a.run();
                return;
            }
            m19173d();
        }
    }

    /* renamed from: b */
    public final void mo35911b() {
        if (this.f16231c != null) {
            m19174e();
        }
    }

    /* renamed from: c */
    public final void mo35934c() {
        m19174e();
        this.f16232d = false;
        this.f16233e = null;
        C6408d a = C6408d.m19164a();
        if (a.f16213g.contains(this)) {
            a.f16213g.remove(this);
        }
    }
}
