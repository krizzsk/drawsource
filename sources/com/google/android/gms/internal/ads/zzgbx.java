package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgbx extends zzgkm implements zzgmb {
    private zzgbx() {
        super(zzgby.zzb);
    }

    public final zzgbx zza(zzgji zzgji) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        ((zzgby) this.zza).zzg = zzgji;
        return this;
    }

    public final zzgbx zzb(zzgce zzgce) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzgby.zzj((zzgby) this.zza, zzgce);
        return this;
    }

    public final zzgbx zzc(int i) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        ((zzgby) this.zza).zze = 0;
        return this;
    }

    /* synthetic */ zzgbx(zzgbw zzgbw) {
        super(zzgby.zzb);
    }
}
