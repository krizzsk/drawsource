package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzje implements Runnable {
    public final /* synthetic */ zzjf zza;
    public final /* synthetic */ zzfrg zzb;
    public final /* synthetic */ zzsa zzc;

    public /* synthetic */ zzje(zzjf zzjf, zzfrg zzfrg, zzsa zzsa) {
        this.zza = zzjf;
        this.zzb = zzfrg;
        this.zzc = zzsa;
    }

    public final void run() {
        this.zza.zzj(this.zzb, this.zzc);
    }
}
