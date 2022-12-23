package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfvn implements Executor {
    final /* synthetic */ Executor zza;
    final /* synthetic */ zzftt zzb;

    zzfvn(Executor executor, zzftt zzftt) {
        this.zza = executor;
        this.zzb = zzftt;
    }

    public final void execute(Runnable runnable) {
        try {
            this.zza.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.zzb.zze(e);
        }
    }
}
