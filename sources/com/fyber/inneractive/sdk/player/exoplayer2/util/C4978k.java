package com.fyber.inneractive.sdk.player.exoplayer2.util;

import com.google.common.base.Ascii;
import java.nio.charset.Charset;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.k */
public final class C4978k {

    /* renamed from: a */
    public byte[] f13243a;

    /* renamed from: b */
    public int f13244b;

    /* renamed from: c */
    public int f13245c;

    public C4978k() {
    }

    /* renamed from: a */
    public void mo25516a(byte[] bArr, int i) {
        this.f13243a = bArr;
        this.f13245c = i;
        this.f13244b = 0;
    }

    /* renamed from: b */
    public int mo25518b() {
        byte[] bArr = this.f13243a;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    /* renamed from: c */
    public void mo25521c(int i) {
        mo25516a(mo25518b() < i ? new byte[i] : this.f13243a, i);
    }

    /* renamed from: d */
    public void mo25523d(int i) {
        C4965a.m15049a(i >= 0 && i <= this.f13243a.length);
        this.f13245c = i;
    }

    /* renamed from: e */
    public void mo25525e(int i) {
        C4965a.m15049a(i >= 0 && i <= this.f13245c);
        this.f13244b = i;
    }

    /* renamed from: f */
    public void mo25527f(int i) {
        mo25525e(this.f13244b + i);
    }

    /* renamed from: g */
    public int mo25528g() {
        int e = mo25524e();
        if (e >= 0) {
            return e;
        }
        throw new IllegalStateException("Top bit not zero: " + e);
    }

    /* renamed from: h */
    public int mo25529h() {
        byte[] bArr = this.f13243a;
        int i = this.f13244b;
        int i2 = i + 1;
        this.f13244b = i2;
        this.f13244b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (bArr[i] & 255);
    }

    /* renamed from: i */
    public long mo25530i() {
        byte[] bArr = this.f13243a;
        int i = this.f13244b;
        int i2 = i + 1;
        this.f13244b = i2;
        int i3 = i2 + 1;
        this.f13244b = i3;
        int i4 = i3 + 1;
        this.f13244b = i4;
        int i5 = i4 + 1;
        this.f13244b = i5;
        int i6 = i5 + 1;
        this.f13244b = i6;
        int i7 = i6 + 1;
        this.f13244b = i7;
        int i8 = i7 + 1;
        this.f13244b = i8;
        this.f13244b = i8 + 1;
        return ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i2]) & 255) << 48) | ((((long) bArr[i3]) & 255) << 40) | ((((long) bArr[i4]) & 255) << 32) | ((((long) bArr[i5]) & 255) << 24) | ((((long) bArr[i6]) & 255) << 16) | ((((long) bArr[i7]) & 255) << 8) | (((long) bArr[i8]) & 255);
    }

    /* renamed from: j */
    public String mo25531j() {
        if (mo25513a() == 0) {
            return null;
        }
        int i = this.f13244b;
        while (i < this.f13245c && this.f13243a[i] != 0) {
            i++;
        }
        byte[] bArr = this.f13243a;
        int i2 = this.f13244b;
        String str = new String(bArr, i2, i - i2);
        this.f13244b = i;
        if (i < this.f13245c) {
            this.f13244b = i + 1;
        }
        return str;
    }

    /* renamed from: k */
    public int mo25532k() {
        return (mo25533l() << 21) | (mo25533l() << 14) | (mo25533l() << 7) | mo25533l();
    }

    /* renamed from: l */
    public int mo25533l() {
        byte[] bArr = this.f13243a;
        int i = this.f13244b;
        this.f13244b = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: m */
    public long mo25534m() {
        byte[] bArr = this.f13243a;
        int i = this.f13244b;
        int i2 = i + 1;
        this.f13244b = i2;
        int i3 = i2 + 1;
        this.f13244b = i3;
        int i4 = i3 + 1;
        this.f13244b = i4;
        this.f13244b = i4 + 1;
        return ((((long) bArr[i]) & 255) << 24) | ((((long) bArr[i2]) & 255) << 16) | ((((long) bArr[i3]) & 255) << 8) | (((long) bArr[i4]) & 255);
    }

    /* renamed from: n */
    public int mo25535n() {
        byte[] bArr = this.f13243a;
        int i = this.f13244b;
        int i2 = i + 1;
        this.f13244b = i2;
        int i3 = (bArr[i] & 255) << Ascii.DLE;
        int i4 = i2 + 1;
        this.f13244b = i4;
        byte b = i3 | ((bArr[i2] & 255) << 8);
        this.f13244b = i4 + 1;
        return (bArr[i4] & 255) | b;
    }

    /* renamed from: o */
    public int mo25536o() {
        int c = mo25520c();
        if (c >= 0) {
            return c;
        }
        throw new IllegalStateException("Top bit not zero: " + c);
    }

    /* renamed from: p */
    public long mo25537p() {
        long i = mo25530i();
        if (i >= 0) {
            return i;
        }
        throw new IllegalStateException("Top bit not zero: " + i);
    }

    /* renamed from: q */
    public int mo25538q() {
        byte[] bArr = this.f13243a;
        int i = this.f13244b;
        int i2 = i + 1;
        this.f13244b = i2;
        this.f13244b = i2 + 1;
        return (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
    }

    /* renamed from: r */
    public void mo25539r() {
        this.f13244b = 0;
        this.f13245c = 0;
    }

    public C4978k(int i) {
        this.f13243a = new byte[i];
        this.f13245c = i;
    }

    /* renamed from: b */
    public String mo25519b(int i) {
        String str = new String(this.f13243a, this.f13244b, i, Charset.defaultCharset());
        this.f13244b += i;
        return str;
    }

    /* renamed from: c */
    public int mo25520c() {
        byte[] bArr = this.f13243a;
        int i = this.f13244b;
        int i2 = i + 1;
        this.f13244b = i2;
        int i3 = (bArr[i] & 255) << Ascii.CAN;
        int i4 = i2 + 1;
        this.f13244b = i4;
        byte b = i3 | ((bArr[i2] & 255) << Ascii.DLE);
        int i5 = i4 + 1;
        this.f13244b = i5;
        byte b2 = b | ((bArr[i4] & 255) << 8);
        this.f13244b = i5 + 1;
        return (bArr[i5] & 255) | b2;
    }

    /* renamed from: f */
    public long mo25526f() {
        byte[] bArr = this.f13243a;
        int i = this.f13244b;
        int i2 = i + 1;
        this.f13244b = i2;
        int i3 = i2 + 1;
        this.f13244b = i3;
        int i4 = i3 + 1;
        this.f13244b = i4;
        this.f13244b = i4 + 1;
        return (((long) bArr[i]) & 255) | ((((long) bArr[i2]) & 255) << 8) | ((((long) bArr[i3]) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24);
    }

    /* renamed from: d */
    public String mo25522d() {
        if (mo25513a() == 0) {
            return null;
        }
        int i = this.f13244b;
        while (i < this.f13245c && !C4991u.m15144b((int) this.f13243a[i])) {
            i++;
        }
        int i2 = this.f13244b;
        if (i - i2 >= 3) {
            byte[] bArr = this.f13243a;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                this.f13244b = i2 + 3;
            }
        }
        byte[] bArr2 = this.f13243a;
        int i3 = this.f13244b;
        String str = new String(bArr2, i3, i - i3);
        this.f13244b = i;
        int i4 = this.f13245c;
        if (i == i4) {
            return str;
        }
        byte[] bArr3 = this.f13243a;
        if (bArr3[i] == 13) {
            int i5 = i + 1;
            this.f13244b = i5;
            if (i5 == i4) {
                return str;
            }
        }
        int i6 = this.f13244b;
        if (bArr3[i6] == 10) {
            this.f13244b = i6 + 1;
        }
        return str;
    }

    /* renamed from: e */
    public int mo25524e() {
        byte[] bArr = this.f13243a;
        int i = this.f13244b;
        int i2 = i + 1;
        this.f13244b = i2;
        int i3 = i2 + 1;
        this.f13244b = i3;
        byte b = (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
        int i4 = i3 + 1;
        this.f13244b = i4;
        byte b2 = b | ((bArr[i3] & 255) << Ascii.DLE);
        this.f13244b = i4 + 1;
        return ((bArr[i4] & 255) << Ascii.CAN) | b2;
    }

    /* renamed from: a */
    public int mo25513a() {
        return this.f13245c - this.f13244b;
    }

    public C4978k(byte[] bArr) {
        this.f13243a = bArr;
        this.f13245c = bArr.length;
    }

    /* renamed from: a */
    public void mo25515a(C4977j jVar, int i) {
        mo25517a(jVar.f13239a, 0, i);
        jVar.mo25510b(0);
    }

    /* renamed from: a */
    public void mo25517a(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f13243a, this.f13244b, bArr, i, i2);
        this.f13244b += i2;
    }

    public C4978k(byte[] bArr, int i) {
        this.f13243a = bArr;
        this.f13245c = i;
    }

    /* renamed from: a */
    public String mo25514a(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.f13244b;
        int i3 = (i2 + i) - 1;
        String str = new String(this.f13243a, i2, (i3 >= this.f13245c || this.f13243a[i3] != 0) ? i : i - 1);
        this.f13244b += i;
        return str;
    }
}
