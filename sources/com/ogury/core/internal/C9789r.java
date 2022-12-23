package com.ogury.core.internal;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ogury.core.internal.r */
/* compiled from: Maps.kt */
final class C9789r implements C9721am, Serializable, Map {

    /* renamed from: a */
    public static final C9789r f24693a = new C9789r();

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean containsKey(Object obj) {
        return false;
    }

    public final /* bridge */ Object get(Object obj) {
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    public final boolean isEmpty() {
        return true;
    }

    public final /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return 0;
    }

    public final String toString() {
        return JsonUtils.EMPTY_JSON;
    }

    private C9789r() {
    }

    public final boolean containsValue(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        C9717ai.m28145b((Void) obj, "value");
        return false;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    public final /* bridge */ Set<Map.Entry> entrySet() {
        return C9790s.f24694a;
    }

    public final /* bridge */ Set<Object> keySet() {
        return C9790s.f24694a;
    }

    public final /* bridge */ Collection values() {
        return C9788q.f24692a;
    }
}
