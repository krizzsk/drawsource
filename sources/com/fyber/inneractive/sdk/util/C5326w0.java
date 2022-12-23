package com.fyber.inneractive.sdk.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/* renamed from: com.fyber.inneractive.sdk.util.w0 */
public class C5326w0 {

    /* renamed from: a */
    public final TimeUnit f14061a;

    /* renamed from: b */
    public final long f14062b;

    /* renamed from: c */
    public Handler f14063c;

    /* renamed from: d */
    public boolean f14064d = false;

    /* renamed from: e */
    public C5328b f14065e;

    /* renamed from: f */
    public long f14066f = 0;

    /* renamed from: com.fyber.inneractive.sdk.util.w0$a */
    public static class C5327a extends Handler {

        /* renamed from: a */
        public final WeakReference<C5326w0> f14067a;

        public C5327a(C5326w0 w0Var) {
            super(Looper.getMainLooper());
            this.f14067a = new WeakReference<>(w0Var);
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            C5326w0 w0Var = (C5326w0) this.f14067a.get();
            if (w0Var != null && message.what == 1932593528 && !w0Var.f14064d) {
                w0Var.mo26409a(message.getWhen());
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.util.w0$b */
    public interface C5328b {
        /* renamed from: a */
        void mo24200a(C5326w0 w0Var);
    }

    public C5326w0(TimeUnit timeUnit, long j) {
        this.f14062b = j;
        this.f14061a = timeUnit;
        IAlog.m16446a("Visible time counter init - time %d", Long.valueOf(j));
    }

    /* renamed from: a */
    public void mo26408a() {
        this.f14064d = true;
        Handler handler = this.f14063c;
        if (handler != null) {
            handler.removeMessages(1932593528);
        }
    }

    /* renamed from: b */
    public void mo26410b() {
        this.f14064d = false;
        mo26409a(SystemClock.uptimeMillis());
    }

    /* renamed from: c */
    public void mo26411c() {
        C5327a aVar = new C5327a(this);
        this.f14063c = aVar;
        this.f14064d = false;
        aVar.sendEmptyMessage(1932593528);
    }

    /* renamed from: a */
    public final void mo26409a(long j) {
        long uptimeMillis = this.f14066f + (SystemClock.uptimeMillis() - j) + 50;
        this.f14066f = uptimeMillis;
        if (this.f14065e == null || uptimeMillis <= this.f14061a.toMillis(this.f14062b)) {
            Handler handler = this.f14063c;
            if (handler != null && this.f14065e != null) {
                handler.removeMessages(1932593528);
                this.f14063c.sendEmptyMessageDelayed(1932593528, 50);
                return;
            }
            return;
        }
        this.f14065e.mo24200a(this);
    }

    public C5326w0(TimeUnit timeUnit, long j, long j2) {
        this.f14062b = j;
        this.f14061a = timeUnit;
        this.f14066f = j2;
        IAlog.m16446a("Visible time counter init - time %d", Long.valueOf(j));
    }
}
