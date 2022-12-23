package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzemr implements zzemw {
    final /* synthetic */ zzems zza;

    zzemr(zzems zzems) {
        this.zza = zzems;
    }

    public final void zza() {
        synchronized (this.zza) {
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        synchronized (this.zza) {
            this.zza.zzc = ((zzcxx) obj).zzl();
            ((zzcxx) obj).zzW();
        }
    }
}
