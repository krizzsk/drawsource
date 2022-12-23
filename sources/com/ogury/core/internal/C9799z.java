package com.ogury.core.internal;

/* renamed from: com.ogury.core.internal.z */
/* compiled from: JDK7PlatformImplementations.kt */
public class C9799z extends C9796x {
    /* renamed from: a */
    public final void mo64214a(Throwable th, Throwable th2) {
        C9717ai.m28145b(th, "cause");
        C9717ai.m28145b(th2, "exception");
        th.addSuppressed(th2);
    }
}
