package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzezc {
    static zzeza zza(Context context, zzfdk zzfdk, zzfec zzfec) {
        return zzc(context, zzfdk, zzfec);
    }

    static zzeza zzb(Context context, zzfdk zzfdk, zzfec zzfec) {
        return zzc(context, zzfdk, zzfec);
    }

    private static zzeza zzc(Context context, zzfdk zzfdk, zzfec zzfec) {
        zzcel zzcel;
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzfo)).booleanValue()) {
            zzcel = zzt.zzo().zzh().zzh();
        } else {
            zzcel = zzt.zzo().zzh().zzi();
        }
        boolean z = false;
        if (zzcel != null && zzcel.zzh()) {
            z = true;
        }
        if (((Integer) zzay.zzc().zzb(zzbhz.zzfE)).intValue() > 0) {
            if (!((Boolean) zzay.zzc().zzb(zzbhz.zzfn)).booleanValue() || z) {
                zzfeb zza = zzfec.zza(zzfds.AppOpen, context, zzfdk, new zzeye(new zzeyb()));
                return new zzeyg(new zzeyq(new zzeyp()), new zzeym(zza.zza, zzcfv.zza), zza.zzb, zza.zza.zza().zzf, zzcfv.zza);
            }
        }
        return new zzeyp();
    }
}
