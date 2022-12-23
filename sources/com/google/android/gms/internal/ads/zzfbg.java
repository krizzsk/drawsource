package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfbg implements zzemw {
    final /* synthetic */ zzfbi zza;

    zzfbg(zzfbi zzfbi) {
        this.zza = zzfbi;
    }

    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzd = null;
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdst zzdst = (zzdst) obj;
        synchronized (this.zza) {
            this.zza.zzd = zzdst;
            this.zza.zzd.zzW();
        }
    }
}
