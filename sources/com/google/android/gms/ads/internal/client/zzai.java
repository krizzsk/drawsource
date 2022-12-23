package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbua;
import com.google.firebase.analytics.FirebaseAnalytics;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
final class zzai extends zzav {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzq zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzbua zzd;
    final /* synthetic */ zzau zze;

    zzai(zzau zzau, Context context, zzq zzq, String str, zzbua zzbua) {
        this.zze = zzau;
        this.zza = context;
        this.zzb = zzq;
        this.zzc = str;
        this.zzd = zzbua;
    }

    public final /* bridge */ /* synthetic */ Object zza() {
        zzau.zzs(this.zza, FirebaseAnalytics.Event.APP_OPEN);
        return new zzeq();
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzcc zzcc) throws RemoteException {
        return zzcc.zzc(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, this.zzd, 221908000);
    }

    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        return this.zze.zza.zza(this.zza, this.zzb, this.zzc, this.zzd, 4);
    }
}
