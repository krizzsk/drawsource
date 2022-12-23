package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzegy implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;
    private final zzgrh zzc;
    private final zzgrh zzd;
    private final zzgrh zze;

    public zzegy(zzgrh zzgrh, zzgrh zzgrh2, zzgrh zzgrh3, zzgrh zzgrh4, zzgrh zzgrh5) {
        this.zza = zzgrh;
        this.zzb = zzgrh2;
        this.zzc = zzgrh3;
        this.zzd = zzgrh4;
        this.zze = zzgrh5;
    }

    /* renamed from: zza */
    public final zzegx zzb() {
        zzfvm zzfvm = zzcfv.zza;
        zzgrc.zzb(zzfvm);
        return new zzegx((zzcws) this.zza.zzb(), ((zzegf) this.zzb).zzb(), (zzdbv) this.zzc.zzb(), (ScheduledExecutorService) this.zzd.zzb(), zzfvm);
    }
}
