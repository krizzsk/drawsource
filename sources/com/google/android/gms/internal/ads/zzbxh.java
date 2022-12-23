package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
public final class zzbxh extends zzbmo {
    private final NativeAd.OnNativeAdLoadedListener zza;

    public zzbxh(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
        this.zza = onNativeAdLoadedListener;
    }

    public final void zze(zzbmy zzbmy) {
        this.zza.onNativeAdLoaded(new zzbxa(zzbmy));
    }
}
