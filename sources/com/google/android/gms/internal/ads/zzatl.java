package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzatl {
    private final MediaCodec.CryptoInfo zza;
    private final MediaCodec.CryptoInfo.Pattern zzb = new MediaCodec.CryptoInfo.Pattern(0, 0);

    /* synthetic */ zzatl(MediaCodec.CryptoInfo cryptoInfo, zzatk zzatk) {
        this.zza = cryptoInfo;
    }

    static /* bridge */ /* synthetic */ void zza(zzatl zzatl, int i, int i2) {
        zzatl.zzb.set(0, 0);
        zzatl.zza.setPattern(zzatl.zzb);
    }
}
