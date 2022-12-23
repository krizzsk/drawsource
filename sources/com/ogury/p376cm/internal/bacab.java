package com.ogury.p376cm.internal;

import com.amazon.aps.shared.util.APSSharedUtil;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* renamed from: com.ogury.cm.internal.bacab */
public abstract class bacab<E> extends bacaa<E> implements List<E> {

    /* renamed from: a */
    public static final aaaaa f24514a = new aaaaa((bbabb) null);

    /* renamed from: com.ogury.cm.internal.bacab$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }

        /* renamed from: a */
        public static <T, A extends Appendable> A m28024a(Iterable<? extends T> iterable, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, bbaab<? super T, ? extends CharSequence> bbaab) {
            bbabc.m28052b(iterable, "receiver$0");
            bbabc.m28052b(a, "buffer");
            bbabc.m28052b(charSequence, "separator");
            bbabc.m28052b(charSequence2, "prefix");
            bbabc.m28052b(charSequence3, "postfix");
            bbabc.m28052b(charSequence4, "truncated");
            a.append(charSequence2);
            int i2 = 0;
            for (Object next : iterable) {
                i2++;
                if (i2 > 1) {
                    a.append(charSequence);
                }
                bbcbc.m28086a((Appendable) a, next, bbaab);
            }
            a.append(charSequence3);
            return a;
        }

        /* renamed from: a */
        private static <T, A extends Appendable> A m28025a(T[] tArr, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, bbaab<? super T, ? extends CharSequence> bbaab) {
            bbabc.m28052b(tArr, "receiver$0");
            bbabc.m28052b(a, "buffer");
            bbabc.m28052b(charSequence, "separator");
            bbabc.m28052b(charSequence2, "prefix");
            bbabc.m28052b(charSequence3, "postfix");
            bbabc.m28052b(charSequence4, "truncated");
            a.append(charSequence2);
            int i2 = 0;
            for (T t : tArr) {
                i2++;
                if (i2 > 1) {
                    a.append(charSequence);
                }
                bbcbc.m28086a((Appendable) a, t, (bbaab) null);
            }
            a.append(charSequence3);
            return a;
        }

        /* renamed from: a */
        public static /* synthetic */ String m28026a(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, bbaab bbaab, int i2, Object obj) {
            CharSequence charSequence5 = ", ";
            CharSequence charSequence6 = APSSharedUtil.TRUNCATE_SEPARATOR;
            bbabc.m28052b(objArr, "receiver$0");
            bbabc.m28052b(charSequence5, "separator");
            bbabc.m28052b(charSequence2, "prefix");
            bbabc.m28052b(charSequence3, "postfix");
            bbabc.m28052b(charSequence6, "truncated");
            String sb = ((StringBuilder) m28025a((T[]) objArr, new StringBuilder(), charSequence5, charSequence2, charSequence3, -1, charSequence6, (bbaab) null)).toString();
            bbabc.m28049a((Object) sb, "joinTo(StringBuilder(), …ed, transform).toString()");
            return sb;
        }

        /* renamed from: a */
        public static <T> List<T> m28027a(T t) {
            List<T> singletonList = Collections.singletonList(t);
            bbabc.m28049a((Object) singletonList, "java.util.Collections.singletonList(element)");
            return singletonList;
        }

        /* renamed from: a */
        public static <T> List<T> m28028a(T[] tArr) {
            bbabc.m28052b(tArr, "receiver$0");
            List<T> asList = Arrays.asList(tArr);
            bbabc.m28049a((Object) asList, "ArraysUtilJVM.asList(this)");
            return asList;
        }

        /* renamed from: a */
        public static <T> boolean m28029a(T[] tArr, T t) {
            int i;
            bbabc.m28052b(tArr, "receiver$0");
            bbabc.m28052b(tArr, "receiver$0");
            if (t != null) {
                int length = tArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (bbabc.m28051a((Object) t, (Object) tArr[i2])) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
            } else {
                int length2 = tArr.length;
                i = 0;
                while (true) {
                    if (i >= length2) {
                        break;
                    } else if (tArr[i] == null) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            i = -1;
            return i >= 0;
        }
    }

    /* renamed from: com.ogury.cm.internal.bacab$aaaab */
    class aaaab implements Iterator<E> {

        /* renamed from: b */
        private int f24516b;

        public aaaab() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final int mo63983a() {
            return this.f24516b;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo63984a(int i) {
            this.f24516b = i;
        }

        public boolean hasNext() {
            return this.f24516b < bacab.this.size();
        }

        public E next() {
            if (hasNext()) {
                bacab bacab = bacab.this;
                int i = this.f24516b;
                this.f24516b = i + 1;
                return bacab.get(i);
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: com.ogury.cm.internal.bacab$aaaac */
    class aaaac extends bacab<E>.aaaab implements ListIterator<E> {
        public aaaac(int i) {
            super();
            aaaaa aaaaa = bacab.f24514a;
            int size = bacab.this.size();
            if (i < 0 || i > size) {
                throw new IndexOutOfBoundsException("index: " + i + ", size: " + size);
            }
            mo63984a(i);
        }

        public final void add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean hasPrevious() {
            return mo63983a() > 0;
        }

        public final int nextIndex() {
            return mo63983a();
        }

        public final E previous() {
            if (hasPrevious()) {
                bacab bacab = bacab.this;
                mo63984a(mo63983a() - 1);
                return bacab.get(mo63983a());
            }
            throw new NoSuchElementException();
        }

        public final int previousIndex() {
            return mo63983a() - 1;
        }

        public final void set(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: com.ogury.cm.internal.bacab$aaaba */
    static final class aaaba<E> extends bacab<E> implements RandomAccess {

        /* renamed from: b */
        private int f24518b;

        /* renamed from: c */
        private final bacab<E> f24519c;

        /* renamed from: d */
        private final int f24520d;

        public aaaba(bacab<? extends E> bacab, int i, int i2) {
            bbabc.m28052b(bacab, "list");
            this.f24519c = bacab;
            this.f24520d = i;
            int size = bacab.size();
            if (i < 0 || i2 > size) {
                throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + size);
            } else if (i <= i2) {
                this.f24518b = i2 - this.f24520d;
            } else {
                throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
            }
        }

        /* renamed from: a */
        public final int mo63956a() {
            return this.f24518b;
        }

        public final E get(int i) {
            int i2 = this.f24518b;
            if (i >= 0 && i < i2) {
                return this.f24519c.get(this.f24520d + i);
            }
            throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
        }
    }

    protected bacab() {
    }

    public void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection<Object> collection = this;
        Collection collection2 = (Collection) obj;
        bbabc.m28052b(collection, "c");
        bbabc.m28052b(collection2, "other");
        if (collection.size() != collection2.size()) {
            return false;
        }
        Iterator it = collection2.iterator();
        for (Object a : collection) {
            if (!bbabc.m28051a(a, it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract E get(int i);

    public int hashCode() {
        Collection collection = this;
        bbabc.m28052b(collection, "c");
        Iterator it = collection.iterator();
        int i = 1;
        while (it.hasNext()) {
            Object next = it.next();
            i = (i * 31) + (next != null ? next.hashCode() : 0);
        }
        return i;
    }

    public int indexOf(Object obj) {
        int i = 0;
        for (Object a : this) {
            if (bbabc.m28051a(a, obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public Iterator<E> iterator() {
        return new aaaab();
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (bbabc.m28051a(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator<E> listIterator() {
        return new aaaac(0);
    }

    public ListIterator<E> listIterator(int i) {
        return new aaaac(i);
    }

    public E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<E> subList(int i, int i2) {
        return new aaaba<>(this, i, i2);
    }
}
