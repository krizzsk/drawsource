package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzeho implements zzefl {
    private final Context zza;
    private final zzdky zzb;

    public zzeho(Context context, zzdky zzdky) {
        this.zza = context;
        this.zzb = zzdky;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfbx zzfbx, zzfbl zzfbl, zzefg zzefg) throws zzfci, zzeit {
        zzehi zzehi = new zzehi(zzfbl, (zzbvt) zzefg.zzb, false);
        zzdka zze = this.zzb.zze(new zzcym(zzfbx, zzfbl, zzefg.zza), new zzdkd(zzehi, (zzcli) null));
        zzehi.zzb(zze.zzc());
        ((zzegz) zzefg.zzc).zzc(zze.zzh());
        return zze.zzg();
    }

    public final void zzb(zzfbx zzfbx, zzfbl zzfbl, zzefg zzefg) throws zzfci {
        try {
            ((zzbvt) zzefg.zzb).zzp(zzfbl.zzaa);
            ((zzbvt) zzefg.zzb).zzk(zzfbl.zzV, zzfbl.zzw.toString(), zzfbx.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzehn(this, zzefg, (zzehm) null), (zzbug) zzefg.zzc);
        } catch (RemoteException e) {
            throw new zzfci(e);
        }
    }
}
