package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzqg {
    public static void zza(zzqb zzqb, zzmu zzmu) {
        LogSessionId zza = zzmu.zza();
        if (!zza.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            zzqb.zzb.setString("log-session-id", zza.getStringId());
        }
    }
}
