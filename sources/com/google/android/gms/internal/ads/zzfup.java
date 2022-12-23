package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfup extends zzfuc {
    /* access modifiers changed from: private */
    @CheckForNull
    public zzfuo zza;

    zzfup(zzfre zzfre, boolean z, Executor executor, Callable callable) {
        super(zzfre, z, false);
        this.zza = new zzfun(this, callable, executor);
        zzw();
    }

    /* access modifiers changed from: package-private */
    public final void zzg(int i, @CheckForNull Object obj) {
    }

    /* access modifiers changed from: protected */
    public final void zzr() {
        zzfuo zzfuo = this.zza;
        if (zzfuo != null) {
            zzfuo.zzh();
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzv() {
        zzfuo zzfuo = this.zza;
        if (zzfuo != null) {
            zzfuo.zzf();
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzz(int i) {
        super.zzz(i);
        if (i == 1) {
            this.zza = null;
        }
    }
}
