package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdgo implements zzdeo {
    private int zza = ((Integer) zzay.zzc().zzb(zzbhz.zzba)).intValue();

    public final synchronized void zzb(zzfbx zzfbx) {
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzbb)).booleanValue()) {
            try {
                this.zza = zzfbx.zzb.zzb.zzc;
            } catch (NullPointerException unused) {
            }
        }
    }

    public final void zzbE(zzbzv zzbzv) {
    }

    public final synchronized int zzc() {
        return this.zza;
    }
}
