package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.k */
public final class C4745k {

    /* renamed from: a */
    public final int f12328a;

    /* renamed from: b */
    public final long[] f12329b;

    /* renamed from: c */
    public final int[] f12330c;

    /* renamed from: d */
    public final int f12331d;

    /* renamed from: e */
    public final long[] f12332e;

    /* renamed from: f */
    public final int[] f12333f;

    public C4745k(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2) {
        boolean z = true;
        C4965a.m15049a(iArr.length == jArr2.length);
        C4965a.m15049a(jArr.length == jArr2.length);
        C4965a.m15049a(iArr2.length != jArr2.length ? false : z);
        this.f12329b = jArr;
        this.f12330c = iArr;
        this.f12331d = i;
        this.f12332e = jArr2;
        this.f12333f = iArr2;
        this.f12328a = jArr.length;
    }

    /* renamed from: a */
    public int mo25199a(long j) {
        for (int b = C4991u.m15143b(this.f12332e, j, true, false); b >= 0; b--) {
            if ((this.f12333f[b] & 1) != 0) {
                return b;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public int mo25200b(long j) {
        for (int a = C4991u.m15134a(this.f12332e, j, true, false); a < this.f12332e.length; a++) {
            if ((this.f12333f[a] & 1) != 0) {
                return a;
            }
        }
        return -1;
    }
}
