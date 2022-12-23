package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzekj implements zzf {
    final AtomicBoolean zza = new AtomicBoolean(false);
    private final zzdbr zzb;
    private final zzdcl zzc;
    private final zzdji zzd;
    private final zzdjb zze;
    private final zzcud zzf;

    zzekj(zzdbr zzdbr, zzdcl zzdcl, zzdji zzdji, zzdjb zzdjb, zzcud zzcud) {
        this.zzb = zzdbr;
        this.zzc = zzdcl;
        this.zzd = zzdji;
        this.zze = zzdjb;
        this.zzf = zzcud;
    }

    public final synchronized void zza(View view) {
        if (this.zza.compareAndSet(false, true)) {
            this.zzf.zzl();
            this.zze.zza(view);
        }
    }

    public final void zzb() {
        if (this.zza.get()) {
            this.zzb.onAdClicked();
        }
    }

    public final void zzc() {
        if (this.zza.get()) {
            this.zzc.zza();
            this.zzd.zza();
        }
    }
}
