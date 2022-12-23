package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import com.tapjoy.TJAdUnitConstants;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdvs implements zzdeo, zzddh, zzdbw {
    private final zzdwc zza;
    private final zzdwm zzb;

    public zzdvs(zzdwc zzdwc, zzdwm zzdwm) {
        this.zza = zzdwc;
        this.zzb = zzdwm;
    }

    public final void zza(zze zze) {
        this.zza.zza().put("action", "ftl");
        this.zza.zza().put("ftl", String.valueOf(zze.zza));
        this.zza.zza().put("ed", zze.zzc);
        this.zzb.zze(this.zza.zza());
    }

    public final void zzb(zzfbx zzfbx) {
        this.zza.zzb(zzfbx);
    }

    public final void zzbE(zzbzv zzbzv) {
        this.zza.zzc(zzbzv.zza);
    }

    public final void zzn() {
        this.zza.zza().put("action", TJAdUnitConstants.String.VIDEO_LOADED);
        this.zzb.zze(this.zza.zza());
    }
}
