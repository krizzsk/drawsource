package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzbsc implements zzcgc {
    final /* synthetic */ zzbsl zza;
    final /* synthetic */ zzfhh zzb;
    final /* synthetic */ zzbsm zzc;

    zzbsc(zzbsm zzbsm, zzbsl zzbsl, zzfhh zzfhh) {
        this.zzc = zzbsm;
        this.zza = zzbsl;
        this.zzb = zzfhh;
    }

    public final void zza() {
        synchronized (this.zzc.zza) {
            this.zzc.zzi = 1;
            zze.zza("Failed loading new engine. Marking new engine destroyable.");
            this.zza.zzb();
            if (((Boolean) zzbji.zzd.zze()).booleanValue()) {
                zzbsm zzbsm = this.zzc;
                if (zzbsm.zze != null) {
                    zzfhu zze = zzbsm.zze;
                    zzfhh zzfhh = this.zzb;
                    zzfhh.zze(false);
                    zze.zzb(zzfhh.zzj());
                }
            }
        }
    }
}
