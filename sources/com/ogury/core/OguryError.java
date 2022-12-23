package com.ogury.core;

import com.ogury.core.internal.C9717ai;

/* compiled from: OguryError.kt */
public final class OguryError extends Exception {
    private final int errorCode;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OguryError(int i, String str) {
        super(str);
        C9717ai.m28145b(str, "message");
        this.errorCode = i;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public OguryError(int i) {
        this(i, "");
    }
}
