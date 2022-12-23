package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzbu;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzehz implements zzefl {
    private final Context zza;
    private final zzdlu zzb;
    private final Executor zzc;

    public zzehz(Context context, zzdlu zzdlu, Executor executor) {
        this.zza = context;
        this.zzb = zzdlu;
        this.zzc = executor;
    }

    private static final boolean zzc(zzfbx zzfbx, int i) {
        return zzfbx.zza.zza.zzg.contains(Integer.toString(i));
    }

    public final /* bridge */ /* synthetic */ Object zza(zzfbx zzfbx, zzfbl zzfbl, zzefg zzefg) throws zzfci, zzeit {
        zzdnh zzdnh;
        zzbul zzB = ((zzfcy) zzefg.zzb).zzB();
        zzbum zzC = ((zzfcy) zzefg.zzb).zzC();
        zzbup zzd = ((zzfcy) zzefg.zzb).zzd();
        if (zzd != null && zzc(zzfbx, 6)) {
            zzdnh = zzdnh.zzs(zzd);
        } else if (zzB != null && zzc(zzfbx, 6)) {
            zzdnh = zzdnh.zzad(zzB);
        } else if (zzB != null && zzc(zzfbx, 2)) {
            zzdnh = zzdnh.zzab(zzB);
        } else if (zzC != null && zzc(zzfbx, 6)) {
            zzdnh = zzdnh.zzae(zzC);
        } else if (zzC == null || !zzc(zzfbx, 1)) {
            throw new zzeit(1, "No native ad mappers");
        } else {
            zzdnh = zzdnh.zzac(zzC);
        }
        if (zzfbx.zza.zza.zzg.contains(Integer.toString(zzdnh.zzc()))) {
            zzdnj zze = this.zzb.zze(new zzcym(zzfbx, zzfbl, zzefg.zza), new zzdnt(zzdnh), new zzdph(zzC, zzB, zzd, (byte[]) null));
            ((zzegz) zzefg.zzc).zzc(zze.zzi());
            zze.zzd().zzj(new zzctj((zzfcy) zzefg.zzb), this.zzc);
            return zze.zza();
        }
        throw new zzeit(1, "No corresponding native ad listener");
    }

    public final void zzb(zzfbx zzfbx, zzfbl zzfbl, zzefg zzefg) throws zzfci {
        zzfcd zzfcd = zzfbx.zza.zza;
        ((zzfcy) zzefg.zzb).zzo(this.zza, zzfbx.zza.zza.zzd, zzfbl.zzw.toString(), zzbu.zzl(zzfbl.zzt), (zzbug) zzefg.zzc, zzfcd.zzi, zzfcd.zzg);
    }
}
