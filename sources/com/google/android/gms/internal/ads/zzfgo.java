package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.google.android.gms.ads.internal.zzt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.smaato.sdk.core.api.VideoType;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfgo {
    private final HashMap zza = new HashMap();
    private final zzfgu zzb = new zzfgu(zzt.zzA());

    private zzfgo() {
        this.zza.put("new_csi", "1");
    }

    public static zzfgo zzb(String str) {
        zzfgo zzfgo = new zzfgo();
        zzfgo.zza.put("action", str);
        return zzfgo;
    }

    public static zzfgo zzc(String str) {
        zzfgo zzfgo = new zzfgo();
        zzfgo.zza.put(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, str);
        return zzfgo;
    }

    public final zzfgo zza(String str, String str2) {
        this.zza.put(str, str2);
        return this;
    }

    public final zzfgo zzd(String str) {
        this.zzb.zzb(str);
        return this;
    }

    public final zzfgo zze(String str, String str2) {
        this.zzb.zzc(str, str2);
        return this;
    }

    public final zzfgo zzf(zzfbl zzfbl) {
        this.zza.put("aai", zzfbl.zzx);
        return this;
    }

    public final zzfgo zzg(zzfbo zzfbo) {
        if (!TextUtils.isEmpty(zzfbo.zzb)) {
            this.zza.put("gqi", zzfbo.zzb);
        }
        return this;
    }

    public final zzfgo zzh(zzfbx zzfbx, zzcev zzcev) {
        zzfbw zzfbw = zzfbx.zzb;
        zzg(zzfbw.zzb);
        if (!zzfbw.zza.isEmpty()) {
            switch (((zzfbl) zzfbw.zza.get(0)).zzb) {
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
                    if (zzcev != null) {
                        this.zza.put("as", true != zzcev.zzj() ? "0" : "1");
                        break;
                    }
                    break;
                default:
                    this.zza.put(FirebaseAnalytics.Param.AD_FORMAT, "unknown");
                    break;
            }
        }
        return this;
    }

    public final zzfgo zzi(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.zza.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.zza.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
        return this;
    }

    public final Map zzj() {
        HashMap hashMap = new HashMap(this.zza);
        for (zzfgt zzfgt : this.zzb.zza()) {
            hashMap.put(zzfgt.zza, zzfgt.zzb);
        }
        return hashMap;
    }
}
