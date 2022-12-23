package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
public abstract class zzbvg extends zzaqx implements zzbvh {
    public zzbvg() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbI(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzaqy.zzc(parcel);
            zzg(asInterface);
        } else if (i == 2) {
            String readString = parcel.readString();
            zzaqy.zzc(parcel);
            zze(readString);
        } else if (i == 3) {
            zzaqy.zzc(parcel);
            zzf((zze) zzaqy.zza(parcel, zze.CREATOR));
        } else if (i != 4) {
            return false;
        } else {
            zzbuj zzb = zzbui.zzb(parcel.readStrongBinder());
            zzaqy.zzc(parcel);
            zzh(zzb);
        }
        parcel2.writeNoException();
        return true;
    }
}
