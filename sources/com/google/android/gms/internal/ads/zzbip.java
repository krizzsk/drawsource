package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzbip extends zzbiq {
    private final zzf zza;
    private final String zzb;
    private final String zzc;

    public zzbip(zzf zzf, String str, String str2) {
        this.zza = zzf;
        this.zzb = str;
        this.zzc = str2;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final void zzd(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper != null) {
            this.zza.zza((View) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    public final void zze() {
        this.zza.zzb();
    }

    public final void zzf() {
        this.zza.zzc();
    }
}
