package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzcoe implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;

    public zzcoe(zzgrh zzgrh, zzgrh zzgrh2) {
        this.zza = zzgrh;
        this.zzb = zzgrh2;
    }

    /* renamed from: zza */
    public final zzcag zzb() {
        Context zza2 = ((zzcnl) this.zza).zza();
        zzfhu zzfhu = (zzfhu) this.zzb.zzb();
        zzt.zzf().zzb(zza2, zzcfo.zza(), zzfhu).zza("google.afma.request.getAdDictionary", zzbsx.zza, zzbsx.zza);
        zzbta zzb2 = zzt.zzf().zzb(zza2, zzcfo.zza(), zzfhu);
        zzbsu zzbsu = zzbsx.zza;
        return new zzcaf(zza2, zzb2.zza("google.afma.sdkConstants.getSdkConstants", zzbsu, zzbsu));
    }
}
