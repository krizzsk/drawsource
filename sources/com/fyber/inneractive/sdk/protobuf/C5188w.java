package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C5194z;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.fyber.inneractive.sdk.protobuf.w */
public final class C5188w extends C5067c<Float> implements C5194z.C5200f, RandomAccess, C5206z0 {

    /* renamed from: d */
    public static final C5188w f13753d;

    /* renamed from: b */
    public float[] f13754b;

    /* renamed from: c */
    public int f13755c;

    static {
        C5188w wVar = new C5188w(new float[0], 0);
        f13753d = wVar;
        wVar.f13527a = false;
    }

    public C5188w() {
        this(new float[10], 0);
    }

    /* renamed from: a */
    public void mo26218a(float f) {
        mo25769e();
        int i = this.f13755c;
        float[] fArr = this.f13754b;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f13754b = fArr2;
        }
        float[] fArr3 = this.f13754b;
        int i2 = this.f13755c;
        this.f13755c = i2 + 1;
        fArr3[i2] = f;
    }

    public void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        mo25769e();
        if (i < 0 || i > (i2 = this.f13755c)) {
            throw new IndexOutOfBoundsException(mo26222d(i));
        }
        float[] fArr = this.f13754b;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f13754b, i, fArr2, i + 1, this.f13755c - i);
            this.f13754b = fArr2;
        }
        this.f13754b[i] = floatValue;
        this.f13755c++;
        this.modCount++;
    }

    public boolean addAll(Collection<? extends Float> collection) {
        mo25769e();
        Charset charset = C5194z.f13762a;
        collection.getClass();
        if (!(collection instanceof C5188w)) {
            return super.addAll(collection);
        }
        C5188w wVar = (C5188w) collection;
        int i = wVar.f13755c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f13755c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f13754b;
            if (i3 > fArr.length) {
                this.f13754b = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(wVar.f13754b, 0, this.f13754b, this.f13755c, wVar.f13755c);
            this.f13755c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final void mo26220c(int i) {
        if (i < 0 || i >= this.f13755c) {
            throw new IndexOutOfBoundsException(mo26222d(i));
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final String mo26222d(int i) {
        return "Index:" + i + ", Size:" + this.f13755c;
    }

    /* renamed from: e */
    public C5194z.C5200f mo25786b(int i) {
        if (i >= this.f13755c) {
            return new C5188w(Arrays.copyOf(this.f13754b, i), this.f13755c);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5188w)) {
            return super.equals(obj);
        }
        C5188w wVar = (C5188w) obj;
        if (this.f13755c != wVar.f13755c) {
            return false;
        }
        float[] fArr = wVar.f13754b;
        for (int i = 0; i < this.f13755c; i++) {
            if (Float.floatToIntBits(this.f13754b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public Object get(int i) {
        mo26220c(i);
        return Float.valueOf(this.f13754b[i]);
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f13755c; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f13754b[i2]);
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.f13755c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f13754b[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    public Object remove(int i) {
        mo25769e();
        mo26220c(i);
        float[] fArr = this.f13754b;
        float f = fArr[i];
        int i2 = this.f13755c;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f13755c--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public void removeRange(int i, int i2) {
        mo25769e();
        if (i2 >= i) {
            float[] fArr = this.f13754b;
            System.arraycopy(fArr, i2, fArr, i, this.f13755c - i2);
            this.f13755c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo25769e();
        mo26220c(i);
        float[] fArr = this.f13754b;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public int size() {
        return this.f13755c;
    }

    public C5188w(float[] fArr, int i) {
        this.f13754b = fArr;
        this.f13755c = i;
    }

    public boolean add(Object obj) {
        mo26218a(((Float) obj).floatValue());
        return true;
    }
}
