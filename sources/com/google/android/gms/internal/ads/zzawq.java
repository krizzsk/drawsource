package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzawq implements Runnable {
    final /* synthetic */ zzawt zza;
    final /* synthetic */ zzawv zzb;

    zzawq(zzawv zzawv, zzawt zzawt) {
        this.zzb = zzawv;
        this.zza = zzawt;
    }

    public final void run() {
        this.zza.zza();
        int size = this.zzb.zzn.size();
        for (int i = 0; i < size; i++) {
            ((zzaxk) this.zzb.zzn.valueAt(i)).zzi();
        }
    }
}
