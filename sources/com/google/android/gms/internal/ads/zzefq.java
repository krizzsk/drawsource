package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzefq implements zzefd {
    private final zzcvj zza;
    private final Context zzb;
    private final zzdtp zzc;
    private final zzfcd zzd;
    private final Executor zze;
    private final zzcfo zzf;
    private final zzbop zzg;
    private final boolean zzh = ((Boolean) zzay.zzc().zzb(zzbhz.zzhu)).booleanValue();

    public zzefq(zzcvj zzcvj, Context context, Executor executor, zzdtp zzdtp, zzfcd zzfcd, zzcfo zzcfo, zzbop zzbop) {
        this.zzb = context;
        this.zza = zzcvj;
        this.zze = executor;
        this.zzc = zzdtp;
        this.zzd = zzfcd;
        this.zzf = zzcfo;
        this.zzg = zzbop;
    }

    public final zzfvl zza(zzfbx zzfbx, zzfbl zzfbl) {
        zzdtt zzdtt = new zzdtt();
        zzfvl zzn = zzfvc.zzn(zzfvc.zzi((Object) null), new zzefo(this, zzfbl, zzfbx, zzdtt), this.zze);
        zzn.zzc(new zzefp(zzdtt), this.zze);
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
        zzcli zza2 = this.zzc.zza(this.zzd.zze, zzfbl2, zzfbx2.zzb.zzb);
        zza2.zzab(zzfbl2.zzX);
        zzdtt.zza(this.zzb, (View) zza2);
        zzcga zzcga = new zzcga();
        zzcvj zzcvj = this.zza;
        zzcym zzcym = new zzcym(zzfbx2, zzfbl2, (String) null);
        zzefs zzefs = r1;
        zzefs zzefs2 = new zzefs(this.zzf, zzcga, zzfbl, zza2, this.zzd, this.zzh, this.zzg);
        zzcvg zza3 = zzcvj.zza(zzcym, new zzdkd(zzefs, zza2), new zzcvh(zzfbl2.zzab));
        zza3.zzj().zzi(zza2, false, this.zzh ? this.zzg : null);
        zzcga.zzd(zza3);
        zza3.zzc().zzj(new zzefm(zza2), zzcfv.zzf);
        zza3.zzj();
        zzfbq zzfbq = zzfbl2.zzt;
        return zzfvc.zzm(zzdto.zzj(zza2, zzfbq.zzb, zzfbq.zza), new zzefn(this, zza2, zzfbl2, zza3), this.zze);
    }
}
