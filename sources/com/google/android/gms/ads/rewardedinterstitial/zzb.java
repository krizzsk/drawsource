package com.google.android.gms.ads.rewardedinterstitial;

import android.content.Context;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.internal.ads.zzbyy;
import com.google.android.gms.internal.ads.zzcby;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
public final /* synthetic */ class zzb implements Runnable {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ AdManagerAdRequest zzc;
    public final /* synthetic */ RewardedInterstitialAdLoadCallback zzd;

    public /* synthetic */ zzb(Context context, String str, AdManagerAdRequest adManagerAdRequest, RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        this.zza = context;
        this.zzb = str;
        this.zzc = adManagerAdRequest;
        this.zzd = rewardedInterstitialAdLoadCallback;
    }

    public final void run() {
        Context context = this.zza;
        String str = this.zzb;
        AdManagerAdRequest adManagerAdRequest = this.zzc;
        try {
            new zzcby(context, str).zza(adManagerAdRequest.zza(), this.zzd);
        } catch (IllegalStateException e) {
            zzbyy.zza(context).zzd(e, "RewardedInterstitialAdManager.load");
        }
    }
}
