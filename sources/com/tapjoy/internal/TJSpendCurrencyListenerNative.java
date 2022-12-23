package com.tapjoy.internal;

import com.tapjoy.TJSpendCurrencyListener;

public class TJSpendCurrencyListenerNative implements TJSpendCurrencyListener {

    /* renamed from: a */
    private final long f26913a;

    private static native void onSpendCurrencyResponseFailureNative(long j, String str);

    private static native void onSpendCurrencyResponseNative(long j, String str, int i);

    private TJSpendCurrencyListenerNative(long j) {
        if (j != 0) {
            this.f26913a = j;
            return;
        }
        throw new IllegalArgumentException();
    }

    public void onSpendCurrencyResponse(String str, int i) {
        onSpendCurrencyResponseNative(this.f26913a, str, i);
    }

    public void onSpendCurrencyResponseFailure(String str) {
        onSpendCurrencyResponseFailureNative(this.f26913a, str);
    }

    static Object create(long j) {
        return new TJSpendCurrencyListenerNative(j);
    }
}
