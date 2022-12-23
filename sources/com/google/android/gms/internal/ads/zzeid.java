package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzeid implements zzefl {
    private final Context zza;
    private final zzdlu zzb;
    /* access modifiers changed from: private */
    public zzbup zzc;
    private final zzcfo zzd;

    public zzeid(Context context, zzdlu zzdlu, zzcfo zzcfo) {
        this.zza = context;
        this.zzb = zzdlu;
        this.zzd = zzcfo;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfbx zzfbx, zzfbl zzfbl, zzefg zzefg) throws zzfci, zzeit {
        if (zzfbx.zza.zza.zzg.contains(Integer.toString(6))) {
            zzdnh zzs = zzdnh.zzs(this.zzc);
            if (zzfbx.zza.zza.zzg.contains(Integer.toString(zzs.zzc()))) {
                zzdnj zze = this.zzb.zze(new zzcym(zzfbx, zzfbl, zzefg.zza), new zzdnt(zzs), new zzdph((zzbum) null, (zzbul) null, this.zzc, (byte[]) null));
                ((zzegz) zzefg.zzc).zzc(zze.zzh());
                return zze.zza();
            }
            throw new zzeit(1, "No corresponding native ad listener");
        }
        throw new zzeit(2, "Unified must be used for RTB.");
    }

    public final void zzb(zzfbx zzfbx, zzfbl zzfbl, zzefg zzefg) throws zzfci {
        try {
            ((zzbvt) zzefg.zzb).zzp(zzfbl.zzaa);
            if (this.zzd.zzc < ((Integer) zzay.zzc().zzb(zzbhz.zzbt)).intValue()) {
                ((zzbvt) zzefg.zzb).zzl(zzfbl.zzV, zzfbl.zzw.toString(), zzfbx.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeic(this, zzefg, (zzeib) null), (zzbug) zzefg.zzc);
            } else {
                ((zzbvt) zzefg.zzb).zzm(zzfbl.zzV, zzfbl.zzw.toString(), zzfbx.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeic(this, zzefg, (zzeib) null), (zzbug) zzefg.zzc, zzfbx.zza.zza.zzi);
            }
        } catch (RemoteException e) {
            throw new zzfci(e);
        }
    }
}
