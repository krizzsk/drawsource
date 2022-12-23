package com.tapjoy.internal;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.tapjoy.internal.bq */
public final class C11310bq<N, T> extends WeakReference<T> {

    /* renamed from: a */
    public final N f27001a;

    public C11310bq(N n, T t, ReferenceQueue<? super T> referenceQueue) {
        super(t, referenceQueue);
        this.f27001a = n;
    }
}
