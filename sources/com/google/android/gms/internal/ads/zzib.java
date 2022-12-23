package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzib {
    public static zzmu zza(Context context, zzim zzim, boolean z) {
        zzmq zzb = zzmq.zzb(context);
        if (zzb == null) {
            Log.w("ExoPlayerImpl", "MediaMetricsService unavailable.");
            return new zzmu(LogSessionId.LOG_SESSION_ID_NONE);
        }
        if (z) {
            zzim.zzR(zzb);
        }
        return new zzmu(zzb.zza());
    }
}
