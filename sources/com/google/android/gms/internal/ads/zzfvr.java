package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfvr extends zzfvo implements ScheduledExecutorService, zzfvm {
    final ScheduledExecutorService zza;

    zzfvr(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        if (scheduledExecutorService != null) {
            this.zza = scheduledExecutorService;
            return;
        }
        throw null;
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        zzfwa zzf = zzfwa.zzf(runnable, (Object) null);
        return new zzfvp(zzf, this.zza.schedule(zzf, j, timeUnit));
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzfvq zzfvq = new zzfvq(runnable);
        return new zzfvp(zzfvq, this.zza.scheduleAtFixedRate(zzfvq, j, j2, timeUnit));
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzfvq zzfvq = new zzfvq(runnable);
        return new zzfvp(zzfvq, this.zza.scheduleWithFixedDelay(zzfvq, j, j2, timeUnit));
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        zzfwa zzfwa = new zzfwa(callable);
        return new zzfvp(zzfwa, this.zza.schedule(zzfwa, j, timeUnit));
    }
}
