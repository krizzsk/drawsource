package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzeil extends zzeii {
    private final zzcnf zza;
    private final zzdbd zzb;
    private final zzekr zzc;
    private final zzdhf zzd;

    public zzeil(zzcnf zzcnf, zzdbd zzdbd, zzekr zzekr, zzdhf zzdhf) {
        this.zza = zzcnf;
        this.zzb = zzdbd;
        this.zzc = zzekr;
        this.zzd = zzdhf;
    }

    /* access modifiers changed from: protected */
    public final zzfvl zzc(zzfcd zzfcd, Bundle bundle) {
        zzdkx zzg = this.zza.zzg();
        zzdbd zzdbd = this.zzb;
        zzdbd.zzf(zzfcd);
        zzdbd.zzd(bundle);
        zzg.zze(zzdbd.zzg());
        zzg.zzd(this.zzd);
        zzg.zzc(this.zzc);
        zzcza zza2 = zzg.zzf().zza();
        return zza2.zzh(zza2.zzi());
    }
}
