package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgcg extends zzgkm implements zzgmb {
    private zzgcg() {
        super(zzgch.zzb);
    }

    public final zzgcg zza(zzgji zzgji) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        ((zzgch) this.zza).zzg = zzgji;
        return this;
    }

    public final zzgcg zzb(zzgcn zzgcn) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzgch.zzi((zzgch) this.zza, zzgcn);
        return this;
    }

    public final zzgcg zzc(int i) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        ((zzgch) this.zza).zze = 0;
        return this;
    }

    /* synthetic */ zzgcg(zzgcf zzgcf) {
        super(zzgch.zzb);
    }
}
