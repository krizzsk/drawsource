package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzbon implements zzbom {
    private final zzdzb zza;

    public zzbon(zzdzb zzdzb) {
        Preconditions.checkNotNull(zzdzb, "The Inspector Manager must not be null");
        this.zza = zzdzb;
    }

    public final void zza(Object obj, Map map) {
        if (map != null && map.containsKey("extras")) {
            long j = Long.MAX_VALUE;
            if (map.containsKey("expires")) {
                try {
                    j = Long.parseLong((String) map.get("expires"));
                } catch (NumberFormatException unused) {
                }
            }
            this.zza.zzh((String) map.get("extras"), j);
        }
    }
}
