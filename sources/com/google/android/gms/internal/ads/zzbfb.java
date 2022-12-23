package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzbfb extends zzgkm implements zzgmb {
    private zzbfb() {
        super(zzbfc.zzb);
    }

    public final zzbdy zza() {
        return ((zzbfc) this.zza).zza();
    }

    public final zzbeu zzb() {
        return ((zzbfc) this.zza).zzc();
    }

    public final zzbfb zzc(Iterable iterable) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzbfc.zzh((zzbfc) this.zza, iterable);
        return this;
    }

    public final zzbfb zzd() {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        ((zzbfc) this.zza).zzk = zzbfc.zzaI();
        return this;
    }

    public final zzbfb zze(zzbdx zzbdx) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzbfc.zzk((zzbfc) this.zza, (zzbdy) zzbdx.zzal());
        return this;
    }

    public final zzbfb zzf(zzbeh zzbeh) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzbfc.zzn((zzbfc) this.zza, zzbeh);
        return this;
    }

    public final zzbfb zzg(zzbet zzbet) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzbfc.zzj((zzbfc) this.zza, (zzbeu) zzbet.zzal());
        return this;
    }

    public final zzbfb zzh(String str) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzbfc.zzg((zzbfc) this.zza, str);
        return this;
    }

    public final zzbfb zzi(zzbga zzbga) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzbfc.zzl((zzbfc) this.zza, zzbga);
        return this;
    }

    public final zzbfb zzj(zzbhh zzbhh) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzbfc.zzm((zzbfc) this.zza, zzbhh);
        return this;
    }

    public final String zzk() {
        return ((zzbfc) this.zza).zzf();
    }

    /* synthetic */ zzbfb(zzbdt zzbdt) {
        super(zzbfc.zzb);
    }
}
