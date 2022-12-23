package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
public final class zzbvl extends zzaqw implements zzbvn {
    zzbvl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    public final void zze(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString("Adapter returned null.");
        zzbl(2, zza);
    }

    public final void zzf(zze zze) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zze(zza, zze);
        zzbl(3, zza);
    }

    public final void zzg(zzbup zzbup) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, zzbup);
        zzbl(1, zza);
    }
}
