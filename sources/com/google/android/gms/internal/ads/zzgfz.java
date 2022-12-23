package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgfz extends zzgkm implements zzgmb {
    private zzgfz() {
        super(zzgga.zzb);
    }

    public final zzgfz zza(int i) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        ((zzgga) this.zza).zzg = i;
        return this;
    }

    public final zzgfz zzb(String str) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzgga.zzd((zzgga) this.zza, str);
        return this;
    }

    public final zzgfz zzc(int i) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        ((zzgga) this.zza).zzh = zzggp.zza(i);
        return this;
    }

    public final zzgfz zzd(int i) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        ((zzgga) this.zza).zzf = zzgfl.zza(i);
        return this;
    }

    /* synthetic */ zzgfz(zzgfx zzgfx) {
        super(zzgga.zzb);
    }
}
