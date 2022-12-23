package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgbi extends zzgkm implements zzgmb {
    private zzgbi() {
        super(zzgbj.zzb);
    }

    public final zzgbi zza(zzgji zzgji) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        ((zzgbj) this.zza).zzf = zzgji;
        return this;
    }

    public final zzgbi zzb(zzgbp zzgbp) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzgbj.zzj((zzgbj) this.zza, zzgbp);
        return this;
    }

    public final zzgbi zzc(int i) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        ((zzgbj) this.zza).zze = 0;
        return this;
    }

    /* synthetic */ zzgbi(zzgbh zzgbh) {
        super(zzgbj.zzb);
    }
}
