package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbua;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
final class zzak extends zzav {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzq zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzbua zzd;
    final /* synthetic */ zzau zze;

    zzak(zzau zzau, Context context, zzq zzq, String str, zzbua zzbua) {
        this.zze = zzau;
        this.zza = context;
        this.zzb = zzq;
        this.zzc = str;
        this.zzd = zzbua;
    }

    public final /* bridge */ /* synthetic */ Object zza() {
        zzau.zzs(this.zza, "interstitial");
        return new zzeq();
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzcc zzcc) throws RemoteException {
        return zzcc.zze(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, this.zzd, 221908000);
    }

    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        return this.zze.zza.zza(this.zza, this.zzb, this.zzc, this.zzd, 2);
    }
}
