package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzepq implements zzetg {
    private final AtomicReference zza = new AtomicReference();
    private final Clock zzb;
    private final zzetg zzc;
    private final long zzd;

    public zzepq(zzetg zzetg, long j, Clock clock) {
        this.zzb = clock;
        this.zzc = zzetg;
        this.zzd = j;
    }

    public final int zza() {
        return 16;
    }

    public final zzfvl zzb() {
        zzepp zzepp = (zzepp) this.zza.get();
        if (zzepp == null || zzepp.zza()) {
            zzepp = new zzepp(this.zzc.zzb(), this.zzd, this.zzb);
            this.zza.set(zzepp);
        }
        return zzepp.zza;
    }
}
