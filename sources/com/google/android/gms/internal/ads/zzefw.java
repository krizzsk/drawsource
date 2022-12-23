package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzefw implements zzefd {
    private final zzcuy zza;
    private final Context zzb;
    private final zzdtp zzc;
    private final Executor zzd;

    public zzefw(zzcuy zzcuy, Context context, Executor executor, zzdtp zzdtp) {
        this.zzb = context;
        this.zza = zzcuy;
        this.zzd = executor;
        this.zzc = zzdtp;
    }

    public final zzfvl zza(zzfbx zzfbx, zzfbl zzfbl) {
        return zzfvc.zzn(zzfvc.zzi((Object) null), new zzeft(this, zzfbx, zzfbl), this.zzd);
    }

    public final boolean zzb(zzfbx zzfbx, zzfbl zzfbl) {
        zzfbq zzfbq = zzfbl.zzt;
        return (zzfbq == null || zzfbq.zza == null) ? false : true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zzc(zzfbx zzfbx, zzfbl zzfbl, Object obj) throws Exception {
        zzq zza2 = zzfch.zza(this.zzb, zzfbl.zzv);
        zzcli zza3 = this.zzc.zza(zza2, zzfbl, zzfbx.zzb.zzb);
        zzcuq zza4 = this.zza.zza(new zzcym(zzfbx, zzfbl, (String) null), new zzcur((View) zza3, zza3, zzfch.zzc(zza2), zzfbl.zzab, zzfbl.zzaf, zzfbl.zzP));
        zza4.zzg().zzi(zza3, false, (zzbop) null);
        zza4.zzc().zzj(new zzefu(zza3), zzcfv.zzf);
        zza4.zzg();
        zzfbq zzfbq = zzfbl.zzt;
        return zzfvc.zzm(zzdto.zzj(zza3, zzfbq.zzb, zzfbq.zza), new zzefv(zza4), zzcfv.zzf);
    }
}
