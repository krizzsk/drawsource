package com.fyber.inneractive.sdk.protobuf;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.protobuf.c0 */
public class C5068c0 extends C5073d0 {

    /* renamed from: com.fyber.inneractive.sdk.protobuf.c0$a */
    public static class C5069a<K> implements Map.Entry<K, Object> {

        /* renamed from: a */
        public Map.Entry<K, C5068c0> f13528a;

        public C5069a(Map.Entry<K, C5068c0> entry) {
            this.f13528a = entry;
        }

        public K getKey() {
            return this.f13528a.getKey();
        }

        public Object getValue() {
            C5068c0 value = this.f13528a.getValue();
            if (value == null) {
                return null;
            }
            return value.mo25793a((C5149q0) null);
        }

        public Object setValue(Object obj) {
            if (obj instanceof C5149q0) {
                C5068c0 value = this.f13528a.getValue();
                C5149q0 q0Var = value.f13535a;
                value.f13536b = null;
                value.f13535a = (C5149q0) obj;
                return q0Var;
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.c0$b */
    public static class C5070b<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: a */
        public Iterator<Map.Entry<K, Object>> f13529a;

        public C5070b(Iterator<Map.Entry<K, Object>> it) {
            this.f13529a = it;
        }

        public boolean hasNext() {
            return this.f13529a.hasNext();
        }

        public Object next() {
            Map.Entry next = this.f13529a.next();
            return next.getValue() instanceof C5068c0 ? new C5069a(next) : next;
        }

        public void remove() {
            this.f13529a.remove();
        }
    }

    public boolean equals(Object obj) {
        return mo25793a((C5149q0) null).equals(obj);
    }

    public int hashCode() {
        return mo25793a((C5149q0) null).hashCode();
    }

    public String toString() {
        return mo25793a((C5149q0) null).toString();
    }
}
