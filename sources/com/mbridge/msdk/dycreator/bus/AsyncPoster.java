package com.mbridge.msdk.dycreator.bus;

class AsyncPoster implements Runnable {

    /* renamed from: a */
    private final PendingPostQueue f20384a = new PendingPostQueue();

    /* renamed from: b */
    private final EventBus f20385b;

    AsyncPoster(EventBus eventBus) {
        this.f20385b = eventBus;
    }

    public void enqueue(Subscription subscription, Object obj) {
        this.f20384a.mo56871a(PendingPost.m23806a(subscription, obj));
        EventBus.f20389a.execute(this);
    }

    public void run() {
        PendingPost a = this.f20384a.mo56869a();
        if (a != null) {
            this.f20385b.mo56844a(a);
            return;
        }
        throw new IllegalStateException("No pending post available");
    }
}
