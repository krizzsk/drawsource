package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzerd implements zzetf {
    public final zzfbk zza;

    public zzerd(zzfbk zzfbk) {
        this.zza = zzfbk;
    }

    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzfbk zzfbk = this.zza;
        if (zzfbk != null) {
            bundle.putBoolean("render_in_browser", zzfbk.zzd());
            bundle.putBoolean("disable_ml", this.zza.zzc());
        }
    }
}
