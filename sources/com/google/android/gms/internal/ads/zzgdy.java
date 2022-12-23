package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgdy extends zzgkm implements zzgmb {
    private zzgdy() {
        super(zzgdz.zzb);
    }

    public final zzgdy zza(zzgji zzgji) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        ((zzgdz) this.zza).zzg = zzgji;
        return this;
    }

    public final zzgdy zzb(zzgec zzgec) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzgdz.zzi((zzgdz) this.zza, zzgec);
        return this;
    }

    public final zzgdy zzc(int i) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        ((zzgdz) this.zza).zze = 0;
        return this;
    }

    /* synthetic */ zzgdy(zzgdx zzgdx) {
        super(zzgdz.zzb);
    }
}
