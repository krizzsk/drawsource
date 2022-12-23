package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgcj extends zzgkm implements zzgmb {
    private zzgcj() {
        super(zzgck.zzb);
    }

    public final zzgcj zza(int i) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        ((zzgck) this.zza).zzf = i;
        return this;
    }

    public final zzgcj zzb(zzgcn zzgcn) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzgck.zzg((zzgck) this.zza, zzgcn);
        return this;
    }

    /* synthetic */ zzgcj(zzgci zzgci) {
        super(zzgck.zzb);
    }
}
