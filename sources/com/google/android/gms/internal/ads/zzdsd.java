package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzdsd implements zzbom {
    final /* synthetic */ zzdse zza;
    private final WeakReference zzb;
    private final String zzc;
    private final zzbom zzd;

    /* synthetic */ zzdsd(zzdse zzdse, WeakReference weakReference, String str, zzbom zzbom, zzdsc zzdsc) {
        this.zza = zzdse;
        this.zzb = weakReference;
        this.zzc = str;
        this.zzd = zzbom;
    }

    public final void zza(Object obj, Map map) {
        Object obj2 = this.zzb.get();
        if (obj2 == null) {
            this.zza.zzk(this.zzc, this);
        } else {
            this.zzd.zza(obj2, map);
        }
    }
}
