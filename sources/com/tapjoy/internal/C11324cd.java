package com.tapjoy.internal;

/* renamed from: com.tapjoy.internal.cd */
public final class C11324cd {

    /* renamed from: a */
    private final String[] f27013a = new String[512];

    /* renamed from: a */
    private static boolean m31028a(String str, char[] cArr, int i, int i2) {
        if (str.length() != i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (cArr[i + i3] != str.charAt(i3)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final String mo69774a(char[] cArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = i; i4 < i + i2; i4++) {
            i3 = (i3 * 31) + cArr[i4];
        }
        int i5 = i3 ^ ((i3 >>> 20) ^ (i3 >>> 12));
        String[] strArr = this.f27013a;
        int length = (i5 ^ ((i5 >>> 7) ^ (i5 >>> 4))) & (strArr.length - 1);
        String str = strArr[length];
        if (str != null && m31028a(str, cArr, i, i2)) {
            return str;
        }
        String str2 = new String(cArr, i, i2);
        this.f27013a[length] = str2;
        return str2;
    }
}
