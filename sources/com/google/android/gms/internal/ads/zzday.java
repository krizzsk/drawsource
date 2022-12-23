package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzday implements Callable {
    public final /* synthetic */ zzdaz zza;
    public final /* synthetic */ zzfvl zzb;

    public /* synthetic */ zzday(zzdaz zzdaz, zzfvl zzfvl) {
        this.zza = zzdaz;
        this.zzb = zzfvl;
    }

    public final Object call() {
        return this.zza.zza(this.zzb);
    }
}
