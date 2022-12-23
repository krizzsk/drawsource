package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
public final class zzbmn extends zzaqw implements zzbmp {
    zzbmn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    public final void zze(zzbmy zzbmy) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, zzbmy);
        zzbl(1, zza);
    }
}
