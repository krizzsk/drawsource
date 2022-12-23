package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.google.android.gms.ads.internal.client.zzay;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzerz implements zzetf {
    private final String zza;
    private final String zzb;

    public zzerz(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzfT)).booleanValue()) {
            bundle.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.zzb);
        } else {
            bundle.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.zza);
        }
    }
}
