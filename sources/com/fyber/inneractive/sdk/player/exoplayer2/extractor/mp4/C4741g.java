package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import android.support.p003v4.media.session.PlaybackStateCompat;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4657b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4672g;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4978k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.g */
public final class C4741g {

    /* renamed from: a */
    public static final int[] f12296a = {C4991u.m15133a("isom"), C4991u.m15133a("iso2"), C4991u.m15133a("iso3"), C4991u.m15133a("iso4"), C4991u.m15133a("iso5"), C4991u.m15133a("iso6"), C4991u.m15133a("avc1"), C4991u.m15133a("hvc1"), C4991u.m15133a("hev1"), C4991u.m15133a("mp41"), C4991u.m15133a("mp42"), C4991u.m15133a("3g2a"), C4991u.m15133a("3g2b"), C4991u.m15133a("3gr6"), C4991u.m15133a("3gs6"), C4991u.m15133a("3ge6"), C4991u.m15133a("3gg6"), C4991u.m15133a("M4V "), C4991u.m15133a("M4A "), C4991u.m15133a("f4v "), C4991u.m15133a("kddi"), C4991u.m15133a("M4VP"), C4991u.m15133a("qt  "), C4991u.m15133a("MSNV")};

    /* renamed from: a */
    public static boolean m14492a(C4672g gVar, boolean z) throws IOException, InterruptedException {
        boolean z2;
        boolean z3;
        boolean z4;
        C4657b bVar = (C4657b) gVar;
        long j = bVar.f11669b;
        if (j == -1 || j > PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            j = 4096;
        }
        int i = (int) j;
        C4978k kVar = new C4978k(64);
        int i2 = 0;
        boolean z5 = false;
        while (true) {
            if (i2 >= i) {
                break;
            }
            kVar.mo25521c(8);
            bVar.mo25061a(kVar.f13243a, 0, 8, false);
            long m = kVar.mo25534m();
            int c = kVar.mo25520c();
            int i3 = 16;
            if (m == 1) {
                bVar.mo25061a(kVar.f13243a, 8, 8, false);
                kVar.mo25523d(16);
                m = kVar.mo25537p();
            } else {
                i3 = 8;
            }
            long j2 = (long) i3;
            if (m < j2) {
                return false;
            }
            i2 += i3;
            if (c != C4726a.f12089C) {
                if (c == C4726a.f12107L || c == C4726a.f12111N) {
                    z2 = true;
                    z3 = true;
                } else if ((((long) i2) + m) - j2 >= ((long) i)) {
                    break;
                } else {
                    int i4 = (int) (m - j2);
                    i2 += i4;
                    if (c == C4726a.f12127b) {
                        if (i4 < 8) {
                            return false;
                        }
                        kVar.mo25521c(i4);
                        bVar.mo25061a(kVar.f13243a, 0, i4, false);
                        int i5 = i4 / 4;
                        int i6 = 0;
                        while (true) {
                            if (i6 >= i5) {
                                break;
                            }
                            if (i6 == 1) {
                                kVar.mo25527f(4);
                            } else {
                                int c2 = kVar.mo25520c();
                                if ((c2 >>> 8) != C4991u.m15133a("3gp")) {
                                    int[] iArr = f12296a;
                                    int length = iArr.length;
                                    int i7 = 0;
                                    while (true) {
                                        if (i7 >= length) {
                                            z4 = false;
                                            break;
                                        } else if (iArr[i7] == c2) {
                                            break;
                                        } else {
                                            i7++;
                                        }
                                    }
                                }
                                z4 = true;
                                if (z4) {
                                    z5 = true;
                                    break;
                                }
                            }
                            i6++;
                        }
                        if (!z5) {
                            return false;
                        }
                    } else if (i4 != 0) {
                        bVar.mo25060a(i4, false);
                    }
                }
            }
        }
        z2 = true;
        z3 = false;
        if (!z5 || z != z3) {
            return false;
        }
        return z2;
    }
}
