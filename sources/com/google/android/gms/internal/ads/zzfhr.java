package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfhr {
    public static void zza(zzfvl zzfvl, zzfhs zzfhs, zzfhh zzfhh) {
        zzg(zzfvl, zzfhs, zzfhh, false);
    }

    public static void zzb(zzfvl zzfvl, zzfhs zzfhs, zzfhh zzfhh) {
        zzg(zzfvl, zzfhs, zzfhh, true);
    }

    public static void zzc(zzfvl zzfvl, zzfhs zzfhs, zzfhh zzfhh) {
        if (((Boolean) zzbji.zzc.zze()).booleanValue()) {
            zzfvc.zzr(zzfut.zzv(zzfvl), new zzfhq(zzfhs, zzfhh), zzcfv.zzf);
        }
    }

    public static void zzd(zzfvl zzfvl, zzfhh zzfhh) {
        if (((Boolean) zzbji.zzc.zze()).booleanValue()) {
            zzfvc.zzr(zzfut.zzv(zzfvl), new zzfho(zzfhh), zzcfv.zzf);
        }
    }

    public static boolean zze(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) zzay.zzc().zzb(zzbhz.zzhr), str);
    }

    public static int zzf(zzfcd zzfcd) {
        int zzd = zzf.zzd(zzfcd) - 1;
        return (zzd == 0 || zzd == 1) ? 7 : 23;
    }

    private static void zzg(zzfvl zzfvl, zzfhs zzfhs, zzfhh zzfhh, boolean z) {
        if (((Boolean) zzbji.zzc.zze()).booleanValue()) {
            zzfvc.zzr(zzfut.zzv(zzfvl), new zzfhp(zzfhs, zzfhh, z), zzcfv.zzf);
        }
    }
}
