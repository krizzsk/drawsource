package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfwa extends zzfus implements RunnableFuture {
    @CheckForNull
    private volatile zzfvk zza;

    zzfwa(zzfui zzfui) {
        this.zza = new zzfvy(this, zzfui);
    }

    static zzfwa zzf(Runnable runnable, Object obj) {
        return new zzfwa(Executors.callable(runnable, obj));
    }

    public final void run() {
        zzfvk zzfvk = this.zza;
        if (zzfvk != null) {
            zzfvk.run();
        }
        this.zza = null;
    }

    /* access modifiers changed from: protected */
    @CheckForNull
    public final String zza() {
        zzfvk zzfvk = this.zza;
        if (zzfvk == null) {
            return super.zza();
        }
        return "task=[" + zzfvk + "]";
    }

    /* access modifiers changed from: protected */
    public final void zzb() {
        zzfvk zzfvk;
        if (zzu() && (zzfvk = this.zza) != null) {
            zzfvk.zzh();
        }
        this.zza = null;
    }

    zzfwa(Callable callable) {
        this.zza = new zzfvz(this, callable);
    }
}
