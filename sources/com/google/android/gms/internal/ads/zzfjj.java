package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfjj {
    private static zzfjj zza;
    private float zzb = 0.0f;
    private final zzfjb zzc;
    private final zzfiz zzd;
    private zzfja zze;
    private zzfjc zzf;

    public zzfjj(zzfjb zzfjb, zzfiz zzfiz) {
        this.zzc = zzfjb;
        this.zzd = zzfiz;
    }

    public static zzfjj zzb() {
        if (zza == null) {
            zza = new zzfjj(new zzfjb(), new zzfiz());
        }
        return zza;
    }

    public final float zza() {
        return this.zzb;
    }

    public final void zzc(Context context) {
        this.zze = new zzfja(new Handler(), context, new zzfiy(), this, (byte[]) null);
    }

    public final void zzd(float f) {
        this.zzb = f;
        if (this.zzf == null) {
            this.zzf = zzfjc.zza();
        }
        for (zzfir zzg : this.zzf.zzb()) {
            zzg.zzg().zzh(f);
        }
    }

    public final void zze() {
        zzfje.zza().zzg(this);
        zzfje.zza().zzd();
        if (zzfje.zza().zzf()) {
            zzfkf.zzd().zzi();
        }
        this.zze.zza();
    }

    public final void zzf() {
        zzfkf.zzd().zzj();
        zzfje.zza().zze();
        this.zze.zzb();
    }
}
