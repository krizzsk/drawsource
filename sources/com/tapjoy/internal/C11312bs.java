package com.tapjoy.internal;

import java.lang.ref.WeakReference;

/* renamed from: com.tapjoy.internal.bs */
public final class C11312bs<T> {

    /* renamed from: a */
    public WeakReference<T> f27002a;

    /* renamed from: a */
    public final T mo69750a() {
        WeakReference<T> weakReference = this.f27002a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo69751a(T t) {
        this.f27002a = new WeakReference<>(t);
    }
}
