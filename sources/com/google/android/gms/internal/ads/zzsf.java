package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzsf implements Runnable {
    public final /* synthetic */ zzsj zza;
    public final /* synthetic */ zzsk zzb;
    public final /* synthetic */ zzrr zzc;
    public final /* synthetic */ zzrw zzd;
    public final /* synthetic */ IOException zze;
    public final /* synthetic */ boolean zzf;

    public /* synthetic */ zzsf(zzsj zzsj, zzsk zzsk, zzrr zzrr, zzrw zzrw, IOException iOException, boolean z) {
        this.zza = zzsj;
        this.zzb = zzsk;
        this.zzc = zzrr;
        this.zzd = zzrw;
        this.zze = iOException;
        this.zzf = z;
    }

    public final void run() {
        zzsj zzsj = this.zza;
        this.zzb.zzai(zzsj.zza, zzsj.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }
}
