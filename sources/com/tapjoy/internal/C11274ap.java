package com.tapjoy.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: com.tapjoy.internal.ap */
public final class C11274ap<E> implements C11276ar<E> {

    /* renamed from: a */
    private final List<E> f26940a;

    public C11274ap(List<E> list) {
        this.f26940a = list;
    }

    public final boolean add(E e) {
        return this.f26940a.add(e);
    }

    public final boolean addAll(Collection<? extends E> collection) {
        return this.f26940a.addAll(collection);
    }

    public final void clear() {
        this.f26940a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f26940a.contains(obj);
    }

    public final boolean containsAll(Collection<?> collection) {
        return this.f26940a.containsAll(collection);
    }

    public final boolean equals(Object obj) {
        return this.f26940a.equals(obj);
    }

    /* renamed from: a */
    public final E mo69631a(int i) {
        return this.f26940a.get(i);
    }

    public final int hashCode() {
        return this.f26940a.hashCode();
    }

    public final boolean isEmpty() {
        return this.f26940a.isEmpty();
    }

    public final Iterator<E> iterator() {
        return this.f26940a.iterator();
    }

    public final boolean remove(Object obj) {
        return this.f26940a.remove(obj);
    }

    public final boolean removeAll(Collection<?> collection) {
        return this.f26940a.removeAll(collection);
    }

    public final boolean retainAll(Collection<?> collection) {
        return this.f26940a.retainAll(collection);
    }

    public final int size() {
        return this.f26940a.size();
    }

    public final Object[] toArray() {
        return this.f26940a.toArray();
    }

    public final <T> T[] toArray(T[] tArr) {
        return this.f26940a.toArray(tArr);
    }

    public final boolean offer(E e) {
        return this.f26940a.add(e);
    }

    public final E remove() {
        E poll = poll();
        if (poll != null) {
            return poll;
        }
        throw new NoSuchElementException();
    }

    public final E poll() {
        if (this.f26940a.isEmpty()) {
            return null;
        }
        return this.f26940a.remove(0);
    }

    public final E element() {
        E peek = peek();
        if (peek != null) {
            return peek;
        }
        throw new NoSuchElementException();
    }

    public final E peek() {
        if (this.f26940a.isEmpty()) {
            return null;
        }
        return this.f26940a.get(0);
    }

    /* renamed from: b */
    public final void mo69632b(int i) {
        C11275aq.m30870a(this.f26940a, i);
    }
}
