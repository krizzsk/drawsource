package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzbig {
    public static boolean zza(zzbio zzbio, zzbil zzbil, String... strArr) {
        if (zzbil == null) {
            return false;
        }
        zzbio.zze(zzbil, zzt.zzA().elapsedRealtime(), strArr);
        return true;
    }
}
