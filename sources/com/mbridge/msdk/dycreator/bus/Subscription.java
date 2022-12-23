package com.mbridge.msdk.dycreator.bus;

final class Subscription {

    /* renamed from: a */
    final Object f20425a;

    /* renamed from: b */
    final SubscriberMethod f20426b;

    Subscription(Object obj, SubscriberMethod subscriberMethod) {
        this.f20425a = obj;
        this.f20426b = subscriberMethod;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Subscription)) {
            return false;
        }
        Subscription subscription = (Subscription) obj;
        if (this.f20425a != subscription.f20425a || !this.f20426b.equals(subscription.f20426b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f20425a.hashCode() + this.f20426b.f20422d.hashCode();
    }
}
