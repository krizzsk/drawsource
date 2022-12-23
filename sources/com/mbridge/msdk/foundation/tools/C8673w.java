package com.mbridge.msdk.foundation.tools;

import com.google.common.base.Ascii;
import java.util.HashMap;
import java.util.Map;
import okio.Utf8;

/* renamed from: com.mbridge.msdk.foundation.tools.w */
/* compiled from: SameMVEncoder */
public final class C8673w {

    /* renamed from: a */
    private static Map<Character, Character> f21241a;

    /* renamed from: b */
    private static final char[] f21242b = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    /* renamed from: c */
    private static char[] f21243c = new char[f21242b.length];

    /* renamed from: d */
    private static final byte[] f21244d = new byte[128];

    static {
        HashMap hashMap = new HashMap();
        f21241a = hashMap;
        hashMap.put('A', 'v');
        f21241a.put('B', 'S');
        f21241a.put('C', 'o');
        f21241a.put('D', 'a');
        f21241a.put('E', 'j');
        f21241a.put('F', 'c');
        f21241a.put('G', '7');
        f21241a.put('H', 'd');
        f21241a.put('I', 'R');
        f21241a.put('J', 'z');
        f21241a.put('K', 'p');
        f21241a.put('L', 'W');
        f21241a.put('M', 'i');
        f21241a.put('N', 'f');
        f21241a.put('O', 'G');
        f21241a.put('P', 'y');
        f21241a.put('Q', 'N');
        f21241a.put('R', 'x');
        f21241a.put('S', 'Z');
        f21241a.put('T', 'n');
        f21241a.put('U', 'V');
        f21241a.put('V', '5');
        f21241a.put('W', 'k');
        f21241a.put('X', '+');
        f21241a.put('Y', 'D');
        f21241a.put('Z', 'H');
        f21241a.put('a', 'L');
        f21241a.put('b', 'Y');
        f21241a.put('c', 'h');
        f21241a.put('d', 'J');
        f21241a.put('e', '4');
        f21241a.put('f', '6');
        f21241a.put('g', 'l');
        f21241a.put('h', 't');
        f21241a.put('i', '0');
        f21241a.put('j', 'U');
        f21241a.put('k', '3');
        f21241a.put('l', 'Q');
        f21241a.put('m', 'r');
        f21241a.put('n', 'g');
        f21241a.put('o', 'E');
        f21241a.put('p', 'u');
        f21241a.put('q', 'q');
        f21241a.put('r', '8');
        f21241a.put('s', 's');
        f21241a.put('t', 'w');
        f21241a.put('u', '/');
        f21241a.put('v', 'X');
        f21241a.put('w', 'M');
        f21241a.put('x', 'e');
        f21241a.put('y', 'B');
        f21241a.put('z', 'A');
        f21241a.put('0', 'T');
        f21241a.put('1', '2');
        f21241a.put('2', 'F');
        f21241a.put('3', 'b');
        f21241a.put('4', '9');
        f21241a.put('5', 'P');
        f21241a.put('6', '1');
        f21241a.put(55, 'O');
        f21241a.put('8', 'I');
        f21241a.put('9', 'K');
        f21241a.put('+', 'm');
        f21241a.put('/', 67);
        int i = 0;
        int i2 = 0;
        while (true) {
            char[] cArr = f21242b;
            if (i2 >= cArr.length) {
                break;
            }
            f21243c[i2] = f21241a.get(Character.valueOf(cArr[i2])).charValue();
            i2++;
        }
        int i3 = 0;
        while (true) {
            byte[] bArr = f21244d;
            if (i3 >= bArr.length) {
                break;
            }
            bArr[i3] = Byte.MAX_VALUE;
            i3++;
        }
        while (true) {
            char[] cArr2 = f21243c;
            if (i < cArr2.length) {
                f21244d[cArr2[i]] = (byte) i;
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private static int m24879a(char[] cArr, byte[] bArr, int i) {
        try {
            boolean z = cArr[3] == '=' ? true : true;
            if (cArr[2] == '=') {
                z = true;
            }
            byte b = f21244d[cArr[0]];
            byte b2 = f21244d[cArr[1]];
            byte b3 = f21244d[cArr[2]];
            byte b4 = f21244d[cArr[3]];
            if (z) {
                bArr[i] = (byte) (((b << 2) & 252) | (3 & (b2 >> 4)));
                return 1;
            } else if (z) {
                bArr[i] = (byte) ((3 & (b2 >> 4)) | ((b << 2) & 252));
                bArr[i + 1] = (byte) (((b2 << 4) & 240) | ((b3 >> 2) & 15));
                return 2;
            } else if (z) {
                int i2 = i + 1;
                bArr[i] = (byte) (((b << 2) & 252) | ((b2 >> 4) & 3));
                bArr[i2] = (byte) (((b2 << 4) & 240) | ((b3 >> 2) & 15));
                bArr[i2 + 1] = (byte) ((b4 & Utf8.REPLACEMENT_BYTE) | ((b3 << 6) & 192));
                return 3;
            } else {
                throw new RuntimeException("Internal Error");
            }
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static String m24880a(String str) {
        byte[] c = m24883c(str);
        if (c == null || c.length <= 0) {
            return null;
        }
        return new String(c);
    }

    /* renamed from: c */
    private static byte[] m24883c(String str) {
        int i;
        try {
            int length = str.length();
            int i2 = 259;
            if (length < 259) {
                i2 = length;
            }
            char[] cArr = new char[i2];
            int i3 = ((length >> 2) * 3) + 3;
            byte[] bArr = new byte[i3];
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (i4 < length) {
                int i7 = i4 + 256;
                if (i7 <= length) {
                    str.getChars(i4, i7, cArr, i6);
                    i = i6 + 256;
                } else {
                    str.getChars(i4, length, cArr, i6);
                    i = (length - i4) + i6;
                }
                int i8 = i6;
                while (i6 < i) {
                    char c = cArr[i6];
                    if (c == '=' || (c < f21244d.length && f21244d[c] != Byte.MAX_VALUE)) {
                        int i9 = i8 + 1;
                        cArr[i8] = c;
                        if (i9 == 4) {
                            i5 += m24879a(cArr, bArr, i5);
                            i8 = 0;
                        } else {
                            i8 = i9;
                        }
                    }
                    i6++;
                }
                i4 = i7;
                i6 = i8;
            }
            if (i5 == i3) {
                return bArr;
            }
            byte[] bArr2 = new byte[i5];
            System.arraycopy(bArr, 0, bArr2, 0, i5);
            return bArr2;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m24882b(String str) {
        byte[] bytes = str.getBytes();
        return m24881a(bytes, 0, bytes.length);
    }

    /* renamed from: a */
    private static String m24881a(byte[] bArr, int i, int i2) {
        if (i2 <= 0) {
            return "";
        }
        try {
            char[] cArr = new char[(((i2 / 3) << 2) + 4)];
            int i3 = 0;
            while (i2 >= 3) {
                int i4 = ((bArr[i] & 255) << Ascii.DLE) + ((bArr[i + 1] & 255) << 8) + (bArr[i + 2] & 255);
                int i5 = i3 + 1;
                cArr[i3] = f21243c[i4 >> 18];
                int i6 = i5 + 1;
                cArr[i5] = f21243c[(i4 >> 12) & 63];
                int i7 = i6 + 1;
                cArr[i6] = f21243c[(i4 >> 6) & 63];
                i3 = i7 + 1;
                cArr[i7] = f21243c[i4 & 63];
                i += 3;
                i2 -= 3;
            }
            if (i2 == 1) {
                byte b = bArr[i] & 255;
                int i8 = i3 + 1;
                cArr[i3] = f21243c[b >> 2];
                int i9 = i8 + 1;
                cArr[i8] = f21243c[(b << 4) & 63];
                int i10 = i9 + 1;
                cArr[i9] = '=';
                i3 = i10 + 1;
                cArr[i10] = '=';
            } else if (i2 == 2) {
                int i11 = ((bArr[i] & 255) << 8) + (bArr[i + 1] & 255);
                int i12 = i3 + 1;
                cArr[i3] = f21243c[i11 >> 10];
                int i13 = i12 + 1;
                cArr[i12] = f21243c[(i11 >> 4) & 63];
                int i14 = i13 + 1;
                cArr[i13] = f21243c[(i11 << 2) & 63];
                i3 = i14 + 1;
                cArr[i14] = '=';
            }
            return new String(cArr, 0, i3);
        } catch (Exception unused) {
            return null;
        }
    }
}
