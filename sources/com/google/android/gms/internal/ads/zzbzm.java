package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public abstract class zzbzm extends zzaqx implements zzbzn {
    public zzbzm() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbI(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbzr zzbzr = null;
        if (i == 1) {
            zzbzh zzbzh = (zzbzh) zzaqy.zza(parcel, zzbzh.CREATOR);
            zzaqy.zzc(parcel);
            parcel2.writeNoException();
            zzaqy.zzf(parcel2, (Parcelable) null);
        } else if (i == 2) {
            zzbzh zzbzh2 = (zzbzh) zzaqy.zza(parcel, zzbzh.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                if (queryLocalInterface instanceof zzbzo) {
                    zzbzo zzbzo = (zzbzo) queryLocalInterface;
                }
            }
            zzaqy.zzc(parcel);
            parcel2.writeNoException();
        } else if (i == 4) {
            zzbzv zzbzv = (zzbzv) zzaqy.zza(parcel, zzbzv.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzbzr = queryLocalInterface2 instanceof zzbzr ? (zzbzr) queryLocalInterface2 : new zzbzp(readStrongBinder2);
            }
            zzaqy.zzc(parcel);
            zzg(zzbzv, zzbzr);
            parcel2.writeNoException();
        } else if (i == 5) {
            zzbzv zzbzv2 = (zzbzv) zzaqy.zza(parcel, zzbzv.CREATOR);
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzbzr = queryLocalInterface3 instanceof zzbzr ? (zzbzr) queryLocalInterface3 : new zzbzp(readStrongBinder3);
            }
            zzaqy.zzc(parcel);
            zzf(zzbzv2, zzbzr);
            parcel2.writeNoException();
        } else if (i == 6) {
            zzbzv zzbzv3 = (zzbzv) zzaqy.zza(parcel, zzbzv.CREATOR);
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzbzr = queryLocalInterface4 instanceof zzbzr ? (zzbzr) queryLocalInterface4 : new zzbzp(readStrongBinder4);
            }
            zzaqy.zzc(parcel);
            zze(zzbzv3, zzbzr);
            parcel2.writeNoException();
        } else if (i != 7) {
            return false;
        } else {
            String readString = parcel.readString();
            IBinder readStrongBinder5 = parcel.readStrongBinder();
            if (readStrongBinder5 != null) {
                IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                zzbzr = queryLocalInterface5 instanceof zzbzr ? (zzbzr) queryLocalInterface5 : new zzbzp(readStrongBinder5);
            }
            zzaqy.zzc(parcel);
            zzh(readString, zzbzr);
            parcel2.writeNoException();
        }
        return true;
    }
}
