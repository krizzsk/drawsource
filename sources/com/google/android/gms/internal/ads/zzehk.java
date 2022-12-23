package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzehk implements zzefl {
    private final Context zza;
    private final zzdky zzb;
    private final zzcfo zzc;
    private final Executor zzd;

    public zzehk(Context context, zzcfo zzcfo, zzdky zzdky, Executor executor) {
        this.zza = context;
        this.zzc = zzcfo;
        this.zzb = zzdky;
        this.zzd = executor;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfbx zzfbx, zzfbl zzfbl, zzefg zzefg) throws zzfci, zzeit {
        zzdka zze = this.zzb.zze(new zzcym(zzfbx, zzfbl, zzefg.zza), new zzdkd(new zzehj(this, zzefg), (zzcli) null));
        zze.zzd().zzj(new zzctj((zzfcy) zzefg.zzb), this.zzd);
        ((zzegz) zzefg.zzc).zzc(zze.zzi());
        return zze.zzg();
    }

    public final void zzb(zzfbx zzfbx, zzfbl zzfbl, zzefg zzefg) throws zzfci {
        ((zzfcy) zzefg.zzb).zzn(this.zza, zzfbx.zza.zza.zzd, zzfbl.zzw.toString(), zzbu.zzl(zzfbl.zzt), (zzbug) zzefg.zzc);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzefg zzefg, boolean z, Context context, zzdcg zzdcg) throws zzdlf {
        try {
            ((zzfcy) zzefg.zzb).zzu(z);
            if (this.zzc.zzc < ((Integer) zzay.zzc().zzb(zzbhz.zzaB)).intValue()) {
                ((zzfcy) zzefg.zzb).zzv();
            } else {
                ((zzfcy) zzefg.zzb).zzw(context);
            }
        } catch (zzfci e) {
            zze.zzi("Cannot show interstitial.");
            throw new zzdlf(e.getCause());
        }
    }
}
