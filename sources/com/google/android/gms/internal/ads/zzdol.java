package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdol implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;

    public zzdol(zzgrh zzgrh, zzgrh zzgrh2) {
        this.zza = zzgrh;
        this.zzb = zzgrh2;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdok(((zzdmo) this.zza).zza(), (Clock) this.zzb.zzb());
    }
}
