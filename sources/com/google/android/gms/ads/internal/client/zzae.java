package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbua;
import com.google.android.gms.internal.ads.zzbxo;
import com.google.android.gms.internal.ads.zzcfl;
import com.google.android.gms.internal.ads.zzcfm;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
final class zzae extends zzav {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbua zzb;

    zzae(zzau zzau, Context context, zzbua zzbua) {
        this.zza = context;
        this.zzb = zzbua;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object zza() {
        return null;
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzcc zzcc) throws RemoteException {
        return zzcc.zzk(ObjectWrapper.wrap(this.zza), this.zzb, 221908000);
    }

    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        try {
            return ((zzbxo) zzcfm.zzb(this.zza, "com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl", zzad.zza)).zze(ObjectWrapper.wrap(this.zza), this.zzb, 221908000);
        } catch (RemoteException | zzcfl | NullPointerException unused) {
            return null;
        }
    }
}
