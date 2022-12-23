package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdlv implements zzgqu {
    private final zzgrh zza;

    public zzdlv(zzgrh zzgrh) {
        this.zza = zzgrh;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set set;
        if (((zzdls) this.zza).zza().zze() != null) {
            set = Collections.singleton("banner");
        } else {
            set = Collections.emptySet();
        }
        zzgrc.zzb(set);
        return set;
    }
}
