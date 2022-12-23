package com.fyber.inneractive.sdk.player.exoplayer2.source.chunk;

import com.fyber.inneractive.sdk.player.exoplayer2.C4811i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.C4676c;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4938g;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4942j;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.c */
public abstract class C4864c extends C4862a {

    /* renamed from: i */
    public byte[] f12908i;

    /* renamed from: j */
    public int f12909j;

    /* renamed from: k */
    public volatile boolean f12910k;

    public C4864c(C4938g gVar, C4942j jVar, int i, C4811i iVar, int i2, Object obj, byte[] bArr) {
        super(gVar, jVar, i, iVar, i2, obj, -9223372036854775807L, -9223372036854775807L);
        this.f12908i = bArr;
    }

    /* renamed from: a */
    public final boolean mo25110a() {
        return this.f12910k;
    }

    /* renamed from: b */
    public final void mo25111b() {
        this.f12910k = true;
    }

    /* renamed from: c */
    public long mo25112c() {
        return (long) this.f12909j;
    }

    public final void load() throws IOException, InterruptedException {
        try {
            this.f12907h.mo24756a(this.f12900a);
            int i = 0;
            this.f12909j = 0;
            while (i != -1 && !this.f12910k) {
                byte[] bArr = this.f12908i;
                if (bArr == null) {
                    this.f12908i = new byte[16384];
                } else if (bArr.length < this.f12909j + 16384) {
                    this.f12908i = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i = this.f12907h.mo24755a(this.f12908i, this.f12909j, 16384);
                if (i != -1) {
                    this.f12909j += i;
                }
            }
            if (!this.f12910k) {
                ((C4676c.C4677a) this).f11758m = Arrays.copyOf(this.f12908i, this.f12909j);
            }
        } finally {
            C4991u.m15137a(this.f12907h);
        }
    }
}
