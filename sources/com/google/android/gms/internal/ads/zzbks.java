package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
public abstract class zzbks extends zzaqx implements zzbkt {
    public zzbks() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    public static zzbkt zzj(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        return queryLocalInterface instanceof zzbkt ? (zzbkt) queryLocalInterface : new zzbkr(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zzbI(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            String zzg = zzg();
            parcel2.writeNoException();
            parcel2.writeString(zzg);
            return true;
        } else if (i != 3) {
            return false;
        } else {
            List zzh = zzh();
            parcel2.writeNoException();
            parcel2.writeList(zzh);
            return true;
        }
    }
}
