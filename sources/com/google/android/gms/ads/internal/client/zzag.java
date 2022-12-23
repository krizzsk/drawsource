package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.p195h5.OnH5AdsEventListener;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbpe;
import com.google.android.gms.internal.ads.zzbpn;
import com.google.android.gms.internal.ads.zzbpr;
import com.google.android.gms.internal.ads.zzbua;
import com.google.android.gms.internal.ads.zzcfl;
import com.google.android.gms.internal.ads.zzcfm;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
final class zzag extends zzav {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbua zzb;
    final /* synthetic */ OnH5AdsEventListener zzc;

    zzag(zzau zzau, Context context, zzbua zzbua, OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = context;
        this.zzb = zzbua;
        this.zzc = onH5AdsEventListener;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object zza() {
        return new zzbpr();
    }

    public final /* bridge */ /* synthetic */ Object zzb(zzcc zzcc) throws RemoteException {
        return zzcc.zzj(ObjectWrapper.wrap(this.zza), this.zzb, 221908000, new zzbpe(this.zzc));
    }

    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        try {
            return ((zzbpn) zzcfm.zzb(this.zza, "com.google.android.gms.ads.DynamiteH5AdsManagerCreatorImpl", zzaf.zza)).zze(ObjectWrapper.wrap(this.zza), this.zzb, 221908000, new zzbpe(this.zzc));
        } catch (RemoteException | zzcfl | NullPointerException unused) {
            return null;
        }
    }
}
