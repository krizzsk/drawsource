package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.smaato.sdk.core.api.VideoType;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdwc {
    private final ConcurrentHashMap zza;
    private final zzcev zzb;
    private final zzfcd zzc;
    private final String zzd;

    public zzdwc(zzdwm zzdwm, zzcev zzcev, zzfcd zzfcd, String str) {
        this.zza = zzdwm.zzc();
        this.zzb = zzcev;
        this.zzc = zzfcd;
        this.zzd = str;
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzfX)).booleanValue()) {
            int zzd2 = zzf.zzd(this.zzc);
            int i = zzd2 - 1;
            if (i != 0) {
                if (i == 1) {
                    this.zza.put("se", "query_g");
                } else if (i == 2) {
                    this.zza.put("se", "r_adinfo");
                } else if (i != 3) {
                    this.zza.put("se", "r_both");
                } else {
                    this.zza.put("se", "r_adstring");
                }
                this.zza.put("scar", "true");
                if (zzd2 == 2) {
                    this.zza.put("rid", this.zzd);
                }
                zzd("ragent", this.zzc.zzd.zzp);
                zzd("rtype", zzf.zza(zzf.zzb(this.zzc.zzd)));
                return;
            }
            this.zza.put("scar", "false");
        }
    }

    private final void zzd(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.zza.put(str, str2);
        }
    }

    public final Map zza() {
        return this.zza;
    }

    public final void zzb(zzfbx zzfbx) {
        if (zzfbx.zzb.zza.size() > 0) {
            switch (((zzfbl) zzfbx.zzb.zza.get(0)).zzb) {
                case 1:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "banner");
                    break;
                case 2:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "interstitial");
                    break;
                case 3:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "native_express");
                    break;
                case 4:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "native_advanced");
                    break;
                case 5:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, VideoType.REWARDED);
                    break;
                case 6:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "app_open_ad");
                    this.zza.put("as", true != this.zzb.zzj() ? "0" : "1");
                    break;
                default:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "unknown");
                    break;
            }
        }
        zzd("gqi", zzfbx.zzb.zzb.zzb);
    }

    public final void zzc(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.zza.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.zza.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }
}
