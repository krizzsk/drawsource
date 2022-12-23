package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzejq implements zzdlg {
    public final /* synthetic */ zzefg zza;

    public /* synthetic */ zzejq(zzefg zzefg) {
        this.zza = zzefg;
    }

    public final void zza(boolean z, Context context, zzdcg zzdcg) {
        zzefg zzefg = this.zza;
        try {
            ((zzfcy) zzefg.zzb).zzu(z);
            ((zzfcy) zzefg.zzb).zzy();
        } catch (zzfci e) {
            zze.zzk("Cannot show rewarded video.", e);
            throw new zzdlf(e.getCause());
        }
    }
}
