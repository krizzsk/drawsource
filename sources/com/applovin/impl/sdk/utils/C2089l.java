package com.applovin.impl.sdk.utils;

import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;

/* renamed from: com.applovin.impl.sdk.utils.l */
public class C2089l<T extends Comparable<? super T>> implements RandomAccess, Set<T> {

    /* renamed from: a */
    private final ArrayList<T> f4091a = new ArrayList<>();

    /* renamed from: b */
    private final HashSet<T> f4092b = new HashSet<>();

    /* renamed from: a */
    public T mo14947a() {
        return (Comparable) this.f4091a.get(size() - 1);
    }

    /* renamed from: a */
    public T mo14948a(int i) {
        return (Comparable) this.f4091a.get(i);
    }

    /* renamed from: a */
    public void mo14949a(int i, T t) {
        this.f4092b.remove((Comparable) this.f4091a.get(i));
        this.f4091a.set(i, t);
        this.f4092b.add(t);
    }

    /* renamed from: a */
    public boolean add(T t) {
        if (contains(t)) {
            return false;
        }
        if (isEmpty() || t.compareTo(mo14947a()) > 0) {
            this.f4091a.add(t);
        } else {
            this.f4091a.add(mo14955c(t), t);
        }
        return this.f4092b.add(t);
    }

    public boolean addAll(Collection<? extends T> collection) {
        Iterator<? extends T> it = collection.iterator();
        while (true) {
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    return z;
                }
                if (add((Comparable) it.next()) || z) {
                    z = true;
                }
            }
        }
    }

    /* renamed from: b */
    public int mo14953b(T t) {
        if (t == null || !contains(t)) {
            return -1;
        }
        return mo14955c(t);
    }

    /* renamed from: b */
    public T mo14954b(int i) {
        T t = (Comparable) this.f4091a.remove(i);
        this.f4092b.remove(t);
        return t;
    }

    /* renamed from: c */
    public int mo14955c(T t) {
        int binarySearch = Collections.binarySearch(this.f4091a, t);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        Comparable a = mo14948a(binarySearch);
        while (binarySearch >= 0 && a == mo14948a(binarySearch)) {
            binarySearch--;
        }
        return binarySearch + 1;
    }

    public void clear() {
        this.f4091a.clear();
        this.f4092b.clear();
    }

    public boolean contains(Object obj) {
        return this.f4092b.contains(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return this.f4092b.containsAll(collection);
    }

    /* renamed from: d */
    public int mo14959d(T t) {
        int binarySearch = Collections.binarySearch(this.f4091a, t);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        Comparable a = mo14948a(binarySearch);
        while (binarySearch < size() && a == mo14948a(binarySearch)) {
            binarySearch++;
        }
        return binarySearch;
    }

    public boolean isEmpty() {
        return this.f4091a.isEmpty();
    }

    public Iterator<T> iterator() {
        return this.f4091a.iterator();
    }

    public boolean remove(Object obj) {
        int b = mo14953b((Comparable) obj);
        if (b == -1) {
            return false;
        }
        this.f4091a.remove(b);
        return this.f4092b.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (true) {
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    return false;
                }
                Object next = it.next();
                if (z || remove(next)) {
                    z = true;
                }
            }
        }
    }

    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int size = size() - 1; size >= 0; size--) {
            Comparable comparable = (Comparable) this.f4091a.get(size);
            if (!collection.contains(comparable)) {
                this.f4091a.remove(size);
                this.f4092b.remove(comparable);
                z = true;
            }
        }
        return z;
    }

    public int size() {
        return this.f4091a.size();
    }

    public Object[] toArray() {
        return this.f4091a.toArray();
    }

    public <T1> T1[] toArray(T1[] t1Arr) {
        return this.f4091a.toArray(t1Arr);
    }
}
