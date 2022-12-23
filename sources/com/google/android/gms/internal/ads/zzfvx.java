package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfvx extends zzfus {
    /* access modifiers changed from: private */
    @CheckForNull
    public zzfvl zza;
    /* access modifiers changed from: private */
    @CheckForNull
    public ScheduledFuture zzb;

    private zzfvx(zzfvl zzfvl) {
        if (zzfvl != null) {
            this.zza = zzfvl;
            return;
        }
        throw null;
    }

    static zzfvl zzg(zzfvl zzfvl, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzfvx zzfvx = new zzfvx(zzfvl);
        zzfvv zzfvv = new zzfvv(zzfvx);
        zzfvx.zzb = scheduledExecutorService.schedule(zzfvv, j, timeUnit);
        zzfvl.zzc(zzfvv, zzfuq.INSTANCE);
        return zzfvx;
    }

    /* access modifiers changed from: protected */
    @CheckForNull
    public final String zza() {
        zzfvl zzfvl = this.zza;
        ScheduledFuture scheduledFuture = this.zzb;
        if (zzfvl == null) {
            return null;
        }
        String str = "inputFuture=[" + zzfvl + "]";
        if (scheduledFuture == null) {
            return str;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return str;
        }
        return str + ", remaining delay=[" + delay + " ms]";
    }

    /* access modifiers changed from: protected */
    public final void zzb() {
        zzs(this.zza);
        ScheduledFuture scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }
}
