package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzbbe implements Runnable {
    final /* synthetic */ zzbbf zza;

    zzbbe(zzbbf zzbbf) {
        this.zza = zzbbf;
    }

    public final void run() {
        synchronized (this.zza.zzc) {
            zzbbf zzbbf = this.zza;
            if (!zzbbf.zzd || !zzbbf.zze) {
                zze.zze("App is still foreground");
            } else {
                zzbbf.zzd = false;
                zze.zze("App went background");
                for (zzbbg zza2 : this.zza.zzf) {
                    try {
                        zza2.zza(false);
                    } catch (Exception e) {
                        zzcfi.zzh("", e);
                    }
                }
            }
        }
    }
}
