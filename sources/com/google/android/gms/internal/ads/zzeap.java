package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzeap implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;
    private final zzgrh zzc;
    private final zzgrh zzd;
    private final zzgrh zze;
    private final zzgrh zzf;
    private final zzgrh zzg;

    public zzeap(zzgrh zzgrh, zzgrh zzgrh2, zzgrh zzgrh3, zzgrh zzgrh4, zzgrh zzgrh5, zzgrh zzgrh6, zzgrh zzgrh7) {
        this.zza = zzgrh;
        this.zzb = zzgrh2;
        this.zzc = zzgrh3;
        this.zzd = zzgrh4;
        this.zze = zzgrh5;
        this.zzf = zzgrh6;
        this.zzg = zzgrh7;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzcnl) this.zza).zza();
        zzfcd zza3 = ((zzdbk) this.zzb).zza();
        zzdzp zza4 = ((zzdzq) this.zzc).zzb();
        zzfvm zzfvm = zzcfv.zza;
        zzgrc.zzb(zzfvm);
        return new zzeao(zza2, zza3, zza4, zzfvm, (ScheduledExecutorService) this.zze.zzb(), (zzeds) this.zzf.zzb(), (zzfhs) this.zzg.zzb());
    }
}
