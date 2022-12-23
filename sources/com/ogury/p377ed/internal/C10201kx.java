package com.ogury.p377ed.internal;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: com.ogury.ed.internal.kx */
public final class C10201kx implements C10270mx, ListIterator {

    /* renamed from: a */
    public static final C10201kx f25545a = new C10201kx();

    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean hasNext() {
        return false;
    }

    public final boolean hasPrevious() {
        return false;
    }

    public final int nextIndex() {
        return 0;
    }

    public final int previousIndex() {
        return -1;
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    private C10201kx() {
    }

    public final /* synthetic */ Object next() {
        return m29768a();
    }

    public final /* synthetic */ Object previous() {
        return m29769b();
    }

    /* renamed from: a */
    private static Void m29768a() {
        throw new NoSuchElementException();
    }

    /* renamed from: b */
    private static Void m29769b() {
        throw new NoSuchElementException();
    }
}
