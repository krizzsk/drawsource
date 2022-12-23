package com.ogury.p377ed.internal;

import com.tapjoy.TJAdUnitConstants;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.ogury.ed.internal.kf */
final class C10183kf<T> implements C10270mx, Collection<T> {

    /* renamed from: a */
    private final T[] f25543a;

    /* renamed from: b */
    private final boolean f25544b = false;

    public final boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final <T> T[] toArray(T[] tArr) {
        return C10258ml.m29872a(this, tArr);
    }

    public C10183kf(T[] tArr) {
        C10263mq.m29882b(tArr, TJAdUnitConstants.String.USAGE_TRACKER_VALUES);
        this.f25543a = tArr;
    }

    public final int size() {
        return m29745a();
    }

    /* renamed from: a */
    private int m29745a() {
        return this.f25543a.length;
    }

    public final boolean isEmpty() {
        return this.f25543a.length == 0;
    }

    public final boolean contains(Object obj) {
        return C10184kg.m29748a(this.f25543a, obj);
    }

    public final boolean containsAll(Collection<? extends Object> collection) {
        C10263mq.m29882b(collection, "elements");
        Iterable<Object> iterable = collection;
        if (((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object contains : iterable) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final Iterator<T> iterator() {
        return C10252mh.m29861a(this.f25543a);
    }

    public final Object[] toArray() {
        return C10190km.m29754a(this.f25543a, this.f25544b);
    }
}
