package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzgf {
    private final Context zza;
    private final zzgd zzb;

    public zzgf(Context context, Handler handler, zzge zzge) {
        this.zza = context.getApplicationContext();
        this.zzb = new zzgd(this, handler, zzge);
    }
}
