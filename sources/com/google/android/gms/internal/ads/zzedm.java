package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzedm implements Callable {
    public final /* synthetic */ zzedk zza;

    public /* synthetic */ zzedm(zzedk zzedk) {
        this.zza = zzedk;
    }

    public final Object call() {
        return this.zza.getWritableDatabase();
    }
}
