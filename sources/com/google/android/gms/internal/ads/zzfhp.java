package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfhp implements zzfuy {
    final /* synthetic */ zzfhs zza;
    final /* synthetic */ zzfhh zzb;
    final /* synthetic */ boolean zzc;

    zzfhp(zzfhs zzfhs, zzfhh zzfhh, boolean z) {
        this.zza = zzfhs;
        this.zzb = zzfhh;
        this.zzc = z;
    }

    public final void zza(Throwable th) {
        zzfhh zzfhh = this.zzb;
        if (zzfhh.zzh()) {
            zzfhs zzfhs = this.zza;
            zzfhh.zze(false);
            zzfhs.zza(zzfhh);
            if (this.zzc) {
                this.zza.zzg();
            }
        }
    }

    public final void zzb(Object obj) {
        zzfhs zzfhs = this.zza;
        zzfhh zzfhh = this.zzb;
        zzfhh.zze(true);
        zzfhs.zza(zzfhh);
        if (this.zzc) {
            this.zza.zzg();
        }
    }
}
