package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.firebase.analytics.FirebaseAnalytics;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzcuw {
    private final zzfgp zza;
    private final zzdwh zzb;
    private final zzfbx zzc;

    public zzcuw(zzdwh zzdwh, zzfbx zzfbx, zzfgp zzfgp) {
        this.zza = zzfgp;
        this.zzb = zzdwh;
        this.zzc = zzfbx;
    }

    private static String zzb(int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h";
    }

    public final void zza(long j, int i) {
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzhj)).booleanValue()) {
            zzfgp zzfgp = this.zza;
            zzfgo zzb2 = zzfgo.zzb("ad_closed");
            zzb2.zzg(this.zzc.zzb.zzb);
            zzb2.zza("show_time", String.valueOf(j));
            zzb2.zza(FirebaseAnalytics.Param.AD_FORMAT, "app_open_ad");
            zzb2.zza("acr", zzb(i));
            zzfgp.zzb(zzb2);
            return;
        }
        zzdwg zza2 = this.zzb.zza();
        zza2.zze(this.zzc.zzb.zzb);
        zza2.zzb("action", "ad_closed");
        zza2.zzb("show_time", String.valueOf(j));
        zza2.zzb(FirebaseAnalytics.Param.AD_FORMAT, "app_open_ad");
        zza2.zzb("acr", zzb(i));
        zza2.zzg();
    }
}
