package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfim {
    private boolean zza;

    /* access modifiers changed from: package-private */
    public final void zza(Context context) {
        zzfjv.zzb(context, "Application Context cannot be null");
        if (!this.zza) {
            this.zza = true;
            zzfjj.zzb().zzc(context);
            zzfje.zza().zzc(context);
            zzfjt.zzf(context);
            zzfjg.zzb().zzc(context);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean zzb() {
        return this.zza;
    }
}
