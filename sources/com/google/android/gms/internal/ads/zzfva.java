package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfva implements Runnable {
    final Future zza;
    final zzfuy zzb;

    zzfva(Future future, zzfuy zzfuy) {
        this.zza = future;
        this.zzb = zzfuy;
    }

    public final void run() {
        Throwable zza2;
        Future future = this.zza;
        if (!(future instanceof zzfwd) || (zza2 = zzfwe.zza((zzfwd) future)) == null) {
            try {
                this.zzb.zzb(zzfvc.zzp(this.zza));
            } catch (ExecutionException e) {
                this.zzb.zza(e.getCause());
            } catch (Error | RuntimeException e2) {
                this.zzb.zza(e2);
            }
        } else {
            this.zzb.zza(zza2);
        }
    }

    public final String toString() {
        zzfoo zza2 = zzfop.zza(this);
        zza2.zza(this.zzb);
        return zza2.toString();
    }
}
