package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdki implements zzgqu {
    private final zzdkd zza;
    private final zzgrh zzb;

    public zzdki(zzdkd zzdkd, zzgrh zzgrh) {
        this.zza = zzdkd;
        this.zzb = zzgrh;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set singleton = Collections.singleton(new zzdiz((zzdat) this.zzb.zzb(), zzcfv.zzf));
        zzgrc.zzb(singleton);
        return singleton;
    }
}
