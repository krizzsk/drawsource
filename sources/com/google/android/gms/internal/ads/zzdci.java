package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdci implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;
    private final zzgrh zzc;
    private final zzgrh zzd;

    public zzdci(zzgrh zzgrh, zzgrh zzgrh2, zzgrh zzgrh3, zzgrh zzgrh4) {
        this.zza = zzgrh;
        this.zzb = zzgrh2;
        this.zzc = zzgrh3;
        this.zzd = zzgrh4;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdcf zza2 = ((zzdch) this.zza).zzb();
        Set zzc2 = ((zzgrf) this.zzb).zzb();
        zzfvm zzfvm = zzcfv.zza;
        zzgrc.zzb(zzfvm);
        return new zzdcg(zza2, zzc2, zzfvm, (ScheduledExecutorService) this.zzd.zzb());
    }
}
