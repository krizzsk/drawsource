package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdal implements zzdeo {
    private final Context zza;
    private final zzfcd zzb;
    private final zzcfo zzc;
    private final zzg zzd;
    private final zzdyj zze;
    private final zzfhu zzf;

    public zzdal(Context context, zzfcd zzfcd, zzcfo zzcfo, zzg zzg, zzdyj zzdyj, zzfhu zzfhu) {
        this.zza = context;
        this.zzb = zzfcd;
        this.zzc = zzcfo;
        this.zzd = zzg;
        this.zze = zzdyj;
        this.zzf = zzfhu;
    }

    public final void zzb(zzfbx zzfbx) {
    }

    public final void zzbE(zzbzv zzbzv) {
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzda)).booleanValue()) {
            zzt.zza().zzc(this.zza, this.zzc, this.zzb.zzf, this.zzd.zzh(), this.zzf);
        }
        this.zze.zzr();
    }
}
