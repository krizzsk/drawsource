package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgdv extends zzgkm implements zzgmb {
    private zzgdv() {
        super(zzgdw.zzb);
    }

    public final zzgdv zza(zzgdq zzgdq) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzgdw.zzh((zzgdw) this.zza, zzgdq);
        return this;
    }

    public final zzgdv zzb(zzgef zzgef) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzgdw.zzg((zzgdw) this.zza, zzgef);
        return this;
    }

    public final zzgdv zzc(int i) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        ((zzgdw) this.zza).zzg = zzgdn.zza(i);
        return this;
    }

    /* synthetic */ zzgdv(zzgdu zzgdu) {
        super(zzgdw.zzb);
    }
}
