package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
public final class zzcbf extends zzaqw implements zzcbh {
    zzcbf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    public final void zze() throws RemoteException {
        zzbl(7, zza());
    }

    public final void zzf() throws RemoteException {
        zzbl(6, zza());
    }

    public final void zzg() throws RemoteException {
        zzbl(2, zza());
    }

    public final void zzh(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzbl(4, zza);
    }

    public final void zzi(zze zze) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zze(zza, zze);
        zzbl(5, zza);
    }

    public final void zzj() throws RemoteException {
        zzbl(1, zza());
    }

    public final void zzk(zzcbb zzcbb) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, zzcbb);
        zzbl(3, zza);
    }
}
