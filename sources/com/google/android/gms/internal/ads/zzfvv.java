package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfvv implements Runnable {
    @CheckForNull
    zzfvx zza;

    zzfvv(zzfvx zzfvx) {
        this.zza = zzfvx;
    }

    public final void run() {
        zzfvl zzf;
        String str;
        zzfvx zzfvx = this.zza;
        if (zzfvx != null && (zzf = zzfvx.zza) != null) {
            this.zza = null;
            if (zzf.isDone()) {
                zzfvx.zzt(zzf);
                return;
            }
            try {
                ScheduledFuture zzw = zzfvx.zzb;
                ScheduledFuture unused = zzfvx.zzb = null;
                str = "Timed out";
                if (zzw != null) {
                    long abs = Math.abs(zzw.getDelay(TimeUnit.MILLISECONDS));
                    if (abs > 10) {
                        str = str + " (timeout delayed by " + abs + " ms after scheduled time)";
                    }
                }
                zzfvx.zze(new zzfvw(str + ": " + zzf, (zzfvu) null));
                zzf.cancel(true);
            } catch (Throwable th) {
                zzf.cancel(true);
                throw th;
            }
        }
    }
}
