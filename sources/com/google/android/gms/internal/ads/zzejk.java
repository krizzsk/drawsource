package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzejk implements zzfok {
    public final /* synthetic */ zzejo zza;
    public final /* synthetic */ zzcli zzb;
    public final /* synthetic */ zzfbl zzc;
    public final /* synthetic */ zzdsu zzd;

    public /* synthetic */ zzejk(zzejo zzejo, zzcli zzcli, zzfbl zzfbl, zzdsu zzdsu) {
        this.zza = zzejo;
        this.zzb = zzcli;
        this.zzc = zzfbl;
        this.zzd = zzdsu;
    }

    public final Object apply(Object obj) {
        zzcli zzcli = this.zzb;
        zzfbl zzfbl = this.zzc;
        zzdsu zzdsu = this.zzd;
        if (zzfbl.zzN) {
            zzcli.zzag();
        }
        zzcli.zzaa();
        zzcli.onPause();
        return zzdsu.zzk();
    }
}
