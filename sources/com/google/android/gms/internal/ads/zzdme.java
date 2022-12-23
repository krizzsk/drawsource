package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzdme implements zzbom {
    private final WeakReference zza;

    /* synthetic */ zzdme(zzdmh zzdmh, zzdmd zzdmd) {
        this.zza = new WeakReference(zzdmh);
    }

    public final void zza(Object obj, Map map) {
        zzdmh zzdmh = (zzdmh) this.zza.get();
        if (zzdmh != null) {
            zzdmh.zzh.onAdClicked();
            if (((Boolean) zzay.zzc().zzb(zzbhz.zzij)).booleanValue()) {
                zzdmh.zzi.zzq();
            }
        }
    }
}
