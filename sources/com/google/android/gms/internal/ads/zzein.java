package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzein extends zzeii {
    private final zzcnf zza;
    private final zzdbd zzb;
    private final zzdhf zzc;

    public zzein(zzcnf zzcnf, zzdbd zzdbd, zzdhf zzdhf) {
        this.zza = zzcnf;
        this.zzb = zzdbd;
        this.zzc = zzdhf;
    }

    /* access modifiers changed from: protected */
    public final zzfvl zzc(zzfcd zzfcd, Bundle bundle) {
        zzdsx zzi = this.zza.zzi();
        zzdbd zzdbd = this.zzb;
        zzdbd.zzf(zzfcd);
        zzdbd.zzd(bundle);
        zzi.zzd(zzdbd.zzg());
        zzi.zzc(this.zzc);
        zzcza zzb2 = zzi.zze().zzb();
        return zzb2.zzh(zzb2.zzi());
    }
}
