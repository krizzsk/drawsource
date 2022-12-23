package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgpc extends zzgkm implements zzgmb {
    private zzgpc() {
        super(zzgpe.zzb);
    }

    public final zzgpc zza(zzgji zzgji) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzgpe.zze((zzgpe) this.zza, zzgji);
        return this;
    }

    public final zzgpc zzb(String str) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzgpe.zzd((zzgpe) this.zza, "image/png");
        return this;
    }

    public final zzgpc zzc(int i) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzgpe.zzf((zzgpe) this.zza, 2);
        return this;
    }

    /* synthetic */ zzgpc(zzgoc zzgoc) {
        super(zzgpe.zzb);
    }
}
