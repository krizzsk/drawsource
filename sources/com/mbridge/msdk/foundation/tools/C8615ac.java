package com.mbridge.msdk.foundation.tools;

import com.google.common.base.Ascii;
import com.mbridge.msdk.foundation.tools.FastKV;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: com.mbridge.msdk.foundation.tools.ac */
/* compiled from: StringSetEncoder */
final class C8615ac implements FastKV.C8608a<Set<String>> {

    /* renamed from: a */
    static final C8615ac f21125a = new C8615ac();

    /* renamed from: a */
    public final String mo58117a() {
        return "StringSet";
    }

    /* renamed from: a */
    public final /* synthetic */ byte[] mo58118a(Object obj) {
        Set<String> set = (Set) obj;
        if (set.isEmpty()) {
            return new byte[0];
        }
        int size = set.size();
        int[] iArr = new int[size];
        String[] strArr = new String[size];
        int i = 0;
        int i2 = 0;
        for (String str : set) {
            if (str == null) {
                i += 5;
                iArr[i2] = -1;
            } else {
                int b = C8643j.m24757b(str);
                strArr[i2] = str;
                iArr[i2] = b;
                i += ((b >> 7) == 0 ? 1 : (b >> 14) == 0 ? 2 : (b >> 21) == 0 ? 3 : (b >> 28) == 0 ? 4 : 5) + b;
            }
            i2++;
        }
        C8643j jVar = new C8643j(i);
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = iArr[i3];
            int i5 = jVar.f21165b;
            int i6 = i4;
            while ((i6 & -128) != 0) {
                jVar.f21164a[i5] = (byte) ((i6 & 127) | 128);
                i6 >>>= 7;
                i5++;
            }
            jVar.f21164a[i5] = (byte) i6;
            jVar.f21165b = i5 + 1;
            if (i4 >= 0) {
                jVar.mo58133a(strArr[i3]);
            }
        }
        return jVar.f21164a;
    }

    private C8615ac() {
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo58116a(byte[] bArr, int i, int i2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (i2 > 0) {
            C8643j jVar = new C8643j(bArr, i);
            int i3 = i + i2;
            while (jVar.f21165b < i3) {
                byte[] bArr2 = jVar.f21164a;
                int i4 = jVar.f21165b;
                jVar.f21165b = i4 + 1;
                byte b = bArr2[i4];
                if ((b >> 7) != 0) {
                    byte[] bArr3 = jVar.f21164a;
                    int i5 = jVar.f21165b;
                    jVar.f21165b = i5 + 1;
                    b = (b & Byte.MAX_VALUE) | (bArr3[i5] << 7);
                    if ((b >> Ascii.f18306SO) != 0) {
                        byte[] bArr4 = jVar.f21164a;
                        int i6 = jVar.f21165b;
                        jVar.f21165b = i6 + 1;
                        b = (b & 16383) | (bArr4[i6] << Ascii.f18306SO);
                        if ((b >> Ascii.NAK) != 0) {
                            byte[] bArr5 = jVar.f21164a;
                            int i7 = jVar.f21165b;
                            jVar.f21165b = i7 + 1;
                            b = (b & 2097151) | (bArr5[i7] << Ascii.NAK);
                            if ((b >> Ascii.f18299FS) != 0) {
                                byte[] bArr6 = jVar.f21164a;
                                int i8 = jVar.f21165b;
                                jVar.f21165b = i8 + 1;
                                b = (b & 268435455) | (bArr6[i8] << Ascii.f18299FS);
                            }
                        }
                    }
                }
                linkedHashSet.add(jVar.mo58137b((int) b));
            }
            if (jVar.f21165b != i3) {
                throw new IllegalArgumentException("Invalid String set");
            }
        }
        return linkedHashSet;
    }
}
