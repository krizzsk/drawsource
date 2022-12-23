package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzayf {
    public final zzaxq zza;
    public final zzayc zzb;
    public final Object zzc;
    public final zzasa[] zzd;

    public zzayf(zzaxq zzaxq, zzayc zzayc, Object obj, zzasa[] zzasaArr) {
        this.zza = zzaxq;
        this.zzb = zzayc;
        this.zzc = obj;
        this.zzd = zzasaArr;
    }

    public final boolean zza(zzayf zzayf, int i) {
        if (zzayf != null && zzazo.zzo(this.zzb.zza(i), zzayf.zzb.zza(i)) && zzazo.zzo(this.zzd[i], zzayf.zzd[i])) {
            return true;
        }
        return false;
    }
}
