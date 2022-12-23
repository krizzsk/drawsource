package com.smaato.sdk.core.util.memory;

import com.smaato.sdk.core.p381di.DiConstructor;
import com.smaato.sdk.core.p381di.DiRegistry;

public final class DiLeakProtection {
    private DiLeakProtection() {
    }

    public static DiRegistry createRegistry() {
        return DiRegistry.m30601of($$Lambda$DiLeakProtection$dW0cp5KKZWPCCP6C5wusami0gL8.INSTANCE);
    }

    static /* synthetic */ LeakProtection lambda$createRegistry$0(DiConstructor diConstructor) {
        return new LeakProtectionImpl();
    }
}
