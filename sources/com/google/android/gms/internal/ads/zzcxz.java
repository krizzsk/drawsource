package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzcxz implements zzcya {
    private final Map zza;

    zzcxz(Map map) {
        this.zza = map;
    }

    public final zzefd zza(int i, String str) {
        return (zzefd) this.zza.get(str);
    }
}
