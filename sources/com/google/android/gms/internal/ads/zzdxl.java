package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zze;
import com.smaato.sdk.core.api.VideoType;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdxl {
    private final zzbph zza;

    zzdxl(zzbph zzbph) {
        this.zza = zzbph;
    }

    private final void zzs(zzdxk zzdxk) throws RemoteException {
        String zza2 = zzdxk.zza(zzdxk);
        zze.zzi("Dispatching AFMA event on publisher webview: ".concat(zza2));
        this.zza.zzb(zza2);
    }

    public final void zza() throws RemoteException {
        zzs(new zzdxk("initialize", (zzdxj) null));
    }

    public final void zzb(long j) throws RemoteException {
        zzdxk zzdxk = new zzdxk("interstitial", (zzdxj) null);
        zzdxk.zza = Long.valueOf(j);
        zzdxk.zzc = "onAdClicked";
        this.zza.zzb(zzdxk.zza(zzdxk));
    }

    public final void zzc(long j) throws RemoteException {
        zzdxk zzdxk = new zzdxk("interstitial", (zzdxj) null);
        zzdxk.zza = Long.valueOf(j);
        zzdxk.zzc = "onAdClosed";
        zzs(zzdxk);
    }

    public final void zzd(long j, int i) throws RemoteException {
        zzdxk zzdxk = new zzdxk("interstitial", (zzdxj) null);
        zzdxk.zza = Long.valueOf(j);
        zzdxk.zzc = "onAdFailedToLoad";
        zzdxk.zzd = Integer.valueOf(i);
        zzs(zzdxk);
    }

    public final void zze(long j) throws RemoteException {
        zzdxk zzdxk = new zzdxk("interstitial", (zzdxj) null);
        zzdxk.zza = Long.valueOf(j);
        zzdxk.zzc = "onAdLoaded";
        zzs(zzdxk);
    }

    public final void zzf(long j) throws RemoteException {
        zzdxk zzdxk = new zzdxk("interstitial", (zzdxj) null);
        zzdxk.zza = Long.valueOf(j);
        zzdxk.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdxk);
    }

    public final void zzg(long j) throws RemoteException {
        zzdxk zzdxk = new zzdxk("interstitial", (zzdxj) null);
        zzdxk.zza = Long.valueOf(j);
        zzdxk.zzc = "onAdOpened";
        zzs(zzdxk);
    }

    public final void zzh(long j) throws RemoteException {
        zzdxk zzdxk = new zzdxk("creation", (zzdxj) null);
        zzdxk.zza = Long.valueOf(j);
        zzdxk.zzc = "nativeObjectCreated";
        zzs(zzdxk);
    }

    public final void zzi(long j) throws RemoteException {
        zzdxk zzdxk = new zzdxk("creation", (zzdxj) null);
        zzdxk.zza = Long.valueOf(j);
        zzdxk.zzc = "nativeObjectNotCreated";
        zzs(zzdxk);
    }

    public final void zzj(long j) throws RemoteException {
        zzdxk zzdxk = new zzdxk(VideoType.REWARDED, (zzdxj) null);
        zzdxk.zza = Long.valueOf(j);
        zzdxk.zzc = "onAdClicked";
        zzs(zzdxk);
    }

    public final void zzk(long j) throws RemoteException {
        zzdxk zzdxk = new zzdxk(VideoType.REWARDED, (zzdxj) null);
        zzdxk.zza = Long.valueOf(j);
        zzdxk.zzc = "onRewardedAdClosed";
        zzs(zzdxk);
    }

    public final void zzl(long j, zzcbb zzcbb) throws RemoteException {
        zzdxk zzdxk = new zzdxk(VideoType.REWARDED, (zzdxj) null);
        zzdxk.zza = Long.valueOf(j);
        zzdxk.zzc = "onUserEarnedReward";
        zzdxk.zze = zzcbb.zzf();
        zzdxk.zzf = Integer.valueOf(zzcbb.zze());
        zzs(zzdxk);
    }

    public final void zzm(long j, int i) throws RemoteException {
        zzdxk zzdxk = new zzdxk(VideoType.REWARDED, (zzdxj) null);
        zzdxk.zza = Long.valueOf(j);
        zzdxk.zzc = "onRewardedAdFailedToLoad";
        zzdxk.zzd = Integer.valueOf(i);
        zzs(zzdxk);
    }

    public final void zzn(long j, int i) throws RemoteException {
        zzdxk zzdxk = new zzdxk(VideoType.REWARDED, (zzdxj) null);
        zzdxk.zza = Long.valueOf(j);
        zzdxk.zzc = "onRewardedAdFailedToShow";
        zzdxk.zzd = Integer.valueOf(i);
        zzs(zzdxk);
    }

    public final void zzo(long j) throws RemoteException {
        zzdxk zzdxk = new zzdxk(VideoType.REWARDED, (zzdxj) null);
        zzdxk.zza = Long.valueOf(j);
        zzdxk.zzc = "onAdImpression";
        zzs(zzdxk);
    }

    public final void zzp(long j) throws RemoteException {
        zzdxk zzdxk = new zzdxk(VideoType.REWARDED, (zzdxj) null);
        zzdxk.zza = Long.valueOf(j);
        zzdxk.zzc = "onRewardedAdLoaded";
        zzs(zzdxk);
    }

    public final void zzq(long j) throws RemoteException {
        zzdxk zzdxk = new zzdxk(VideoType.REWARDED, (zzdxj) null);
        zzdxk.zza = Long.valueOf(j);
        zzdxk.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdxk);
    }

    public final void zzr(long j) throws RemoteException {
        zzdxk zzdxk = new zzdxk(VideoType.REWARDED, (zzdxj) null);
        zzdxk.zza = Long.valueOf(j);
        zzdxk.zzc = "onRewardedAdOpened";
        zzs(zzdxk);
    }
}
