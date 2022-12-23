package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Predicate;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzbrj implements Predicate {
    public final /* synthetic */ zzbom zza;

    public /* synthetic */ zzbrj(zzbom zzbom) {
        this.zza = zzbom;
    }

    public final boolean apply(Object obj) {
        zzbom zzbom = (zzbom) obj;
        return (zzbom instanceof zzbro) && zzbro.zzb((zzbro) zzbom).equals(this.zza);
    }
}
