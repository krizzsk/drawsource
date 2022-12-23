package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfgv implements zzfgp {
    private final zzfgz zza;
    private final zzfgx zzb;
    private final zzfgm zzc;

    public zzfgv(zzfgm zzfgm, zzfgz zzfgz, zzfgx zzfgx, byte[] bArr) {
        this.zzc = zzfgm;
        this.zza = zzfgz;
        this.zzb = zzfgx;
    }

    public final String zza(zzfgo zzfgo) {
        zzfgz zzfgz = this.zza;
        Map zzj = zzfgo.zzj();
        this.zzb.zza(zzj);
        return zzfgz.zza(zzj);
    }

    public final void zzb(zzfgo zzfgo) {
        this.zzc.zzb(zza(zzfgo));
    }
}
