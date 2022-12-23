package com.ogury.p377ed.internal;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import okhttp3.HttpUrl;

/* renamed from: com.ogury.ed.internal.la */
public final class C10218la implements C10270mx, Serializable, Set {

    /* renamed from: a */
    public static final C10218la f25581a = new C10218la();
    private static final long serialVersionUID = 3406603774387020532L;

    /* renamed from: a */
    private static boolean m29842a(Void voidR) {
        C10263mq.m29882b(voidR, "element");
        return false;
    }

    public final /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int hashCode() {
        return 0;
    }

    public final boolean isEmpty() {
        return true;
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

    private C10218la() {
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return m29842a((Void) obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    public final boolean containsAll(Collection collection) {
        C10263mq.m29882b(collection, "elements");
        return collection.isEmpty();
    }

    public final Iterator iterator() {
        return C10201kx.f25545a;
    }

    private final Object readResolve() {
        return f25581a;
    }
}
