package com.ogury.core.internal.network;

/* compiled from: OguryNetworkException.kt */
public final class OguryNetworkException extends Exception {

    /* renamed from: a */
    private final int f24685a;

    public OguryNetworkException(int i) {
        super("Received " + i + " from the server");
        this.f24685a = i;
    }

    public final int getResponseCode() {
        return this.f24685a;
    }
}
