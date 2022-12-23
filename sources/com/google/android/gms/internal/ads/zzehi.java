package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzehi implements zzdlg {
    private final zzfbl zza;
    private final zzbvt zzb;
    private final boolean zzc;
    private zzdcl zzd = null;

    zzehi(zzfbl zzfbl, zzbvt zzbvt, boolean z) {
        this.zza = zzfbl;
        this.zzb = zzbvt;
        this.zzc = z;
    }

    public final void zza(boolean z, Context context, zzdcg zzdcg) throws zzdlf {
        boolean z2;
        try {
            if (this.zzc) {
                z2 = this.zzb.zzr(ObjectWrapper.wrap(context));
            } else {
                z2 = this.zzb.zzq(ObjectWrapper.wrap(context));
            }
            if (!z2) {
                throw new zzdlf("Adapter failed to show.");
            } else if (this.zzd != null) {
                if (!((Boolean) zzay.zzc().zzb(zzbhz.zzbp)).booleanValue() && this.zza.zzZ == 2) {
                    this.zzd.zza();
                }
            }
        } catch (Throwable th) {
            throw new zzdlf(th);
        }
    }

    public final void zzb(zzdcl zzdcl) {
        this.zzd = zzdcl;
    }
}
