package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzfau implements Runnable {
    public final /* synthetic */ zzfav zza;
    public final /* synthetic */ zze zzb;

    public /* synthetic */ zzfau(zzfav zzfav, zze zze) {
        this.zza = zzfav;
        this.zzb = zze;
    }

    public final void run() {
        zzfav zzfav = this.zza;
        zzfav.zze.zzd.zza(this.zzb);
    }
}
