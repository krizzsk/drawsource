package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzw;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzeyf implements zzfej {
    public final zzeyz zza;
    public final zzezb zzb;
    public final zzl zzc;
    public final String zzd;
    public final Executor zze;
    public final zzw zzf;
    public final zzfdy zzg;

    public zzeyf(zzeyz zzeyz, zzezb zzezb, zzl zzl, String str, Executor executor, zzw zzw, zzfdy zzfdy) {
        this.zza = zzeyz;
        this.zzb = zzezb;
        this.zzc = zzl;
        this.zzd = str;
        this.zze = executor;
        this.zzf = zzw;
        this.zzg = zzfdy;
    }

    public final zzfdy zza() {
        return this.zzg;
    }

    public final Executor zzb() {
        return this.zze;
    }
}
