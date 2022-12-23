package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfeg implements zzfuy {
    final /* synthetic */ zzfej zza;
    final /* synthetic */ zzfek zzb;

    zzfeg(zzfek zzfek, zzfej zzfej) {
        this.zzb = zzfek;
        this.zza = zzfej;
    }

    public final void zza(Throwable th) {
        synchronized (this.zzb) {
            this.zzb.zze = null;
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Void voidR = (Void) obj;
        synchronized (this.zzb) {
            this.zzb.zze = null;
            this.zzb.zzd.addFirst(this.zza);
            zzfek zzfek = this.zzb;
            if (zzfek.zzf == 1) {
                zzfek.zzh();
            }
        }
    }
}
