package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
public abstract class zzbvm extends zzaqx implements zzbvn {
    public zzbvm() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbI(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzbup zzb = zzbuo.zzb(parcel.readStrongBinder());
            zzaqy.zzc(parcel);
            zzg(zzb);
        } else if (i == 2) {
            String readString = parcel.readString();
            zzaqy.zzc(parcel);
            zze(readString);
        } else if (i != 3) {
            return false;
        } else {
            zzaqy.zzc(parcel);
            zzf((zze) zzaqy.zza(parcel, zze.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
