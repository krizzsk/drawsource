package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgfy extends zzgkm implements zzgmb {
    private zzgfy() {
        super(zzggb.zzb);
    }

    public final zzgfy zza(zzgga zzgga) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzggb.zze((zzggb) this.zza, zzgga);
        return this;
    }

    public final zzgfy zzb(int i) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        ((zzggb) this.zza).zze = i;
        return this;
    }

    /* synthetic */ zzgfy(zzgfx zzgfx) {
        super(zzggb.zzb);
    }
}
