package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbua;
import com.google.android.gms.internal.ads.zzcbq;
import com.smaato.sdk.core.api.VideoType;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
final class zzat extends zzav {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzbua zzc;
    final /* synthetic */ zzau zzd;

    zzat(zzau zzau, Context context, String str, zzbua zzbua) {
        this.zzd = zzau;
        this.zza = context;
        this.zzb = str;
        this.zzc = zzbua;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object zza() {
        zzau.zzs(this.zza, VideoType.REWARDED);
        return new zzew();
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzcc zzcc) throws RemoteException {
        return zzcc.zzn(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 221908000);
    }

    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        return zzcbq.zza(this.zza, this.zzb, this.zzc);
    }
}
