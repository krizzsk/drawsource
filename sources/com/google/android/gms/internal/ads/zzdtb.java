package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdtb implements zzgqu {
    private final zzgrh zza;

    public zzdtb(zzgrh zzgrh) {
        this.zza = zzgrh;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbdw zzbdw;
        if (((zzdbk) this.zza).zza().zzo.zza == 3) {
            zzbdw = zzbdw.REWARDED_INTERSTITIAL;
        } else {
            zzbdw = zzbdw.REWARD_BASED_VIDEO_AD;
        }
        zzgrc.zzb(zzbdw);
        return zzbdw;
    }
}
