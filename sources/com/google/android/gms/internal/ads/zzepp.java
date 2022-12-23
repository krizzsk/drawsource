package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzepp {
    public final zzfvl zza;
    private final long zzb;
    private final Clock zzc;

    public zzepp(zzfvl zzfvl, long j, Clock clock) {
        this.zza = zzfvl;
        this.zzc = clock;
        this.zzb = clock.elapsedRealtime() + j;
    }

    public final boolean zza() {
        return this.zzb < this.zzc.elapsedRealtime();
    }
}
