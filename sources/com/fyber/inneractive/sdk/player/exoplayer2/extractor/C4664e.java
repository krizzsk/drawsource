package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.fyber.inneractive.sdk.player.exoplayer2.C4811i;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4978k;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.e */
public final class C4664e implements C4746n {
    /* renamed from: a */
    public int mo25068a(C4672g gVar, int i, boolean z) throws IOException, InterruptedException {
        int b = ((C4657b) gVar).mo25062b(i);
        if (b != -1) {
            return b;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    /* renamed from: a */
    public void mo25072a(long j, int i, int i2, int i3, byte[] bArr) {
    }

    /* renamed from: a */
    public void mo25074a(C4811i iVar) {
    }

    /* renamed from: a */
    public void mo25075a(C4978k kVar, int i) {
        kVar.mo25525e(kVar.f13244b + i);
    }
}
