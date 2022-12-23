package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfmg extends zzaqw implements IInterface {
    zzfmg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzfme zze(zzfmc zzfmc) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zze(zza, zzfmc);
        Parcel zzbk = zzbk(1, zza);
        zzfme zzfme = (zzfme) zzaqy.zza(zzbk, zzfme.CREATOR);
        zzbk.recycle();
        return zzfme;
    }

    public final zzfmn zzf(zzfml zzfml) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zze(zza, zzfml);
        Parcel zzbk = zzbk(3, zza);
        zzfmn zzfmn = (zzfmn) zzaqy.zza(zzbk, zzfmn.CREATOR);
        zzbk.recycle();
        return zzfmn;
    }

    public final void zzg(zzflz zzflz) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zze(zza, zzflz);
        zzbl(2, zza);
    }
}
