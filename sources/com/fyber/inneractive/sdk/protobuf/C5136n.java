package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C5194z;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.fyber.inneractive.sdk.protobuf.n */
public final class C5136n extends C5067c<Double> implements C5194z.C5196b, RandomAccess, C5206z0 {

    /* renamed from: d */
    public static final C5136n f13641d;

    /* renamed from: b */
    public double[] f13642b;

    /* renamed from: c */
    public int f13643c;

    static {
        C5136n nVar = new C5136n(new double[0], 0);
        f13641d = nVar;
        nVar.f13527a = false;
    }

    public C5136n() {
        this(new double[10], 0);
    }

    /* renamed from: a */
    public void mo26108a(double d) {
        mo25769e();
        int i = this.f13643c;
        double[] dArr = this.f13642b;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f13642b = dArr2;
        }
        double[] dArr3 = this.f13642b;
        int i2 = this.f13643c;
        this.f13643c = i2 + 1;
        dArr3[i2] = d;
    }

    public void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        mo25769e();
        if (i < 0 || i > (i2 = this.f13643c)) {
            throw new IndexOutOfBoundsException(mo26112d(i));
        }
        double[] dArr = this.f13642b;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f13642b, i, dArr2, i + 1, this.f13643c - i);
            this.f13642b = dArr2;
        }
        this.f13642b[i] = doubleValue;
        this.f13643c++;
        this.modCount++;
    }

    public boolean addAll(Collection<? extends Double> collection) {
        mo25769e();
        Charset charset = C5194z.f13762a;
        collection.getClass();
        if (!(collection instanceof C5136n)) {
            return super.addAll(collection);
        }
        C5136n nVar = (C5136n) collection;
        int i = nVar.f13643c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f13643c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f13642b;
            if (i3 > dArr.length) {
                this.f13642b = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(nVar.f13642b, 0, this.f13642b, this.f13643c, nVar.f13643c);
            this.f13643c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final void mo26110c(int i) {
        if (i < 0 || i >= this.f13643c) {
            throw new IndexOutOfBoundsException(mo26112d(i));
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final String mo26112d(int i) {
        return "Index:" + i + ", Size:" + this.f13643c;
    }

    /* renamed from: e */
    public C5194z.C5196b mo25786b(int i) {
        if (i >= this.f13643c) {
            return new C5136n(Arrays.copyOf(this.f13642b, i), this.f13643c);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5136n)) {
            return super.equals(obj);
        }
        C5136n nVar = (C5136n) obj;
        if (this.f13643c != nVar.f13643c) {
            return false;
        }
        double[] dArr = nVar.f13642b;
        for (int i = 0; i < this.f13643c; i++) {
            if (Double.doubleToLongBits(this.f13642b[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public Object get(int i) {
        mo26110c(i);
        return Double.valueOf(this.f13642b[i]);
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f13643c; i2++) {
            i = (i * 31) + C5194z.m16179a(Double.doubleToLongBits(this.f13642b[i2]));
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.f13643c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f13642b[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    public Object remove(int i) {
        mo25769e();
        mo26110c(i);
        double[] dArr = this.f13642b;
        double d = dArr[i];
        int i2 = this.f13643c;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f13643c--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public void removeRange(int i, int i2) {
        mo25769e();
        if (i2 >= i) {
            double[] dArr = this.f13642b;
            System.arraycopy(dArr, i2, dArr, i, this.f13643c - i2);
            this.f13643c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo25769e();
        mo26110c(i);
        double[] dArr = this.f13642b;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public int size() {
        return this.f13643c;
    }

    public C5136n(double[] dArr, int i) {
        this.f13642b = dArr;
        this.f13643c = i;
    }

    public boolean add(Object obj) {
        mo26108a(((Double) obj).doubleValue());
        return true;
    }
}
