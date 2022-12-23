package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzbwj implements Runnable {
    final /* synthetic */ AdOverlayInfoParcel zza;
    final /* synthetic */ zzbwk zzb;

    zzbwj(zzbwk zzbwk, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zzb = zzbwk;
        this.zza = adOverlayInfoParcel;
    }

    public final void run() {
        zzt.zzj();
        zzm.zza(this.zzb.zza, this.zza, true);
    }
}
