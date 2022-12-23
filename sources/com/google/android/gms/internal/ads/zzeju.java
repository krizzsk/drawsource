package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzeju implements zzefl {
    private final Context zza;
    /* access modifiers changed from: private */
    public final Executor zzb;
    private final zzdsy zzc;

    public zzeju(Context context, Executor executor, zzdsy zzdsy) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdsy;
    }

    /* access modifiers changed from: private */
    public static final void zze(zzfbx zzfbx, zzfbl zzfbl, zzefg zzefg) {
        try {
            ((zzfcy) zzefg.zzb).zzk(zzfbx.zza.zza.zzd, zzfbl.zzw.toString());
        } catch (Exception e) {
            zze.zzk("Fail to load ad from adapter ".concat(String.valueOf(zzefg.zza)), e);
        }
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfbx zzfbx, zzfbl zzfbl, zzefg zzefg) throws zzfci, zzeit {
        zzdsu zze = this.zzc.zze(new zzcym(zzfbx, zzfbl, zzefg.zza), new zzdsv(new zzejq(zzefg)));
        zze.zzd().zzj(new zzctj((zzfcy) zzefg.zzb), this.zzb);
        zzdda zze2 = zze.zze();
        zzdbr zzb2 = zze.zzb();
        ((zzeha) zzefg.zzc).zzc(new zzejt(this, zze.zza(), zzb2, zze2, zze.zzg()));
        return zze.zzk();
    }

    public final void zzb(zzfbx zzfbx, zzfbl zzfbl, zzefg zzefg) throws zzfci {
        if (!((zzfcy) zzefg.zzb).zzA()) {
            ((zzeha) zzefg.zzc).zzd(new zzejs(this, zzfbx, zzfbl, zzefg));
            ((zzfcy) zzefg.zzb).zzh(this.zza, zzfbx.zza.zza.zzd, (String) null, (zzcaw) zzefg.zzc, zzfbl.zzw.toString());
            return;
        }
        zze(zzfbx, zzfbl, zzefg);
    }
}
