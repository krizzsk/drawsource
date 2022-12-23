package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzehg implements zzefd {
    private final Context zza;
    private final zzdtp zzb;
    private final zzdky zzc;
    private final zzfcd zzd;
    private final Executor zze;
    private final zzcfo zzf;
    private final zzbop zzg;
    private final boolean zzh = ((Boolean) zzay.zzc().zzb(zzbhz.zzhu)).booleanValue();

    public zzehg(Context context, zzcfo zzcfo, zzfcd zzfcd, Executor executor, zzdky zzdky, zzdtp zzdtp, zzbop zzbop) {
        this.zza = context;
        this.zzd = zzfcd;
        this.zzc = zzdky;
        this.zze = executor;
        this.zzf = zzcfo;
        this.zzb = zzdtp;
        this.zzg = zzbop;
    }

    public final zzfvl zza(zzfbx zzfbx, zzfbl zzfbl) {
        zzdtt zzdtt = new zzdtt();
        zzfvl zzn = zzfvc.zzn(zzfvc.zzi((Object) null), new zzehb(this, zzfbl, zzfbx, zzdtt), this.zze);
        zzn.zzc(new zzehc(zzdtt), this.zze);
        return zzn;
    }

    public final boolean zzb(zzfbx zzfbx, zzfbl zzfbl) {
        zzfbq zzfbq = zzfbl.zzt;
        return (zzfbq == null || zzfbq.zza == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zzc(zzfbl zzfbl, zzfbx zzfbx, zzdtt zzdtt, Object obj) throws Exception {
        zzfbl zzfbl2 = zzfbl;
        zzfbx zzfbx2 = zzfbx;
        zzcli zza2 = this.zzb.zza(this.zzd.zze, zzfbl2, zzfbx2.zzb.zzb);
        zza2.zzab(zzfbl2.zzX);
        zzdtt.zza(this.zza, (View) zza2);
        zzcga zzcga = new zzcga();
        zzdky zzdky = this.zzc;
        zzcym zzcym = new zzcym(zzfbx2, zzfbl2, (String) null);
        zzehf zzehf = r1;
        zzehf zzehf2 = new zzehf(this.zza, this.zzf, zzcga, zzfbl, zza2, this.zzd, this.zzh, this.zzg);
        zzdka zze2 = zzdky.zze(zzcym, new zzdkd(zzehf, zza2));
        zzcga.zzd(zze2);
        zze2.zzc().zzj(new zzehd(zza2), zzcfv.zzf);
        zze2.zzk().zzi(zza2, true, this.zzh ? this.zzg : null);
        zze2.zzk();
        zzfbl zzfbl3 = zzfbl;
        zzfbq zzfbq = zzfbl3.zzt;
        return zzfvc.zzm(zzdto.zzj(zza2, zzfbq.zzb, zzfbq.zza), new zzehe(this, zza2, zzfbl3, zze2), this.zze);
    }
}
