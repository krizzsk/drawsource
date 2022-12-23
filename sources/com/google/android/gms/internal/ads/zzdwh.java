package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdwh {
    /* access modifiers changed from: private */
    public final zzdwm zza;
    /* access modifiers changed from: private */
    public final Executor zzb;
    /* access modifiers changed from: private */
    public final Map zzc;

    public zzdwh(zzdwm zzdwm, Executor executor) {
        this.zza = zzdwm;
        this.zzc = zzdwm.zza();
        this.zzb = executor;
    }

    public final zzdwg zza() {
        zzdwg zzdwg = new zzdwg(this);
        zzdwg unused = zzdwg.zzb.putAll(zzdwg.zza.zzc);
        return zzdwg;
    }
}
