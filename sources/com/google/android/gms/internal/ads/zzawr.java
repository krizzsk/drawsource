package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzawr implements Runnable {
    final /* synthetic */ IOException zza;
    final /* synthetic */ zzawv zzb;

    zzawr(zzawv zzawv, IOException iOException) {
        this.zzb = zzawv;
        this.zza = iOException;
    }

    public final void run() {
        this.zzb.zze.zzi(this.zza);
    }
}
