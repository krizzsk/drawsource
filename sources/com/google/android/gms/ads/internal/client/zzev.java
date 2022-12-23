package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcbl;
import com.google.android.gms.internal.ads.zzcfi;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
public final /* synthetic */ class zzev implements Runnable {
    public final /* synthetic */ zzcbl zza;

    public /* synthetic */ zzev(zzcbl zzcbl) {
        this.zza = zzcbl;
    }

    public final void run() {
        zzcbl zzcbl = this.zza;
        if (zzcbl != null) {
            try {
                zzcbl.zze(1);
            } catch (RemoteException e) {
                zzcfi.zzl("#007 Could not call remote method.", e);
            }
        }
    }
}
