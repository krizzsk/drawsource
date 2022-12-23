package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdyk implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;
    private final zzgrh zzc;
    private final zzgrh zzd;
    private final zzgrh zze;
    private final zzgrh zzf;
    private final zzgrh zzg;
    private final zzgrh zzh;
    private final zzgrh zzi;
    private final zzgrh zzj;

    public zzdyk(zzgrh zzgrh, zzgrh zzgrh2, zzgrh zzgrh3, zzgrh zzgrh4, zzgrh zzgrh5, zzgrh zzgrh6, zzgrh zzgrh7, zzgrh zzgrh8, zzgrh zzgrh9, zzgrh zzgrh10) {
        this.zza = zzgrh;
        this.zzb = zzgrh2;
        this.zzc = zzgrh3;
        this.zzd = zzgrh4;
        this.zze = zzgrh5;
        this.zzf = zzgrh6;
        this.zzg = zzgrh7;
        this.zzh = zzgrh8;
        this.zzi = zzgrh9;
        this.zzj = zzgrh10;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzcnl) this.zzb).zza();
        WeakReference zza3 = ((zzcnm) this.zzc).zza();
        zzfvm zzfvm = zzcfv.zza;
        zzgrc.zzb(zzfvm);
        return new zzdyj((Executor) this.zza.zzb(), zza2, zza3, zzfvm, (zzduc) this.zze.zzb(), (ScheduledExecutorService) this.zzf.zzb(), (zzdwq) this.zzg.zzb(), ((zzcnv) this.zzh).zza(), ((zzdil) this.zzi).zzb(), (zzfhu) this.zzj.zzb());
    }
}
