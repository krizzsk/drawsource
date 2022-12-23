package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzse implements Runnable {
    public final /* synthetic */ zzsj zza;
    public final /* synthetic */ zzsk zzb;
    public final /* synthetic */ zzrr zzc;
    public final /* synthetic */ zzrw zzd;

    public /* synthetic */ zzse(zzsj zzsj, zzsk zzsk, zzrr zzrr, zzrw zzrw) {
        this.zza = zzsj;
        this.zzb = zzsk;
        this.zzc = zzrr;
        this.zzd = zzrw;
    }

    public final void run() {
        zzsj zzsj = this.zza;
        this.zzb.zzag(zzsj.zza, zzsj.zzb, this.zzc, this.zzd);
    }
}
