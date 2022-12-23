package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzehe implements zzfok {
    public final /* synthetic */ zzehg zza;
    public final /* synthetic */ zzcli zzb;
    public final /* synthetic */ zzfbl zzc;
    public final /* synthetic */ zzdka zzd;

    public /* synthetic */ zzehe(zzehg zzehg, zzcli zzcli, zzfbl zzfbl, zzdka zzdka) {
        this.zza = zzehg;
        this.zzb = zzcli;
        this.zzc = zzfbl;
        this.zzd = zzdka;
    }

    public final Object apply(Object obj) {
        zzcli zzcli = this.zzb;
        zzfbl zzfbl = this.zzc;
        zzdka zzdka = this.zzd;
        if (zzfbl.zzN) {
            zzcli.zzag();
        }
        zzcli.zzaa();
        zzcli.onPause();
        return zzdka.zzg();
    }
}
