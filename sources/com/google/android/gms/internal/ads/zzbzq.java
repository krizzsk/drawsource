package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzaz;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public abstract class zzbzq extends zzaqx implements zzbzr {
    public zzbzq() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbI(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzaqy.zzc(parcel);
            zzf((ParcelFileDescriptor) zzaqy.zza(parcel, ParcelFileDescriptor.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            zzaqy.zzc(parcel);
            zze((zzaz) zzaqy.zza(parcel, zzaz.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
