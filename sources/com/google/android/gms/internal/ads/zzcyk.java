package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzcyk implements zzfuy {
    final /* synthetic */ zzfuy zza;
    final /* synthetic */ zzcyl zzb;

    zzcyk(zzcyl zzcyl, zzfuy zzfuy) {
        this.zzb = zzcyl;
        this.zza = zzfuy;
    }

    public final void zza(Throwable th) {
        zzcfv.zze.execute(new zzcyi(this.zzb));
        this.zza.zza(th);
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcfv.zze.execute(new zzcyi(this.zzb));
        this.zza.zzb((zzcxx) obj);
    }
}
