package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzbad implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzbah zzc;

    zzbad(zzbah zzbah, int i, long j) {
        this.zzc = zzbah;
        this.zza = i;
        this.zzb = j;
    }

    public final void run() {
        this.zzc.zzb.zzl(this.zza, this.zzb);
    }
}
