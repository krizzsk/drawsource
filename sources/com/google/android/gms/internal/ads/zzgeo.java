package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgeo extends zzgkm implements zzgmb {
    private zzgeo() {
        super(zzgep.zzb);
    }

    public final zzgeo zza(int i) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        ((zzgep) this.zza).zzf = i;
        return this;
    }

    public final zzgeo zzb(zzges zzges) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzgep.zzh((zzgep) this.zza, zzges);
        return this;
    }

    /* synthetic */ zzgeo(zzgen zzgen) {
        super(zzgep.zzb);
    }
}
