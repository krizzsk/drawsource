package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdwm extends zzdwo {
    private final zzfgx zzf;

    public zzdwm(Executor executor, zzcfn zzcfn, zzfgx zzfgx, zzfgz zzfgz) {
        super(executor, zzcfn, zzfgz);
        this.zzf = zzfgx;
        zzfgx.zza(this.zzb);
    }

    public final Map zza() {
        return new HashMap(this.zzb);
    }
}
