package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.nonagon.signalgeneration.zzac;
import com.google.android.gms.ads.nonagon.signalgeneration.zzg;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzesn implements zzetg {
    private final String zza;
    private final zzfvm zzb;
    private final ScheduledExecutorService zzc;
    private final Context zzd;
    private final zzfcd zze;
    private final zzcnf zzf;

    zzesn(zzfvm zzfvm, ScheduledExecutorService scheduledExecutorService, String str, Context context, zzfcd zzfcd, zzcnf zzcnf) {
        this.zzb = zzfvm;
        this.zzc = scheduledExecutorService;
        this.zza = str;
        this.zzd = context;
        this.zze = zzfcd;
        this.zzf = zzcnf;
    }

    public static /* synthetic */ zzfvl zzc(zzesn zzesn) {
        String str = zzesn.zza;
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzgd)).booleanValue()) {
            str = AdFormat.UNKNOWN.name();
        }
        zzg zzn = zzesn.zzf.zzn();
        zzdbd zzdbd = new zzdbd();
        zzdbd.zzc(zzesn.zzd);
        zzfcb zzfcb = new zzfcb();
        zzfcb.zzs("adUnitId");
        zzfcb.zzE(zzesn.zze.zzd);
        zzfcb.zzr(new zzq());
        zzdbd.zzf(zzfcb.zzG());
        zzn.zza(zzdbd.zzg());
        zzac zzac = new zzac();
        zzac.zza(str);
        zzn.zzb(zzac.zzb());
        new zzdhd();
        return zzfvc.zzf(zzfvc.zzm((zzfut) zzfvc.zzo(zzfut.zzv(zzn.zzc().zzc()), ((Long) zzay.zzc().zzb(zzbhz.zzge)).longValue(), TimeUnit.MILLISECONDS, zzesn.zzc), zzesl.zza, zzesn.zzb), Exception.class, zzesm.zza, zzesn.zzb);
    }

    public final int zza() {
        return 33;
    }

    public final zzfvl zzb() {
        if (!((Boolean) zzay.zzc().zzb(zzbhz.zzgc)).booleanValue() || "adUnitId".equals(this.zze.zzf)) {
            return this.zzb.zzb(zzesj.zza);
        }
        return zzfvc.zzl(new zzesk(this), this.zzb);
    }
}
