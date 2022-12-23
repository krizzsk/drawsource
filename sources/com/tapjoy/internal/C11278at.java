package com.tapjoy.internal;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.tapjoy.internal.at */
public final class C11278at<K, V> extends AbstractMap<K, V> {

    /* renamed from: a */
    private final HashMap<K, C11310bq<K, V>> f26942a = new HashMap<>();

    /* renamed from: b */
    private final C11311br<K, V> f26943b = new C11311br<>();

    public final int size() {
        m30875b();
        return this.f26942a.size();
    }

    public final void clear() {
        this.f26942a.clear();
        do {
        } while (this.f26943b.mo69748a() != null);
    }

    public final boolean containsKey(Object obj) {
        m30875b();
        return this.f26942a.containsKey(obj);
    }

    public final boolean containsValue(Object obj) {
        m30875b();
        for (C11310bq<K, V> bqVar : this.f26942a.values()) {
            if (obj.equals(bqVar.get())) {
                return true;
            }
        }
        return false;
    }

    public final V get(Object obj) {
        m30875b();
        return m30874a(this.f26942a.get(obj));
    }

    public final V put(K k, V v) {
        m30875b();
        return m30874a(this.f26942a.put(k, new C11310bq(k, v, this.f26943b)));
    }

    public final V remove(Object obj) {
        m30875b();
        return m30874a(this.f26942a.remove(obj));
    }

    /* renamed from: a */
    private static V m30874a(C11310bq<K, V> bqVar) {
        if (bqVar != null) {
            return bqVar.get();
        }
        return null;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        m30875b();
        throw new UnsupportedOperationException();
    }

    public final Set<K> keySet() {
        m30875b();
        return this.f26942a.keySet();
    }

    public final Collection<V> values() {
        m30875b();
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj) {
        m30875b();
        throw new UnsupportedOperationException();
    }

    public final int hashCode() {
        m30875b();
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        m30875b();
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    private void m30875b() {
        while (true) {
            C11310bq<K, V> a = this.f26943b.mo69748a();
            if (a != null) {
                this.f26942a.remove(a.f27001a);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public static <K, V> C11278at<K, V> m30873a() {
        return new C11278at<>();
    }
}
