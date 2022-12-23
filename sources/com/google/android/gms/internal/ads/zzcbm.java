package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
public final class zzcbm extends zzaqw implements IInterface {
    zzcbm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
    }

    public final void zze(zzcbb zzcbb, String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, zzcbb);
        zza.writeString(str);
        zza.writeString(str2);
        zzbl(2, zza);
    }
}
