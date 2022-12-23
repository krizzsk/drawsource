package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfbb implements zzemw {
    final /* synthetic */ zzfbc zza;

    zzfbb(zzfbc zzfbc) {
        this.zza = zzfbc;
    }

    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzg = null;
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdst zzdst = (zzdst) obj;
        synchronized (this.zza) {
            this.zza.zzg = zzdst;
            this.zza.zzg.zzW();
        }
    }
}
