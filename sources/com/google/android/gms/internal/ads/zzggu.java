package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzggu extends zzgkm implements zzgmb {
    private zzggu() {
        super(zzggv.zzb);
    }

    public final zzggu zza(zzgji zzgji) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        ((zzggv) this.zza).zzf = zzgji;
        return this;
    }

    public final zzggu zzb(int i) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        ((zzggv) this.zza).zze = 0;
        return this;
    }

    /* synthetic */ zzggu(zzggt zzggt) {
        super(zzggv.zzb);
    }
}
