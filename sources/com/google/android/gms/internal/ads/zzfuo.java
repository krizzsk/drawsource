package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
abstract class zzfuo extends zzfvk {
    private final Executor zza;
    final /* synthetic */ zzfup zzb;

    zzfuo(zzfup zzfup, Executor executor) {
        this.zzb = zzfup;
        if (executor != null) {
            this.zza = executor;
            return;
        }
        throw null;
    }

    /* access modifiers changed from: package-private */
    public abstract void zzc(Object obj);

    /* access modifiers changed from: package-private */
    public final void zzd(Throwable th) {
        zzfuo unused = this.zzb.zza = null;
        if (th instanceof ExecutionException) {
            this.zzb.zze(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            this.zzb.cancel(false);
        } else {
            this.zzb.zze(th);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zze(Object obj) {
        zzfuo unused = this.zzb.zza = null;
        zzc(obj);
    }

    /* access modifiers changed from: package-private */
    public final void zzf() {
        try {
            this.zza.execute(this);
        } catch (RejectedExecutionException e) {
            this.zzb.zze(e);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean zzg() {
        return this.zzb.isDone();
    }
}
