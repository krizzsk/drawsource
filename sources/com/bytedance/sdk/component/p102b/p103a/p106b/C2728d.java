package com.bytedance.sdk.component.p102b.p103a.p106b;

import com.google.common.base.Ascii;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: com.bytedance.sdk.component.b.a.b.d */
/* compiled from: ByteString */
public class C2728d implements Serializable, Comparable<C2728d> {

    /* renamed from: a */
    static final char[] f6065a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    public static final Charset f6066b = Charset.forName("UTF-8");

    /* renamed from: c */
    public static final C2728d f6067c = m7369a(new byte[0]);

    /* renamed from: d */
    final byte[] f6068d;

    /* renamed from: e */
    transient int f6069e;

    /* renamed from: f */
    transient String f6070f;

    C2728d(byte[] bArr) {
        this.f6068d = bArr;
    }

    /* renamed from: a */
    public static C2728d m7369a(byte... bArr) {
        if (bArr != null) {
            return new C2728d((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    /* renamed from: a */
    public String mo17462a() {
        String str = this.f6070f;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f6068d, f6066b);
        this.f6070f = str2;
        return str2;
    }

    /* renamed from: b */
    public String mo17465b() {
        byte[] bArr = this.f6068d;
        char[] cArr = new char[(bArr.length * 2)];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f6065a;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & Ascii.f18305SI];
        }
        return new String(cArr);
    }

    /* renamed from: a */
    public C2728d mo17461a(int i, int i2) {
        if (i >= 0) {
            byte[] bArr = this.f6068d;
            if (i2 <= bArr.length) {
                int i3 = i2 - i;
                if (i3 < 0) {
                    throw new IllegalArgumentException("endIndex < beginIndex");
                } else if (i == 0 && i2 == bArr.length) {
                    return this;
                } else {
                    byte[] bArr2 = new byte[i3];
                    System.arraycopy(this.f6068d, i, bArr2, 0, i3);
                    return new C2728d(bArr2);
                }
            } else {
                throw new IllegalArgumentException("endIndex > length(" + this.f6068d.length + ")");
            }
        } else {
            throw new IllegalArgumentException("beginIndex < 0");
        }
    }

    /* renamed from: a */
    public byte mo17459a(int i) {
        return this.f6068d[i];
    }

    /* renamed from: c */
    public int mo17466c() {
        return this.f6068d.length;
    }

    /* renamed from: d */
    public byte[] mo17468d() {
        return (byte[]) this.f6068d.clone();
    }

    /* renamed from: a */
    public boolean mo17463a(int i, C2728d dVar, int i2, int i3) {
        return dVar.mo17464a(i2, this.f6068d, i, i3);
    }

    /* renamed from: a */
    public boolean mo17464a(int i, byte[] bArr, int i2, int i3) {
        if (i >= 0) {
            byte[] bArr2 = this.f6068d;
            return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && C2733i.m7402a(bArr2, i, bArr, i2, i3);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2728d) {
            C2728d dVar = (C2728d) obj;
            int c = dVar.mo17466c();
            byte[] bArr = this.f6068d;
            if (c == bArr.length && dVar.mo17464a(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.f6069e;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f6068d);
        this.f6069e = hashCode;
        return hashCode;
    }

    /* renamed from: a */
    public int compareTo(C2728d dVar) {
        int c = mo17466c();
        int c2 = dVar.mo17466c();
        int min = Math.min(c, c2);
        int i = 0;
        while (i < min) {
            byte a = mo17459a(i) & 255;
            byte a2 = dVar.mo17459a(i) & 255;
            if (a == a2) {
                i++;
            } else if (a < a2) {
                return -1;
            } else {
                return 1;
            }
        }
        if (c == c2) {
            return 0;
        }
        if (c < c2) {
            return -1;
        }
        return 1;
    }

    public String toString() {
        StringBuilder sb;
        if (this.f6068d.length == 0) {
            return "[size=0]";
        }
        String a = mo17462a();
        int a2 = m7368a(a, 64);
        if (a2 != -1) {
            String replace = a.substring(0, a2).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (a2 < a.length()) {
                sb = new StringBuilder();
                sb.append("[size=");
                sb.append(this.f6068d.length);
                sb.append(" text=");
                sb.append(replace);
                sb.append("…]");
            } else {
                sb = new StringBuilder();
                sb.append("[text=");
                sb.append(replace);
                sb.append("]");
            }
            return sb.toString();
        } else if (this.f6068d.length <= 64) {
            return "[hex=" + mo17465b() + "]";
        } else {
            return "[size=" + this.f6068d.length + " hex=" + mo17461a(0, 64).mo17465b() + "…]";
        }
    }

    /* renamed from: a */
    static int m7368a(String str, int i) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            if (i3 == i) {
                return i2;
            }
            int codePointAt = str.codePointAt(i2);
            if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                return -1;
            }
            i3++;
            i2 += Character.charCount(codePointAt);
        }
        return str.length();
    }
}
