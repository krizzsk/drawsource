package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.g */
public final class C4635g {

    /* renamed from: a */
    public final int f11594a;

    /* renamed from: b */
    public final int f11595b;

    /* renamed from: c */
    public final int f11596c;

    /* renamed from: d */
    public final int f11597d;

    /* renamed from: e */
    public final int f11598e;

    /* renamed from: f */
    public final short[] f11599f;

    /* renamed from: g */
    public int f11600g;

    /* renamed from: h */
    public short[] f11601h;

    /* renamed from: i */
    public int f11602i;

    /* renamed from: j */
    public short[] f11603j;

    /* renamed from: k */
    public int f11604k;

    /* renamed from: l */
    public short[] f11605l;

    /* renamed from: m */
    public int f11606m = 0;

    /* renamed from: n */
    public int f11607n = 0;

    /* renamed from: o */
    public float f11608o = 1.0f;

    /* renamed from: p */
    public float f11609p = 1.0f;

    /* renamed from: q */
    public int f11610q;

    /* renamed from: r */
    public int f11611r;

    /* renamed from: s */
    public int f11612s;

    /* renamed from: t */
    public int f11613t;

    /* renamed from: u */
    public int f11614u = 0;

    /* renamed from: v */
    public int f11615v;

    /* renamed from: w */
    public int f11616w;

    /* renamed from: x */
    public int f11617x;

    public C4635g(int i, int i2) {
        this.f11594a = i;
        this.f11595b = i2;
        this.f11596c = i / 400;
        int i3 = i / 65;
        this.f11597d = i3;
        int i4 = i3 * 2;
        this.f11598e = i4;
        this.f11599f = new short[i4];
        this.f11600g = i4;
        int i5 = i2 * i4;
        this.f11601h = new short[i5];
        this.f11602i = i4;
        this.f11603j = new short[i5];
        this.f11604k = i4;
        this.f11605l = new short[i5];
    }

    /* renamed from: a */
    public final void mo25022a(int i) {
        int i2 = this.f11610q + i;
        int i3 = this.f11600g;
        if (i2 > i3) {
            int i4 = i3 + (i3 / 2) + i;
            this.f11600g = i4;
            this.f11601h = Arrays.copyOf(this.f11601h, i4 * this.f11595b);
        }
    }

    /* renamed from: b */
    public final void mo25024b(int i) {
        int i2 = this.f11611r + i;
        int i3 = this.f11602i;
        if (i2 > i3) {
            int i4 = i3 + (i3 / 2) + i;
            this.f11602i = i4;
            this.f11603j = Arrays.copyOf(this.f11603j, i4 * this.f11595b);
        }
    }

    /* renamed from: a */
    public final void mo25023a(short[] sArr, int i, int i2) {
        mo25024b(i2);
        int i3 = this.f11595b;
        System.arraycopy(sArr, i * i3, this.f11603j, this.f11611r * i3, i3 * i2);
        this.f11611r += i2;
    }

    /* renamed from: b */
    public final void mo25025b(short[] sArr, int i, int i2) {
        int i3 = this.f11598e / i2;
        int i4 = this.f11595b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f11599f[i7] = (short) (i8 / i5);
        }
    }

    /* renamed from: a */
    public final int mo25020a(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f11595b;
        int i5 = 1;
        int i6 = 255;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                short s = sArr[i4 + i10];
                short s2 = sArr[i4 + i2 + i10];
                i9 += s >= s2 ? s - s2 : s2 - s;
            }
            if (i9 * i7 < i5 * i2) {
                i7 = i2;
                i5 = i9;
            }
            if (i9 * i6 > i8 * i2) {
                i6 = i2;
                i8 = i9;
            }
            i2++;
        }
        this.f11616w = i5 / i7;
        this.f11617x = i8 / i6;
        return i7;
    }

    /* renamed from: a */
    public final void mo25021a() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = this.f11611r;
        float f = this.f11608o / this.f11609p;
        double d = (double) f;
        int i9 = 1;
        if (d > 1.00001d || d < 0.99999d) {
            int i10 = this.f11610q;
            if (i10 >= this.f11598e) {
                int i11 = 0;
                while (true) {
                    int i12 = this.f11613t;
                    if (i12 > 0) {
                        int min = Math.min(this.f11598e, i12);
                        mo25023a(this.f11601h, i11, min);
                        this.f11613t -= min;
                        i11 += min;
                    } else {
                        short[] sArr = this.f11601h;
                        int i13 = this.f11594a;
                        int i14 = i13 > 4000 ? i13 / TTAdSdk.INIT_LOCAL_FAIL_CODE : i9;
                        if (this.f11595b == i9 && i14 == i9) {
                            i5 = mo25020a(sArr, i11, this.f11596c, this.f11597d);
                        } else {
                            mo25025b(sArr, i11, i14);
                            int a = mo25020a(this.f11599f, 0, this.f11596c / i14, this.f11597d / i14);
                            if (i14 != i9) {
                                int i15 = a * i14;
                                int i16 = i14 * 4;
                                int i17 = i15 - i16;
                                int i18 = i15 + i16;
                                int i19 = this.f11596c;
                                if (i17 < i19) {
                                    i17 = i19;
                                }
                                int i20 = this.f11597d;
                                if (i18 > i20) {
                                    i18 = i20;
                                }
                                if (this.f11595b == i9) {
                                    i5 = mo25020a(sArr, i11, i17, i18);
                                } else {
                                    mo25025b(sArr, i11, i9);
                                    i5 = mo25020a(this.f11599f, 0, i17, i18);
                                }
                            } else {
                                i5 = a;
                            }
                        }
                        int i21 = this.f11616w;
                        int i22 = ((i21 == 0 || this.f11614u == 0 || this.f11617x > i21 * 3 || i21 * 2 <= this.f11615v * 3) ? 0 : i9) != 0 ? this.f11614u : i5;
                        this.f11615v = i21;
                        this.f11614u = i5;
                        if (d > 1.0d) {
                            short[] sArr2 = this.f11601h;
                            if (f >= 2.0f) {
                                i7 = (int) (((float) i22) / (f - 1.0f));
                            } else {
                                this.f11613t = (int) ((((float) i22) * (2.0f - f)) / (f - 1.0f));
                                i7 = i22;
                            }
                            mo25024b(i7);
                            int i23 = i7;
                            m14185a(i7, this.f11595b, this.f11603j, this.f11611r, sArr2, i11, sArr2, i11 + i22);
                            this.f11611r += i23;
                            i11 += i22 + i23;
                        } else {
                            int i24 = i22;
                            short[] sArr3 = this.f11601h;
                            if (f < 0.5f) {
                                i6 = (int) ((((float) i24) * f) / (1.0f - f));
                            } else {
                                this.f11613t = (int) ((((float) i24) * ((2.0f * f) - 1.0f)) / (1.0f - f));
                                i6 = i24;
                            }
                            int i25 = i24 + i6;
                            mo25024b(i25);
                            int i26 = this.f11595b;
                            System.arraycopy(sArr3, i11 * i26, this.f11603j, this.f11611r * i26, i26 * i24);
                            m14185a(i6, this.f11595b, this.f11603j, this.f11611r + i24, sArr3, i24 + i11, sArr3, i11);
                            this.f11611r += i25;
                            i11 += i6;
                        }
                    }
                    if (this.f11598e + i11 > i10) {
                        break;
                    }
                    i9 = 1;
                }
                int i27 = this.f11610q - i11;
                short[] sArr4 = this.f11601h;
                int i28 = this.f11595b;
                System.arraycopy(sArr4, i11 * i28, sArr4, 0, i28 * i27);
                this.f11610q = i27;
            }
        } else {
            mo25023a(this.f11601h, 0, this.f11610q);
            this.f11610q = 0;
        }
        float f2 = this.f11609p;
        if (f2 != 1.0f && this.f11611r != i8) {
            int i29 = this.f11594a;
            int i30 = (int) (((float) i29) / f2);
            while (true) {
                if (i30 <= 16384 && i29 <= 16384) {
                    break;
                }
                i30 /= 2;
                i29 /= 2;
            }
            int i31 = this.f11611r - i8;
            int i32 = this.f11612s + i31;
            int i33 = this.f11604k;
            if (i32 > i33) {
                int i34 = i33 + (i33 / 2) + i31;
                this.f11604k = i34;
                this.f11605l = Arrays.copyOf(this.f11605l, i34 * this.f11595b);
            }
            short[] sArr5 = this.f11603j;
            int i35 = this.f11595b;
            System.arraycopy(sArr5, i8 * i35, this.f11605l, this.f11612s * i35, i35 * i31);
            this.f11611r = i8;
            this.f11612s += i31;
            int i36 = 0;
            while (true) {
                i = this.f11612s;
                i2 = i - 1;
                if (i36 >= i2) {
                    break;
                }
                while (true) {
                    i3 = this.f11606m + 1;
                    int i37 = i3 * i30;
                    i4 = this.f11607n;
                    if (i37 <= i4 * i29) {
                        break;
                    }
                    mo25024b(1);
                    int i38 = 0;
                    while (true) {
                        int i39 = this.f11595b;
                        if (i38 >= i39) {
                            break;
                        }
                        short[] sArr6 = this.f11605l;
                        int i40 = (i36 * i39) + i38;
                        short s = sArr6[i40];
                        short s2 = sArr6[i40 + i39];
                        int i41 = this.f11606m;
                        int i42 = i41 * i30;
                        int i43 = (i41 + 1) * i30;
                        int i44 = i43 - (this.f11607n * i29);
                        int i45 = i43 - i42;
                        this.f11603j[(this.f11611r * i39) + i38] = (short) (((s * i44) + ((i45 - i44) * s2)) / i45);
                        i38++;
                    }
                    this.f11607n++;
                    this.f11611r++;
                }
                this.f11606m = i3;
                if (i3 == i29) {
                    this.f11606m = 0;
                    C4965a.m15051b(i4 == i30);
                    this.f11607n = 0;
                }
                i36++;
            }
            if (i2 != 0) {
                short[] sArr7 = this.f11605l;
                int i46 = this.f11595b;
                System.arraycopy(sArr7, i2 * i46, sArr7, 0, (i - i2) * i46);
                this.f11612s -= i2;
            }
        }
    }

    /* renamed from: a */
    public static void m14185a(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr2[i9] * (i - i10)) + (sArr3[i8] * i10)) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }
}
