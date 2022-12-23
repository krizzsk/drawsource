package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzbo;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdpr implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;
    private final zzgrh zzc;

    public zzdpr(zzgrh zzgrh, zzgrh zzgrh2, zzgrh zzgrh3) {
        this.zza = zzgrh;
        this.zzb = zzgrh2;
        this.zzc = zzgrh3;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfvm zzfvm = zzcfv.zza;
        zzgrc.zzb(zzfvm);
        return new zzdpq((zzbo) this.zza.zzb(), (Clock) this.zzb.zzb(), zzfvm);
    }
}
