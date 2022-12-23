package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzctj implements zzdco {
    private final zzfcy zza;

    public zzctj(zzfcy zzfcy) {
        this.zza = zzfcy;
    }

    public final void zzbq(Context context) {
        try {
            this.zza.zzg();
        } catch (zzfci e) {
            zze.zzk("Cannot invoke onDestroy for the mediation adapter.", e);
        }
    }

    public final void zzbs(Context context) {
        try {
            this.zza.zzs();
        } catch (zzfci e) {
            zze.zzk("Cannot invoke onPause for the mediation adapter.", e);
        }
    }

    public final void zzbt(Context context) {
        try {
            this.zza.zzt();
            if (context != null) {
                this.zza.zzr(context);
            }
        } catch (zzfci e) {
            zze.zzk("Cannot invoke onResume for the mediation adapter.", e);
        }
    }
}
