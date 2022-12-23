package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzevw implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;
    private final zzgrh zzc;
    private final zzgrh zzd;
    private final zzgrh zze;
    private final zzgrh zzf;

    public zzevw(zzgrh zzgrh, zzgrh zzgrh2, zzgrh zzgrh3, zzgrh zzgrh4, zzgrh zzgrh5, zzgrh zzgrh6) {
        this.zza = zzgrh;
        this.zzb = zzgrh2;
        this.zzc = zzgrh3;
        this.zzd = zzgrh4;
        this.zze = zzgrh5;
        this.zzf = zzgrh6;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        boolean booleanValue = ((zzevn) this.zzb).zzb().booleanValue();
        zzceg zzceg = new zzceg();
        zzfvm zzfvm = zzcfv.zza;
        zzgrc.zzb(zzfvm);
        return new zzevu((zzcer) this.zza.zzb(), booleanValue, zzceg, zzfvm, ((zzevl) this.zze).zza(), (ScheduledExecutorService) this.zzf.zzb(), (byte[]) null);
    }
}
