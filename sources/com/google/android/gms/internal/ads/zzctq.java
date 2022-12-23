package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzctq implements zzfuy {
    final /* synthetic */ zzcts zza;

    zzctq(zzcts zzcts) {
        this.zza = zzcts;
    }

    public final void zza(Throwable th) {
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcts zzcts = this.zza;
        zzfcm zzd = zzcts.zzh;
        List zzb = zzcts.zzg.zzb(zzcts.zze, zzcts.zzf, false, "", (String) obj, zzcts.zzf.zzc);
        int i = 1;
        if (true == zzt.zzo().zzv(this.zza.zza)) {
            i = 2;
        }
        zzd.zzc(zzb, i);
    }
}
