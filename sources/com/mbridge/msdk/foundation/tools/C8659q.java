package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import com.google.common.base.Ascii;
import java.util.HashMap;
import java.util.Map;
import okio.Utf8;

/* renamed from: com.mbridge.msdk.foundation.tools.q */
/* compiled from: SameBase64Tool */
public class C8659q {

    /* renamed from: a */
    private static final String f21198a = C8659q.class.getSimpleName();

    /* renamed from: b */
    private static Map<Character, Character> f21199b;

    /* renamed from: c */
    private static Map<Character, Character> f21200c;

    /* renamed from: d */
    private static char[] f21201d = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    /* renamed from: e */
    private static byte[] f21202e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, Utf8.REPLACEMENT_BYTE, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Ascii.f18309VT, Ascii.f18298FF, Ascii.f18296CR, Ascii.f18306SO, Ascii.f18305SI, Ascii.DLE, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.f18297EM, -1, -1, -1, -1, -1, -1, Ascii.SUB, Ascii.ESC, Ascii.f18299FS, Ascii.f18300GS, Ascii.f18304RS, Ascii.f18308US, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    static {
        f21199b = null;
        f21200c = null;
        HashMap hashMap = new HashMap();
        f21200c = hashMap;
        hashMap.put('v', 'A');
        f21200c.put('S', 'B');
        f21200c.put('o', 'C');
        f21200c.put('a', 'D');
        f21200c.put('j', 'E');
        f21200c.put('c', 'F');
        f21200c.put('7', 'G');
        f21200c.put('d', 'H');
        f21200c.put('R', 'I');
        f21200c.put('z', 'J');
        f21200c.put('p', 'K');
        f21200c.put('W', 'L');
        f21200c.put('i', 'M');
        f21200c.put('f', 'N');
        f21200c.put('G', 'O');
        f21200c.put('y', 'P');
        f21200c.put('N', 'Q');
        f21200c.put('x', 'R');
        f21200c.put('Z', 'S');
        f21200c.put('n', 'T');
        f21200c.put('V', 'U');
        f21200c.put('5', 'V');
        f21200c.put('k', 'W');
        f21200c.put('+', 'X');
        f21200c.put('D', 'Y');
        f21200c.put('H', 'Z');
        f21200c.put('L', 'a');
        f21200c.put('Y', 'b');
        f21200c.put('h', 'c');
        f21200c.put('J', 'd');
        f21200c.put('4', 'e');
        f21200c.put('6', 'f');
        f21200c.put('l', 'g');
        f21200c.put('t', 'h');
        f21200c.put('0', 'i');
        f21200c.put('U', 'j');
        f21200c.put('3', 'k');
        f21200c.put('Q', 'l');
        f21200c.put('r', 'm');
        f21200c.put('g', 'n');
        f21200c.put('E', 'o');
        f21200c.put('u', 'p');
        f21200c.put('q', 'q');
        f21200c.put('8', 'r');
        f21200c.put('s', 's');
        f21200c.put('w', 't');
        f21200c.put('/', 'u');
        f21200c.put('X', 'v');
        f21200c.put('M', 'w');
        f21200c.put('e', 'x');
        f21200c.put('B', 'y');
        f21200c.put('A', 'z');
        f21200c.put('T', '0');
        f21200c.put('2', '1');
        f21200c.put('F', '2');
        f21200c.put('b', '3');
        f21200c.put('9', '4');
        f21200c.put('P', '5');
        f21200c.put('1', '6');
        f21200c.put('O', 55);
        f21200c.put('I', '8');
        f21200c.put('K', '9');
        f21200c.put('m', '+');
        f21200c.put(67, '/');
        HashMap hashMap2 = new HashMap();
        f21199b = hashMap2;
        hashMap2.put('A', 'v');
        f21199b.put('B', 'S');
        f21199b.put(67, 'o');
        f21199b.put('D', 'a');
        f21199b.put('E', 'j');
        f21199b.put('F', 'c');
        f21199b.put(71, 55);
        f21199b.put('H', 'd');
        f21199b.put('I', 'R');
        f21199b.put('J', 'z');
        f21199b.put('K', 'p');
        f21199b.put('L', 'W');
        f21199b.put('M', 'i');
        f21199b.put('N', 'f');
        f21199b.put('O', 71);
        f21199b.put('P', 'y');
        f21199b.put('Q', 'N');
        f21199b.put('R', 'x');
        f21199b.put('S', 'Z');
        f21199b.put('T', 'n');
        f21199b.put('U', 'V');
        f21199b.put('V', '5');
        f21199b.put('W', 'k');
        f21199b.put('X', '+');
        f21199b.put('Y', 'D');
        f21199b.put('Z', 'H');
        f21199b.put('a', 'L');
        f21199b.put('b', 'Y');
        f21199b.put('c', 'h');
        f21199b.put('d', 'J');
        f21199b.put('e', '4');
        f21199b.put('f', '6');
        f21199b.put('g', 'l');
        f21199b.put('h', 't');
        f21199b.put('i', '0');
        f21199b.put('j', 'U');
        f21199b.put('k', '3');
        f21199b.put('l', 'Q');
        f21199b.put('m', 'r');
        f21199b.put('n', 'g');
        f21199b.put('o', 'E');
        f21199b.put('p', 'u');
        f21199b.put('q', 'q');
        f21199b.put('r', '8');
        f21199b.put('s', 's');
        f21199b.put('t', 'w');
        f21199b.put('u', '/');
        f21199b.put('v', 'X');
        f21199b.put('w', 'M');
        f21199b.put('x', 'e');
        f21199b.put('y', 'B');
        f21199b.put('z', 'A');
        f21199b.put('0', 'T');
        f21199b.put('1', '2');
        f21199b.put('2', 70);
        f21199b.put('3', 'b');
        f21199b.put('4', '9');
        f21199b.put('5', 'P');
        f21199b.put('6', '1');
        f21199b.put(55, 'O');
        f21199b.put('8', 'I');
        f21199b.put('9', 'K');
        f21199b.put('+', 'm');
        f21199b.put('/', 67);
    }

    private C8659q() {
    }

    /* renamed from: a */
    public static String m24801a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return C8673w.m24882b(str);
    }

    /* renamed from: b */
    public static String m24802b(String str) {
        return C8673w.m24880a(str);
    }
}
