package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdvx implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;
    private final zzgrh zzc;

    public zzdvx(zzgrh zzgrh, zzgrh zzgrh2, zzgrh zzgrh3) {
        this.zza = zzgrh;
        this.zzb = zzgrh2;
        this.zzc = zzgrh3;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdwk zzdwk = (zzdwk) this.zza.zzb();
        zzfvm zzfvm = zzcfv.zza;
        zzgrc.zzb(zzfvm);
        return ((Boolean) zzay.zzc().zzb(zzbhz.zzhj)).booleanValue() ? new zzdiz((zzedf) this.zzc.zzb(), zzfvm) : new zzdiz(zzdwk, zzfvm);
    }
}
