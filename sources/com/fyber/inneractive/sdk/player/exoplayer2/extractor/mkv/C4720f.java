package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4657b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4672g;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.f */
public final class C4720f {

    /* renamed from: d */
    public static final long[] f12054d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    public final byte[] f12055a = new byte[8];

    /* renamed from: b */
    public int f12056b;

    /* renamed from: c */
    public int f12057c;

    /* renamed from: a */
    public long mo25181a(C4672g gVar, boolean z, boolean z2, int i) throws IOException, InterruptedException {
        if (this.f12056b == 0) {
            if (!((C4657b) gVar).mo25063b(this.f12055a, 0, 1, z)) {
                return -1;
            }
            int a = m14422a(this.f12055a[0] & 255);
            this.f12057c = a;
            if (a != -1) {
                this.f12056b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i2 = this.f12057c;
        if (i2 > i) {
            this.f12056b = 0;
            return -2;
        }
        if (i2 != 1) {
            ((C4657b) gVar).mo25063b(this.f12055a, 1, i2 - 1, false);
        }
        this.f12056b = 0;
        return m14423a(this.f12055a, this.f12057c, z2);
    }

    /* renamed from: a */
    public static int m14422a(int i) {
        int i2;
        int i3 = 0;
        do {
            long[] jArr = f12054d;
            if (i3 >= jArr.length) {
                return -1;
            }
            i2 = ((jArr[i3] & ((long) i)) > 0 ? 1 : ((jArr[i3] & ((long) i)) == 0 ? 0 : -1));
            i3++;
        } while (i2 == 0);
        return i3;
    }

    /* renamed from: a */
    public static long m14423a(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~f12054d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }
}
