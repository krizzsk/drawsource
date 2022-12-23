package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzerr implements zzetg {
    private final zzetg zza;
    private final long zzb;
    private final ScheduledExecutorService zzc;

    public zzerr(zzetg zzetg, long j, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzetg;
        this.zzb = j;
        this.zzc = scheduledExecutorService;
    }

    public final int zza() {
        return this.zza.zza();
    }

    public final zzfvl zzb() {
        zzfvl zzb2 = this.zza.zzb();
        long j = this.zzb;
        if (j > 0) {
            zzb2 = zzfvc.zzo(zzb2, j, TimeUnit.MILLISECONDS, this.zzc);
        }
        return zzfvc.zzg(zzb2, Throwable.class, zzerq.zza, zzcfv.zzf);
    }
}
