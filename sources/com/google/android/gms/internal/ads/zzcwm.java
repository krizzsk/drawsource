package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzcwm implements zzgqu {
    private final zzcwc zza;
    private final zzgrh zzb;

    public zzcwm(zzcwc zzcwc, zzgrh zzgrh) {
        this.zza = zzcwc;
        this.zzb = zzgrh;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzdiz((zzcxm) this.zzb.zzb(), zzcfv.zzf));
        zzgrc.zzb(singleton);
        return singleton;
    }
}
