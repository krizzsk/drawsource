package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzeig extends zzeii {
    private final zzcnf zza;
    private final zzdlp zzb;
    private final zzdbd zzc;
    private final zzdhf zzd;

    public zzeig(zzcnf zzcnf, zzdlp zzdlp, zzdbd zzdbd, zzdhf zzdhf) {
        this.zza = zzcnf;
        this.zzb = zzdlp;
        this.zzc = zzdbd;
        this.zzd = zzdhf;
    }

    /* access modifiers changed from: protected */
    public final zzfvl zzc(zzfcd zzfcd, Bundle bundle) {
        zzdlt zzh = this.zza.zzh();
        zzdbd zzdbd = this.zzc;
        zzdbd.zzf(zzfcd);
        zzdbd.zzd(bundle);
        zzh.zzf(zzdbd.zzg());
        zzh.zze(this.zzd);
        zzh.zzd(this.zzb);
        zzh.zzc(new zzcvs((ViewGroup) null));
        zzcza zza2 = zzh.zzg().zza();
        return zza2.zzh(zza2.zzi());
    }
}
