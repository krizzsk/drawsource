package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzepv implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;

    public zzepv(zzgrh zzgrh, zzgrh zzgrh2) {
        this.zza = zzgrh;
        this.zzb = zzgrh2;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzepq(((zzepl) this.zza).zzb(), 10000, (Clock) this.zzb.zzb());
    }
}
