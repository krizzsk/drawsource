package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgca extends zzgkm implements zzgmb {
    private zzgca() {
        super(zzgcb.zzb);
    }

    public final zzgca zza(int i) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        ((zzgcb) this.zza).zzf = i;
        return this;
    }

    public final zzgca zzb(zzgce zzgce) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzgcb.zzh((zzgcb) this.zza, zzgce);
        return this;
    }

    /* synthetic */ zzgca(zzgbz zzgbz) {
        super(zzgcb.zzb);
    }
}
