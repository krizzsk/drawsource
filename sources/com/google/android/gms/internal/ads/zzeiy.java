package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzeiy implements zzefl {
    private final Context zza;
    private final Executor zzb;
    private final zzdsy zzc;

    public zzeiy(Context context, Executor executor, zzdsy zzdsy) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdsy;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfbx zzfbx, zzfbl zzfbl, zzefg zzefg) throws zzfci, zzeit {
        zzdsu zze = this.zzc.zze(new zzcym(zzfbx, zzfbl, zzefg.zza), new zzdsv(new zzeix(zzefg)));
        zze.zzd().zzj(new zzctj((zzfcy) zzefg.zzb), this.zzb);
        ((zzegz) zzefg.zzc).zzc(zze.zzm());
        return zze.zzk();
    }

    public final void zzb(zzfbx zzfbx, zzfbl zzfbl, zzefg zzefg) throws zzfci {
        try {
            zzfcd zzfcd = zzfbx.zza.zza;
            if (zzfcd.zzo.zza == 3) {
                ((zzfcy) zzefg.zzb).zzq(this.zza, zzfcd.zzd, zzfbl.zzw.toString(), (zzbug) zzefg.zzc);
            } else {
                ((zzfcy) zzefg.zzb).zzp(this.zza, zzfcd.zzd, zzfbl.zzw.toString(), (zzbug) zzefg.zzc);
            }
        } catch (Exception e) {
            zze.zzk("Fail to load ad from adapter ".concat(String.valueOf(zzefg.zza)), e);
        }
    }
}
