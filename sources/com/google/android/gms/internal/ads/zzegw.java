package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzegw implements zzfuy {
    final /* synthetic */ zzegx zza;

    zzegw(zzegx zzegx) {
        this.zza = zzegx;
    }

    public final void zza(Throwable th) {
        zze zza2 = this.zza.zza.zzd().zza(th);
        this.zza.zzd.zza(zza2);
        zzfcx.zzb(zza2.zza, th, "DelayedBannerAd.onFailure");
    }

    public final /* synthetic */ void zzb(Object obj) {
        ((zzcvv) obj).zzW();
    }
}
