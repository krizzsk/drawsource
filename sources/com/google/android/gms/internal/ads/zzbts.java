package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
public final /* synthetic */ class zzbts implements Runnable {
    public final /* synthetic */ zzbtt zza;
    public final /* synthetic */ Context zzb;
    public final /* synthetic */ String zzc;

    public /* synthetic */ zzbts(zzbtt zzbtt, Context context, String str) {
        this.zza = zzbtt;
        this.zzb = context;
        this.zzc = str;
    }

    public final void run() {
        Context context = this.zzb;
        String str = this.zzc;
        zzbhz.zzc(context);
        Bundle bundle = new Bundle();
        bundle.putBoolean("measurementEnabled", ((Boolean) zzay.zzc().zzb(zzbhz.zzaf)).booleanValue());
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzam)).booleanValue()) {
            bundle.putString("ad_storage", "denied");
            bundle.putString("analytics_storage", "denied");
        }
        try {
            ((zzcnc) zzcfm.zzb(context, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", zzbtr.zza)).zze(ObjectWrapper.wrap(context), new zzbtq(AppMeasurementSdk.getInstance(context, "FA-Ads", "am", str, bundle)));
        } catch (RemoteException | zzcfl | NullPointerException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
        }
    }
}
