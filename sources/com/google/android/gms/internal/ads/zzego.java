package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzego implements zzefl {
    private final Context zza;
    private final zzcws zzb;
    /* access modifiers changed from: private */
    public View zzc;
    /* access modifiers changed from: private */
    public zzbuj zzd;

    public zzego(Context context, zzcws zzcws) {
        this.zza = context;
        this.zzb = zzcws;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfbx zzfbx, zzfbl zzfbl, zzefg zzefg) throws zzfci, zzeit {
        View view;
        if (!((Boolean) zzay.zzc().zzb(zzbhz.zzgB)).booleanValue() || !zzfbl.zzai) {
            view = this.zzc;
        } else {
            try {
                view = (View) ObjectWrapper.unwrap(this.zzd.zze());
                boolean zzf = this.zzd.zzf();
                if (view == null) {
                    throw new zzfci(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                } else if (zzf) {
                    try {
                        view = (View) zzfvc.zzn(zzfvc.zzi((Object) null), new zzegk(this, view, zzfbl), zzcfv.zze).get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new zzfci(e);
                    }
                }
            } catch (RemoteException e2) {
                throw new zzfci(e2);
            }
        }
        zzcvw zza2 = this.zzb.zza(new zzcym(zzfbx, zzfbl, zzefg.zza), new zzcwc(view, (zzcli) null, new zzegl(zzefg), (zzfbm) zzfbl.zzv.get(0)));
        zza2.zzg().zza(view);
        ((zzegz) zzefg.zzc).zzc(zza2.zzh());
        return zza2.zza();
    }

    public final void zzb(zzfbx zzfbx, zzfbl zzfbl, zzefg zzefg) throws zzfci {
        try {
            ((zzbvt) zzefg.zzb).zzp(zzfbl.zzaa);
            if (!((Boolean) zzay.zzc().zzb(zzbhz.zzgB)).booleanValue() || !zzfbl.zzai) {
                ((zzbvt) zzefg.zzb).zzi(zzfbl.zzV, zzfbl.zzw.toString(), zzfbx.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzegn(this, zzefg, (zzegm) null), (zzbug) zzefg.zzc, zzfbx.zza.zza.zze);
            } else {
                ((zzbvt) zzefg.zzb).zzj(zzfbl.zzV, zzfbl.zzw.toString(), zzfbx.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzegn(this, zzefg, (zzegm) null), (zzbug) zzefg.zzc, zzfbx.zza.zza.zze);
            }
        } catch (RemoteException e) {
            throw new zzfci(e);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zzc(View view, zzfbl zzfbl, Object obj) throws Exception {
        return zzfvc.zzi(zzcxj.zza(this.zza, view, zzfbl));
    }
}
