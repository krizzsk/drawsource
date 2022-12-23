package com.ogury.p377ed.internal;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import okhttp3.HttpUrl;

/* renamed from: com.ogury.ed.internal.ky */
public final class C10202ky implements C10270mx, Serializable, List, RandomAccess {

    /* renamed from: a */
    public static final C10202ky f25546a = new C10202ky();
    private static final long serialVersionUID = -7390468764508069838L;

    /* renamed from: a */
    private static boolean m29771a(Void voidR) {
        C10263mq.m29882b(voidR, "element");
        return false;
    }

    /* renamed from: b */
    private static int m29772b(Void voidR) {
        C10263mq.m29882b(voidR, "element");
        return -1;
    }

    /* renamed from: c */
    private static int m29773c(Void voidR) {
        C10263mq.m29882b(voidR, "element");
        return -1;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int hashCode() {
        return 1;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return 0;
    }

    public final Object[] toArray() {
        return C10258ml.m29871a(this);
    }

    public final <T> T[] toArray(T[] tArr) {
        return C10258ml.m29872a(this, tArr);
    }

    public final String toString() {
        return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }

    private C10202ky() {
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return m29771a((Void) obj);
    }

    public final /* synthetic */ Object get(int i) {
        return m29770a(i);
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        return m29772b((Void) obj);
    }

    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        return m29773c((Void) obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    public final boolean containsAll(Collection collection) {
        C10263mq.m29882b(collection, "elements");
        return collection.isEmpty();
    }

    /* renamed from: a */
    private static Void m29770a(int i) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i + '.');
    }

    public final Iterator iterator() {
        return C10201kx.f25545a;
    }

    public final ListIterator listIterator() {
        return C10201kx.f25545a;
    }

    public final ListIterator listIterator(int i) {
        if (i == 0) {
            return C10201kx.f25545a;
        }
        throw new IndexOutOfBoundsException("Index: ".concat(String.valueOf(i)));
    }

    public final List subList(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2);
    }

    private final Object readResolve() {
        return f25546a;
    }
}
