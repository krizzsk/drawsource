package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzcuu implements zzgqu {
    private final zzcur zza;
    private final zzgrh zzb;

    public zzcuu(zzcur zzcur, zzgrh zzgrh) {
        this.zza = zzcur;
        this.zzb = zzgrh;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzdiz((zzcxm) this.zzb.zzb(), zzcfv.zzf));
        zzgrc.zzb(singleton);
        return singleton;
    }
}
