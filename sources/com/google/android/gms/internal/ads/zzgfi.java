package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgfi extends zzgkm implements zzgmb {
    private zzgfi() {
        super(zzgfj.zzb);
    }

    public final zzgfi zza(String str) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        ((zzgfj) this.zza).zze = str;
        return this;
    }

    public final zzgfi zzb(zzgji zzgji) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        ((zzgfj) this.zza).zzf = zzgji;
        return this;
    }

    public final zzgfi zzc(int i) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        ((zzgfj) this.zza).zzg = i - 2;
        return this;
    }

    /* synthetic */ zzgfi(zzgfh zzgfh) {
        super(zzgfj.zzb);
    }
}
