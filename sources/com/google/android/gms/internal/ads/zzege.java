package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzas;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzege implements zzefd {
    private final zzcws zza;
    private final Context zzb;
    private final zzdtp zzc;
    private final zzfcd zzd;
    private final Executor zze;
    private final zzfok zzf;

    public zzege(zzcws zzcws, Context context, Executor executor, zzdtp zzdtp, zzfcd zzfcd, zzfok zzfok) {
        this.zzb = context;
        this.zza = zzcws;
        this.zze = executor;
        this.zzc = zzdtp;
        this.zzd = zzfcd;
        this.zzf = zzfok;
    }

    public final zzfvl zza(zzfbx zzfbx, zzfbl zzfbl) {
        return zzfvc.zzn(zzfvc.zzi((Object) null), new zzefy(this, zzfbx, zzfbl), this.zze);
    }

    public final boolean zzb(zzfbx zzfbx, zzfbl zzfbl) {
        zzfbq zzfbq = zzfbl.zzt;
        return (zzfbq == null || zzfbq.zza == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zzc(zzfbx zzfbx, zzfbl zzfbl, Object obj) throws Exception {
        View view;
        zzq zza2 = zzfch.zza(this.zzb, zzfbl.zzv);
        zzcli zza3 = this.zzc.zza(zza2, zzfbl, zzfbx.zzb.zzb);
        zza3.zzab(zzfbl.zzX);
        if (!((Boolean) zzay.zzc().zzb(zzbhz.zzgB)).booleanValue() || !zzfbl.zzai) {
            view = new zzdts(this.zzb, (View) zza3, (zzas) this.zzf.apply(zzfbl));
        } else {
            view = zzcxj.zza(this.zzb, (View) zza3, zzfbl);
        }
        zzcvw zza4 = this.zza.zza(new zzcym(zzfbx, zzfbl, (String) null), new zzcwc(view, zza3, new zzefz(zza3), zzfch.zzc(zza2)));
        zza4.zzj().zzi(zza3, false, (zzbop) null);
        zza4.zzc().zzj(new zzega(zza3), zzcfv.zzf);
        zza4.zzj();
        zzfbq zzfbq = zzfbl.zzt;
        zzfvl zzj = zzdto.zzj(zza3, zzfbq.zzb, zzfbq.zza);
        if (zzfbl.zzN) {
            zzj.zzc(new zzegb(zza3), this.zze);
        }
        zzj.zzc(new zzegc(this, zza3), this.zze);
        return zzfvc.zzm(zzj, new zzegd(zza4), zzcfv.zzf);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(zzcli zzcli) {
        zzcli.zzaa();
        zzcme zzs = zzcli.zzs();
        zzff zzff = this.zzd.zza;
        if (zzff != null && zzs != null) {
            zzs.zzs(zzff);
        }
    }
}
