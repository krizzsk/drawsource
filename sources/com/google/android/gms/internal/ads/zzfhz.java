package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfhz extends zzgkm implements zzgmb {
    private zzfhz() {
        super(zzfic.zzb);
    }

    public final int zza() {
        return ((zzfic) this.zza).zza();
    }

    public final zzfhz zzb(zzfia zzfia) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzfic.zzf((zzfic) this.zza, (zzfib) zzfia.zzal());
        return this;
    }

    public final zzfhz zzc() {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        ((zzfic) this.zza).zze = zzfic.zzaJ();
        return this;
    }

    /* synthetic */ zzfhz(zzfhy zzfhy) {
        super(zzfic.zzb);
    }
}
