package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzw;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzeop implements zzetf {
    private final zzw zza;
    private final zzcfo zzb;
    private final boolean zzc;

    public zzeop(zzw zzw, zzcfo zzcfo, boolean z) {
        this.zza = zzw;
        this.zzb = zzcfo;
        this.zzc = z;
    }

    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.zzb.zzc >= ((Integer) zzay.zzc().zzb(zzbhz.zzek)).intValue()) {
            bundle.putString("app_open_version", "2");
        }
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzel)).booleanValue()) {
            bundle.putBoolean("app_switched", this.zzc);
        }
        zzw zzw = this.zza;
        if (zzw != null) {
            int i = zzw.zza;
            if (i == 1) {
                bundle.putString("avo", "p");
            } else if (i == 2) {
                bundle.putString("avo", "l");
            }
        }
    }
}
