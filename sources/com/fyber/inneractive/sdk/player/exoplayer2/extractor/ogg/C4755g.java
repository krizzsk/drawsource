package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.C4811i;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C4644a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.C4756h;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4978k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u;
import com.google.android.exoplayer2.audio.OpusUtil;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import okio.Utf8;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.g */
public final class C4755g extends C4756h {

    /* renamed from: o */
    public static final int f12368o = C4991u.m15133a("Opus");

    /* renamed from: p */
    public static final byte[] f12369p = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: n */
    public boolean f12370n;

    /* renamed from: a */
    public void mo25206a(boolean z) {
        super.mo25206a(z);
        if (z) {
            this.f12370n = false;
        }
    }

    /* renamed from: a */
    public long mo25205a(C4978k kVar) {
        byte[] bArr = kVar.f13243a;
        byte b = bArr[0] & 255;
        byte b2 = b & 3;
        byte b3 = 2;
        if (b2 == 0) {
            b3 = 1;
        } else if (!(b2 == 1 || b2 == 2)) {
            b3 = bArr[1] & Utf8.REPLACEMENT_BYTE;
        }
        int i = b >> 3;
        int i2 = i & 3;
        return mo25213a((long) (b3 * (i >= 16 ? 2500 << i2 : i >= 12 ? 10000 << (i2 & 1) : i2 == 3 ? 60000 : 10000 << i2)));
    }

    /* renamed from: a */
    public boolean mo25207a(C4978k kVar, long j, C4756h.C4757a aVar) throws IOException, InterruptedException {
        C4978k kVar2 = kVar;
        boolean z = true;
        if (!this.f12370n) {
            byte[] copyOf = Arrays.copyOf(kVar2.f13243a, kVar2.f13245c);
            byte b = copyOf[9] & 255;
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(copyOf);
            mo25212a(arrayList, ((copyOf[11] & 255) << 8) | (copyOf[10] & 255));
            mo25212a(arrayList, 3840);
            aVar.f12384a = C4811i.m14722a((String) null, "audio/opus", (String) null, -1, -1, (int) b, (int) OpusUtil.SAMPLE_RATE, -1, (List<byte[]>) arrayList, (C4644a) null, 0, (String) null);
            this.f12370n = true;
            return true;
        }
        if (kVar.mo25520c() != f12368o) {
            z = false;
        }
        kVar2.mo25525e(0);
        return z;
    }

    /* renamed from: a */
    public final void mo25212a(List<byte[]> list, int i) {
        list.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((((long) i) * 1000000000) / 48000).array());
    }
}
