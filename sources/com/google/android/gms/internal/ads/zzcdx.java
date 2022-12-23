package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
public final class zzcdx extends zzaqw implements zzcdz {
    zzcdx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public final void zze(IObjectWrapper iObjectWrapper, zzced zzced, zzcdw zzcdw) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zze(zza, zzced);
        zzaqy.zzg(zza, zzcdw);
        zzbl(1, zza);
    }

    public final void zzf(zzbyt zzbyt) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zze(zza, zzbyt);
        zzbl(7, zza);
    }

    public final void zzg(List list, IObjectWrapper iObjectWrapper, zzbyk zzbyk) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zzg(zza, zzbyk);
        zzbl(10, zza);
    }

    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbyk zzbyk) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zzg(zza, zzbyk);
        zzbl(9, zza);
    }

    public final void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzbl(8, zza);
    }

    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, iObjectWrapper);
        zzbl(2, zza);
    }

    public final void zzk(List list, IObjectWrapper iObjectWrapper, zzbyk zzbyk) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zzg(zza, zzbyk);
        zzbl(6, zza);
    }

    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbyk zzbyk) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzaqy.zzg(zza, iObjectWrapper);
        zzaqy.zzg(zza, zzbyk);
        zzbl(5, zza);
    }
}
