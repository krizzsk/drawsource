package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzcgs implements Runnable {
    final /* synthetic */ zzcgv zza;

    zzcgs(zzcgv zzcgv) {
        this.zza = zzcgv;
    }

    public final void run() {
        zzcgv zzcgv = this.zza;
        if (zzcgv.zzq != null) {
            zzcgv.zzq.zzd();
            this.zza.zzq.zzi();
        }
    }
}
