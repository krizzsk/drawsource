package com.apm.insight.p024j;

import android.os.Handler;

/* renamed from: com.apm.insight.j.a */
public abstract class C1261a implements Runnable {

    /* renamed from: a */
    private Handler f1213a;

    /* renamed from: b */
    private final long f1214b;

    /* renamed from: c */
    private final long f1215c;

    C1261a(Handler handler, long j, long j2) {
        this.f1213a = handler;
        this.f1214b = j;
        this.f1215c = j2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12535a() {
        if (mo12537b() > 0) {
            this.f1213a.postDelayed(this, mo12537b());
        } else {
            this.f1213a.post(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo12536a(long j) {
        if (j > 0) {
            this.f1213a.postDelayed(this, j);
        } else {
            this.f1213a.post(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public long mo12537b() {
        return this.f1214b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public long mo12538c() {
        return this.f1215c;
    }
}
