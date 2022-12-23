package com.fyber.inneractive.sdk.player.exoplayer2.decoder;

import android.media.MediaCodec;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.decoder.a */
public final class C4640a {

    /* renamed from: a */
    public byte[] f11638a;

    /* renamed from: b */
    public byte[] f11639b;

    /* renamed from: c */
    public int f11640c;

    /* renamed from: d */
    public int[] f11641d;

    /* renamed from: e */
    public int[] f11642e;

    /* renamed from: f */
    public int f11643f;

    /* renamed from: g */
    public final MediaCodec.CryptoInfo f11644g;

    /* renamed from: h */
    public final C4642b f11645h;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.decoder.a$b */
    public static final class C4642b {

        /* renamed from: a */
        public final MediaCodec.CryptoInfo f11646a;

        /* renamed from: b */
        public final MediaCodec.CryptoInfo.Pattern f11647b;

        public C4642b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f11646a = cryptoInfo;
            this.f11647b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }
    }

    public C4640a() {
        int i = C4991u.f13270a;
        C4642b bVar = null;
        MediaCodec.CryptoInfo a = i >= 16 ? mo25031a() : null;
        this.f11644g = a;
        this.f11645h = i >= 24 ? new C4642b(a) : bVar;
    }

    /* renamed from: a */
    public final MediaCodec.CryptoInfo mo25031a() {
        return new MediaCodec.CryptoInfo();
    }
}
