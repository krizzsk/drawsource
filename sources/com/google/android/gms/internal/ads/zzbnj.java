package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
public final class zzbnj extends zzbmo {
    private final UnifiedNativeAd.OnUnifiedNativeAdLoadedListener zza;

    public zzbnj(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
        this.zza = onUnifiedNativeAdLoadedListener;
    }

    public final void zze(zzbmy zzbmy) {
        this.zza.onUnifiedNativeAdLoaded(new zzbmz(zzbmy));
    }
}
