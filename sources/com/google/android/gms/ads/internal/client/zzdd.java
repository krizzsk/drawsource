package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaqx;
import com.google.android.gms.internal.ads.zzaqy;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
public abstract class zzdd extends zzaqx implements zzde {
    public zzdd() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static zzde zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return queryLocalInterface instanceof zzde ? (zzde) queryLocalInterface : new zzdc(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zzbI(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zzaqy.zzc(parcel);
        zze((zzs) zzaqy.zza(parcel, zzs.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
