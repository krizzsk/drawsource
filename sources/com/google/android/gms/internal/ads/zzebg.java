package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzebg implements zzdeo {
    private final Context zza;
    private final zzcdn zzb;

    zzebg(Context context, zzcdn zzcdn) {
        this.zza = context;
        this.zzb = zzcdn;
    }

    public final void zzb(zzfbx zzfbx) {
        if (!TextUtils.isEmpty(zzfbx.zzb.zzb.zzd)) {
            this.zzb.zzp(this.zza, zzfbx.zza.zza.zzd);
            this.zzb.zzl(this.zza, zzfbx.zzb.zzb.zzd);
        }
    }

    public final void zzbE(zzbzv zzbzv) {
    }
}
