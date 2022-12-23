package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzeix implements zzdlg {
    public final /* synthetic */ zzefg zza;

    public /* synthetic */ zzeix(zzefg zzefg) {
        this.zza = zzefg;
    }

    public final void zza(boolean z, Context context, zzdcg zzdcg) {
        zzefg zzefg = this.zza;
        try {
            ((zzfcy) zzefg.zzb).zzu(z);
            ((zzfcy) zzefg.zzb).zzx(context);
        } catch (zzfci e) {
            throw new zzdlf(e.getCause());
        }
    }
}
