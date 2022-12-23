package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public abstract class zzftw extends AbstractExecutorService implements zzfvm {
    /* access modifiers changed from: protected */
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return zzfwa.zzf(runnable, obj);
    }

    public final /* synthetic */ Future submit(Runnable runnable) {
        return (zzfvl) super.submit(runnable);
    }

    public final zzfvl zza(Runnable runnable) {
        return (zzfvl) super.submit(runnable);
    }

    public final zzfvl zzb(Callable callable) {
        return (zzfvl) super.submit(callable);
    }

    /* access modifiers changed from: protected */
    public final RunnableFuture newTaskFor(Callable callable) {
        return new zzfwa(callable);
    }

    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (zzfvl) super.submit(runnable, obj);
    }

    public final /* synthetic */ Future submit(Callable callable) {
        return (zzfvl) super.submit(callable);
    }
}
