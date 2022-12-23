package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzemo implements zzemw {
    final /* synthetic */ zzemp zza;

    zzemo(zzemp zzemp) {
        this.zza = zzemp;
    }

    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzh = null;
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdjz zzdjz = (zzdjz) obj;
        synchronized (this.zza) {
            this.zza.zzh = zzdjz;
            this.zza.zzh.zzW();
        }
    }
}
