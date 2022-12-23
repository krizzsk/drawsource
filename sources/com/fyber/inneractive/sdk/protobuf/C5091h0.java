package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C5194z;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.fyber.inneractive.sdk.protobuf.h0 */
public final class C5091h0 extends C5067c<Long> implements C5194z.C5204i, RandomAccess, C5206z0 {

    /* renamed from: d */
    public static final C5091h0 f13558d;

    /* renamed from: b */
    public long[] f13559b;

    /* renamed from: c */
    public int f13560c;

    static {
        C5091h0 h0Var = new C5091h0(new long[0], 0);
        f13558d = h0Var;
        h0Var.f13527a = false;
    }

    public C5091h0() {
        this(new long[10], 0);
    }

    /* renamed from: a */
    public void mo25893a(long j) {
        mo25769e();
        int i = this.f13560c;
        long[] jArr = this.f13559b;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f13559b = jArr2;
        }
        long[] jArr3 = this.f13559b;
        int i2 = this.f13560c;
        this.f13560c = i2 + 1;
        jArr3[i2] = j;
    }

    public void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        mo25769e();
        if (i < 0 || i > (i2 = this.f13560c)) {
            throw new IndexOutOfBoundsException(mo25898e(i));
        }
        long[] jArr = this.f13559b;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f13559b, i, jArr2, i + 1, this.f13560c - i);
            this.f13559b = jArr2;
        }
        this.f13559b[i] = longValue;
        this.f13560c++;
        this.modCount++;
    }

    public boolean addAll(Collection<? extends Long> collection) {
        mo25769e();
        Charset charset = C5194z.f13762a;
        collection.getClass();
        if (!(collection instanceof C5091h0)) {
            return super.addAll(collection);
        }
        C5091h0 h0Var = (C5091h0) collection;
        int i = h0Var.f13560c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f13560c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f13559b;
            if (i3 > jArr.length) {
                this.f13559b = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(h0Var.f13559b, 0, this.f13559b, this.f13560c, h0Var.f13560c);
            this.f13560c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final void mo25895c(int i) {
        if (i < 0 || i >= this.f13560c) {
            throw new IndexOutOfBoundsException(mo25898e(i));
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public long mo25897d(int i) {
        mo25895c(i);
        return this.f13559b[i];
    }

    /* renamed from: e */
    public final String mo25898e(int i) {
        return "Index:" + i + ", Size:" + this.f13560c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5091h0)) {
            return super.equals(obj);
        }
        C5091h0 h0Var = (C5091h0) obj;
        if (this.f13560c != h0Var.f13560c) {
            return false;
        }
        long[] jArr = h0Var.f13559b;
        for (int i = 0; i < this.f13560c; i++) {
            if (this.f13559b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public C5194z.C5204i mo25786b(int i) {
        if (i >= this.f13560c) {
            return new C5091h0(Arrays.copyOf(this.f13559b, i), this.f13560c);
        }
        throw new IllegalArgumentException();
    }

    public Object get(int i) {
        mo25895c(i);
        return Long.valueOf(this.f13559b[i]);
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f13560c; i2++) {
            i = (i * 31) + C5194z.m16179a(this.f13559b[i2]);
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f13560c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f13559b[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    public Object remove(int i) {
        mo25769e();
        mo25895c(i);
        long[] jArr = this.f13559b;
        long j = jArr[i];
        int i2 = this.f13560c;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f13560c--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public void removeRange(int i, int i2) {
        mo25769e();
        if (i2 >= i) {
            long[] jArr = this.f13559b;
            System.arraycopy(jArr, i2, jArr, i, this.f13560c - i2);
            this.f13560c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo25769e();
        mo25895c(i);
        long[] jArr = this.f13559b;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public int size() {
        return this.f13560c;
    }

    public C5091h0(long[] jArr, int i) {
        this.f13559b = jArr;
        this.f13560c = i;
    }

    public boolean add(Object obj) {
        mo25893a(((Long) obj).longValue());
        return true;
    }
}
