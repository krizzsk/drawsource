package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C5194z;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.fyber.inneractive.sdk.protobuf.y */
public final class C5192y extends C5067c<Integer> implements C5194z.C5201g, RandomAccess, C5206z0 {

    /* renamed from: d */
    public static final C5192y f13759d;

    /* renamed from: b */
    public int[] f13760b;

    /* renamed from: c */
    public int f13761c;

    static {
        C5192y yVar = new C5192y(new int[0], 0);
        f13759d = yVar;
        yVar.f13527a = false;
    }

    public C5192y() {
        this(new int[10], 0);
    }

    public void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        mo25769e();
        if (i < 0 || i > (i2 = this.f13761c)) {
            throw new IndexOutOfBoundsException(mo26234f(i));
        }
        int[] iArr = this.f13760b;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f13760b, i, iArr2, i + 1, this.f13761c - i);
            this.f13760b = iArr2;
        }
        this.f13760b[i] = intValue;
        this.f13761c++;
        this.modCount++;
    }

    public boolean addAll(Collection<? extends Integer> collection) {
        mo25769e();
        Charset charset = C5194z.f13762a;
        collection.getClass();
        if (!(collection instanceof C5192y)) {
            return super.addAll(collection);
        }
        C5192y yVar = (C5192y) collection;
        int i = yVar.f13761c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f13761c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f13760b;
            if (i3 > iArr.length) {
                this.f13760b = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(yVar.f13760b, 0, this.f13760b, this.f13761c, yVar.f13761c);
            this.f13761c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public void mo26230c(int i) {
        mo25769e();
        int i2 = this.f13761c;
        int[] iArr = this.f13760b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f13760b = iArr2;
        }
        int[] iArr3 = this.f13760b;
        int i3 = this.f13761c;
        this.f13761c = i3 + 1;
        iArr3[i3] = i;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final void mo26232d(int i) {
        if (i < 0 || i >= this.f13761c) {
            throw new IndexOutOfBoundsException(mo26234f(i));
        }
    }

    /* renamed from: e */
    public int mo26233e(int i) {
        mo26232d(i);
        return this.f13760b[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5192y)) {
            return super.equals(obj);
        }
        C5192y yVar = (C5192y) obj;
        if (this.f13761c != yVar.f13761c) {
            return false;
        }
        int[] iArr = yVar.f13760b;
        for (int i = 0; i < this.f13761c; i++) {
            if (this.f13760b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final String mo26234f(int i) {
        return "Index:" + i + ", Size:" + this.f13761c;
    }

    /* renamed from: g */
    public C5194z.C5201g mo25786b(int i) {
        if (i >= this.f13761c) {
            return new C5192y(Arrays.copyOf(this.f13760b, i), this.f13761c);
        }
        throw new IllegalArgumentException();
    }

    public Object get(int i) {
        mo26232d(i);
        return Integer.valueOf(this.f13760b[i]);
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f13761c; i2++) {
            i = (i * 31) + this.f13760b[i2];
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f13761c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f13760b[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    public Object remove(int i) {
        mo25769e();
        mo26232d(i);
        int[] iArr = this.f13760b;
        int i2 = iArr[i];
        int i3 = this.f13761c;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f13761c--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public void removeRange(int i, int i2) {
        mo25769e();
        if (i2 >= i) {
            int[] iArr = this.f13760b;
            System.arraycopy(iArr, i2, iArr, i, this.f13761c - i2);
            this.f13761c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo25769e();
        mo26232d(i);
        int[] iArr = this.f13760b;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public int size() {
        return this.f13761c;
    }

    public C5192y(int[] iArr, int i) {
        this.f13760b = iArr;
        this.f13761c = i;
    }

    public boolean add(Object obj) {
        mo26230c(((Integer) obj).intValue());
        return true;
    }
}
