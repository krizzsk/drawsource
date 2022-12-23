package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzeln implements zzemw {
    final /* synthetic */ zzelo zza;

    zzeln(zzelo zzelo) {
        this.zza = zzelo;
    }

    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzh = null;
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcvv zzcvv = (zzcvv) obj;
        synchronized (this.zza) {
            zzelo zzelo = this.zza;
            if (zzelo.zzh != null) {
                zzelo.zzh.zzV();
            }
            this.zza.zzh = zzcvv;
            this.zza.zzh.zzW();
        }
    }
}
