package com.google.android.gms.internal.ads;

import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdsq implements zzbpb {
    private final zzdda zza;
    private final zzcax zzb;
    private final String zzc;
    private final String zzd;

    public zzdsq(zzdda zzdda, zzfbl zzfbl) {
        this.zza = zzdda;
        this.zzb = zzfbl.zzm;
        this.zzc = zzfbl.zzk;
        this.zzd = zzfbl.zzl;
    }

    @ParametersAreNonnullByDefault
    public final void zza(zzcax zzcax) {
        int i;
        String str;
        zzcax zzcax2 = this.zzb;
        if (zzcax2 != null) {
            zzcax = zzcax2;
        }
        if (zzcax != null) {
            str = zzcax.zza;
            i = zzcax.zzb;
        } else {
            i = 1;
            str = "";
        }
        this.zza.zzd(new zzcai(str, i), this.zzc, this.zzd);
    }

    public final void zzb() {
        this.zza.zze();
    }

    public final void zzc() {
        this.zza.zzf();
    }
}
