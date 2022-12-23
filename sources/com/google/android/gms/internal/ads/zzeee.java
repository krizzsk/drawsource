package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzeee implements zzfgg {
    private final zzeds zza;
    private final zzedw zzb;

    zzeee(zzeds zzeds, zzedw zzedw) {
        this.zza = zzeds;
        this.zzb = zzedw;
    }

    public final void zzbF(zzffz zzffz, String str) {
    }

    public final void zzbG(zzffz zzffz, String str, Throwable th) {
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzfg)).booleanValue() && zzffz.RENDERER == zzffz && this.zza.zzc() != 0) {
            this.zza.zzf(zzt.zzA().elapsedRealtime() - this.zza.zzc());
        }
    }

    public final void zzc(zzffz zzffz, String str) {
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzfg)).booleanValue()) {
            if (zzffz.RENDERER == zzffz) {
                this.zza.zzg(zzt.zzA().elapsedRealtime());
            } else if (zzffz.PRELOADED_LOADER == zzffz || zzffz.SERVER_TRANSACTION == zzffz) {
                this.zza.zzh(zzt.zzA().elapsedRealtime());
                zzedw zzedw = this.zzb;
                zzedw.zza.zza(new zzedv(zzedw, this.zza.zzd()));
            }
        }
    }

    public final void zzd(zzffz zzffz, String str) {
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzfg)).booleanValue() && zzffz.RENDERER == zzffz && this.zza.zzc() != 0) {
            this.zza.zzf(zzt.zzA().elapsedRealtime() - this.zza.zzc());
        }
    }
}
