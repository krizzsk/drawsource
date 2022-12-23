package com.ironsource.mediationsdk;

import com.ironsource.lifecycle.C6416f;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ironsource.mediationsdk.B */
public final class C6421B {

    /* renamed from: a */
    C6619c f16254a;

    /* renamed from: b */
    private Runnable f16255b;

    /* renamed from: c */
    private int f16256c = 0;

    /* renamed from: d */
    private C6416f f16257d;

    public C6421B(int i, C6619c cVar) {
        this.f16254a = cVar;
        this.f16256c = i;
        this.f16255b = new Runnable() {
            public final void run() {
                IronLog.INTERNAL.verbose("loaded ads are expired");
                if (C6421B.this.f16254a != null) {
                    C6421B.this.f16254a.mo36174c_();
                }
            }
        };
    }

    /* renamed from: b */
    private boolean m19196b() {
        return this.f16256c > 0;
    }

    /* renamed from: a */
    public final void mo35977a() {
        if (m19196b() && this.f16257d != null) {
            IronLog.INTERNAL.verbose("canceling expiration timer");
            this.f16257d.mo35934c();
            this.f16257d = null;
        }
    }

    /* renamed from: a */
    public final void mo35978a(long j) {
        if (m19196b()) {
            long millis = TimeUnit.MINUTES.toMillis((long) this.f16256c) - Math.max(j, 0);
            if (millis > 0) {
                mo35977a();
                this.f16257d = new C6416f(millis, this.f16255b, true);
                Calendar instance = Calendar.getInstance();
                instance.add(14, (int) millis);
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("loaded ads will expire on: " + instance.getTime() + " in " + String.format("%.2f", new Object[]{Double.valueOf((((double) millis) / 1000.0d) / 60.0d)}) + " minutes");
                return;
            }
            IronLog.INTERNAL.verbose("no delay - onAdExpired called");
            this.f16254a.mo36174c_();
        }
    }
}
