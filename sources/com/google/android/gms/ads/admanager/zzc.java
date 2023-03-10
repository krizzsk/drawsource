package com.google.android.gms.ads.admanager;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbrc;
import com.google.android.gms.internal.ads.zzbyy;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
public final /* synthetic */ class zzc implements Runnable {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ AdManagerAdRequest zzc;
    public final /* synthetic */ AdManagerInterstitialAdLoadCallback zzd;

    public /* synthetic */ zzc(Context context, String str, AdManagerAdRequest adManagerAdRequest, AdManagerInterstitialAdLoadCallback adManagerInterstitialAdLoadCallback) {
        this.zza = context;
        this.zzb = str;
        this.zzc = adManagerAdRequest;
        this.zzd = adManagerInterstitialAdLoadCallback;
    }

    public final void run() {
        Context context = this.zza;
        String str = this.zzb;
        AdManagerAdRequest adManagerAdRequest = this.zzc;
        try {
            new zzbrc(context, str).zza(adManagerAdRequest.zza(), this.zzd);
        } catch (IllegalStateException e) {
            zzbyy.zza(context).zzd(e, "AdManagerInterstitialAd.load");
        }
    }
}
