package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
abstract class zzftz extends zzfus implements Runnable {
    public static final /* synthetic */ int zzc = 0;
    @CheckForNull
    zzfvl zza;
    @CheckForNull
    Object zzb;

    zzftz(zzfvl zzfvl, Object obj) {
        if (zzfvl != null) {
            this.zza = zzfvl;
            if (obj != null) {
                this.zzb = obj;
                return;
            }
            throw null;
        }
        throw null;
    }

    public final void run() {
        zzfvl zzfvl = this.zza;
        Object obj = this.zzb;
        boolean z = true;
        boolean isCancelled = isCancelled() | (zzfvl == null);
        if (obj != null) {
            z = false;
        }
        if (!isCancelled && !z) {
            this.zza = null;
            if (zzfvl.isCancelled()) {
                zzt(zzfvl);
                return;
            }
            try {
                try {
                    Object zzf = zzf(obj, zzfvc.zzp(zzfvl));
                    this.zzb = null;
                    zzg(zzf);
                } catch (Throwable th) {
                    this.zzb = null;
                    throw th;
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e) {
                zze(e.getCause());
            } catch (RuntimeException e2) {
                zze(e2);
            } catch (Error e3) {
                zze(e3);
            }
        }
    }

    /* access modifiers changed from: protected */
    @CheckForNull
    public final String zza() {
        String str;
        zzfvl zzfvl = this.zza;
        Object obj = this.zzb;
        String zza2 = super.zza();
        if (zzfvl != null) {
            str = "inputFuture=[" + zzfvl + "], ";
        } else {
            str = "";
        }
        if (obj != null) {
            return str + "function=[" + obj + "]";
        } else if (zza2 != null) {
            return str.concat(zza2);
        } else {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final void zzb() {
        zzs(this.zza);
        this.zza = null;
        this.zzb = null;
    }

    /* access modifiers changed from: package-private */
    public abstract Object zzf(Object obj, Object obj2) throws Exception;

    /* access modifiers changed from: package-private */
    public abstract void zzg(Object obj);
}
