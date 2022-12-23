package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
public final class zzbma extends zzaqw implements zzbmc {
    zzbma(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    public final void zze(zzbls zzbls) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, zzbls);
        zzbl(1, zza);
    }
}
