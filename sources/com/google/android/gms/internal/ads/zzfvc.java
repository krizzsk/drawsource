package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfvc extends zzfve {
    public static zzfvb zza(Iterable iterable) {
        return new zzfvb(false, zzfrj.zzl(iterable), (zzfuz) null);
    }

    @SafeVarargs
    public static zzfvb zzb(zzfvl... zzfvlArr) {
        return new zzfvb(false, zzfrj.zzn(zzfvlArr), (zzfuz) null);
    }

    public static zzfvb zzc(Iterable iterable) {
        return new zzfvb(true, zzfrj.zzl(iterable), (zzfuz) null);
    }

    @SafeVarargs
    public static zzfvb zzd(zzfvl... zzfvlArr) {
        return new zzfvb(true, zzfrj.zzn(zzfvlArr), (zzfuz) null);
    }

    public static zzfvl zze(Iterable iterable) {
        return new zzfuk(zzfrj.zzl(iterable), true);
    }

    public static zzfvl zzf(zzfvl zzfvl, Class cls, zzfok zzfok, Executor executor) {
        zzftr zzftr = new zzftr(zzfvl, cls, zzfok);
        zzfvl.zzc(zzftr, zzfvs.zzc(executor, zzftr));
        return zzftr;
    }

    public static zzfvl zzg(zzfvl zzfvl, Class cls, zzfuj zzfuj, Executor executor) {
        zzftq zzftq = new zzftq(zzfvl, cls, zzfuj);
        zzfvl.zzc(zzftq, zzfvs.zzc(executor, zzftq));
        return zzftq;
    }

    public static zzfvl zzh(Throwable th) {
        if (th != null) {
            return new zzfvf(th);
        }
        throw null;
    }

    public static zzfvl zzi(Object obj) {
        if (obj == null) {
            return zzfvg.zza;
        }
        return new zzfvg(obj);
    }

    public static zzfvl zzj() {
        return zzfvg.zza;
    }

    public static zzfvl zzk(Callable callable, Executor executor) {
        zzfwa zzfwa = new zzfwa(callable);
        executor.execute(zzfwa);
        return zzfwa;
    }

    public static zzfvl zzl(zzfui zzfui, Executor executor) {
        zzfwa zzfwa = new zzfwa(zzfui);
        executor.execute(zzfwa);
        return zzfwa;
    }

    public static zzfvl zzm(zzfvl zzfvl, zzfok zzfok, Executor executor) {
        int i = zzftz.zzc;
        if (zzfok != null) {
            zzfty zzfty = new zzfty(zzfvl, zzfok);
            zzfvl.zzc(zzfty, zzfvs.zzc(executor, zzfty));
            return zzfty;
        }
        throw null;
    }

    public static zzfvl zzn(zzfvl zzfvl, zzfuj zzfuj, Executor executor) {
        int i = zzftz.zzc;
        if (executor != null) {
            zzftx zzftx = new zzftx(zzfvl, zzfuj);
            zzfvl.zzc(zzftx, zzfvs.zzc(executor, zzftx));
            return zzftx;
        }
        throw null;
    }

    public static zzfvl zzo(zzfvl zzfvl, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (zzfvl.isDone()) {
            return zzfvl;
        }
        return zzfvx.zzg(zzfvl, j, timeUnit, scheduledExecutorService);
    }

    public static Object zzp(Future future) throws ExecutionException {
        if (future.isDone()) {
            return zzfwc.zza(future);
        }
        throw new IllegalStateException(zzfpi.zzb("Future was expected to be done: %s", future));
    }

    public static Object zzq(Future future) {
        try {
            return zzfwc.zza(future);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Error) {
                throw new zzfur((Error) cause);
            }
            throw new zzfwb(cause);
        }
    }

    public static void zzr(zzfvl zzfvl, zzfuy zzfuy, Executor executor) {
        if (zzfuy != null) {
            zzfvl.zzc(new zzfva(zzfvl, zzfuy), executor);
            return;
        }
        throw null;
    }
}
