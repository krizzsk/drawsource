package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzggd extends zzgkm implements zzgmb {
    private zzggd() {
        super(zzgge.zzb);
    }

    public final zzggd zza(zzggh zzggh) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzgge.zzh((zzgge) this.zza, zzggh);
        return this;
    }

    public final zzggd zzb(int i) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        ((zzgge) this.zza).zze = 0;
        return this;
    }

    /* synthetic */ zzggd(zzggc zzggc) {
        super(zzgge.zzb);
    }
}
