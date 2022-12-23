package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfun extends zzfuo {
    final /* synthetic */ zzfup zza;
    private final Callable zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfun(zzfup zzfup, Callable callable, Executor executor) {
        super(zzfup, executor);
        this.zza = zzfup;
        if (callable != null) {
            this.zzc = callable;
            return;
        }
        throw null;
    }

    /* access modifiers changed from: package-private */
    public final Object zza() throws Exception {
        return this.zzc.call();
    }

    /* access modifiers changed from: package-private */
    public final String zzb() {
        return this.zzc.toString();
    }

    /* access modifiers changed from: package-private */
    public final void zzc(Object obj) {
        this.zza.zzd(obj);
    }
}
