package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzduw implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;

    public zzduw(zzgrh zzgrh, zzgrh zzgrh2) {
        this.zza = zzgrh;
        this.zzb = zzgrh2;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set set;
        zzfvm zzfvm = zzcfv.zza;
        zzgrc.zzb(zzfvm);
        zzdvo zza2 = ((zzdvp) this.zzb).zzb();
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzdV)).booleanValue()) {
            set = Collections.singleton(new zzdiz(zza2, zzfvm));
        } else {
            set = Collections.emptySet();
        }
        zzgrc.zzb(set);
        return set;
    }
}
