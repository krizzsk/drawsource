package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C5194z;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.fyber.inneractive.sdk.protobuf.g */
public final class C5084g extends C5067c<Boolean> implements C5194z.C5195a, RandomAccess, C5206z0 {

    /* renamed from: d */
    public static final C5084g f13552d;

    /* renamed from: b */
    public boolean[] f13553b;

    /* renamed from: c */
    public int f13554c;

    static {
        C5084g gVar = new C5084g(new boolean[0], 0);
        f13552d = gVar;
        gVar.f13527a = false;
    }

    public C5084g() {
        this(new boolean[10], 0);
    }

    /* renamed from: a */
    public void mo25878a(boolean z) {
        mo25769e();
        int i = this.f13554c;
        boolean[] zArr = this.f13553b;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f13553b = zArr2;
        }
        boolean[] zArr3 = this.f13553b;
        int i2 = this.f13554c;
        this.f13554c = i2 + 1;
        zArr3[i2] = z;
    }

    public void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo25769e();
        if (i < 0 || i > (i2 = this.f13554c)) {
            throw new IndexOutOfBoundsException(mo25882d(i));
        }
        boolean[] zArr = this.f13553b;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f13553b, i, zArr2, i + 1, this.f13554c - i);
            this.f13553b = zArr2;
        }
        this.f13553b[i] = booleanValue;
        this.f13554c++;
        this.modCount++;
    }

    public boolean addAll(Collection<? extends Boolean> collection) {
        mo25769e();
        Charset charset = C5194z.f13762a;
        collection.getClass();
        if (!(collection instanceof C5084g)) {
            return super.addAll(collection);
        }
        C5084g gVar = (C5084g) collection;
        int i = gVar.f13554c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f13554c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f13553b;
            if (i3 > zArr.length) {
                this.f13553b = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(gVar.f13553b, 0, this.f13553b, this.f13554c, gVar.f13554c);
            this.f13554c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final void mo25880c(int i) {
        if (i < 0 || i >= this.f13554c) {
            throw new IndexOutOfBoundsException(mo25882d(i));
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final String mo25882d(int i) {
        return "Index:" + i + ", Size:" + this.f13554c;
    }

    /* renamed from: e */
    public C5194z.C5195a mo25786b(int i) {
        if (i >= this.f13554c) {
            return new C5084g(Arrays.copyOf(this.f13553b, i), this.f13554c);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5084g)) {
            return super.equals(obj);
        }
        C5084g gVar = (C5084g) obj;
        if (this.f13554c != gVar.f13554c) {
            return false;
        }
        boolean[] zArr = gVar.f13553b;
        for (int i = 0; i < this.f13554c; i++) {
            if (this.f13553b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public Object get(int i) {
        mo25880c(i);
        return Boolean.valueOf(this.f13553b[i]);
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f13554c; i2++) {
            i = (i * 31) + C5194z.m16180a(this.f13553b[i2]);
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.f13554c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f13553b[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    public Object remove(int i) {
        mo25769e();
        mo25880c(i);
        boolean[] zArr = this.f13553b;
        boolean z = zArr[i];
        int i2 = this.f13554c;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f13554c--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public void removeRange(int i, int i2) {
        mo25769e();
        if (i2 >= i) {
            boolean[] zArr = this.f13553b;
            System.arraycopy(zArr, i2, zArr, i, this.f13554c - i2);
            this.f13554c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo25769e();
        mo25880c(i);
        boolean[] zArr = this.f13553b;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public int size() {
        return this.f13554c;
    }

    public C5084g(boolean[] zArr, int i) {
        this.f13553b = zArr;
        this.f13554c = i;
    }

    public boolean add(Object obj) {
        mo25878a(((Boolean) obj).booleanValue());
        return true;
    }
}
