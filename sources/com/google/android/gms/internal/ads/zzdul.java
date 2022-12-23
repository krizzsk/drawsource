package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdul implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;
    private final zzgrh zzc;
    private final zzgrh zzd;
    private final zzgrh zze;

    public zzdul(zzgrh zzgrh, zzgrh zzgrh2, zzgrh zzgrh3, zzgrh zzgrh4, zzgrh zzgrh5) {
        this.zza = zzgrh;
        this.zzb = zzgrh2;
        this.zzc = zzgrh3;
        this.zzd = zzgrh4;
        this.zze = zzgrh5;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzcnl) this.zza).zza();
        String zza3 = ((zzead) this.zzb).zzb();
        zzcfo zza4 = ((zzcnv) this.zzc).zza();
        zzbdw zzbdw = (zzbdw) this.zzd.zzb();
        String str = (String) this.zze.zzb();
        zzbdm zzbdm = new zzbdm(new zzbds(zza2));
        zzbgl zza5 = zzbgm.zza();
        zza5.zza(zza4.zzb);
        zza5.zzc(zza4.zzc);
        zza5.zzb(true != zza4.zzd ? 2 : 0);
        zzbdm.zzb(new zzduk(zzbdw, zza3, (zzbgm) zza5.zzal(), str));
        return zzbdm;
    }
}
