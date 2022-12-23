package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfx {
    private final MediaCodec.CryptoInfo zza;
    private final MediaCodec.CryptoInfo.Pattern zzb = new MediaCodec.CryptoInfo.Pattern(0, 0);

    /* synthetic */ zzfx(MediaCodec.CryptoInfo cryptoInfo, zzfw zzfw) {
        this.zza = cryptoInfo;
    }

    static /* bridge */ /* synthetic */ void zza(zzfx zzfx, int i, int i2) {
        zzfx.zzb.set(i, i2);
        zzfx.zza.setPattern(zzfx.zzb);
    }
}
