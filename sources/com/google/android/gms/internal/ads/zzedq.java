package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzg;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzedq implements zzddh, zzdbw {
    private static final Object zza = new Object();
    private static int zzb = 0;
    private final zzg zzc;
    private final zzeea zzd;

    public zzedq(zzeea zzeea, zzg zzg) {
        this.zzd = zzeea;
        this.zzc = zzg;
    }

    private final void zzb(boolean z) {
        int i;
        int intValue;
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzfg)).booleanValue() && !this.zzc.zzP()) {
            synchronized (zza) {
                i = zzb;
                intValue = ((Integer) zzay.zzc().zzb(zzbhz.zzfh)).intValue();
            }
            if (i < intValue) {
                this.zzd.zzd(z);
                synchronized (zza) {
                    zzb++;
                }
            }
        }
    }

    public final void zza(zze zze) {
        zzb(false);
    }

    public final void zzn() {
        zzb(true);
    }
}
