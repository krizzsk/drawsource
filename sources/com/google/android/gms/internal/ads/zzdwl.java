package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdwl implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;
    private final zzgrh zzc;

    public zzdwl(zzgrh zzgrh, zzgrh zzgrh2, zzgrh zzgrh3) {
        this.zza = zzgrh;
        this.zzb = zzgrh2;
        this.zzc = zzgrh3;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdwk((zzdwc) this.zza.zzb(), ((zzgrf) this.zzb).zzb(), (Clock) this.zzc.zzb());
    }
}
