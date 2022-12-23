package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcfi;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
final class zzel implements Runnable {
    final /* synthetic */ zzen zza;

    zzel(zzen zzen) {
        this.zza = zzen;
    }

    public final void run() {
        zzeo zzeo = this.zza.zza;
        if (zzeo.zza != null) {
            try {
                zzeo.zza.zze(1);
            } catch (RemoteException e) {
                zzcfi.zzk("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
