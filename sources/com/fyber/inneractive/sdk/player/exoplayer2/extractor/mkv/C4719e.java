package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4657b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4672g;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4978k;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.e */
public final class C4719e {

    /* renamed from: a */
    public final C4978k f12052a = new C4978k(8);

    /* renamed from: b */
    public int f12053b;

    /* renamed from: a */
    public final long mo25180a(C4672g gVar) throws IOException, InterruptedException {
        C4657b bVar = (C4657b) gVar;
        int i = 0;
        bVar.mo25061a(this.f12052a.f13243a, 0, 1, false);
        byte b = this.f12052a.f13243a[0] & 255;
        if (b == 0) {
            return Long.MIN_VALUE;
        }
        int i2 = 128;
        int i3 = 0;
        while ((b & i2) == 0) {
            i2 >>= 1;
            i3++;
        }
        int i4 = b & (~i2);
        bVar.mo25061a(this.f12052a.f13243a, 1, i3, false);
        while (i < i3) {
            i++;
            i4 = (this.f12052a.f13243a[i] & 255) + (i4 << 8);
        }
        this.f12053b += i3 + 1;
        return (long) i4;
    }
}
