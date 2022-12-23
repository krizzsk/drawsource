package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.util.Pair;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.OpusUtil;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.c */
public final class C4968c {

    /* renamed from: a */
    public static final byte[] f13212a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final int[] f13213b = {96000, 88200, 64000, OpusUtil.SAMPLE_RATE, 44100, 32000, 24000, 22050, AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, 12000, 11025, 8000, 7350};

    /* renamed from: c */
    public static final int[] f13214c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: a */
    public static Pair<Integer, Integer> m15056a(byte[] bArr) {
        C4977j jVar = new C4977j(bArr, bArr.length);
        int a = jVar.mo25508a(5);
        if (a == 31) {
            a = jVar.mo25508a(6) + 32;
        }
        int a2 = m15055a(jVar);
        int a3 = jVar.mo25508a(4);
        if (a == 5 || a == 29) {
            a2 = m15055a(jVar);
            int a4 = jVar.mo25508a(5);
            if (a4 == 31) {
                a4 = jVar.mo25508a(6) + 32;
            }
            if (a4 == 22) {
                a3 = jVar.mo25508a(4);
            }
        }
        int i = f13214c[a3];
        C4965a.m15049a(i != -1);
        return Pair.create(Integer.valueOf(a2), Integer.valueOf(i));
    }

    /* renamed from: a */
    public static int m15055a(C4977j jVar) {
        int a = jVar.mo25508a(4);
        if (a == 15) {
            return jVar.mo25508a(24);
        }
        C4965a.m15049a(a < 13);
        return f13213b[a];
    }
}
