package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzdyb implements Callable {
    public final /* synthetic */ zzdyj zza;
    public final /* synthetic */ zzfhh zzb;

    public /* synthetic */ zzdyb(zzdyj zzdyj, zzfhh zzfhh) {
        this.zza = zzdyj;
        this.zzb = zzfhh;
    }

    public final Object call() {
        this.zza.zzf(this.zzb);
        return null;
    }
}
