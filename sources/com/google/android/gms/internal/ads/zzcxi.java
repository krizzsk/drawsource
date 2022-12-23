package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzcxi implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;
    private final zzgrh zzc;
    private final zzgrh zzd;

    public zzcxi(zzgrh zzgrh, zzgrh zzgrh2, zzgrh zzgrh3, zzgrh zzgrh4) {
        this.zza = zzgrh;
        this.zzb = zzgrh2;
        this.zzc = zzgrh3;
        this.zzd = zzgrh4;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzcxd(((zzczs) this.zza).zzb(), ((zzcxh) this.zzb).zza(), ((zzcxg) this.zzc).zza(), (Executor) this.zzd.zzb());
    }
}
