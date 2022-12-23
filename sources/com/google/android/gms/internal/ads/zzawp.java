package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzawp implements Runnable {
    final /* synthetic */ zzawv zza;

    zzawp(zzawv zzawv) {
        this.zza = zzawv;
    }

    public final void run() {
        zzawv zzawv = this.zza;
        if (!zzawv.zzF) {
            zzawv.zzo.zze(zzawv);
        }
    }
}
