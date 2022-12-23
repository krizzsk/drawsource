package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzcab implements Callable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzcad zzb;

    zzcab(zzcad zzcad, Context context) {
        this.zzb = zzcad;
        this.zza = context;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzcaa zzcaa;
        zzcac zzcac = (zzcac) this.zzb.zza.get(this.zza);
        if (zzcac == null || zzcac.zza + ((Long) zzbjf.zza.zze()).longValue() < zzt.zzA().currentTimeMillis()) {
            zzcaa = new zzbzz(this.zza).zza();
        } else {
            zzcaa = new zzbzz(this.zza, zzcac.zzb).zza();
        }
        zzcad zzcad = this.zzb;
        zzcad.zza.put(this.zza, new zzcac(zzcad, zzcaa));
        return zzcaa;
    }
}
