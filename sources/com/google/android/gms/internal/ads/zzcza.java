package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzcza {
    private final zzeat zza;
    private final zzfcd zzb;
    private final zzfgf zzc;
    private final zzcsn zzd;
    private final zzeiv zze;
    /* access modifiers changed from: private */
    public final zzdgx zzf;
    private zzfbx zzg;
    private final zzebx zzh;
    private final zzdaz zzi;
    private final Executor zzj;
    private final zzebk zzk;
    private final zzefi zzl;

    zzcza(zzeat zzeat, zzfcd zzfcd, zzfgf zzfgf, zzcsn zzcsn, zzeiv zzeiv, zzdgx zzdgx, zzfbx zzfbx, zzebx zzebx, zzdaz zzdaz, Executor executor, zzebk zzebk, zzefi zzefi) {
        this.zza = zzeat;
        this.zzb = zzfcd;
        this.zzc = zzfgf;
        this.zzd = zzcsn;
        this.zze = zzeiv;
        this.zzf = zzdgx;
        this.zzg = zzfbx;
        this.zzh = zzebx;
        this.zzi = zzdaz;
        this.zzj = executor;
        this.zzk = zzebk;
        this.zzl = zzefi;
    }

    public final zze zza(Throwable th) {
        return zzfdc.zzb(th, this.zzl);
    }

    public final zzdgx zzc() {
        return this.zzf;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfbx zzd(zzfbx zzfbx) throws Exception {
        this.zzd.zza(zzfbx);
        return zzfbx;
    }

    public final zzfvl zze(zzfdv zzfdv) {
        zzffk zza2 = this.zzc.zzb(zzffz.GET_CACHE_KEY, this.zzi.zzc()).zzf(new zzcyx(this, zzfdv)).zza();
        zzfvc.zzr(zza2, new zzcyy(this), this.zzj);
        return zza2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zzf(zzfdv zzfdv, zzbzv zzbzv) throws Exception {
        zzbzv.zzi = zzfdv;
        return this.zzh.zza(zzbzv);
    }

    public final zzfvl zzg(zzbzv zzbzv) {
        zzffk zza2 = this.zzc.zzb(zzffz.NOTIFY_CACHE_HIT, this.zzh.zzf(zzbzv)).zza();
        zzfvc.zzr(zza2, new zzcyz(this), this.zzj);
        return zza2;
    }

    public final zzfvl zzh(zzfvl zzfvl) {
        zzffw zzf2 = this.zzc.zzb(zzffz.RENDERER, zzfvl).zze(new zzcyw(this)).zzf(this.zze);
        if (!((Boolean) zzay.zzc().zzb(zzbhz.zzex)).booleanValue()) {
            zzf2 = zzf2.zzi((long) ((Integer) zzay.zzc().zzb(zzbhz.zzey)).intValue(), TimeUnit.SECONDS);
        }
        return zzf2.zza();
    }

    public final zzfvl zzi() {
        zzl zzl2 = this.zzb.zzd;
        if (zzl2.zzx == null && zzl2.zzs == null) {
            return zzj(this.zzi.zzc());
        }
        zzfgf zzfgf = this.zzc;
        return zzffp.zzc(this.zza.zza(), zzffz.PRELOADED_LOADER, zzfgf).zza();
    }

    public final zzfvl zzj(zzfvl zzfvl) {
        if (this.zzg != null) {
            zzfgf zzfgf = this.zzc;
            return zzffp.zzc(zzfvc.zzi(this.zzg), zzffz.SERVER_TRANSACTION, zzfgf).zza();
        }
        zzt.zzc().zzj();
        return this.zzc.zzb(zzffz.SERVER_TRANSACTION, zzfvl).zzf(new zzcyv(this.zzk)).zza();
    }

    public final void zzk(zzfbx zzfbx) {
        this.zzg = zzfbx;
    }
}
