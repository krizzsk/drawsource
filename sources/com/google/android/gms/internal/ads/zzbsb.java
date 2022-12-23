package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzbsb implements zzcge {
    final /* synthetic */ zzbsl zza;
    final /* synthetic */ zzfhh zzb;
    final /* synthetic */ zzbsm zzc;

    zzbsb(zzbsm zzbsm, zzbsl zzbsl, zzfhh zzfhh) {
        this.zzc = zzbsm;
        this.zza = zzbsl;
        this.zzb = zzfhh;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzbrh zzbrh = (zzbrh) obj;
        synchronized (this.zzc.zza) {
            this.zzc.zzi = 0;
            zzbsm zzbsm = this.zzc;
            if (!(zzbsm.zzh == null || this.zza == zzbsm.zzh)) {
                zze.zza("New JS engine is loaded, marking previous one as destroyable.");
                this.zzc.zzh.zzb();
            }
            this.zzc.zzh = this.zza;
            if (((Boolean) zzbji.zzd.zze()).booleanValue()) {
                zzbsm zzbsm2 = this.zzc;
                if (zzbsm2.zze != null) {
                    zzfhu zze = zzbsm2.zze;
                    zzfhh zzfhh = this.zzb;
                    zzfhh.zze(true);
                    zze.zzb(zzfhh.zzj());
                }
            }
        }
    }
}
