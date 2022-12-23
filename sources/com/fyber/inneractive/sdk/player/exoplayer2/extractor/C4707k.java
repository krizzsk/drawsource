package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.google.android.exoplayer2.audio.OpusUtil;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.k */
public final class C4707k {

    /* renamed from: h */
    public static final String[] f11930h = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: i */
    public static final int[] f11931i = {44100, OpusUtil.SAMPLE_RATE, 32000};

    /* renamed from: j */
    public static final int[] f11932j = {32, 64, 96, 128, 160, 192, 224, 256, 288, 320, 352, 384, 416, 448};

    /* renamed from: k */
    public static final int[] f11933k = {32, 48, 56, 64, 80, 96, 112, 128, 144, 160, 176, 192, 224, 256};

    /* renamed from: l */
    public static final int[] f11934l = {32, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384};

    /* renamed from: m */
    public static final int[] f11935m = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320};

    /* renamed from: n */
    public static final int[] f11936n = {8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160};

    /* renamed from: a */
    public int f11937a;

    /* renamed from: b */
    public String f11938b;

    /* renamed from: c */
    public int f11939c;

    /* renamed from: d */
    public int f11940d;

    /* renamed from: e */
    public int f11941e;

    /* renamed from: f */
    public int f11942f;

    /* renamed from: g */
    public int f11943g;

    /* renamed from: a */
    public static int m14390a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if ((i & -2097152) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = f11931i[i5];
        if (i2 == 2) {
            i7 /= 2;
        } else if (i2 == 0) {
            i7 /= 4;
        }
        int i8 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? f11932j[i4 - 1] : f11933k[i4 - 1]) * 12000) / i7) + i8) * 4;
        }
        if (i2 == 3) {
            i6 = i3 == 2 ? f11934l[i4 - 1] : f11935m[i4 - 1];
        } else {
            i6 = f11936n[i4 - 1];
        }
        int i9 = 144000;
        if (i2 == 3) {
            return ((i6 * 144000) / i7) + i8;
        }
        if (i3 == 1) {
            i9 = DefaultOggSeeker.MATCH_RANGE;
        }
        return ((i9 * i6) / i7) + i8;
    }

    /* renamed from: a */
    public static boolean m14391a(int i, C4707k kVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        if ((i & -2097152) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        int i10 = f11931i[i5];
        int i11 = 2;
        if (i2 == 2) {
            i10 /= 2;
        } else if (i2 == 0) {
            i10 /= 4;
        }
        int i12 = (i >>> 9) & 1;
        int i13 = 1152;
        if (i3 == 3) {
            i7 = i2 == 3 ? f11932j[i4 - 1] : f11933k[i4 - 1];
            i13 = 384;
            i6 = (((i7 * 12000) / i10) + i12) * 4;
        } else {
            int i14 = 144000;
            if (i2 == 3) {
                i8 = i3 == 2 ? f11934l[i4 - 1] : f11935m[i4 - 1];
                i9 = (144000 * i8) / i10;
            } else {
                i8 = f11936n[i4 - 1];
                if (i3 == 1) {
                    i13 = 576;
                }
                if (i3 == 1) {
                    i14 = DefaultOggSeeker.MATCH_RANGE;
                }
                i9 = (i14 * i8) / i10;
            }
            i6 = i12 + i9;
        }
        String str = f11930h[3 - i3];
        if (((i >> 6) & 3) == 3) {
            i11 = 1;
        }
        kVar.f11937a = i2;
        kVar.f11938b = str;
        kVar.f11939c = i6;
        kVar.f11940d = i10;
        kVar.f11941e = i11;
        kVar.f11942f = i7 * 1000;
        kVar.f11943g = i13;
        return true;
    }
}
