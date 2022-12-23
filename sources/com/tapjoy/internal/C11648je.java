package com.tapjoy.internal;

import com.google.common.base.Ascii;
import java.io.Serializable;
import java.util.Arrays;

/* renamed from: com.tapjoy.internal.je */
public class C11648je implements Serializable, Comparable<C11648je> {

    /* renamed from: a */
    static final char[] f28076a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    public static final C11648je f28077b = new C11648je((byte[]) new byte[0].clone());

    /* renamed from: c */
    final byte[] f28078c;

    /* renamed from: d */
    transient int f28079d;

    /* renamed from: e */
    transient String f28080e;

    public /* synthetic */ int compareTo(Object obj) {
        C11648je jeVar = (C11648je) obj;
        int c = mo70282c();
        int c2 = jeVar.mo70282c();
        int min = Math.min(c, c2);
        for (int i = 0; i < min; i++) {
            byte a = mo70276a(i) & 255;
            byte a2 = jeVar.mo70276a(i) & 255;
            if (a != a2) {
                return a < a2 ? -1 : 1;
            }
        }
        if (c == c2) {
            return 0;
        }
        return c < c2 ? -1 : 1;
    }

    public C11648je(byte[] bArr) {
        this.f28078c = bArr;
    }

    /* renamed from: a */
    public String mo70278a() {
        String str = this.f28080e;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f28078c, C11661jo.f28106a);
        this.f28080e = str2;
        return str2;
    }

    /* renamed from: b */
    public String mo70281b() {
        byte[] bArr = this.f28078c;
        char[] cArr = new char[(bArr.length * 2)];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f28076a;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & Ascii.f18305SI];
        }
        return new String(cArr);
    }

    /* renamed from: a */
    public C11648je mo70277a(int i, int i2) {
        if (i >= 0) {
            byte[] bArr = this.f28078c;
            if (i2 <= bArr.length) {
                int i3 = i2 - i;
                if (i3 < 0) {
                    throw new IllegalArgumentException("endIndex < beginIndex");
                } else if (i == 0 && i2 == bArr.length) {
                    return this;
                } else {
                    byte[] bArr2 = new byte[i3];
                    System.arraycopy(this.f28078c, i, bArr2, 0, i3);
                    return new C11648je(bArr2);
                }
            } else {
                throw new IllegalArgumentException("endIndex > length(" + this.f28078c.length + ")");
            }
        } else {
            throw new IllegalArgumentException("beginIndex < 0");
        }
    }

    /* renamed from: a */
    public byte mo70276a(int i) {
        return this.f28078c[i];
    }

    /* renamed from: c */
    public int mo70282c() {
        return this.f28078c.length;
    }

    /* renamed from: d */
    public byte[] mo70284d() {
        return (byte[]) this.f28078c.clone();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo70279a(C11645jb jbVar) {
        byte[] bArr = this.f28078c;
        jbVar.mo70246a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public boolean mo70280a(int i, byte[] bArr, int i2, int i3) {
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.f28078c;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && C11661jo.m31995a(bArr2, i, bArr, i2, i3);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C11648je) {
            C11648je jeVar = (C11648je) obj;
            int c = jeVar.mo70282c();
            byte[] bArr = this.f28078c;
            return c == bArr.length && jeVar.mo70280a(0, bArr, 0, bArr.length);
        }
    }

    public int hashCode() {
        int i = this.f28079d;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f28078c);
        this.f28079d = hashCode;
        return hashCode;
    }

    public String toString() {
        if (this.f28078c.length == 0) {
            return "[size=0]";
        }
        String a = mo70278a();
        int length = a.length();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= length) {
                i = a.length();
                break;
            } else if (i2 == 64) {
                break;
            } else {
                int codePointAt = a.codePointAt(i);
                if ((!Character.isISOControl(codePointAt) || codePointAt == 10 || codePointAt == 13) && codePointAt != 65533) {
                    i2++;
                    i += Character.charCount(codePointAt);
                }
            }
        }
        i = -1;
        if (i != -1) {
            String replace = a.substring(0, i).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (i < a.length()) {
                return "[size=" + this.f28078c.length + " text=" + replace + "…]";
            }
            return "[text=" + replace + "]";
        } else if (this.f28078c.length <= 64) {
            return "[hex=" + mo70281b() + "]";
        } else {
            return "[size=" + this.f28078c.length + " hex=" + mo70277a(0, 64).mo70281b() + "…]";
        }
    }
}
