package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfgq implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;
    private final zzgrh zzc;

    public zzfgq(zzgrh zzgrh, zzgrh zzgrh2, zzgrh zzgrh3) {
        this.zza = zzgrh;
        this.zzb = zzgrh2;
        this.zzc = zzgrh3;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Object obj;
        zzgqo zza2 = zzgqt.zza(this.zza);
        zzgqo zza3 = zzgqt.zza(this.zzb);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzc.zzb();
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzhk)).booleanValue()) {
            obj = new zzfgs((zzfgp) zza2.zzb(), scheduledExecutorService);
        } else {
            obj = (zzfgp) zza3.zzb();
        }
        zzgrc.zzb(obj);
        return obj;
    }
}
