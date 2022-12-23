package com.tapjoy.internal;

import com.tapjoy.TJSetUserIDListener;

public class TJSetUserIDListenerNative implements TJSetUserIDListener {

    /* renamed from: a */
    private final long f26912a;

    private static native void onSetUserIDFailureNative(long j, String str);

    private static native void onSetUserIDSuccessNative(long j);

    private TJSetUserIDListenerNative(long j) {
        if (j != 0) {
            this.f26912a = j;
            return;
        }
        throw new IllegalArgumentException();
    }

    public void onSetUserIDSuccess() {
        onSetUserIDSuccessNative(this.f26912a);
    }

    public void onSetUserIDFailure(String str) {
        onSetUserIDFailureNative(this.f26912a, str);
    }

    static Object create(long j) {
        return new TJSetUserIDListenerNative(j);
    }
}
