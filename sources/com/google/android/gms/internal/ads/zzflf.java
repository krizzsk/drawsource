package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzflf {
    private final Context zza;
    private final Looper zzb;

    public zzflf(Context context, Looper looper) {
        this.zza = context;
        this.zzb = looper;
    }

    public final void zza(String str) {
        zzflt zza2 = zzflv.zza();
        zza2.zza(this.zza.getPackageName());
        zza2.zzc(2);
        zzflq zza3 = zzflr.zza();
        zza3.zza(str);
        zza3.zzb(2);
        zza2.zzb(zza3);
        new zzflg(this.zza, this.zzb, (zzflv) zza2.zzal()).zza();
    }
}
