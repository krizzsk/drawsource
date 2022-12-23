package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
public final class zzbkj extends zzaqw implements IInterface {
    zzbkj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }

    public final void zze(zzbzf zzbzf) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, zzbzf);
        zzbl(1, zza);
    }
}
