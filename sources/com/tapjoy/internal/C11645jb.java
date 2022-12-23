package com.tapjoy.internal;

import android.support.p003v4.media.session.PlaybackStateCompat;
import com.google.common.base.Ascii;
import java.io.EOFException;
import java.nio.charset.Charset;

/* renamed from: com.tapjoy.internal.jb */
public final class C11645jb implements C11646jc, C11647jd, Cloneable {

    /* renamed from: c */
    private static final byte[] f28073c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: a */
    C11654ji f28074a;

    /* renamed from: b */
    long f28075b;

    /* renamed from: a */
    public final C11646jc mo70247a() {
        return this;
    }

    public final void close() {
    }

    public final void flush() {
    }

    /* renamed from: b */
    public final boolean mo70255b() {
        return this.f28075b == 0;
    }

    /* renamed from: a */
    public final void mo70248a(long j) {
        if (this.f28075b < j) {
            throw new EOFException();
        }
    }

    /* renamed from: c */
    public final long mo70256c() {
        long j = this.f28075b;
        if (j == 0) {
            return 0;
        }
        C11654ji jiVar = this.f28074a.f28098g;
        return (jiVar.f28094c >= 8192 || !jiVar.f28096e) ? j : j - ((long) (jiVar.f28094c - jiVar.f28093b));
    }

    /* renamed from: d */
    public final byte mo70261d() {
        if (this.f28075b != 0) {
            C11654ji jiVar = this.f28074a;
            int i = jiVar.f28093b;
            int i2 = jiVar.f28094c;
            int i3 = i + 1;
            byte b = jiVar.f28092a[i];
            this.f28075b--;
            if (i3 == i2) {
                this.f28074a = jiVar.mo70292a();
                C11655jj.m31976a(jiVar);
            } else {
                jiVar.f28093b = i3;
            }
            return b;
        }
        throw new IllegalStateException("size == 0");
    }

    /* renamed from: e */
    public final int mo70264e() {
        if (this.f28075b >= 4) {
            C11654ji jiVar = this.f28074a;
            int i = jiVar.f28093b;
            int i2 = jiVar.f28094c;
            if (i2 - i < 4) {
                return ((mo70261d() & 255) << Ascii.CAN) | ((mo70261d() & 255) << Ascii.DLE) | ((mo70261d() & 255) << 8) | (mo70261d() & 255);
            }
            byte[] bArr = jiVar.f28092a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << Ascii.CAN) | ((bArr[i3] & 255) << Ascii.DLE);
            int i5 = i4 + 1;
            byte b2 = b | ((bArr[i4] & 255) << 8);
            int i6 = i5 + 1;
            byte b3 = b2 | (bArr[i5] & 255);
            this.f28075b -= 4;
            if (i6 == i2) {
                this.f28074a = jiVar.mo70292a();
                C11655jj.m31976a(jiVar);
            } else {
                jiVar.f28093b = i6;
            }
            return b3;
        }
        throw new IllegalStateException("size < 4: " + this.f28075b);
    }

    /* renamed from: f */
    public final int mo70268f() {
        return C11661jo.m31991a(mo70264e());
    }

    /* renamed from: b */
    public final C11648je mo70254b(long j) {
        return new C11648je(m31898g(j));
    }

    /* renamed from: c */
    public final String mo70258c(long j) {
        Charset charset = C11661jo.f28106a;
        C11661jo.m31993a(this.f28075b, 0, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j)));
        } else if (j == 0) {
            return "";
        } else {
            C11654ji jiVar = this.f28074a;
            if (((long) jiVar.f28093b) + j > ((long) jiVar.f28094c)) {
                return new String(m31898g(j), charset);
            }
            String str = new String(jiVar.f28092a, jiVar.f28093b, (int) j, charset);
            jiVar.f28093b = (int) (((long) jiVar.f28093b) + j);
            this.f28075b -= j;
            if (jiVar.f28093b == jiVar.f28094c) {
                this.f28074a = jiVar.mo70292a();
                C11655jj.m31976a(jiVar);
            }
            return str;
        }
    }

    /* renamed from: h */
    public final byte[] mo70272h() {
        try {
            return m31898g(this.f28075b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: g */
    private byte[] m31898g(long j) {
        C11661jo.m31993a(this.f28075b, 0, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[((int) j)];
            m31897a(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j)));
    }

    /* renamed from: a */
    private void m31897a(byte[] bArr) {
        int i;
        int i2 = 0;
        while (i2 < bArr.length) {
            int length = bArr.length - i2;
            C11661jo.m31993a((long) bArr.length, (long) i2, (long) length);
            C11654ji jiVar = this.f28074a;
            if (jiVar == null) {
                i = -1;
            } else {
                i = Math.min(length, jiVar.f28094c - jiVar.f28093b);
                System.arraycopy(jiVar.f28092a, jiVar.f28093b, bArr, i2, i);
                jiVar.f28093b += i;
                this.f28075b -= (long) i;
                if (jiVar.f28093b == jiVar.f28094c) {
                    this.f28074a = jiVar.mo70292a();
                    C11655jj.m31976a(jiVar);
                }
            }
            if (i != -1) {
                i2 += i;
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: d */
    public final void mo70263d(long j) {
        while (j > 0) {
            C11654ji jiVar = this.f28074a;
            if (jiVar != null) {
                int min = (int) Math.min(j, (long) (jiVar.f28094c - this.f28074a.f28093b));
                long j2 = (long) min;
                this.f28075b -= j2;
                j -= j2;
                this.f28074a.f28093b += min;
                if (this.f28074a.f28093b == this.f28074a.f28094c) {
                    C11654ji jiVar2 = this.f28074a;
                    this.f28074a = jiVar2.mo70292a();
                    C11655jj.m31976a(jiVar2);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    /* renamed from: a */
    public final C11645jb mo70252b(C11648je jeVar) {
        if (jeVar != null) {
            jeVar.mo70279a(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    /* renamed from: a */
    public final C11645jb mo70253b(String str) {
        char c;
        char charAt;
        int length = str.length();
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (length < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + length + " < 0");
        } else if (length <= str.length()) {
            int i = 0;
            while (i < length) {
                char charAt2 = str.charAt(i);
                if (charAt2 < 128) {
                    C11654ji c2 = mo70257c(1);
                    byte[] bArr = c2.f28092a;
                    int i2 = c2.f28094c - i;
                    int min = Math.min(length, 8192 - i2);
                    int i3 = i + 1;
                    bArr[i + i2] = (byte) charAt2;
                    while (true) {
                        i = i3;
                        if (i >= min || (charAt = str.charAt(i)) >= 128) {
                            int i4 = (i2 + i) - c2.f28094c;
                            c2.f28094c += i4;
                            this.f28075b += (long) i4;
                        } else {
                            i3 = i + 1;
                            bArr[i + i2] = (byte) charAt;
                        }
                    }
                    int i42 = (i2 + i) - c2.f28094c;
                    c2.f28094c += i42;
                    this.f28075b += (long) i42;
                } else {
                    if (charAt2 < 2048) {
                        mo70266e((charAt2 >> 6) | 192);
                        mo70266e((int) (charAt2 & '?') | 128);
                    } else if (charAt2 < 55296 || charAt2 > 57343) {
                        mo70266e((charAt2 >> 12) | 224);
                        mo70266e(((charAt2 >> 6) & 63) | 128);
                        mo70266e((int) (charAt2 & '?') | 128);
                    } else {
                        int i5 = i + 1;
                        if (i5 < length) {
                            c = str.charAt(i5);
                        } else {
                            c = 0;
                        }
                        if (charAt2 > 56319 || c < 56320 || c > 57343) {
                            mo70266e(63);
                            i = i5;
                        } else {
                            int i6 = (((charAt2 & 10239) << 10) | (9215 & c)) + 0;
                            mo70266e((i6 >> 18) | 240);
                            mo70266e(((i6 >> 12) & 63) | 128);
                            mo70266e(((i6 >> 6) & 63) | 128);
                            mo70266e((i6 & 63) | 128);
                            i += 2;
                        }
                    }
                    i++;
                }
            }
            return this;
        } else {
            throw new IllegalArgumentException("endIndex > string.length: " + length + " > " + str.length());
        }
    }

    /* renamed from: a */
    public final C11645jb mo70246a(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = (long) i2;
            C11661jo.m31993a((long) bArr.length, 0, j);
            int i3 = i2 + 0;
            while (i < i3) {
                C11654ji c = mo70257c(1);
                int min = Math.min(i3 - i, 8192 - c.f28094c);
                System.arraycopy(bArr, i, c.f28092a, c.f28094c, min);
                i += min;
                c.f28094c += min;
            }
            this.f28075b += j;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: a */
    public final C11645jb mo70266e(int i) {
        C11654ji c = mo70257c(1);
        byte[] bArr = c.f28092a;
        int i2 = c.f28094c;
        c.f28094c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f28075b++;
        return this;
    }

    /* renamed from: b */
    public final C11645jb mo70262d(int i) {
        int a = C11661jo.m31991a(i);
        C11654ji c = mo70257c(4);
        byte[] bArr = c.f28092a;
        int i2 = c.f28094c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((a >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((a >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((a >>> 8) & 255);
        bArr[i5] = (byte) (a & 255);
        c.f28094c = i5 + 1;
        this.f28075b += 4;
        return this;
    }

    /* renamed from: e */
    public final C11645jb mo70269f(long j) {
        long a = C11661jo.m31992a(j);
        C11654ji c = mo70257c(8);
        byte[] bArr = c.f28092a;
        int i = c.f28094c;
        int i2 = i + 1;
        bArr[i] = (byte) ((int) ((a >>> 56) & 255));
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((int) ((a >>> 48) & 255));
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((int) ((a >>> 40) & 255));
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((int) ((a >>> 32) & 255));
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((int) ((a >>> 24) & 255));
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((int) ((a >>> 16) & 255));
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((int) ((a >>> 8) & 255));
        bArr[i8] = (byte) ((int) (a & 255));
        c.f28094c = i8 + 1;
        this.f28075b += 8;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C11654ji mo70257c(int i) {
        if (i <= 0 || i > 8192) {
            throw new IllegalArgumentException();
        }
        C11654ji jiVar = this.f28074a;
        if (jiVar == null) {
            C11654ji a = C11655jj.m31975a();
            this.f28074a = a;
            a.f28098g = a;
            a.f28097f = a;
            return a;
        }
        C11654ji jiVar2 = jiVar.f28098g;
        return (jiVar2.f28094c + i > 8192 || !jiVar2.f28096e) ? jiVar2.mo70293a(C11655jj.m31975a()) : jiVar2;
    }

    /* renamed from: a */
    public final void mo70249a(C11645jb jbVar, long j) {
        C11654ji jiVar;
        if (jbVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (jbVar != this) {
            C11661jo.m31993a(jbVar.f28075b, 0, j);
            while (j > 0) {
                int i = 0;
                if (j < ((long) (jbVar.f28074a.f28094c - jbVar.f28074a.f28093b))) {
                    C11654ji jiVar2 = this.f28074a;
                    C11654ji jiVar3 = jiVar2 != null ? jiVar2.f28098g : null;
                    if (jiVar3 != null && jiVar3.f28096e) {
                        if ((((long) jiVar3.f28094c) + j) - ((long) (jiVar3.f28095d ? 0 : jiVar3.f28093b)) <= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                            jbVar.f28074a.mo70294a(jiVar3, (int) j);
                            jbVar.f28075b -= j;
                            this.f28075b += j;
                            return;
                        }
                    }
                    C11654ji jiVar4 = jbVar.f28074a;
                    int i2 = (int) j;
                    if (i2 <= 0 || i2 > jiVar4.f28094c - jiVar4.f28093b) {
                        throw new IllegalArgumentException();
                    }
                    if (i2 >= 1024) {
                        jiVar = new C11654ji(jiVar4);
                    } else {
                        jiVar = C11655jj.m31975a();
                        System.arraycopy(jiVar4.f28092a, jiVar4.f28093b, jiVar.f28092a, 0, i2);
                    }
                    jiVar.f28094c = jiVar.f28093b + i2;
                    jiVar4.f28093b += i2;
                    jiVar4.f28098g.mo70293a(jiVar);
                    jbVar.f28074a = jiVar;
                }
                C11654ji jiVar5 = jbVar.f28074a;
                long j2 = (long) (jiVar5.f28094c - jiVar5.f28093b);
                jbVar.f28074a = jiVar5.mo70292a();
                C11654ji jiVar6 = this.f28074a;
                if (jiVar6 == null) {
                    this.f28074a = jiVar5;
                    jiVar5.f28098g = jiVar5;
                    jiVar5.f28097f = jiVar5;
                } else {
                    C11654ji a = jiVar6.f28098g.mo70293a(jiVar5);
                    if (a.f28098g == a) {
                        throw new IllegalStateException();
                    } else if (a.f28098g.f28096e) {
                        int i3 = a.f28094c - a.f28093b;
                        int i4 = 8192 - a.f28098g.f28094c;
                        if (!a.f28098g.f28095d) {
                            i = a.f28098g.f28093b;
                        }
                        if (i3 <= i4 + i) {
                            a.mo70294a(a.f28098g, i3);
                            a.mo70292a();
                            C11655jj.m31976a(a);
                        }
                    }
                }
                jbVar.f28075b -= j2;
                this.f28075b += j2;
                j -= j2;
            }
        } else {
            throw new IllegalArgumentException("source == this");
        }
    }

    /* renamed from: b */
    public final long mo70250b(C11645jb jbVar, long j) {
        if (jbVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j >= 0) {
            long j2 = this.f28075b;
            if (j2 == 0) {
                return -1;
            }
            if (j > j2) {
                j = j2;
            }
            jbVar.mo70249a(this, j);
            return j;
        } else {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11645jb)) {
            return false;
        }
        C11645jb jbVar = (C11645jb) obj;
        long j = this.f28075b;
        if (j != jbVar.f28075b) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        C11654ji jiVar = this.f28074a;
        C11654ji jiVar2 = jbVar.f28074a;
        int i = jiVar.f28093b;
        int i2 = jiVar2.f28093b;
        while (j2 < this.f28075b) {
            long min = (long) Math.min(jiVar.f28094c - i, jiVar2.f28094c - i2);
            int i3 = 0;
            while (((long) i3) < min) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (jiVar.f28092a[i] != jiVar2.f28092a[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == jiVar.f28094c) {
                jiVar = jiVar.f28097f;
                i = jiVar.f28093b;
            }
            if (i2 == jiVar2.f28094c) {
                jiVar2 = jiVar2.f28097f;
                i2 = jiVar2.f28093b;
            }
            j2 += min;
        }
        return true;
    }

    public final int hashCode() {
        C11654ji jiVar = this.f28074a;
        if (jiVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = jiVar.f28094c;
            for (int i3 = jiVar.f28093b; i3 < i2; i3++) {
                i = (i * 31) + jiVar.f28092a[i3];
            }
            jiVar = jiVar.f28097f;
        } while (jiVar != this.f28074a);
        return i;
    }

    /* renamed from: i */
    public final C11645jb clone() {
        C11645jb jbVar = new C11645jb();
        if (this.f28075b == 0) {
            return jbVar;
        }
        C11654ji jiVar = new C11654ji(this.f28074a);
        jbVar.f28074a = jiVar;
        jiVar.f28098g = jiVar;
        jiVar.f28097f = jiVar;
        C11654ji jiVar2 = this.f28074a;
        while (true) {
            jiVar2 = jiVar2.f28097f;
            if (jiVar2 != this.f28074a) {
                jbVar.f28074a.f28098g.mo70293a(new C11654ji(jiVar2));
            } else {
                jbVar.f28075b = this.f28075b;
                return jbVar;
            }
        }
    }

    /* renamed from: g */
    public final long mo70271g() {
        long j;
        if (this.f28075b >= 8) {
            C11654ji jiVar = this.f28074a;
            int i = jiVar.f28093b;
            int i2 = jiVar.f28094c;
            if (i2 - i < 8) {
                j = ((((long) mo70264e()) & 4294967295L) << 32) | (4294967295L & ((long) mo70264e()));
            } else {
                byte[] bArr = jiVar.f28092a;
                int i3 = i + 1;
                int i4 = i3 + 1;
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i6 + 1;
                int i8 = i7 + 1;
                int i9 = i8 + 1;
                int i10 = i9 + 1;
                long j2 = (((long) bArr[i9]) & 255) | ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i3]) & 255) << 48) | ((((long) bArr[i4]) & 255) << 40) | ((((long) bArr[i5]) & 255) << 32) | ((((long) bArr[i6]) & 255) << 24) | ((((long) bArr[i7]) & 255) << 16) | ((((long) bArr[i8]) & 255) << 8);
                this.f28075b -= 8;
                if (i10 == i2) {
                    this.f28074a = jiVar.mo70292a();
                    C11655jj.m31976a(jiVar);
                } else {
                    jiVar.f28093b = i10;
                }
                j = j2;
            }
            return C11661jo.m31992a(j);
        }
        throw new IllegalStateException("size < 8: " + this.f28075b);
    }

    public final String toString() {
        C11648je jeVar;
        long j = this.f28075b;
        if (j <= 2147483647L) {
            int i = (int) j;
            if (i == 0) {
                jeVar = C11648je.f28077b;
            } else {
                jeVar = new C11656jk(this, i);
            }
            return jeVar.toString();
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f28075b);
    }
}
