package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdkr implements zzgqu {
    private final zzdkd zza;
    private final zzgrh zzb;

    public zzdkr(zzdkd zzdkd, zzgrh zzgrh) {
        this.zza = zzdkd;
        this.zzb = zzgrh;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return this.zza.zzd((Executor) this.zzb.zzb());
    }
}
