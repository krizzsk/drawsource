package com.mbridge.msdk.dycreator.bus;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

final class HandlerPoster extends Handler {

    /* renamed from: a */
    private final PendingPostQueue f20409a = new PendingPostQueue();

    /* renamed from: b */
    private final int f20410b;

    /* renamed from: c */
    private final EventBus f20411c;

    /* renamed from: d */
    private boolean f20412d;

    HandlerPoster(EventBus eventBus, Looper looper, int i) {
        super(looper);
        this.f20411c = eventBus;
        this.f20410b = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo56867a(Subscription subscription, Object obj) {
        PendingPost a = PendingPost.m23806a(subscription, obj);
        synchronized (this) {
            this.f20409a.mo56871a(a);
            if (!this.f20412d) {
                this.f20412d = true;
                if (!sendMessage(obtainMessage())) {
                    throw new EventBusException("Could not send handler message");
                }
            }
        }
    }

    public final void handleMessage(Message message) {
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            do {
                PendingPost a = this.f20409a.mo56869a();
                if (a == null) {
                    synchronized (this) {
                        a = this.f20409a.mo56869a();
                        if (a == null) {
                            this.f20412d = false;
                            this.f20412d = false;
                            return;
                        }
                    }
                }
                this.f20411c.mo56844a(a);
            } while (SystemClock.uptimeMillis() - uptimeMillis < ((long) this.f20410b));
            if (sendMessage(obtainMessage())) {
                this.f20412d = true;
                return;
            }
            throw new EventBusException("Could not send handler message");
        } catch (Throwable th) {
            this.f20412d = false;
            throw th;
        }
    }
}
