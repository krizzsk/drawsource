package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C5194z;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.fyber.inneractive.sdk.protobuf.c1 */
public final class C5071c1<E> extends C5067c<E> implements RandomAccess {

    /* renamed from: d */
    public static final C5071c1<Object> f13530d;

    /* renamed from: b */
    public E[] f13531b;

    /* renamed from: c */
    public int f13532c;

    static {
        C5071c1<Object> c1Var = new C5071c1<>(new Object[0], 0);
        f13530d = c1Var;
        c1Var.f13527a = false;
    }

    public C5071c1(E[] eArr, int i) {
        this.f13531b = eArr;
        this.f13532c = i;
    }

    public boolean add(E e) {
        mo25769e();
        int i = this.f13532c;
        E[] eArr = this.f13531b;
        if (i == eArr.length) {
            this.f13531b = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f13531b;
        int i2 = this.f13532c;
        this.f13532c = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }

    /* renamed from: b */
    public C5194z.C5205j mo25786b(int i) {
        if (i >= this.f13532c) {
            return new C5071c1(Arrays.copyOf(this.f13531b, i), this.f13532c);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public final void mo25787c(int i) {
        if (i < 0 || i >= this.f13532c) {
            throw new IndexOutOfBoundsException(mo25788d(i));
        }
    }

    /* renamed from: d */
    public final String mo25788d(int i) {
        return "Index:" + i + ", Size:" + this.f13532c;
    }

    public E get(int i) {
        mo25787c(i);
        return this.f13531b[i];
    }

    public E remove(int i) {
        mo25769e();
        mo25787c(i);
        E[] eArr = this.f13531b;
        E e = eArr[i];
        int i2 = this.f13532c;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f13532c--;
        this.modCount++;
        return e;
    }

    public E set(int i, E e) {
        mo25769e();
        mo25787c(i);
        E[] eArr = this.f13531b;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    public int size() {
        return this.f13532c;
    }

    public void add(int i, E e) {
        int i2;
        mo25769e();
        if (i < 0 || i > (i2 = this.f13532c)) {
            throw new IndexOutOfBoundsException(mo25788d(i));
        }
        E[] eArr = this.f13531b;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.f13531b, i, eArr2, i + 1, this.f13532c - i);
            this.f13531b = eArr2;
        }
        this.f13531b[i] = e;
        this.f13532c++;
        this.modCount++;
    }
}
