package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfde implements zzgqu {
    private final zzfdd zza;

    public zzfde(zzfdd zzfdd) {
        this.zza = zzfdd;
    }

    public final /* synthetic */ Object zzb() {
        Clock instance = DefaultClock.getInstance();
        zzgrc.zzb(instance);
        return instance;
    }
}
