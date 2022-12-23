package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzeot implements zzetg {
    private final Executor zza;
    private final zzcer zzb;

    zzeot(Executor executor, zzcer zzcer) {
        this.zza = executor;
        this.zzb = zzcer;
    }

    public final int zza() {
        return 10;
    }

    public final zzfvl zzb() {
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzcj)).booleanValue()) {
            return zzfvc.zzi((Object) null);
        }
        return zzfvc.zzm(this.zzb.zzj(), zzeor.zza, this.zza);
    }
}
