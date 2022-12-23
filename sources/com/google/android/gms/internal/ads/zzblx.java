package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
public final class zzblx extends zzaqw implements zzblz {
    zzblx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    public final void zze(zzblq zzblq) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, zzblq);
        zzbl(1, zza);
    }
}
