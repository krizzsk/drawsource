package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nonagon.signalgeneration.zzae;
import com.google.android.gms.ads.nonagon.signalgeneration.zzg;
import com.google.android.gms.ads.nonagon.signalgeneration.zzh;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzcqz implements zzg {
    private final zzcop zza;
    private zzdbf zzb;
    private zzae zzc;

    /* synthetic */ zzcqz(zzcop zzcop, zzcqy zzcqy) {
        this.zza = zzcop;
    }

    public final /* synthetic */ zzg zza(zzdbf zzdbf) {
        this.zzb = zzdbf;
        return this;
    }

    public final /* synthetic */ zzg zzb(zzae zzae) {
        this.zzc = zzae;
        return this;
    }

    public final zzh zzc() {
        zzgrc.zzc(this.zzb, zzdbf.class);
        zzgrc.zzc(this.zzc, zzae.class);
        return new zzcrb(this.zza, this.zzc, new zzczc(), new zzdwu(), this.zzb, (zzezg) null, (zzeyh) null, (zzcra) null);
    }
}
