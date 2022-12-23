package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgbr extends zzgkm implements zzgmb {
    private zzgbr() {
        super(zzgbs.zzb);
    }

    public final zzgbr zza(zzgby zzgby) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzgbs.zzi((zzgbs) this.zza, zzgby);
        return this;
    }

    public final zzgbr zzb(zzgem zzgem) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzgbs.zzj((zzgbs) this.zza, zzgem);
        return this;
    }

    public final zzgbr zzc(int i) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        ((zzgbs) this.zza).zze = i;
        return this;
    }

    /* synthetic */ zzgbr(zzgbq zzgbq) {
        super(zzgbs.zzb);
    }
}
