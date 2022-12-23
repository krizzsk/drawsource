package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzejc implements zzefl {
    private final Context zza;
    private final zzdsy zzb;

    public zzejc(Context context, zzdsy zzdsy) {
        this.zza = context;
        this.zzb = zzdsy;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfbx zzfbx, zzfbl zzfbl, zzefg zzefg) throws zzfci, zzeit {
        zzehi zzehi = new zzehi(zzfbl, (zzbvt) zzefg.zzb, true);
        zzdsu zze = this.zzb.zze(new zzcym(zzfbx, zzfbl, zzefg.zza), new zzdsv(zzehi));
        zzehi.zzb(zze.zzc());
        ((zzegz) zzefg.zzc).zzc(zze.zzn());
        return zze.zzk();
    }

    public final void zzb(zzfbx zzfbx, zzfbl zzfbl, zzefg zzefg) throws zzfci {
        try {
            ((zzbvt) zzefg.zzb).zzp(zzfbl.zzaa);
            if (zzfbx.zza.zza.zzo.zza == 3) {
                ((zzbvt) zzefg.zzb).zzn(zzfbl.zzV, zzfbl.zzw.toString(), zzfbx.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzejb(this, zzefg, (zzeja) null), (zzbug) zzefg.zzc);
            } else {
                ((zzbvt) zzefg.zzb).zzo(zzfbl.zzV, zzfbl.zzw.toString(), zzfbx.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzejb(this, zzefg, (zzeja) null), (zzbug) zzefg.zzc);
            }
        } catch (RemoteException e) {
            zze.zzb("Remote exception loading a rewarded RTB ad", e);
        }
    }
}
