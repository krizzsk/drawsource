package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzbtj {
    private final zzbsm zza;
    private zzfvl zzb;

    zzbtj(zzbsm zzbsm) {
        this.zza = zzbsm;
    }

    private final void zzd() {
        if (this.zzb == null) {
            zzcga zzcga = new zzcga();
            this.zzb = zzcga;
            this.zza.zzb((zzaoc) null).zzi(new zzbth(zzcga), new zzbti(zzcga));
        }
    }

    public final zzbtm zza(String str, zzbst zzbst, zzbss zzbss) {
        zzd();
        return new zzbtm(this.zzb, "google.afma.activeView.handleUpdate", zzbst, zzbss);
    }

    public final void zzb(String str, zzbom zzbom) {
        zzd();
        this.zzb = zzfvc.zzn(this.zzb, new zzbtf(str, zzbom), zzcfv.zzf);
    }

    public final void zzc(String str, zzbom zzbom) {
        this.zzb = zzfvc.zzm(this.zzb, new zzbtg(str, zzbom), zzcfv.zzf);
    }
}
