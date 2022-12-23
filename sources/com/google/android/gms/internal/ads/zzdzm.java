package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzdzm implements Callable {
    public final /* synthetic */ zzdzp zza;
    public final /* synthetic */ zzbzv zzb;

    public /* synthetic */ zzdzm(zzdzp zzdzp, zzbzv zzbzv) {
        this.zza = zzdzp;
        this.zzb = zzbzv;
    }

    public final Object call() {
        return this.zza.zzc(this.zzb);
    }
}
