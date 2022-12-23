package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzcxa implements zzgqu {
    private final zzgrh zza;

    public zzcxa(zzgrh zzgrh) {
        this.zza = zzgrh;
    }

    /* renamed from: zza */
    public final Boolean zzb() {
        boolean z = true;
        if (((zzdbk) this.zza).zza().zza() == null) {
            if (!((Boolean) zzay.zzc().zzb(zzbhz.zzez)).booleanValue()) {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
