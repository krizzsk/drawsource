package com.ogury.core.internal;

import java.util.Iterator;

/* renamed from: com.ogury.core.internal.t */
/* compiled from: Iterators.kt */
public abstract class C9791t implements C9721am, Iterator<Integer> {
    /* renamed from: a */
    public abstract int mo64070a();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object next() {
        return Integer.valueOf(mo64070a());
    }
}
