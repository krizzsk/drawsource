package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbf;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzemu {
    private final zzdns zza;
    private final zzemh zzb;
    private final zzdbw zzc;

    public zzemu(zzdns zzdns, zzfgp zzfgp) {
        this.zza = zzdns;
        zzemh zzemh = new zzemh(zzfgp);
        this.zzb = zzemh;
        this.zzc = new zzemt(zzemh, this.zza.zzg());
    }

    public final zzdbw zza() {
        return this.zzc;
    }

    public final zzddh zzb() {
        return this.zzb;
    }

    public final zzdlp zzc() {
        return new zzdlp(this.zza, this.zzb.zzc());
    }

    public final zzemh zzd() {
        return this.zzb;
    }

    public final void zze(zzbf zzbf) {
        this.zzb.zze(zzbf);
    }
}
