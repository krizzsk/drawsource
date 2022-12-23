package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzbhg extends zzgkm implements zzgmb {
    private zzbhg() {
        super(zzbhh.zzb);
    }

    public final zzbhg zza(boolean z) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzbhh.zzd((zzbhh) this.zza, z);
        return this;
    }

    public final zzbhg zzb(int i) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzbhh.zze((zzbhh) this.zza, i);
        return this;
    }

    public final boolean zzc() {
        return ((zzbhh) this.zza).zzf();
    }

    /* synthetic */ zzbhg(zzbdt zzbdt) {
        super(zzbhh.zzb);
    }
}
