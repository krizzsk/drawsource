package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
public final class zzbmd extends zzaqw implements zzbmf {
    zzbmd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public final void zze(zzblv zzblv, String str) throws RemoteException {
        Parcel zza = zza();
        zzaqy.zzg(zza, zzblv);
        zza.writeString(str);
        zzbl(1, zza);
    }
}
