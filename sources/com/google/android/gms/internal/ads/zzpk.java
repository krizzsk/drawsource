package com.google.android.gms.internal.ads;

import com.vungle.warren.utility.platform.Platform;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzpk {
    public static final boolean zza;

    static {
        boolean z = true;
        if (!Platform.MANUFACTURER_AMAZON.equals(zzeg.zzc) || (!"AFTM".equals(zzeg.zzd) && !"AFTB".equals(zzeg.zzd))) {
            z = false;
        }
        zza = z;
    }
}
