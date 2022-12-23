package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfvb {
    private final boolean zza;
    private final zzfrj zzb;

    /* synthetic */ zzfvb(boolean z, zzfrj zzfrj, zzfuz zzfuz) {
        this.zza = z;
        this.zzb = zzfrj;
    }

    public final zzfvl zza(Callable callable, Executor executor) {
        return new zzfup(this.zzb, this.zza, executor, callable);
    }
}
