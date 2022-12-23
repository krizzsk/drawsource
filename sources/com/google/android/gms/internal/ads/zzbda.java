package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzbda extends zzaqw implements IInterface {
    zzbda(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final long zze(zzbcy zzbcy) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zze(zza, zzbcy);
        Parcel zzbk = zzbk(3, zza);
        long readLong = zzbk.readLong();
        zzbk.recycle();
        return readLong;
    }

    public final zzbcv zzf(zzbcy zzbcy) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zze(zza, zzbcy);
        Parcel zzbk = zzbk(1, zza);
        zzbcv zzbcv = (zzbcv) zzaqy.zza(zzbk, zzbcv.CREATOR);
        zzbk.recycle();
        return zzbcv;
    }

    public final zzbcv zzg(zzbcy zzbcy) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zze(zza, zzbcy);
        Parcel zzbk = zzbk(2, zza);
        zzbcv zzbcv = (zzbcv) zzaqy.zza(zzbk, zzbcv.CREATOR);
        zzbk.recycle();
        return zzbcv;
    }
}
