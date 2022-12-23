package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzggj extends zzgkm implements zzgmb {
    private zzggj() {
        super(zzggk.zzb);
    }

    public final zzggj zza(zzggn zzggn) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzggk.zzh((zzggk) this.zza, zzggn);
        return this;
    }

    public final zzggj zzb(int i) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        ((zzggk) this.zza).zze = 0;
        return this;
    }

    /* synthetic */ zzggj(zzggi zzggi) {
        super(zzggk.zzb);
    }
}
