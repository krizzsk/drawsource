package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdxe implements zzdeo, zza, zzdbt, zzdcn, zzdco, zzddh, zzdbw, zzarc, zzfgg {
    private final List zza;
    private final zzdws zzb;
    private long zzc;

    public zzdxe(zzdws zzdws, zzcnf zzcnf) {
        this.zzb = zzdws;
        this.zza = Collections.singletonList(zzcnf);
    }

    private final void zze(Class cls, String str, Object... objArr) {
        this.zzb.zza(this.zza, "Event-".concat(String.valueOf(cls.getSimpleName())), str, objArr);
    }

    public final void onAdClicked() {
        zze(zza.class, "onAdClicked", new Object[0]);
    }

    public final void zza(zze zze) {
        zze(zzdbw.class, "onAdFailedToLoad", Integer.valueOf(zze.zza), zze.zzb, zze.zzc);
    }

    public final void zzb(zzfbx zzfbx) {
    }

    public final void zzbE(zzbzv zzbzv) {
        this.zzc = zzt.zzA().elapsedRealtime();
        zze(zzdeo.class, "onAdRequest", new Object[0]);
    }

    public final void zzbF(zzffz zzffz, String str) {
        zze(zzffy.class, "onTaskCreated", str);
    }

    public final void zzbG(zzffz zzffz, String str, Throwable th) {
        zze(zzffy.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    public final void zzbq(Context context) {
        zze(zzdco.class, "onDestroy", context);
    }

    public final void zzbs(Context context) {
        zze(zzdco.class, "onPause", context);
    }

    public final void zzbt(Context context) {
        zze(zzdco.class, "onResume", context);
    }

    public final void zzbu(String str, String str2) {
        zze(zzarc.class, "onAppEvent", str, str2);
    }

    public final void zzbv() {
        zze(zzdbt.class, "onRewardedVideoCompleted", new Object[0]);
    }

    public final void zzc(zzffz zzffz, String str) {
        zze(zzffy.class, "onTaskStarted", str);
    }

    public final void zzd(zzffz zzffz, String str) {
        zze(zzffy.class, "onTaskSucceeded", str);
    }

    public final void zzj() {
        zze(zzdbt.class, "onAdClosed", new Object[0]);
    }

    public final void zzl() {
        zze(zzdcn.class, "onAdImpression", new Object[0]);
    }

    public final void zzm() {
        zze(zzdbt.class, "onAdLeftApplication", new Object[0]);
    }

    public final void zzn() {
        long elapsedRealtime = zzt.zzA().elapsedRealtime();
        long j = this.zzc;
        com.google.android.gms.ads.internal.util.zze.zza("Ad Request Latency : " + (elapsedRealtime - j));
        zze(zzddh.class, "onAdLoaded", new Object[0]);
    }

    public final void zzo() {
        zze(zzdbt.class, "onAdOpened", new Object[0]);
    }

    @ParametersAreNonnullByDefault
    public final void zzp(zzcal zzcal, String str, String str2) {
        zze(zzdbt.class, "onRewarded", zzcal, str, str2);
    }

    public final void zzr() {
        zze(zzdbt.class, "onRewardedVideoStarted", new Object[0]);
    }
}
