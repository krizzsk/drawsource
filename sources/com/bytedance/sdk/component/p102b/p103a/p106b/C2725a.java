package com.bytedance.sdk.component.p102b.p103a.p106b;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* renamed from: com.bytedance.sdk.component.b.a.b.a */
/* compiled from: Buffer */
public final class C2725a implements C2726b, C2727c, Cloneable, ByteChannel {

    /* renamed from: c */
    private static final byte[] f6062c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: a */
    C2729e f6063a;

    /* renamed from: b */
    long f6064b;

    public void close() {
    }

    public void flush() {
    }

    public boolean isOpen() {
        return true;
    }

    /* renamed from: a */
    public boolean mo17439a() {
        return this.f6064b == 0;
    }

    /* renamed from: b */
    public byte mo17441b() {
        if (this.f6064b != 0) {
            C2729e eVar = this.f6063a;
            int i = eVar.f6072b;
            int i2 = eVar.f6073c;
            int i3 = i + 1;
            byte b = eVar.f6071a[i];
            this.f6064b--;
            if (i3 == i2) {
                this.f6063a = eVar.mo17474b();
                C2730f.m7383a(eVar);
            } else {
                eVar.f6072b = i3;
            }
            return b;
        }
        throw new IllegalStateException("size == 0");
    }

    /* renamed from: c */
    public String mo17446c() {
        try {
            return mo17437a(this.f6064b, C2733i.f6082a);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public String mo17437a(long j, Charset charset) throws EOFException {
        C2733i.m7400a(this.f6064b, 0, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
        } else if (j == 0) {
            return "";
        } else {
            C2729e eVar = this.f6063a;
            if (((long) eVar.f6072b) + j > ((long) eVar.f6073c)) {
                return new String(mo17440a(j), charset);
            }
            String str = new String(eVar.f6071a, eVar.f6072b, (int) j, charset);
            eVar.f6072b = (int) (((long) eVar.f6072b) + j);
            this.f6064b -= j;
            if (eVar.f6072b == eVar.f6073c) {
                this.f6063a = eVar.mo17474b();
                C2730f.m7383a(eVar);
            }
            return str;
        }
    }

    /* renamed from: a */
    public byte[] mo17440a(long j) throws EOFException {
        C2733i.m7400a(this.f6064b, 0, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[((int) j)];
            mo17438a(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
    }

    /* renamed from: a */
    public void mo17438a(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int a = mo17432a(bArr, i, bArr.length - i);
            if (a != -1) {
                i += a;
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: a */
    public int mo17432a(byte[] bArr, int i, int i2) {
        C2733i.m7400a((long) bArr.length, (long) i, (long) i2);
        C2729e eVar = this.f6063a;
        if (eVar == null) {
            return -1;
        }
        int min = Math.min(i2, eVar.f6073c - eVar.f6072b);
        System.arraycopy(eVar.f6071a, eVar.f6072b, bArr, i, min);
        eVar.f6072b += min;
        this.f6064b -= (long) min;
        if (eVar.f6072b == eVar.f6073c) {
            this.f6063a = eVar.mo17474b();
            C2730f.m7383a(eVar);
        }
        return min;
    }

    public int read(ByteBuffer byteBuffer) throws IOException {
        C2729e eVar = this.f6063a;
        if (eVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), eVar.f6073c - eVar.f6072b);
        byteBuffer.put(eVar.f6071a, eVar.f6072b, min);
        eVar.f6072b += min;
        this.f6064b -= (long) min;
        if (eVar.f6072b == eVar.f6073c) {
            this.f6063a = eVar.mo17474b();
            C2730f.m7383a(eVar);
        }
        return min;
    }

    /* renamed from: a */
    public C2725a mo17434a(String str) {
        return mo17435a(str, 0, str.length());
    }

    /* renamed from: a */
    public C2725a mo17435a(String str, int i, int i2) {
        char c;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + i);
        } else if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        } else if (i2 <= str.length()) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt < 128) {
                    C2729e c2 = mo17445c(1);
                    byte[] bArr = c2.f6071a;
                    int i3 = c2.f6073c - i;
                    int min = Math.min(i2, 8192 - i3);
                    int i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                    while (i4 < min) {
                        char charAt2 = str.charAt(i4);
                        if (charAt2 >= 128) {
                            break;
                        }
                        bArr[i4 + i3] = (byte) charAt2;
                        i4++;
                    }
                    int i5 = (i3 + i4) - c2.f6073c;
                    c2.f6073c += i5;
                    this.f6064b += (long) i5;
                    i = i4;
                } else {
                    if (charAt < 2048) {
                        mo17442b((charAt >> 6) | 192);
                        mo17442b((int) (charAt & '?') | 128);
                    } else if (charAt < 55296 || charAt > 57343) {
                        mo17442b((charAt >> 12) | 224);
                        mo17442b(((charAt >> 6) & 63) | 128);
                        mo17442b((int) (charAt & '?') | 128);
                    } else {
                        int i6 = i + 1;
                        if (i6 < i2) {
                            c = str.charAt(i6);
                        } else {
                            c = 0;
                        }
                        if (charAt > 56319 || c < 56320 || c > 57343) {
                            mo17442b(63);
                            i = i6;
                        } else {
                            int i7 = (((charAt & 10239) << 10) | (9215 & c)) + 0;
                            mo17442b((i7 >> 18) | 240);
                            mo17442b(((i7 >> 12) & 63) | 128);
                            mo17442b(((i7 >> 6) & 63) | 128);
                            mo17442b((i7 & 63) | 128);
                            i += 2;
                        }
                    }
                    i++;
                }
            }
            return this;
        } else {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
    }

    /* renamed from: a */
    public C2725a mo17433a(int i) {
        if (i < 128) {
            mo17442b(i);
        } else if (i < 2048) {
            mo17442b((i >> 6) | 192);
            mo17442b((i & 63) | 128);
        } else if (i < 65536) {
            if (i < 55296 || i > 57343) {
                mo17442b((i >> 12) | 224);
                mo17442b(((i >> 6) & 63) | 128);
                mo17442b((i & 63) | 128);
            } else {
                mo17442b(63);
            }
        } else if (i <= 1114111) {
            mo17442b((i >> 18) | 240);
            mo17442b(((i >> 12) & 63) | 128);
            mo17442b(((i >> 6) & 63) | 128);
            mo17442b((i & 63) | 128);
        } else {
            throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
        }
        return this;
    }

    /* renamed from: a */
    public C2725a mo17436a(String str, int i, int i2, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            throw new IllegalAccessError("beginIndex < 0: " + i);
        } else if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        } else if (i2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        } else if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (charset.equals(C2733i.f6082a)) {
            return mo17435a(str, i, i2);
        } else {
            byte[] bytes = str.substring(i, i2).getBytes(charset);
            return mo17444b(bytes, 0, bytes.length);
        }
    }

    /* renamed from: b */
    public C2725a mo17444b(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = (long) i2;
            C2733i.m7400a((long) bArr.length, (long) i, j);
            int i3 = i2 + i;
            while (i < i3) {
                C2729e c = mo17445c(1);
                int min = Math.min(i3 - i, 8192 - c.f6073c);
                System.arraycopy(bArr, i, c.f6071a, c.f6073c, min);
                i += min;
                c.f6073c += min;
            }
            this.f6064b += j;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i = remaining;
            while (i > 0) {
                C2729e c = mo17445c(1);
                int min = Math.min(i, 8192 - c.f6073c);
                byteBuffer.get(c.f6071a, c.f6073c, min);
                i -= min;
                c.f6073c += min;
            }
            this.f6064b += (long) remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: b */
    public C2725a mo17442b(int i) {
        C2729e c = mo17445c(1);
        byte[] bArr = c.f6071a;
        int i2 = c.f6073c;
        c.f6073c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f6064b++;
        return this;
    }

    /* renamed from: b */
    public C2725a mo17443b(long j) {
        if (j == 0) {
            return mo17442b(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        C2729e c = mo17445c(numberOfTrailingZeros);
        byte[] bArr = c.f6071a;
        int i = c.f6073c;
        for (int i2 = (c.f6073c + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = f6062c[(int) (15 & j)];
            j >>>= 4;
        }
        c.f6073c += numberOfTrailingZeros;
        this.f6064b += (long) numberOfTrailingZeros;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C2729e mo17445c(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException();
        }
        C2729e eVar = this.f6063a;
        if (eVar == null) {
            C2729e a = C2730f.m7382a();
            this.f6063a = a;
            a.f6077g = a;
            a.f6076f = a;
            return a;
        }
        C2729e eVar2 = eVar.f6077g;
        return (eVar2.f6073c + i > 8192 || !eVar2.f6075e) ? eVar2.mo17473a(C2730f.m7382a()) : eVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2725a)) {
            return false;
        }
        C2725a aVar = (C2725a) obj;
        long j = this.f6064b;
        if (j != aVar.f6064b) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        C2729e eVar = this.f6063a;
        C2729e eVar2 = aVar.f6063a;
        int i = eVar.f6072b;
        int i2 = eVar2.f6072b;
        while (j2 < this.f6064b) {
            long min = (long) Math.min(eVar.f6073c - i, eVar2.f6073c - i2);
            int i3 = 0;
            while (((long) i3) < min) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (eVar.f6071a[i] != eVar2.f6071a[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == eVar.f6073c) {
                eVar = eVar.f6076f;
                i = eVar.f6072b;
            }
            if (i2 == eVar2.f6073c) {
                eVar2 = eVar2.f6076f;
                i2 = eVar2.f6072b;
            }
            j2 += min;
        }
        return true;
    }

    public int hashCode() {
        C2729e eVar = this.f6063a;
        if (eVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = eVar.f6073c;
            for (int i3 = eVar.f6072b; i3 < i2; i3++) {
                i = (i * 31) + eVar.f6071a[i3];
            }
            eVar = eVar.f6076f;
        } while (eVar != this.f6063a);
        return i;
    }

    public String toString() {
        return mo17451e().toString();
    }

    /* renamed from: d */
    public C2725a clone() {
        C2725a aVar = new C2725a();
        if (this.f6064b == 0) {
            return aVar;
        }
        C2729e a = this.f6063a.mo17472a();
        aVar.f6063a = a;
        a.f6077g = a;
        a.f6076f = a;
        C2729e eVar = this.f6063a;
        while (true) {
            eVar = eVar.f6076f;
            if (eVar != this.f6063a) {
                aVar.f6063a.f6077g.mo17473a(eVar.mo17472a());
            } else {
                aVar.f6064b = this.f6064b;
                return aVar;
            }
        }
    }

    /* renamed from: e */
    public final C2728d mo17451e() {
        long j = this.f6064b;
        if (j <= 2147483647L) {
            return mo17450d((int) j);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f6064b);
    }

    /* renamed from: d */
    public final C2728d mo17450d(int i) {
        if (i == 0) {
            return C2728d.f6067c;
        }
        return new C2731g(this, i);
    }
}
