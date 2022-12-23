package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdaz {
    private final zzfgf zza;
    private final zzcfo zzb;
    private final ApplicationInfo zzc;
    private final String zzd;
    private final List zze;
    private final PackageInfo zzf;
    private final zzgqo zzg;
    private final String zzh;
    private final zzetj zzi;

    public zzdaz(zzfgf zzfgf, zzcfo zzcfo, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, zzgqo zzgqo, zzg zzg2, String str2, zzetj zzetj) {
        this.zza = zzfgf;
        this.zzb = zzcfo;
        this.zzc = applicationInfo;
        this.zzd = str;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = zzgqo;
        this.zzh = str2;
        this.zzi = zzetj;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzbzv zza(zzfvl zzfvl) throws Exception {
        return new zzbzv((Bundle) zzfvl.get(), this.zzb, this.zzc, this.zzd, this.zze, this.zzf, (String) ((zzfvl) this.zzg.zzb()).get(), this.zzh, (zzfdv) null, (String) null);
    }

    public final zzfvl zzb() {
        zzfgf zzfgf = this.zza;
        return zzffp.zzc(this.zzi.zza(new Bundle()), zzffz.SIGNALS, zzfgf).zza();
    }

    public final zzfvl zzc() {
        zzfvl zzb2 = zzb();
        return this.zza.zza(zzffz.REQUEST_PARCEL, zzb2, (zzfvl) this.zzg.zzb()).zza(new zzday(this, zzb2)).zza();
    }
}
