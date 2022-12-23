package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdpo implements zzgqu {
    private final zzdph zza;
    private final zzgrh zzb;
    private final zzgrh zzc;

    public zzdpo(zzdph zzdph, zzgrh zzgrh, zzgrh zzgrh2) {
        this.zza = zzdph;
        this.zzb = zzgrh;
        this.zzc = zzgrh2;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdiz(((zzdsp) this.zzb).zzb(), (Executor) this.zzc.zzb());
    }
}
