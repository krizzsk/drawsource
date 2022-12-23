package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public abstract class zzfin {
    public abstract void zzb(View view, zzfit zzfit, String str);

    public abstract void zzc();

    public abstract void zzd(View view);

    public abstract void zze();

    public static zzfin zza(zzfio zzfio, zzfip zzfip) {
        if (zzfil.zzb()) {
            return new zzfir(zzfio, zzfip);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }
}
