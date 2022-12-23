package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzcyj implements zzfuy {
    final /* synthetic */ zzfuy zza;
    final /* synthetic */ zzcyl zzb;

    zzcyj(zzcyl zzcyl, zzfuy zzfuy) {
        this.zzb = zzcyl;
        this.zza = zzfuy;
    }

    public final void zza(Throwable th) {
        this.zza.zza(th);
        zzcfv.zze.execute(new zzcyi(this.zzb));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcyl.zzb(this.zzb, ((zzcye) obj).zza, this.zza);
    }
}
