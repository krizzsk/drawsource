package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzcro implements Runnable {
    public final /* synthetic */ zzcrp zza;
    public final /* synthetic */ Runnable zzb;

    public /* synthetic */ zzcro(zzcrp zzcrp, Runnable runnable) {
        this.zza = zzcrp;
        this.zzb = runnable;
    }

    public final void run() {
        this.zza.zzc(this.zzb);
    }
}
