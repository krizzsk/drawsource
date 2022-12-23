package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzdmg implements zzbom {
    private final WeakReference zza;

    /* synthetic */ zzdmg(zzdmh zzdmh, zzdmf zzdmf) {
        this.zza = new WeakReference(zzdmh);
    }

    public final void zza(Object obj, Map map) {
        zzdmh zzdmh = (zzdmh) this.zza.get();
        if (zzdmh != null) {
            zzdmh.zzg.zza();
        }
    }
}
