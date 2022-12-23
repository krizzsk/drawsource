package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzenn implements zzetg {
    private final Clock zza;
    private final zzfcd zzb;

    zzenn(Clock clock, zzfcd zzfcd) {
        this.zza = clock;
        this.zzb = zzfcd;
    }

    public final int zza() {
        return 4;
    }

    public final zzfvl zzb() {
        return zzfvc.zzi(new zzeno(this.zzb, this.zza.currentTimeMillis()));
    }
}
