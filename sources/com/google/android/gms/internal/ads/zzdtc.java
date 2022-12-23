package com.google.android.gms.internal.ads;

import com.smaato.sdk.core.api.VideoType;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdtc implements zzgqu {
    private final zzgrh zza;

    public zzdtc(zzgrh zzgrh) {
        this.zza = zzgrh;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return ((zzdbk) this.zza).zza().zzo.zza == 3 ? "rewarded_interstitial" : VideoType.REWARDED;
    }
}
