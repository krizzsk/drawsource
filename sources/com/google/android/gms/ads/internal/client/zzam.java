package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbua;
import com.google.android.gms.internal.ads.zzbyy;
import com.google.android.gms.internal.ads.zzcfl;
import com.google.android.gms.internal.ads.zzcfm;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
final class zzam extends zzav {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzbua zzc;
    final /* synthetic */ zzau zzd;

    zzam(zzau zzau, Context context, String str, zzbua zzbua) {
        this.zzd = zzau;
        this.zza = context;
        this.zzb = str;
        this.zzc = zzbua;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object zza() {
        zzau.zzs(this.zza, "native_ad");
        return new zzeo();
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzcc zzcc) throws RemoteException {
        return zzcc.zzb(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 221908000);
    }

    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbhz.zzc(this.zza);
        if (!((Boolean) zzay.zzc().zzb(zzbhz.zzif)).booleanValue()) {
            return this.zzd.zzb.zza(this.zza, this.zzb, this.zzc);
        }
        try {
            IBinder zze = ((zzbp) zzcfm.zzb(this.zza, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", zzal.zza)).zze(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 221908000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof zzbo ? (zzbo) queryLocalInterface : new zzbm(zze);
        } catch (RemoteException | zzcfl | NullPointerException e) {
            this.zzd.zzh = zzbyy.zza(this.zza);
            this.zzd.zzh.zzd(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        }
    }
}
