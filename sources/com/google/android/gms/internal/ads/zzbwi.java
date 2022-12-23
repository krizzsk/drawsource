package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzo;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzbwi implements zzo {
    final /* synthetic */ zzbwk zza;

    zzbwi(zzbwk zzbwk) {
        this.zza = zzbwk;
    }

    public final void zzb() {
        zzcfi.zze("Opening AdMobCustomTabsAdapter overlay.");
        zzbwk zzbwk = this.zza;
        zzbwk.zzb.onAdOpened(zzbwk);
    }

    public final void zzbC() {
        zzcfi.zze("Delay close AdMobCustomTabsAdapter overlay.");
    }

    public final void zzbK() {
        zzcfi.zze("AdMobCustomTabsAdapter overlay is resumed.");
    }

    public final void zzbr() {
        zzcfi.zze("AdMobCustomTabsAdapter overlay is paused.");
    }

    public final void zze() {
    }

    public final void zzf(int i) {
        zzcfi.zze("AdMobCustomTabsAdapter overlay is closed.");
        zzbwk zzbwk = this.zza;
        zzbwk.zzb.onAdClosed(zzbwk);
    }
}
