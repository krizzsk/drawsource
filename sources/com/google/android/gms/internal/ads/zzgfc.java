package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgfc extends zzgkm implements zzgmb {
    private zzgfc() {
        super(zzgfd.zzb);
    }

    public final zzgfc zza(zzgji zzgji) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        ((zzgfd) this.zza).zzg = zzgji;
        return this;
    }

    public final zzgfc zzb(zzgfg zzgfg) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzgfd.zzi((zzgfd) this.zza, zzgfg);
        return this;
    }

    public final zzgfc zzc(int i) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        ((zzgfd) this.zza).zze = 0;
        return this;
    }

    /* synthetic */ zzgfc(zzgfb zzgfb) {
        super(zzgfd.zzb);
    }
}
