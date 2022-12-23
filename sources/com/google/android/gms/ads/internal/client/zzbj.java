package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaqw;
import com.google.android.gms.internal.ads.zzaqy;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
public final class zzbj extends zzaqw implements zzbl {
    zzbj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    public final String zze() throws RemoteException {
        throw null;
    }

    public final String zzf() throws RemoteException {
        throw null;
    }

    public final void zzg(zzl zzl) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zze(zza, zzl);
        zzbl(1, zza);
    }

    public final void zzh(zzl zzl, int i) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zze(zza, zzl);
        zza.writeInt(i);
        zzbl(5, zza);
    }

    public final boolean zzi() throws RemoteException {
        Parcel zzbk = zzbk(3, zza());
        boolean zzh = zzaqy.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }
}
