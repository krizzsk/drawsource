package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfvz extends zzfvk {
    final /* synthetic */ zzfwa zza;
    private final Callable zzb;

    zzfvz(zzfwa zzfwa, Callable callable) {
        this.zza = zzfwa;
        if (callable != null) {
            this.zzb = callable;
            return;
        }
        throw null;
    }

    /* access modifiers changed from: package-private */
    public final Object zza() throws Exception {
        return this.zzb.call();
    }

    /* access modifiers changed from: package-private */
    public final String zzb() {
        return this.zzb.toString();
    }

    /* access modifiers changed from: package-private */
    public final void zzd(Throwable th) {
        this.zza.zze(th);
    }

    /* access modifiers changed from: package-private */
    public final void zze(Object obj) {
        this.zza.zzd(obj);
    }

    /* access modifiers changed from: package-private */
    public final boolean zzg() {
        return this.zza.isDone();
    }
}
