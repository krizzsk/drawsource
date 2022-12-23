package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzbpz extends zzaqw implements IInterface {
    zzbpz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void zze(zzbpt zzbpt, zzbpy zzbpy) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zze(zza, zzbpt);
        zzaqy.zzg(zza, zzbpy);
        zzbm(2, zza);
    }
}
