package com.tapjoy.internal;

import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.tapjoy.internal.as */
public final class C11277as<E> extends AbstractSet<E> implements Serializable, Set<E> {

    /* renamed from: a */
    transient WeakHashMap<E, C11277as<E>> f26941a;

    public C11277as() {
        this(new WeakHashMap());
    }

    private C11277as(WeakHashMap<E, C11277as<E>> weakHashMap) {
        this.f26941a = weakHashMap;
    }

    public final boolean add(E e) {
        return this.f26941a.put(e, this) == null;
    }

    public final void clear() {
        this.f26941a.clear();
    }

    public final Object clone() {
        try {
            return (C11277as) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean contains(Object obj) {
        return this.f26941a.containsKey(obj);
    }

    public final boolean isEmpty() {
        return this.f26941a.isEmpty();
    }

    public final Iterator<E> iterator() {
        return this.f26941a.keySet().iterator();
    }

    public final boolean remove(Object obj) {
        return this.f26941a.remove(obj) != null;
    }

    public final int size() {
        return this.f26941a.size();
    }
}
