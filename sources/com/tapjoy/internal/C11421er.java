package com.tapjoy.internal;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.tapjoy.internal.er */
final class C11421er<T> extends AbstractList<T> implements Serializable, RandomAccess {

    /* renamed from: a */
    List<T> f27244a;

    /* renamed from: b */
    private final List<T> f27245b;

    C11421er(List<T> list) {
        this.f27245b = list;
        this.f27244a = list;
    }

    public final T get(int i) {
        return this.f27244a.get(i);
    }

    public final int size() {
        return this.f27244a.size();
    }

    public final T set(int i, T t) {
        if (this.f27244a == this.f27245b) {
            this.f27244a = new ArrayList(this.f27245b);
        }
        return this.f27244a.set(i, t);
    }

    public final void add(int i, T t) {
        if (this.f27244a == this.f27245b) {
            this.f27244a = new ArrayList(this.f27245b);
        }
        this.f27244a.add(i, t);
    }

    public final T remove(int i) {
        if (this.f27244a == this.f27245b) {
            this.f27244a = new ArrayList(this.f27245b);
        }
        return this.f27244a.remove(i);
    }
}
