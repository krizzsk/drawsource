package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfff implements zzgqu {
    private final zzgrh zza;

    public zzfff(zzgrh zzgrh) {
        this.zza = zzgrh;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfnv.zza();
        ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, (ThreadFactory) this.zza.zzb()));
        zzgrc.zzb(unconfigurableScheduledExecutorService);
        return unconfigurableScheduledExecutorService;
    }
}
