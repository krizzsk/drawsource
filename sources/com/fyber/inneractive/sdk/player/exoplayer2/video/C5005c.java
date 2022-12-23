package com.fyber.inneractive.sdk.player.exoplayer2.video;

import com.fyber.inneractive.sdk.player.exoplayer2.C4815l;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4974i;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4978k;
import java.util.Collections;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.c */
public final class C5005c {

    /* renamed from: a */
    public final List<byte[]> f13341a;

    /* renamed from: b */
    public final int f13342b;

    public C5005c(List<byte[]> list, int i) {
        this.f13341a = list;
        this.f13342b = i;
    }

    /* renamed from: a */
    public static C5005c m15176a(C4978k kVar) throws C4815l {
        List list;
        try {
            kVar.mo25527f(21);
            int l = kVar.mo25533l() & 3;
            int l2 = kVar.mo25533l();
            int i = kVar.f13244b;
            int i2 = 0;
            for (int i3 = 0; i3 < l2; i3++) {
                kVar.mo25527f(1);
                int q = kVar.mo25538q();
                for (int i4 = 0; i4 < q; i4++) {
                    int q2 = kVar.mo25538q();
                    i2 += q2 + 4;
                    kVar.mo25527f(q2);
                }
            }
            kVar.mo25525e(i);
            byte[] bArr = new byte[i2];
            int i5 = 0;
            for (int i6 = 0; i6 < l2; i6++) {
                kVar.mo25527f(1);
                int q3 = kVar.mo25538q();
                for (int i7 = 0; i7 < q3; i7++) {
                    int q4 = kVar.mo25538q();
                    byte[] bArr2 = C4974i.f13222a;
                    System.arraycopy(bArr2, 0, bArr, i5, bArr2.length);
                    int length = i5 + bArr2.length;
                    System.arraycopy(kVar.f13243a, kVar.f13244b, bArr, length, q4);
                    i5 = length + q4;
                    kVar.mo25527f(q4);
                }
            }
            if (i2 == 0) {
                list = null;
            } else {
                list = Collections.singletonList(bArr);
            }
            return new C5005c(list, l + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new C4815l("Error parsing HEVC config", e);
        }
    }
}
