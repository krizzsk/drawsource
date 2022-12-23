package com.mbridge.msdk.dycreator.bus;

import android.util.Log;

final class BackgroundPoster implements Runnable {

    /* renamed from: a */
    private final PendingPostQueue f20386a = new PendingPostQueue();

    /* renamed from: b */
    private volatile boolean f20387b;

    /* renamed from: c */
    private final EventBus f20388c;

    BackgroundPoster(EventBus eventBus) {
        this.f20388c = eventBus;
    }

    public final void enqueue(Subscription subscription, Object obj) {
        PendingPost a = PendingPost.m23806a(subscription, obj);
        synchronized (this) {
            this.f20386a.mo56871a(a);
            if (!this.f20387b) {
                this.f20387b = true;
                EventBus.f20389a.execute(this);
            }
        }
    }

    public final void run() {
        while (true) {
            try {
                PendingPost a = this.f20386a.mo56870a(1000);
                if (a == null) {
                    synchronized (this) {
                        a = this.f20386a.mo56869a();
                        if (a == null) {
                            this.f20387b = false;
                            this.f20387b = false;
                            return;
                        }
                    }
                }
                this.f20388c.mo56844a(a);
            } catch (InterruptedException e) {
                try {
                    Log.w("Event", Thread.currentThread().getName() + " was interruppted", e);
                    return;
                } finally {
                    this.f20387b = false;
                }
            }
        }
    }
}
