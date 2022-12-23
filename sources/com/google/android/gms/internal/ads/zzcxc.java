package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzcxc implements Runnable {
    public final /* synthetic */ zzcxd zza;
    public final /* synthetic */ Runnable zzb;

    public /* synthetic */ zzcxc(zzcxd zzcxd, Runnable runnable) {
        this.zza = zzcxd;
        this.zzb = runnable;
    }

    public final void run() {
        this.zza.zzk(this.zzb);
    }
}
