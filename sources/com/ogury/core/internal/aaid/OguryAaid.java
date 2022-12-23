package com.ogury.core.internal.aaid;

import com.ogury.core.internal.C9717ai;

/* compiled from: OguryAaid.kt */
public final class OguryAaid {

    /* renamed from: id */
    private final String f24587id;
    private final boolean isAdTrackingEnabled;
    private final boolean isFake;

    public OguryAaid(String str, boolean z, boolean z2) {
        C9717ai.m28145b(str, "id");
        this.f24587id = str;
        this.isAdTrackingEnabled = z;
        this.isFake = z2;
    }

    public final String getId() {
        return this.f24587id;
    }

    public final boolean isAdTrackingEnabled() {
        return this.isAdTrackingEnabled;
    }

    public final boolean isFake() {
        return this.isFake;
    }
}
