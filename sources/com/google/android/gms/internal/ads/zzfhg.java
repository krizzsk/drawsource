package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzl;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzfhg {
    public static zzfhh zza(Context context, int i) {
        boolean z;
        if (zzfhu.zza()) {
            int i2 = i - 2;
            if (i2 != 20 && i2 != 21) {
                switch (i2) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        z = ((Boolean) zzbji.zzc.zze()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        z = ((Boolean) zzbji.zzd.zze()).booleanValue();
                        break;
                    case 5:
                        z = ((Boolean) zzbji.zzb.zze()).booleanValue();
                        break;
                }
            } else {
                z = ((Boolean) zzbji.zze.zze()).booleanValue();
            }
            if (z) {
                return new zzfhj(context, i);
            }
        }
        return new zzfid();
    }

    public static zzfhh zzb(Context context, int i, int i2, zzl zzl) {
        zzfhh zza = zza(context, i);
        if (!(zza instanceof zzfhj)) {
            return zza;
        }
        zza.zzf();
        zza.zzk(i2);
        if (zzfhr.zze(zzl.zzp)) {
            zza.zzd(zzl.zzp);
        }
        return zza;
    }
}
