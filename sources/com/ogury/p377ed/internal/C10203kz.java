package com.ogury.p377ed.internal;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ogury.ed.internal.kz */
final class C10203kz implements C10270mx, Serializable, Map {

    /* renamed from: a */
    public static final C10203kz f25547a = new C10203kz();
    private static final long serialVersionUID = 8246714829545688274L;

    /* renamed from: a */
    private static boolean m29775a(Void voidR) {
        C10263mq.m29882b(voidR, "value");
        return false;
    }

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

    private C10203kz() {
    }

    public final boolean containsValue(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return m29775a((Void) obj);
    }

    public final Set<Map.Entry> entrySet() {
        return m29774a();
    }

    public final Set<Object> keySet() {
        return m29776b();
    }

    public final Collection values() {
        return m29777c();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    /* renamed from: a */
    private static Set<Map.Entry> m29774a() {
        return C10218la.f25581a;
    }

    /* renamed from: b */
    private static Set<Object> m29776b() {
        return C10218la.f25581a;
    }

    /* renamed from: c */
    private static Collection m29777c() {
        return C10202ky.f25546a;
    }

    private final Object readResolve() {
        return f25547a;
    }
}
