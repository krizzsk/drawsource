package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzffn {
    final /* synthetic */ zzffx zza;
    private final Object zzb;
    private final List zzc;

    /* synthetic */ zzffn(zzffx zzffx, Object obj, List list, zzffm zzffm) {
        this.zza = zzffx;
        this.zzb = obj;
        this.zzc = list;
    }

    public final zzffw zza(Callable callable) {
        zzfvb zzc2 = zzfvc.zzc(this.zzc);
        zzfvl zza2 = zzc2.zza(zzffl.zza, zzcfv.zzf);
        zzffx zzffx = this.zza;
        return new zzffw(zzffx, this.zzb, (String) null, zza2, this.zzc, zzc2.zza(callable, zzffx.zzb), (zzffv) null);
    }
}
