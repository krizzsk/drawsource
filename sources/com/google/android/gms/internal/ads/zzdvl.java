package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdvl implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;
    private final zzgrh zzc;
    private final zzgrh zzd;

    public zzdvl(zzgrh zzgrh, zzgrh zzgrh2, zzgrh zzgrh3, zzgrh zzgrh4) {
        this.zza = zzgrh;
        this.zzb = zzgrh2;
        this.zzc = zzgrh3;
        this.zzd = zzgrh4;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set set;
        String zza2 = ((zzevo) this.zza).zza();
        Context zza3 = ((zzcnl) this.zzb).zza();
        zzfvm zzfvm = zzcfv.zza;
        zzgrc.zzb(zzfvm);
        Map zzd2 = ((zzgqy) this.zzd).zzb();
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzdV)).booleanValue()) {
            zzbdm zzbdm = new zzbdm(new zzbds(zza3));
            zzbdm.zzb(new zzdvm(zza2));
            set = Collections.singleton(new zzdiz(new zzdvo(zzbdm, zzd2), zzfvm));
        } else {
            set = Collections.emptySet();
        }
        zzgrc.zzb(set);
        return set;
    }
}
