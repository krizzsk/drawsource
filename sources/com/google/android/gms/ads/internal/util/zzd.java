package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcfh;
import com.google.android.gms.internal.ads.zzcfy;
import com.google.android.gms.internal.ads.zzfvl;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzd {
    public static void zza(Context context) {
        if (zzcfh.zzk(context) && !zzcfh.zzm()) {
            zzfvl zzb = new zzc(context).zzb();
            zze.zzi("Updating ad debug logging enablement.");
            zzcfy.zza(zzb, "AdDebugLogUpdater.updateEnablement");
        }
    }
}
