package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzbzl extends zzaqw implements zzbzn {
    zzbzl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    public final void zze(zzbzv zzbzv, zzbzr zzbzr) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zze(zza, zzbzv);
        zzaqy.zzg(zza, zzbzr);
        zzbl(6, zza);
    }

    public final void zzf(zzbzv zzbzv, zzbzr zzbzr) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zze(zza, zzbzv);
        zzaqy.zzg(zza, zzbzr);
        zzbl(5, zza);
    }

    public final void zzg(zzbzv zzbzv, zzbzr zzbzr) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zze(zza, zzbzv);
        zzaqy.zzg(zza, zzbzr);
        zzbl(4, zza);
    }

    public final void zzh(String str, zzbzr zzbzr) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzaqy.zzg(zza, zzbzr);
        zzbl(7, zza);
    }
}
