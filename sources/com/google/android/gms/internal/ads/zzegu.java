package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzegu implements Callable {
    public final /* synthetic */ zzegx zza;
    public final /* synthetic */ zzfbx zzb;
    public final /* synthetic */ zzfbl zzc;

    public /* synthetic */ zzegu(zzegx zzegx, zzfbx zzfbx, zzfbl zzfbl) {
        this.zza = zzegx;
        this.zzb = zzfbx;
        this.zzc = zzfbl;
    }

    public final Object call() {
        return this.zza.zzc(this.zzb, this.zzc);
    }
}
