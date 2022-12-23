package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
public final class zzcbx extends zzcbk {
    private final RewardedInterstitialAdLoadCallback zza;
    private final zzcby zzb;

    public zzcbx(RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback, zzcby zzcby) {
        this.zza = rewardedInterstitialAdLoadCallback;
        this.zzb = zzcby;
    }

    public final void zze(int i) {
    }

    public final void zzf(zze zze) {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback != null) {
            rewardedInterstitialAdLoadCallback.onAdFailedToLoad(zze.zzb());
        }
    }

    public final void zzg() {
        zzcby zzcby;
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback != null && (zzcby = this.zzb) != null) {
            rewardedInterstitialAdLoadCallback.onAdLoaded(zzcby);
        }
    }
}
