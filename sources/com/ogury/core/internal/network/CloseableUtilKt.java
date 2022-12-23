package com.ogury.core.internal.network;

import com.ogury.core.internal.C9717ai;
import java.io.Closeable;

/* compiled from: CloseableUtil.kt */
public final class CloseableUtilKt {
    public static final void closeSafely(Closeable closeable) {
        C9717ai.m28145b(closeable, "$this$closeSafely");
        try {
            closeable.close();
        } catch (Throwable unused) {
        }
    }
}
