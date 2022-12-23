package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgff extends zzgkm implements zzgmb {
    private zzgff() {
        super(zzgfg.zzb);
    }

    public final zzgff zza(zzgfa zzgfa) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzgfg.zzj((zzgfg) this.zza, zzgfa);
        return this;
    }

    public final zzgff zzb(zzgji zzgji) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        ((zzgfg) this.zza).zzg = zzgji;
        return this;
    }

    public final zzgff zzc(int i) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        ((zzgfg) this.zza).zze = 0;
        return this;
    }

    /* synthetic */ zzgff(zzgfe zzgfe) {
        super(zzgfg.zzb);
    }
}
