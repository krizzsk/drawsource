package com.tapjoy.internal;

import java.io.InterruptedIOException;

/* renamed from: com.tapjoy.internal.jn */
public class C11659jn {

    /* renamed from: a */
    public static final C11659jn f28103a = new C11659jn() {
        /* renamed from: a */
        public final void mo70295a() {
        }
    };

    /* renamed from: b */
    private boolean f28104b;

    /* renamed from: c */
    private long f28105c;

    /* renamed from: a */
    public void mo70295a() {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("thread interrupted");
        } else if (this.f28104b && this.f28105c - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }
}
