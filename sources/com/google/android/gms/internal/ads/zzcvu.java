package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzcvu implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;

    public zzcvu(zzgrh zzgrh, zzgrh zzgrh2) {
        this.zza = zzgrh;
        this.zzb = zzgrh2;
    }

    /* renamed from: zza */
    public final zzdei zzb() {
        return new zzdei((ScheduledExecutorService) this.zza.zzb(), (Clock) this.zzb.zzb());
    }
}
