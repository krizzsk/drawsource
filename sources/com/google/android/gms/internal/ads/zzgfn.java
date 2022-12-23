package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgfn extends zzgkm implements zzgmb {
    private zzgfn() {
        super(zzgfo.zzb);
    }

    public final zzgfn zza(String str) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzgfo.zzg((zzgfo) this.zza, str);
        return this;
    }

    public final zzgfn zzb(zzgji zzgji) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        ((zzgfo) this.zza).zzf = zzgji;
        return this;
    }

    public final zzgfn zzc(int i) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        ((zzgfo) this.zza).zzg = zzggp.zza(i);
        return this;
    }

    /* synthetic */ zzgfn(zzgfm zzgfm) {
        super(zzgfo.zzb);
    }
}
