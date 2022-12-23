package com.tapjoy.internal;

import java.util.AbstractQueue;
import java.util.Iterator;

/* renamed from: com.tapjoy.internal.an */
public abstract class C11271an<E> extends AbstractQueue<E> implements C11276ar<E> {
    public Iterator<E> iterator() {
        return new Iterator<E>() {

            /* renamed from: b */
            private int f26934b = 0;

            public final boolean hasNext() {
                return this.f26934b < C11271an.this.size();
            }

            public final E next() {
                C11271an anVar = C11271an.this;
                int i = this.f26934b;
                this.f26934b = i + 1;
                return anVar.mo69631a(i);
            }

            public final void remove() {
                if (this.f26934b == 1) {
                    C11271an.this.mo69632b(1);
                    this.f26934b = 0;
                    return;
                }
                throw new UnsupportedOperationException("For the first element only");
            }
        };
    }
}
