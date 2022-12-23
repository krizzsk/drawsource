package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzeel implements Callable {
    public final /* synthetic */ zzees zza;

    public /* synthetic */ zzeel(zzees zzees) {
        this.zza = zzees;
    }

    public final Object call() {
        return this.zza.getWritableDatabase();
    }
}
