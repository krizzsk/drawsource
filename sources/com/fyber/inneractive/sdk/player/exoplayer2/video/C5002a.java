package com.fyber.inneractive.sdk.player.exoplayer2.video;

import com.fyber.inneractive.sdk.player.exoplayer2.C4815l;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4968c;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4974i;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4978k;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.a */
public final class C5002a {

    /* renamed from: a */
    public final List<byte[]> f13331a;

    /* renamed from: b */
    public final int f13332b;

    /* renamed from: c */
    public final int f13333c;

    /* renamed from: d */
    public final int f13334d;

    /* renamed from: e */
    public final float f13335e;

    public C5002a(List<byte[]> list, int i, int i2, int i3, float f) {
        this.f13331a = list;
        this.f13332b = i;
        this.f13333c = i2;
        this.f13334d = i3;
        this.f13335e = f;
    }

    /* renamed from: a */
    public static byte[] m15174a(C4978k kVar) {
        int q = kVar.mo25538q();
        int i = kVar.f13244b;
        kVar.mo25527f(q);
        byte[] bArr = kVar.f13243a;
        byte[] bArr2 = C4968c.f13212a;
        byte[] bArr3 = new byte[(bArr2.length + q)];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, bArr2.length, q);
        return bArr3;
    }

    /* renamed from: b */
    public static C5002a m15175b(C4978k kVar) throws C4815l {
        float f;
        int i;
        int i2;
        try {
            kVar.mo25527f(4);
            int l = (kVar.mo25533l() & 3) + 1;
            if (l != 3) {
                ArrayList arrayList = new ArrayList();
                int l2 = kVar.mo25533l() & 31;
                for (int i3 = 0; i3 < l2; i3++) {
                    arrayList.add(m15174a(kVar));
                }
                int l3 = kVar.mo25533l();
                for (int i4 = 0; i4 < l3; i4++) {
                    arrayList.add(m15174a(kVar));
                }
                if (l2 > 0) {
                    C4974i.C4976b b = C4974i.m15071b((byte[]) arrayList.get(0), l, ((byte[]) arrayList.get(0)).length);
                    int i5 = b.f13230b;
                    int i6 = b.f13231c;
                    f = b.f13232d;
                    i2 = i5;
                    i = i6;
                } else {
                    f = 1.0f;
                    i2 = -1;
                    i = -1;
                }
                return new C5002a(arrayList, l, i2, i, f);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new C4815l("Error parsing AVC config", e);
        }
    }
}
