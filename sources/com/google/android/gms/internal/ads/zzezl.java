package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzezl implements Runnable {
    public final /* synthetic */ zzezn zza;
    public final /* synthetic */ zze zzb;

    public /* synthetic */ zzezl(zzezn zzezn, zze zze) {
        this.zza = zzezn;
        this.zzb = zze;
    }

    public final void run() {
        zzezn zzezn = this.zza;
        zzezn.zze.zzd.zza(this.zzb);
    }
}
