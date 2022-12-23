package com.mbridge.msdk.foundation.tools;

import android.os.Build;
import com.google.common.base.Ascii;
import java.nio.charset.StandardCharsets;
import okio.Utf8;

/* renamed from: com.mbridge.msdk.foundation.tools.j */
/* compiled from: FastBuffer */
public final class C8643j {

    /* renamed from: a */
    public byte[] f21164a;

    /* renamed from: b */
    public int f21165b;

    /* renamed from: c */
    private char[] f21166c;

    public C8643j(int i) {
        this(new byte[i], 0);
    }

    public C8643j(byte[] bArr) {
        this(bArr, 0);
    }

    public C8643j(byte[] bArr, int i) {
        this.f21166c = null;
        this.f21164a = bArr;
        this.f21165b = i;
    }

    /* renamed from: a */
    public final byte mo58127a() {
        byte[] bArr = this.f21164a;
        int i = this.f21165b;
        this.f21165b = i + 1;
        return bArr[i];
    }

    /* renamed from: a */
    public final void mo58128a(byte b) {
        byte[] bArr = this.f21164a;
        int i = this.f21165b;
        this.f21165b = i + 1;
        bArr[i] = b;
    }

    /* renamed from: b */
    public final short mo58138b() {
        byte[] bArr = this.f21164a;
        int i = this.f21165b;
        int i2 = i + 1;
        this.f21165b = i2;
        this.f21165b = i2 + 1;
        return (short) ((bArr[i2] << 8) | (bArr[i] & 255));
    }

    /* renamed from: a */
    public final void mo58134a(short s) {
        byte[] bArr = this.f21164a;
        int i = this.f21165b;
        int i2 = i + 1;
        this.f21165b = i2;
        bArr[i] = (byte) s;
        this.f21165b = i2 + 1;
        bArr[i2] = (byte) (s >> 8);
    }

    /* renamed from: c */
    public final int mo58139c() {
        byte[] bArr = this.f21164a;
        int i = this.f21165b;
        int i2 = i + 1;
        this.f21165b = i2;
        int i3 = i2 + 1;
        this.f21165b = i3;
        byte b = (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
        int i4 = i3 + 1;
        this.f21165b = i4;
        byte b2 = b | ((bArr[i3] & 255) << Ascii.DLE);
        this.f21165b = i4 + 1;
        return (bArr[i4] << Ascii.CAN) | b2;
    }

    /* renamed from: a */
    public final void mo58129a(int i) {
        byte[] bArr = this.f21164a;
        int i2 = this.f21165b;
        int i3 = i2 + 1;
        this.f21165b = i3;
        bArr[i2] = (byte) i;
        int i4 = i3 + 1;
        this.f21165b = i4;
        bArr[i3] = (byte) (i >> 8);
        int i5 = i4 + 1;
        this.f21165b = i5;
        bArr[i4] = (byte) (i >> 16);
        this.f21165b = i5 + 1;
        bArr[i5] = (byte) (i >> 24);
    }

    /* renamed from: a */
    public final void mo58130a(int i, int i2) {
        byte[] bArr = this.f21164a;
        int i3 = i + 1;
        bArr[i] = (byte) i2;
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i2 >> 8);
        bArr[i4] = (byte) (i2 >> 16);
        bArr[i4 + 1] = (byte) (i2 >> 24);
    }

    /* renamed from: a */
    public final void mo58131a(int i, long j) {
        byte[] bArr = this.f21164a;
        int i2 = i + 1;
        bArr[i] = (byte) ((int) j);
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((int) (j >> 8));
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((int) (j >> 16));
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((int) (j >> 24));
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((int) (j >> 32));
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((int) (j >> 40));
        bArr[i7] = (byte) ((int) (j >> 48));
        bArr[i7 + 1] = (byte) ((int) (j >> 56));
    }

    /* renamed from: a */
    public final void mo58132a(long j) {
        mo58131a(this.f21165b, j);
        this.f21165b += 8;
    }

    /* renamed from: c */
    private long m24758c(int i) {
        byte[] bArr = this.f21164a;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        int i5 = i4 + 1;
        int i6 = i5 + 1;
        int i7 = i6 + 1;
        return (((long) bArr[i]) & 255) | ((((long) bArr[i2]) & 255) << 8) | ((((long) bArr[i3]) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24) | ((((long) bArr[i5]) & 255) << 32) | ((((long) bArr[i6]) & 255) << 40) | ((255 & ((long) bArr[i7])) << 48) | (((long) bArr[i7 + 1]) << 56);
    }

    /* renamed from: d */
    public final long mo58140d() {
        long c = m24758c(this.f21165b);
        this.f21165b += 8;
        return c;
    }

    /* renamed from: a */
    public final void mo58135a(byte[] bArr) {
        int length = bArr.length;
        if (length > 0) {
            System.arraycopy(bArr, 0, this.f21164a, this.f21165b, length);
            this.f21165b += length;
        }
    }

    /* renamed from: a */
    public final void mo58133a(String str) {
        if (str != null && !str.isEmpty()) {
            byte[] bArr = this.f21164a;
            int i = this.f21165b;
            int i2 = 0;
            int length = str.length();
            while (i2 < length) {
                int i3 = i2 + 1;
                char charAt = str.charAt(i2);
                if (charAt < 128) {
                    bArr[i] = (byte) charAt;
                    i2 = i3;
                    i++;
                } else if (charAt < 2048) {
                    int i4 = i + 1;
                    bArr[i] = (byte) ((charAt >>> 6) | 192);
                    i = i4 + 1;
                    bArr[i4] = (byte) ((charAt & '?') | 128);
                    i2 = i3;
                } else if (charAt < 55296 || charAt > 57343) {
                    int i5 = i + 1;
                    bArr[i] = (byte) ((charAt >>> 12) | 224);
                    int i6 = i5 + 1;
                    bArr[i5] = (byte) (((charAt >>> 6) & 63) | 128);
                    bArr[i6] = (byte) ((charAt & '?') | 128);
                    i2 = i3;
                    i = i6 + 1;
                } else {
                    int i7 = i3 + 1;
                    int charAt2 = ((charAt << 10) + str.charAt(i3)) - 56613888;
                    int i8 = i + 1;
                    bArr[i] = (byte) ((charAt2 >>> 18) | 240);
                    int i9 = i8 + 1;
                    bArr[i8] = (byte) (((charAt2 >>> 12) & 63) | 128);
                    int i10 = i9 + 1;
                    bArr[i9] = (byte) (((charAt2 >>> 6) & 63) | 128);
                    i = i10 + 1;
                    bArr[i10] = (byte) ((charAt2 & 63) | 128);
                    i2 = i7;
                }
            }
            this.f21165b = i;
        }
    }

    /* renamed from: b */
    public static int m24757b(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            char charAt = str.charAt(i);
            if (charAt < 128) {
                i2++;
            } else if (charAt < 2048) {
                i2 += 2;
            } else if (charAt < 55296 || charAt > 57343) {
                i2 += 3;
            } else {
                i3++;
                i2 += 4;
            }
            i = i3;
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final long mo58136b(int i, int i2) {
        long j = 0;
        if (i2 <= 0) {
            return 0;
        }
        int i3 = i2 >> 3;
        int i4 = i2 & 7;
        int i5 = 0;
        int i6 = i;
        for (int i7 = 0; i7 < i3; i7++) {
            j ^= m24758c(i6);
            i6 += 8;
        }
        int i8 = i4 << 3;
        while (i5 < i8) {
            j ^= (((long) this.f21164a[i6]) & 255) << i5;
            i5 += 8;
            i6++;
        }
        int i9 = (i & 7) << 3;
        return (j >>> (64 - i9)) | (j << i9);
    }

    /* renamed from: b */
    public final String mo58137b(int i) {
        String str;
        if (i < 0) {
            return null;
        }
        if (i == 0) {
            return "";
        }
        if (i <= 2048) {
            char[] cArr = this.f21166c;
            if (cArr == null) {
                if (i <= 256) {
                    this.f21166c = new char[256];
                } else {
                    this.f21166c = new char[2048];
                }
            } else if (cArr.length < i) {
                this.f21166c = new char[2048];
            }
            char[] cArr2 = this.f21166c;
            byte[] bArr = this.f21164a;
            int i2 = this.f21165b;
            int i3 = i2 + i;
            int i4 = 0;
            while (i2 < i3) {
                int i5 = i2 + 1;
                byte b = bArr[i2];
                if (b > 0) {
                    cArr2[i4] = (char) b;
                    i2 = i5;
                    i4++;
                } else if (b < -32) {
                    cArr2[i4] = (char) (((b & Ascii.f18308US) << 6) | (bArr[i5] & Utf8.REPLACEMENT_BYTE));
                    i2 = i5 + 1;
                    i4++;
                } else if (b < -16) {
                    int i6 = i5 + 1;
                    cArr2[i4] = (char) (((b & Ascii.f18305SI) << Ascii.f18298FF) | ((bArr[i5] & Utf8.REPLACEMENT_BYTE) << 6) | (bArr[i6] & Utf8.REPLACEMENT_BYTE));
                    i2 = i6 + 1;
                    i4++;
                } else {
                    int i7 = i5 + 1;
                    int i8 = i7 + 1;
                    byte b2 = ((b & 7) << Ascii.DC2) | ((bArr[i5] & Utf8.REPLACEMENT_BYTE) << Ascii.f18298FF) | ((bArr[i7] & Utf8.REPLACEMENT_BYTE) << 6) | (bArr[i8] & Utf8.REPLACEMENT_BYTE);
                    int i9 = i4 + 1;
                    cArr2[i4] = (char) ((b2 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                    i4 = i9 + 1;
                    cArr2[i9] = (char) ((b2 & 1023) + Utf8.LOG_SURROGATE_HEADER);
                    i2 = i8 + 1;
                }
            }
            if (i2 <= i3) {
                str = new String(cArr2, 0, i4);
            } else {
                throw new IllegalArgumentException("Invalid String");
            }
        } else if (Build.VERSION.SDK_INT >= 19) {
            str = new String(this.f21164a, this.f21165b, i, StandardCharsets.UTF_8);
        } else {
            str = new String(this.f21164a, this.f21165b, i);
        }
        this.f21165b += i;
        return str;
    }
}
