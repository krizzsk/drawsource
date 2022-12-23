package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzeij extends zzeii {
    private final zzcnf zza;
    private final zzdbd zzb;
    private final zzekr zzc;
    private final zzdhf zzd;
    private final zzdlp zze;
    private final zzdei zzf;
    private final ViewGroup zzg;
    private final zzdgo zzh;

    public zzeij(zzcnf zzcnf, zzdbd zzdbd, zzekr zzekr, zzdhf zzdhf, zzdlp zzdlp, zzdei zzdei, ViewGroup viewGroup, zzdgo zzdgo) {
        this.zza = zzcnf;
        this.zzb = zzdbd;
        this.zzc = zzekr;
        this.zzd = zzdhf;
        this.zze = zzdlp;
        this.zzf = zzdei;
        this.zzg = viewGroup;
        this.zzh = zzdgo;
    }

    /* access modifiers changed from: protected */
    public final zzfvl zzc(zzfcd zzfcd, Bundle bundle) {
        zzcwr zze2 = this.zza.zze();
        zzdbd zzdbd = this.zzb;
        zzdbd.zzf(zzfcd);
        zzdbd.zzd(bundle);
        zze2.zzi(zzdbd.zzg());
        zze2.zzf(this.zzd);
        zze2.zze(this.zzc);
        zze2.zzd(this.zze);
        zze2.zzg(new zzcxp(this.zzf, this.zzh));
        zze2.zzc(new zzcvs(this.zzg));
        zzcza zzd2 = zze2.zzj().zzd();
        return zzd2.zzh(zzd2.zzi());
    }
}
