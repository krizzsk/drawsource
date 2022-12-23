package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzbde implements Runnable {
    public final /* synthetic */ zzcga zza;
    public final /* synthetic */ Future zzb;

    public /* synthetic */ zzbde(zzcga zzcga, Future future) {
        this.zza = zzcga;
        this.zzb = future;
    }

    public final void run() {
        zzcga zzcga = this.zza;
        Future future = this.zzb;
        int i = zzbdg.zzd;
        if (zzcga.isCancelled()) {
            future.cancel(true);
        }
    }
}
