package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzeuz implements Callable {
    public final /* synthetic */ zzfvl zza;
    public final /* synthetic */ zzfvl zzb;

    public /* synthetic */ zzeuz(zzfvl zzfvl, zzfvl zzfvl2) {
        this.zza = zzfvl;
        this.zzb = zzfvl2;
    }

    public final Object call() {
        return new zzevb((String) this.zza.get(), (String) this.zzb.get());
    }
}
