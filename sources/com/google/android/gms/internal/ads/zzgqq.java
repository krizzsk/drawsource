package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
abstract class zzgqq implements zzgqu {
    private final Map zza;

    zzgqq(Map map) {
        this.zza = Collections.unmodifiableMap(map);
    }

    /* access modifiers changed from: package-private */
    public final Map zza() {
        return this.zza;
    }
}
