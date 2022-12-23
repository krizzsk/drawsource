package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzmu {
    public static final zzmu zza = (zzeg.zza < 31 ? new zzmu() : new zzmu(zzmt.zza));
    private final zzmt zzb;

    public zzmu() {
        this.zzb = null;
        zzcw.zzf(zzeg.zza < 31);
    }

    private zzmu(zzmt zzmt) {
        this.zzb = zzmt;
    }

    public final LogSessionId zza() {
        zzmt zzmt = this.zzb;
        if (zzmt != null) {
            return zzmt.zzb;
        }
        throw null;
    }

    public zzmu(LogSessionId logSessionId) {
        this.zzb = new zzmt(logSessionId);
    }
}
