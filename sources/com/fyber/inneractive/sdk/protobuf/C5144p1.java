package com.fyber.inneractive.sdk.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.fyber.inneractive.sdk.protobuf.p1 */
public class C5144p1 extends AbstractList<String> implements C5082f0, RandomAccess {

    /* renamed from: a */
    public final C5082f0 f13653a;

    /* renamed from: com.fyber.inneractive.sdk.protobuf.p1$a */
    public class C5145a implements ListIterator<String> {

        /* renamed from: a */
        public ListIterator<String> f13654a;

        public C5145a(C5144p1 p1Var, int i) {
            this.f13654a = p1Var.f13653a.listIterator(i);
        }

        public void add(Object obj) {
            String str = (String) obj;
            throw new UnsupportedOperationException();
        }

        public boolean hasNext() {
            return this.f13654a.hasNext();
        }

        public boolean hasPrevious() {
            return this.f13654a.hasPrevious();
        }

        public Object next() {
            return this.f13654a.next();
        }

        public int nextIndex() {
            return this.f13654a.nextIndex();
        }

        public Object previous() {
            return this.f13654a.previous();
        }

        public int previousIndex() {
            return this.f13654a.previousIndex();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public void set(Object obj) {
            String str = (String) obj;
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.p1$b */
    public class C5146b implements Iterator<String> {

        /* renamed from: a */
        public Iterator<String> f13655a;

        public C5146b(C5144p1 p1Var) {
            this.f13655a = p1Var.f13653a.iterator();
        }

        public boolean hasNext() {
            return this.f13655a.hasNext();
        }

        public Object next() {
            return this.f13655a.next();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C5144p1(C5082f0 f0Var) {
        this.f13653a = f0Var;
    }

    /* renamed from: a */
    public C5082f0 mo25797a() {
        return this;
    }

    /* renamed from: c */
    public List<?> mo25801c() {
        return this.f13653a.mo25801c();
    }

    public Object get(int i) {
        return (String) this.f13653a.get(i);
    }

    public Iterator<String> iterator() {
        return new C5146b(this);
    }

    public ListIterator<String> listIterator(int i) {
        return new C5145a(this, i);
    }

    public int size() {
        return this.f13653a.size();
    }

    /* renamed from: a */
    public Object mo25798a(int i) {
        return this.f13653a.mo25798a(i);
    }

    /* renamed from: a */
    public void mo25799a(C5093i iVar) {
        throw new UnsupportedOperationException();
    }
}
