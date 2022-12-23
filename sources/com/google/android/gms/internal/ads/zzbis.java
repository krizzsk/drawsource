package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
public final class zzbis extends zzaqw implements zzbiu {
    zzbis(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    public final void zze(zzbir zzbir) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, zzbir);
        zzbl(1, zza);
    }
}
