package com.tapjoy.internal;

import java.io.Closeable;
import java.io.Flushable;
import java.util.LinkedList;

/* renamed from: com.tapjoy.internal.ao */
public final class C11273ao<E> extends C11271an<E> implements C11276ar<E>, Closeable, Flushable {

    /* renamed from: a */
    private final C11276ar<E> f26935a;

    /* renamed from: b */
    private final LinkedList<E> f26936b = new LinkedList<>();

    /* renamed from: c */
    private final LinkedList<E> f26937c = new LinkedList<>();

    /* renamed from: d */
    private int f26938d;

    /* renamed from: e */
    private boolean f26939e;

    /* renamed from: a */
    public static <E> C11273ao<E> m30865a(C11276ar<E> arVar) {
        return new C11273ao<>(arVar);
    }

    private C11273ao(C11276ar<E> arVar) {
        this.f26935a = arVar;
        int size = arVar.size();
        this.f26938d = size;
        this.f26939e = size == 0;
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        close();
        super.finalize();
    }

    public final void close() {
        try {
            flush();
        } finally {
            C11276ar<E> arVar = this.f26935a;
            if (arVar instanceof Closeable) {
                ((Closeable) arVar).close();
            }
        }
    }

    public final void flush() {
        if (!this.f26937c.isEmpty()) {
            this.f26935a.addAll(this.f26937c);
            if (this.f26939e) {
                this.f26936b.addAll(this.f26937c);
            }
            this.f26937c.clear();
        }
    }

    public final int size() {
        return this.f26938d;
    }

    public final boolean offer(E e) {
        this.f26937c.add(e);
        this.f26938d++;
        return true;
    }

    public final E poll() {
        E e;
        if (this.f26938d <= 0) {
            return null;
        }
        if (!this.f26936b.isEmpty()) {
            e = this.f26936b.remove();
            this.f26935a.mo69632b(1);
        } else if (this.f26939e) {
            e = this.f26937c.remove();
        } else {
            e = this.f26935a.remove();
            if (this.f26938d == this.f26937c.size() + 1) {
                this.f26939e = true;
            }
        }
        this.f26938d--;
        return e;
    }

    public final E peek() {
        if (this.f26938d <= 0) {
            return null;
        }
        if (!this.f26936b.isEmpty()) {
            return this.f26936b.element();
        }
        if (this.f26939e) {
            return this.f26937c.element();
        }
        E peek = this.f26935a.peek();
        this.f26936b.add(peek);
        if (this.f26938d == this.f26936b.size() + this.f26937c.size()) {
            this.f26939e = true;
        }
        return peek;
    }

    /* renamed from: a */
    public final E mo69631a(int i) {
        if (i < 0 || i >= this.f26938d) {
            throw new IndexOutOfBoundsException();
        }
        int size = this.f26936b.size();
        if (i < size) {
            return this.f26936b.get(i);
        }
        if (this.f26939e) {
            return this.f26937c.get(i - size);
        }
        if (i >= this.f26935a.size()) {
            return this.f26937c.get(i - this.f26935a.size());
        }
        E e = null;
        while (size <= i) {
            e = this.f26935a.mo69631a(size);
            this.f26936b.add(e);
            size++;
        }
        if (i + 1 + this.f26937c.size() == this.f26938d) {
            this.f26939e = true;
        }
        return e;
    }

    /* renamed from: b */
    public final void mo69632b(int i) {
        if (i <= 0 || i > this.f26938d) {
            throw new IndexOutOfBoundsException();
        }
        if (i <= this.f26936b.size()) {
            C11275aq.m30870a(this.f26936b, i);
            this.f26935a.mo69632b(i);
        } else {
            this.f26936b.clear();
            int size = (this.f26937c.size() + i) - this.f26938d;
            if (size < 0) {
                this.f26935a.mo69632b(i);
            } else {
                this.f26935a.clear();
                this.f26939e = true;
                if (size > 0) {
                    C11275aq.m30870a(this.f26937c, size);
                }
            }
        }
        this.f26938d -= i;
    }
}
