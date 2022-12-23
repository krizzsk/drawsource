package com.ogury.core.internal;

/* renamed from: com.ogury.core.internal.b */
/* compiled from: OguryEventBusEntry.kt */
public final class C9737b {

    /* renamed from: a */
    private final String f24609a;

    /* renamed from: b */
    private final OguryEventCallback f24610b;

    public C9737b(String str, OguryEventCallback oguryEventCallback) {
        C9717ai.m28145b(str, "event");
        C9717ai.m28145b(oguryEventCallback, "callback");
        this.f24609a = str;
        this.f24610b = oguryEventCallback;
    }

    /* renamed from: a */
    public final String mo64072a() {
        return this.f24609a;
    }

    /* renamed from: b */
    public final OguryEventCallback mo64073b() {
        return this.f24610b;
    }
}
