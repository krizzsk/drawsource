package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfvs {
    public static zzfvm zza(ExecutorService executorService) {
        zzfvm zzfvm;
        if (executorService instanceof zzfvm) {
            return (zzfvm) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            zzfvm = new zzfvr((ScheduledExecutorService) executorService);
        } else {
            zzfvm = new zzfvo(executorService);
        }
        return zzfvm;
    }

    public static Executor zzb() {
        return zzfuq.INSTANCE;
    }

    static Executor zzc(Executor executor, zzftt zzftt) {
        if (executor == null) {
            throw null;
        } else if (executor == zzfuq.INSTANCE) {
            return executor;
        } else {
            return new zzfvn(executor, zzftt);
        }
    }
}
