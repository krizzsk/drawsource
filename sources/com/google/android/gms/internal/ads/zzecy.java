package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import com.tapjoy.TJAdUnitConstants;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzecy implements zzdeo, zzddh, zzdbw {
    private final zzfgo zza;
    private final zzfgp zzb;
    private final zzcev zzc;

    public zzecy(zzfgo zzfgo, zzfgp zzfgp, zzcev zzcev) {
        this.zza = zzfgo;
        this.zzb = zzfgp;
        this.zzc = zzcev;
    }

    public final void zza(zze zze) {
        zzfgo zzfgo = this.zza;
        zzfgo.zza("action", "ftl");
        zzfgo.zza("ftl", String.valueOf(zze.zza));
        zzfgo.zza("ed", zze.zzc);
        this.zzb.zzb(this.zza);
    }

    public final void zzb(zzfbx zzfbx) {
        this.zza.zzh(zzfbx, this.zzc);
    }

    public final void zzbE(zzbzv zzbzv) {
        this.zza.zzi(zzbzv.zza);
    }

    public final void zzn() {
        zzfgp zzfgp = this.zzb;
        zzfgo zzfgo = this.zza;
        zzfgo.zza("action", TJAdUnitConstants.String.VIDEO_LOADED);
        zzfgp.zzb(zzfgo);
    }
}
