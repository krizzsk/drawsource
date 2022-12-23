package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzegn extends zzbvg {
    final /* synthetic */ zzego zza;
    private final zzefg zzb;

    /* synthetic */ zzegn(zzego zzego, zzefg zzefg, zzegm zzegm) {
        this.zza = zzego;
        this.zzb = zzefg;
    }

    public final void zze(String str) throws RemoteException {
        ((zzegz) this.zzb.zzc).zzi(0, str);
    }

    public final void zzf(zze zze) throws RemoteException {
        ((zzegz) this.zzb.zzc).zzh(zze);
    }

    public final void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        this.zza.zzc = (View) ObjectWrapper.unwrap(iObjectWrapper);
        ((zzegz) this.zzb.zzc).zzo();
    }

    public final void zzh(zzbuj zzbuj) throws RemoteException {
        this.zza.zzd = zzbuj;
        ((zzegz) this.zzb.zzc).zzo();
    }
}
