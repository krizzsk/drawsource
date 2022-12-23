package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzenc implements Runnable {
    public final /* synthetic */ zzend zza;
    public final /* synthetic */ zze zzb;

    public /* synthetic */ zzenc(zzend zzend, zze zze) {
        this.zza = zzend;
        this.zzb = zze;
    }

    public final void run() {
        zzend zzend = this.zza;
        zzend.zze.zzd.zza().zza(this.zzb);
    }
}
