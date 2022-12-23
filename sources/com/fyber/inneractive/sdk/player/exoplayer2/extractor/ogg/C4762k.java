package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.C4815l;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4978k;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.k */
public final class C4762k {

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.k$a */
    public static final class C4763a {
        public C4763a(String str, String[] strArr, int i) {
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.k$b */
    public static final class C4764b {

        /* renamed from: a */
        public final boolean f12399a;

        public C4764b(boolean z, int i, int i2, int i3) {
            this.f12399a = z;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.k$c */
    public static final class C4765c {

        /* renamed from: a */
        public final int f12400a;

        /* renamed from: b */
        public final long f12401b;

        /* renamed from: c */
        public final int f12402c;

        /* renamed from: d */
        public final int f12403d;

        /* renamed from: e */
        public final int f12404e;

        /* renamed from: f */
        public final byte[] f12405f;

        public C4765c(long j, int i, long j2, int i2, int i3, int i4, int i5, int i6, boolean z, byte[] bArr) {
            this.f12400a = i;
            this.f12401b = j2;
            this.f12402c = i3;
            this.f12403d = i5;
            this.f12404e = i6;
            this.f12405f = bArr;
        }
    }

    /* renamed from: a */
    public static int m14547a(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    /* renamed from: a */
    public static boolean m14548a(int i, C4978k kVar, boolean z) throws C4815l {
        if (kVar.mo25513a() < 7) {
            if (z) {
                return false;
            }
            throw new C4815l("too short header: " + kVar.mo25513a());
        } else if (kVar.mo25533l() != i) {
            if (z) {
                return false;
            }
            throw new C4815l("expected header type " + Integer.toHexString(i));
        } else if (kVar.mo25533l() == 118 && kVar.mo25533l() == 111 && kVar.mo25533l() == 114 && kVar.mo25533l() == 98 && kVar.mo25533l() == 105 && kVar.mo25533l() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw new C4815l("expected characters 'vorbis'");
        }
    }
}
