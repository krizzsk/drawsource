package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgel extends zzgkm implements zzgmb {
    private zzgel() {
        super(zzgem.zzb);
    }

    public final zzgel zza(zzgji zzgji) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        ((zzgem) this.zza).zzg = zzgji;
        return this;
    }

    public final zzgel zzb(zzges zzges) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzgem.zzj((zzgem) this.zza, zzges);
        return this;
    }

    public final zzgel zzc(int i) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        ((zzgem) this.zza).zze = 0;
        return this;
    }

    /* synthetic */ zzgel(zzgek zzgek) {
        super(zzgem.zzb);
    }
}
