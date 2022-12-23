package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzcpr {
    private zzcni zza;
    private zzcre zzb;
    private zzfgj zzc;
    private zzcrr zzd;
    private zzfdd zze;

    private zzcpr() {
    }

    /* synthetic */ zzcpr(zzcpq zzcpq) {
    }

    public final zzcnf zza() {
        zzgrc.zzc(this.zza, zzcni.class);
        zzgrc.zzc(this.zzb, zzcre.class);
        if (this.zzc == null) {
            this.zzc = new zzfgj();
        }
        if (this.zzd == null) {
            this.zzd = new zzcrr();
        }
        if (this.zze == null) {
            this.zze = new zzfdd();
        }
        return new zzcop(this.zza, this.zzb, this.zzc, this.zzd, this.zze, (zzcoo) null);
    }

    public final zzcpr zzb(zzcni zzcni) {
        this.zza = zzcni;
        return this;
    }

    public final zzcpr zzc(zzcre zzcre) {
        this.zzb = zzcre;
        return this;
    }
}
