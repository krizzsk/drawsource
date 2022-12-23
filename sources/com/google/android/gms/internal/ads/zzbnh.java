package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.internal.client.zzbs;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
final class zzbnh implements Runnable {
    final /* synthetic */ AdManagerAdView zza;
    final /* synthetic */ zzbs zzb;
    final /* synthetic */ zzbni zzc;

    zzbnh(zzbni zzbni, AdManagerAdView adManagerAdView, zzbs zzbs) {
        this.zzc = zzbni;
        this.zza = adManagerAdView;
        this.zzb = zzbs;
    }

    public final void run() {
        if (this.zza.zzb(this.zzb)) {
            this.zzc.zza.onAdManagerAdViewLoaded(this.zza);
        } else {
            zzcfi.zzj("Could not bind.");
        }
    }
}
