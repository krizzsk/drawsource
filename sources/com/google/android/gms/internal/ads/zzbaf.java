package com.google.android.gms.internal.ads;

import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzbaf implements Runnable {
    final /* synthetic */ Surface zza;
    final /* synthetic */ zzbah zzb;

    zzbaf(zzbah zzbah, Surface surface) {
        this.zzb = zzbah;
        this.zza = surface;
    }

    public final void run() {
        this.zzb.zzb.zzm(this.zza);
    }
}
