package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzced;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzo implements Callable {
    public final /* synthetic */ zzaa zza;
    public final /* synthetic */ zzced zzb;

    public /* synthetic */ zzo(zzaa zzaa, zzced zzced) {
        this.zza = zzaa;
        this.zzb = zzced;
    }

    public final Object call() {
        return this.zza.zzq(this.zzb);
    }
}
