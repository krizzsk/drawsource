package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C5181u;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.fyber.inneractive.sdk.protobuf.i1 */
public class C5106i1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: g */
    public static final /* synthetic */ int f13577g = 0;

    /* renamed from: a */
    public final int f13578a;

    /* renamed from: b */
    public List<C5106i1<K, V>.c> f13579b;

    /* renamed from: c */
    public Map<K, V> f13580c;

    /* renamed from: d */
    public boolean f13581d;

    /* renamed from: e */
    public volatile C5106i1<K, V>.e f13582e;

    /* renamed from: f */
    public Map<K, V> f13583f;

    /* renamed from: com.fyber.inneractive.sdk.protobuf.i1$a */
    public class C5107a extends C5106i1<FieldDescriptorType, Object> {
        public C5107a(int i) {
            super(i, (C5107a) null);
        }

        /* renamed from: d */
        public void mo25941d() {
            if (!this.f13581d) {
                for (int i = 0; i < this.f13579b.size(); i++) {
                    Map.Entry a = mo25934a(i);
                    if (((C5181u.C5182a) a.getKey()).mo25741b()) {
                        a.setValue(Collections.unmodifiableList((List) a.getValue()));
                    }
                }
                for (Map.Entry entry : mo25936b()) {
                    if (((C5181u.C5182a) entry.getKey()).mo25741b()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            C5106i1.super.mo25941d();
        }

        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return put((Comparable) obj, obj2);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.i1$b */
    public static class C5108b {

        /* renamed from: a */
        public static final Iterator<Object> f13584a = new C5109a();

        /* renamed from: b */
        public static final Iterable<Object> f13585b = new C5110b();

        /* renamed from: com.fyber.inneractive.sdk.protobuf.i1$b$a */
        public class C5109a implements Iterator<Object> {
            public boolean hasNext() {
                return false;
            }

            public Object next() {
                throw new NoSuchElementException();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* renamed from: com.fyber.inneractive.sdk.protobuf.i1$b$b */
        public class C5110b implements Iterable<Object> {
            public Iterator<Object> iterator() {
                return C5108b.f13584a;
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.i1$c */
    public class C5111c implements Map.Entry<K, V>, Comparable<C5106i1<K, V>.c> {

        /* renamed from: a */
        public final K f13586a;

        /* renamed from: b */
        public V f13587b;

        public C5111c(K k, V v) {
            this.f13586a = k;
            this.f13587b = v;
        }

        public int compareTo(Object obj) {
            return this.f13586a.compareTo(((C5111c) obj).f13586a);
        }

        public boolean equals(Object obj) {
            boolean z;
            boolean z2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k = this.f13586a;
            Object key = entry.getKey();
            if (k == null) {
                z = key == null;
            } else {
                z = k.equals(key);
            }
            if (z) {
                V v = this.f13587b;
                Object value = entry.getValue();
                if (v == null) {
                    z2 = value == null;
                } else {
                    z2 = v.equals(value);
                }
                if (z2) {
                    return true;
                }
            }
            return false;
        }

        public Object getKey() {
            return this.f13586a;
        }

        public V getValue() {
            return this.f13587b;
        }

        public int hashCode() {
            K k = this.f13586a;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f13587b;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            C5106i1 i1Var = C5106i1.this;
            int i = C5106i1.f13577g;
            i1Var.mo25935a();
            V v2 = this.f13587b;
            this.f13587b = v;
            return v2;
        }

        public String toString() {
            return this.f13586a + "=" + this.f13587b;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.i1$d */
    public class C5112d implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a */
        public int f13589a = -1;

        /* renamed from: b */
        public boolean f13590b;

        /* renamed from: c */
        public Iterator<Map.Entry<K, V>> f13591c;

        public C5112d() {
        }

        /* renamed from: b */
        public final Iterator<Map.Entry<K, V>> mo25960b() {
            if (this.f13591c == null) {
                this.f13591c = C5106i1.this.f13580c.entrySet().iterator();
            }
            return this.f13591c;
        }

        public boolean hasNext() {
            if (this.f13589a + 1 < C5106i1.this.f13579b.size()) {
                return true;
            }
            if (C5106i1.this.f13580c.isEmpty() || !mo25960b().hasNext()) {
                return false;
            }
            return true;
        }

        public Object next() {
            this.f13590b = true;
            int i = this.f13589a + 1;
            this.f13589a = i;
            if (i < C5106i1.this.f13579b.size()) {
                return C5106i1.this.f13579b.get(this.f13589a);
            }
            return (Map.Entry) mo25960b().next();
        }

        public void remove() {
            if (this.f13590b) {
                this.f13590b = false;
                C5106i1 i1Var = C5106i1.this;
                int i = C5106i1.f13577g;
                i1Var.mo25935a();
                if (this.f13589a < C5106i1.this.f13579b.size()) {
                    C5106i1 i1Var2 = C5106i1.this;
                    int i2 = this.f13589a;
                    this.f13589a = i2 - 1;
                    i1Var2.mo25937c(i2);
                    return;
                }
                mo25960b().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.i1$e */
    public class C5113e extends AbstractSet<Map.Entry<K, V>> {
        public C5113e() {
        }

        public boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            C5106i1.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public void clear() {
            C5106i1.this.clear();
        }

        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C5106i1.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C5112d();
        }

        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            C5106i1.this.remove(entry.getKey());
            return true;
        }

        public int size() {
            return C5106i1.this.size();
        }
    }

    public /* synthetic */ C5106i1(int i, C5107a aVar) {
        this(i);
    }

    /* renamed from: b */
    public static <FieldDescriptorType extends C5181u.C5182a<FieldDescriptorType>> C5106i1<FieldDescriptorType, Object> m15554b(int i) {
        return new C5107a(i);
    }

    /* renamed from: a */
    public Map.Entry<K, V> mo25934a(int i) {
        return this.f13579b.get(i);
    }

    /* renamed from: c */
    public final V mo25937c(int i) {
        mo25935a();
        V v = this.f13579b.remove(i).f13587b;
        if (!this.f13580c.isEmpty()) {
            Iterator it = mo25938c().entrySet().iterator();
            List<C5106i1<K, V>.c> list = this.f13579b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C5111c((Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return v;
    }

    public void clear() {
        mo25935a();
        if (!this.f13579b.isEmpty()) {
            this.f13579b.clear();
        }
        if (!this.f13580c.isEmpty()) {
            this.f13580c.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return mo25932a(comparable) >= 0 || this.f13580c.containsKey(comparable);
    }

    /* renamed from: d */
    public void mo25941d() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.f13581d) {
            if (this.f13580c.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f13580c);
            }
            this.f13580c = map;
            if (this.f13583f.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f13583f);
            }
            this.f13583f = map2;
            this.f13581d = true;
        }
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f13582e == null) {
            this.f13582e = new C5113e();
        }
        return this.f13582e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5106i1)) {
            return super.equals(obj);
        }
        C5106i1 i1Var = (C5106i1) obj;
        int size = size();
        if (size != i1Var.size()) {
            return false;
        }
        int size2 = this.f13579b.size();
        if (size2 != i1Var.f13579b.size()) {
            return entrySet().equals(i1Var.entrySet());
        }
        for (int i = 0; i < size2; i++) {
            if (!mo25934a(i).equals(i1Var.mo25934a(i))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.f13580c.equals(i1Var.f13580c);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = mo25932a(comparable);
        if (a >= 0) {
            return this.f13579b.get(a).f13587b;
        }
        return this.f13580c.get(comparable);
    }

    public int hashCode() {
        int size = this.f13579b.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.f13579b.get(i2).hashCode();
        }
        return this.f13580c.size() > 0 ? i + this.f13580c.hashCode() : i;
    }

    public V remove(Object obj) {
        mo25935a();
        Comparable comparable = (Comparable) obj;
        int a = mo25932a(comparable);
        if (a >= 0) {
            return mo25937c(a);
        }
        if (this.f13580c.isEmpty()) {
            return null;
        }
        return this.f13580c.remove(comparable);
    }

    public int size() {
        return this.f13579b.size() + this.f13580c.size();
    }

    public C5106i1(int i) {
        this.f13578a = i;
        this.f13579b = Collections.emptyList();
        this.f13580c = Collections.emptyMap();
        this.f13583f = Collections.emptyMap();
    }

    /* renamed from: a */
    public V put(K k, V v) {
        mo25935a();
        int a = mo25932a(k);
        if (a >= 0) {
            C5111c cVar = this.f13579b.get(a);
            C5106i1.this.mo25935a();
            V v2 = cVar.f13587b;
            cVar.f13587b = v;
            return v2;
        }
        mo25935a();
        if (this.f13579b.isEmpty() && !(this.f13579b instanceof ArrayList)) {
            this.f13579b = new ArrayList(this.f13578a);
        }
        int i = -(a + 1);
        if (i >= this.f13578a) {
            return mo25938c().put(k, v);
        }
        int size = this.f13579b.size();
        int i2 = this.f13578a;
        if (size == i2) {
            C5111c remove = this.f13579b.remove(i2 - 1);
            mo25938c().put(remove.f13586a, remove.f13587b);
        }
        this.f13579b.add(i, new C5111c(k, v));
        return null;
    }

    /* renamed from: b */
    public Iterable<Map.Entry<K, V>> mo25936b() {
        if (this.f13580c.isEmpty()) {
            return C5108b.f13585b;
        }
        return this.f13580c.entrySet();
    }

    /* renamed from: c */
    public final SortedMap<K, V> mo25938c() {
        mo25935a();
        if (this.f13580c.isEmpty() && !(this.f13580c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f13580c = treeMap;
            this.f13583f = treeMap.descendingMap();
        }
        return (SortedMap) this.f13580c;
    }

    /* renamed from: a */
    public final int mo25932a(K k) {
        int size = this.f13579b.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f13579b.get(size).f13586a);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.f13579b.get(i2).f13586a);
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: a */
    public final void mo25935a() {
        if (this.f13581d) {
            throw new UnsupportedOperationException();
        }
    }
}
