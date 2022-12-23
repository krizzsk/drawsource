package com.fyber.inneractive.sdk.protobuf;

import com.amazon.aps.shared.util.APSSharedUtil;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* renamed from: com.fyber.inneractive.sdk.protobuf.i */
public abstract class C5093i implements Iterable<Byte>, Serializable {

    /* renamed from: b */
    public static final C5093i f13565b = new C5101h(C5194z.f13763b);

    /* renamed from: c */
    public static final C5098e f13566c;

    /* renamed from: a */
    public int f13567a = 0;

    /* renamed from: com.fyber.inneractive.sdk.protobuf.i$a */
    public class C5094a extends C5095b {

        /* renamed from: a */
        public int f13568a = 0;

        /* renamed from: b */
        public final int f13569b;

        public C5094a() {
            this.f13569b = C5093i.this.size();
        }

        /* renamed from: a */
        public byte mo25922a() {
            int i = this.f13568a;
            if (i < this.f13569b) {
                this.f13568a = i + 1;
                return C5093i.this.mo25911d(i);
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return this.f13568a < this.f13569b;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.i$b */
    public static abstract class C5095b implements C5099f {
        public Object next() {
            return Byte.valueOf(mo25922a());
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.i$c */
    public static final class C5096c implements C5098e {
        /* renamed from: a */
        public byte[] mo25926a(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.i$d */
    public static final class C5097d extends C5101h {
        private static final long serialVersionUID = 1;

        /* renamed from: e */
        public final int f13571e;

        /* renamed from: f */
        public final int f13572f;

        public C5097d(byte[] bArr, int i, int i2) {
            super(bArr);
            C5093i.m15513a(i, i + i2, bArr.length);
            this.f13571e = i;
            this.f13572f = i2;
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        /* renamed from: a */
        public void mo25907a(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.f13573d, this.f13571e + i, bArr, i2, i3);
        }

        /* renamed from: c */
        public byte mo25910c(int i) {
            C5093i.m15516a(i, this.f13572f);
            return this.f13573d[this.f13571e + i];
        }

        /* renamed from: d */
        public byte mo25911d(int i) {
            return this.f13573d[this.f13571e + i];
        }

        /* renamed from: j */
        public int mo25927j() {
            return this.f13571e;
        }

        public int size() {
            return this.f13572f;
        }

        public Object writeReplace() {
            return new C5101h(mo25916h());
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.i$e */
    public interface C5098e {
        /* renamed from: a */
        byte[] mo25926a(byte[] bArr, int i, int i2);
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.i$f */
    public interface C5099f extends Iterator<Byte> {
        /* renamed from: a */
        byte mo25922a();
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.i$g */
    public static abstract class C5100g extends C5093i {
        public Iterator iterator() {
            return new C5094a();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.i$h */
    public static class C5101h extends C5100g {
        private static final long serialVersionUID = 1;

        /* renamed from: d */
        public final byte[] f13573d;

        public C5101h(byte[] bArr) {
            bArr.getClass();
            this.f13573d = bArr;
        }

        /* renamed from: a */
        public void mo25907a(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.f13573d, i, bArr, i2, i3);
        }

        /* renamed from: b */
        public final C5093i mo25909b(int i, int i2) {
            int a = C5093i.m15513a(i, i2, size());
            if (a == 0) {
                return C5093i.f13565b;
            }
            return new C5097d(this.f13573d, mo25927j() + i, a);
        }

        /* renamed from: c */
        public byte mo25910c(int i) {
            return this.f13573d[i];
        }

        /* renamed from: d */
        public byte mo25911d(int i) {
            return this.f13573d[i];
        }

        /* renamed from: e */
        public final boolean mo25912e() {
            int j = mo25927j();
            return C5161s1.m16049b(this.f13573d, j, size() + j);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C5093i) || size() != ((C5093i) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof C5101h)) {
                return obj.equals(this);
            }
            C5101h hVar = (C5101h) obj;
            int i = this.f13567a;
            int i2 = hVar.f13567a;
            if (i == 0 || i2 == 0 || i == i2) {
                return mo25929a(hVar, 0, size());
            }
            return false;
        }

        /* renamed from: g */
        public final C5114j mo25915g() {
            return C5114j.m15568a(this.f13573d, mo25927j(), size(), true);
        }

        /* renamed from: j */
        public int mo25927j() {
            return 0;
        }

        public int size() {
            return this.f13573d.length;
        }

        /* renamed from: a */
        public final void mo25906a(C5090h hVar) throws IOException {
            hVar.mo25892a(this.f13573d, mo25927j(), size());
        }

        /* renamed from: a */
        public final String mo25905a(Charset charset) {
            return new String(this.f13573d, mo25927j(), size(), charset);
        }

        /* renamed from: a */
        public final boolean mo25929a(C5093i iVar, int i, int i2) {
            if (i2 <= iVar.size()) {
                int i3 = i + i2;
                if (i3 > iVar.size()) {
                    throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + iVar.size());
                } else if (!(iVar instanceof C5101h)) {
                    return iVar.mo25909b(i, i3).equals(mo25909b(0, i2));
                } else {
                    C5101h hVar = (C5101h) iVar;
                    byte[] bArr = this.f13573d;
                    byte[] bArr2 = hVar.f13573d;
                    int j = mo25927j() + i2;
                    int j2 = mo25927j();
                    int j3 = hVar.mo25927j() + i;
                    while (j2 < j) {
                        if (bArr[j2] != bArr2[j3]) {
                            return false;
                        }
                        j2++;
                        j3++;
                    }
                    return true;
                }
            } else {
                throw new IllegalArgumentException("Length too large: " + i2 + size());
            }
        }

        /* renamed from: b */
        public final int mo25908b(int i, int i2, int i3) {
            byte[] bArr = this.f13573d;
            int j = mo25927j() + i2;
            Charset charset = C5194z.f13762a;
            for (int i4 = j; i4 < j + i3; i4++) {
                i = (i * 31) + bArr[i4];
            }
            return i;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.i$i */
    public static final class C5102i implements C5098e {
        /* renamed from: a */
        public byte[] mo25926a(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }
    }

    static {
        C5098e eVar;
        if (C5072d.m15287a()) {
            eVar = new C5102i();
        } else {
            eVar = new C5096c();
        }
        f13566c = eVar;
    }

    /* renamed from: a */
    public static C5093i m15515a(byte[] bArr, int i, int i2) {
        m15513a(i, i + i2, bArr.length);
        return new C5101h(f13566c.mo25926a(bArr, i, i2));
    }

    /* renamed from: a */
    public abstract String mo25905a(Charset charset);

    /* renamed from: a */
    public abstract void mo25906a(C5090h hVar) throws IOException;

    /* renamed from: a */
    public abstract void mo25907a(byte[] bArr, int i, int i2, int i3);

    /* renamed from: b */
    public abstract int mo25908b(int i, int i2, int i3);

    /* renamed from: b */
    public abstract C5093i mo25909b(int i, int i2);

    /* renamed from: c */
    public abstract byte mo25910c(int i);

    /* renamed from: d */
    public abstract byte mo25911d(int i);

    /* renamed from: e */
    public abstract boolean mo25912e();

    public abstract boolean equals(Object obj);

    /* renamed from: f */
    public C5099f iterator() {
        return new C5094a();
    }

    /* renamed from: g */
    public abstract C5114j mo25915g();

    /* renamed from: h */
    public final byte[] mo25916h() {
        int size = size();
        if (size == 0) {
            return C5194z.f13763b;
        }
        byte[] bArr = new byte[size];
        mo25907a(bArr, 0, 0, size);
        return bArr;
    }

    public final int hashCode() {
        int i = this.f13567a;
        if (i == 0) {
            int size = size();
            i = mo25908b(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.f13567a = i;
        }
        return i;
    }

    /* renamed from: i */
    public final String mo25918i() {
        return size() == 0 ? "" : mo25905a(C5194z.f13762a);
    }

    public abstract int size();

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(size());
        if (size() <= 50) {
            str = C5124k1.m15766a(this);
        } else {
            str = C5124k1.m15766a(mo25909b(0, 47)) + APSSharedUtil.TRUNCATE_SEPARATOR;
        }
        objArr[2] = str;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* renamed from: a */
    public static C5093i m15514a(String str) {
        return new C5101h(str.getBytes(C5194z.f13762a));
    }

    /* renamed from: a */
    public static void m15516a(int i, int i2) {
        if (((i2 - (i + 1)) | i) >= 0) {
            return;
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
    }

    /* renamed from: a */
    public static int m15513a(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        } else if (i2 < i) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
        } else {
            throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
        }
    }
}
