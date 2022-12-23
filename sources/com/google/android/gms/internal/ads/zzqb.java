package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzqb {
    public final zzqf zza;
    public final MediaFormat zzb;
    public final zzad zzc;
    public final Surface zzd;
    public final MediaCrypto zze = null;

    private zzqb(zzqf zzqf, MediaFormat mediaFormat, zzad zzad, Surface surface, MediaCrypto mediaCrypto, int i) {
        this.zza = zzqf;
        this.zzb = mediaFormat;
        this.zzc = zzad;
        this.zzd = surface;
    }

    public static zzqb zza(zzqf zzqf, MediaFormat mediaFormat, zzad zzad, MediaCrypto mediaCrypto) {
        return new zzqb(zzqf, mediaFormat, zzad, (Surface) null, (MediaCrypto) null, 0);
    }

    public static zzqb zzb(zzqf zzqf, MediaFormat mediaFormat, zzad zzad, Surface surface, MediaCrypto mediaCrypto) {
        return new zzqb(zzqf, mediaFormat, zzad, surface, (MediaCrypto) null, 0);
    }
}
