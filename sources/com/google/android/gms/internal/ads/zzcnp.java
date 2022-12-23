package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzcnp implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;

    public zzcnp(zzgrh zzgrh, zzgrh zzgrh2) {
        this.zza = zzgrh;
        this.zzb = zzgrh2;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set set;
        zzeda zzeda = (zzeda) this.zza.zzb();
        zzfvm zzfvm = zzcfv.zza;
        zzgrc.zzb(zzfvm);
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzbL)).booleanValue()) {
            if (((Boolean) zzay.zzc().zzb(zzbhz.zzhj)).booleanValue()) {
                set = Collections.singleton(new zzdiz(zzeda, zzfvm));
                zzgrc.zzb(set);
                return set;
            }
        }
        set = Collections.emptySet();
        zzgrc.zzb(set);
        return set;
    }
}
