package com.ogury.p377ed.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.ogury.ed.internal.mg */
final class C10251mg<T> implements C10270mx, Iterator<T> {

    /* renamed from: a */
    private int f25585a;

    /* renamed from: b */
    private final T[] f25586b;

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C10251mg(T[] tArr) {
        C10263mq.m29882b(tArr, "array");
        this.f25586b = tArr;
    }

    public final boolean hasNext() {
        return this.f25585a < this.f25586b.length;
    }

    public final T next() {
        try {
            T[] tArr = this.f25586b;
            int i = this.f25585a;
            this.f25585a = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f25585a--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
