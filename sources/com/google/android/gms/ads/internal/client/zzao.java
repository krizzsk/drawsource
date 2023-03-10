package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbyy;
import com.google.android.gms.internal.ads.zzcfl;
import com.google.android.gms.internal.ads.zzcfm;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
final class zzao extends zzav {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzau zzb;

    zzao(zzau zzau, Context context) {
        this.zzb = zzau;
        this.zza = context;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object zza() {
        zzau.zzs(this.zza, "mobile_ads_settings");
        return new zzes();
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzcc zzcc) throws RemoteException {
        return zzcc.zzg(ObjectWrapper.wrap(this.zza), 221908000);
    }

    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbhz.zzc(this.zza);
        if (!((Boolean) zzay.zzc().zzb(zzbhz.zzif)).booleanValue()) {
            return this.zzb.zzc.zza(this.zza);
        }
        try {
            IBinder zze = ((zzcn) zzcfm.zzb(this.zza, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", zzan.zza)).zze(ObjectWrapper.wrap(this.zza), 221908000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return queryLocalInterface instanceof zzcm ? (zzcm) queryLocalInterface : new zzck(zze);
        } catch (RemoteException | zzcfl | NullPointerException e) {
            this.zzb.zzh = zzbyy.zza(this.zza);
            this.zzb.zzh.zzd(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        }
    }
}
