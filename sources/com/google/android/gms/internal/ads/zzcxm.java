package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzcxm implements zzddh, zzban {
    private final zzfbl zza;
    private final zzdcl zzb;
    private final zzddq zzc;
    private final AtomicBoolean zzd = new AtomicBoolean();
    private final AtomicBoolean zze = new AtomicBoolean();

    public zzcxm(zzfbl zzfbl, zzdcl zzdcl, zzddq zzddq) {
        this.zza = zzfbl;
        this.zzb = zzdcl;
        this.zzc = zzddq;
    }

    private final void zza() {
        if (this.zzd.compareAndSet(false, true)) {
            this.zzb.zza();
        }
    }

    public final void zzc(zzbam zzbam) {
        if (this.zza.zzf == 1 && zzbam.zzj) {
            zza();
        }
        if (zzbam.zzj && this.zze.compareAndSet(false, true)) {
            this.zzc.zza();
        }
    }

    public final synchronized void zzn() {
        if (this.zza.zzf != 1) {
            zza();
        }
    }
}
