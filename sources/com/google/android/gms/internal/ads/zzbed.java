package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzbed extends zzgkm implements zzgmb {
    private zzbed() {
        super(zzbee.zzb);
    }

    public final zzbed zza(boolean z) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzbee.zze((zzbee) this.zza, z);
        return this;
    }

    public final zzbed zzb(int i) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzbee.zzf((zzbee) this.zza, i);
        return this;
    }

    /* synthetic */ zzbed(zzbdt zzbdt) {
        super(zzbee.zzb);
    }
}
